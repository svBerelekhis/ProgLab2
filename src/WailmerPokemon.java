import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class WailmerPokemon extends Pokemon {
    public WailmerPokemon(String name, int level){
        super(name, level);
        setStats(130, 70, 35, 70, 35, 60);
        setType(Type.WATER);
        setMove(new SwaggerMove(), new DoubleTeamMove(), new RestMove());
    }
}
