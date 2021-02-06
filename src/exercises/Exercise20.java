package exercises;

import java.util.ArrayList;
import java.util.Arrays;
//Write a Java program to convert an array to ArrayList.
public class Exercise20 {
    public static void main(String[] args) {
        String[] myArray = {"Golam" , "Kibria" , "Tuhin" , "Afra" , "Ibnat" , "Tethye"};
        ArrayList<String> l = new ArrayList<>(Arrays.asList(myArray));
        System.out.println(l);
    }
}
