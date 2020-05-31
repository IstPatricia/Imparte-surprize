
public class FortuneCookie implements ISurprise {

    private String message;
    private static String[] sayings = {"Your road to glory will be rocky, but fulfilling.",
            "Patience is your alley at the moment. Don’t worry!",
            "Nothing is impossible to a willing heart.",
            "Don’t worry about money. The best things in life are free.",
            "Don’t pursue happiness – create it.",
            "Courage is not the absence of fear; it is the conquest of it.",
            "All things are difficult before they are easy.",
            "A ship in harbor is safe, but that’s not why ships are built.",
            "If you want the rainbow, you have to tolerate the rain.",
            "One that would have the fruit must climb the tree.",
            "It takes less time to do a thing right than it does to explain why you did it wrong.",
            "Be not afraid of growing slowly, be afraid only of standing still.",
            "It’s amazing how much good you can do if you don’t care who gets the credit.",
            "You must try, or hate yourself for not trying.",
            "The greatest risk is not taking one.",
            "If you have something worth fighting for, then fight for it.",
            "You only need look to your own reflection for inspiration. Because you are Beautiful!",
            "If you are afraid to shake the dice, you will never throw a six.",
            "Do not follow where the path may lead. Go where there is no path...and leave a trail",
            "All progress occurs because people dare to be different."
    };


    public FortuneCookie() {
    }

    public FortuneCookie(String message) {
        this.message = message;
    }


     static FortuneCookie generate() {
        int random = RandomGenerator.generateRandom(sayings.length);
        return new FortuneCookie(sayings[random]);

    }


    @Override
    public void enjoy() {
        System.out.println("Unwrapping...Your cookie says:");
        System.out.println(message);
    }
}
