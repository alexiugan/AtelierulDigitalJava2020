package lab9.ch3;

import lab9.ch2.Challenge2;

import java.util.concurrent.Flow.Subscriber;

public class Main {
    public static void main(String[] args) {
        Challenge3 ch3 = new Challenge3();
        Subscriber<String> subscriber = new PrintSubscriber();
        ch3.emptyMono().subscribe(System.out::println);
        ch3.monoWithNoSignal().subscribe(System.out::println);
        ch3.fooMono().subscribe(System.out::println);
        ch3.errorMono().subscribe(System.out::println);
    }
}
