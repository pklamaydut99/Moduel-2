package student_management;

import access_modifier_static_method_static_property.bai2.Student;
import com.sun.javafx.iio.gif.GIFImageLoaderFactory;

import java.util.Arrays;
import java.util.Scanner;

public class StudenManager {
    // biet static
    public static Studentt[] studentts = new Studentt[10];
    static Scanner scanner = new Scanner(System.in);

    static {
        studentts[0] = new Studentt(0, "nguyen");
        studentts[1] = new Studentt(1, "nguyen1");
        studentts[2] = new Studentt(2, "nguyen2");

    }

    public static void main(String[] args) {
        StudenManager studenManager = new StudenManager();
        boolean flag = true;
        do {
            System.out.println("chon chuc nang \n" +
                    "1.danh sach \n" +
                    "2.them \n" +
                    "3.sua \n" +
                    "4.xoa \n"+
                    "5.tim kiem"
            );
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("hien thi danh sach");
                    studenManager.showList();
                    break;
                case 2:
                    System.out.println("them");
                    studenManager.add();
                    break;
                case 3:
                    System.out.println("sua");
                    studenManager.update();
                    break;
                case 4:
                    System.out.println("xoa");
                    studenManager.delete();
                    break;
                case 5:
                    System.out.println("tim kiem");
                    studenManager.search();
                    break;
            }
        } while (flag);
        System.out.println("end");
    }

    public void showList() {
        for (int i = 0; i < studentts.length; i++) {
            if (studentts[i] != null) {
                System.out.println(studentts[i]);
            }
        }
    }
    public void add() {
        System.out.println("nhap id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap ten");
        String name = scanner.nextLine();
        Studentt newStudentt = new Studentt(id, name);
        for (int i = 0; i < studentts.length; i++) {
            if (studentts[i] == null) {
                studentts[i] = newStudentt;
                break;
            }
        }
    }
    public void update() {
        System.out.println("nhap id can sua");
        int editId= Integer.parseInt(scanner.nextLine());
        int indexUpdate =-1;
        for (int i = 0; i < studentts.length; i++) {
            if (studentts[i]!=null){
                if (studentts[i].getId() == editId) {
                    indexUpdate =i;
                    break;
                }
            }
        }
        if (indexUpdate!=-1){
            System.out.println("nhap ten can sua");
            String editName = scanner.nextLine();
            studentts[indexUpdate].setName(editName);
        }else {
            System.out.println("Khong tim thay");
        }
        System.out.println(Arrays.toString(studentts));

    }

    public void delete() {
        System.out.println("nhap id can xoa");
        int id = Integer.parseInt(scanner.nextLine());
        int indexDelete =-1;
        for (int i = 0; i < studentts.length; i++) {
            if (studentts[i]!=null){
                if (studentts[i].getId() == id) {
                    indexDelete =i;
                    break;
                }
            }
        }
        if (indexDelete!=-1){
            for (int j = indexDelete; j < studentts.length - 1; j++) {
                studentts[j] = studentts[j + 1];
            }
            studentts[studentts.length - 1] = null;
        }else {
            System.out.println("Khong tim thay");
        }
        System.out.println(Arrays.toString(studentts));
    }
    public void search(){
        System.out.println("nhap id can tim kiem");
        int searchId= Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < studentts.length; i++) {
            if (studentts[i]!=null){
                if (studentts[i].getId() == searchId) {
                    System.out.println(studentts[i]);
                    break;
                }
            }else {
                System.out.println("khong tim thay id");
            }
        }
    }
}

