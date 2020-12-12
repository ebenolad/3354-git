File: Main.java

public class Main
{
        public static void main(String args[])
        {
                try
                {
                        int result = addArguments(args);
                        System.out.println(result);
                }
                catch(Exception e)
                {
                        System.err.println("Please provide integers to add ");
                }
        }
        private static int addArguments(String[] args)
        {
                int sum = 0 ; // variable to store sum
                for(int i=0; i < args.length; i++)// Loop to add all array element
                {
                        sum = sum + Integer.valueOf(args[i]); // compute sum
                }
                return sum; //return sum
        }
}
