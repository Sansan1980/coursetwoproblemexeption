
public class Main {
    public static void main(String[] args) {
        checkLoginPassword("login", "asdafsfbsjskfb", "password");
    }

    public static void checkLoginPassword(String login,String password,String confirmPassword) {
        if (login.length() > 20) {
            throw new WrongLoginException("Слишком длинный логин");
        }
        if (!login.matches("[a-zA-Z0-9_]+")) {
            throw new WrongLoginException("Недопустимый символ");
        }


    }
}