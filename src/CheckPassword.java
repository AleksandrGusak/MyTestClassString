public class CheckPassword extends NewString {

    public boolean checkPassword() {
       String checkOut = strObj;
        if (checkOut.isEmpty()) {
            System.out.println("Пароль отсутствует");
            return false;
        } else if (checkOut.length() < 8) {
            System.out.println("Пароль слишком короткий");
            return false;
        }
        System.out.println("Подходящий пароль");
        return false;
    }
}
