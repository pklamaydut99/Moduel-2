package vong_lap_java;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n =");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("%d số nguyên tố đầu tiên là: \n"+n);
        int dem = 0; //dem so nguyen to
        int i = 2; // tim so nguyen so bat dau tu 2
        while (dem<n){
            if (timSoNguyenTo(i)){
                System.out.println(i+"");
                dem++;
            }
            i++;
        }
    }

    public static boolean timSoNguyenTo(int n){
        // n < 2 khong phai so nguyen to
        if (n<2){
            return false;
        }
        // check snt khi n>=2
        int kiemTra = (int) Math.sqrt(n);
        for (int i =2; i <= kiemTra; i++){
            if (n % i ==0 ){
                return false;
            }
        }
        return true;
    }
}
