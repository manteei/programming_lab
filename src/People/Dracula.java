package People;

import Exeptions.LunatikiExeption;
import Quality.Factory;
import Quality.NationalWelfare;
import Quality.Protect;

public class Dracula extends PersonAbstract implements Protect {
    private boolean know;
    public Dracula(String name, NationalWelfare nationalWelfare, boolean know, int have) {
        super(name, nationalWelfare, have);
        this.know = know;
    }
    public void comeback() throws LunatikiExeption{
        if (Math.random() >= 0.5) {
            System.out.println("Вернулся из поездки " + getName() + " который " + getNationalWelfwareHave() + ".");
        } else {
            throw new LunatikiExeption(getName() + " не вернулся.");
        }

    }

    public void setKnowledge(){
        know = true;
        System.out.print(getName() + " узнал, что ");
    }
    public boolean getKnow(){
        return know;
    }

    @Override
    public double getProfit() {
        double personalIncom =  getHave() - (double) Lunatiki.getNumWorker()/getHave();
        return personalIncom;
    }

    @Override
    public String toString() {
        return "Имя:" + getName() + ". Состояние: " + getNationalWelfare()+ ". Знает о воровстве: " + getKnow() + ". ";
    }
    @Override
    public void fence() {
        if (know){
            System.out.println(getName() + " велит обнести побережье забором.");
        } else {
            System.out.println(" не замечает воровства.");
        }
    }

    @Override
    public void OpenAfactory() {
        this.setHave(getHave()+1);
        System.out.println(getName() + " открыл еще один завод.");
    }

    @Override
    public void closeAFactory() {
        this.setHave(getHave()-1);
        System.out.println(getName() + "закрыл завод.");
    }
}
