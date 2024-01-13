package oop.service;

import oop.model.PhuongTien;
import oop.repository.IPhuongTienRepository;
import oop.repository.PhuongTienRepository;

import java.util.List;

public class PhuongTienService implements IPhuongTienService{
    private IPhuongTienRepository phuongTienRepository = new PhuongTienRepository();
    @Override
    public List<PhuongTien> findAll() {
        return phuongTienRepository.findAll();
    }

    @Override
    public List<PhuongTien> searchBKS(String bienKiemSoat) {
        return null;
    }

    @Override
    public PhuongTien findByBKS(String bienKiemSoat) {
        return phuongTienRepository.findByBKS(bienKiemSoat);
    }

    @Override
    public void add(PhuongTien phuongTien) {
        phuongTienRepository.add(phuongTien);
    }

    @Override
    public void delete(String bienKiemSoat) {
        phuongTienRepository.delete(bienKiemSoat);
    }
}
