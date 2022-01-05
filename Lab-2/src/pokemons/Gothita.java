package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Gothita extends Pokemon{
    public Gothita(String name, int lvl){
        super(name, lvl);
        setStats(45, 30, 50, 55, 65, 45);
        setType(Type.PSYCHIC);
        setMove(new Swagger(), new Confide());
    }
}
