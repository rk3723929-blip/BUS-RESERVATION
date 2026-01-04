import java.util.Scanner;

public class icescream{

    static void vanilafavor(Scanner sc){
        System.out.println("VANILA FAVOR RATE:100");
        System.out.println("ENTER YOUR AMOUNT");

        int amount=sc.nextInt();
        if(amount>100){
             System.out.println("HERE YOUR VANILA ICESCREAM ");
            System.out.println("PLEASE TAKE YOUR BALANCE $");
        }
         else if(amount>=100){
            System.out.println("HERE YOUR VANILA ICESCREAM ");
        }
        
        else{
            System.out.print("INVALID");
        }
       
    }
     static void starberry(Scanner sc){
        System.out.println("STARBERRY RATE:200");
        System.out.println("ENTER YOUR AMOUNT");
        int amount=sc.nextInt();

        if(amount>=200){
            System.out.println("HERE YOUR STARBEEY FAVOR");
        }
         else if(amount>200){
            System.out.println("HERE YOUR STARBEEY FAVOR");
            System.out.println("PLEASE TAKE YOUR BALANCE $");
        }
        else{
            System.out.println("INVALID");
        }
     }
     static void chokelate(Scanner sc){
        System.out.println("CHOKELATE FAVOR RATE:300");
        System.out.println("ENTER YOUR AMOUNT");
         int amount=sc.nextInt();

        if(amount>=300){
            System.out.println("HERE YOUR CHOKELATE FAVOR");
        }
         else if(amount>300){
             System.out.println("HERE YOUR CHOKELATE FAVOR");
            System.out.println("PLEASE TAKE YOUR BALANCE $");
        }
        else{
            System.out.println("INVALID");
        }
     }
     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int choice;

        while(true){
            System.out.println("----WELCOME TO ICESCREAM MAKER----");
            System.out.println("---SHOP MENU---");
            System.out.println("THIS ICESCREAM MAKER HAVE ONLY THREE FAVOR HERE");
            System.out.println("1-->VANILA FAVOR");
            System.out.println("2-->STARBERRY FAVOR");
            System.out.println("3-->CHOKELATE FAVOR");
            System.out.println("4.EXIT");
            System.out.println("ENTER YOUR FAVOR BUTTON-->");

            choice=sc.nextInt();

            if(choice==1){
                vanilafavor(sc);
            }
            else if(choice==2){
                starberry(sc);
            }
            else if(choice==3){
                chokelate(sc);
            }
            else if(choice==4){
                System.out.println("THANKYOU FOR PURCHASING THIS SHOP COME AGAIN");
                break;
            }
            else{
                System.out.println("INSUFFIENT CHOICE");
            }

        }
        sc.close();
     }
}