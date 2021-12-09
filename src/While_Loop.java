
import java.util.Scanner;
public class While_Loop {
    public static void main(String[] args){

        //Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;

        // While loop
        while (isOnRepeat){
            System.out.println("Playing current song");

            // get access of user input
            System.out.println("Would you like to take this song off of repeat? If so answer Yes");
            Scanner input = new Scanner(System.in);
            String userInput = input.next();

            // check if it is Yes: means song not repeat
            if(userInput.equals("yes")){
                isOnRepeat = false;
            }
        }

        System.out.println("Playing next song");

    }
}
