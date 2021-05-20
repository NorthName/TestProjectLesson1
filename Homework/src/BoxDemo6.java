public class BoxDemo6 {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = b1;

        b1.width = 10;
        b1.height = 20;
        b1.depth = 15;

        b2.width = 3;

        System.out.println("Width : " + b1.width);
        System.out.println("Width : " + b2.width);
    }
}
