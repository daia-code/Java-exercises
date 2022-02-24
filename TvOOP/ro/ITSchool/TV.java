public class TV {
    private int canal;
    private int volum;
    private boolean tvDeschis;

    public TV(int canal, int volum) {
        this.canal = canal;
        this.volum = volum;
        this.tvDeschis = false;
    }

    public boolean getTvDeschis() {
        return tvDeschis;
    }

    public void inchideTv() {
        this.tvDeschis = false;
    }

    public void deschideTv() {
        this.tvDeschis = true;
    }

    public void urmatorCanal() {
        if (canal == 100) {
            canal = 1;
        } else {
            canal = canal + 1;
        }
    }

    public int getCanal() {
        return canal;
    }

    public void precedentCanal() {
        if (canal == 1) {
            canal = 100;
        } else if (canal <= 100) {
            canal = canal - 1;
        }
    }

    public void maresteVol() {
        if (volum <= 50) {
            volum = volum + 1;
        }
    }

    public void scadeVol() {
        if (volum > 0) {
            volum = volum - 1;
        }
    }

    public int getVolum() {
        return volum;
    }
}
