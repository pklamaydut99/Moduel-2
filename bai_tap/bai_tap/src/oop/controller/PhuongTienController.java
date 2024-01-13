package oop.controller;

import oop.model.PhuongTien;
import oop.service.IPhuongTienService;
import oop.service.PhuongTienService;


import java.util.List;

public class PhuongTienController {
    private IPhuongTienService phuongTienService = new PhuongTienService();
    public List<PhuongTien> getAll(){
        return phuongTienService.findAll();
    }
    public void add(PhuongTien phuongTien){
        phuongTienService.add(phuongTien);
    }

    public String delete(String bienKiemSoat){
        PhuongTien phuongTien = phuongTienService.findByBKS(bienKiemSoat);
        if (phuongTien!= null){
            phuongTienService.delete(bienKiemSoat);
            return "Xoá thành công";
        }else {
            return "BKS không tồn tại";
        }
    }

}
