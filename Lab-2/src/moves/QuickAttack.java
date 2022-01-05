package moves;
import ru.ifmo.se.pokemon.*;

public class QuickAttack extends PhysicalMove {
    // Устанавливаем базовые характеристики
    public QuickAttack(){
        super(Type.FIRE, 40.0, 1.0, 1, 1);
    }
    // Сообщение об использовании
    @Override
    protected String describe(){
        return "Использует способность QuickAttack";
    }

}
