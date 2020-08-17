echo "# JAVA_Assignment_1" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/Afatirk/JAVA_Assignment_1.git
git push -u origin master
 
package calculator;
import java.util.Scanner;
import org.w3c.dom.events.MutationEvent;

interface Add{
   public int add(int a,int b);
}
interface Difference{
   public int Difference(int a,int b);
}
interface Product{
   public int Product(int a,int b);
}
interface SafeDivision{
   public int division(int a,int b)throws ArithmeticException;
}
public class Calculator {
     
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
         int q=sc.nextInt();
        Add ad=(a,b)->a+b;
        System.out.print("ADDITION=" );
        System.out.println(ad.add(r, q));
        Difference diff=(a,b)->a-b;
      System.out.print("Difference=");
        System.out.println(diff.Difference(r,q));
       Product pro=(a,b)->a*b;
       System.out.print("Product=");
        System.out.println(pro.Product(r, q));
        SafeDivision div=(a,b)->a/b;
        
        
      
    System.out.print("SafeDIVISION =");
    
        System.out.println(div.division(r, q));
   
       
        
    }
    
}
