import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class LoudredPokemon extends Pokemon {
    public LoudredPokemon(String name, int level){
        super(name, level);
        setStats(84, 71, 43, 71, 43, 48);
        setType(Type.NORMAL);
        setMove(new SwaggerMove(), new ConfideMove(), new TailWhipMove());
    }
}
