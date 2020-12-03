package proxy;

public class Main {
    public static void main(String[] args) {
        Apartment ap01 = new Apartment("Crangasi01", 300);
        Apartment ap02 = new Apartment("Crangasi01", 600);
        Apartment ap03 = new Apartment("Crangasi01", 350);
        Apartment ap04 = new Apartment("Crangasi01", 400);
        Apartment ap05 = new Apartment("Crangasi01", 200);

        RealEstateAgentProxy proxy = new RealEstateAgentProxy(new Apartment[]{ap01,ap02,ap03,ap04,ap05});
        proxy.represent(ap01);
        proxy.represent(ap02);
        proxy.represent(ap03);
        proxy.represent(ap04);
        proxy.represent(ap05);

        Student student01 = new Student("Ionescu", 500);
        Student student02 = new Student("Popescu", 330);

        Apartment apartmentForStudent01 = proxy.rent(student01);
        proxy.representStudent(student01);
        System.out.print(" rented ");
        proxy.represent(apartmentForStudent01);

        Apartment apartmentForStudent02 = proxy.rent(student02);
        proxy.representStudent(student02);
        System.out.print(" rented ");
        proxy.represent(apartmentForStudent02);
    }
}
