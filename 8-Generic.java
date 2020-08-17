package generic;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
class CustomException extends Exception {
    
}
public class Generic {

  public static <T> void car(T a,T b)throws CustomException{
      Boolean f1=a instanceof String;
      Boolean f2=b instanceof String;
      if(f1 && f2)
          throw new CustomException();
     T a1=(2*a)/3;
     T b1=(2*b)/3;
      System.out.println(a1+"   "+b1);
  }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
      try {
          car(a, b);
      } catch (CustomException ex) {
          System.out.println(ex);
      }
       
    }
    
}
