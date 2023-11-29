package lop_va_doi_tuong;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        double a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a");
         a = Integer.parseInt(sc.nextLine());
        System.out.println("nhap b");
         b = Integer.parseInt(sc.nextLine());
        System.out.println("nhap c");
         c = Integer.parseInt(sc.nextLine());
        QuadraticEquation equation = new QuadraticEquation(a,b,c);
        double delta = equation.getDiscriminant();

        if (delta > 0){
            double root1 = equation.getRoot1();
            double root2 = equation.getRoot2();
            System.out.println("phuong trinh co 2 nghiem");
            System.out.println("nghiem 1 la:"+ root1);
            System.out.println("nghiem 2 la:"+ root2);
        }else if(delta == 0){
            double root1 = equation.getRoot1();
            System.out.println("phuong trinh co nghiem kep"+root1);
        }else {
            System.out.println("phuong trinh vo nghiem");
        }
    }
    public static class QuadraticEquation {
        private double a;
        private double b;
        private double c;

        public QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getA() {
            return a;
        }

        public double getB() {
            return b;
        }

        public double getC() {
            return c;
        }

        public double getDiscriminant(){
            return b*b-4*a*c;
        }
        public double getRoot1(){
            double discriminant = getDiscriminant();
            if (discriminant >=0){
                return (-b + Math.sqrt(b * b - 4 * a * c) / (2 * a));
            }else {
                return 0;
            }
        }
        public double getRoot2(){
            double discriminant = getDiscriminant();
            if (discriminant >=0){
                return (-b - Math.sqrt(b * b - 4 * a *c) / (2 * a));
            }else {
                return 0;
            }
        }
    }
}
