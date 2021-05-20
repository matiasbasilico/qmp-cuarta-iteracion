import clima.AccuWeatherAPI;
import org.junit.jupiter.api.Test;
import prenda.Atuendo;
import prenda.Categoria;
import prenda.Prenda;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Atuendos {
  @Test
  public void pantalonEnVerano(){

    Atuendo atuendo = new Atuendo();
    atuendo.agregarPrenda(crearPrendaPantalon());
    assertEquals(false, atuendo.atuentoAptoTemperatura(25));

  }

  public Prenda crearPrendaPantalon(){
    Prenda prenda = new Prenda("pantalon", 20);
    prenda.setCategoria(Categoria.PANTALON);
    return prenda;
  }
}
