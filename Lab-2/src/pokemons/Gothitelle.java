package pokemons;

import moves.*;

public class Gothitelle extends Gothorita {
    public Gothitelle (String name, int lvl){
        super(name, lvl);
        setStats(70, 55, 95, 95, 110, 65);
        addMove(new DoubleTeam());
    }
}
