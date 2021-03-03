import com.googlecode.lanterna.graphics.TextGraphics;

import java.io.IOException;

public abstract class Element {
    private int x;
    private int y;
    private Position position;

    Element(int x, int y){
        this.x = x;
        this.y = y;
        this.position = new Position(x, y);
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public abstract void draw(TextGraphics screen) throws IOException;

}
