import GUI.GUI;
import Logika_biznesowa.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                GUI gui = new GUI();
                gui.setVisible(true);

                gui.getSprawdzPrzycisk().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        String sciezka_do_pliku = gui.getSciezkaDoPlikuPole().getText();


                        Odczytywanie_Pliku dokument_obserwowany = new Odczytywanie_Pliku();
                        Obserwator1 obserwator1 = new Obserwator1();
                        Obserwator2 obserwator2 = new Obserwator2();
                        Obserwator3 obserwator3 = new Obserwator3();

                        obserwator2.setLicznik_slow(0);


                        dokument_obserwowany.addObserver(obserwator1);
                        dokument_obserwowany.addObserver(obserwator2);
                        dokument_obserwowany.addObserver(obserwator3);

                        try (BufferedReader br = new BufferedReader(new FileReader(sciezka_do_pliku))) {
                            String wiersz;
                            while ((wiersz = br.readLine()) != null){
                                dokument_obserwowany.setStan(wiersz);
                            }
                            if(obserwator3.getCzy_pozytywny()){
                                gui.setWynikPole("Pozytywny");
                            }
                            else{
                                gui.setWynikPole("Negatywny");
                            }
                            System.out.println("Słów w dokumencie: "+ obserwator2.getLicznik_slow());
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }

                    }
                });
            }
        });
    }
}
