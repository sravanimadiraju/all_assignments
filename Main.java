package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//Employee objects with attributes

        Employee e1=new Employee("Madiraju", "sravani", 35, 35000);
        Employee e2=new Employee("Ladi","lalitha", 31, 36000);
        Employee e3=new Employee("Neela", "Hareesh", 23, 37000);
        Employee e4=new Employee("Kalavakuntla", "praveen", 22, 38000);
        ArrayList<Employee> emp=new ArrayList<>();
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        emp.add(e4);
        Main m=new Main();
        m.employeedetails(emp);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lastname of Employee:");
        String lastname=sc.nextLine();
        m.empdetailsbylastname(emp,lastname);
        m.maxsalary(emp);
        m.averageage(emp);



    }
    public void employeedetails(ArrayList<Employee> emp){
        for(Employee e:emp){
            System.out.println(e.firstname + " " + e.lastname + " " + e.age + " " +e.salary);
        }

    }
    public void empdetailsbylastname(ArrayList<Employee> emp,String lastname){
        for(Employee f:emp){
            if((f.lastname).equals(lastname)){
                System.out.println("Details of Employee: "+f.firstname+f.lastname+" "+f.age+" "+f.salary);
            }

        }
    }
    public void maxsalary(ArrayList<Employee> emp){
        int max=0;
        for(Employee g:emp){
           if(g.salary>max){
               max=g.salary;
           }
        }
        System.out.println("Maximum salary of Employees: "+max);

    }
    public void averageage(ArrayList<Employee> emp){
        int agee=0;
        int count=0;
        int old=0;

        for(Employee h:emp){
            agee=agee+h.age;
            count++;
        }
        int young=(agee/count);
        for(Employee k:emp){

            if(k.age>old){
                old=k.age;
            }
            if(k.age<young){
                young=k.age;
            }
        }
        System.out.println("Average age of Employees: "+(agee/count)+"years");
        for(Employee i:emp){
            if(old==i.age){
                System.out.println("Oldest Employee details:"+ i.firstname+" "+i.lastname+" "+i.age+" "+i.salary);
            }
            if(young==i.age){
                System.out.println("Youngest Employee details:"+ i.firstname+" "+i.lastname+" "+i.age+" "+i.salary);
            }
        }
    }
}


