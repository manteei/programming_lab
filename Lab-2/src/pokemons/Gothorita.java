package pokemons;

import moves.*;

public class Gothorita extends Gothita {
    public Gothorita (String name, int lvl){
        super(name, lvl);
        setStats(60, 45, 70, 75, 85, 55);
        addMove(new WillOWisp());
    }
}
