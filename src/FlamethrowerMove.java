import ru.ifmo.se.pokemon.*;

import java.util.Random;

public class FlamethrowerMove extends PhysicalMove {
    public FlamethrowerMove(){
        super(Type.FIRE, 95, 100);
    }
    protected void applyOppEffects(Pokemon p){
        if (new Random().nextInt(100)<10) Effect.burn(p);
    }
    @Override
    protected String describe(){
        return "Имеет 10% шанс ожечь цель";
    }
}
