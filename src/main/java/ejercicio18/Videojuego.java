package ejercicio18;

public class Videojuego implements Entregable {

    private String titulo = "";
    private int horas = 10;
    private boolean entregado = false;
    private String genero = "";
    private String compania = "";

    public Videojuego() {
    }

    public Videojuego(String titulo, int horas) {
        this.titulo = titulo;
        this.horas = horas;
    }

    public Videojuego(String titulo, int horas, String genero, String compania) {
        this.titulo = titulo;
        this.horas = horas;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "Videojuego {" +
                "Titulo:'" + titulo + '\'' +
                ", Horas:" + horas +
                ", Entregado:" + entregado +
                ", Genero:'" + genero + '\'' +
                ", Compania:'" + compania + '\'' +
                '}';
    }

    public void entregar(){
        this.entregado = true;
    }

    public void devolver(){
        this.entregado = false;
    }

    public boolean isEntregado(){
        return this.entregado;
    }

    public int compreTo(Object a){
        Videojuego videojuego = (Videojuego) a;
        if(videojuego.getHoras() > this.horas)
            return 1;
        else return 0;
    }
}
