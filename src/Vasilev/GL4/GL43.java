package Vasilev.GL4;

import javax.swing.*;

public class GL43 
{
    public static void main(String[] args) 
    {
        int num;
        
        String text, str;
        
        text = JOptionPane.showInputDialog("Введите число от 0 до 10:");
        
        num = Integer.parseInt(text);
        
        switch (num){
            case 0:
                str = "Вы ввели нулевое значение!";
                break;
            case 1:
                str = "Вы ввели единичное значение!";
                break;
            case 2:
            case 3:
            case 5:
            case 7:
                str = "Вы ввели простое число!";
                break;
            case 4:
            case 6:
            case 8:
            case 10:
                str = "Вы ввели чётное число!";
                break;
            default:
                str = "Вы ввели число 9 или\nвыходящее за пределы диапозона!";
        }
        JOptionPane.showMessageDialog(null, str);
                
    }
}
