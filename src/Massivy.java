import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

/**
 * Created by Omar on 06.12.2014.
 */
public class Massivy {
    public static void main(String[] args) {
        int[] array = new int[6];
        array[0] = 2;
        array[1] = -4;
        array[2] = 10;
        array[3] = 25;
        array[4] = 2;
        array[5] = -4;
        System.out.println("Вывести все эл-ты массива");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");

        }

        System.out.println("Вывести все эл-ты первой половины массива");
        for (int i = 0; i < array.length / 2; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println("Вывести все эл-ты второй половины массива");
        for (int i = array.length / 2; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }

        System.out.println("Вывести все эл-ты массива в обратном порядке");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        System.out.println("Вывести все парные эл-ты массива");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }

        }
        System.out.println("Вывести все эл-ты 2ой половины массива в обратном порядке");
        for (int i = array.length - 1; i >= array.length / 2; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println("Вывести все эл-ты 1ой половины массива в обратном порядке");
        for (int i = (array.length - 1) / 2; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println("Вывести сумму всех эл-тов массива");
        int[] arrayTwo = {1, 45, 67, 67, 545, 898};
        int sum = 0;
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            sum = array[i] + sum;
        }
        System.out.println(sum);

        System.out.print("Вывести среднее арифметическое всех эл-тов массива");
        average = sum / array.length;
        System.out.println(average);

        System.out.print("Вывести минимальное и максимальное число массива ");
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.print("min" + min + "max" + max);

        System.out.print("Поменять отрицательные числа массива на ноль ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }

    }
}
