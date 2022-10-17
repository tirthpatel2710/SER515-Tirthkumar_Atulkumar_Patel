public class UserInfoItem
{
    private String Username;
    private String Password;
    private int Usertype;
    UserInfoItem(String Username, String Password,int Usertype)
    {
        this.Username = Username;
        this.Password = Password;
        this.Usertype = Usertype;
    }

    public int getUsertype() {
        return Usertype;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }
}
