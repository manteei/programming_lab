package moves;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
     // Устанавливаем базовые характеристики
     public Swagger(){
         super(Type.NORMAL,0.0,0.85);
     }
     // Сбивает цель с току и повышает атаку на 2 уровня
     @Override protected void applyOppEffects(Pokemon p) {
         Effect e = new Effect().stat(Stat.ATTACK, 2);
         e.confuse(p);
         p.addEffect(e);
     }
     // Сообщение об использовании
     @Override
     protected String describe(){
         return "Использует способность Swagger";
     }
}
