package converter;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class JPanelApp extends JPanel {

    JComboBox box1;
    JComboBox box2;
    JComboBox comboBox;
    JTextField txt1;
    JTextField txt2;

    public JPanelApp() {
        try {
            setLayout(null);

            UnitType[] items = CreateUnits.create();

            comboBox = new JComboBox(items);
            comboBox.setBounds(10, 10, 450, 30);

            txt1 = new JTextField("0");
            txt1.setBounds(10, 60, 200, 50);

            txt2 = new JTextField("0");
            txt2.setBounds(260, 60, 200, 50);
            txt2.setEditable(false);

            box1 = new JComboBox(items[0].units);
            box1.setBounds(10, 110, 200, 30);

            box2 = new JComboBox(items[0].units);
            box2.setBounds(260, 110, 200, 30);

            JButton calc = new JButton("=");
            calc.setBounds(214, 70, 41, 30);

            add(comboBox);
            add(txt1);
            add(txt2);
            add(box1);
            add(box2);
            add(calc);

            comboBox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    UnitType unitType = (UnitType) comboBox.getSelectedItem();
                    txt1.setText("0");
                    txt2.setText("0");
                    box1.removeAllItems();
                    box2.removeAllItems();
                    for (Unit unit : unitType.units) {
                        box1.addItem(unit);
                        box2.addItem(unit);
                    }
                }
            });

            txt1.addCaretListener(new CaretListener() {
                @Override
                public void caretUpdate(CaretEvent e) {
                    Runnable doCaretUpdate = new Runnable() {
                        @Override
                        public void run() {
                            String text = txt1.getText();
                            for (int i = 0; i < text.length(); i++) {
                                char symb = text.charAt(i);
                                if (symb < '0' || symb > '9') {
                                    if (i == 0) {
                                        text = text.substring(1);
                                    } else if (i == text.length()) {
                                        text = text.substring(0, text.length());
                                    } else {
                                        text = text.substring(0, i) + text.substring(i + 1);
                                    }
                                    i--;
                                }
                            }
                            if (!text.equals(txt1.getText())) {
                                txt1.setText(text);
                            }
                        }
                    };
                    SwingUtilities.invokeLater(doCaretUpdate);
                }
            });

            calc.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    recount();
                }
            });

            box1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    recount();
                }
            });

            box2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    recount();
                }
            });
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void recount() {
        double numb;
        Unit unit1, unit2;
        String text;

        numb = Double.valueOf(txt1.getText());
        unit1 = (Unit) box1.getSelectedItem();
        unit2 = (Unit) box2.getSelectedItem();
        if (unit1 != null && unit2 != null) {
            text = String.valueOf(numb / unit2.power * unit1.power);
            txt2.setText(text);
        }
    }
}
