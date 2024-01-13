package oop.view;

import oop.model.*;
import oop.controller.PhuongTienController;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        PhuongTienController phuongTienController = new PhuongTienController();
        boolean flag = true;
        do {
            System.out.println(
                    "Chọn chức năng: \n" +
                            "1.Thêm mới phương tiện \n" +
                            "2. Hiện thị phương tiện \n" +
                            "3. Xóa phương tiện \n" +
                            "4. Thoát \n"
            );
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Thêm mới phương tiện");
                    PhuongTien phuongTien = inputDataPhuongTien();
                    phuongTienController.add(phuongTien);
                    System.out.println("Them moi thanh cong");
                    break;
                case 2:
                    System.out.println("Hiện thị phương tiện");
                    List<PhuongTien> phuongTienList = phuongTienController.getAll();
                    for (PhuongTien pt : phuongTienList) {
                        System.out.println(pt);
                    }
                    break;
                case 3:
                    System.out.println("Xóa phương tiện");
                    System.out.println("nhap bks can xoa");
                    String deleteBKS= scanner.nextLine();
                    String deleteMessage = phuongTienController.delete(deleteBKS);
                    System.out.println(deleteMessage);
                    break;
            }
        }
        while (flag);
        System.out.println("end");
    }

    private static PhuongTien deleteData() {
        System.out.println("nhap so thu tu phuong tien can xoa");
        int soThuTu = Integer.parseInt(scanner.nextLine());

     return null;
    }

    public static void displayPhuongTien(List<PhuongTien> phuongTiens){
        for (PhuongTien phuongtien: phuongTiens) {
            if (phuongtien!=null){
                System.out.println(phuongtien);
            }else {
                break;
            }

        }
    }
    private static PhuongTien inputDataPhuongTien() {
    PhuongTien phuongTien = null;
        // nhap thong so chung
        System.out.println("nhap BKS");
        String bienKiemSoat = scanner.nextLine();
        System.out.println(
                "chon HSX: \n" +
                        "1. HSX-001,Yamaha,Nhật Bản \n" +
                        "2. HSX-002,Honda,Nhật Bản \n" +
                        "3. HSX-003, Dongfeng,Trung Quốc \n" +
                        "4. HSX-004, Huyndai,Hàn Quốc \n"+
                        "5. HSX-005, Ford,Mỹ \n"+
                        "6. HSX-006, Toyota,Nhật Bản \n"+
                        "7. HSX-006, Hino,Nhật Bản \n"
        );
        int chooseHSX = Integer.parseInt(scanner.nextLine());
        switch (chooseHSX){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
        }
        System.out.println("nam san xuat");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap chu so huu");
        String chuSoHuu = scanner.nextLine();
        System.out.println(
                "chon phuong tien: \n" +
                        "1. Oto \n" +
                        "2. Xe may \n" +
                        "3. XeTai \n" +
                        "4. Thoát \n"
        );
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                // nhap thong so rieng
                System.out.println("Thêm mới oto");
                System.out.println("Nhap so cho ngoi");
                int soChoNgoi = Integer.parseInt(scanner.nextLine());
                System.out.println("nhap kieu xe");
                String kieuXe = scanner.nextLine();
                phuongTien = new Oto(bienKiemSoat, null, namSanXuat, chuSoHuu, soChoNgoi, kieuXe);
                break;
            case 2:
                System.out.println("Them moi xe may");
                System.out.println("Nhap cong suat");
                String congSuat = scanner.nextLine();
                XeMay xeMay = new XeMay(bienKiemSoat,null,namSanXuat,chuSoHuu,congSuat);
                return xeMay;
            case 3:
                System.out.println("Them moi xe tai");
                System.out.println("nhap tai trong");
                int taiTrong = Integer.parseInt(scanner.nextLine());
                XeTai xeTai = new XeTai(bienKiemSoat,null,namSanXuat,chuSoHuu,taiTrong);
                return xeTai;
            case 4:
                System.out.println("Thoát");
        }
        return phuongTien;
    }


}
