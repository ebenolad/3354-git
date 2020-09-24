package adder;

class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            if(args.length < 2)
                throw new ArrayIndexOutofBoundsException();
            System.out.println(result);
        }
        catch(ArrayIndexOutofBoundsException e) {
            System.err.println("Not enough arguments to add");
        }
        catch(NumberFormatException n){
            System.out.println("Invalid character(s)");
        }
       
    }

    private static int addArguments(String[] args) {
        int sum = 0;
        for(int i=0;i<args.length;i++)
            sum += Integer.valueOf(args[i]);
        return sum;
    }
}
