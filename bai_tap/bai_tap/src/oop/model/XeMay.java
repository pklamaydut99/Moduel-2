package oop.model;

public class XeMay extends PhuongTien {
    private String congSuat;

    public XeMay(){
    }
    public XeMay(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, String congSuat) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public String getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(String congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay{" + super.toString()+
                "congSuat='" + congSuat +
                '}';
    }
    public String getInfoToCSV() {
        return "oto {"+super.toString()+"soChoNgoi ="+ this.congSuat+"}";
    }
}
