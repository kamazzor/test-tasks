package ru.mytasks;

public class Main {
    // Тест-класс и вывод
    public static void main(String args[]) {
        B b = new B();
    }

}

    class A{

        A(){
            System.out.println("Конструктор без аргументов класса mytasks.A");
        }

        A(String args){
            System.out.println("Конструктор с одним аргументом класса mytasks.A");
        }
    }

    class B extends A{

        B(){
            this(""); // вызов конструктора с одним аргументом класса mytasks.B
            System.out.println("Конструктор без аргументов класса mytasks.B");
        }

        B(String args){
            super(""); // вызов конструктора с одним аргументом класса mytasks.A
            System.out.println("Конструктор с одним аргументом класса mytasks.B");
        }
    }
