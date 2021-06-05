public class AddScoopCommand extends Command {

    private final Flavor flavor;

    public AddScoopCommand(Flavor flavor){
        this.flavor = flavor;
    }

    @Override
    void execute (Icecream icecream){
        icecream.addScoop(flavor);
    }

}
