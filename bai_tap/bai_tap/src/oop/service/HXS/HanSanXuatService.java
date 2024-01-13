package oop.service.HXS;

import oop.model.HangSanXuat;
import oop.repository.HSX.HanSanXuatRepository;
import oop.repository.HSX.IHanSanXuatRepository;

import java.util.List;

public class HanSanXuatService implements IHanSanXuatService {
    private IHanSanXuatRepository hanSanXuatRepository = new HanSanXuatRepository();

    @Override
    public List<HangSanXuat> findAlll() {
        return hanSanXuatRepository.findAlll();
    }
}
