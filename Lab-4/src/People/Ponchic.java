package People;

import Errors.MessageError;
import Quality.*;

public class Ponchic extends PersonAbstract{
    private boolean duration;
    private final double earnStd = 20;
    private double earn = 20;
    private String newName = "Господин Понч";
    private boolean slave;
    private boolean taxes;
    public Ponchic(String name, NationalWelfare nationalWelfare, boolean duration, int have) {
        super(name, nationalWelfare, have);
        this.duration = duration;

    }
    //Локальный класс
    public void existHouse(){
        boolean welfware = getNationalWelfare().equals(NationalWelfare.Top10Forbes.title);
        String ponchicname = getName();
        class House{
            private String name;
            public House(String name){
                this.name = name;
            }
            public String getName() {
                return name;
            }
            public void exist(){
                if (welfware) {
                    System.out.println(ponchicname + " переехал в " + getName() + ".");
                } else {
                    System.out.println(ponchicname  + " продал свой " + getName() + ".");
                }
            }
        }
        House house = new House("Собственный дом");
        house.exist();
    }
    public void noProfit(){
        if(-getProfit() <= 0) {
            System.out.println(getName() + " приходится расходовать на приобретение соляных кристаллов и оплату рабочих гораздо больше денег,чем\n" +
                    "он выручал от продажи своей продукции. ");
        }
    }

    public void chill(){
        if (getNationalWelfare().equals(NationalWelfare.Top10Forbes.title) && slave){
            System.out.println(getName() + " целыми днями просиживал в ресторанах, ел там самые вкусные кушанья.");
            System.out.println(getName() + "Околачивался на берегу залива. ");
            Owner.Amusement.spinner(getName());
            Owner.Amusement.sea(getName());

        } else {
            System.out.println(getName() + " работал.");
        }
    }
    public void setSlave(){
        this.slave = true;
    }
    public void slave(){
        if (getNationalWelfare().equals(NationalWelfare.Top10Forbes.title)){
            System.out.println(getName() + " завел себе слуг.");
            setSlave();
        } else {
            System.out.println(getName() + " делает все сам.");
        }
    }
    public void leave(){
        if (getNationalWelfare().equals(NationalWelfare.Top10Forbes.title)){
            System.out.println("Жил " + getName() + " в свое удовольствие, как и остальные лунные богачи.");
        } else {
            System.out.println("Жил " + getName() + " скудно");
        }
    }
    public void newName(){
        if (!getNationalWelfare().equals(NationalWelfare.Top10Forbes.title)){
            System.out.println("Называется как обычно - " + getName());
        } else {
            System.out.println("И даже назывался теперь не просто Пончик, a " + getName() + ".");
        }
    }

    public void duration(){
        if (duration) {
            System.out.println(" долго. ");
        } else {
            System.out.println(" недолго. ");
        }

    }
    public void earnCh(){
        this.earn = earn - 9.5;
    }

    public void getEarn(int n) throws MessageError{
        if (n*Math.random() < 3) {
            System.out.println(getName() + " раньше, тратит на оплату рабочего фертинг и получает взамен " + earnStd + ".");
            if (earn > earnStd) {
                System.out.println("Теперь рабочий приносит целых" + earn + ".");
            } else {
                System.out.println("Теперь никто не может выколотить из рабочего и " + earn + " фертинга.");
            }
        } else {
            throw  new MessageError("Недопустимое количество заводов!");
        }

    }

    @Override
    public String getName() {
        if (!getNationalWelfare().equals(NationalWelfare.Top10Forbes.title)) {
            return super.getName();
        }else {
            return newName;
        }
    }

    @Override
    public void condition() {
        super.condition();
    }

    @Override
    public double getProfit() {
        double personalIncom =   getHave()-(double) Lunatiki.getNumWorker()/getHave();
        return personalIncom;
    }

    @Override
    public String toString() {
        return "Имя:" + getName() + ". Состояние: " + getNationalWelfare()+ ". ";
    }
    @Override
    public void payDracula(boolean n){
        if (n) {
            System.out.println(getName() + " платит Дракуле за кристаллы.");
        } else {System.out.println(getName() + " ура налогов нет.");}
    }

    @Override
    public void taxes() {
        System.out.println(getName() + " платит половину прибыли с завода в карман Дракулы. ");
        worseNationalWelfare();
        taxes = true;
    }

    @Override
    public void OpenAfactory() {
        this.setHave(getHave()+1);
        System.out.println(getName() + " открыл еще один завод.");
    }

    @Override
    public void closeAFactory() {
        this.setHave(getHave()-1);
        for (int i = 1; i <= getHave() + 1; i++)
            System.out.println(getName() + " закрыл свой " + i + " завод.");
    }

}
