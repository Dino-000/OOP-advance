package problem5.NoERD;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class DanhSachHoaDon {
  private ArrayList<HoaDon> danhSach;
  private int count;


  public DanhSachHoaDon(int count) {
    this.danhSach = new ArrayList<>();
    this.count = count;
  }
  //  public void DanhSachHoaDon(int number) {
  //    Scanner keyboard = new Scanner(System.in);
  //    for (int i = 0; i < number; i++) {
  //      System.out.println("Enter MaHD");
  //      String MaHD = keyboard.nextLine();
  //      System.out.println("Enter ngayHD");
  //      LocalDate ngayHD = LocalDate.parse(keyboard.nextLine());
  //      System.out.println("Enter tenKH");
  //      String tenKH = keyboard.nextLine();
  //      System.out.println("Enter maPhong");
  //      String maPhong = keyboard.nextLine();
  //      System.out.println("Enter donGia");
  //      double donGia = Double.parseDouble(keyboard.nextLine());
  //      System.out.println("a) Enter Hour receipt \nb) Enter Day Receipt");
  //      String userChoice = keyboard.nextLine();
  //      while (!userChoice.equals("a") && !userChoice.equals("b")) {
  //        System.out.println("a) Enter Hour receipt \nb) Enter Day Receipt");
  //        userChoice = keyboard.nextLine();
  //      }
  //      if (keyboard.nextLine().equals("a")) {
  //        System.out.println("Enter soGioThue");
  //        int soGioThue = Integer.parseInt(keyboard.nextLine());
  //        danhSach.add(new HoaDonGio(MaHD, ngayHD, tenKH, maPhong, donGia, soGioThue));
  //
  //      } else {
  //        System.out.println("Enter soNgayThue");
  //        int soNgayThue = Integer.parseInt(keyboard.nextLine());
  //        danhSach.add(new HoaDonNgay(MaHD, ngayHD, tenKH, maPhong, donGia, soNgayThue));
  //      }
  //    }
  //  }

  public boolean them(HoaDon hd) {
    boolean isNotExistBefore = true;
    if (danhSach.size() != 0) {
      for (HoaDon hoadon : danhSach) {
        if (hd.getMaHD().equals(hoadon.getMaHD())) {
          isNotExistBefore = false;
        }
      }
    }
    if (isNotExistBefore == true) {
      danhSach.add(hd);
      count++;
    }
    return isNotExistBefore;
  }

  public void xuat() {
    for (HoaDon hoadon : danhSach) {
      System.out.println(hoadon);
    }
  }

  public int thongKeSoLuongHDTheoGio() {
    int numberOfReceipt = 0;
    for (HoaDon hoadon : danhSach) {
      if (hoadon instanceof HoaDonGio) {
        numberOfReceipt++;
      }
    }
    return numberOfReceipt;
  }

  public int thongKeSoLuongHDTheoNgay() {
    int numberOfReceipt = 0;
    for (HoaDon hoadon : danhSach) {
      if (hoadon instanceof HoaDonNgay) {
        numberOfReceipt++;
      }
    }
    return numberOfReceipt;
  }

  public double tinhTongThanhTien(int thang, int nam) {
    double tongThanhTien = 0.0;
    for (HoaDon hoadon : danhSach) {
      if (hoadon.getNgayHD().getMonthValue() == thang && hoadon.getNgayHD().getYear() == nam)
        tongThanhTien += hoadon.ThanhTien();
    }
    return tongThanhTien;
  }
}
