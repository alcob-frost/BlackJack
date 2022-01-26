package javaapplication3;


public class game21 {
    public  static int playerTotal = 0;
    public static int getPlayerNum(){
            int card = (int) (Math.random()*10)+1;
        playerTotal = playerTotal + card;
        return card;
        
    }
    public static int getComputerTotal (){
        int card1 = (int) (10+Math.random()*21);
        return card1;
    
    }
}
