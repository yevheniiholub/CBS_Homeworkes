package Additional_stream.Task_3;

/*
    3. Пользователь вводит данные для регистрации.
    Класс пользователь имеет поля:
    Логин, имя, пароль, и персональные на ваш вкус.
    Поля, которые пользователь не вводит, но они есть:
    1. Дата регистрации - вы заполняете в случае если регистрация прошла успешно.
    2. Дата рождения. В случае, если не заполнена вводите дату своего личного дня рождения.
    3. Имя - В случае, если нету - вводите - default.
    4. Все остальные не важные поля (на ваш вкус), вы также как и с именем выставляете какое-то значение, но не default.
    Получить все данные, и только через Optional создать экземпляр класса User.
    Важные поля, в случае пустоты должны выдать ошибку.
    Не важные поля должны иметь поля не null.
    Например.
    login = sc.nextLine() - получение логина
    Optional<User> loginO .... - ввести Optinal на это поле. Нейминг править
    user.setLogin(loginO.orElseTrow(()-> LoginNotInputError....)
 */

import java.time.LocalDate;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserInfo user = new UserInfo();

        System.out.println("Введіть ім'я");
        user.setName(Optional.ofNullable(new Scanner(System.in).nextLine()).orElse("Default"));
        try {
            System.out.println("Введіть логін");
            user.setLogin(Optional.ofNullable(new Scanner(System.in).nextLine()).
                    orElseThrow((() -> new LoginNotInputError("Login not provided"))));
            System.out.println("Введіть пароль");
            user.setPassword(Optional.ofNullable(new Scanner(System.in).nextLine()).
                    orElseThrow((() -> new PasswordNotInputError("Password not provided"))));
        } catch (LoginNotInputError | PasswordNotInputError e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Введіть стать");
        user.setGender(Optional.ofNullable(new Scanner(System.in).nextLine()).orElse("Unknown"));
        System.out.println("Введіть дату народження");
        user.setBirthDay(Optional.of(new Scanner(System.in).nextInt()).orElse(29071996));
        user.setId(new Random().nextInt());
        user.setRegDate(LocalDate.now());

        System.out.println(user);
    }
}
