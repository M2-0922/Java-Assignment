import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import javax.naming.ldap.Rdn;

public class A1 {
    public static void main(String[] args) throws Exception {
        
        
        Scanner sc = new Scanner(System.in);

        int value = sc.nextInt();



        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rd = new Random();


        for (int i = 0; i < 10; i++) {
            list.add(1 + rd.nextInt(50));
        } 

        System.out.println(list);
        System.out.println("---------------");
        System.out.println("Value: ");

        try {
            value = sc.nextInt();
        } catch (InputMismatchException e) {
        System.out.println("You need to put a valid number");      
        } finally {
            sc.close();
        }
        	

        if(list.contains(value)){
            System.out.println(value + " is in the array list");
        }else{
            System.out.println(value + " is not in the array list");
        }
    }
}      