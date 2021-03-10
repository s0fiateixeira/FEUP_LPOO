package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ListAggregatorTest {

    public ListAggregator aggregator, aggregator2;

    @BeforeEach
    public void helper(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2);
        list.add(5);

        aggregator = new ListAggregator(list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(-1);
        list2.add(-4);
        list2.add(-5);

        aggregator2 = new ListAggregator(list2);
    }

    @Test
    public void sum() {
        int sum = aggregator.sum();

        Assertions.assertEquals(14, sum);
    }

    @Test
    public void max() {
        int max = aggregator.max();
        Assertions.assertEquals(5, max);
    }

    @Test
    public void max_bug_7263()
    {
        int max = aggregator2.max();
        Assertions.assertEquals(-1, max);
    }

    @Test
    public void min() {
        int min = aggregator.min();

        Assertions.assertEquals(1, min);
    }

    @Test
    public void distinct() {
        int distinct = aggregator.distinct();

        Assertions.assertEquals(4, distinct);
    }
}
