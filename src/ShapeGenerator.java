import java.util.Random;

public class ShapeGenerator {
    public static Shape generateShape() {
        Random ranNum = new Random();
        int coinToss = ranNum.nextInt(2);
        double radiusOrLength = ranNum.nextInt(100) + 1;
        double width = ranNum.nextInt(100) + 1;

        if (coinToss == 0) {
            return new Circle(radiusOrLength);
        } else {
            return new Rectangle(radiusOrLength, width);
        }
    }

}
