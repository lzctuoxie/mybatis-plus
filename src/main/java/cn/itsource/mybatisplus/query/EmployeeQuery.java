package cn.itsource.mybatisplus.query;


/**
 *
 * @author lzctuoxie
 * @since 2019-05-14
 */
public class EmployeeQuery extends BaseQuery {

    private String username;
    private String tel;
    private Integer state;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}