package Lambda_expressions.Additional_task;

public class Main {
    public static void main(String[] args) {
        Calculation calcAdd;
        calcAdd = Integer::sum;
        int addResult = calcAdd.calculate(12, 32);

        Calculation calcSub;
        calcSub = (x, y) -> x - y;
        int subResult = calcSub.calculate(42, 32);

        Calculation calcMul;
        calcMul = (x, y) -> x * y;
        int mulResult = calcMul.calculate(2, 32);

        Calculation calcDiv;
        calcDiv = (x, y) -> x / y;
        int divResult = calcDiv.calculate(30, 15);

        System.out.println(addResult + " " + subResult + " " + mulResult + " " + divResult);
    }
}
