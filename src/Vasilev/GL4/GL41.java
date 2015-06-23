package Vasilev.GL4;

import javax.swing.*;

public class GL41 
{
    public static void main(String[] args) 
    {
        double x, y;
        
        String title = "Деление чисел";
        
        String text = "Результат деления: ";
        
        int type;
        
        x = Double.parseDouble(JOptionPane.showInputDialog("Числитель:"));
        
        y = Double.parseDouble(JOptionPane.showInputDialog("Знаменатель:"));
        
        if (y != 0)
        {
            type = JOptionPane.PLAIN_MESSAGE;
            text += x + "/" + y + "=" + x/y;
        }
        else 
        {
            type = JOptionPane.ERROR_MESSAGE;
            text += "ДЕЛЕНИЕ НА НОЛЬ!!!";
        }
        
        JOptionPane.showMessageDialog(null, text, title, type);
    }
}
