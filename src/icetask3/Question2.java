/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icetask3;

/**
 *
 * @author Sushmitha
 */
public class Question2 {
    public static void main(String[] args){
        //the function odd_squares_sum() is being called in the main method and outputs the sum
        System.out.println(odd_squares_sum());
    }
    public static double odd_squares_sum(){
        double sum = 0;
        //the count is running for 391 times, the function calcultes the square of the odd numbers and it adds it to sum
        for(int count = 1; count < 391; count += 2){
            sum += Math.pow(count, 2);
        }
        return sum;
    }
}
