import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import java.util.Random;

public class StompMove extends PhysicalMove {
    public StompMove(){
        super(Type.NORMAL, 60, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (new Random().nextInt(100)<30) Effect.flinch(p);
    }
    @Override
    protected String describe(){
        return "имеет 30% вероятность заставить цель дрогнуть";
    }
}
