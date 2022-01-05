package moves;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    // Устанавливаем базовые характеристики
    public Facade() {
        super(Type.NORMAL, 70.0, 1.0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect().stat(Stat.ATTACK, 2);
        p.addEffect(e);
    }


    @Override
    protected String describe(){
        return "Использует способность ShadowBall";
    }
}
