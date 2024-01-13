package oop.repository.HSX;

import oop.model.HangSanXuat;
import oop.service.HXS.HanSanXuatService;
import oop.service.HXS.IHanSanXuatService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HanSanXuatRepository implements IHanSanXuatRepository {
    private IHanSanXuatService hanSanXuatService = new HanSanXuatService();

    public static List<HangSanXuat> hangSanXuats = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);

    static {
        hangSanXuats.add(new HangSanXuat("HSX-001","Yamaha","Nhật Bản"));
        hangSanXuats.add(new HangSanXuat("HSX-002","Honda","Nhật Bản"));
        hangSanXuats.add(new HangSanXuat("HSX-003","Dongfeng","Trung Quốc"));
        hangSanXuats.add(new HangSanXuat("HSX-004","Huyndai","Hàn Quốc"));
        hangSanXuats.add(new HangSanXuat("HSX-005","Ford","Mỹ"));
        hangSanXuats.add(new HangSanXuat("HSX-006","Toyota","Nhật Bản"));
        hangSanXuats.add(new HangSanXuat("HSX-006","Hino","Nhật Bản"));
    }

    @Override
    public List<HangSanXuat> findAlll() {
        return hanSanXuatService.findAlll();
    }
}
