package People;

import Quality.Factory;
import Quality.NationalWelfare;

public abstract class PersonAbstract {
    private String name;
    private NationalWelfare nationalWelfare;
    private int have;


    public PersonAbstract(String name, NationalWelfare nationalWelfare, int have) {
        this.name = name;
        this.nationalWelfare = nationalWelfare;
        this.have = have;
        Factory.addNumber(have);
    }

    public int getHave(){
        return have;
    }
    public void setHave(int have){
        this.have = have;
    }
    public  String getName() {
        return name;
    }

    public String getNationalWelfare() {
        String title = nationalWelfare.title;
        return title;
    }
    public String getNationalWelfwareCash(){
        return nationalWelfare.cash;
    }
    public String getNationalWelfwareHave(){
        String have = nationalWelfare.have;
        return have;
    }


    public void betterNationalWelfare(){
        System.out.println(getName() + " приумножает свое богатство.");
        if (nationalWelfare == NationalWelfare.Poor){nationalWelfare = NationalWelfare.MiddleClass;}
        if (nationalWelfare == NationalWelfare.MiddleClass){nationalWelfare = NationalWelfare.Rich;}
        if (nationalWelfare == NationalWelfare.Rich){nationalWelfare = NationalWelfare.Top10Forbes;}
        if (nationalWelfare == NationalWelfare.Bum){nationalWelfare = NationalWelfare.Poor;}
        if (nationalWelfare == NationalWelfare.Nul){nationalWelfare = NationalWelfare.Bum;}
    }
    public void worseNationalWelfare(){
        System.out.println("Дела " + getName() + "а идут хуже.");
        if (nationalWelfare == NationalWelfare.Top10Forbes){nationalWelfare = NationalWelfare.Rich;}
        if (nationalWelfare == NationalWelfare.Rich){nationalWelfare = NationalWelfare.MiddleClass;}
        if (nationalWelfare == NationalWelfare.MiddleClass){nationalWelfare = NationalWelfare.Poor;}
        if (nationalWelfare == NationalWelfare.Poor){nationalWelfare = NationalWelfare.Bum;}
        if (nationalWelfare == NationalWelfare.Bum){nationalWelfare = NationalWelfare.Nul;}
    }

    public void condition(){
        System.out.println(getName()+ " "+getNationalWelfare() + ".");
    }
    public void conditionCash(){
        System.out.println("Для " + getName()+ " пришел день, когда " + getNationalWelfwareCash() + ".");
    }
    public void payDracula(boolean n){
    }
    public void taxes(){
    }
    public abstract double getProfit();
    public abstract void OpenAfactory();
    public abstract void closeAFactory();


}