import ru.ifmo.se.pokemon.*;


public class ArticunoPokemon extends Pokemon {
    public ArticunoPokemon(String name, int level){
        super(name, 1);
        setStats(90, 85, 100, 95, 125, 85);
        setType(Type.ICE);
        setMove(new WaterPulseMove(), new FlamethrowerMove(), new GrowlMove(), new StompMove());
    }
}
