import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    public void Sach(ArrayList<Books> books) {
        System.out.println("1. Them sach: ");
        System.out.println("2. Xoa sach: ");
        System.out.println("3. Sua sach:");
        System.out.println("4. Thoat:");
        System.out.println("Moi ban lua chon~");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if (option == 1) {
            Books sach = new Books();
            sach.nhapSach();
            books.add(sach);
            System.out.println("--> Da them sach!");
        }
        else
            if(option==2)
            {
                System.out.println("Nhap vi tri sach muon xoa");
                int index = sc.nextInt();
                books.remove(index - 1);
                System.out.println("--> Da xoa sach!");
            }
            else if(option==3)
            {
                System.out.println("Nhap vi tri sach muon sua");
                int index = sc.nextInt();
                books.remove(index - 1);
                System.out.println("--> Da sua sach!");
            }
            else
            {
                System.out.println("--> Da sua sach!");
            }
    }
}
