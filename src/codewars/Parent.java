package codewars;

public class Parent {
    private void whoAreYou(){
        System.out.println("Parent");
    }

    public static void main(String[] args) {
Parent p = new Child();
p.whoAreYou();
    }

}
