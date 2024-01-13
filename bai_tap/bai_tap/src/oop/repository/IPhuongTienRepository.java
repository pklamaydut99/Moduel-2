package oop.repository;

import oop.model.PhuongTien;

import java.util.List;

public interface IPhuongTienRepository{
    List<PhuongTien> findAll();

    List<PhuongTien> searchBKS(String bienKiemSoat);

    PhuongTien findByBKS(String bienKiemSoat);
    void add(PhuongTien phuongTien);

    void delete(String bienKiemSoat);
}
