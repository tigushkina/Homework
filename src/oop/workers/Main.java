package oop.workers;


import java.util.ArrayList;

/**
 * Created by Omar on 21.12.2014.
 */
public class Main {
    public static void main(String[] args) {
        Manager managerOne = new Manager();
        managerOne.name = "Maria";
        managerOne.secondName = "Kuri";
        managerOne.salary = 1000;
        managerOne.team = "team MK";

        Manager managerTwo = new Manager();
        managerTwo.name = "Sofia";
        managerTwo.secondName = "Kovalevska";
        managerTwo.salary = 1500;
        managerTwo.team = "team SK";

        Manager managerThree = new Manager();
        managerThree.name = "Grace";
        managerThree.secondName = "Hopper";
        managerThree.salary = 5500;
        managerThree.team = "team GH";

        Manager managerFour = new Manager();
        managerFour.name = "Hedy";
        managerFour.secondName = "Lamarr";
        managerFour.salary = 14000;
        managerFour.team = "team HL";

        Manager managerFive = new Manager();
        managerFive.name = "Ada";
        managerFive.secondName = "Lovelace";
        managerFive.salary = 4800;
        managerFour.team = "team AL";

        Manager[] managers = new Manager[5];
        managers[0] = managerOne;
        managers[1] = managerTwo;
        managers[2] = managerThree;
        managers[3] = managerFour;
        managers[4] = managerFive;

        Cleaner cleanerOne = new Cleaner();
        cleanerOne.name = "Anton";
        cleanerOne.secondName = "Antonov";
        cleanerOne.salary = 100;
        cleanerOne.location = "stairs";

        Cleaner cleanerTwo = new Cleaner();
        cleanerTwo.name = "Aleksey";
        cleanerTwo.secondName = "Alekseev";
        cleanerTwo.salary = 2000;
        cleanerTwo.location = "class";

        Cleaner cleanerThree = new Cleaner();
        cleanerThree.name = "Oleg";
        cleanerThree.secondName = "Olegov";
        cleanerThree.salary = 10;
        cleanerThree.location = "elevator";

        Cleaner cleanerFour = new Cleaner();
        cleanerFour.name = "Vitalii";
        cleanerFour.secondName = "Vitaliev";
        cleanerFour.salary = 1900;
        cleanerFour.location = "buffet";

        Cleaner cleanerFive = new Cleaner();
        cleanerFive.name = "Topol";
        cleanerFive.secondName = "Tupolev";
        cleanerFive.salary = 11000;
        cleanerFive.location = "yard";

        Cleaner[] cleaners = new Cleaner[5];
        cleaners[0] = cleanerOne;
        cleaners[1] = cleanerTwo;
        cleaners[2] = cleanerThree;
        cleaners[3] = cleanerFour;
        cleaners[4] = cleanerFive;

        Teacher teacherOne = new Teacher();
        teacherOne.name = "A";
        teacherOne.secondName = "Aa";
        teacherOne.salary = 100.5;
        teacherOne.subject = "History";

        Teacher teacherTwo = new Teacher();
        teacherTwo.name = "B";
        teacherTwo.secondName = "Ba";
        teacherTwo.salary = 100.6;
        teacherTwo.subject = "Programming";

        Teacher teacherThree = new Teacher();
        teacherThree.name = "C";
        teacherThree.secondName = "Ca";
        teacherThree.salary = 100.7;
        teacherThree.subject = "Math";

        Teacher teacherFour = new Teacher();
        teacherFour.name = "D";
        teacherFour.secondName = "Da";
        teacherFour.salary = 100.8;
        teacherFour.subject = "Philosophy";

        Teacher teacherFive = new Teacher();
        teacherFive.name = "E";
        teacherFive.secondName = "Ea";
        teacherFive.salary = 100.9;
        teacherFive.subject = "Literature";

        Teacher[] teachers = new Teacher[5];
        teachers[0] = teacherOne;
        teachers[1] = teacherTwo;
        teachers[2] = teacherThree;
        teachers[3] = teacherFour;
        teachers[4] = teacherFive;

        ArrayList<Worker> companyListOne = new ArrayList<Worker>();
        companyListOne.add(cleanerOne);
        companyListOne.add(cleanerTwo);
        companyListOne.add(managerOne);
        companyListOne.add(managerTwo);
        companyListOne.add(teacherFour);
        companyListOne.add(teacherFive);

        Company companyOne = new Company();
        companyOne.companyName = "P";
        companyOne.workers = companyListOne;

        Company companyTwo = new Company();
        companyTwo.companyName = "O";

        Company companyThree = new Company();
        companyThree.companyName = "I";

        ArrayList<Cleaner> cleanersList = new ArrayList<Cleaner>();
        cleanersList.add(cleanerOne);
        cleanersList.add(cleanerTwo);
        cleanersList.add(cleanerThree);
        cleanersList.add(cleanerFour);
        cleanersList.add(cleanerFive);

        ArrayList<Teacher> teachersList = new ArrayList<Teacher>();
        teachersList.add(teacherOne);
        teachersList.add(teacherTwo);
        teachersList.add(teacherThree);
        teachersList.add(teacherFour);
        teachersList.add(teacherFive);

        ArrayList<Manager> managersList = new ArrayList<Manager>();
        managersList.add(managerOne);
        managersList.add(managerTwo);
        managersList.add(managerThree);
        managersList.add(managerFour);
        managersList.add(managerFive);


        Manager manager = maxSalaryManager(managers);
        System.out.println(manager.name);
        Cleaner cleaner = maxSalaryCleaner(cleaners);
        System.out.println(cleaner.name);
        compare(maxSalaryCleaner(cleaners), maxSalaryManager(managers));
        compare2(maxSalaryCleaner(cleaners), maxSalaryManager(managers), maxSalaryTeacher(teachers));

        getCleaners(cleanersList);
        getManagers(managersList);
        getTeachers(teachersList);
        getHighestSalary(cleanersList, managersList, teachersList);

        getMaxSalary(companyListOne);


        ArrayList<Company> companiesList = new ArrayList<Company>();
        companiesList.add(companyOne);
        companiesList.add(companyTwo);
        companiesList.add(companyThree);
    }

    private static void getMaxSalary(ArrayList<Worker> workersList) {
        Worker maxWorker = workersList.get(0);
        for (int i = 0; i < workersList.size(); i++) {
            if (workersList.get(i).salary > maxWorker.salary) {
                maxWorker = workersList.get(i);
            }
        }
        System.out.println("max salary of workers " + maxWorker.salary);
    }

    private static void getHighestSalary(ArrayList<Cleaner> cleanersList, ArrayList<Manager> managersList, ArrayList<Teacher> teachersList) {
        Cleaner tempCleaner = cleanersList.get(0);
        Manager tempManager = managersList.get(0);
        Teacher tempTeacher = teachersList.get(0);

        for (int i = 0; i < cleanersList.size(); i++) {
            if (cleanersList.get(i).salary > tempCleaner.salary) {
                tempCleaner = cleanersList.get(i);
            }
        }
        System.out.println("Cleaners salary max is " + tempCleaner.salary + " " + tempCleaner.secondName);

        for (int i = 0; i < managersList.size(); i++) {
            if (managersList.get(i).salary > tempManager.salary) {
                tempManager = managersList.get(i);
            }
        }
        System.out.println("Managers salary max is " + tempManager.salary + " " + tempManager.secondName);

        for (int i = 0; i < teachersList.size(); i++) {
            if (teachersList.get(i).salary > tempTeacher.salary) {
                tempTeacher = teachersList.get(i);
            }
        }
        System.out.println("Teachers salary max is " + tempTeacher.salary + " " + tempTeacher.secondName);

        if (tempTeacher.salary > tempManager.salary && tempTeacher.salary > tempCleaner.salary) {
            System.out.println("The highest salary has TEACHER  and it is  " + tempTeacher.salary + " " + tempTeacher.secondName);
        } else if (tempManager.salary > tempTeacher.salary && tempManager.salary > tempCleaner.salary) {
            System.out.println("The highest salary has MANAGER  and it is  " + tempManager.salary + " " + tempManager.secondName);
        } else if (tempCleaner.salary > tempManager.salary && tempCleaner.salary > tempTeacher.salary) {
            System.out.println("The highest salary has CLEANER  and it is  " + tempCleaner.salary + " " + tempCleaner.secondName);
        }
    }

    private static void getTeachers(ArrayList<Teacher> teachersList) {
        for (int i = 0; i < teachersList.size(); i++) {
            System.out.println(teachersList.get(i).salary + " " + teachersList.get(i).secondName);
        }
    }

    private static void getManagers(ArrayList<Manager> managersList) {
        for (int i = 0; i < managersList.size(); i++) {
            System.out.println(managersList.get(i).salary + " " + managersList.get(i).secondName);
        }
    }

    public static void getCleaners(ArrayList<Cleaner> cleanersList) {
        for (int i = 0; i < cleanersList.size(); i++) {
            System.out.println(cleanersList.get(i).salary + " " + cleanersList.get(i).name + " " + cleanersList.get(i).secondName);
        }

        Cleaner cleanerOne = new Cleaner();
        cleanerOne.name = "Ivan";
        cleanersList.set(0, cleanerOne);
        System.out.println("0 element's - CleanerOne name is now " + cleanerOne.name);
    }

    public static Manager maxSalaryManager(Manager[] managers) {
        System.out.println(" The highest managers' salary is ");
        double maxSalary = managers[0].salary;
        Manager manager = managers[0];
        for (int i = 0; i < managers.length; i++) {
            if (managers[i].salary > manager.salary) {
                manager = managers[i];
            }
        }
        System.out.println(manager.salary);
        return manager;
    }

    public static Cleaner maxSalaryCleaner(Cleaner[] cleaners) {
        System.out.println(" The highest cleaners' salary is ");
        double maxSalary = cleaners[0].salary;
        Cleaner cleaner = cleaners[0];
        for (int i = 0; i < cleaners.length; i++) {
            if (cleaners[i].salary > cleaner.salary) {
                cleaner = cleaners[i];
            }
        }
        System.out.println(cleaner.salary);
        return cleaner;
    }

    public static void compare(Cleaner cleaner, Manager manager) {
        if (cleaner.salary > manager.salary) {
            System.out.println("cleaner " + cleaner.salary);
        } else {
            System.out.println("manager " + manager.salary);
        }
    }

    public static Teacher maxSalaryTeacher(Teacher[] teachers) {
        System.out.println(" The highest teachers' salary is ");
        double maxSalary = teachers[0].salary;
        Teacher teacher = teachers[0];
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i].salary > teacher.salary) {
                teacher = teachers[i];
            }
        }
        System.out.println(teacher.salary);
        return teacher;
    }

    public static void compare2(Cleaner cleaner, Manager manager, Teacher teacher) {
        if (cleaner.salary > manager.salary && cleaner.salary > teacher.salary) {
            System.out.println("cleaner " + cleaner.salary);
        }
        if (manager.salary > teacher.salary && manager.salary > cleaner.salary) {
            System.out.println("manager " + manager.salary);
        } else {
            System.out.println("teacher " + manager.salary);
        }

    }

}
