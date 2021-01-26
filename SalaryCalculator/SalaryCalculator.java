/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SalaryCalculator;

import java.util.Scanner;

/**
 *
 * @author Legion Y520
 */
public class SalaryCalculator {
    
         public static String ID(String id){
        
        if(id.equals("192001")){
        }
        else if(!id.equals("192001")){
            System.out.println("login Failed");
            System.exit(0);
        }
        
        return id;
    }
         
    public static String email(String email){
        
        if(email.equals("bambang@gmail.com")){
        }
        else if(!email.equals("bambang@gmail.com")){
            System.out.println("Gagal login");
            System.exit(0);
        }
        
        return email;
    }
    
     public static String password(String pass){
        
        if(pass.equals("bambang")){
            System.out.println("login Succes");
        }
        else if(!pass.equals("bambang")){
            System.out.println("login Failed");
            System.exit(0);
        }
        
        return pass;
    }
    
     
    public boolean name(String name){
        
        boolean status = false;
        
        if(!name.isEmpty()){
            status = true;
        }
        else if(name.isEmpty()){
            status = false;
            System.exit(0);
        } 
        
        return status;
    }
    
    public boolean Gender(String gen){
        
        boolean genStatus = false;
        
        if(gen.equals("Male") || gen.equals("Female")){
            genStatus = true;    
        }
        else{
            genStatus = false;
            System.exit(0);
            
        }
        
        return genStatus;
    }
    
    public int position(String position, String overtime, int total){
        
        
        if(position.equals("manager") || position.equals("1")){
                    
            switch (overtime) {
                case "1":
                case "1 hours":
                    {
                        int salary = 11000000;
                        total = salary + 50000;
                        System.out.println("Your Salary Is  Rp."+total);
                        break;
                    }
                case "2":
                case "2 hours":
                    {
                        int salary = 11000000;
                        total = salary + 100000;
                        break;
                    }
                case "3":
                case "3 hours":
                    {
                        int salary = 11000000;
                        total = salary + 150000;
                        System.out.println("Your Salary Is  Rp."+total);
                        break;
                    }
                case "4":
                case "4 hours":
                    {
                        int salary = 11000000;
                        total = salary + 200000;
                        System.out.println("Your Salary Is  Rp."+total);
                        break;
                    }
                case "5":
                case "5 hours":
                    {
                        int salary = 11000000;
                        total = salary + 250000;
                        System.out.println("Your Salary Is  Rp."+total);
                        break;
                    }
                case "no":
                    {
                        int salary = 11000000;
                        total = salary;
                        System.out.println("Your Salary Is  Rp."+total);
                        break;
                    }
                default:
                    System.exit(0);
            }
        }
        else if(position.equals("Supervisor")|| position.equals("2")){
            
            switch (overtime) {
                case "1":
                case "1 hours":
                    {
                        int salary = 8000000;
                        total = salary + 50000;
                        System.out.println("Your Salary Is  Rp."+total);
                        break;
                    }
                case "2":
                case "2 hours":
                    {
                        int salary = 8000000;
                        total = salary + 100000;
                        System.out.println("Your Salary Is  Rp."+total);
                        break;
                    }
                case "3":
                case "3 hours":
                    {
                        int salary = 8000000;
                        total = salary + 150000;
                        System.out.println("Your Salary Is  Rp."+total);
                        break;
                    }
                case "4":
                case "4 hours":
                    {
                        int salary = 8000000;
                        total = salary + 200000;
                        System.out.println("Your Salary Is  Rp."+total);
                        break;
                    }
                case "5":
                case "5 hours":
                    {
                        int salary = 8000000;
                        total = salary + 250000;
                        System.out.println("Your Salary Is  Rp."+total);
                        break;
                    }
                case "no":
                    {
                        int salary = 8000000;
                        total = salary;
                        System.out.println("Your Salary Is  Rp."+total);
                        break;
                    }
                default:
                    System.exit(0);
            }
        }
        else if(position.equals("PermanentEmployee") || position.equals("3")){
            
            switch (overtime) {
                case "1":
                case "1 hours":
                    {
                        int salary = 5000000;
                        total = salary + 50000;
                        System.out.println("Your Salary Is  Rp."+total);
                        break;
                    }
                case "2":
                case "2 hours":
                    {
                        int salary = 5000000;
                        total = salary + 100000;
                        System.out.println("Your Salary Is  Rp."+total);
                        break;
                    }
                case "3":
                case "3 hours":
                    {
                        int salary = 5000000;
                        total = salary + 150000;
                        System.out.println("Your Salary Is  Rp."+total);
                        break;
                    }
                case "4":
                case "4 hours":
                    {
                        int salary = 5000000;
                        total = salary + 200000;
                        System.out.println("Your Salary Is  Rp."+total);
                        break;
                    }
                case "5":
                case "5 hours":
                    {
                        int salary = 5000000;
                        total = salary + 250000;
                        System.out.println("Your Salary Is  Rp."+total);
                        break;
                    }
                case "no":
                    {
                        int salary = 5000000;
                        total = salary;
                        System.out.println("Your Salary Is  Rp."+total);
                        break;
                    }
                default:
                    System.exit(0);
            }
        }
        else if(position.equals("ContractEmpolyee")|| position.equals("4")){
            
            switch (overtime) {
                case "1":
                case "1 hours":
                    {
                        int salary = 4200000;
                        total = salary + 50000;
                        System.out.println("Your Salary Is  Rp."+total);
                        break;
                    }
                case "2":
                case "2 hours":
                    {
                        int salary = 4200000;
                        total = salary + 100000;
                        System.out.println("Your Salary Is  Rp."+total);
                        break;
                    }
                case "3":
                case "3 hours":
                    {
                        int salary = 4200000;
                        total = salary + 150000;
                        System.out.println("Your Salary Is  Rp."+total);
                        break;
                    }
                case "4":
                case "4 hours":
                    {
                        int salary = 4200000;
                        total = salary + 200000;
                        System.out.println("Your Salary Is  Rp."+total);
                        break;
                    }
                case "5":
                case "5 hours":
                    {
                        int salary = 4200000;
                        total = salary + 250000;
                        System.out.println("Your Salary Is  Rp."+total);
                        break;
                    }
                case "no":
                    {
                        int salary = 4200000;
                        total = salary;
                        System.out.println("Your Salary Is  Rp."+total);
                        break;
                    }
                default:
                    System.exit(0);
            }
        }
        else if(!position.equals("OfficeBoy")&& !position.equals("5")){
            System.exit(0);
        }
        else{
            
            switch (overtime) {
                case "1":
                case "1 hours":
                    {
                        int salary = 3000000;
                        total = salary + 50000;
                        System.out.println("Your Salary Is  Rp."+total);
                        break;
                    }
                case "2":
                case "2 hours":
                    {
                        int salary = 3000000;
                        total = salary + 100000;
                        System.out.println("Your Salary Is  Rp."+total);
                        break;
                    }
                case "3":
                case "3 hours":
                    {
                        int salary = 3000000;
                        total = salary + 150000;
                        System.out.println("Your Salary Is  Rp."+total);
                        break;
                    }
                case "4":
                case "4 hours":
                    {
                        int salary = 3000000;
                        total = salary + 200000;
                        System.out.println("Your Salary Is  Rp."+total);
                        break;
                    }
                case "5":
                case "5 hours":
                    {
                        int salary = 3000000;
                        total = salary + 250000;
                        System.out.println("Your Salary Is  Rp."+total);
                        break;
                    }
                case "no":
                    {
                        int salary = 3000000;
                        total = salary;
                        System.out.println("Your Salary Is  Rp."+total);
                        break;
                    }
                default:
                    System.exit(0);
            }
        }
        return total;
    }
    
    
    
    
    public static void main(String[] args) {
              
        String email, pass, id,
                name,  gen, 
                position, overtime;
        
        int total = 0;
        Scanner sc = new Scanner(System.in);
        SalaryCalculator main = new SalaryCalculator();
        
        System.out.println("Login------------");
        
        System.out.print(" ID: ");
        id = sc.nextLine();
        main.ID(id);
        System.out.print(" email: ");
        email = sc.nextLine();
        main.email(email);
        System.out.print(" password: ");
        pass = sc.nextLine();
        main.password(pass);
        
        System.out.println("Data-------------");
        
        System.out.print(" Name: ");
        name = sc.nextLine();
        main.name(name);
        
        System.out.print(" Select Gender(Male/Female): ");
        gen = sc.nextLine();
        main.Gender(gen);
        
        System.out.println("Position: ");
        System.out.println("1. manager");
        System.out.println("2. Supervisor");
        System.out.println("3. PermanentEmployee");
        System.out.println("4. ContractEmpolyee");
        System.out.println("5. OfficeBoy");
        System.out.print("Position :");
        position = sc.nextLine();
        System.out.print("overtime hours (1-5 hours/no): ");
        overtime = sc.nextLine();
        main.position(position, overtime, total);
        System.out.println("ThankYou---------");
    }
}
