package example2.violation;

public class AuthManager {
    
    private String logInUser;

    public void logIn(String user, String password) {
        String h = hash(password);
        if(existsInDb(user, h)) {
            logInUser = user;
        }
    }

    public void logout() {
        logInUser = "";
    }

    public String getLogInUser() { return logInUser; }

    private String hash(String pass) {
        return "";
    }

    private boolean existsInDb(String user, String hash) {
        return false;
    }


}
