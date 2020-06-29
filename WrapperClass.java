class WrapperClass{
    static int classGarbage;
    public static void main(String[] args){
        Integer iobj = new Integer(1); //iobj represents 1
        Integer iobjfromInt = 1; //This also works
        // Integer iobj1 = Integer.valueOf ("2.0");
        // Double iobj2 = Integer.valueOf ("2.0"); Error
       int i = Integer.parseInt ("2");

        System.out.println("int in iobj: " + iobj.intValue());
        System.out.println(i);
        // System.out.println("int in iobj1: " + iobj1.intValue());
        int garbage;
        System.out.println("Let's see: " + classGarbage);
    }
}