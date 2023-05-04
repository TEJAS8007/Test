package A;

import java.util.Scanner;

public class A {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double num1, num2;
    String operation;
    
    System.out.println("Enter first number:");
    num1 = scanner.nextDouble();
    System.out.println("Enter second number:");
    num2 = scanner.nextDouble();
    System.out.println("Enter operation (+, -, *, /): ");
    operation = scanner.next();
    
    switch(operation) {      
      case "+":
        System.out.println(num1 + num2);
        break;
      case "-":
        System.out.println(num1 - num2);
        break;
      case "*":
        System.out.println(num1 * num2);
        break;
      case "/":
        System.out.println(num1 / num2);
        break;
      default:
        System.out.println("Invalid operation");
        break;
    }
  }
}