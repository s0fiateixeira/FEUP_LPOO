import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Concert {

    private String city;
    private String country;
    private String date;

    List<Act> acts = new ArrayList<>();

    Concert(String city, String country, String date){
        this.city = city;
        this.country = country;
        this.date = date;
    }

    public String getCountry() {
        return country;
    }

    public List<Act> getActs() {
        return acts;
    }

    public String getCity() {
        return city;
    }

    public String getDate() {
        return date;
    }

    void addAct(Act a){
        acts.add(a);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Concert concert = (Concert) o;
        return Objects.equals(city, concert.city) && Objects.equals(country, concert.country) && Objects.equals(date, concert.date) && Objects.equals(acts, concert.acts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, country, date, acts);
    }


    boolean isValid(Ticket ticket){
        return this.city.equals(ticket.getConcert().getCity()) && this.country.equals(ticket.getConcert().getCountry()) && this.date.equals(ticket.getConcert().getDate());
    }


    boolean participates(Artist artist){
        for (Act act : acts) {
            if (act.equals(artist)) return true;
        }
        return false;
    }
}
