import java.io.*;
import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class hello {
    public static void main(String []args){
      
      Scanner scan=new Scanner(System.in);
      Random rand=new Random();
      int guess=0;
      int attmepts=0;
      int randomnumber=rand.nextInt(1,9);
      System.out.println("welcome to number guess game");
      System.out.println("guess a number between 1 to 9");

      while(guess!=randomnumber){
        System.out.println("ENTER YOUR GUESS:");
        guess=scan.nextInt();
        attmepts++;
      

        if(guess<randomnumber){
          System.out.println("too low try again");
        }
        else if(guess>randomnumber){
          System.out.println("too high try again");
        }
        else{
          System.out.println("this number correct congralation"+randomnumber);
          System.out.println("number of attmepts:"+attmepts);
        }
      }
    }
}

      



      
      
      


      
    