import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Users> usersArrayList;

    public Database() {
        this.usersArrayList = new ArrayList<>();
    }

    public void AddUserList(Users users){
        usersArrayList.add(users);
        System.out.println("Kullanıcı eklendi.");
    }

    public void getUsersArrayListConsole() {
        for (Users users: usersArrayList){
            System.out.println("Id:" +users.getId()+
                    "\nİsim:" + users.getUsername()+
                    "\nEmail:" + users.getEmail()+
                    "\nŞifre:" + users.getPassword());

        }
    }

    public List<Users> getUsersArrayList() {
        return usersArrayList;
    }


}
