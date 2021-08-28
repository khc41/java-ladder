package nextstep.ladder.domain.ladder;

import nextstep.ladder.domain.ladder.factory.LadderFactory;
import nextstep.ladder.domain.ladder.line.HorizontalLine;
import nextstep.ladder.domain.ladder.line.HorizontalLines;
import nextstep.ladder.domain.ladder.line.strategy.HorizontalLinesGenerateRandomStrategy;
import nextstep.ladder.domain.ladder.line.strategy.HorizontalLinesGenerateSequentialStrategy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class LadderTest {

    private Ladder prevLadder;
    private Ladder ladder;

    @BeforeEach
    void setUp() {
        prevLadder = LadderFactory.generateWith(5, new HorizontalLinesGenerateSequentialStrategy(2));
        ladder = LadderFactory.generateWith(5, new HorizontalLinesGenerateSequentialStrategy(3));
    }


    @Test
    @DisplayName("이전 사다리와 중복되는 라인은 지운다")
    void removeDuplicatedHorizontalLines() {
        HorizontalLines horizontalLines = ladder.getHorizontalLines();

        assertTrue(horizontalLines.contains(new HorizontalLine(0)));
        assertTrue(horizontalLines.contains(new HorizontalLine(1)));
        assertTrue(horizontalLines.contains(new HorizontalLine(2)));

        ladder.removeDuplicatedHorizontalLines(prevLadder);

        assertFalse(horizontalLines.contains(new HorizontalLine(0)));
        assertFalse(horizontalLines.contains(new HorizontalLine(1)));
        assertTrue(horizontalLines.contains(new HorizontalLine(2)));

    }
}