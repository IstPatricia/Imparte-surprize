public class Candies implements ISurprise {

    private static String[] candiesTypes = {"chocolate", "vanilla", "jelly", "fruity", "mint"};
    private int candiesNo;
    private String type;


    public Candies() {
    }

    public Candies(int candiesNo, String type) {
        this.candiesNo = candiesNo;
        this.type = type;
    }

     static Candies generate() {
        //The method generates 2 random numbers: candy type and candy number

        int candiesNumber = RandomGenerator.generateRandom(100);
        String candiesType = candiesTypes[RandomGenerator.generateRandom(candiesTypes.length)];
        return new Candies(candiesNumber, candiesType);

    }

    @Override
    public void enjoy() {
        System.out.println("Congratulations! You received " + candiesNo + " candies with " + type + " flavor!");
    }
}
