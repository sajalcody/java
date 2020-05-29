class Box{
    int length, height, width;

    Box(){
        length = width = height = -1;
    }
    Box (Box obj){
        length = obj.length;
        width = obj.width;
        height = obj.height;
    }

    Box (int l, int w, int h){
        length = l;
        width = w;
        height = h;
    }

    Box(int len){
        length = width = height = len;
    }
    void volume(){
        int volume = length*height*width;
        System.out.println("Volume: " + volume);
    }
}

class BoxWeight extends Box{
    int weight;
    BoxWeight(int l, int w, int h, int W){
        super(l,w,h); // Accessing constructor of immediate superclass
        weight = W;
    }
    BoxWeight (BoxWeight ob){
        super(ob);
        weight = ob.weight;
    }
    BoxWeight (){
        super();
        weight = -1;
    }
    BoxWeight (int len, int m){
        super(len);
        weight = m;
    }
}

class DemoSuper {
    public static void main(String[] args){
        BoxWeight mybox1 = new BoxWeight(1,2,3,4);
        BoxWeight mybox2 = new BoxWeight(20,30,40,5);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight cube = new BoxWeight(4, 8);
        // Object of subclass is passed to the constructor, not of the super class
        BoxWeight clone = new BoxWeight(mybox1);

        mybox1.volume();
        System.out.println("Weight of mybox: " + mybox1.weight);
        mybox2.volume();
        System.out.println("Weight of mybox: " + mybox2.weight);
        mybox3.volume();
        System.out.println("Weight of mybox: " + mybox3.weight);
        cube.volume();
        System.out.println("Weight of mybox: " + cube.weight);
        clone.volume();
        System.out.println("Weight of mybox: " + clone.weight);
    }
}