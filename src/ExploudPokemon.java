import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class ExploudPokemon extends Pokemon {
    public ExploudPokemon(String name, int level){
        super(name, level);
        setStats(104, 91, 63, 91, 73, 68);
        setType(Type.NORMAL);
        setMove(new SwaggerMove(), new ConfideMove(), new TailWhipMove(), new ShadowBallMove());
    }
}
