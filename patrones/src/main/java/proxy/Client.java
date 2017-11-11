package proxy;

public class Client
{
    public static void main( String[] args )
    {
        // Abrimos un documento que puede contener una sola imagen
         Documento doc = new Documento( "Presupuesto.doc");
        try     // Necesario al usar Thread
        {
            // Pausamos la ejecución del programa durante 3 segundos
            Thread.sleep( 3000 );
            // Simulamos que el usuario hace scroll
             doc.hacerScroll();
        }
        catch( Exception e )
        {
            System.out.println("Ha ocurrido un error");
        }
    }
}