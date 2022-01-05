package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Pansage extends Pokemon{
    public Pansage(String name, int lvl){
        super(name, lvl);
        setStats(50, 53, 48, 53, 48, 64);
        setType(Type.GRASS);
        setMove(new QuickAttack(), new ShadowBall(), new Facade());
    }
}
