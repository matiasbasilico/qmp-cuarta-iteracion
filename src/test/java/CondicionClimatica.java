import clima.AccuWeatherAPI;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CondicionClimatica {

  @Test
  public void condicionesBuenosAires(){
    AccuWeatherAPI apiClima = new AccuWeatherAPI();
    List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather("Buenos Aires, Argentina");
    assertEquals("0", condicionesClimaticas.get(0).get("PrecipitationProbability"));

  }

}
