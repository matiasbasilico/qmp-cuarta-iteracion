package prenda;

public class Prenda {

  private String denominacion;
  private double temperaturaMaxima;
  private Categoria categoria;


  public Prenda(String denominacion, double temperaturaMaxima) {
    this.temperaturaMaxima = temperaturaMaxima;
  }

  public boolean esApta(double temperaturaActual){
    return temperaturaMaxima >= temperaturaActual;
  }

  public Categoria getCategoria() {
    return categoria;
  }

  public void setCategoria(Categoria categoria) {
    this.categoria = categoria;
  }
}
