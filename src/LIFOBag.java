import java.util.ArrayList;

public class LIFOBag implements IBag{

    private ArrayList<ISurprise> LIFOSurprises = new ArrayList<>();

    @Override
    public void put(ISurprise newSurprise) {

        LIFOSurprises.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        while (!bagOfSurprises.isEmpty()) {
            LIFOSurprises.add(bagOfSurprises.takeOut());
        }
    }

    @Override
    public ISurprise takeOut() {

        return LIFOSurprises.remove(LIFOSurprises.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return LIFOSurprises.isEmpty();
    }

    @Override
    public int size() {
        return LIFOSurprises.size();
    }
}
