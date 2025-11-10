public abstract class Contenido {
    protected String titulo;
    protected String descripcion;
    protected int capacidad;
    protected String tipo;

    public abstract void publicar();
    public abstract void visualizar();
}