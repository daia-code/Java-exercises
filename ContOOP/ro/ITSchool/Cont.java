package ro.ITSchool;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cont {
    private int id = 0;
    private double sold = 0;
    private double anualInterestRate;
    private Date date;

    public Cont() {

    }

    public Cont(int id, double sold) {
        this.id = id;
        this.sold = sold;

    }

    public void setId(int id) {
        this.id = id;

    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    public void setAnualInterestRate(double anualInterestRate) {
        this.anualInterestRate = anualInterestRate;
    }

    public int getId() {
        return id;
    }

    public double getSold() {
        return sold;
    }

    public double getAnualInterestRate() {
        return anualInterestRate;
    }

    public void setDataCreated() {

        DateFormat dateFormat = new SimpleDateFormat("yyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        System.out.println("ID----SOLD----RATE");
        System.out.println(getId() + "    " + getSold() + "   " + getAnualInterestRate());


    }

    public double getMounthlyInterestRate() {
        return sold * (1 + (anualInterestRate / 12));
    }

    public void retragere(double r) {
        if (r <= sold) {
            sold = sold - r;
            System.out.println("Operation have succesfull");
        } else {
            System.out.println("Your sold is insuficient");
        }
    }

    public void depozit(double depozit) {
        sold += depozit;
    }
}
