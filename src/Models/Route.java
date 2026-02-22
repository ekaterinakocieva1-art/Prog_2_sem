package Models;


import java.time.LocalDateTime;

public class Route {
    private static int idCounter = 1;
    private int id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Location from; //Поле может быть null
    private Location to; //Поле не может быть null
    private long distance; //Значение поля должно быть больше 1

    public Route(int id,String name, Coordinates coordinates, Location from, Location to, long distance ){
        this.id = idCounter++;
        this.creationDate = LocalDateTime.now();
        this.name = name;
        this.coordinates = coordinates;
        this.from = from;
        this.to = to;
        this.distance = distance;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public Coordinates getCoordinates(){
        return coordinates;
    }
    public LocalDateTime getCreationDate(){
        return creationDate;
    }
    public Location getFrom(){
        return from;
    }
    public Location getTo(){
        return to;
    }
    public long getDistance(){
        return distance;
    }
    public void setName(String name){
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Имя не может быть пустым");
        }
        this.name = name;
    }
    public void setCoordinates(Coordinates coordinates){
        if(coordinates == null){
            throw new IllegalArgumentException("Координаты не могут быть null");
        }
        this.coordinates = coordinates;
    }
    public void setFrom(Location from){
        this.from = from;
    }
    public void setTo(Location to){
        if(to == null){
            throw new IllegalArgumentException("Место назначения не может быть null");
        }
        this.to = to;
    }
    public void setDistance(long distance){
        if(distance <= 1){
            throw new IllegalArgumentException("Дистанция должна быть больше 1");
        }
        this.distance = distance;
    }
    @Override
    public String toString(){
        return "Models.Route(id = " + id + ", name = " + name + ",distance = " + distance + " , creator = " + creationDate + ")";
    }
}
