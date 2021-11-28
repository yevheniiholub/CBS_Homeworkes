package HW2_3.Printer;

public class PrinterGreen extends Printer{
    private String outColor;        // Колір тексту

    public PrinterGreen() {
        outColor = "\u001B[32m";    // unicode зеленого кольору
    }

    @Override
    public void print(String value) {
        System.out.println(outColor + value);
    }
}
