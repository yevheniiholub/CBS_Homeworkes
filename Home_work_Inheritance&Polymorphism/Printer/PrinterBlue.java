package HW2_3.Printer;

public class PrinterBlue extends Printer{
    private String outColor;        // Колір тексту

    public PrinterBlue() {
        outColor = "\u001B[34m";    // unicode синього кольору
    }

    @Override
    public void print(String value) {
        System.out.println(outColor + value);
    }
}
