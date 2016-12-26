public class Main {

    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("--------------------------");

        //after 1 time image will not be loaded from disk
        image.display();
    }
}
