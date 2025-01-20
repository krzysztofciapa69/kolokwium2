package Logika_biznesowa;

import java.util.Observable;
import java.util.Observer;

public class Obserwator2 implements Observer {
    private int licznik_slow;

    @Override
    public void update(Observable o, Object arg) {
        String wiersz = (String)arg;
        //String[] slowa_w_wierszu = wiersz.split("\\W+"); ta wersja liczy np. czerwono-niebieski jako 2 slowa, ale wedlug slownika jest to 1 slowo

        if(wiersz.isEmpty() == false){
            String[] slowa_w_wierszu = wiersz.split("\\s+"); // ta wersja rozdziela wg spacji, nawet jesli powtorzt sie kilkukrotnie
            licznik_slow += slowa_w_wierszu.length;
        }
    }

    public int getLicznik_slow() {
        return licznik_slow;
    }

    public void setLicznik_slow(int licznik_slow) {
        this.licznik_slow = licznik_slow;
    }
}
