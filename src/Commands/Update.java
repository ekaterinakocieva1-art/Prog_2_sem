package Commands;

import Managers.CollectionManager;
import Models.Location;
import Models.Route;


import java.util.Scanner;


public class Update implements Command{
    private CollectionManager manager;
    private Scanner scan;

    public Update(CollectionManager manager, Scanner scan){
        this.manager = manager;
        this.scan = scan;
    }

    @Override
    public void execute(String ... args){
        if (args.length == 0){
            System.out.println("Ошибка: ID не передан!");
            return;
        }
        // превращаем id в число
        int id = Integer.parseInt(args[0]);
        Route r = manager.findId(id);
        if(r != null){
            scan.nextLine();
            System.out.println("Обновление маршрута" + id);

            System.out.println("Название маршрута");
            r.setName(scan.nextLine());

            System.out.println("Дистанция");
            r.setDistance(scan.nextLong());

            System.out.println("Место отправления");
            System.out.print("X: ");
            int xFrom = scan.nextInt();
            System.out.print("Y: ");
            double yFrom = scan.nextDouble();
            System.out.print("Z: ");
            double zFrom = scan.nextDouble();
            r.setFrom(new Location(xFrom, yFrom, zFrom));

            System.out.println("Место прибытия");
            System.out.print("X: ");
            int xTo = scan.nextInt();
            System.out.print("Y: ");
            double yTo = scan.nextDouble();
            System.out.print("Z: ");
            double zTo = scan.nextDouble();
            r.setTo(new Location(xTo, yTo, zTo));

            System.out.println("Данные успешно обновлены");
            System.out.println(r.toString());
        }else{
            System.out.println("Маршрут с таким id не найден");
        }
    }


    @Override
    public String getName(){
        return "update";
    }
}
