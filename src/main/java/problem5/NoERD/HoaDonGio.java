package problem5.NoERD;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
//@AllArgsConstructor
public class HoaDonGio extends HoaDon {


  public HoaDonGio(String maHD, LocalDate ngayHD, String tenKH, String maPhong, double donGia, int soLuongThue) {
    super(maHD, ngayHD, tenKH, maPhong, donGia, soLuongThue);
  }

  @Override
  public double ThanhTien() {
    if (super.getSoLuongThue() < 24) {
      return super.getDonGia() * super.getSoLuongThue();
    } else if (super.getSoLuongThue() < 30) {
      return super.getDonGia() * 24;
    } else {
      throw new UnsupportedOperationException();
    }
  }

  @Override
  public String toString() {
    return "HoaDonGio{" +super.toString()+
            "soGioThue=" + super.getSoLuongThue() +
            '}';
  }
}
