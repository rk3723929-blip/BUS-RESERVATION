import java.util.Arrays;
import java.util.Scanner;

 public class main{
  public static void main(String[] args){

    int [] a= new int[5];
    a[1]=8;
    a[2]=78;
    a[3]=4;
    a[4]=3;
    System.out.println(Arrays.toString(a));
    change(a);
    System.out.println(Arrays.toString(a));
  }
  static void change(int[] a){
    a[0]=99;
  }
  
   }
      