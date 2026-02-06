public class Circle() {
    private double radius;
    private double originX = 0.0;
    private double originY = 0.0;

    public Circle(double radius, double originX, double originY){
        this.radius = radius;
        this.originX = originX;
        this.originY = originY;
    }

    public Circle(double radius){
        this.Circle(radius, 0, 0);
    }

    public Circle(){
        this.Circle(1, 0, 0);
    }

    public String toString(){
        return "Circle[x="+originX+",y="+originY+",r="+radius+"]";
    }

    public double getRadius(){
        return radius
    }

    public void setRadius(double radius){
        if (radius >= 0) {
            this.radius = radius;
        }
    }

    public double getOriginX(){
        return originX
    }

    public void setOriginX(double originX) {
        this.originX = originX;
    }

    public double getOriginY(){
        return originY
    }

    public void setOriginY(double originY) {
        this.originY = originY;
    }

    public double getArea(){
        return double(3.14159*radius*radius)
    }

    public double getCircumference(){
        return double(2*3.14159*radius)
    }

    public void move(double dx, double dy) {
	   originX += dx;
	   originY += dy;
    }

    public void scale(double scale) {
        radius *= scale;
    }

    public boolean isEnclosedBy(Circle c1){
        double oX2 = this.originX
        double r2 = this.radius
        double oX1 = c1.getOriginX()
        double or = c1.getRadius()
        double oY1 = c1.getOriginY()
        double oY2 = this.getOriginY()
        if ((oX2 + r2 > oX1 + or) && (oX2 - r2 < oX1 + or) && (oY2 + r2 > oY1 + or) && (oY2 - r2 < oY1 + or)){
            return true;
        }
        return false;
    }
}
