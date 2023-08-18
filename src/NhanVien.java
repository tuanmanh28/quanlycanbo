public class NhanVien extends CanBo{
    private String CongViec;

    public NhanVien(String HoTen, int Tuoi, String GioiTinh, String DiaChi, String CongViec) {
        super(HoTen, Tuoi, GioiTinh, DiaChi);
        this.CongViec = CongViec;
    }

    public String getCongViec() {
        return CongViec;
    }

    public void setCongViec(String congViec) {
        CongViec = congViec;
    }

    @Override
    public void InCanBo() {
        System.out.println("Kỹ sư "+HoTen+", "+Tuoi+" tuổi, giới tính là "+GioiTinh+", địa chỉ tại "
                + DiaChi+ ", có công việc là "+ CongViec);
    }
}
