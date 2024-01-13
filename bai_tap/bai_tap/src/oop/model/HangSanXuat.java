package oop.model;

public class HangSanXuat {
    private String maHSX;
    private String tenHSX;
    private String tenQuocGia;

    public HangSanXuat() {
    }

    public HangSanXuat(String maHSX, String tenHSX, String tenQuocGia) {
        this.maHSX = maHSX;
        this.tenHSX = tenHSX;
        this.tenQuocGia = tenQuocGia;
    }

    public String getMaHSX() {
        return maHSX;
    }

    public void setMaHSX(String maHSX) {
        this.maHSX = maHSX;
    }

    public String getTenHSX() {
        return tenHSX;
    }

    public void setTenHSX(String tenHSX) {
        this.tenHSX = tenHSX;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }

    @Override
    public String toString() {
        return "HangSanXuat =" + "maHSX:'" + maHSX + ", tenHSX:'" + tenHSX  + ", tenQuocGia:'" + tenQuocGia ;
    }
}
