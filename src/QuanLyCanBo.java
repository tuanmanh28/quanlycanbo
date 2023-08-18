import java.util.Scanner;

public class QuanLyCanBo {

    private CanBo canbo[] = new CanBo[1000];
    private int SoLuongCanBo = 0;

    //Phương thức để tạo một cán bộ mới
    public CanBo CanBoThem(){
        CanBo cb = new CanBo();
        int Tuoi;
        byte Bac, ChucDanh;
        String HoTen, DiaChi, NganhDaoTao, GioiTinh, CongViec;
        //Nhập họ và tên cán bộ
        System.out.println("Nhập họ và tên cán bộ");
        HoTen = new Scanner(System.in).nextLine();

        //Nhập tuổi của cán bộ
        boolean KtTuoi = false;
        do {
            System.out.println("Nhập tuổi của cán bộ");
            Tuoi = new Scanner(System.in).nextInt();
            if (Tuoi > 0 && Tuoi < 200) {
                KtTuoi = true;
            }
            else {
                System.out.println("Tuổi của cán bộ không hợp lệ, vui lòng nhập lại.");
            }
        } while (!KtTuoi);

        //Nhập giới tính của cán bộ
        boolean KtGioiTinh = false;
        do {
            System.out.println("Nhập giới tính của cán bộ");
            GioiTinh = new Scanner(System.in).nextLine();
            // Kiểm tra xem dữ liệu nhập vào đã đúng chưa (Nam, Nu, Khac)
            if (GioiTinh.equals("Nam")||GioiTinh.equals("Nu")||GioiTinh.equals("Khac")){
                KtGioiTinh = true;
            }
            else {
                System.out.println("Giới tính không hợp lệ, vui lòng nhập lại.");
            }
        }while (!KtGioiTinh);

        //Nhập địa chỉ của cán bộ
        System.out.println("Nhập địa chỉ của cán bộ");
        DiaChi = new Scanner(System.in).nextLine();

        //Nhập chức danh của cán bộ
        boolean KtChucDanh = false;
        do {
            System.out.println("Chức danh của cán bộ là: (Vui lòng nhập số dưới đây) " +
                    "\n 1. Công nhân" +
                    "\n 2. Kỹ sư" +
                    "\n 3. Nhân viên");
            ChucDanh = new Scanner(System.in).nextByte();
            // Kiểm tra xem dữ liệu nhập vào đã đúng chưa (Nam, Nu, Khac)
            switch (ChucDanh){
                case 1:

                    //Nhập bậc cho công nhân
                    boolean KtBac = false;
                    do {
                        System.out.println("Nhập Bậc của công nhân");
                        Bac = new Scanner(System.in).nextByte();
                        if (Bac >= 1 && Bac <= 10) {
                            KtBac = true;
                        }
                        else {
                            System.out.println("Bậc của công nhân không hợp lệ, vui lòng nhập lại.");
                        }
                    } while (!KtBac);
                    cb = new CongNhan(HoTen, Tuoi, GioiTinh, DiaChi, Bac);
                    KtChucDanh = true;
                    break;
                case 2:

                    //Nhập ngành đào tạo của kỹ sư
                    System.out.println("Nhập ngành đào tạo của kỹ sư");
                    NganhDaoTao = new Scanner(System.in).nextLine();
                    cb = new KySu(HoTen, Tuoi, GioiTinh, DiaChi, NganhDaoTao);
                    KtChucDanh = true;
                    break;
                case 3:

                    //Nhập công việc của nhân viên
                    System.out.println("Nhập công việc của nhân viên");
                    CongViec = new Scanner(System.in).nextLine();
                    cb = new NhanVien(HoTen, Tuoi, GioiTinh, DiaChi, CongViec);
                    KtChucDanh = true;
                    break;
                default:
                    System.out.println("Chức danh của cán bộ không hợp lệ, vui lòng nhập lại.");
                    break;
            }
        }while (!KtChucDanh);
        return cb;
    }

    //Phương thức dùng để thêm cán bộ mới
    public void ThemCanBo(){
        SoLuongCanBo++;
        canbo[SoLuongCanBo] = CanBoThem();
        canbo[SoLuongCanBo].InCanBo();
    }

    //Phương thức dùng để tìm kiếm cán bộ
    public void TimCanBo(String TenCanTim){
        int SoLuongKetQua = 0;
        for(int i = 1; i <= SoLuongCanBo; i++){
            if (canbo[i].HoTen.equals(TenCanTim)){
                canbo[i].InCanBo();
                SoLuongKetQua++;
            }
        }
        System.out.println("Có "+SoLuongKetQua+" cán bộ được tìm thấy");
    }

    //Hiển thị toàn bộ các cán bộ
    public void HienThiCanBo(){
        System.out.println("Có "+SoLuongCanBo+" cán bộ trong xưởng sản xuất");
        for(int i = 1; i <= SoLuongCanBo; i++){
            canbo[i].InCanBo();
        }
    }

    //Thực hiện chương trình
    public void ThucHienChuongTrinh(){
        boolean KtYeuCau = true;
        String TenCanBoCanTim;
        int YeuCau;
        do {
            System.out.println("Yêu cầu của bạn là: (Vui lòng nhập số dưới đây) " +
                    "\n 1. Thêm cán bộ" +
                    "\n 2. Tìm cán bộ" +
                    "\n 3. Hiển thị toàn bộ cán bộ" +
                    "\n 4. Kết thúc chương trình");
            YeuCau = new Scanner(System.in).nextInt();
            switch (YeuCau){
                //Thêm cán bộ
                case 1:
                    ThemCanBo();
                    break;
                //Tìm cán bộ
                case 2:
                    System.out.println("Tên cán bộ cần tìm là: ");
                    TenCanBoCanTim = new Scanner(System.in).nextLine();
                    TimCanBo(TenCanBoCanTim);
                    break;
                //Hiển thị toàn bộ cán bộ
                case 3:
                    HienThiCanBo();
                    break;
                //Kết thúc chương trình
                case 4:
                    System.out.println("Kết thúc chương trình.");
                    KtYeuCau = false;
                    break;
                default:
                    System.out.println("Yêu cầu không hợp lệ, vui lòng nhập lại.");
                    break;
            }
        }while (KtYeuCau);
    }
}
