public class KySu extends CanBo{
    private String NganhDaoTao;

    public KySu(String HoTen, int Tuoi, String GioiTinh, String DiaChi, String NganhDaoTao) {
        super(HoTen, Tuoi, GioiTinh, DiaChi);
        this.NganhDaoTao = NganhDaoTao;
    }

    public String getNganhDaoTao() {
        return NganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        NganhDaoTao = nganhDaoTao;
    }

    @Override
    public void InCanBo() {
        System.out.println("Kỹ sư "+HoTen+", "+Tuoi+" tuổi, giới tính là "+GioiTinh+", địa chỉ tại "
                + DiaChi+ ", có Ngành đào tạo là "+NganhDaoTao);
    }
}
