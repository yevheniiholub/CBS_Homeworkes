package Annotations.Task_2;

/*
    Задание 2
    Написать калькулятор с использованием аннотаций, аннотация передает 2 параметра.
    Сделать полную документацию всех полей, методов, конструкторов класса используя аннотацию Documented,
    либо же документационные комментарии.
 */

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println(c.add());
        System.out.println(c.sub());
        System.out.println(c.mul());
        System.out.println(c.div());
    }
}
