package model;

/**
 * User: Bogdan
 * Date: 25.08.14
 * Time: 18:04
 */

import javax.ws.rs.QueryParam;

import static helpers.Assert.require;

public final  class LoginData {


    private  String login;
    private  String password;

    public LoginData(
            @QueryParam("login") final String login,
            @QueryParam("password") final String password) {

        require(login != null, "login", login);
        require(password != null, "password", password);

        this.login = login;
        this.password = password;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LoginData() {
    }
}
