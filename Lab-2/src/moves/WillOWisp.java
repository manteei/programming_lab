package moves;

import ru.ifmo.se.pokemon.*;

public class WillOWisp extends StatusMove {
    // Устанавливаем базовые характеристики
    public WillOWisp(){
        super(Type.FIRE, 10.0, 0.85);
    }
    // При попадении противник сгорает

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().stat(Stat.ATTACK, -3).condition(Status.BURN);
        p.addEffect(e);
    }
    // Сообщение об использовании
    @Override
    protected String describe(){
        return "Использует способность Will-O-Wisp";
    }

}
