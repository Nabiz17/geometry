import java.io.BufferedReader;
import java.io.IOException;

public class circle {
  static class Circle {
    private int x, y, r;

    Circle(int x, int y, int r) {
      this.x = x;
      this.y = y;
      this.r = r;
    }

    public int getR() {
      return r;
    }

    public int getX() {
      return x;
    }

    public int getY() {
      return y;
    }

    public void setR(int r) {
      this.r = r;
    }

    public void setX(int x) {
      this.x = x;
    }

    public void setY(int y) {
      this.y = y;
    }



  }
}

