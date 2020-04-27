class Box{
    int length, height, width;
}
class BoxDemo {
    public static void main(String[] args){
        Box mybox = new Box();
        mybox.length = 10;
        mybox.height = 10;
        mybox.width = 10;

        int volume = mybox.length*mybox.height*mybox.width;

        System.out.println("Volume: " + volume);
        }
    }