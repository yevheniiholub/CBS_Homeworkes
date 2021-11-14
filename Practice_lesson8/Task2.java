package Practice_lesson8;

import java.util.Scanner;

public class Task2 {
    /*
     * Перегрузка зчитування строки від юзера
     */
    public static String getUserinfo(){
        Scanner  userInput = new Scanner(System.in);
        return userInput.nextLine();
    }

    /*
     * Перегрузка зчитування цілочисленного значення від юзера
     */
    public static int getUserinfo(int i){
        Scanner  userInput = new Scanner(System.in);
        return userInput.nextInt();
    }

    /*
     * Перегрузка перевірки інформації користувача: логін
     */
    public static int checkUserInfo(String argName){
        final String    REG_NAME = "Evgeniy";
        final int       NAME_RATE = 10;

        if (argName.equals(REG_NAME)) {
            return NAME_RATE;
        }
        return 0;
    }

    /*
     * Перегрузка перевірки інформації користувача: пароль і дата народження
     */
    public static int checkUserInfo(String argPassword, int argBirthDate ){
        final String REG_PASS = "qwerty";
        final int REG_BIRTH_DATE = 29071996;
        final int PASS_RATE = 15;
        final int BIRTH_DATE_RATE = 15;
        int result = 0;

        if (argPassword.equals(REG_PASS)){
            result += PASS_RATE;
        }
        if (argBirthDate == REG_BIRTH_DATE){
            result += BIRTH_DATE_RATE;
        }
        return result;
    }

    /*
     * Перегрузка перевірки інформації користувача: питання і відповідь
     */
    public static int checkUserInfo(String argQuestion, String argAnswer){
        final String REG_QUESTION = "Улюблений колір?";
        final String REG_ANSWER = "Зелений";
        final int QUESTION_RATE = 15;
        final int ANSWER_RATE = 15;
        int result = 0;

        if (argQuestion.equals(REG_QUESTION)){
            result += QUESTION_RATE;
        }
        if (argAnswer.equals(REG_ANSWER)){
            result += ANSWER_RATE;
        }
        return result;
    }

    /*
     * Перегрузка перевірки інформації користувача: номер замовлення і електронна адреса
     */
    public static int checkUserInfo(int lastOrderNumb, String argMail){
        final int LAST_ORDER = 43241;
        final String REG_MAIL = "eveniy@mail.com";
        final int MAIL_RATE = 15;
        final int ORDER_RATE = 15;
        int result = 0;

        if (argMail.equals(REG_MAIL)){
            result += MAIL_RATE;
        }
        if (lastOrderNumb == LAST_ORDER){
            result += ORDER_RATE;
        }
        return result;
    }

    public static void main(String[] args) {
        String userName;
        String userPassword;
        String userQuestion;
        String userAnswer;
        String userMail;
        String outMessage;
        String outMessageSecondPos;
        String outMessageSecondNeg;
        int userOrder;
        int userBirthDate;
        int result;

        // Зчитування данних для відновлення доступу
        System.out.println("Введіть логін:");
        userName = getUserinfo();

        System.out.println("Введіть пароль:");
        userPassword = getUserinfo();

        System.out.println("Введіть питання:");
        userQuestion = getUserinfo();

        System.out.println("Введіть відповідь:");
        userAnswer = getUserinfo();

        System.out.println("Введіть електронну пошту:");
        userMail = getUserinfo();

        System.out.println("Введіть останній номер замовлення:");
        userOrder = getUserinfo(1);

        System.out.println("Введіть дату народження:");
        userBirthDate = getUserinfo(1);

        // Ініціалізація формату виводу
        outMessage = "Рівень достовірності інформації: %d, в відновленні доступу %s!\n";
        outMessageSecondPos = "дозволено";
        outMessageSecondNeg = "відмовленно";

        // Розрахунок рівня корректності наданої інформації
        result = (checkUserInfo(userName) + checkUserInfo(userPassword, userBirthDate) +
                checkUserInfo(userQuestion, userAnswer) + checkUserInfo(userOrder, userMail));

        // Вивід вердикту
        System.out.println(String.format(outMessage, result, (result >= 60 ? outMessageSecondPos : outMessageSecondNeg)));

        /*
            Приклад:
            Введіть логін:
            Evgeniy
            Введіть пароль:
            qwerty
            Введіть питання:
            Улюблений колір?
            Введіть відповідь:
            Зелений
            Введіть електронну пошту:
            eveniy@mail.com
            Введіть останній номер замовлення:
            12323
            Введіть дату народження:
            123123
            Рівень достовірності інформації: 70, в відновленні доступу дозволено!
         */
    }
}
