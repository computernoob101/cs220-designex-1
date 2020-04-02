package number10;

public class Main {
    public static void main(String[] args){
        Passport p1 = new Passport("alicia", Country.CANADA, "00879");
        Passport p2 = new Passport("bob", Country.PAKISTAN, "12347");
        // different person named bob, also from pakistan
        Passport p3 = new Passport("bob", Country.PAKISTAN, "999876");

        CustomsAndBorderPatrol bp = new CustomsAndBorderPatrol();
        // alicia has a visa, but bob #1 does not
        bp.grantVisa(p1);
        bp.grantVisa(p3);


        Traveler t1 = new Traveler(p1);
        t1.addSuitcase(new Suitcase(false));
        Traveler t2 = new Traveler(p2);
        t2.addSuitcase(new Suitcase(false));
        Traveler t3 = new Traveler(p3);
        t3.addSuitcase(new Suitcase(true));

        System.out.println(bp.allowEntry(t1));
        System.out.println(bp.allowEntry(t2));
        System.out.println(bp.allowEntry(t3));
    }
}
