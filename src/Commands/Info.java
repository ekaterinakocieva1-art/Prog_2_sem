package Commands;

public class Info implements Command {
    @Override
    public void execute(String ... args){
        System.out.println("info works");
    }

    @Override
    public String getName(){
        return "info";
    }
}
