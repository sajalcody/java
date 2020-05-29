// INHERITANCE USING BOX CLASS
// SUPERCLASS VARIABLE REFERENCING A SUBCLASS OBJECT
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
        length = l;
        width = w;
        height = h;
        weight = W;
    }
}

class BoxColor extends Box{
    int color;
    BoxColor (int l, int w, int h, int c){
        length = l;
        width = w;
        height = h;
        color = c;
    }
}

class DemoBoxInheritance {
    public static void main(String[] args){
        BoxColor colorBox = new BoxColor(1,2,3, 101);
        colorBox.volume();
        Box box = new Box();
        box=colorBox; // Assigning reference object of subclass to superclass variable (VALID)
        System.out.println("Dimensions of color box: " + box.length+" " + box.width + " " + box.height);
        /* A superclass object can only access its members and not the members of subclass*/
        System.out.println("Color of color box: " + box.color); //ERROR
    }
}