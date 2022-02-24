import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TV tv1 = new TV(1, 0);
        int op;
        do {
            if (!tv1.getTvDeschis()) {
                System.out.println("Deschide tv-ul");
                tv1.deschideTv();
                System.out.println("Tv deschis!!");
            }
            System.out.println();
            System.out.println("Meniu ");
            System.out.println("0.Oprire");
            System.out.println("1.Mareste volum");
            System.out.println("2.Micsoreaza volum");
            System.out.println("3.Canal urmator");
            System.out.println("4.Canal precedent");
            System.out.println("5.Afiseaza comenzile");
            System.out.print("Optiune:");
            op = scanner.nextInt();
            scanner.nextLine();
            switch (op) {
                case 0: {
                    tv1.inchideTv();
                    System.out.println("TV inchis");
                    break;
                }
                case 1: {
                    tv1.maresteVol();
                    break;
                }
                case 2: {
                    tv1.scadeVol();
                    break;
                }
                case 3: {
                    tv1.urmatorCanal();
                    break;
                }
                case 4: {
                    tv1.precedentCanal();
                    break;
                }
                case 5: {
                    System.out.println("Volum : " + tv1.getVolum());
                    System.out.println("Canal: " + tv1.getCanal());
                    break;
                }
                default: {
                    System.out.println("Optiune invalida");
                    break;
                }
            }
            System.out.println();

        } while (tv1.getTvDeschis());
    }
}
