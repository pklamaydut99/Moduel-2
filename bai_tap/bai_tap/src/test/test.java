package test;

import java.util.ArrayList;
import java.util.Scanner;

abstract class PhuongTien {
    private String bienKiemSoat;
    private String hangSanXuat;
    private int namSanXuat;
    private String chuSoHuu;

    public PhuongTien(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    public abstract void nhapThongTin(Scanner scanner);

    public abstract void hienThiThongTin();

    public abstract String loaiPhuongTien();
}

class XeTai extends PhuongTien {
    private int taiTrong;

    public XeTai(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, int taiTrong) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.taiTrong = taiTrong;
    }

    public int getTaiTrong() {
        return taiTrong;
    }

    public void setTaiTrong(int taiTrong) {
        this.taiTrong = taiTrong;
    }

    @Override
    public void nhapThongTin(Scanner scanner) {
        System.out.print("Nhập tải trọng: ");
        taiTrong = scanner.nextInt();
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Loại phương tiện: Xe tải");
        System.out.println("Biển kiểm soát: " + getBienKiemSoat());
        System.out.println("Hãng sản xuất: " + getHangSanXuat());
        System.out.println("Năm sản xuất: " + getNamSanXuat());
        System.out.println("Chủ sở hữu: " + getChuSoHuu());
        System.out.println("Tải trọng: " + taiTrong);
    }

    @Override
    public String loaiPhuongTien() {
        return "Xe tải";
    }
}

class Oto extends PhuongTien {
    private String kieuXe;
    private int soChoNgoi;

    public Oto(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, String kieuXe, int soChoNgoi) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.kieuXe = kieuXe;
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    @Override
    public void nhapThongTin(Scanner scanner) {
        System.out.print("Nhập kiểu xe: ");
        kieuXe = scanner.nextLine();
        System.out.print("Nhập số chỗ ngồi: ");
        soChoNgoi = scanner.nextInt();
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Loại phương tiện: Ôtô");
        System.out.println("Biển kiểm soát: " + getBienKiemSoat());
        System.out.println("Hãng sản xuất: " + getHangSanXuat());
        System.out.println("Năm sản xuất: " + getNamSanXuat());
        System.out.println("Chủ sở hữu: " + getChuSoHuu());
        System.out.println("Kiểu xe: " + kieuXe);
        System.out.println("Số chỗ ngồi: " + soChoNgoi);
    }

    @Override
    public String loaiPhuongTien() {
        return "Ôtô";
    }
}

class QuanLyPhuongTien {
    private ArrayList<PhuongTien> danhSachPhuongTien;

    public QuanLyPhuongTien() {
        danhSachPhuongTien = new ArrayList<>();
    }

    public void themPhuongTien(Scanner scanner) {
        System.out.print("Chọn loại phương tiện (1 - Ôtô, 2 - Xe tải): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng new line sau khi đọc số nguyên

        System.out.print("Nhập biển kiểm soát: ");
        String bienKiemSoat = scanner.nextLine();
        System.out.print("Nhập hãng sản xuất: ");
        String hangSanXuat = scanner.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        int namSanXuat = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng new line sau khi đọc số nguyên
        System.out.print("Nhập chủ sở hữu: ");
        String chuSoHuu = scanner.nextLine();

        if (choice == 1) {
            System.out.print("Nhập kiểu xe: ");
            String kieuXe = scanner.nextLine();
            System.out.print("Nhập số chỗ ngồi: ");
            int soChoNgoi = scanner.nextInt();

            Oto oto = new Oto(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, kieuXe, soChoNgoi);
            danhSachPhuongTien.add(oto);
        } else if (choice == 2) {
            System.out.print("Nhập tải trọng: ");
            int taiTrong = scanner.nextInt();

            XeTai xeTai = new XeTai(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, taiTrong);
            danhSachPhuongTien.add(xeTai);
        } else {
            System.out.println("Lựa chọn không hợp lệ!");
        }
    }

    public void hienThiDanhSachPhuongTien() {
        if (danhSachPhuongTien.isEmpty()) {
            System.out.println("Danh sách phương tiện rỗng.");
        } else {
            System.out.println("Danh sách phương tiện:");
            for (PhuongTien phuongTien : danhSachPhuongTien) {
                phuongTien.hienThiThongTin();
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyPhuongTien quanLyPhuongTien = new QuanLyPhuongTien();

        boolean running = true;
        while (running) {
            System.out.println("====== Quản lý phương tiện giao thông ======");
            System.out.println("1. Thêm phương tiện");
            System.out.println("2. Hiển thị danh sách phương tiện");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            int choice = scanner.nextInt();

            scanner.nextLine(); // Đọc bỏ dòng new line sau khi đọc số nguyên

            switch (choice) {
                case 1:
                    quanLyPhuongTien.themPhuongTien(scanner);
                    break;
                case 2:

            }
        }
    }
}