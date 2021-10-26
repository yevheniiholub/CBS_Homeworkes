package Practice_lesson3;

public class Task3 {
    public static void main(String[] args) {
        /*
            3. Подумать в уме какой ответ на такие уравнения (true либо false), после чего сверить свой ответ.

            int a = 2

            1 > --a

            1 > (a-1)

            1 > -1 * a

            1 > (-5*-10+20+30-(a++)/12+ ++a)*0
         */

        int a = 2;

        System.out.println( 1 > --a);                           // False
        System.out.println( 1 > (a-1));                         // True
        System.out.println(1 > -1 * a);                         // True
        System.out.println(1 > (-5*-10+20+30-(a++)/12+ ++a)*0); // True

        // Вивід:   false
        //          true
        //          true
        //          true
    }
}
