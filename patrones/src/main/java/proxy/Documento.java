package proxy;

public class Documento
{
    private String nombreDoc;
    private String texto;
    private ImagenProxy imgProxy;
    
    public Documento( String nombreDoc )
    {
        this.setNombreDoc( nombreDoc );
        this.cargarContenido();
        this.mostrar();
    }
    
    public String getNombreDoc()
    {
        return this.nombreDoc;
    }

    public void setNombreDoc( String nombreDoc )
    {
        this.nombreDoc = nombreDoc;
    }

    public void cargarContenido()
    {
        // Se carga el supuesto documento y obtenemos su contenido en donde hay una imagen
        this.texto = "Texto del documento";
        this.imgProxy = new ImagenProxy( "imagen.jpg" );
        System.out.println("Documento cargado para mostrar el contenido");
    }

    public void mostrar()
    {
        System.out.println("Mostrando el contenido del documento...\n");
    }

    // Simulando el evento de scroll que hace que se muestre una imagen
    public void hacerScroll()
    {
        System.out.println("El usuario ha hecho scroll donde se encuentra una imagen...");
         imgProxy.mostrarImagen();
    }
}