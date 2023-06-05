import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import parcs.*;

public class Bluck {
    public static void main(String[] args) throws Exception {
        task curtask = new task();
        curtask.addJarFile("GCD.jar");
        int n = fromFile(curtask.findFile("input"));

        AMInfo info = new AMInfo(curtask, null);
	ArrayList<channel> channels = new ArrayList<channel>();
	for (int i = 1; i < n; i++) {
	    point p = info.createPoint();
	    channel c = p.createChannel();
	    p.execute("GCD");
	    Pair pair = new Pair(i, n);
	    c.write(pair);
	    channels.add(c);
	}

	System.out.println("Computing result...");
	int ans = 0;
	for (int i = 1; i < n; i++) {
	    if (channels.get(i-1).readInt() == 1) {
		ans += 1;
	    }
	}

        System.out.println("Result: " + ans);
        curtask.end();
    }

    public static int fromFile(String filename) throws Exception {
        Scanner sc = new Scanner(new File(filename));
        int n = sc.nextInt();
        return n;
    }
}
