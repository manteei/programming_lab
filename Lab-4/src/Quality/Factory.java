package Quality;

public class Factory {
        public static int number;
        private String name;
        public Factory(String name){
            this.name = name;
        }
        public int getNumber(){
            return number;
        }
        public static void addNumber(int num){
            number +=num;
        }
    public class Salt {
        private String name;
        private double productionVolume = 28900;
        private double price = 785;
        private  double income;
        private final double priceStd = 785;
        private final double productVolumeStd = 28900;
        public Salt(String name){
            this.name = name;
        }
        public void addiction() {
            this.productionVolume = productionVolume * 1.2;
            this.price = price * 0.75;
        }

        public void printStdIncome(int num) {
            double income = price * productionVolume / num;
            if (income > priceStd * productVolumeStd) {
                System.out.println(getName() + " приносит больше барышей, чем вначале.");
            } else {
                System.out.println(getName() + " уже не приносит таких барышей как вначале.");
            }
        }

        public void meaning(int num) {
            int min = 100000;
            if (price * productionVolume / num > min) {
                System.out.println("Все еще выгодно, солевой промысел развивается");
            } else {
                System.out.println("Не выгодно, сворачиваемся");
            }
        }

        public void printPrice() {
            if (price > priceStd) {
                System.out.println(getName() + " продается все дороже.");
            } else {
                if (price > 350) {
                    System.out.println(getName() + " продается все дешевле.");
                }else {
                    System.out.println(getName() + " стала продаваться по такой низкой цене, что ");
                }
            }
        }

        public void printProductionVolume() {
            if (productionVolume > productVolumeStd) {
                System.out.println(getName() + " добывается все больше.");
            } else {
                System.out.println(getName() + "Соли добывается все меньше.");
            }
        }

        public String getName() {
            return name;
        }

        public void setIncome() {
             income = price * productionVolume;
        }
        public  double getIncome(){
            return income;
        }

    }
}
