package problem5.NoERD;

import java.time.LocalDate;

public class Demo {
  public static void main(String[] args) {
    DanhSachHoaDon danhSachHoaDon = new DanhSachHoaDon(0);
    HoaDonNgay hoaDonNgay1 =new HoaDonNgay("001", LocalDate.parse("2000-01-01"),"abc","001",10,8);
    HoaDonGio hoaDonGio1 = new HoaDonGio("002", LocalDate.parse("2000-01-01"),"abc","001",10,29);
    System.out.println(danhSachHoaDon.them(hoaDonNgay1));
    System.out.println(danhSachHoaDon.them(hoaDonGio1));
    System.out.println(danhSachHoaDon.them(hoaDonGio1));
    System.out.println(hoaDonGio1.ThanhTien());
    System.out.println(hoaDonNgay1.ThanhTien());
    danhSachHoaDon.xuat();
    System.out.println("thongKeSoLuongHDTheoGio");
    System.out.println(danhSachHoaDon.thongKeSoLuongHDTheoGio());
    System.out.println("thongKeSoLuongHDTheoNgay");
    System.out.println(danhSachHoaDon.thongKeSoLuongHDTheoGio());
    System.out.println("tinhTongThanhTien");
    System.out.println(danhSachHoaDon.tinhTongThanhTien(1,2000));
  }
}
