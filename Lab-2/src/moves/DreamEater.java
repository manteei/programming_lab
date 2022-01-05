package moves;

import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove{
    public DreamEater(){
        super(Type.PSYCHIC, 100.0, 1.0);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().condition(Status.SLEEP);
        p.addEffect(e);
    }

    // Сообщение об использовании
    @Override
    protected String describe(){
        return "Использует способность DreamEater";
    }


}