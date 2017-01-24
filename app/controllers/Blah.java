//class HelloWorld {
//    public static void main(String[] args) {
//        doTests();
//    }
//
//    private static void doTests() {
//        GameScore score1, score2, score3, bet1, bet2, bet3;
//
//        score1 = new GameScore(3, 1); //Host team wins 3 : 1
//        bet1 = new GameScore(3, 1);
//
//        score2 = new GameScore(2, 3);
//        bet2 = new GameScore(0, 1);
//
//        score3 = new GameScore(2, 2); // Draw
//        bet3 = new GameScore(2, 0);
//
//        System.out.println(score1.compareWithGuess(bet1));
//        System.out.println(score2.compareWithGuess(bet2));
//        System.out.println(score3.compareWithGuess(bet3));
//    }
//}
//
//enum GameWinner {HOST, GUEST, NONE}
//
//class GameScore {
//    public int hostScore, guestScore;
//
//    public GameScore(int hostScore, int guestScore) {
//        this.hostScore = hostScore;
//        this.guestScore = guestScore;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        GameScore gameScore = (GameScore) o;
//
//        if (guestScore != gameScore.guestScore) return false;
//        if (hostScore != gameScore.hostScore) return false;
//
//        return true;
//    }
//
//    public GameWinner winner() {
//        return (hostScore > guestScore) ? GameWinner.HOST : (hostScore < guestScore) ? GameWinner.GUEST : GameWinner.NONE;
//    }
//
//    // public int compareWithGuess(@NotNull GameScore bet) {    //Online compiler doesn't recognize package javax.validation.constraints.NotNull;
//    public int compareWithGuess(GameScore bet) {    //Imaginary null-check here (for online compiler only)
//        return (equals(bet)) ? 2 : (winner() == bet.winner()) ? 1 : 0;
//    }
//}