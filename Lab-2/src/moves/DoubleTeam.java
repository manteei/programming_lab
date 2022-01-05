package moves;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    // Устанавливаем базовые характеристики
    public DoubleTeam(){
        super(Type.NORMAL,0.0,0.0);
    }
    // Повышает свое уклонение на 1 ступень
    @Override protected void applySelfEffects(Pokemon p){
        Effect e = new Effect().stat(Stat.EVASION, 1);
        p.addEffect(e);
    }
    // Сообщение об использовании
    @Override
    protected String describe(){
        return "Использует способность DoubleTeam";
    }
}
