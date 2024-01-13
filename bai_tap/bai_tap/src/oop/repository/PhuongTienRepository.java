package oop.repository;

import oop.model.*;
import oop.utill.ReadAndWritePhuongTien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhuongTienRepository implements IPhuongTienRepository {

    private final String PHUONGTIEN_FILE ="E:\\codegym\\Moduel-2\\bai_tap\\bai_tap\\src\\oop\\data\\phuongtien.csv";
    public static List<PhuongTien> phuongTiens = new ArrayList<>();


    static Scanner scanner = new Scanner(System.in);

//    static {
//        phuongTiens.add(new XeMay("47l1-213","yamaha",2001,"Nguyen","150c"));
//        phuongTiens.add(new Oto("ab-123","yamaha",2021,"nguyen1",4,"Xe Khach"));
//        phuongTiens.add(new XeTai("XT-2001","yamaha",2024,"khoi nguyen",1000));
//
//    }
    @Override
    public List<PhuongTien> findAll() {
        // doc file
        List<String> stringList = new ArrayList<>();
        List<PhuongTien> phuongTienList = new ArrayList<>();
        stringList = ReadAndWritePhuongTien.readFromCSV(PHUONGTIEN_FILE);
        String[] array = null;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            PhuongTienCon phuongTienCon = new PhuongTienCon(array[0],array[1],Integer.parseInt(array[2]),array[3]);
            phuongTienList.add(phuongTienCon);
        }
        return phuongTienList;
    }

    @Override
    public List<PhuongTien> searchBKS(String bienKiemSoat) {
        return null;
    }

    @Override
    public PhuongTien findByBKS(String bienKiemSoat) {
        List<PhuongTien> phuongTienList = findAll();
        for (int i = 0; i < phuongTienList.size(); i++){
            if (phuongTienList.get(i).getBienKiemSoat()== bienKiemSoat){
                return phuongTienList.get(i);
            }
        }
        return null;
    }

    @Override
    public void add(PhuongTien phuongTien) {
        ReadAndWritePhuongTien.writeListToFileCSV2(PHUONGTIEN_FILE, phuongTien.getInfoToCSV(),true);
    }

    @Override
    public void delete(String bienKiemSoat) {
        List<PhuongTien> phuongTienList = findAll();
        for (int i = 0; i < phuongTienList.size(); i++) {
            if (phuongTienList.get(i).getBienKiemSoat()==bienKiemSoat){
                phuongTienList.remove(i);
            }
        }
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < phuongTienList.size(); i++) {
            ReadAndWritePhuongTien.writeListToFileCSV2(PHUONGTIEN_FILE,phuongTienList.get(i).getInfoToCSV(),false);
        }
    }


}
