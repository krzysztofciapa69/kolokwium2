package GUI;

import javax.swing.*;

public class GUI extends JFrame {
    private JTextField sciezkaDoPlikuPole;
    private JTextField wynikPole;
    private JButton sprawdzPrzycisk;

    public GUI() {
        setTitle("Sprawdzanie Zakazanych Słów");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel sciezkaDoPlikuEtykieta = new JLabel("Ścieżka dostępu do pliku:");
        sciezkaDoPlikuEtykieta.setBounds(10, 10, 200, 25);
        add(sciezkaDoPlikuEtykieta);

        sciezkaDoPlikuPole = new JTextField();
        sciezkaDoPlikuPole.setBounds(10, 40, 360, 25);
        add(sciezkaDoPlikuPole);

        JLabel wynikEtykieta = new JLabel("Wynik:");
        wynikEtykieta.setBounds(10, 70, 100, 25);
        add(wynikEtykieta);

        wynikPole = new JTextField("Negatywny ");
        wynikPole.setBounds(10, 100, 360, 25);
        wynikPole.setEditable(false);
        add(wynikPole);

        sprawdzPrzycisk = new JButton("Sprawdź");
        sprawdzPrzycisk.setBounds(10, 130, 360, 25);
        add(sprawdzPrzycisk);
    }

    public JTextField getSciezkaDoPlikuPole() {
        return sciezkaDoPlikuPole;
    }

    public JButton getSprawdzPrzycisk() {
        return sprawdzPrzycisk;
    }

    public void setWynikPole(String wynik) {
        this.wynikPole.setText(wynik);

    }
}
