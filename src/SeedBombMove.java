import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class SeedBombMove extends PhysicalMove {
    public SeedBombMove(){
        super(Type.GRASS, 80, 100);
    }
    @Override
    protected String describe(){
        return "никаких дополнительных эфектов";
    }
}
