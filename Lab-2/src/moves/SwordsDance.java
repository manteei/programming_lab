package moves;

import ru.ifmo.se.pokemon.*;

public class SwordsDance extends StatusMove{
    // Устанавливаем базовые характеристики
    public SwordsDance() {
        super(Type.NORMAL, 0.0, 1.0);
    }
        // Увеличивает атаку покемона на 2 уровня
        @Override protected void applyOppEffects(Pokemon p) {
            Effect e = new Effect().stat(Stat.ATTACK, 2);
            p.addEffect(e);
        }
        @Override
        protected String describe(){
            return "Использует способность SwordsDance";
        }
}
