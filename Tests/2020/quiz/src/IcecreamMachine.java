import java.util.ArrayList;
import java.util.List;

public class IcecreamMachine {

    private Icecream icecream;
    List<Command> commands = new ArrayList<>();

    IcecreamMachine(Icecream icecream){
        this.icecream = icecream;
    }

    void executeCommand(Command d){
        d.execute(icecream);
        commands.add(d);
    }

    void undoLastCommand(){
        commands.remove(commands.size()-1);
    }
}
