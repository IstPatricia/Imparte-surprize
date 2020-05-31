import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises {
    private IBag bag;
    private int waitTime;


    public AbstractGiveSurprises(String bagType, int waitTime) {
        IBagFactory iBagFactory = new BagFactory();
        this.bag = iBagFactory.makeBag(bagType);
        this.waitTime = waitTime;
    }


     void put(ISurprise newSurprise) {
        //The method adds a new surprise to the container

        bag.put(newSurprise);
    }

     void put(IBag surprises) {
        /*
        The method moves all surprises from the
        parameter container to this container
        */
        while(!surprises.isEmpty()){
            bag.put(surprises.takeOut());

        }
    }

     void give() {
        /*The method offers a surprise, but the order in which the surprises
        are distributed depends on the bag type
        */

        bag.takeOut().enjoy();
        giveWithPassion();
    }


     void giveAll() {
        /*The method offers all the surprises, but after each surprise
        we will have to wait a certain time interval
        */
        while (!bag.isEmpty()) {

            give();

            try {
                TimeUnit.SECONDS.sleep(waitTime); // number of seconds to sleep
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


     boolean isEmpty() {
        //The method verifies if the bag is emplty or not

        if (bag.isEmpty()) {
            return true;
        }
        return false;
    }


    //This method will be called right after a surprised is given
    abstract void giveWithPassion();
}


