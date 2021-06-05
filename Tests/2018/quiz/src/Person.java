public abstract class Person {
    private String name;
    private int age;
    boolean paid = false;

    Person(String name){
        this.name = name;
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    boolean hasPaid(){
        return paid;
    }
}
