package moves;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove{
    // Устанавливаем базовые характеристики
    public ShadowBall() {
        super(Type.GHOST, 80.0, 1.0);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().chance(0.2).stat(Stat.DEFENSE, -2);
        p.addEffect(e);
    }

    @Override
    protected String describe(){
        return "Использует способность ShadowBall";
    }
}
