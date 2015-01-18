/**
 * Created by Omar on 29.11.2014.
 */
public class Lesson_3 {
    public static void main(String[] args) {

        int x = 1000;
        int y = 3;


//        while (x <= 9999) {
//            System.out.println(x+y);
//            x++;
//        }
//        for (int i = 1000; i < 9999; i = i + 3) {
//            System.out.println(i);
//        }
        System.out.println("Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11");
        int tanya = 0;
        for (int i = 1; i < 110; i = i + 2) {
            tanya++;
            if (tanya == 55) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 ");
        for (int a = 90; a > 0; a = a - 5) {
            System.out.println(a);
        }

        System.out.println("Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 ");
        int count = 0;
        for (int i = 2; i < 1000000000; i = i * 2) {
            count++;
            if (count > 20) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("!!!первые 55 элементов последовательности 1 3 5 7 9 11");

        int cunt = 0;
        for (int i = 0; i <= 54; i++) {
            int value = 2 * i + 1;
            cunt++;
            System.out.println(cunt + " элемент - " + value);
        }
        System.out.println("Первые " + cunt + " элементов");



        System.out.println("Создайте программу, вычисляющую факториал натурального числа n");

        int factorial = 0;
        int result = 1;
        for (int i = 0; i < factorial; i++) {
            result = i * i;
        }
        System.out.println(result);

        System.out.println ("Первые 20 чисел последовательности Фибоначчи");
        int n = 20;
        int a = 0, b = 1;
        System.out.println(a + b);
        int fib = 2, i = 2;
        while (i <= n) {
            fib = a + b;
            a = b;
            b = fib;
            System.out.println(" " + fib);
            i++;
        }
        System.out.println ("Дільники натурального числа") ;

        int c=1;
        int d=1;
        for (int q = 0; c % d == 0; q=c/d ) {
            if (c > d) {

                System.out.print(" " + q);
            }
            q++;
        }



    }



}
