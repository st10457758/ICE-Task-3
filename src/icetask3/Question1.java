/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package icetask3;
import java.util.Scanner;

/**
 *
 * @author Sushmitha
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" ");
        String s = input.nextLine();
        if(isValid(s))
            System.out.println("Your input is valid");
        else
            System.out.println("Your input is invalid");
    }
    public static boolean isValid(String s){
        StringBuilder bracket = new StringBuilder();
        //the following checks if the user input nothing then it will return false without running the rest of the code.
        if(s.isEmpty())
            return false;
        //this runs the code for checks the word till the length of the entered input.
        for(int count = 0; count < s.length(); count++){
            //this will make the char1 the letter in variable at the count position.
            char chr1 = s.charAt(count);
            //this checks if it is an open bracket. It add the open bracket inside the object bracket
            if(chr1 == '(' || chr1 == '[' || chr1 == '{')
                bracket.append(chr1);
            else{
                //if the bracket is empty then it means that the closed bracket doesn't have an equivalent
                //open bracket before it therefore it returns false
                if(bracket.isEmpty())
                    return false;
                //this assigns the the last char in the object bracket to a varible to check it with the current char
                char chr2 = bracket.charAt(bracket.length()-1);
                if((chr1 == ')' && chr2 == '(') || (chr1 == ']' && chr2 == '[') || (chr1 == '}' && chr2 == '{')){
                    bracket.deleteCharAt(bracket.length()-1);
                }
                else
                    return false;
            }
        }
        //if the bracket is empty that means it has checked all the char and they match.
        //once a pair is matched it removes the opening bracket to it in the object bracket.
        //if the object is empty this means that the pair matches.
        return bracket.isEmpty();
    }
}
