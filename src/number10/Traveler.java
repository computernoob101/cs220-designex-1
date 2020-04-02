package number10;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Traveler implements Iterable<Suitcase> {
    private Passport passport;

    private List<Suitcase> bags = new LinkedList<>();

    public Iterator<Suitcase> iterator() {
        return bags.iterator();
    }

    public Passport getPassport() {
        return passport;
    }

    public Traveler(Passport passport){
        this.passport = passport;
    }

    public void addSuitcase(Suitcase suitcase){
        this.bags.add(suitcase);
    }
}
