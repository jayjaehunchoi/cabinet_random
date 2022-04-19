import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CabinetTest {
    @Test
    void allocate() {
        List<String> result = Cabinet.allocate("15:소주캉,17:크리스");
        assertThat(result).hasSize(109);
        assertThat(result.get(15)).isEqualTo("소주캉");
        assertThat(result.get(17)).isEqualTo("크리스");
        assertThat(result.get(27)).isEqualTo("X");
        assertThat(result.get(54)).isEqualTo("X");
        assertThat(result.get(81)).isEqualTo("X");
        for (int i = 82; i < 108; i++) {
            assertThat(result.get(i)).isEqualTo("X");
        }
        assertThat(result.get(108)).contains("조커");
        showResult(result);
    }

    private void showResult(List<String> result) {
        System.out.println(result);
    }

}
