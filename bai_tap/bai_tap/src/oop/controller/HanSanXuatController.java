package oop.controller;

import oop.model.HangSanXuat;
import oop.service.HXS.HanSanXuatService;
import oop.service.HXS.IHanSanXuatService;

import java.util.List;

public class HanSanXuatController {
    private IHanSanXuatService hanSanXuatService = new HanSanXuatService();
    public List<HangSanXuat> getAll(){
        return hanSanXuatService.findAlll();
    }
}
