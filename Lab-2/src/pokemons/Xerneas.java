package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Xerneas extends Pokemon {
    public Xerneas(String name, int lvl){
        super(name, lvl);
        setStats(126,131, 95, 131, 98, 99);
        setType(Type.FAIRY);
        setMove(new DoubleTeam(), new Growl(), new MegaDrain(), new SwordsDance());
    }
}