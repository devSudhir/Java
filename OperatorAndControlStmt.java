import java.util.Scanner;

import java.util.Scanner;
public class OperatorAndControlStmt {
    public static void main(String[] args) {
        //program to check Entered age is eleigible for voting or not (age 18 +  are allowed)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age : ");
        int age = sc.nextInt();
        if(age  >= 18){
            System.out.println("You are eligible for voting");
        } else {
            System.out.println("You are not eligible");
        }
    }
}
