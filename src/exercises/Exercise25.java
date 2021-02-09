package exercises;

public class Exercise25 {
    public static void main(String[] args) {
        int[] myArray1 = {2,4,8};
        int[] myArray2 = {2,3,4,8,10,16};
        int[] myArray3 = {4,8,14,40};

        for (int i=0 ; i<myArray1.length ; i++){
            for (int j=0 ; j<myArray2.length ; j++){
                for (int k=0 ; k<myArray3.length ; k++){
                    if (myArray1[i] == myArray2[j] && myArray1[i]==myArray3[k]){
                        System.out.println(myArray1[i]);
                    }
                }
            }
        }
    }
}
