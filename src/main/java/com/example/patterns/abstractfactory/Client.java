package com.example.patterns.abstractfactory;


import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarFactory factory = null;

        System.out.println("Which type of car do you want to assemble? (electric/petrol): ");
        String choice = scanner.nextLine().trim().toLowerCase();

      if(choice.equals("electric")) {
          factory = new ElectricCarFactory();
      }
     else {
          factory = new PetrolCarfactory();
       }
     Assembler assembler = new Assembler(factory);
     assembler.assemble();
    }
}
