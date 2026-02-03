import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;
class bus{
  int busNo;
  String busName;
  int Totalseats;
  int avaibleseat;
   bus(int busNo, String busName, int avaibleseat){
    this.busNo=busNo;
    this.busName=busName;
    this.Totalseats=Totalseats;
    this.avaibleseat=avaibleseat;
   }
    void showbus(){
    System.out.println(busNo+" "+busName+" "+"avaible seats"+""+avaibleseat);
   }

}
class booking {
  int busNo;
  String passagername;

  booking(int busNo, String passagername){
    this.busNo=busNo;
    this.passagername=passagername;
  }

 

}


public class hello {
    public static void main(String []args){
      Scanner scan=new Scanner(System.in);
      /*create two arralist */
     ArrayList<bus>buses=new ArrayList<>();
     ArrayList<booking>Bookings=new ArrayList<>();

     buses.add(new bus(        1,"redbus",40));
     buses.add(new bus(        2,"lolobus",30));
     buses.add(new bus(        3,"trackbus",20));
     int choice=0;
     while(true){
      System.out.println("------bus reservation------");
      System.out.println("1.show buss details");
      System.out.println("2.booking ticket");
      System.out.println("3.booking view");
      System.out.println("4.exit");
      System.out.println("ENTER YOUR CHOICE"
     );
     choice=scan.nextInt();   
     switch(choice){
      case 1:
        for(bus Bus:buses){
          Bus.showbus();
        }
      
     
       break;
     case 2:
      System.out.println("enter passagerName");
      scan.nextLine();
      
      String passagername=scan.nextLine();
      System.out.println("enter busNo");
      int busNo=scan.nextInt();
      
      for(bus Bus:buses){
        if(Bus.busNo==busNo&Bus.avaibleseat>0){
          Bus.avaibleseat--;
          Bookings.add(new booking( busNo,passagername));
           System.out.println("THANK FOR BUYING TICKET");
           break;
        }
      }
      break;
      case 3:
        System.out.println("--------BOOKING DETAILS-------");
        for(booking b:Bookings){
          System.out.println("bus no "+b.busNo);
          System.out.println("passager "+b.passagername);
        }
        break;
      case 4:
        System.out.println("thanks for using bus reservation");
        break;
        default:
           System.out.println("invalis choice");
    }
      

    }
  }
     }
      
    