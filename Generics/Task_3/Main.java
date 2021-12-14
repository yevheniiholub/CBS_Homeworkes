package Generics.Task_3;

/*
    Задание 3
    Создайте проект, используя IntelliJ IDEA.
    Создайте класс MyDictionary<TKey,TValue>. Реализуйте в простейшем приближении возможность
    использования его экземпляра. Минимально требуемый интерфейс взаимодействия с экземпляром,
    должен включать метод добавления пар элементов, индексатор для получения значения элемента по
    указанному индексу и свойство только для чтения для получения общего количества пар элементов.
 */

public class Main {
    public static void main(String[] args) {
        MyDictionary<Integer, String> myDictionary = new MyDictionary<>();

        myDictionary.add(123, "First");
        myDictionary.add(1123, "Second");
        myDictionary.add(5332, "Third");

        System.out.println("count of pairs = " + myDictionary.size());
        System.out.print("myDictionary[1] = ");
        myDictionary.printElements(1);
    }
}
