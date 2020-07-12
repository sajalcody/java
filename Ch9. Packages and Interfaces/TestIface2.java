class TestIface2 {
    public static void main(String[] args){
        Client c = new Client();
        ClientC cc = new ClientC();
        Callback cb;
        cb = c;
        cb.callback(2);
        cb = cc;
        cb.callback(2);
    }
}