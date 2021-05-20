package prenda;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class Atuendo {
  private List<Prenda> prendas;

  public Atuendo() {
    this.prendas = new ArrayList<>();
  }

  public void agregarPrenda(Prenda prenda){
    this.prendas.add(prenda);
  }

  public boolean atuentoAptoTemperatura(double temperatura){
    AtomicBoolean esApto = new AtomicBoolean(false);
    prendas.forEach(prenda -> {
      esApto.set(prenda.esApta(temperatura));
    });
    return esApto.get();
  }

}
