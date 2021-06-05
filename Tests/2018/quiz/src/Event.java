import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Event {

    private String title = "";
    private String date = "";
    private String description = "";

    List<Person> people = new ArrayList<>();

    Event(String title){
        this.title = title;
    }

    Event(String title, String date){
        this.title = title;
        this.date = date;
    }

    Event(String title, String date, String description){
        this.date = date;
        this.description = description;
        this.title = title;
    }

    Event(Event e){
        this.date = e.getDate();
        this.title = e.getTitle();
        this.description = e.getDescription();
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString(){
        return  this.title + " is a " + this.description + " and will be held at " + this.date + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event)) return false;
        Event event = (Event) o;
        return getTitle().equals(event.getTitle()) && getDate().equals(event.getDate()) && getDescription().equals(event.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getDate(), getDescription());
    }

    void addPerson(Person p){
        people.add(p);
    }

    int getAudienceCount(){
        return people.size();
    }
}
