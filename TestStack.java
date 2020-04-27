
class Stack {
    int stack[] = new int[10];
    int top;

    Stack(){
        top=-1;
    }

    void push(int element){
        if(top==9)
            System.out.println("Overflow");
        else
            stack[++top]=element;
    }

    int pop(){
        if(top < 0){
            System.out.println("Underflow");
            return -1;
        }
        else
            return stack[top--];
    }
}

class TestStack{
    public static void main(String[] args){
        Stack mystack = new Stack();
        mystack.push(-1);
        mystack.push(0);
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
    }
}