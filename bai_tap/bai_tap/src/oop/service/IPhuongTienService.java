package oop.service;

import oop.model.PhuongTien;

import java.util.List;

public interface IPhuongTienService {
    List<PhuongTien> findAll();
    List<PhuongTien> searchBKS(String bienKiemSoat);

    PhuongTien findByBKS(String bienKiemSoat);
    void add(PhuongTien phuongTien);

    void delete(String bienKiemSoat);

}
