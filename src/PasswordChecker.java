public class PasswordChecker {

    public boolean checkPassword(String pwd) {
        if (pwd.isEmpty()) {
            System.out.println("Пароль отсутствует");
            return false;
        } else if (pwd.length() < 8) {
            System.out.println("Пароль слишком короткий");
            return false;
        }
        System.out.println("Подходящий пароль");
        return true;
    }
}