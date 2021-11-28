package HW2_3.Printer;

public class PrinterCyan extends Printer{
    private String outColor;      // Колір тексту

    public PrinterCyan() {
        outColor = "\u001B[36m";  // unicode голубого кольору
    }

    @Override
    public void print(String value) {
        System.out.println(outColor + value);
    }
}
