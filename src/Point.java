public class Point {
    private double abscisse;
    private double ordonnee;

    public Point() {
        this.abscisse = 0;
        this.ordonnee = 0;
    }

    public Point(double abscisse, double ordonnee) {
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }

    public Point(double x) {
        this.abscisse = x;
        this.ordonnee = x;
    }

    public double abscisse(){
        return this.abscisse;
    }

    public double ordonnee() {
        return ordonnee;
    }

    public Point symetrie(){
        return new Point(-this.abscisse,this.ordonnee);
    }
    @Override
    public String toString() {
        return "("+abscisse+","+ordonnee+")";
    }

}