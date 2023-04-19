public class Main {
    public static void main(String[] args) {

        Sheep sheep = new Sheep(9, 4, "M", "Doly");
        Sheep sheep1 = new Sheep(10, 5, "M", "Domy");
        Sheep sheep2 = new Sheep(11, 6, "M", "Doky");
        Sheep sheep3 = new Sheep(12, 7, "M", "Doj");

        Sheep[] sheeps = new Sheep[]{sheep, sheep1, sheep2, sheep3};
        Sheep[] sheep4 = new Sheep[]{sheep3};


        Cow cows0 = new Cow(20, 4, "W", "Cow");
        Cow cows1 = new Cow(21, 5, "M", "Cow");
        Cow cows2 = new Cow(22, 6, "W", "Cow");
        Cow cows3 = new Cow(23, 7, "W", "Cow");
        Cow cows4 = new Cow(24, 8, "W", "Cow");
        Cow cows5 = new Cow(25, 7, "M", "Cow");

        Cow[] cows = new Cow[]{cows0, cows1, cows2, cows3, cows4,};
        Cow[] cows6 = new Cow[]{cows5};


        Horse horse = new Horse(30, 5, "M", "Max", "Black");
        Horse horse1 = new Horse(30, 4, "M", "Max", "Brown");
        Horse horse2 = new Horse(31,5, "M","Max","White");
        Horse[] horses = new Horse[]{horse, horse1};
        Horse[] horses1 = new Horse[]{horse2};


        Farm farms = new Farm("Kg", cows, horses, sheeps, "Aksana");
        Farm farms1 = new Farm("Moskow", cows6, horses1, sheep4, "AKsana");
       System.out.println(farms);
       System.out.println(farms1);


    }
}