public class KreditnaKartica implements Placanje{

    private double konacanIznos = 0;

    @Override
    public void platiti(double iznos) {
        this.konacanIznos += iznos;
    }

    @Override
    public String getDetalji() {
        return "Plaćanje putem kreditne kartice u iznosu od: " + this.konacanIznos + " EUR.";
    }

    public double getKonacanIznos() {
        return this.konacanIznos;
    }

    public void setKonacanIznos(double konacanIznos) {
        this.konacanIznos = konacanIznos;
    }

    public KreditnaKartica() {
    }

    public KreditnaKartica(double konacanIznos) {
        this.konacanIznos = konacanIznos;
    }
}
