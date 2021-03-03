import com.googlecode.lanterna.*;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;

import java.util.ArrayList;
import java.util.List;


public class Arena {
    private List<Wall> walls;
    private int width;
    private int height;
    Hero hero = new Hero(10, 10);

    Arena(int width, int height, Screen screen){
        this.width = width;
        this.height = height;
        hero = new Hero(10, 10);
        this.walls = createWalls();
    }

    private List<Wall> createWalls() {
        List<Wall> walls = new ArrayList<>();

        for (int c = 0; c < width; c++) {
            walls.add(new Wall(c, 0));
            walls.add(new Wall(c, height - 1));
        }

        for (int r = 1; r < height - 1; r++) {
            walls.add(new Wall(0, r));
            walls.add(new Wall(width - 1, r));
        }
        return walls;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    boolean canHeroMove(Position position)
    {
        if (position.getX() < width && position.getY() < height
                && position.getX() >= 0 && position.getY() >= 0)
        {
            for (Wall wall : walls)
            {
                if (wall.getPosition().equals(position))
                    return false;
            }
            return true;
        } else return false;
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
        for (Wall wall : walls)
            wall.draw(graphics);
    }
}
