package employee;

import java.util.Scanner;
public class Employee {
    int empSalary,empId;
  String  empName,empDesignation,empLocation;
    public Employee(int empid,String empName,String empDesignation,int empSalary,String empLocation) {
        this.empId=empid;
        this.empName=empName;
        this.empDesignation=empDesignation;
        this.empSalary=empSalary;
        this.empLocation=empLocation;
    }
    public void id(){
        System.out.println(empId);
    }
    public void name(){
        System.out.println(empName);
    }
    public void design(){
        System.out.println(empDesignation);
    }
    public void salary(){
        System.out.println(empSalary);
    }
    public void location(){
        System.out.println(empLocation);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employee ob[]=new Employee[10];
        for(int i=0;i<2;i++){
        int empid=sc.nextInt();
        
        String empName=sc.nextLine();
        String empDesignation=sc.nextLine();
        int empSalary=sc.nextInt();
        String empLocation=sc.nextLine();
        
             ob[i]=new Employee(empid,empName,empDesignation,empSalary,empLocation);
        
        }
        for(int i=0;i<ob.length;i++){
            ob[i].id();
        }
         for(int i=0;i<ob.length;i++){
            ob[i].name();
        }
          for(int i=0;i<ob.length;i++){
            ob[i].design();
        }
           for(int i=0;i<ob.length;i++){
            ob[i].salary();
        }
            for(int i=0;i<ob.length;i++){
            ob[i].location();
        }
        
        
    }
    
}
