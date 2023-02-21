package ss08_mvc.refactoring;

public class TennisGame {

    public static String getScore(String firstPlayerName, String SecondPlayerName, int firstPlayerScore, int secondPlayerScore) {
        String score = "";
        int tempScore = 0;
        if (firstPlayerScore == secondPlayerScore) {
            switch (firstPlayerScore) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;
            }
        } else if (firstPlayerScore >= 4 || secondPlayerScore >= 4) {
            int minusResult = firstPlayerScore - secondPlayerScore;
            if (minusResult == 1) {
                score = "Advantage firstPlayer";
            } else if (minusResult == -1) {
                score = "Advantage secondPlayer";
            } else if (minusResult >= 2) {
                score = "Win for firstPlayer";
            } else {
                score = "Win for secondPlayer";
            }
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    tempScore = firstPlayerScore;
                } else {
                    score += "-";
                    tempScore = secondPlayerScore;
                }
                switch (tempScore) {
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }
}