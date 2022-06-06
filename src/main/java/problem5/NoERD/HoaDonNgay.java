package problem5.NoERD;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
//@AllArgsConstructor
public class HoaDonNgay extends HoaDon {


  public HoaDonNgay(String maHD, LocalDate ngayHD, String tenKH, String maPhong, double donGia, int soLuongThue) {
    super(maHD, ngayHD, tenKH, maPhong, donGia, soLuongThue);
  }



  @Override
  public String toString() {
    return "HoaDonNgay{" +super.toString()+
            "soNgayThue=" + super.getSoLuongThue() +
            '}';
  }

  @Override
  public double ThanhTien() {
    if (super.getSoLuongThue() > 7) {
      return 7 * super.getDonGia() + ((super.getSoLuongThue() - 7) * super.getDonGia() * .8);
    } else {
      return super.getDonGia() * super.getSoLuongThue();
    }
  }
}
