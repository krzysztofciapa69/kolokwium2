package Logika_biznesowa;

import java.util.Observable;
import java.util.Observer;

public class Obserwator1 implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        String wiersz = (String)arg;
        System.out.println(wiersz);
    }
}
