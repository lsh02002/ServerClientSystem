import java.io.Serializable;

public class UserDTO implements Serializable {
    private String username;
    private String role;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public UserDTO(String username, String role) {
        this.username = username;
        this.role = role;
    }

    @Override
    public String toString() {
        return username + ',' + role;
    }
}
