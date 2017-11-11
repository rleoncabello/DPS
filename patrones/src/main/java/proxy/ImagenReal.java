package proxy;

public class ImagenReal implements Imagen
{
    private String nombre;
    
    public ImagenReal( String nombre )
    {
        this.nombre = nombre;
    }

    public void mostrarImagen()
    {
        System.out.println("Mostrando imagen: [" + nombre + "]" );
    }
}