package hashCode;

import java.util.Objects;

public class Ninja {
    private String name;
    private int honor;

    public Ninja(String name, int honor){
        this.name = name;
        this.honor = honor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ninja ninja = (Ninja) o;
        return honor == ninja.honor &&
                Objects.equals(name, ninja.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, honor);
    }

    public static void main(String[] args){
        Ninja n1 = new Ninja("alicia", 100);
        Ninja n2 = new Ninja("bob", 99);
        Ninja n3 = new Ninja("alicia", 100);

        System.out.println(n1 == n2);
        System.out.println(n1.equals(n2));
        System.out.println(n1.equals(n3));

        System.out.println(n1.hashCode());
        System.out.println(n3.hashCode());



    }
}
