package Managers;

import Models.Coordinates;
import Models.Location;
import Models.Route;

import java.util.HashSet;

public class CollectionManager {
    public HashSet<Route> list = new HashSet<>();
    public CollectionManager(){
        Coordinates coords1 = new Coordinates(10.5f, 200L);
        Location from1 = new Location(0, 0.0, 0.0);
        Location to1 = new Location(100, 50.5, 10.0);
        Route route1 = new Route(1,"Москва - Питер", coords1, from1, to1, 700L);
        list.add(route1);

        Coordinates coords2 = new Coordinates(5.0f, -100L);
        Location from2 = new Location(10, 20.0, 5.0);
        Location to2 = new Location(30, 40.0, 15.0);
        Route route2 = new Route(2, "Казань - Уфа", coords2, from2, to2,500L);
        list.add(route2);
    }
    // метод поиска маршрута по его id
    public Route findId(int id){
        for (Route r : list) {
            if (r.getId() == id) {
                return r;
            }
        }
        return null;
    }
}

