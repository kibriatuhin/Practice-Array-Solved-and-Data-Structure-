package exercises;

public class Exercise24 {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,6,8};
        int deff= myArray[0];
        for (int i=0 ; i<myArray.length ; i++){
            if (myArray[i]-i !=deff){
                while (deff < myArray[i]-i){
                    System.out.print((deff+i) + " ");
                    deff++;
                }
            }
        }
    }
}
