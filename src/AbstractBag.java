import java.util.ArrayList;
import java.util.Objects;

public abstract class AbstractBag implements IBag {
    ArrayList<ISurprise> bag;

    public AbstractBag(ArrayList<ISurprise> bag) {
        this.bag = bag;
    }

    public AbstractBag() {
    }

    @Override
    public void put(ISurprise newSurprise) {

    }

    @Override
    public void put(IBag bagOfSurprises) {

    }

    @Override
    public ISurprise takeOut() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AbstractBag)) {
            return false;
        }
        AbstractBag that = (AbstractBag) o;
        return Objects.equals(bag, that.bag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bag);
    }
}
