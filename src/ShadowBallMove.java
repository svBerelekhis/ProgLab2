import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

import java.util.Random;

public class ShadowBallMove extends StatusMove {
    public ShadowBallMove(){
        super(Type.NORMAL, 80, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (new Random().nextInt(100)<20)p.setMod(Stat.SPECIAL_DEFENSE, -1);
    }
    @Override
    protected String describe(){
        return "Имеет 20% вероятность понизить Спец. Защиту цели на одну ступень.";
    }
}
