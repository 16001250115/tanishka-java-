public class OperatorsDemo {
  void add(int a, int b) {
    int sum = a + b;
    System.out.println("Addtion: " + sum);
  }

 int multiply(int a, int b) {
      return a * b;
  }
public static void main(String[] args) {

    int x = 12, y = 4;
    System.out.println("x + y = " + (x + y));
    System.out.println("x - y = " + (x - y));
    System.out.println("x * y = " + (x * y));
    System.out.println("x / y = " + (x / y));
    System.out.println("x % y = " + (x % y));

    
    byte a = 15, b = 3;
    int result = a + b ;
    System.out.println("Arithmetic Promotion Result: " + result);
    

    OperatorsDemo obj = new OperatorsDemo();
    obj.add(5,  7 );
    int product = obj.multiply( 4,  6);
    System.out.println("Multiplication: " + product);
  }
}