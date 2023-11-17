import java.util.Scanner;

public class Books {
    public String tenSach, giaBan, thuongHieu, theLoai, tacGia, nhaXB, ngayXB, ngonNgu;
    public void nhapSach() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ten sach:");
        String tenSach = sc.nextLine();
        this.tenSach = tenSach;

        System.out.println("Gia ban:");
        String giaBan = sc.nextLine();
        this.giaBan = giaBan;

        System.out.println("Thuong hieu:");
        String thuongHieu = sc.nextLine();
        this.thuongHieu = thuongHieu;

        System.out.println("The loai:");
        String theLoai = sc.nextLine();
        this.theLoai = theLoai;

        System.out.println("Tac gia:");
        String tacGia = sc.nextLine();
        this.tacGia = tacGia;

        System.out.println("Nhà xuat ban:");
        String nhaXB = sc.nextLine();
        this.nhaXB = nhaXB;

        System.out.println("Ngày xuat ban:");
        String ngayXB = sc.nextLine();
        this.ngayXB = ngayXB;

        System.out.println("Ngon ngu:");
        String ngonNgu = sc.nextLine();
        this.ngonNgu = ngonNgu;
    }
    public void hienThiSach() {
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Gia ban: " + giaBan);
        System.out.println("Thuong hieu: " + thuongHieu);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("The loai: " + theLoai);
        System.out.println("Nha xuat ban: " + nhaXB);
        System.out.println("Ngay xuat ban: " + ngayXB);
        System.out.println("Ngon ngu: " + ngonNgu);
    }
}