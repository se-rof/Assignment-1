package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;
import java.util.Scanner;

/**
 *
 * @author Joshua Student 
 * ID: 991598983 
 * Student Name: Raphael Joshua Fortes
 */

public class CardTrick {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Card[] myHand = new Card[4];
        
        for(int i = 0; i < myHand.length; i++) {
            Card c = new Card(); 
            
            c.setSuit(Card.SUITS[(int)((Math.random()*4)+0)]);
            c.setValue((int)((Math.random()*13)+1));

            
            myHand[i] = c;
        }
    }
}
