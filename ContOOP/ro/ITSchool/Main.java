package ro.ITSchool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op;
        Cont cont1 = new Cont(0, 0);
        do {
            System.out.println();
            System.out.println("Menu cont ");
            System.out.println("1.New cont");
            System.out.println("2.Change information of cont  ");
            System.out.println("3.Data-cont");
            System.out.println("4.See MounthlyInterestRate");
            System.out.println("5.Retragere");
            System.out.println("6.Depozit");
            System.out.println("0.Exit.");
            System.out.print("ENTER YOUR OPTIONS: ");
            op = scanner.nextInt();
            scanner.nextLine();
            switch (op) {
                case 1: {
                    new Cont();
                    System.out.println("Enter the id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter the sold: ");
                    double sold = scanner.nextDouble();
                    cont1.setId(id);
                    cont1.setSold(sold);
                    break;
                }
                case 2: {
                    System.out.println("Menu set:");
                    System.out.println("1.ID");
                    System.out.println("2.SOLD");
                    System.out.println("3.AnualInterestRate");
                    System.out.println("Option: ");
                    int opSet = scanner.nextInt();
                    if (opSet == 1) {
                        System.out.print("Enter new ID: ");
                        int id = scanner.nextInt();
                        cont1.setId(id);
                    } else if (opSet == 2) {
                        System.out.print("Enter new SOLD: ");
                        double sold = scanner.nextDouble();
                        cont1.setSold(sold);

                    } else {
                        System.out.print("Enter new Rate: ");
                        double rate = scanner.nextDouble();
                        cont1.setAnualInterestRate(rate);

                    }
                    break;
                }
                case 3: {
                    cont1.setDataCreated();
                    break;
                }
                case 4: {
                    System.out.print("Mounthly Rate is: ");
                    double m = cont1.getMounthlyInterestRate();
                    System.out.print(m);
                    break;
                }
                case 5: {
                    System.out.println("Enter the sum of sold you want to break: ");
                    double sumBreak = scanner.nextDouble();
                    cont1.retragere(sumBreak);
                    break;

                }
                case 6: {
                    System.out.println("Enter the sum of sold you want to add: ");
                    double sumAdd = scanner.nextDouble();
                    cont1.depozit(sumAdd);
                    break;
                }

            }
            System.out.println();

        } while (op != 0);
    }
}
