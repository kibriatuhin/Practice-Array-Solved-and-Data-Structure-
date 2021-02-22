package exercises;

public class Exercise31 {
    public static void main(String[] args){
        int[] myArray = {10,20,30,10,10,40,10,50};
        int sum =0 ;
        for (int i=0 ; i<myArray.length ; i++){
            if (myArray[i] == 10){
                sum = sum + myArray[i];
            }
        }
        if(sum==30)
            System.out.println("true");
        else
            System.out.println("false");

    }
}

