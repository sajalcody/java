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
        super(l,w,h); // Accessing constructor of immediate superclass i.e. Box
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

class Shipment extends BoxWeight{
    int cost;
    Shipment(int l, int w, int h, int W, int c){
        super(l, w, h, W);// Accessing constructor of immediate superclass i.e. BoxWeight
        cost = c;
    }
    Shipment(Shipment obj){
        super(obj);
        cost = obj.cost;
    }
    Shipment(){
        super();
        cost=-1;
    }
    Shipment(int len, int m, int c){
        super(len,m);
        cost = c;
    }
}
public class DemoShipment {
    public static void main(String[] args){
        Shipment ship1 = new Shipment();
        ship1.volume();
        System.out.println("Weight of ship1: " + ship1.weight);
        System.out.println("cost of ship1: " + ship1.cost);

    }
}