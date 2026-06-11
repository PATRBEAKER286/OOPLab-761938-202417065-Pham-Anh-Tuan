package hust.soict.dsai.lab01;

import java.util.Scanner;
public class EquationSolver{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choose(0 is Equation, 1 is System, 2 is Quaradic): ");
        int choose = Integer.parseInt(sc.nextLine());
        if (choose == 0){
            System.out.println("Linear Equation(ax+b=0):");
            double a = Double.parseDouble(sc.next());
            double b = Double.parseDouble(sc.next());
            if(a==0){
                if(b==0) System.out.println("Infinite solution!");
                else    System.out.println("no solution!");
            }
            else{
                System.out.println("solution is: " + (-b/a));
            }
        }
        else if (choose == 1){
            System.out.println("Linear System:(enter a11 a12 b1 a21 a22 b2:");
            double a11 = Double.parseDouble(sc.next());
            double a12 = Double.parseDouble(sc.next());
            double b1 = Double.parseDouble(sc.next());
            double a21 = Double.parseDouble(sc.next());
            double a22 = Double.parseDouble(sc.next());
            double b2 = Double.parseDouble(sc.next());
            double d = a11*a22 - a21*a12;
            double d1 = b1*a22 - b2*a12;
            double d2 = a11*b2 - a21*b1;
            if(d==0){
                if(d1 != 0 || d2 != 0){
                    System.out.println("no solution!");
                }
                else{
                    System.out.println("infinite solution!");
                }
            }
            else{
                System.out.println("x1 = " + (d1/d));
                System.out.println("x2 = " + (d2/d));
            }
        }
        else if (choose == 2){
            System.out.println("Quaradic Equation ax^2 + bx + c = 0:");
            double a = Double.parseDouble(sc.next());
            double b = Double.parseDouble(sc.next());
            double c = Double.parseDouble(sc.next());
            if(a==0){
                System.out.println("error! is not Quaradic Equation");
            }
            else{
                double delta = b*b - 4*a*c;
                if(delta == 0) {
                    System.out.println("Equation have 1 solution: x = " + (-b/(2*a)));
                }
                else if(delta < 0){
                    System.out.println("No solution!");
                }
                else{
                    System.out.println("x1 = " + ((-b-Math.sqrt(delta))/(2*a)));
                    System.out.println("x2 = " + ((-b+Math.sqrt(delta))/(2*a)));
                }
            }
        }
        else{
            System.out.println("Error!");
        }
    }
} 