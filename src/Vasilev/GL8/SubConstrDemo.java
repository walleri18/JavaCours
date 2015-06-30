package Vasilev.GL8;

// Суперкласс:
class A3{
// Поля суперкласса:
int number;
char symbol;
// Конструктор суперкласса без аргументов:
A3(){
number=0;
symbol='A';
System.out.println("Конструктор без аргументов!");
show();}
// Конструктор суперкласса с одним аргументом:
A3(int n){
number=n;
symbol='B';
System.out.println("Конструктор с одним аргументом!");
show();}
// Конструктор суперкласса с двумя аргументами:
A3(int n,char s){
number=n;
symbol=s;
System.out.println("Конструктор с двумя аргументами!");
show();}
// Метод для отображения полей:
void show(){
System.out.println("Поля "+number+" и "+symbol+".");}
}
// Подкласс:
class B3 extends A3{
// Текстовое поле подкласса:
String text;
// Конструктор подкласса без аргументов:
B3(){
// Вызов конструктора суперкласса (без аргументов):
super();
text="Без аргументов";
showText();}
// Конструктор подкласса с одним аргументом:
B3(String txt){
// Вызов конструктора суперкласса (с одним аргументом):
super(txt.length());
text=txt;
showText();}
// Конструктор подкласса с тремя аргументами:
B3(int n,char s,String txt){
// Вызов конструктора суперкласса (с двумя аргументами):
super(n,s);
text=txt;
showText();}
// Метод для отображения текстового поля:
void showText(){
System.out.println("Текстовое поле \""+text+"\".");}
}
public class SubConstrDemo{
public static void main(String[] args){
// Создание объектов (анонимных) подкласса.
// Используются разные конструкторы:
new B3();
new B3("Один аргумент");
new B3(100,'F',"Три аргумента");}
}