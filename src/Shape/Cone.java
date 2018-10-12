package Shape;

public class Cone implements shapeInterface {
    int r,h;
    Cone(){};
    Cone(int rad,int height){
        this.r = rad;
        this.h = height;
    }
    public void volume(){
        System.out.println("Volume of the cone is"+(pi*r*r*h));
    }
}
