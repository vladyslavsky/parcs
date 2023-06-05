import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

public class Pair implements Serializable {
    private int first;
    private int second;

    public Pair(int a, int b) {
	this.first = a;
	this.second = b;
    }

    public int getFirst() {
	return first;
    }

    public int getSecond() {
	return second;
    }
}
