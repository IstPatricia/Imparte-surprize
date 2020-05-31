public class MinionToy implements ISurprise {

    private String name;
    static int lastMinionOffered = 0;
    private static String[] minionName = {"Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"};

    public MinionToy() {
    }

    public MinionToy(String name) {
        this.name = name;
    }


     static MinionToy generate() {
        //The method will choose in order the next type of minion

        if (lastMinionOffered == (minionName.length)) {
            lastMinionOffered = 0;
        }

        MinionToy minionToy = new MinionToy(minionName[lastMinionOffered]);
        lastMinionOffered++;

        return minionToy;
    }

    @Override
    public void enjoy() {

        System.out.println("Congratulations! You won a minion toy named " + name);
    }
}
