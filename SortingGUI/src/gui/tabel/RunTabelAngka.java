package gui.tabel;

import javax.swing.*;

import java.awt.*;

import java.net.URL;

public class RunTabelAngka {
    public static void main(String[] args) {

        ImageIcon ImageIcon = new ImageIcon("dta/burger.jpg");
        JFrame gambar = new JFrame("Sorting Data Sederhana Skuy!");
        gambar.setIconImage(ImageIcon.getImage());
        gambar.setContentPane(new TabelAngka().getRootPanel());
        gambar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gambar.setSize(725,430);
        gambar.setLocationRelativeTo(null);
        gambar.setVisible(true);
    }
}
