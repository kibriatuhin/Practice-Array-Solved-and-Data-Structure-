package exercises;

public class Exercise23 {

    public static void main(String[] args) {
        int[] myArray1 = {1,2,3,4,5,6};
        int[] myArray2 = {1,8,3,4,5,6};
        int count = 0 ;
        for (int i=0 ; i<myArray1.length ; i++){
            for (int j=0 ; j<myArray2.length ; j++){
                if (myArray1[i] == myArray2[j]){
                    count++;
                }
            }
        }
        if (count == myArray1.length){
            System.out.println("Two array are equal");
        }else {
            System.out.println("Two array are not equal..");
        }
    }
}
