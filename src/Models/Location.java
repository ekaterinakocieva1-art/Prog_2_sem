package Models;

public class Location {
    private Integer x; //Поле не может быть null
    private Double y; //Поле не может быть null
    private double z;
    public Location(Integer x, Double y, double z){
        if(x == null){
            throw new IllegalArgumentException("Координата x в локации не может быть null");
        }
        if(y == null){
            throw new IllegalArgumentException("Координата y в локации не может быть null");
        }
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Integer getX(){
        return x;
    }
    public Double getY(){
        return y;
    }
    public double getZ(){
        return z;
    }

}
