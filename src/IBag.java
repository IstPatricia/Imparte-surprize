public interface IBag {

    // The method adds a surprise in the bag
    void put(ISurprise newSurprise);

    /* The method adds all the surprises from another IBag
     the 'bagOfSurprises' will be empty() afterwards
     */
    void put(IBag bagOfSurprises);

    // The method removes a surprise from the bag and returns it
    ISurprise takeOut();

    // The method checks if the bag is empty or not
    boolean isEmpty();

    // The method returns the number of surprises
    int size();

}
