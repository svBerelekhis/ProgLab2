import ru.ifmo.se.pokemon.*;

public class ConfideMove extends StatusMove{
    public ConfideMove(){
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK , -1);
    }
    @Override
    protected String describe(){
        return "Снижает специальную атаку цели на один уровень";
    }
}
