package Aula02;

public class Main {

    public static void main(String[] args) {
        System.out.println("Iniciou do programa no metodo Main");
        a();
        System.out.println("Finalizou do programa no metodo Main");
    }

    static void a() {
        System.out.println("Entrou no metodo a.");
        b();
        System.out.println("Finalizou o metodo a.");
    }

    static void b() {
        System.out.println("Entrou no metodo b.");
        for (int i = 0; i <= 4 ; i++ ) System.out.print(i);
        c();
        System.out.println("Finalizou o metodo b.");
    }

    static void c() {
        System.out.println("Entrou no metodo c.");
        Thread.dumpStack();
        System.out.println("Finalizou o metodo c.");
    }
}
