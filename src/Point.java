import java.io.BufferedReader;
import java.io.IOException;

public class Point {

  private int a;
  private int b;

  public Point(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public int getA() {
    return a;
  }

  public int getB() {
    return b;
  }

  // этот метод прочитает точку с клавиатуры
  public static Point read(BufferedReader bufferedReader) throws IOException {
    System.out.println("Введите координаты точки (через запятую):");
    String coordinates = bufferedReader.readLine();
    return parse(coordinates);
  }


  public static Point parse(String coordinates) {
    int sepIndex = coordinates.indexOf(',');
    if (sepIndex == -1) {
      throw new IllegalArgumentException(
          "Неправильный формат координат, введите два целых числа через запятую: " + coordinates);
    }
    int a = Integer.parseInt(coordinates.substring(0, sepIndex)); // "x, y" -> "x" -> x
    int b = Integer.parseInt(coordinates.substring(sepIndex + 1).trim());
    return new Point(a, b);
  }
}

