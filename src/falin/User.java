package falin;

public class User {

    private String password;
    private String hash;
    private String salt;

    public User() {

        password = "";
        hash = "";
        salt = "";
    }

    public User(String newPassword, String newHash, String newSalt) {
        password = newPassword;
        hash = newHash;
        salt = newSalt;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String newPassword) {
        password = newPassword;
    }

    public String getHashedPassword() {
        return hash;
    }

    public void setHashedPassword(String newHash) {
        hash = newHash;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String newSalt) {
        salt = newSalt;
    }

}