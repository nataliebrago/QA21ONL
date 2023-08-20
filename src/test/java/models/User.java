package models;

import java.util.Objects;

public class User {
    private String username;
    private String username1;
    private String password;
    private String password1;
    private String email;
    private String code;

    public User() {
    }

    public String getUsername() {
        return username;
    }
    public String getUsername1() {
        return username1;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void setUsername1(String username1) {
        this.username1 = username1;
    }

    public String getPassword() {
        return password;
    }
    public String getPassword1() {
        return password1;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) && Objects.equals(password, user.password) && Objects.equals(email, user.email) && Objects.equals(username1, user.username1) && Objects.equals(password1, user.password1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, username1, password, password1, email);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", username1='" + username1 + '\'' +
                ", password1='" + password1 + '\'' +
                '}';
    }
}