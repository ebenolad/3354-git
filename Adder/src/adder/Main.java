package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } 
        catch (NumberFormatException nfe) {
            System.err.println("Please provide valid input");
        } 
        catch (Exception e) {
            System.err.println("Please provide two integers to add");
        }
    }

    private static int addArguments(String[] args) {
        int sum = 0;
        
        if(args[0].equals("-")) { // if first argument is the subtraction sign (-), then subtract the remaining arguments
            for(int i = 1; i < args.length; i++){
                sum -= Integer.parseInt(args[i]);
            }
        }
        else{
            for(int i = 0; i < args.length; i++){ // add integers
                sum += Integer.parseInt(args[i]);
            }
        }

        return sum;
    }
}
