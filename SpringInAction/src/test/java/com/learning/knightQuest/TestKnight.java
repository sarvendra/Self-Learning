package com.learning.knightQuest;

import com.learning.knightQuest.BraveKnight;
import com.learning.knightQuest.Quest;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class TestKnight {
    @Test
    public void knightEmbarkOnQuest() {
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }
}
