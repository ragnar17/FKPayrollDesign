package SourceCode.config;

public class mysql {
    private final static String url = "jdbc:mysql://localhost:3306/db";
    private final static String user = "ragnar";
    private final static String password = "amit";

    public static String getUrl() {
        return url;
    }
    public static String getUser() {
        return user;
    }
    public static String getPassword() {
        return password;
    }
}
