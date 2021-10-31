package Home_work6;

public class Task2 {
    /*
        Задание 3
        Используя IntelliJ IDEA, создайте класс.
        Используя циклы и метод:
                System.out.print("*"), System.out.print(" "), System.out.print("\n") (для перехода на
        новую строку).
        Выведите на экран:
         прямоугольник
         прямоугольный треугольник
         равносторонний треугольник
         ромб
    */
    public static void main(String[] args) {

        final int MAX_WIDTH_RECTANGLE = 5;
        final int MAX_HIGHT_RECTANGLE = 5;
        final int MAX_WIDTH_TRIANGLE_1 = 5;
        final int MAX_HIGHT_TRIANGLE_1 = 5;
        final int MAX_WIDTH_TRIANGLE_2 = 6;
        final int MAX_HIGHT_TRIANGLE_2 = 3;;
        final int MAX_WIDTH_RHOMBUS = 6;
        final int MAX_HIGHT_RHOMBUS = 6;
        int i;

        // Прямокутник
        // Цикл по вертикалі
        for (int j = 0 ; j <= MAX_HIGHT_RECTANGLE; j++) {
            i = 0;
            // Цикл по горизонталі
            while (i <= MAX_WIDTH_RECTANGLE) {
                // Якщо знаходиться на крайніх точка хоч одної координати то виводити *
                if (j == 0 || j == MAX_HIGHT_RECTANGLE || i == MAX_WIDTH_RECTANGLE || i == 0) {
                    System.out.print("*");
                // В іншому випадку " "
                } else {
                    System.out.print(" ");
                }
                i++;
            }
            // При завершені лінії перейти на нову
            System.out.print("\n");
        }

        // Прямокутний трикутник
        // Цикл по вертикалі
        for (int j = 0; j <= MAX_HIGHT_TRIANGLE_1; j++)
        {
            i = 0;
            // Цикл по горизонталі
            while (i <= MAX_WIDTH_TRIANGLE_1)
            {
                // Якщо координата знаходиться на крайній лівій і нижній позиції, а також i == j для діагоналі
                if (j == MAX_HIGHT_TRIANGLE_1 || i == 0 || i == j)
                {
                    System.out.print("*");
                }
                // В іншому випадку " "
                else
                {
                    System.out.print(" ");
                }
                i++;
            }
            // При завершені лінії перейти на нову
            System.out.print("\n");
        }

        // Рівнобедрений трикутник
        // Цикл по вертикалі
        for (int j = 0, helpInteger = 0; j <= MAX_HIGHT_TRIANGLE_2; j++, helpInteger++)
        {
            i = 0;
            // Цикл по горизонталі
            while (i <= MAX_WIDTH_TRIANGLE_2)
            {
                // За допомогою допоміжної змінної відбувається зміщення від центру вліво і вправо
                // і таким чином від центу малюються дві косих лінії
                if (j == MAX_HIGHT_TRIANGLE_2 || i == MAX_HIGHT_TRIANGLE_2 - helpInteger ||
                        i == MAX_HIGHT_TRIANGLE_2 + helpInteger)
                {
                    System.out.print("*");
                }
                // В іншому випадку " "
                else
                {
                    System.out.print(" ");
                }
                i++;
            }
            // При завершені лінії перейти на нову
            System.out.print("\n");
        }

        // Ромб
        // Цикл по вертикалі
        for (int j = 0, helpInteger = 0; j <= MAX_HIGHT_RHOMBUS; j++)
        {
            i = 0;
            // Цикл по горизонталі
            while (i <= MAX_WIDTH_RHOMBUS)
            {
                // Схожа логіка із рівнобедреним трикутником. Тут малюється тільки по зміщенню.
                // Коли ромб ростягується на масимальну ширину, то тоді замість інкрементації допоміжного
                // значення відбувається декрементація і ромб замикається
                if (i == 3 - helpInteger || i == 3 + helpInteger)
                {
                    System.out.print("*");
                }
                // В іншому випадку " "
                else
                {
                    System.out.print(" ");
                }
                i++;
            }
            // Якщо горозинтальна координата менша за координату центру ромба по вертикалі то інкрементуємо
            // допоміжне значення
            if (j < 3)
                helpInteger++ ;
            // В іншому декрементуємо " "
            else
                helpInteger--;
            // При завершені лінії перейти на нову
            System.out.print("\n");
        }
        /*
        Вивід:
            ******
            *    *
            *    *
            *    *
            *    *
            ******
            *
            **
            * *
            *  *
            *   *
            ******
               *
              * *
             *   *
            *******
               *
              * *
             *   *
            *     *
             *   *
              * *
               *
         */
    }
}
