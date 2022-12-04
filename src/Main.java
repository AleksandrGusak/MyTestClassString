public class Main {
    public static void main(String[] args) {
        PasswordChecker checker = new PasswordChecker();
        System.out.println(checker.checkPassword(""));
        System.out.println(checker.checkPassword("            "));
        System.out.println(checker.checkPassword("showrtrn"));

        Trimmed chicker = new Trimmed();
        chicker.Strimming();

        Uppering newUp = new Uppering();
        newUp.upperStream();

        Lowerring lowUp = new Lowerring();
        lowUp.lowwerinStream();

        LengthUp uppping = new LengthUp();
        uppping.lengthUpping();

        PasswordChecker checker1 = new PasswordChecker();
        checker1.checkPassword("hi");
        checker1.checkPassword("safasfdsfasfdsf");
        checker1.checkPassword("        ");
        checker1.checkPassword("");

        Blancket blancket = new Blancket();
        blancket.blancketBrunch();

        String[] parsedext = {
                "                                               I                                                   ",

                "           – Еh bien, mon prince. Gênes et Lucques ne sont plus que des apanages, des поместья, de ",

                "            la famille Buonaparte. Non, je vous préviens que si vous ne me dites pas que nous avons",

                "   la guerre, si vous vous permettez encore de pallier toutes les infamies, toutes les atrocités   ",

                "        de cet Antichrist (ma parole, j’y crois) — je ne vous connais plus, vous n’êtes plus mon   ",

                "          ami, vous n’êtes plus мой верный раб, comme vous dites[1]. Ну, здравствуйте,             ",

                "здравствуйте. Je vois que je vous fais peur[2], садитесь и рассказывайте.                          ",

                "",

                "Так говорила в июле 1805 года известная Анна Павловна Шерер, фрейлина и приближенная               ",

                "императрицы Марии Феодоровны, встречая важного и чиновного князя Василия, первого                  ",

                "приехавшего на ее вечер. Анна Павловна кашляла несколько дней, у нее был грипп, как она говорила   ",

                "(грипп был тогда новое слово, употреблявшееся только редкими). В записочках, разосланных утром     ",

                "с красным лакеем, было написано без различия во всех:                                              ",

                "                                                                                                                                                                           "
        };
        for (String str : parsedext) {
            BigText.strCleaner(str);

        }
        }
    }