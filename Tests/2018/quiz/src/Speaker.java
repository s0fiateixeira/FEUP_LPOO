public class Speaker extends Person{

    private int fee = 0;

    Speaker(String name, int date) {
        super(name, date);
    }

    public int getFee() {
        return fee;
    }

    @Override
    public String toString(){
        return  "Speaker " + this.getName() + " has a fee value of " + fee + ".";
    }
}
