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
       int flag = 0;
       int index = 0;
       int sum = 0;
       if(args[0].equals("-"))
       {
           flag=1;
           index=1;
       }
       
       for(int i=index; i < args.length; i++){
           if(flag==0)
               sum += Integer.valueOf(args[i]) ;
           if(flag==1)
               sum -= Integer.valueOf(args[i]) ;
       }
       return sum;
    }

}
