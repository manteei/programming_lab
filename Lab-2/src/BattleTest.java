import ru.ifmo.se.pokemon.*;
import pokemons.*;

class BattleTest {
    public static void main(String[] args){
        Battle b = new Battle();
        Pokemon p1 = new Xerneas("Xerneas", 2);
        Pokemon p2 = new Simisage("Simisage", 3);
        Pokemon p3 = new Pansage("Pansage", 1);
        Pokemon p4 = new Gothita("Gothitelle", 3);
        Pokemon p5 = new Gothitelle("Gothita", 4);
        Pokemon p6 = new Gothorita("Gothorita", 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();
    }
}
