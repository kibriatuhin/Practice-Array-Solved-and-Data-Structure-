package p_Data_Structure;

import java.util.Arrays;
import java.util.Scanner;

public class StackPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] stack = new int[6];

        int top = top(stack);
        if (top == -1){
            System.out.println("Empty Array..");
        }
        push(stack,top);
        top++;
        push(stack,top);
        top++;
        System.out.println(top);
        System.out.println(Arrays.toString(stack));


    }
    //top
    public static int top(int[] stack){
        int count=0,top ;
        for (int i = 0 ; i<stack.length ; i++){
            if (stack[i] ==0){
                count++;
            }
        }
        if (count==stack.length){
            return -1;
        }else {
            top = stack.length-count;
            return top-1;
        }

    }
    //push
    public static void push(int[] stack , int top){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter push value = ");
        int value=sc.nextInt();
            top++;
            stack[top] = value;
    }
    //pop
    public static void pop(int[] stack , int top){
        if (top == -1){
            System.out.println("Underflow");

        }else {
            System.out.println(stack[top]);
            top--;
        }

    }


}
