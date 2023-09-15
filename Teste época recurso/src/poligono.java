import java.util.ArrayList;
import java.util.List;

public class poligono extends Ponto {
    private List<Ponto> pol=new ArrayList<>();
    protected static StringBuffer sb = new StringBuffer();
    protected poligono(int x, int y){
        super(x, y);
    }

    public void addPoint(Ponto point){
        this.pol.add(point);
    }

    public void draw(){
        if(isValid()){
            for (Ponto point: pol){
                System.out.print("Drawing a polygon with points: " + pol );
            }
        }
        else{
            System.out.print("Polygon is null");
        }
    }
    public boolean isValid(){
        if(pol.size()<4 && pol[0]<pol[pol.size()] ){
            return false;
        }
        return true;
    }
}


