package Logika_biznesowa;
import GUI.GUI;

import java.util.Arrays;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Obserwator3 implements Observer {
    private List<String> slowaZakazane = Arrays.asList("bomba", "zamach", "pistolet");
    private Boolean czy_pozytywny = true;


    public Boolean getCzy_pozytywny() {
        return czy_pozytywny;
    }

    boolean czy_zawiera_slowa_zakazane(String wiersz) throws Zakazane_Slowo_Exception {
        String wierszMale = wiersz.toLowerCase();
        for (String slowo : slowaZakazane) {
            if (wierszMale.contains(slowo)) {
                throw new Zakazane_Slowo_Exception("Plik zawiera zakazane słowo: " + slowo);
            }
        }
        return false;
    }

    @Override
    public void update(Observable o, Object arg) {
        String wiersz = (String) arg;

        try {
            czy_zawiera_slowa_zakazane(wiersz);

        } catch (Zakazane_Slowo_Exception e) {
            System.out.println(e.getMessage());
            czy_pozytywny = false;
        }

    }

}
