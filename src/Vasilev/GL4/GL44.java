package Vasilev.GL4;

import javax.swing.*;

public class GL44 
{
    public static void main(String[] args) 
    {
        int i = 1, j = 1, s1 = 0, s2 = 0, s3 = 0;
        
        int count = Integer.parseInt(JOptionPane.showInputDialog("Введите границу суммы:"));
        
        if (count <= 0) 
        {
            JOptionPane.showMessageDialog(null, "Ошибка ввода!");
            System.exit(0);
        }
        
        String text = "Сумма натуральных чисел от 1 до " + count + ".\n";
        String str1 = "Оператор while: ";
        String str2 = "Оператор do-while: ";
        String str3 = "Оператор for: ";
        
        while (i <= count)
        {
            s1 += i;
            i++;
        }
        
        do
        {
            s2 += j;
            j++;
        } while(j <= count);
        
        for (i = 1;i <= count;i++)
        {
            s3 += i;
        }
        
        str1 += s1 + "\n";
        str2 += s2 + "\n";
        str3 += s3;
        
        JOptionPane.showMessageDialog(null, text + str1 + str2 + str3);
    }
}