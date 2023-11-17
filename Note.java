import java.util.Scanner;

public class Note {
        Scanner sc = new Scanner(System.in);
        public String tenVo, giaBan, thuongHieu, soTrang, loaiVo, mauBia, chatGiay, kichThuoc;
        public void nhapTTVoGhi(Scanner sc) {
            System.out.println("Ten vo ghi:");
            String tenVG = sc.nextLine();
            this.tenVo = tenVG;
            System.out.println("Gia ban:");
            String giaBan = sc.nextLine();
            this.giaBan = giaBan;
            System.out.println("Thuong hieu:");
            String thuongHieu = sc.nextLine();
            this.thuongHieu = thuongHieu;
            System.out.println("So trang:");
            String soTrang = sc.nextLine();
            this.soTrang = soTrang;
            System.out.println("Loai vo:");
            String loaiVo = sc.nextLine();
            this.loaiVo = loaiVo;
            System.out.println("Mau sac:");
            String mauBia = sc.nextLine();
            this.mauBia = mauBia;
            System.out.println("Chất liệu giấy:");
            String chatGiay = sc.nextLine();
            this.chatGiay = chatGiay;
            System.out.println("Kich thuoc:");
            String kichThuoc = sc.nextLine();
            this.kichThuoc = kichThuoc;
        }
        public void hienThiVoGhi() {
            System.out.println("Ten vo ghi: " + tenVo);
            System.out.println("Gia ban: " + giaBan);
            System.out.println("Thuong hieu: " + thuongHieu);
            System.out.println("So trang: " + soTrang);
            System.out.println("Loai vo: " + loaiVo);
            System.out.println("Mau sac baa: " + mauBia);
            System.out.println("Chat lieu giay: " + chatGiay);
            System.out.println("Kich thuoc: " + kichThuoc);
        }
}
