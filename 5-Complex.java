package complex;

import java.util.Scanner;
 class Complex {

    
   int real;
   int img;
   Complex(int real,int img){
       this.real=real;
       this.img=img;
   }
 }
   public class ComplexUse{
       public static void add(Complex c1,Complex c2){
           int real=c1.real+c2.real;
           int img=c1.img+c2.img;
           System.out.println("Addition="+real+"+"+img+"i");
       }
        public static void difference(Complex c1,Complex c2){
           int real=Math.abs(c1.real-c2.real);
           int img=Math.abs(c1.img-c2.img);
           System.out.println("Difference="+real+"+"+img+"i");
       }
         public static void product(Complex c1,Complex c2){
           int real=(c1.real*c2.real)-(c1.img*c2.img);
           int img=(c1.img*c2.real)+(c1.real*c2.img);
           System.out.println("Product="+real+"+"+img+"i");
       }
       public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           System.out.println("First complex");
           int real1=sc.nextInt();
           int img1=sc.nextInt();
           Complex c1=new Complex(real1,img1);
           System.out.println("First complex");
           int real2=sc.nextInt();
           int img2=sc.nextInt();
           Complex c2=new Complex(real2,img2);
           
           add(c1,c2);
           difference(c1,c2);
           product(c1, c2);
       }
   }
