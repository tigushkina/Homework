/**
 * Created by Omar on 22.11.2014.
 */
public class Lesson_2 {
    public static void main(String[] args) {

        int a = 115;
        int b = 159;
        int c = 5;
        int d = 79;

        if (a > b && a > c && a > d) {
            if (b > c && b > d) {
                System.out.println(b + " is the 2nd");
            } else if (c > b && c > d) {
                System.out.println(c + " is the 2nd");
            } else if (d > b && d > c) {
                System.out.println(d + " is the 2nd");
            }
        } else if (b > a && b > c && b > d) {
            if (a > c && a > d) {
                System.out.println(a + " is the 2nd");
            } else if (c > a && c > d) {
                System.out.println(c + " is the 2nd");
            } else if (d > a && d > c) {
                System.out.println(d + " is the 2nd");
            }
        } else if (c > a && c > b && c > d) {
            if (a > b && a > d) {
                System.out.println(a + " is the 2nd");
            } else if (b > a && b > d) {
                System.out.println(b + " is the 2nd");
            } else if (d > a && d > b) {
                System.out.println(d + " is the 2nd");
            }
        } else if (d > a && d > b && d > c) {
            if (a > b && a > c) {
                System.out.println(a + " is the 2nd");
            } else if (b > a && b > c) {
                System.out.println(b + " is the 2nd");
            } else if (c > a && c > b) {
                System.out.println(c + " is the 2nd");
            }
        }
        int i = 0;
        while (i <= 10) {
            System.out.println("Before incrementation " + i);
            i++;
            System.out.println("After incrementation " + i);
        }
        int x =0;
        while (x <=10){
           System.out.println (x++);

        }


    }
}
