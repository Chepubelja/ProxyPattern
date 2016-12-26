public class Main {

    public static void main(String[] args) {
        Video video = new ProxyVideo("test_video.mp4");

        //video will be loaded from disk
        video.display();
        System.out.println("--------------------------");

        //after 1 time video will not be loaded from disk
        video.display();
    }
}
