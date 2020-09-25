/* Noah Castetter 
*  nbc170001
*  9-23-2020
*/

package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide an arbitrary number of integers to add");
        }
    }

    private static int addArguments(String[] args) {

	int sum = 0;

	for(int c = 0; c < args.length(); c++){
		sum += Integer.valueOf(args[c]);
	}
        return sum;
    }
}
