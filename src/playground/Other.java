package playground;


public abstract class Other {

  public static void main(String[] args) {
    Point3d p3d = new Point3d(2, 2, 2);
    System.out.println(p3d.getPointsAmount());
    Point p = p3d;
    System.out.println(p.getPointsAmount());
  }

  public static void pointProcessor(Point point) {
    point.x = point.x * 2;
    point.y = point.y + 5;
  }

  public static void stirngProcessor(Integer str) {
    str = str + 15;
  }
}

class Point {

  protected static int pointsAmount;
  protected int x;
  int y;

  static void printSomething(){
    System.out.println("I'm a point");
  }

  protected static int getPointsAmount() {
    return pointsAmount;
  }

  protected int count() {
    return x + y;
  }

  Point(int x, int y) {
    pointsAmount++;
    this.x = x;
    this.y = y;
  }
}

class Point3d extends Point {

  int z;

  protected static int getPointsAmount() {
    return 15;
  }

  @Override
  public int count() {
    printSomething();
    return y + z + x;
  }

  Point3d(int x, int y, int z) {
    super(x, y);
    this.z = z;
  }
}