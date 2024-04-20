/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icetask3;
import java.util.Scanner;

/**
 *
 * @author Sushmitha
 */
public class Question3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input 2 numbers");
        System.out.print("Input num1: ");
        int num1 = input.nextInt();
        System.out.print("Input num2: ");
        int num2 = input.nextInt();
        System.out.println("The greatest common divisor between " + num1 + " and " + num2 + " is: " + greatest_common_divisor(num1, num2));
    }
    public static int greatest_common_divisor(int a, int b){
        int div = 0;
        //the loop runs for till the lowest number, each time it checks if the number is divisable byt the count
        //if it is then the div variable updates itself.
        for(int count = 1; count <= Math.min(a, b); count++){
            if(a%count == 0 && b%count == 0){
                div = count;
            }
        }
        return div;
    }
}
