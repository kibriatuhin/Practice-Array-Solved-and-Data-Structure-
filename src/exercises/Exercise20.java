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

class Test5{
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i=0 ; i<5 ; i++){
            arrList.add(i);
        }
        int[] myArray = new int[arrList.size()];


        for(int i=0 ; i<arrList.size() ; i++){
            myArray[i] = arrList.get(i);
        }
        System.out.println(Arrays.toString(myArray));
    }
}