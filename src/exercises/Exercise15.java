package exercises;

public class Exercise15 {
    public static void main(String[] args) {
        int[] myArray1 = {1,2,3,4,5};
        int[] myArray2 = {6,7,8,9,1};

        for (int i=0 ; i<myArray1.length ; i++){
            for (int j=0 ; j< myArray2.length ; j++){
                if (myArray1[i] == myArray2[j]){
                    System.out.println(myArray1[i]);
                }
            }
        }
    }
}
