public class BoxDemo1 {
    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;
        double volume = myBox.width * myBox.height * myBox.depth;
        System.out.println("Объем равен : " + volume);
    }
}
