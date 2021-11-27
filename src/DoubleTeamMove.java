import ru.ifmo.se.pokemon.*;


public class DoubleTeamMove extends StatusMove {
    public DoubleTeamMove(){
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected void applySelfEffects (Pokemon p){
        p.setMod(Stat.EVASION , 1);
    }
    @Override
    protected String describe(){
        return "Повышает своё уклонение на одну ступень.";
    }

}
