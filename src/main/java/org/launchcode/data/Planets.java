package src.main.java.org.launchcode.data;

public enum Planets {;
    private final String name;
    private final String yearLength;
    Planets(String name,String yearLength) {
        this.name = name;
        this.yearLength = yearLength;
    }

    public String getYearLength() {
        return yearLength;
    }

    public String getName() {
        return name;
    }
}
