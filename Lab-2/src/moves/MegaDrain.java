package moves;

import ru.ifmo.se.pokemon.*;

public class MegaDrain extends SpecialMove {
    // Устанавливаем базовые характеристики
    public MegaDrain(){
        super(Type.GRASS, 40.0, 1.0);
    }


    @Override
    protected void applySelfEffects(Pokemon p){
        Effect e = new Effect().chance(0.2).stat(Stat.HP, 2);
        p.addEffect(e);
    }
    // Сообщение об использовании
    @Override
    protected String describe(){
        return "Использует способность MegaDrain";
    }

}
