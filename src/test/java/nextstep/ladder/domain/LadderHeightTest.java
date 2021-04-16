package nextstep.ladder.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class LadderHeightTest {

    @Test
    @DisplayName("높이를 입력받아 높이 객체를 생성한다.")
    public void create() throws Exception {
        LadderHeight ladderHeight = new LadderHeight("5");
        assertThat(ladderHeight).isEqualTo(new LadderHeight(5));
    }

    @Test
    @DisplayName("1 미만일 경우 예외가 발생한다.")
    public void validateHeight() throws Exception {
        assertThatIllegalArgumentException().isThrownBy(() -> new LadderHeight(0));
    }
}