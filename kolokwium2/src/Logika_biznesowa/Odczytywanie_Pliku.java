package Logika_biznesowa;


import java.util.Observable;

public class Odczytywanie_Pliku extends Observable {

    private String stan; //stan to wiersz

    public String getStan() {
        return stan;
    }

    public void setStan(String stan) {
        this.stan = stan;
        setChanged();
        notifyObservers(stan);
    }


}
