public class CongNhan extends CanBo{
    private int Bac;

    public CongNhan(String HoTen, int Tuoi, String GioiTinh, String DiaChi, int Bac) {
        super(HoTen, Tuoi, GioiTinh, DiaChi);
        this.Bac = Bac;
    }

    public int getBac() {
        return Bac;
    }

    public void setBac(int bac) {
        Bac = bac;
    }


    @Override
    public void InCanBo() {
        System.out.println("Công nhân "+HoTen+", "+Tuoi+" tuổi, giới tính là "+GioiTinh+", địa chỉ tại "
                + DiaChi + ", có bậc là "+Bac);
    }
}
