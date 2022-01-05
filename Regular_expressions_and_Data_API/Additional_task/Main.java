package Regular_expressions_and_Data_API.Additional_task;

/*
    Задание
    Напишите консольное приложение, позволяющие пользователю зарегистрироваться под «Логином», состоящем только
    из символов латинского алфавита, и пароля, состоящего из цифр и символов.
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern loginPattern = Pattern.compile("([A-z]*)");
        Pattern passwordPattern = Pattern.compile("([A-z]*)([0-9]*)");
        Matcher loginMatcher;
        Matcher passwordMatcher;
        String loginBuffer;
        String passwordBuffer;
        Scanner scanner;

        scanner = new Scanner(System.in);
        System.out.println("Введіть логін:");
        loginBuffer = scanner.nextLine();
        loginMatcher = loginPattern.matcher(loginBuffer);
        if (loginMatcher.matches()) {
            System.out.println(loginBuffer);
            System.out.println(loginMatcher.group(1));
        } else {
            System.out.println("Неправильно ведений логін: логін має складатися лише із символів латинського алфавіту!");
        }

        scanner = new Scanner(System.in);
        System.out.println("Введіть пароль:");
        passwordBuffer = scanner.nextLine();
        passwordMatcher = passwordPattern.matcher(passwordBuffer);
        if (passwordMatcher.matches()) {
            System.out.println(passwordBuffer);
            System.out.println(passwordMatcher.group(1));
        } else {
            System.out.println("Неправильно ведений пароль: пароль має складатися лише із символів латинського " +
                    "алфавіту і цифр!");
        }
    }
}
