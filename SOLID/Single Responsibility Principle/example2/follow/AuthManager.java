package example2.follow;

public class AuthManager {
    
    private UserDao dao;
    private Hash hash;

    private String logInUser;

    public void logIn(String user, String password) {
        String h = hash.hash(password);
        if(dao.existsInDb(user, h)) {
            logInUser = user;
        }
    }

    public void logout() {
        logInUser = "";
    }

    public String getLogInUser() { return logInUser; }

    public void setUserDao(UserDao dao) { this.dao = dao;}

    public void setHash(Hash hash) { this.hash=hash;}

}
