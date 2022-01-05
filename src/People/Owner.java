package People;

public class Owner {
    private String name;
    public Owner(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void accept(String name){
            System.out.println(getName() + " Принял " + name + "а работать крутильщиком чертового колеса. ");
            System.out.println("Иначе");
        }
    public static class Amusement {

        public static void spinner(String name) {
            System.out.println("Крутит " + name + " на чертовых водяных колесах.");
        }

        public static void sea(String name) {
            System.out.println("Крутит " + name + " на морском параболоиде.");
        }
    }

}
