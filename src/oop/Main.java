package oop;

/**
 * Created by Omar on 20.12.2014.
 */
public class Main {
    public static void main(String[] args) {
        Student studentOne = new Student();
        studentOne.name = "Tania";
        studentOne.secondName = "Igushkina";
        studentOne.mark = 2;

        Student studentTwo = new Student();
        studentTwo.name = "Abraham";
        studentTwo.secondName = "Lincoln";
        studentTwo.mark = 2;

        Student studentThree = new Student();
        studentThree.name = "Elvis";
        studentThree.secondName = "Presley";
        studentThree.mark = 1;

        Student studentFour = new Student();
        studentFour.name = "Sultan";
        studentFour.secondName = "Suleyman";
        studentFour.mark = 4;

        Student studentFive = new Student();
        studentFive.name = "Arnold";
        studentFive.secondName = "Schwarzenegger";
        studentFive.mark = 2;

        Student studentSix = new Student();
        studentSix.name = "Mikolaj";
        studentSix.secondName = "Kopernik";
        studentSix.mark = 5;

        Student[] students = new Student[6];
        students[0] = studentOne;
        students[1] = studentTwo;
        students[2] = studentThree;
        students[3] = studentFour;
        students[4] = studentFive;
        students[5] = studentSix;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " " + students[i].secondName + " " + students[i].mark + " ");
        }
        System.out.println(" Max mark is... ");
        int maxMark = students[0].mark;

        for (int i = 0; i < students.length; i++) {
            if (students[i].mark > maxMark) {
                maxMark = students[i].mark;
            }
        }
        System.out.println(maxMark);

        System.out.println(" Student with Max mark is... ");

        Student studMaxMark = students[0];
        int iMax = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].mark > studMaxMark.mark) {
                iMax = i;
                studMaxMark = students[i];
            }
        }
        System.out.println(studMaxMark.name);

        System.out.println(" Student with Min mark is... ");
        Student studMinMark = students[0];
        int iMin = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].mark < studMinMark.mark) {
                iMin = i;
                studMinMark = students[i];
            }
        }
        System.out.println(studMinMark.name);

        Student temp = students[iMax];
        students[iMax] = students[iMin];
        students[iMin] = temp;

        System.out.println("Former Min is now Max - " + students[iMax].name + " and former Max is now Min - " + students[iMin].name);

    }

}
