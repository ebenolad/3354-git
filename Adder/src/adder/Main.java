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
        return (args[1] + args[2]);
    }
   
}
