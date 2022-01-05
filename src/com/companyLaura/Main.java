package com.companyLaura;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double num1;
        double num2;
        String operation;
        Scanner input = new Scanner(System.in);

        do { System.out.print("Ievadi pirmo ciparu un nospied Enter: ");
        num1 = input.nextInt();
        System.out.print("Ievadi otro ciparu un nospied Enter: ");
        num2 = input.nextInt();
        System.out.print("Ievadi vēlamo operāciju (+,-,/,*): ");
        operation = input.next();

        if ("+".equals(operation)) { System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); }
        else if ("-".equals(operation)) { System.out.println(num1 + " - " + num2 + " = " + (num1 - num2)); }
        else if ("/".equals(operation)) { System.out.println(num1 + " / " + num2 + " = " + (num1 / num2)); }
        else if ("*".equals(operation)) { System.out.println(num1 + " * " + num2 + " = " + (num1 * num2)); }
        else { System.out.println("ERROR 404!!! Mēģini vēlreiz!"); }
        }
        while
        (!operation.equals("KARTUPELIS"));
        System.out.println("END");
    }
}


