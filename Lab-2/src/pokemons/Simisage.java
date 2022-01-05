package pokemons;

import moves.*;

public class Simisage extends Pansage{
    public Simisage (String name, int lvl){
        super(name, lvl);
        setStats(75, 98, 63, 98, 63, 101);
        addMove(new DreamEater());
    }
}
