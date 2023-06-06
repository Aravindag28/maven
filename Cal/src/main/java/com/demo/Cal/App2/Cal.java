package com.demo.Cal.App2;


import java.util.Scanner;

public class Cal {
  
  public static int sum(int a, int b) {
    return a + b;
  }
  
  public static int subtract(int a, int b) {
    return a - b;
  }
  
  public static int multiply(int a, int b) {
    return a * b;
  }
  
  public static int divide(int a, int b) {
    if (b == 0) {
      throw new IllegalArgumentException("Cannot divide by zero");
    }
    return a / b;
  }
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the first number: ");
    int num1 = scanner.nextInt();
    
    System.out.print("Enter the second number: ");
    int num2 = scanner.nextInt();
    
    scanner.close();
    
    System.out.println("Sum: " + sum(num1, num2));
    System.out.println("Difference: " + subtract(num1, num2));
    System.out.println("Product: " + multiply(num1, num2));
    System.out.println("Quotient: " + divide(num1, num2));
  }
}