import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Playing AUDIO with Java (.wav, .au, .aiff)

        String filePath = "src\\Jingle Bells - The Soundlings.wav";
        File file = new File(filePath);

        try(Scanner scanner = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){



            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";

            while(!response.equals("Q")){
                System.out.println("P = Play");
            }

        }
        catch(FileNotFoundException e){
            System.out.println("Audio file not found!");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio file isn't supported! Please choose 'wav', '.au' or '.aiff'");
        }
        catch (LineUnavailableException e){
            System.out.println("Audio resource is unable to be accessed!");
        }
        catch(IOException e){
            System.out.println("Something went wrong!");
        }
        finally{
            System.out.println("Bye!");
            scanner.close();
        }
    }
}