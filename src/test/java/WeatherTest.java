import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WeatherTest {

    @Test
    @DisplayName("Should zero days")
    void ShouldZeroDays(){
        Semana semana = new Semana(" ");
        semana.temperaturaMedia();
        assertThat(semana.temperaturaMedia()).isEqualTo(null);
    }

    @Test
    @DisplayName("Should seven days")
    void ShouldSevenDays(){
        Semana semana = new Semana("1 1 1 1 1 1 1");
        semana.temperaturaMedia();
        assertThat(semana.temperaturaMedia()).isEqualTo(0);
    }

    @Test
    @DisplayName("Should seven days with String")
    void ShouldSevenCaysWithString(){
        Semana semana = new Semana("1 1 1 1 a 1 1 ");
        semana.temperaturaMedia();
        assertThat(semana.temperaturaMedia()).isEqualTo(null);
    }
}
