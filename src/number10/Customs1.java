package number10;

import java.util.HashSet;
import java.util.Set;

public class Customs1 {
    static {
        visas = new HashSet<>();
        // TODO: read travelers out of file
        // and grant them visas
    }
    private static Set<Traveler> visas;

    public static boolean hasVisa(Traveler traveler){
        return visas.contains(traveler);
    }

    public static void grantVisa(Traveler traveler) {
        // Problem #1: Travelers know about their suitcases
        // But, the state department does not care about suitcases
        // when granting visas.
        // TODO: refactor traveler into entity with bags and the actual person
        visas.add(traveler);
    }
}
