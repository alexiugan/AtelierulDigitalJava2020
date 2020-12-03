package proxy;

public class RealEstateAgentProxy {

    Apartment[] ap;

    public RealEstateAgentProxy(Apartment[] ap)
    {
        this.ap = ap;
    }

    void represent(Apartment ap)
    {
        System.out.println("Apartment{location='" + ap.getLocation() +"', monthlyRentCost=" + ap.getMonthlyRentCost()+"}" );
    }

    void representStudent(Student s)
    {
        System.out.print("Student{name='" + s.getName() +"', money=" + s.getMoney()+"}");
    }

    Apartment rent(Student s)
    {
        int minRent= 9999;
        Apartment apartmentChoice = null;
        for(Apartment a: ap)
        {
            if(a.getMonthlyRentCost() < minRent)
            {
                minRent = a.getMonthlyRentCost();
                apartmentChoice = a;
            }
        }
        if(apartmentChoice.getMonthlyRentCost() <= s.getMoney())
            return apartmentChoice;
        return null;
    }
}
