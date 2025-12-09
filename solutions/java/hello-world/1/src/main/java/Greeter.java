class Greeter {

    String getGreeting() {
        return "Hello, World!";
    }
    public static void main(String[] args){
        Greeter g = new Greeter();
        System.out.println(g.getGreeting());
    }
    
}
