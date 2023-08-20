package models;

import java.util.Objects;

public class User {

    private String userName;
    private String password;

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getUserName(), user.getUserName()) && Objects.equals(getPassword(), user.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserName(), getPassword());
    }

    public static class Builder {
        private User mUser;

        public Builder() {
            this.mUser = new User();
        }

        public Builder withUserName(String userName) {
            mUser.userName = userName;
            return this;
        }

        public Builder withPassword(String password) {
            mUser.password = password;
            return this;
        }

        public User build() {
            return mUser;
        }
    }
}
