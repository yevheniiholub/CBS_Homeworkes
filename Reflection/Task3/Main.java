package Reflection.Task3;

/*
    Задание 3
    Создайте класс, в нем определите 3 поля, к этим полям создайте конструкторы и методы.
    Под средством рефлексии получите всю информацию о полях, методах, конструкторах, а также модификаторах доступа
 */

import java.lang.reflect.Member;

class SomeClassForTask {
    private String firstField;
    protected Integer secondField;
    Boolean thirdField;

    public SomeClassForTask(String firstField, Integer secondField, Boolean thirdField) {
        this.firstField = firstField;
        this.secondField = secondField;
        this.thirdField = thirdField;
    }

    public String getFirstField() {
        return firstField;
    }

    public void setFirstField(String firstField) {
        this.firstField = firstField;
    }

    public Integer getSecondField() {
        return secondField;
    }

    public void setSecondField(Integer secondField) {
        this.secondField = secondField;
    }

    public Boolean getThirdField() {
        return thirdField;
    }

    public void setThirdField(Boolean thirdField) {
        this.thirdField = thirdField;
    }
}

public class Main {
    public static void printInfo(Member [] members){
        for (Member member : members) {
            System.out.print("\u001B[32m" + "Name: " + "\u001B[0m");
            System.out.print(member.getName());
            System.out.print("\u001B[32m" + " modifier is : " + "\u001B[0m");
            System.out.println(member.getModifiers());

        }
    }

    public static void main(String[] args) {
        Class someClass = SomeClassForTask.class;
        Member[] methods = someClass.getMethods();
        Member[] constructors = someClass.getConstructors();
        Member[] fields = someClass.getDeclaredFields();

        System.out.println("\u001B[34m" + "Methods: " + "\u001B[0m");
        printInfo(methods);
        System.out.println("\u001B[34m" + "Constructors: " + "\u001B[0m");
        printInfo(constructors);
        System.out.println("\u001B[34m" + "Fields: " + "\u001B[0m");
        printInfo(fields);
    }
}
