import java.math.BigDecimal;

public class Series {

    private BigDecimal epsilon;
    private BigDecimal answerAN = new BigDecimal(-1);
    private int n = -1;

    public Series(BigDecimal epsilon) {
        this.epsilon = epsilon;
    }

    public int getN() {
        return n;
    }

    public BigDecimal getAnswerAN() {
        return answerAN;
    }

    public BigDecimal getEpsilon() {
        return epsilon;
    }

    public void setEpsilon(BigDecimal epsilon) {
        this.epsilon = epsilon;
    }

    public void solveSeries() {
        for (int i=0 ; i<Integer.MAX_VALUE ; i++){
            BigDecimal devident = new BigDecimal(1.0);
            BigDecimal divider = new BigDecimal(Math.pow(i+1.0,2.0));
            BigDecimal aN = devident.divide(divider, 3, 5);
//            BigDecimal aN = devident.divide(divider, 40, BigDecimal.ROUND_HALF_EVEN);
//            System.out.println(aN.toString());
            if (epsilon.compareTo(aN)>0) {
                n = i;
                answerAN = aN;
                break;
            }
        }
    }
}
