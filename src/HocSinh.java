public class HocSinh {
    private String hoten;
    private int tuoi;
    private String gioitinh;
    private String sdt;
    private String email;
    private String khoa;

    public HocSinh(String hoten, int tuoi, String gioitinh, String sdt, String email, String khoa) {
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.gioitinh = gioitinh;
        this.sdt = sdt;
        this.email = email;
        this.khoa = khoa;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    @Override
    public String toString() {
        return String.format("Ho va ten: %s. Tuoi: %d. Gioi tinh: %s. So dien thoai: %s. Email: %s. Khoa: %s.", hoten, tuoi, gioitinh, sdt, email, khoa);
    }
}
