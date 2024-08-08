public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("madhav.jpg");
        Image image2 = new ProxyImage("Madhavakumar.jpg");

        image1.display();
        System.out.println("");

        image1.display();
        System.out.println("");

        image2.display();
    }
}
