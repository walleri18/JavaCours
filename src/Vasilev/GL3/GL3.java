package Vasilev.GL3;

import javax.swing.*;

public class GL3 
{
    public static void main(String[] args) 
    {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Введите число:"));
        
        String text = number % 2 == 0 ? "чётное" : "нечётное";
        
        JOptionPane.showMessageDialog(null, "Вы ввели " + text + " число!");
    }
}
