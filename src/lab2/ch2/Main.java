package lab2.ch2;

public class Main {
    public static void main(String[] args) {
        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2018 = new Premiu("oscar", 2018);

        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[]{oscar1990,oscar2000});
        Actor actorOscar2010 = new Actor("actor cu oscar din 2010", 55, new Premiu[]{oscar2010});
        Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new Premiu[]{oscar2018});
        Actor actorFaraPremii01 = new Actor("actor fara oscar 01", 33, new Premiu[]{});
        Actor actorFaraPremii02 = new Actor("actor fara oscar 02", 60, new Premiu[]{});
        Actor actorFaraPremii03 = new Actor("actor fara oscar 03", 20, new Premiu[]{});

        Film film1 = new Film(1990, "film cu actori de oscar", new Actor[]{actorOscar1990, actorFaraPremii01});
        Film film2 = new Film(2010, "film cu actori fara premii2", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film3 = new Film(2010, "film cu actori fara premii3", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film4 = new Film(2018, "film cu actori de oscar", new Actor[]{actorOscar2010, actorOscar2018 ,actorFaraPremii02});
        Film film5 = new Film(2018, "film cu actori fara premii5", new Actor[]{actorFaraPremii02, actorFaraPremii03});

        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});

        Studio[] studioDatabase = new Studio[]{studio1, studio2};

        System.out.println("Studios with more than two movies:");
        for(Studio studio: studioDatabase)
        {
            if(studio.getFilme().length > 2)
                System.out.println(studio.getNume());
        }

        System.out.println("Studios where \"actor cu 2 oscaruri\" plays:");
        for(Studio studio: studioDatabase)
        {
            boolean actorFound = false;
            for(Film film:studio.getFilme()) {
                for(Actor actor: film.getActori())
                {
                    if(actor.getNume().equals("actor cu 2 oscaruri"))
                        actorFound = true;
                }
            }
            if(actorFound)
                System.out.println(studio.getNume());
        }

        System.out.println("Movies where an actor over 50 plays:");

        Film[] filmArr = new Film[]{film1,film2,film3,film4,film5};
        for(Film film:filmArr) {
            boolean actorFound = false;
            for(Actor actor: film.getActori())
            {
                if(actor.getVarsta() > 50)
                    actorFound = true;
            }
            if(actorFound)
                System.out.println(film.getNume());
        }

    }
}