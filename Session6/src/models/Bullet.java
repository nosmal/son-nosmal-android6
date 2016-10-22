package models;

import java.awt.*;

/**
 * Created by apple on 10/4/16.
 */
public class Bullet extends  GameObject {
    public static final int BULLET_WIDTH = 10;
    public static final int BULLET_HEIGHT = 15;

    public Bullet(int x, int y) {
        super(x, y, BULLET_WIDTH, BULLET_HEIGHT);
    }
}
