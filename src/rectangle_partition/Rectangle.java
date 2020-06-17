package rectangle_partition;

import java.util.ArrayList;

public class Rectangle {
    private final int width;
    private final int height;
    private final ArrayList<Integer> verticalLines = new ArrayList<>();
    private final ArrayList<Integer> horizontalLines = new ArrayList<>();

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        verticalLines.add(0, 0);
        horizontalLines.add(0, 0);
    }

    public void addVerticalLine(int position) {
        this.verticalLines.add(position);
    }

    public void addHorizontalLine(int position) {
        this.horizontalLines.add(position);
    }

    public int getSubSquares() {
        verticalLines.add(this.width);
        horizontalLines.add(this.height);

        var count = 0;

        for (var xl = 0; xl < verticalLines.size(); xl++)
        {
            var leftSide = verticalLines.get(xl);

            for (var xr = verticalLines.size() - 1; xr > xl; xr--)
            {
                var rightSide = verticalLines.get(xr);

                for (var yt = 0; yt < horizontalLines.size(); yt++)
                {
                    var topSide = horizontalLines.get(yt);

                    for (var yb = horizontalLines.size() - 1; yb > yt; yb--)
                    {
                        var bottomSide = horizontalLines.get(yb);

                        if (rightSide - leftSide == bottomSide - topSide)
                            count++;
                    }
                }
            }
        }

        return count;
    }
}
