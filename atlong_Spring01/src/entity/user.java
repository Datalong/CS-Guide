package entity;

/**
 * @Auther: Datalong
 * @Date: 2021/5/22 - 05 -22 -16:28
 * @Dscription: model
 * @version: 1.0
 */
public class user {
    private Integer id;
    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
