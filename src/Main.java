
public class Main {
    public static void main(String[] args) {
        try {
            checkLoginPassword("lotyhsrtyxfhs", "12456789", "12222222222222223456789");
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
        }
    }

    public static void checkLoginPassword(String login,String password,String confirmPassword) {
        if (login.length() > 20) {
            throw new WrongLoginException("Слишком длинный логин");
        }
        if (!login.matches("[a-zA-Z0-9_]+")) {
            throw new WrongLoginException("Недопустимый символ");
        }
        if (password.length() > 20) {
            throw new WrongPasswordException("Слишком длинный пароль");
        }
        if (!password.matches("[a-zA-Z0-9_]+")) {
            throw new WrongPasswordException("Недопустимый  символ");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException(" пароли неодинаковы");

        }


    }
}