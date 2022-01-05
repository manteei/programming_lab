import Exeptions.LunatikiExeption;
import People.*;
import Quality.*;


public class Story {
    public static void main(String[] args){
        Ponchic ponchic = new Ponchic("Пончик", NationalWelfare.Top10Forbes, false,3);
        Dracula dracula = new Dracula("Дракула", NationalWelfare.Rich, false, 4);
        Lunatiki[] lunatik = new Lunatiki[9];
        lunatik[0] = new Lunatiki("Лунатики", NationalWelfare.MiddleClass, 0);
        lunatik[1] = new Lunatiki("Первый лунатик", NationalWelfare.Poor, 0);
        lunatik[2] = new Lunatiki("Второй лунатик", NationalWelfare.Poor, 0);
        lunatik[3] = new Lunatiki("Третий лунатик", NationalWelfare.MiddleClass, 0);
        lunatik[4] = new Lunatiki("Четвертый лунатик", NationalWelfare.MiddleClass, 0);
        lunatik[5] = new Lunatiki("Пятый лунатик", NationalWelfare.MiddleClass, 0);
        lunatik[6] = new Lunatiki("Шестой лунатик", NationalWelfare.MiddleClass, 0);
        lunatik[7] = new Lunatiki("Седьмой лунатик", NationalWelfare.MiddleClass, 0);
        lunatik[8] = new Lunatiki("Восьмой лунатик", NationalWelfare.Poor, 0);
        Factory factory = new Factory("Завод");
        Factory.Salt salt = factory.new Salt("Соль");
        Owner owner = new Owner("Владелец Приморского увеселительного заведения");
        Owner.Amusement amusement = new Owner.Amusement();
        Slaves slaves = new Slaves() {
            @Override
            public void dress() {
                System.out.print("Они одевали " + ponchic.getName() + ",");
            }
            @Override
            public void undress() {
                System.out.println(" они раздевали "+ ponchic.getName() + ".");
            }
            @Override
            public void clean() {
                System.out.println("Они убирали у "+ ponchic.getName() + " в комнатах.");
            }
            @Override
            public void lookFor() {
                System.out.println("Они смотрели за домом "+ ponchic.getName() + ".");
            }
        };
        ponchic.leave();
        ponchic.newName();
        ponchic.existHouse();
        ponchic.slave();
        slaves.dress();
        slaves.undress();
        slaves.clean();
        slaves.lookFor();
        ponchic.chill();
        ponchic.condition();
        ponchic.duration();

        if (ponchic.getNationalWelfare().equals(NationalWelfare.Top10Forbes.title)) {
            for (int i = 0; i< lunatik.length; i += 2){
                lunatik[i].setKnowledge();
            }
        }
        for (int i = 1; i < lunatik.length; i++){
            if (lunatik[0].equals((lunatik[i]))){
                lunatik[i].OpenAfactory();
                lunatik[i].betterNationalWelfare();
                salt.addiction();
                ponchic.earnCh();
            } else
                lunatik[i].setJob();
                lunatik[i].NumWorker();

        }
        ponchic.worseNationalWelfare();
        salt.printProductionVolume();
        salt.printPrice();
        salt.printStdIncome(factory.getNumber());
        ponchic.getEarn(factory.getNumber());
        salt.meaning(factory.getNumber());
        try {
            dracula.comeback();
        } catch (LunatikiExeption e) {
            e.printStackTrace();
        }
        dracula.setKnowledge();
        for (int i = 1; i < lunatik.length; i++){
            lunatik[i].steal();
        }
        salt.addiction();
        dracula.fence();
        ponchic.payDracula(dracula.getKnow());
        ponchic.worseNationalWelfare();
        for (int i = 1; i < lunatik.length; i++){
            lunatik[i].payDracula(dracula.getKnow());
        }
        ponchic.taxes();
        for (int i = 1; i < lunatik.length; i++){
            lunatik[i].taxes();

        }
        salt.setIncome();
        salt.printPrice();
        ponchic.noProfit();

        for (int i = 1; i < lunatik.length; i++) {
            lunatik[i].noProfit();
        }
        for (int i = 1; i < lunatik.length; i++) {
            lunatik[i].closeAFactory();
        }
        ponchic.condition();
        ponchic.existHouse();
        ponchic.closeAFactory();
        ponchic.conditionCash();
        owner.accept(ponchic.getName());
        ponchic.worseNationalWelfare();
        ponchic.condition();

    }

}
