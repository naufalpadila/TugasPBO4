package main;

import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;


public class Operasi extends JFrame{
    //Judul
    JFrame frame = new JFrame();
    JLabel label = new JLabel("TUGAS Praktikum PBO");
    
    //Jenis Kelamin
    JLabel labelJk = new JLabel("Jenis Kelamin");
    JLabel titikDua1 = new JLabel(" : ");
    JRadioButton rbLk = new JRadioButton(" Laki-Laki ");
    JRadioButton rbPr = new JRadioButton(" Perempuan ");
    ButtonGroup bgJk = new ButtonGroup();
    
    //Agama
    JTextField hasilJk = new JTextField("Jenis Kelamin Belum Dipilih");
    JLabel labelAgama = new JLabel("Agama");
    JLabel titikDua2 = new JLabel(" : ");
    String namaAgama[]
            = {" Islam ", " Kristen ", " Katholik ", " Hindu ", " Budha ", " Konghucu ", " Lainnya "};
    JComboBox cbAgama = new JComboBox(namaAgama);
    JTextField hasilAgama = new JTextField("Islam");
    
    //Kewarganegaraan
    JLabel labelWargaNegara = new JLabel("Kewarganegaraan");
    JLabel titikDua3 = new JLabel(" : ");
    JCheckBox cbWni = new JCheckBox(" WNI ");
    JCheckBox cbWna = new JCheckBox(" WNA ");
    JTextField hasilWargaNegara = new JTextField("Kewarganegaraan Belum Dipilih");
    
    //Golongan Darah
    JLabel labelGoldar = new JLabel ("Golongan Darah ");
    JLabel titikDua4 = new JLabel(" : ");
    JTextField GoldarO = new JTextField("O");
    JTextField GoldarA = new JTextField("A");
    JTextField GoldarB = new JTextField("B");
    JTextField GoldarAB = new JTextField("AB");
    JTextField Goldar = new JTextField();
    JTextField Goldarah = new JTextField();
    
    Font font = new Font("Berlin Sans FB", Font.PLAIN, 25);
    Font font1 = new Font("Times New Roman", Font.BOLD, 25);

    public Operasi() {
        //frame
        frame.setTitle("Tugas Prak PBO");
        frame.setSize(800, 510);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLayout(null);

        //judul
        frame.add(label);
        label.setFont(font1);
        label.setBounds(300, 20, 290, 20);

        //jeniskelamin
        frame.add(labelJk);
        labelJk.setBounds(50, 70, 150, 20);
        frame.add(titikDua1);
        titikDua1.setBounds(185, 70, 150, 20);
        frame.add(rbLk);
        rbLk.setBounds(200, 70, 100, 20);
        frame.add(rbPr);
        rbPr.setBounds(300, 70, 100, 20);
        bgJk.add(rbLk);
        bgJk.add(rbPr);
        rbLk.addItemListener((ItemEvent event) -> {
            if (event.getSource() == rbLk) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    hasilJk.setText("Laki-Laki");
                }
            }
        });
        rbPr.addItemListener((ItemEvent event) -> {
            if (event.getSource() == rbPr) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    hasilJk.setText("Perempuan");
                }
            }
        });
        frame.add(hasilJk);
        hasilJk.setBounds(200, 100, 200, 20);
        hasilJk.setEditable(false);

        //agama
        frame.add(labelAgama);
        labelAgama.setBounds(50, 140, 150, 20);
        frame.add(titikDua2);
        titikDua2.setBounds(185, 140, 150, 20);
        frame.add(cbAgama);
        cbAgama.setBounds(200, 140, 200, 20);
        cbAgama.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                if (cbAgama.getSelectedIndex() == 0) {
                    hasilAgama.setText("Islam");
                } else if (cbAgama.getSelectedIndex() == 1) {
                    hasilAgama.setText("Kristen");
                } else if (cbAgama.getSelectedIndex() == 2) {
                    hasilAgama.setText("Katholik");
                } else if (cbAgama.getSelectedIndex() == 3) {
                    hasilAgama.setText("Hindu");
                } else if (cbAgama.getSelectedIndex() == 4) {
                    hasilAgama.setText("Budha");
                } else if (cbAgama.getSelectedIndex() == 5) {
                    hasilAgama.setText("Konghucu");
                } else if (cbAgama.getSelectedIndex() == 6) {
                    hasilAgama.setText("Lainnya");
                }
            }
        });
        frame.add(hasilAgama);
        hasilAgama.setBounds(200, 170, 200, 20);
        hasilAgama.setEditable(false);

        //WargaNegara
        frame.add(labelWargaNegara);
        labelWargaNegara.setBounds(50, 210, 150, 20);
        frame.add(titikDua3);
        titikDua3.setBounds(185, 210, 150, 20);
        frame.add(cbWni);
        cbWni.setBounds(200, 210, 100, 20);
        frame.add(cbWna);
        cbWna.setBounds(300, 210, 100, 20);
        cbWni.addItemListener((ItemEvent event) -> {
            if (event.getSource() == cbWni) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    hasilWargaNegara.setText("WNI");
                    cbWna.setSelected(false);
                }
            }
        });
        cbWna.addItemListener((ItemEvent event) -> {
            if (event.getSource() == cbWna) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    hasilWargaNegara.setText("WNA");
                    cbWni.setSelected(false);
                }
            }
        });
        frame.add(hasilWargaNegara);
        hasilWargaNegara.setBounds(200, 240, 200, 20);
        hasilWargaNegara.setEditable(false);

        //Goldar
        frame.add(labelGoldar);
        labelGoldar.setBounds(50, 270, 150, 20);
        frame.add(titikDua4);
        titikDua4.setBounds(185, 270, 150, 20);
        frame.add(GoldarO);
        GoldarO.setBounds(25, 300, 150, 20);
        GoldarO.setEditable(false);
        GoldarO.setHorizontalAlignment(JTextField.CENTER);
        GoldarO.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                Goldar.setText(GoldarO.getText());
            }
        });
        frame.add(GoldarA);
        GoldarA.setBounds(225, 300, 150, 20);
        GoldarA.setEditable(false);
        GoldarA.setHorizontalAlignment(JTextField.CENTER);
        GoldarA.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                Goldar.setText(GoldarA.getText());
            }
        });
        frame.add(GoldarB);
        GoldarB.setBounds(425, 300, 150, 20);
        GoldarB.setEditable(false);
        GoldarB.setHorizontalAlignment(JTextField.CENTER);
        GoldarB.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                Goldar.setText(GoldarB.getText());
            }
        });
        frame.add(GoldarAB);
        GoldarAB.setBounds(625, 300, 150, 20);
        GoldarAB.setEditable(false);
        GoldarAB.setHorizontalAlignment(JTextField.CENTER);
        GoldarAB.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                Goldar.setText(GoldarAB.getText());
            }
        });
        frame.add(Goldar);
        Goldar.setBounds(25, 330, 750, 50);
        Goldar.setEditable(false);
        Goldar.setFont(font);
        Goldar.setHorizontalAlignment(JTextField.CENTER);
        Goldar.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                Goldarah.setText(Goldar.getText());
            }
        });
        frame.add(Goldarah);
        Goldarah.setBounds(25, 400, 750, 50);
        Goldarah.setEditable(false);
        Goldarah.setFont(font);
        Goldarah.setHorizontalAlignment(JTextField.CENTER);
    }
    
}
