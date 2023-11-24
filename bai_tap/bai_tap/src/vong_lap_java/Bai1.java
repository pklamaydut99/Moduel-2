package vong_lap_java;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng \n"+
                    "1.In hình chữ nhật \n"+
                    "2.In hình tam giác vuông \n"+
                    "3.In hinh tam giác cân \n"+
                    "4.Thoát");
            int chon = Integer.parseInt(sc.nextLine());
            switch (chon){
                case 1:
                    System.out.println("In hình chữ nhật");
                    for(int i = 1; i <= 5; i++){
                        for(int j = 1; j <= 10; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("In hình tam giác vuông");
                    for(int i=1; i<=5; i++) {
                        for (int j = 1; j < i; j++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("In hinh tam giác cân");
                    for(int i=7;i>=1;i--) {
                        for (int j = 1; j <= i; j++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                default:
                    flag = false;
            }
        }while (flag);
        System.out.println("end");
    }
}
