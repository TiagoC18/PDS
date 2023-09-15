public class Ponto implements geometria {
    private int x;
    private int y;

    protected Ponto(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }

    public void draw(){
        
    }
    
    public boolean isValid(){
        if(x<0 && y<0){
            return false;
        }
        return true;
    }

    @Override
    public String toString(){
        return "Drawing a Point (x=" + x + ", y="+ y + ")"; 
    }
    
}
