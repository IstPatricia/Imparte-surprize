import java.util.ArrayList;

public class RandomBag implements IBag {

    private ArrayList<ISurprise> randomSurprises = new ArrayList<>();

    public RandomBag() {
    }

    @Override
    public void put(ISurprise newSurprise) {
        randomSurprises.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        while (!bagOfSurprises.isEmpty()) {
            randomSurprises.add(bagOfSurprises.takeOut());
        }
    }

    @Override
    public ISurprise takeOut() {

        return randomSurprises.remove(RandomGenerator.generateRandom(randomSurprises.size()));
    }

    @Override
    public boolean isEmpty() {
        return randomSurprises.isEmpty();
    }

    @Override
    public int size() {
        return randomSurprises.size();
    }
}
