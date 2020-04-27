
public class CommandLine {
    public static void main(String[] args){
        for(String arg : args){
            System.out.println(arg);
        }
        /* OR
        for(int i = 0; i <args.length; i++){
            System.out.println(args[i]);
        }
        */
    }
}