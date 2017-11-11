package fachada;

public class Client
{
    public static void main(String[] args)
    {
        Fachada fachada = new Fachada();
        fachada.arrancarCoche();
        System.out.println("\nProceso finalizado.");
    }
}