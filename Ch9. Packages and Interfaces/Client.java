// Implementing an interface

/*
- The methods implementing an interface should be defined public
*/
class Client implements Callback {
    public void callback(int p){
        System.out.println("Client: callback() called with " + p);
    }

    public static void main(String[] args){
        Client c = new Client();
        c.callback(1);
    }
}

// Implementing an interface with additional members

class ClientC implements Callback {
    public void callback(int p){
        System.out.println("ClientC: Another Client implementing Callback");
        System.out.println("ClientC: callback() called with " + p);
        System.out.println("ClientC: p squared is " + p*p);
    }

    void nonIfaceMeth(){
        System.out.println("ClientC: Classes that implements interface may also define other members");
    }

    public static void main(String[] args){
        ClientC c = new ClientC();
        c.callback(1);
        c.nonIfaceMeth();
    }
}