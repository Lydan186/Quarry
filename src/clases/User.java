package clases;

/*
Esta clase hereda de la clase persona, en esta clase se encuentran los objetos
de un usuario, además se encuentra el ToString y los metodos get y set.
 */
public class User extends Person {

    private String userName;

    private String password;

    public String toStrin() {
        return "User{" + "userName=" + userName + ", password="
                + password + '}';
    }

    public User() {
    }

    public User(String userName, String addres) {
        this.userName = userName;
        this.password = addres;
    }

    public User(String userName, String password, String name, String addres,
            String phone, String DNI) {
        super(name, addres, phone, DNI);
        this.userName = userName;
        this.password = password;

    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return super.toString() + "User{" + "userName=" + userName
                + ", password=" + password + '}';
    }

    public void login() {
    }
}
