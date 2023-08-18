public class CanBo {
    protected String HoTen;
    protected int Tuoi;
    protected String GioiTinh;
    protected String DiaChi;

    public CanBo() {
    }

    public CanBo(String HoTen, int Tuoi, String GioiTinh, String DiaChi) {
        this.HoTen = HoTen;
        this.Tuoi = Tuoi;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        GioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public void InCanBo(){
        System.out.println("Cán bộ "+HoTen+", "+Tuoi+" tuổi, giới tính là "+GioiTinh+", có địa chỉ tại "+ DiaChi);
    }
}
