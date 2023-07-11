import java.util.ArrayList;
import java.util.Scanner;

public class App extends Menu {
    ArrayList<HocSinh> hocsinh = new ArrayList();
    
    public App() {
        super("Quan li hoc sinh", new String[] {
            "Them hoc sinh moi",
            "Hien thi tat ca hoc sinh",
            "Hien thi ra hoc sinh co do tuoi bang 20",
            "Hien thi ra so hoc sinh co tuoi bang 22 va gioi tinh nu",
            "Thoat"
        });
        for (int i = 1; i <= 15; i++) {
            HocSinh hs = new HocSinh("Nguyen Van " + (char)(i - 1 + 'A'), 19 + i, i % 2 == 1 ? "Nam" : "Nu", "01234567" + (i < 10 ? "0" + i : i), "hs" + i + "@fu.edu.vn", "K" + i);
            hocsinh.add(hs);
        }
    }
    
    void themHocSinh() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        String hoten = scanner.nextLine();
        int tuoi;
        while (true) {
            try {
                System.out.print("Nhap tuoi: ");
                tuoi = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Tuoi phai la mot so nguyen!");
            }
        }
        String gioitinh;
        while (true) {
            System.out.print("Nhap gioi tinh (Nam/Nu): ");
            gioitinh = scanner.nextLine();
            if (gioitinh.equalsIgnoreCase("Nam") || gioitinh.equalsIgnoreCase("Nu")) {
                break;
            } else {
                System.out.println("Gioi tinh phai la Nam hoac Nu!");
            }
        }
        System.out.print("Nhap so dien thoai: ");
        String sdt = scanner.nextLine();
        String email;
        while (true) {
            System.out.print("Nhap email: ");
            email = scanner.nextLine();
            if (email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
                break;
            } else {
                System.out.println("Email khong hop le!");
            }
        }
        System.out.print("Nhap khoa: ");
        String khoa = scanner.nextLine();
        HocSinh hs = new HocSinh(hoten, tuoi, gioitinh, sdt, email, khoa);
        hocsinh.add(hs);
        System.out.println("Them hoc sinh moi thanh cong!");
    }
    
    void danhSachHocSinh() {
        for (HocSinh hs : hocsinh) System.out.println(hs);
    }
    
    void danhSachHocSinhTuoi20() {
        for (HocSinh hs : hocsinh) {
            if (hs.getTuoi() != 20) continue;
            System.out.println(hs);
        }
    }
    
    void soLuongHocSinhNuTuoi22() {
        int count = 0;
        for (HocSinh hs : hocsinh) {
            if (hs.getGioitinh().equals("Nu") && hs.getTuoi() == 22) {
                count++;
            }
        }
        System.out.println("So luong hoc sinh nu co tuoi la 22: " + count);
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                themHocSinh();
                break;
            case 2:
                danhSachHocSinh();
                break;
            case 3:
                danhSachHocSinhTuoi20();
                break;
            case 4:
                soLuongHocSinhNuTuoi22();
                break;
            default:
                System.exit(0);
        }
    }
    
    public static void main(String args[]) {
        new App().run();
    }
}
