class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return (Math.PI * (Math.pow(this.radius, 2)));
    }

    public String getDescription() {
        return String.format("Circle with radius %.1f has a area of %.2f", this.radius, this.area());
    }
}
