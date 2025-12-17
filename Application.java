package tp;

public class Application {
    public static void main(String[] args) {

        Point p1 = new Point(5, 6);
        Point p2 = new Point(-2, -7);

        Point m = p1.milieu(p2);
        m.afficher();

        Point proche = p1.procheDuCentre(p2);
        proche.afficher();
    }
}
