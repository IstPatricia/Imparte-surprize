public final class GatherSurprises {

    private GatherSurprises() {
    }

    static ISurprise[] gather(int n) {
        ISurprise[] surprises = new ISurprise[n];

        for (int i = 0; i < n; i++) {
            surprises[i] = gather();
        }
        return surprises;
    }

    static ISurprise gather() {

        int n = RandomGenerator.generateRandom(3);

        switch (n){
            case 0:
                return FortuneCookie.generate();
            case 1:
                return Candies.generate();
            case 2:
                return MinionToy.generate();
        }
        return null;
    }
}
