/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class LopHoc {
    private int ma_lop;
    private KhoaHoc khoahoc;
    private SinhVien sinhvien;
    private String ngay_dang_ky;
    private boolean trang_thai;

    public int getMa_lop() {
        return ma_lop;
    }

    public void setMa_lop(int ma_lop) {
        this.ma_lop = ma_lop;
    }

    public KhoaHoc getKhoahoc() {
        return khoahoc;
    }

    public void setKhoahoc(KhoaHoc khoahoc) {
        this.khoahoc = khoahoc;
    }

    public SinhVien getSinhvien() {
        return sinhvien;
    }

    public void setSinhvien(SinhVien sinhvien) {
        this.sinhvien = sinhvien;
    }

    public String getNgay_dang_ky() {
        return ngay_dang_ky;
    }

    public void setNgay_dang_ky(String ngay_dang_ky) {
        this.ngay_dang_ky = ngay_dang_ky;
    }

    public boolean isTrang_thai() {
        return trang_thai;
    }

    public void setTrang_thai(boolean trang_thai) {
        this.trang_thai = trang_thai;
    }

    
}
