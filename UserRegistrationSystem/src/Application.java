import java.util.Scanner;

public class Application {
    private Database database;
    int idCount = 0;

    public Application(Database database) {
        this.database = database;
    }

    public Application() {
    }

    public void Menu(){
        System.out.println("Yapılacak işlemi seçiniz:" +
                "\n1-Kullanıcı oluştur" +
                "\n2-Kullanıcı sil" +
                "\n3-Kullanıcıları listele");
    }
    public void CreateUser(String username, String email, String password){
        int id = idCount++;
        Users users = new Users(id,username,email,password);

        database.AddUserList(users);
    }

    public void DeleteUsers(int userId){
        database.getUsersArrayList().remove(userId);
        System.out.println("Kullanıcı Silindi." +
                "\n--------------------------");
    }

}
