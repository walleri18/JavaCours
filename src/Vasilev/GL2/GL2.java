package Vasilev.GL2;

import javax.swing.*;

public class GL2 {
    public static void main(String[] args) {
        String name = "Туров Виталий";
        int age = 18;
        char category = 'B';
        String text = "Водитель: " + name;
        text += "\n" + "Возраст: " + age + " лет";
        text += "\n" + "Права категории: " + category;
        JOptionPane.showMessageDialog(null, text);
    }
}
