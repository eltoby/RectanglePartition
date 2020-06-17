package rectangle_partition.test;

import org.junit.jupiter.api.Test;
import rectangle_partition.Rectangle;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    @Test
    public void squareNoLines() {
        var rect = new Rectangle(3, 3);
        assertEquals(1, rect.getSubSquares());
    }

    @Test
    public void rectangleNoLines() {
        var rect = new Rectangle(3, 2);
        assertEquals(0, rect.getSubSquares());
    }

    @Test
    public void divisionsExample() {
        var rect = new Rectangle(10, 5);
        rect.addVerticalLine(2);
        rect.addVerticalLine(5);
        rect.addHorizontalLine(3);

        assertEquals(4, rect.getSubSquares());
    }

}