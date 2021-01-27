package Array1D;

import java.util.Scanner;

/**
 * Created by USER on 1/27/2021.
 */
public class SImple3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name = new String[5];
        System.out.printf("Enter five name : ");
        for (int i=0 ; i<name.length ; i++){
            name[i] = sc.next();
        }
        for (String na : name){
            System.out.print(na + " ");
        }
    }
}

class Another {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] number = new int[5];
        System.out.printf("Enter five number = ");
        for (int i=0 ; i<number.length ; i++)
        {
            number[i] = sc.nextInt();
        }
        int sum = 0;
        for (int s : number){
            sum = sum+s;
        }
        System.out.println("sum of all number = " + sum);
    }
}


