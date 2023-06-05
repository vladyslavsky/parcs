import java.util.List;
import java.util.ArrayList;
import parcs.*;

public class GCD implements AM {
    public void run(AMInfo info) {
        Pair p = (Pair)info.parent.readObject();
	int a = p.getFirst();
	int b = p.getSecond();
	int a_start = a;
	int b_start = b;
	while(a != 0 && b != 0) {
	    if (a > b) {
		a %= b;
	    } else {
		b %= a;
	    }
	}
        System.out.println("GCD[" + a_start + " " + b_start + "] = " + (a+b));
        info.parent.write(a+b);
    }
}
