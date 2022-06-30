import org.junit.Assert;
import org.junit.Test;

public class ShapeTests {
    @Test
    public void testCircleOne(){
        Circle circle = new Circle(1);
        Assert.assertEquals("3.14",String.format("%.2f",circle.area()));
        Assert.assertEquals("Circle with radius 1.0 has a area of 3.14", circle.getDescription());
    }

    @Test
    public void testCircleTwo(){
        Circle circle = new Circle(10);
        Assert.assertEquals("314.16",String.format("%.2f",circle.area()));
        Assert.assertEquals("Circle with radius 10.0 has a area of 314.16",circle.getDescription());
    }

    @Test
    public void testRectangleOne(){
        Rectangle rectangle = new Rectangle(2,2);
        Assert.assertEquals(4, rectangle.area(),0.1);
        Assert.assertEquals("Rectangle with a width 2.0 and length 2.0 has a area of 4.0", rectangle.getDescription());
    }

    @Test
    public void testRectangleTwo(){
        Rectangle rectangle = new Rectangle(5,10);
        Assert.assertEquals(50, rectangle.area(),0.1);
        Assert.assertEquals("Rectangle with a width 10.0 and length 5.0 has a area of 50.0", rectangle.getDescription());
    }
}
