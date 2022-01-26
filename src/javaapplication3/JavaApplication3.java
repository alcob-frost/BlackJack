

package javaapplication3;
import java.util.*;
public class JavaApplication3 {

    public static void main(String[] args) {
    
        game21 num = new game21();
        System.out.println("Welcome to Game 21 Get as close to 21 as possible without going over \n All players start off with 1 card.The value of your first card is " + num.getPlayerNum());
        
        System.out.println("Enter the word hit if you want another card, or stop if you want to stay with your current total.");
        String prompt;
        int i = 0;
        int num1 = num.getComputerTotal();
        Scanner scan = new Scanner(System.in);
        String loss = "You lost!";
        String won = "You won!";
        do {
            System.out.print("Do you want another card? ");
            prompt = scan.nextLine(); 
            if (prompt.equals("hit")){
                System.out.println("You recieved a "+ num.getPlayerNum());
            System.out.println("Your new total is: " + num.playerTotal);
            }
            
            
        }while (prompt.equals("hit") && num.playerTotal < 21);
        System.out.println("Dealer had "+ num1);
    while (i<1){
        if (num.playerTotal > 21){
        
            System.out.println(loss);
            break;
            }
        if (num1 > 21){
        System.out.println(won);
        break;
}
        if (num1 == num.playerTotal){
            System.out.println(loss);
            break;
        }
        if (num.playerTotal > num1){
            System.out.println(won);
            break;
        }}
        



    
    
    
    
        }
        
    
    
}
