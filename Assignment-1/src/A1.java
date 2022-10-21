import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class A1{
    public static void main(String[] args) {
        int value = 0;
        Random rd = new Random();
        Scanner scanner = new Scanner(System.in);

        //Create an ArrayList
        ArrayList<Integer>list = new ArrayList<Integer>();

        //Fill each of the 10 slots with a random value from 1- 50
        for (int i = 0; i < 10; i++) {
            //1 + rd.nextInt(50) This is going to generate int from 1 -50
            list.add(1 + rd.nextInt(50));
        }
            //Display those value on the screen, and then promp the user for an integer
            System.out.println("ArrayList: " + list);
            System.out.println("Value to find: ");
            //Option 1
            // try {
            //     value = scanner.nextInt();
            // } catch (InputMismatchException e){
            //     System.out.println("You must enter an integer.");
            // } finally {
            //     scanner.close();
            // }

            //Option 2
            // while(!scanner.hasNextInt()){
            //     System.out.println("You must enter an integer.");
            //     scanner.next();
            // }
            // value = scanner.nextInt();
            // scanner.close();

            //Option 3
            while(true){
                System.out.println("Enter an integer between 1 -50: ");
                value = scanner.nextInt();

                if(list.contains(value)){
                    System.out.println(value + " is in the ArrayList");
                    scanner.close();
                    break;
                }else{
                    System.out.println(value + " is not in the ArrayList");
                }
            }
        }
            //Search through the ArrayList, and if the item is present, print a message
        //     if(list.contains(value)){
        //         System.out.println(value + " is in the ArrayList");
        //     }else{
        //         System.out.println(value + " is not in the ArrayList");
        //     }
        // }
    }