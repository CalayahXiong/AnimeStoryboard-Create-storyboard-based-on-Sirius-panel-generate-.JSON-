package storyboard.design2;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.ArrayList;

import org.anime.storyboard.Dialogue;
import org.anime.storyboard.DialogueScene;
import org.anime.storyboard.Scene;
import org.eclipse.emf.ecore.EObject;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
    /**
     * Get the names of all characters in a given scene, separated by commas.
     * If the scene is not a DialogueScene or has no characters, return "--".
     * @param scene The scene object.
     * @return A comma-separated string of character names, or "--" if no characters exist.
     */
    public String getCharacters(Scene scene) {
        if (!(scene instanceof DialogueScene)) {
            return "--";
        }
        
        DialogueScene dialogueScene = (DialogueScene) scene;
        if (dialogueScene.getCharacters() == null || dialogueScene.getCharacters().isEmpty()) {
            return "--";
        }

        return dialogueScene.getCharacters().stream()
                .map(c -> c.getName())
                .collect(Collectors.joining(", "));
    }
    
    /**
     * 根据角色名称修改 Dialogue 的 speaker
     * @param dialogue 需要修改的 Dialogue 对象
     * @param speakerName 用户输入的角色名称
     * @return 修改结果状态（成功/失败原因）
     */
    public String updateDialogueSpeaker(Dialogue dialogue, String speakerName) {
        if (dialogue == null) {
            return "Error: Dialogue cannot be null";
        }
        if (speakerName == null || speakerName.trim().isEmpty()) {
            return "Error: Character name cannot be null";
        }
        speakerName = speakerName.trim();  

        // （DialogueScene）
        if (!(dialogue.eContainer() instanceof DialogueScene)) {
            return "Error: Dialogue must belong to a DialogueScene";
        }
        DialogueScene scene = (DialogueScene) dialogue.eContainer();

        // find compatible Character
        List<org.anime.storyboard.Character> characters = scene.getCharacters();
        if (characters == null || characters.isEmpty()) {
            return "Error: No characters are available in the scene";
        }
        final String processedName = speakerName.trim();
        Optional<org.anime.storyboard.Character> matchedCharacterOpt = characters.stream()
            .filter(c -> c.getName() != null)
            .filter(c -> c.getName().trim().equalsIgnoreCase(processedName))
            .findFirst();

        if (!matchedCharacterOpt.isPresent()) {
            return "Error: No character found with name '" + speakerName + "'";
        }

        org.anime.storyboard.Character matchedCharacter = matchedCharacterOpt.get(); 

        dialogue.setSpeaker(matchedCharacter); 
        return "Success: Speaker updated to '" + matchedCharacter.getName() + "'";
    }

}
