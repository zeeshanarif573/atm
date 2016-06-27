/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.awt.Choice;
import java.util.Scanner;

/**
 *
 * @author zeeshan
 */
public class Atm {

    double balance=50000;
        String exit = null;
        String e;
        double balance1;
        int choose;

        Scanner sc= new Scanner(System.in);

              
            
    public void menu(){
            
            System.out.println("Enter 1 for deposit\nEnter 2 for withdraw\nEnter 3 for display\nEnter 0 for Exit\n");
            Scanner sc= new Scanner(System.in);
            int choice = sc.nextInt();
            
            switch(choice){
                case 1:
                    deposit();
                    cont();
                    break;
                case 2:    
                    withdraw();
                    cont();
                     break;
                case 3:
                    display();
                    cont();
                    break;
                case 0:
                     System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
                     System.out.println("\t\t\t\t\t\t\t\tThankYou!");
                     System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
        
                     break;
            }
}
           

    public void deposit(){
        System.out.println("Enter Amount to Deposit");
                int dep = sc.nextInt();
                balance = balance + dep;
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
        
            System.out.println("\t\t\t\t\t\t\t Now Your Total Balance is " + balance);
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
                
    }

    public void withdraw(){
         System.out.println("Enter Amount to Withdraw");
                int withdr = sc.nextInt();
                balance = balance - withdr;
             System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
                
             System.out.println("\t\t\t\t\t\t\tNow Your Total Balance is " + balance);
             System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
         
    }

    public void display(){
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
        
        System.out.println("\t\t\t\t\t\t\tYour Total Balance is " + balance);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
        
    }
    
    public void cont(){
     Scanner sc = new Scanner(System.in);
        System.out.println("Type 'm' to return to main menu.");

        String value = sc.next();
        if(value.equalsIgnoreCase("m")){
        menu();
        }
        else if (!sc.equals('m')){
            System.out.println("Invalid Entry!");
    
}
    }
    public static void main(String[] args) {
        
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t WELCOME TO ATM");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
       
        Atm atm = new Atm();
        atm.menu();
    }
}
        