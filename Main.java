import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Books> books = new ArrayList<>();
        ArrayList<Pencil> pencils = new ArrayList<>();
        ArrayList<Note> notes = new ArrayList<>();

        Admin admin = new Admin();

        Scanner sc = new Scanner(System.in);
        System.out.println("1. ADMIN");
        System.out.println("2. GUEST");
        System.out.println("Bạn hãy nhấn phím để chọn");
        while (true) {
            int option = sc.nextInt();
            if (option == 1) {
                System.out.println("Ban da dang nhap thanh cong tai khoan admin");
                System.out.println("1. Sach: ");
                System.out.println("2. Bút chi.");
                System.out.println("3. Bút muc.");
                System.out.println("4. Vo ghi.");
                System.out.println("5. Thoat");
                System.out.println("Moi ban lua chon");
                int selection = sc.nextInt();
                if (selection == 1) {
                    admin.Sach(books);
                }
            }
            else
            {
                System.out.println("Ban da dang nhap thanh cong tai khoan khach");
                System.out.println("1. Xem danh sach.");
                System.out.println("2. Thoat");
                System.out.println("Moi ban lua chon");
                int selection = sc.nextInt();
                if(selection==1)
                {
                    Timkiem(books);
                }
            }
        }
    }
}