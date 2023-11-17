import java.util.Scanner;

public class Pencil {
        Scanner sc = new Scanner(System.in);
        public String tenbut, giaBan, thuongHieu, mauSac, chatLieu, doCung;
        public void nhapTTButChi(Scanner sc) {
            System.out.println("Ten but chi:");
            String tenbut = sc.nextLine();
            this.tenbut = tenbut;

            System.out.println("Gia ban:");
            String giaBan = sc.nextLine();
            this.giaBan = giaBan;

            System.out.println("Thuong hieu:");
            String thuongHieu = sc.nextLine();
            this.thuongHieu = thuongHieu;

            System.out.println("Mau sac:");
            String mauSac = sc.nextLine();
            this.mauSac = mauSac;

            System.out.println("Chat lieu:");
            String chatLieu = sc.nextLine();
            this.chatLieu = chatLieu;

            System.out.println("Đo cung:");
            String doCung = sc.nextLine();
            this.doCung = doCung;
        }
        public void hienThiButChi() {
            System.out.println("Ten but chi: " + tenbut);
            System.out.println("Gia ban: " + giaBan);
            System.out.println("Thuong hieu: " + thuongHieu);
            System.out.println("Mau sac: " + mauSac);
            System.out.println("Chat lieu: " + chatLieu);
            System.out.println("Đo cung: " + doCung);
        }
}
