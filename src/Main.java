/*
Zadatak: Sučelje za Različite Tipove Plaćanja

Opis zadatka:

- Kreirajte aplikaciju koja koristi sučelje za implementaciju različitih metoda plaćanja.
- Svaka vrsta plaćanja treba imati svoju specifičnu implementaciju za metodu platiti(), a vrsta plaćanja može biti: kreditna kartica, gotovina ili PayPal.

1. Definirajte sučelje Placanje s dvije metode:
- void platiti(double iznos) – metoda koja prima iznos i obrađuje plaćanje za navedeni iznos.
- String getDetalje() – metoda koja vraća detalje o transakciji, poput vrste plaćanja i iznosa.

2. Kreirajte 3 klase koje implementiraju sučelje Placanje:
- KreditnaKartica: Klasa koja implementira metodu za plaćanje putem kreditne kartice.
- Gotovina: Klasa koja implementira metodu za plaćanje u gotovini.
- PayPal: Klasa koja implementira metodu za plaćanje putem PayPala.

3. Glavna klasa: U glavnoj metodi, korisnik unosi iznos koji želi platiti.
Zatim, na temelju odabrane metode plaćanja (kreditna kartica, gotovina ili PayPal), program treba pozvati odgovarajuću metodu za plaćanje.
Ispišite odgovarajuće poruke za svaku vrstu plaćanja, uključujući i detalje o transakciji, pozivajući metodu getDetalje():
- "Plaćanje putem kreditne kartice u iznosu od: 200.00 EUR."
- "Plaćanje u gotovini u iznosu od: 150.00 EUR."
- "Plaćanje putem PayPala u iznosu od: 100.00 EUR."
*/

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean unosPrekinut = false;

        Placanje kreditnaKartica = new KreditnaKartica();
        Placanje gotovina = new Gotovina();
        Placanje paypal = new PayPal();

        while (!unosPrekinut) {
            System.out.println("Unesite iznos za plaćanje:");
            double iznos = scanner.nextDouble();

            System.out.println("Odaberite način plaćanja:");
            System.out.println("1. Kreditna kartica");
            System.out.println("2. Gotovina");
            System.out.println("3. PayPal");
            System.out.println("0. Izlaz");

            int izbor = scanner.nextInt();

            switch (izbor) {
                case 1:
                    kreditnaKartica.platiti(iznos);
                    System.out.println(kreditnaKartica.getDetalji());
                    break;
                case 2:
                    gotovina.platiti(iznos);
                    System.out.println(gotovina.getDetalji());
                    break;
                case 3:
                    paypal.platiti(iznos);
                    System.out.println(paypal.getDetalji());
                    break;
                case 0:
                    unosPrekinut = true;
                    continue;
                default:
                    System.out.println("Nevažeći unos, pokušajte ponovno.");
                    continue;
            }

            System.out.println("Želite li obaviti još jedno plaćanje? (1 = Da, 0 = Ne)");
            int nastavak = scanner.nextInt();
            if (nastavak == 0) {
                unosPrekinut = true;
            }
        }

        System.out.println("Izlaz...");
    }
}