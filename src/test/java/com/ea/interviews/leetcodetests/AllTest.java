package com.ea.interviews.leetcodetests;

import com.ea.interviews.leetcode.ReverseInteger7;
import org.junit.Test;

public class AllTest {

    @Test
    public void reverseInteger(){
        ReverseInteger7 reverseInteger = new ReverseInteger7();
        assert (reverseInteger.reverse(321)==123);
        assert (reverseInteger.reverse(-321)==-123);
        assert (reverseInteger.reverse(1111111119)==0);
        assert (reverseInteger.reverse(0)==0);
        assert (reverseInteger.reverse(00)==00);
    }

}