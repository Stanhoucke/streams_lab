public class Person {

    private String name;
    private int cash;
    private String favColour;

    public Person(String name, int cash) {
        this.name = name;
        this.cash = cash;
    }

    public Person(String name, int cash, String favColour) {
        this.name = name;
        this.cash = cash;
        this.favColour = favColour;
    }

    public String getName() {
        return this.name;
    }

    public int getCash() {
        return this.cash;
    }

    public String getFavColour() { return this.favColour; }


//    @Override
//    public String toString() {
//        return name.toUpperCase();
//    }
}

