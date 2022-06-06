package problem5.NoERD;

import java.time.LocalDate;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        String menu = "Hay chon 1 trong cac lua chon sau:\n" +
                "1)them 1 hoa don.\n" +
                "2)Xuat hoa don theo dang bang.\n" +
                "3)Thong Ke So Luong HD Theo Gio.\n" +
                "4)Thong Ke So Luong HD Theo Ngay\n" +
                "5)Tinh Tong Thanh Tien\n" +
                "6)Exit.";
        DanhSachHoaDon danhSachHoaDon = new DanhSachHoaDon(0);
        Scanner keyboard = new Scanner(System.in);
        HoaDonNgay hoaDonNgay1 = new HoaDonNgay("001", LocalDate.parse("2000-01-01"), "abc", "001", 10, 8);
        HoaDonGio hoaDonGio1 = new HoaDonGio("002", LocalDate.parse("2000-01-01"), "abc", "001", 10, 29);
        danhSachHoaDon.them(hoaDonGio1);
        danhSachHoaDon.them(hoaDonGio1);

        int userChoice = 0;
        while (userChoice != 6) {
            System.out.println(menu);
            userChoice = Integer.parseInt(keyboard.nextLine());
            while (userChoice < 1 || userChoice > 6) {
                System.out.println("Invalid input");
                System.out.println(menu);
                userChoice = Integer.parseInt(keyboard.nextLine());
            }
            switch (userChoice) {
                case 1:
                    danhSachHoaDon.them(danhSachHoaDon.NhapHoaDon());
                    break;
                case 2:
                    danhSachHoaDon.xuat();
                    break;
                case 3:
                    System.out.println("thong Ke So Luong HD Theo Gio");
                    System.out.println(danhSachHoaDon.thongKeSoLuongHDTheoGio());
                    break;
                case 4:
                    System.out.println("thong Ke So Luong HD Theo Ngay");
                    System.out.println(danhSachHoaDon.thongKeSoLuongHDTheoGio());
                    break;
                case 5:
                    System.out.println("tinhTongThanhTien");
                    System.out.println("Hay nhap Thang");
                    int thang = Integer.parseInt(keyboard.nextLine());
                    System.out.println("Hay nhap nam");
                    int nam = Integer.parseInt(keyboard.nextLine());
                    danhSachHoaDon.tinhTongThanhTien(thang, nam);
                    break;
                case 6:
                    break;
            }
        }
        System.out.println(menu);
    }
}
