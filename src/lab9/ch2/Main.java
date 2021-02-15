package lab9.ch2;

public class Main {
    public static void main(String[] args) {
        Challenge2 ch2 = new Challenge2();
        ch2.emptyFlux().subscribe(System.out::println);
        ch2.fooBarFluxFromValues().subscribe(System.out::println);
        ch2.errorFlux().subscribe(System.out::println);
    }
}
