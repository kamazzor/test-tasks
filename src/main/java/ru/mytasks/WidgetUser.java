package ru.mytasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

class Widget {

    String data = "data";
    public void doWidgetStuff() {
        System.out.println(data);
    }

}

class GoodWidget extends Widget{
    String data = "big data";

    public void doWidgetStuff() {
    }
}

public class WidgetUser{
    public static void main(String[] args) {
        Widget w = new GoodWidget();
        ((Widget)w).doWidgetStuff();

//        reduceWith3Parameters();
        simpleReduce();

        Phone[] rosterAsArray = new Phone[10];
        Arrays.sort(rosterAsArray, Phone::compareByName);
    }
    //Sum phone prices less that 50000 using reduce. First param of reduce is initial param,
    // second param is BinaryFunction sum 2 current near numbers and hold that sum as temporal value,
    // third param is function to summarize all temporal values from second param
    private static void reduceWith3Parameters() {
        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 6 S", 54000),
                new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000),
                new Phone("LG G 4", 32000));

        int sum = phoneStream.reduce(0,
                (x,y)-> {
                    if(y.getPrice()<50000)
                        return x + y.getPrice();
                    else
                        return x;
                },
                (x, y)->x+y);

        System.out.println(sum); // 117000
    }

    //Sum numbers less that 5 using reduce.
    private static void simpleReduce() {
        Stream<Integer> numberStream = Stream.of(1, 2, 3, 4, 5, 6);
        int result = numberStream.reduce(0, (sum, y) -> {

            System.out.println("-------");
            System.out.println("y=" + y);
            System.out.println("sum=" + sum);

            return y < 5 ? sum + y : sum;
        });

        System.out.println(result);
    }

    //Represents a predicate (boolean-valued function) of one argument.
    // This interface is used when you want to check for some condition
    public void updateBalance(double bal ){
        Predicate<Double> p = val -> val>=0.0; //use lamba expression to create a Predicate
        boolean isOK = p.test(bal);
        //other irrelevant code
    }




}
