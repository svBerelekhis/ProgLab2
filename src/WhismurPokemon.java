import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class WhismurPokemon extends Pokemon {
    public WhismurPokemon(String name, int level){
        super(name, level);
        setStats(64, 51, 23, 51, 23, 28);
        setType(Type.NORMAL);
        setMove(new SwaggerMove(), new ConfideMove());
    }
}
