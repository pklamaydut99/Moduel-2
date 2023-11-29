package mang_phuong_thuc_java;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "NGUYENN1";
        System.out.println("nhap ky tu can dem");
        char dem = scanner.next().charAt(0);

        int count =0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == dem){
                count++;
            }
        }
        System.out.println("so lan suat hien cua ky tu "+dem+" la:"+count);
    }
}
