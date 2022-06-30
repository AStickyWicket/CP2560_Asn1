public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];

        int i = 0;
        for (Shape shape :
                shapes) {
            shape = ShapeGenerator.generateShape();
            shapes[i] = shape;
            i++;
            System.out.println(shape.getDescription());
        }
    }
}
