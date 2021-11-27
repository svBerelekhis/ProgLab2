import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import java.util.Random;

public class WaterPulseMove extends PhysicalMove {
    public WaterPulseMove(){
        super(Type.WATER, 60, 100);
    }
    protected void applyOppEffects(Pokemon p){
        if (new Random().nextInt(100)<30) Effect.confuse(p);
    }
    @Override
    protected String describe(){
        return "Имеет 30% шанс сбить цель с толку";
    }
}
