import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class TailWhipMove extends StatusMove {
    public TailWhipMove(){
        super(Type.NORMAL, 0, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.DEFENSE, -1);
    }
    @Override
    protected String describe(){
        return "Снижает защиту цели на один уровень";
    }
}
