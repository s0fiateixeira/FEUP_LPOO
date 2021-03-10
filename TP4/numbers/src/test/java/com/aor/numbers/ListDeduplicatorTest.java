package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ListDeduplicatorTest {

    public List<Integer> list, expected;
    public ListDeduplicator deduplicator;

    @BeforeEach
    public void helper() {
        list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2);
        list.add(5);

        expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(4);
        expected.add(5);

        deduplicator = new ListDeduplicator(list);
    }

    @Test
    public void deduplicate() {
        List<Integer> distinct = deduplicator.deduplicate();

        Assertions.assertEquals(expected, distinct);
    }
}
