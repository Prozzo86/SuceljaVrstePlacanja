public class PayPal implements Placanje{

    private double konacanIznos;

    @Override
    public void platiti(double iznos) {
        this.konacanIznos += iznos;
    }

    @Override
    public String getDetalji() {
        return "Plaćanje putem PayPala u iznosu od: " + this.konacanIznos + " EUR.";
    }

    public double getKonacanIznos() {
        return this.konacanIznos;
    }

    public void setKonacanIznos(double konacanIznos) {
        this.konacanIznos = konacanIznos;
    }

    public PayPal(double konacanIznos) {
        this.konacanIznos = konacanIznos;
    }

    public PayPal() {
    }
}
