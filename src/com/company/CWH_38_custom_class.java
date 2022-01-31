package com.company;
class Employee{
    int id;
    String name;
    int salary;
    public void details(){
        System.out.println("my id is:"+ id);
        System.out.println("my  name is:"+ name);
    }
    public int getSalary(){
        return salary;
    }

}

public class CWH_38_custom_class {
    public static void main(String[] args) {
        Employee nihal =new Employee();
        Employee aman= new Employee();

        // Setting Attributes
        nihal.id=13;
        nihal.name="Nihal Ram Tripathi";
        nihal.salary=300000;
        aman.id=14;
        aman.name ="Aman Ram Tripathi";
        aman.salary=23000;

        
       // printing Attributes
    nihal.details();
        System.out.println(nihal.getSalary());

        aman.details();
        System.out.println(aman.getSalary());

    }
}
