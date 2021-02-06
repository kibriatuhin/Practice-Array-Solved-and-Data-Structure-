package exercises;
// Find all Pairs of elements in an array whose sum is equal to a specified number
public class Exercise22 {
    static void pairValue(int[] myArray , int value){
        System.out.println("Pairs of elements and their sum = ");
        for (int i=0 ; i<myArray.length ; i++){
            for (int j=i+1 ; j<myArray.length ; j++){
                if (myArray[i]+myArray[j] == value){
                    System.out.println(myArray[i] + "+" + myArray[j] + " = " + value);
                }
            }
        }

    }
    public static void main(String[] args) {
        Exercise22.pairValue(new int[] {2,7,4,-5,11,5,20} , 15);
    }
}
