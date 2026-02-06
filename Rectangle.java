// A Rectangle class
public class Rectangle {
  
  // 4 instance attributes
  private double width;
  private double height;
  public double originX = 0.0;
  public double originY = 0.0;

  // 1 static attributes
  public static final int NUMBER_OF_SIDES = 4;

  // main constructor
  public Rectangle(double width, double height, double originX, double originY) {
    this.width = width;
    this.height = height;
    this.originX = originX;
    this.originY = originY;
  }

  // second constructor: 
  public Rectangle(double width, double height) {
    this(width, height, 0, 0);
  }

  // third constructor: 
  public Rectangle() {
    this(1, 1, 0, 0);
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width){
    if (width >= 0) {
      this.width = width;
    }
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height){
    if (height >= 0) {
      this.height = height;
    }
  }

  // method: scale the rectangle
  public void scale(double scaleX, double scaleY) {
    width *= scaleX;
    height *= scaleY;
  }

  // method: scale the rectangle
  public void scale(double scale) {
    width *= scale;
    height *= scale;
  }

  // method: move the rectangle
  public void move(double dx, double dy) {
	   originX += dx;
	   originY += dy;
  }

  // method: compute the area of the rectangle
  public double getArea() {
    return width * height;
  }
  
  // method: compute the area of the rectangle
  public double getPerimeter() {
    return 2 * (width + height);
  }

  public static boolean areOverlapping(Rectangle r1, Rectangle r2) {
    return r1.isOverlappedWith(r2);
  }

  public boolean isOverlappedWith(Rectangle r){
    if ((r.originX > this.originX + this.width) || (r.originY > this.originY + this.height) || (this.originX > r.originX + r.width) || (this.originY > r.originY + r.height)) {
      return false;
    }
    return true;
  }
  
  public double calcRatio() {
    return (width / height);
  }

  public boolean isSquare() {
    double ratio = this.calcRatio();
    if ((ratio < 0.999) || (ratio > 1.001)) {
      return false;
    }
    return true;
  }
}
