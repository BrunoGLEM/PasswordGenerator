/*
 * Made By: CoffeeLover
 * https://github.com/C0ffeeL0ver/PasswordGenerator
 */
package passwordrandom;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author bruno GLEM
 * Portugal
 */
public class PassWordRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] vect = new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','Z','Y','Z','Ç','1','2','3','4','5','6','7','8','9','0','@','£','§','€','{','[',']','}','?','<','>',';',',','.',':','-','_','~','^','+','-','*','/','«','»'};
        Scanner s = new Scanner(System.in);
        int llength;
        String PassWord="";
        Random Rand = new Random();
        System.out.println("Password Length:");
        System.out.print("> ");
        
        try{
        llength =s.nextInt();
        
        if(llength<8)
        {
            System.out.println("Minimum length is 8");
            for(int i=0; i<8; i++)
            {
                PassWord=PassWord+String.valueOf(vect[Rand.nextInt(vect.length)]);
            }
        }
        else
        {
            for(int i=0; i<llength; i++)
            {
                PassWord=PassWord+String.valueOf(vect[Rand.nextInt(vect.length)]);
            }            
        }
        System.out.println("PassWord: "+PassWord);
        }catch(InputMismatchException e){System.out.println("Minimum length is 8");}
        
    }
    
}
