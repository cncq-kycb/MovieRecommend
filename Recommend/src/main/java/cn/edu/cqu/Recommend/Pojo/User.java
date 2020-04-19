package cn.edu.cqu.Recommend.Pojo;

public class User extends UserKey {
    private String userPassword;

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }
}