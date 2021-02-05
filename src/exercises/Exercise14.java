package exercises;

import java.util.Scanner;

public class Exercise14{
    public static void main(String[] args) {
        String[] myArray1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] myArray2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};

        for (int i=0 ; i<myArray1.length ; i++){
            for (int j=0 ; j<myArray2.length ; j++){
                if (myArray1[i].equals(myArray2[j])){
                    System.out.println(myArray1[i]);
                }
            }
        }
    }
}
