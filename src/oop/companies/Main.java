package oop.companies;

/**
 * Created by Omar on 17.01.2015.
 */
public class Main {
    public static void main(String[] args) {
        Company companyOne = new Company();
        companyOne.companyName = "Uno";

        Company companyTwo = new Company();
        companyTwo.companyName = "Duo";

        Company companyThree = new Company();
        companyThree.companyName = "Tre";

        CleanerUno cleanerUno1 = new CleanerUno();
        cleanerUno1.name = "gi";
        cleanerUno1.secondName= "te";
        cleanerUno1.salary= 250;

        CleanerUno cleanerUno2 = new CleanerUno();
        cleanerUno2.name = "ko";
        cleanerUno2.secondName = "we";
        cleanerUno2.salary = 240;

        CleanerUno cleanerUno3 = new CleanerUno();
        cleanerUno3.name = "pa";
        cleanerUno3.secondName = "nu";
        cleanerUno3.salary = 245;

        CleanerUno[] cleaners = new CleanerUno[3];
        cleaners[0] = cleanerUno1;
        cleaners[1] = cleanerUno2;
        cleaners[2] = cleanerUno3;

        ManagerUno managerUno1 = new ManagerUno();
        managerUno1.name = "gi";
        managerUno1.secondName =


        ManagerUno[] managers = new ManagerUno[3];
        managers[0] = managerUno1;
        managers[1] = managerUno2;
        managers[2] = managerUno3;

    }

}
