import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class GrowlMove extends PhysicalMove{
    public GrowlMove(){
        super(Type.NORMAL, 0, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK, -1);
    }
    @Override
    protected String describe(){
        return "Понижает атаку цели на одну ступень";
    }
}
