package com.company;
import java.util.Scanner;

public class CWH_06_Exercise_1_percentage_calculator {
    public  static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float marks1,marks2,marks3,marks4;
        float total = 400;
        float sum;
        System.out.println("enter the value of marks1: ");
        marks1 = sc.nextFloat();

        System.out.println("enter the value of marks2: ");
        marks2 = sc.nextFloat();

        System.out.println("enter the value of marks3: ");
        marks3 = sc.nextFloat();

        System.out.println("enter the value of marks4: ");
        marks4 = sc.nextFloat();

        sum = marks1 + marks2 + marks3 + marks4;

        System.out.println("your toal marks is ");
        System.out.println(sum);

        float percentage = (sum/total)*100;
        System.out.println("the percentage of the student is ");
        System.out.println(percentage);

    }
}
