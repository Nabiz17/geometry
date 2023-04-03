import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  private static String coordinates;

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    //Получите от пользователя радиус окружности.
    //
    //По введённым координатам точки определите, попадает ли она внутрь,
    // на границу или вне окружности с указанным радиусом и центром в точке O (0, 0).

    //формула точки внутри окружности, включая границы:
    // (x – a)2 + (y – b)2 ≤ r2, где x,y- координаты центра окружности,
    //r-радиус окружности,
    //a,b-координаты точки.
    int x = 0;
    int y = 0;
    int r = 0;
    System.out.println("введите радиус окружности:");
    r = Integer.parseInt(bufferedReader.readLine());


    System.out.println("введите координаты точки (через запятую):");
    String coordinates = bufferedReader.readLine();
    int sepIndex = coordinates.indexOf(',');
    if (sepIndex == -1) {
      throw new IllegalArgumentException(
          "Неправильный формат координат, введите два целых числа через запятую: " + coordinates);
    }
    int a = Integer.parseInt(coordinates.substring(0, sepIndex));
    int b = Integer.parseInt(coordinates.substring(sepIndex + 1).trim());

    if ((x - a)*(x - a) + (y - b)*(y - b) >= r*r) {
      System.out.println("точка не находится внутри окружности");
    } else {
      System.out.println("точка находится внутри окружности");
    }
   if ((a > 0) && (b > 0)) {
      System.out.println("точка находится в 1 четверти системы координат");
    } else if ((a < 0) && (b > 0)){
     System.out.println("точка находится в 2 четверти системы координат");
   } else if ((a < 0) && (b < 0)){
     System.out.println("точка находится в 3 четверти системы координат");
   } else if ((a > 0) && (b < 0)){
     System.out.println("точка находится в 4 четверти системы координат");
    } else {
     System.out.println("точка находится в центре системы координат");
   }

  }
}
