package fachada;
//Clase fachada
public class Fachada
{
    private ComprobarLiquidos liquidos;
    private ComprobarAsiento asiento;
    private ComprobarEspejos espejos;
    private Arranque arranque;
   
    public Fachada()
    {
        this.liquidos = new ComprobarLiquidos();
        this.asiento  = new ComprobarAsiento();
        this.espejos  = new ComprobarEspejos();
        this.arranque = new Arranque();
    }
   
    public void arrancarCoche()
    {
        liquidos.comprobar();
        asiento.comprobar();
        espejos.comprobar();
        arranque.encenderContacto();
    }
}