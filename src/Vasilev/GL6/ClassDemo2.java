package Vasilev.GL6;

import javax.swing.*;
// Описание класса:
class MyClass{
int num;
char symb;
String text;
// Метод класса:
String showText(){
// Локальная текстовая переменная:
String str="Значения полей объекта:\n";
// Формирование результата (значения локальной переменной):
str+="num="+num+"\n";
str+="symb="+symb+"\n";
str+="text="+text;
// Метод возвращает значение:
return str;
}
}
// Главный класс программы:
public class ClassDemo2{
public static void main(String[] args){
MyClass obj=new MyClass();
// Заполнение полей объекта:
obj.num=12;
obj.symb='A';
obj.text="Текстовое поле";
// Отображение окна:
JOptionPane.showMessageDialog(null,obj.showText());}
}