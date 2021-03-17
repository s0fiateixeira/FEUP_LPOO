public interface Drawable extends Shape{
    default void draw(){
        System.out.println(this.getClass().getName());
    }
}
