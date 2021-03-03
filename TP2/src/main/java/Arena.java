import com.googlecode.lanterna.*;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;

public class Arena {
    private int width;
    private int height;
    Hero hero = new Hero(10, 10);

    Arena(int width, int height, Screen screen){
        this.width = width;
        this.height = height;
        hero = new Hero(10, 10);
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    boolean canHeroMove(Position position)
    {
        return (position.getX() < width && position.getY() < height && position.getX() >= 0 && position.getY() >= 0);
    }


    private void moveHero(Position position) {
        if (canHeroMove(position))
            hero.setPosition(position);
    }

    void processKey(com.googlecode.lanterna.input.KeyStroke key) {
        System.out.println(key);
        switch (key.getKeyType())
        {
            case ArrowDown: {
                moveHero(hero.moveDown());
                break;
            }
            case ArrowUp:{
                moveHero(hero.moveUp());
                break;
            }
            case ArrowLeft:{
                moveHero(hero.moveLeft());
                break;
            }
            case ArrowRight:{
                moveHero(hero.moveRight());
                break;
            }
        }
    }

    void draw(TextGraphics graphics){
        graphics.setBackgroundColor(TextColor.Factory.fromString("#336699"));
        graphics.fillRectangle(new TerminalPosition(0, 0), new TerminalSize(width, height), ' ');
        hero.draw(graphics);
    }
}
