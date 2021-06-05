public class Attendee extends Person{

    Attendee(String name) {
        super(name);
    }

    Attendee(String name, int date){
        super(name, date);
    }

    @Override
    public String toString(){
        return  "Attendee " + this.getName() + (hasPaid() ? " has" : " hasn't") + " paid its registration.";
    }
}
