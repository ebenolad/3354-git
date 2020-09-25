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

	int sum = Integer.valueOf(args[1]);
	
	if(args[0] = "-"){
		
		for(int b = 2; b < args.length: b++){
			sum -= Integer.valueOf(args[b]);
		}
	}else{

		for(int c = 2; c < args.length; c++){
			sum += Integer.valueOf(args[c]);
		}

	}

        return sum;
    }
}
