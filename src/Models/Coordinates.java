package Models;

public class Coordinates {
    private Float x; //Максимальное значение поля: 685, Поле не может быть null
    private Long y; //Значение поля должно быть больше -617, Поле не может быть null
    public Coordinates(Float x, Long y){
        if (x == null || x > 685){
            throw new IllegalArgumentException("Неправильно задана координата x");
        }
        if(y == null || y < -617){
            throw new IllegalArgumentException("Неправильно задана координата y");
        }
        this.x = x;
        this.y = y;
    }
    public Float getX(){
        return x;
    }
    public Long getY(){
        return y;
    }


}
