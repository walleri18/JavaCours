package Vasilev.GL8;

// Интерфейс:
interface Base2{
// Метод объявлен в интерфейсе:
void show();}
// Класс реализует интерфейс:
class A1 implements Base2{
// Описание метода интерфейса:
@Override
public void show(){
System.out.println("Это метод класса A!");}
}
// Этот класс также реализует интерфейс:
class B1 implements Base2{
// Описание метода интерфейса:
@Override
public void show(){
System.out.println("Это метод класса B!");}
}
public class InterfaceRefDemo {
public static void main(String[] args){
// Интерфейсная переменная:
Base2 ref;
// Ссылка на объект первого класса:
ref=new A1();
// Вызов метода через интерфейсную переменную:
ref.show();
// Ссылка на объект второго класса:
ref=new B1();
// Вызов того же метода через интерфейсную переменную:
ref.show();}
}
