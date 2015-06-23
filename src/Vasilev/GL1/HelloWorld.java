package Vasilev.GL1;

import javax.swing.*;

public class HelloWorld {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Добрый день! Как Вас зовут?");
        JOptionPane.showMessageDialog(null, "Приятно познакомиться, \n" + name + "!");
    }
}
