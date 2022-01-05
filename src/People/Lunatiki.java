package People;

import Quality.Factory;
import Quality.NationalWelfare;
import Quality.Steal;

public class Lunatiki extends PersonAbstract implements Steal {
    private boolean know;
    private boolean worker;
    private static int numWorker;
    private boolean taxes;

    public Lunatiki(String name, NationalWelfare nationalWelfare, int have) {
        super(name, nationalWelfare, have);
    }
    public void setKnowledge(){
        know = true;
        System.out.println(getName() + " теперь знает где брать соль. ");

    }
    public boolean getKnowledge(){
        return know;
    }
    public void setJob(){
        this.worker = true;
    }
    public boolean getWorker(){
        return worker;
    }
    public void NumWorker(){
        if (getWorker()){
            this.numWorker += 1;
        }
    }
    public static int getNumWorker(){
        return numWorker;
    }

    public void noProfit(){
        if (!worker) {
            if (getProfit() <= 0) {
                System.out.println(getName() + " приходится расходовать на приобретение соляных кристаллов и оплату рабочих гораздо больше денег,чем\n" +
                        "он выручал от продажи своей продукции. ");
            }
        }
    }

    @Override
    public double getProfit() {
        if (taxes) {
            double personalIncom = getHave() - 15;
            return personalIncom;
        } else {
            double personalIncom = getHave();
            return personalIncom;
        }
    }

    @Override
    public void OpenAfactory() {
        System.out.println(getName() + " сберег " + getNationalWelfwareCash() + " и строит завод.");
        setHave(1);
        Factory.number++;
        Factory.addNumber(getHave());
        System.out.println("Появляется небольшой соляной заводик. ");
    }

    @Override
    public void closeAFactory() {
        if (!worker) {
            System.out.println(getName() + " закрывает свой соляной заводик.");
            setHave(Factory.number--);
        }
    }

    @Override
    public void steal() {
        if (getHave() != 0){
            System.out.println(getName() + " ворует кристаллы для переработки на соляном заводе. ");
        }
    }

    @Override
    public void payDracula(boolean n) {
        if (n && getHave()!= 0){
            System.out.println(getName() + " платит Дракуле за кристаллы. ");
        }
    }

    @Override
    public void taxes() {
        if (getHave() != 0){
            System.out.println(getName() + " платит половину прибыли с завода в карман Дракулы. ");
            worseNationalWelfare();
            taxes = true;
        }
    }

    @Override
    public String toString() {
        return "Имя:" + getName() + ". Состояние: " + getNationalWelfare()+ ". Знает где брать соль: " + getKnowledge() + ". ";
    }

    @Override
    public int hashCode() {
        return getNationalWelfare().hashCode() + Boolean.toString(getKnowledge()).hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Lunatiki){
            if (this.hashCode() == o.hashCode()) {
                return true;
            }
        }
        return false;
    }

}

