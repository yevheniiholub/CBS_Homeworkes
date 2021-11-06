package Home_work7;

import java.util.Scanner;

public class Calculator {

    /*
     *  Обчислення середнього арефметичного
     */
    public static void calculate(float argFitst, float argSecond, float argThird){
        System.out.println("Середнє арефметичне значення = " + ((argFitst + argSecond + argThird) / 3));
    }

    /*
     *  Зчитування значення користувача
     */
    public static float getUserFloat(){
        Scanner  userInput = new Scanner(System.in);
        return userInput.nextFloat();
    }

    public static void main(String[] args) {
        float userFirst;
        float userSecond;
        float userThird;

        // Зчитування всіх необхідних аргументів
        System.out.println("Введіть перше число: ");
        userFirst = getUserFloat();

        System.out.println("Введіть друге число: ");
        userSecond = getUserFloat();

        System.out.println("Введіть третє число: ");
        userThird = getUserFloat();

        // Виклик методу обчислення середнього значення
        calculate(userFirst, userSecond, userThird);
        /*
            Приклад:
            Введіть перше число:
            10
            Введіть друге число:
            20
            Введіть третє число:
            30
            Середнє арефметичне значення = 20.0
         */

    }
}
