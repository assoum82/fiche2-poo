
/**
 * Created by fcmam5 on 03/10/15.
 */
public class Cercle {
    private Point centre;
    private Segment rayon;

    public Cercle(Point centre) {
        this.centre = new Point();
    }

    public Cercle(Point centre, Segment rayon){
        this.centre = centre;
        this.rayon = rayon;
    }

    public double perimetre(){
        return (rayon.distence()*2*Math.PI);
    }

    public double surface(){
        return rayon.distence()*rayon.distence()*Math.PI;
    }

    public Cercle symetrie(){
        return new Cercle(centre.symetrie(),rayon);
    }
}
