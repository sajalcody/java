class Exc2{
    public static void main(String[] args){
        int d, a;

        try{
            d = 0;
            a = 42/d;
        }
        catch(ArithmeticException e){
            System.out.println("Divide by Zero Error:" + e);
        }
        System.out.println("After Catch Statement");
    }
}