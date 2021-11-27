import ru.ifmo.se.pokemon.*;

public class SwaggerMove extends StatusMove {
    public SwaggerMove(){
        super(Type.NORMAL, 0, 85);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK, 2);
        Effect.confuse(p);
    }
    @Override
    protected String describe(){
        return "Повышает Атаку цели на две ступени и сбивает её с толку";
    }

}