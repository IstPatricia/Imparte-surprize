
public class MAIN {

    public static void main(String[] args) {

        ISurprise[] surprises = GatherSurprises.gather(10);
        /// random bag


        BagFactory bagFactory = new BagFactory();

        IBag bagR = bagFactory.makeBag("RANDOM");
        IBag bagL = bagFactory.makeBag("LIFO");
        IBag bagF = bagFactory.makeBag("FIFO");

        bagR.put(GatherSurprises.gather());
        bagR.put(GatherSurprises.gather());
        bagR.put(GatherSurprises.gather());
        bagR.put(GatherSurprises.gather());
        bagR.put(GatherSurprises.gather());
        bagR.put(GatherSurprises.gather());

        AbstractGiveSurprises giveSurprises = new GiveSurpriseAndSing("Random", 1);
        giveSurprises.put(bagR);
        giveSurprises.giveAll();


//        bagF.put(GatherSurprises.gather());
//        bagF.put(GatherSurprises.gather());
//        bagF.put(GatherSurprises.gather());
//        bagF.put(GatherSurprises.gather());
//        bagF.put(GatherSurprises.gather());
//        bagF.put(GatherSurprises.gather());
//
//        AbstractGiveSurprises giveSurprises2 = new GiveSurpriseAndHug("Fifo", 1);
//        giveSurprises2.put(bagF);
//        giveSurprises2.giveAll();


//        bagL.put(GatherSurprises.gather());
//        bagL.put(GatherSurprises.gather());
//        bagL.put(GatherSurprises.gather());
//        bagL.put(GatherSurprises.gather());
//        bagL.put(GatherSurprises.gather());
//        bagL.put(GatherSurprises.gather());
//
//        AbstractGiveSurprises giveSurprises3 = new GiveSurpriseAndApplause("Lifo", 1);
//        giveSurprises3.put(bagL);
//        giveSurprises3.giveAll();


    }
}
