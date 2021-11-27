import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class WailordPokemon extends Pokemon {
    public WailordPokemon(String name, int level){
        super(name, level);
        setStats(170, 90, 45, 90, 45, 60);
        setType(Type.WATER);
        setMove(new SwaggerMove(), new DoubleTeamMove(), new RestMove(), new SeedBombMove());
    }
}
