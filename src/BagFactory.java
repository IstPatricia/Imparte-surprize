public class BagFactory implements IBagFactory {

    @Override
    public IBag makeBag(String bagType) {
        if(bagType == null){
            return null;
        }

        if(bagType.equalsIgnoreCase("RANDOM")){
            return new RandomBag();
        }

        if(bagType.equalsIgnoreCase("FIFO")){
            return new FIFOBag();
        }

        if(bagType.equalsIgnoreCase("LIFO")){
            return new LIFOBag();
        }
        return null;
    }
}
