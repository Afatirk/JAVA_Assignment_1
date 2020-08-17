package recatangle;
import java.awt.Rectangle;
import java.util.*;

Class Rectangle{
        int h,int w;
        Rectangle(int h,int w){
        this.h=h;
        this.w=w;
        }
        public void display(int h,int w){
         System.oout.print(h+" "+w);}
}


public class RecatangleArea extends Rectangle{

    public void read_input(){
        System.out.println(h*w);
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        Rectangle r=new Rectangle(h,w);
        r.display();
        RectangleArea area=new RecatangleArea();
        area.read_input();
        
    }
    
}
