package number10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CustomsAndBorderPatrol {
    private Set<Passport> visas = new HashSet<>();
    private Map<Passport, History> history = new HashMap<>();

    public void grantVisa(Passport passport){
        this.visas.add(passport);
    }
    private boolean hasVisa(Passport passport){
        return visas.contains(passport);
    }

    public void addCriminalRecord(Passport passport, CriminalRecord record){
        if (!history.containsKey(passport)){
            history.put(passport, new History());
        }
        history.get(passport).addCriminalRecord(record);
    }

    private boolean hasContraband(Traveler traveler){
        for (Suitcase s : traveler){
            if (s.containsContraband()){
                return false;
            }
        }
        return true;
    }

    private boolean hasCleanBackground(Passport passport){
        // two ways to return true:
        // 1: no criminal history
        // 2: criminal history is minor and/or explained
        return !history.containsKey(passport) || history.get(passport).allExplained();
    }

    public boolean allowEntry(Traveler traveler){
        Passport passport = traveler.getPassport();
        if (passport.getNationality() != Country.USA && !hasVisa(passport)){
            return false;
        }
        if (passport.getNationality() != Country.USA && !hasCleanBackground(passport)){
            return false;
        }
        if (hasContraband(traveler)){
            return false;
        }
        return true;
    }


}
