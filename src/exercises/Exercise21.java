package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise21 {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        l.add("Golam");
        l.add("Golam");
        l.add("Golam");
        l.add("Golam");
        l.add("Golam");
        l.add("Golam");

        String[] myArray = new String[l.size()];
        l.toArray(myArray);
        System.out.println(Arrays.toString(myArray));
        for (String name : myArray){
            System.out.println(name);
        }
    }
}
