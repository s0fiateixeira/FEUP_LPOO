import java.util.Objects;

public abstract class Act {

    private final String name;
    private final String country;

    Act(String name, String country){
        this.name = name;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Act act = (Act) o;
        return Objects.equals(name, act.name) && Objects.equals(country, act.country);
    }
}
