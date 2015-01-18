import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by Omar on 09.12.2014.
 */
public class Homework_Arrays {
    public static void main(String[] args) {
        int[] array = new int[6];
        array[0] = 3;
        array[1] = -8;
        array[2] = 10000;
        array[3] = 0;
        array[4] = 3;
        array[5] = -4;

        getBiggestAverage(array);
        getMaxVsMin(array);
        getAllBeforeZero(array);
        countEquals(array);
    }

    public static void getBiggestAverage(int[] array) {
        int sum1 = 0;
        int sum2 = 0;
        int average1 = 0;
        int average2 = 0;
        System.out.println(" Вывести в консоль половину массива, среднеарифметическое которых является наибольшим ");
        for (int i = 0; i < array.length / 2; i++) {
            sum1 = array[i] + sum1;
            average1 = sum1 / (array.length / 2);

            for (int j = array.length / 2; j < array.length; j++) {
                sum2 = array[i] + sum2;
                average2 = sum2 / (array.length / 2);
            }

            if (average1 > average2) {
                System.out.println(array[i] + " ");
            } else if (average1 < average2) {
                System.out.println(array[i] + " ");
            }
        }
    }

    public static void getMaxVsMin(int[] array) {
        int min = array[0];
        int max = array[0];
        int imin = 0;
        int imax = 0;
        System.out.print("Поменять минимальное и максимальное числа в массиве местами  ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                imin = i;
            }
            if (array[i] > max) {
                max = array[i];
                imax = i;
            }
        }
        int temp = array[imin];
        array[imin] = array[imax];
        array[imax] = temp;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print(array[imax] + " " + array[imin] + " ");
    }

    public static void getAllBeforeZero(int[] array) {

        System.out.print("Вывести на печать все числа, располож до нуля включительно ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                break;
            }
            System.out.print(array[i] + " ");
        }
    }

    public static void countEquals (int[] array) {
        System.out.println(" Подсчитать одинаковые числа в одномерном массиве");
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter++;
                }
            }
            System.out.println(array[i] + " " + counter);
            counter = 0;
        }
    }
}


