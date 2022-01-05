package Quality;

public enum NationalWelfare{
    Top10Forbes("очень богат", "огромная сумма", "владеет всем" ),
    Rich("богат", "большая сумма", "владеет всем побережьем"),
    MiddleClass("средний класс", "достаточная сумма", "может владеть несколькими заводами"),
    Poor("бедный", "маленькая сумма", "может владеть одним заводом"),
    Bum("сводит концы с концами", "мало", "все продал"),
    Nul("без средств к существованию", "в карманах ни сантика", "ничего");

    public String title;
    public String cash;
    public  String have;

    NationalWelfare(String title, String cash, String have){
        this.title = title;
        this.cash = cash;
        this.have = have;
    }
}
