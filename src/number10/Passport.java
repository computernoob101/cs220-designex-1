package number10;

import java.util.Objects;

public class Passport {
    private String name;
    private Country nationality;
    private String number;

    public Passport(String name, Country nationality, String number){
        this.name = name;
        this.nationality = nationality;
        this.number = number;
    }

    public Country getNationality(){
        return this.nationality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return nationality == passport.nationality &&
                Objects.equals(number, passport.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nationality, number);
    }
}
