package Annotations.Task_3;

/*
    Задание 3
    Создайте несколько классов, один класс наследует другой и использует аннотацию Inherited.
    Помимо этого, попробуйте ещё в проекте использовать 5 различных аннотаций.
 */

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        ChildrenClass childrenClass = new ChildrenClass();

        System.out.println("\u001B[34m" + "Anotation of SuperClass" + "\u001B[0m");
        for (Annotation a : superClass.getClass().getAnnotations()) {
            System.out.println(a);
        }

        System.out.println("\u001B[34m" + "Anotation of ChildrenClass" + "\u001B[0m");
        for (Annotation a : childrenClass.getClass().getAnnotations()) {
            System.out.println(a);
        }
    }
}
