package moves;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
    // Устанавливаем базовые характеристики
    public Confide(){
        super(Type.NORMAL, 0, 0);
    }

    // Снижает специальную аттаку на 1 ступень
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().stat(Stat.ATTACK, -1);
        p.addEffect(e);
    }
    // Сообщение об использовании
    @Override
    protected String describe(){
        return "Использует способность Confide";
    }
}

