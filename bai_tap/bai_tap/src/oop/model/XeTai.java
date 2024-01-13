package oop.model;

public class XeTai extends PhuongTien {
    private int taiTrong;

    public XeTai(){
    }
    public XeTai(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, int taiTrong) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.taiTrong = taiTrong;
    }

    public int gettaiTrong() {
        return taiTrong;
    }

    public void settaiTrong(int taiTrong) {
        this.taiTrong = taiTrong;
    }

    @Override
    public String toString() {
        return "XeTai{" + super.toString()+
                "taiTrong=" + taiTrong +
                '}';
    }
    public String getInfoToCSV() {
        return "oto {"+super.toString()+"soChoNgoi ="+ this.taiTrong+"}";
    }
}
