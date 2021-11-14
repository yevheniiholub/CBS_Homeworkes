package Practice_lesson8;

public class Task1 {

    /*
     * Метод 2: Висначення сумми всіх чисел від 0 до данної користувачем методом рекурсії
     */
    public static int getOrderSum(int argInt) {
        if (argInt - 1 > 0) {
            return argInt + getOrderSum(argInt - 1);
        }
        return 1;
    }

    /*
    * Метод 1: для визначення сумми трьох параметрів до рекурсії і після
    */
    public static void getNumbersOrderSum(int argFirst, int argSecond, int argThird) {
        System.out.printf("Cумма чисел до: %d, після %d:\n", (argFirst + argSecond + argThird),
                (getOrderSum(argFirst) + getOrderSum(argSecond) + getOrderSum(argThird)));
    }

    public static void main(String[] args) {
        int firstUserNumber = 7;
        int secondUserNumber = 12;
        int thirdUserNumber = 4;

        getNumbersOrderSum(firstUserNumber, secondUserNumber, thirdUserNumber);
        // Вивід: Cумма чисел до: 23, після 116:
    }
}
