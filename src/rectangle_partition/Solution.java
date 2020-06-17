package rectangle_partition;

import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
        int h = in.nextInt();
        var rect = new Rectangle(w, h);

        int countX = in.nextInt();
        int countY = in.nextInt();
        for (int i = 0; i < countX; i++) {
            int x = in.nextInt();
            rect.addVerticalLine(x);
        }
        for (int i = 0; i < countY; i++) {
            int y = in.nextInt();
            rect.addHorizontalLine(y);
        }

        System.out.println(rect.getSubSquares());
    }
}