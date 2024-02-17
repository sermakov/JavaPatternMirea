import java.util.Comparator;

public class ComparatorAbs implements Comparator<Double> {
    @Override
    public int compare(Double o1, Double o2) {
        return Double.compare(Math.abs(o1), Math.abs(o2));
    }
}
