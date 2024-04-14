import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        Application application = new Application(database);
        Scanner sc = new Scanner(System.in);

        while (true){
            application.Menu();
            int islem = sc.nextInt();
            sc.nextLine();

            switch (islem){
                case 1:
                    System.out.println("Kullanıcı adını girinz:");
                    String username = sc.nextLine();
                    System.out.println("Email adresini giriniz:");
                    String email = sc.nextLine();
                    System.out.println("Password giriniz:");
                    String password = sc.nextLine();
                    application.CreateUser(username,email,password);
                    break;
                case 2:
                    System.out.println("Silinecek kullanıcı id'sini giriniz.");
                    try {
                        int deleteId = sc.nextInt();
                        application.DeleteUsers(deleteId);
                    }catch (IndexOutOfBoundsException indexOutOfBoundsException){
                        System.err.println("Kullanıcı id'si bulunamadı");
                    }
                    break;
                case 3:
                    System.out.println("Kullanıcılar listeleniyor...");
                    database.getUsersArrayListConsole();
                    break;
            }

        }
    }
}