package Annotations.Additional_task;

/*
    Задание
    Создать свою аннотацию, которая будет содержать параметры для метода, выполнить сложение 2-х чисел.
    @Math(num1 = 100, num2 = 200)
    public void mathSum(int num1, int num2)

 */

public class Main {

    public static void main(String[] args) {
        AnnotationMath annotationMath = new AnnotationMath();
        annotationMath.mathSum();
    }
}
