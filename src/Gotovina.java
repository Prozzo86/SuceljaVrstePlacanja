public class Gotovina implements Placanje{

    private double konacanIznos;

    @Override
    public void platiti(double iznos) {
        this.konacanIznos += iznos;
    }

    @Override
    public String getDetalji() {
        return "Plaćanje u gotovini u iznosu od: " + this.konacanIznos + " EUR.";
    }

    public double getKonacanIznos() {
        return this.konacanIznos;
    }

    public void setKonacanIznos(double konacanIznos) {
        this.konacanIznos = konacanIznos;
    }

    public Gotovina(double konacanIznos) {
        this.konacanIznos = konacanIznos;
    }

    public Gotovina() {
    }
}
