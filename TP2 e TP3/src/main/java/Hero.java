import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;

public class Hero extends Element {

    Hero(int x, int y){
        super(x, y);
    }

    public Position moveUp()
    {
        return new Position(getPosition().getX(), getPosition().getY() - 1);
    }

    public Position moveDown()
    {
        return new Position(getPosition().getX(), getPosition().getY() + 1);
    }

    public Position moveLeft()
    {
        return new Position(getPosition().getX() - 1, getPosition().getY());
    }

    public Position moveRight()
    {
        return new Position(getPosition().getX() + 1, getPosition().getY());
    }

    public void draw(TextGraphics graphics)
    {
        graphics.setForegroundColor(TextColor.Factory.fromString("#FF3333"));
        graphics.enableModifiers(SGR.BOLD);
        graphics.putString(new TerminalPosition(getPosition().getX(), getPosition().getY()), "X");
    }

}
