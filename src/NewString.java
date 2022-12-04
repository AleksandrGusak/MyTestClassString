public class NewString {

     String strObj;

    static void NewString() {
       String strObj = new String("test");
        String splitter = "test";

        if (strObj.equals(splitter)) {
            System.out.println("Строки strObj и splitter равны");
        } else {
            System.out.println("Строки strObj и splitter не равны");
        }

    }
}