import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Playing AUDIO with Java (.wav, .au, .aiff)

        String filePath = "Jingle Bells - The Soundlings.wav";
        File file = new File(filePath);

        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio file isn't supported! Please choose 'wav', '.au' or '.aiff'");
        }
        catch(IOException e){
            System.out.println("Something went wrong!");
        }
    }
}