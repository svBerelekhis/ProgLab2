import ru.ifmo.se.pokemon.*;

public class RestMove extends StatusMove {
    public RestMove(){
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect.sleep(pokemon);
        pokemon.setMod(Stat.HP , (int) (pokemon.getStat(Stat.HP) - pokemon.getHP()));
    }
    @Override
    protected String describe(){
        return "восстонавливает здоровье и засыпает";
    }
}
