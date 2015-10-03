public class Segment {
    private Point a;
    private Point b;

    public Segment(double bx, double by) {
        this.a = new Point();
        this.b = new Point(bx, by);
    }

    public Segment(double ax, double ay, double bx, double by) {
        this.a = new Point(ax, ay);
        this.b = new Point(bx, by);
    }

    public Segment(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public double distence() {
        /**
         *      ___________________
         *     /
         *  \/ (ax-bx)² + (ay-by)²
         **/
        return Math.sqrt(Math.pow((a.abscisse() - b.abscisse()), 2) + Math.pow((a.ordonnee() - b.ordonnee()), 2));
    }

    public Segment symetrie(){
        return new Segment(a.symetrie(),b.symetrie());
    }
    //Idea from : http://devinfos.blogspot.com/2012/12/td5-java.html

}