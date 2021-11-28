package Practice_lesson_Classes_and_Objects;

public class Main {

    /*
     *   Перегружені методи для перевірки кожного поля на співповідність інформації
     */
    public static int checkAccountField(AccountInfoAnswer srcData, AccountInfoAnswer cmpData){
        if (srcData.getAnswer().equals(cmpData.getAnswer())){
            return 15;
        }
        return 0;
    }

    public static int checkAccountField(AccountInfoBirthDay srcData, AccountInfoBirthDay cmpData){
        if (srcData.getBirthDay() == cmpData.getBirthDay()){
            return 15;
        }
        return 0;
    }

    public static int checkAccountField(AccountInfoMail srcData, AccountInfoMail cmpData){
        if (srcData.getMail().equals(cmpData.getMail())){
            return 15;
        }
        return 0;
    }

    public static int checkAccountField(AccountInfoName srcData, AccountInfoName cmpData){
        if (srcData.getName().equals(cmpData.getName())){
            return 15;
        }
        return 0;
    }

    public static int checkAccountField(AccountInfoOrder srcData, AccountInfoOrder cmpData){
        if (srcData.getOrder() == cmpData.getOrder()){
            return 15;
        }
        return 0;
    }

    public static int checkAccountField(AccountInfoPassword srcData, AccountInfoPassword cmpData){
        if (srcData.getPassword().equals(cmpData.getPassword())){
            return 15;
        }
        return 0;
    }

    public static int checkAccountField(AccountInfoQuestion srcData, AccountInfoQuestion cmpData){
        if (srcData.getQuestion().equals(cmpData.getQuestion())){
            return 15;
        }
        return 0;
    }
    /*
     *  Кінець перегружених методів
     */

    // Розрахунок достовірності інформації, через розрахування результатів перевірок всіх полів аккаунту
    public static int dataCmpRate(AccountInfo srcData, AccountInfo cmpData){
        return  checkAccountField(srcData.getAnswer(), cmpData.getAnswer()) +
                checkAccountField(srcData.getMail(), cmpData.getMail()) +
                checkAccountField(srcData.getName(), cmpData.getName()) +
                checkAccountField(srcData.getBirthDay(), cmpData.getBirthDay()) +
                checkAccountField(srcData.getPassword(), cmpData.getPassword()) +
                checkAccountField(srcData.getOrder(), cmpData.getOrder()) +
                checkAccountField(srcData.getQuestion(), cmpData.getQuestion());
    }

    public static void main(String[] args) {
        AccountInfo userActualData;
        AccountInfo userRecoveryData;
        String outMessage;
        String outMessageSecondPos;
        String outMessageSecondNeg;
        int result;

        // Ініціалізація полів для аккаунту з достовірною інформацією
        AccountInfoAnswer answerActual = new AccountInfoAnswer("Red");
        AccountInfoBirthDay birthDayActual = new AccountInfoBirthDay(29071996);
        AccountInfoMail mailActual = new AccountInfoMail("Oleg@mail.com");
        AccountInfoName nameActual = new AccountInfoName("Oleg");
        AccountInfoOrder orderActual = new AccountInfoOrder(78741);
        AccountInfoPassword passwordActual = new AccountInfoPassword("qwerty");
        AccountInfoQuestion questionActual = new AccountInfoQuestion("Favorite color?");

        // Ініціалізація полів для аккаунту з інформацією для спроби відновлення
        AccountInfoAnswer answerRecovery = new AccountInfoAnswer("Red");
        AccountInfoBirthDay birthDayRecovery = new AccountInfoBirthDay(29071996);
        AccountInfoMail mailRecovery = new AccountInfoMail("Andrey@mail.com");
        AccountInfoName nameRecovery = new AccountInfoName("Andrey");
        AccountInfoOrder orderRecovery = new AccountInfoOrder(1321);
        AccountInfoPassword passwordRecovery = new AccountInfoPassword("ytrewq");
        AccountInfoQuestion questionRecovery = new AccountInfoQuestion("Favorite color?");

        // Ініціалізація об'єктів аккаунту, полями які були проініціалізовані вище
        userActualData = new AccountInfo(answerActual, birthDayActual, mailActual, nameActual, orderActual,
                passwordActual, questionActual);
        userRecoveryData = new AccountInfo(answerRecovery, birthDayRecovery, mailRecovery, nameRecovery, orderRecovery,
                passwordRecovery, questionRecovery);

        // Виклик розрахунку
        result = dataCmpRate(userActualData, userRecoveryData);

        // Ініціалізація формату виводу
        outMessage = "Рівень достовірності інформації: %d, в відновленні доступу %s!\n";
        outMessageSecondPos = "дозволено";
        outMessageSecondNeg = "відмовленно";

        // Вивід вердикту
        System.out.println(String.format(outMessage, result, (result >= 60 ? outMessageSecondPos : outMessageSecondNeg)));

        /*
            Результат:
            Рівень достовірності інформації: 45, в відновленні доступу відмовленно!
         */
    }
}
