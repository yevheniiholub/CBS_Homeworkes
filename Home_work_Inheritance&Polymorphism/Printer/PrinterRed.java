package HW2_3.Printer;

public class PrinterRed extends Printer{
    private String outColor;        // Колір тексту

    public PrinterRed() {
        outColor = "\u001B[31m";    // unicode червоного кольору
    }

    @Override
    public void print(String value) {
        System.out.println(outColor + value);
    }
}
