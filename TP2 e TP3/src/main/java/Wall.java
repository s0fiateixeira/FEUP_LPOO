import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;


public class Wall extends Element {

    public Wall (int x, int y)
    {
        super(x, y);
    }

    public void draw(TextGraphics graphics)
    {
        graphics.setBackgroundColor(TextColor.Factory.fromString("#33B8FF"));
        graphics.putString(new TerminalPosition(getPosition().getX(), getPosition().getY()), " ");
    }

}
