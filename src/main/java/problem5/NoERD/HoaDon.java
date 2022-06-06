package problem5.NoERD;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class HoaDon {
    private  String maHD;
    private LocalDate ngayHD;
    private String tenKH;
    private  String maPhong;
    private  double donGia;
    private int soLuongThue;
    public double ThanhTien() {
        return soLuongThue*donGia;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HoaDon)) return false;
        HoaDon hoaDon = (HoaDon) o;
        return maHD.equals(hoaDon.maHD);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maHD);
    }

    @Override
    public String toString() {
        return
                "maHD='" + maHD + '\'' +
                ", ngayHD=" + ngayHD +
                ", tenKH='" + tenKH + '\'' +
                ", maPhong='" + maPhong + '\'' +
                ", donGia=" + donGia ;
    }
}
