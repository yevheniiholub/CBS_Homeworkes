package HW2_3.Printer;

/*
    Задание
    Используя IntelliJ IDEA, создайте проект.
    Требуется:
    Создайте класс Printer.
    В теле класса создайте метод void print(String value), который выводит на экран значение аргумента.
    Реализуйте возможность того, чтобы в случае наследования от данного класса других классов, и вызове
    соответствующего метода их экземпляра, строки, переданные в качестве аргументов методов,
    выводились разными цветами.
    Обязательно используйте приведение типов.
 */

public class Main {
    public static void printSomeText(Printer printerArg, String outString){
        printerArg.print(outString);
    }

    public static void main(String[] args) {
        // Ініціалізація об'єктів принтерів з різними кольорами виводу
        Printer defaultPrinter = new Printer();
        Printer cyanPrinter = new PrinterCyan();
        Printer redPrinter = new PrinterRed();
        Printer bluePrinter = new PrinterBlue();
        Printer greenPrinter = new PrinterGreen();

        // Запуск методу в для кожного екземпляру
        printSomeText(defaultPrinter, "Звичайних принтер");
        printSomeText(cyanPrinter, "Голубий принтер");
        printSomeText(redPrinter, "Червоний принтер");
        printSomeText(bluePrinter, "Синій принтер");
        printSomeText(greenPrinter, "Зеоений принтер");
    }
}
