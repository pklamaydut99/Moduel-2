package java_introduction;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời Bạn Nhập Số Tiền USD");
        usd = sc.nextDouble();
        double quydoi=usd * 23000;
        System.out.println("Gia tri VND:"+quydoi);
    }
}
