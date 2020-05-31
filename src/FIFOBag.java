import java.util.ArrayList;

public class FIFOBag implements IBag {

    private ArrayList<ISurprise> FIFOSurprises = new ArrayList<>();

    @Override
    public void put(ISurprise newSurprise) {
        FIFOSurprises.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        while (!bagOfSurprises.isEmpty()) {
            FIFOSurprises.add(bagOfSurprises.takeOut());
        }
    }

    @Override
    public ISurprise takeOut() {

        return FIFOSurprises.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return FIFOSurprises.isEmpty();
    }

    @Override
    public int size() {
        return FIFOSurprises.size();
    }
}
