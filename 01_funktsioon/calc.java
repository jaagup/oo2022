public class calc{
    public static void main(String args[]){
        int length = args.length;
        double[] valueArray = new double [length];

        for (int i = 1; i < length; i++)
        {
            System.out.println(args[i]);
            valueArray[i] = Double.parseDouble(args[i]);
        }

        System.out.println(args[0].getClass().getSimpleName());
        System.out.println("test");
        
        if(args[0].equals("plus")){
            System.out.println("test plus");
            System.out.println(plus(valueArray[1], valueArray[2]));
        } 
        else if (args[0].equals("minus")) 
        {
            System.out.println(minus(valueArray[1], valueArray[2]));
        }
        else if (args[0].equals("multiply"))
        {
            System.out.println(multiply(valueArray[1], valueArray[2]));
        }
        else if (args[0].equals("divide")) 
        {    
            System.out.println(divide(valueArray[1], valueArray[2]));
        }
    }
    
    public static double plus(double a, double b){
        return a + b;
    }
    public static double minus(double a, double b){
        return a - b;
    }
    public static double multiply(double a, double b){
        return a * b;
    }
    public static double divide(double a, double b){
        return a / b;
    }
}    
