import java.util.Scanner;

public class AreWeThereYet {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        //int x = 0;
        while (true){
            System.out.println("Are we there yet?");
            String answer = scanner.nextLine();
            if (answer.equals("yes")){
                System.out.println("Finally, I am so hungry!");
                break;
            }else if (answer.equals("no")){
                System.out.println("Hurry up!");
                //x++;
            }else {
                System.out.println("Let's cook at home:(");
                break;
            }

            }
            //String answer = scanner.nextLine();
            //if(answer.equals("no")){
            //    System.out.println("Answer is : " + answer);
            //}else{
            //    System.out.println("Are we there yet?");
           // }

        }

    }

