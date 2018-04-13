public class Rectangulator {
  public static void main(string[]args) {
    int length = Integer.parscInt(args[0]);
    int width = Integer.parseInt(args[1]);

    Rectangle myRectangle = new Rectangle (length, width);

    string output = string.format("*** Your Rectangle ***\n\nLength: %d\nWidth: %d\nArea: %d\nPerimeter: %d\n\n", myRectangle.length, myRectangle.widt, myRectangle.getArea(), myRectangle.getPermeter());

    system.out.println(output);
  }
}
