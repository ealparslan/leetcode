package com.ea.interviews.leetcodetests;

import com.ea.interviews.leetcode.ReverseInteger;
import org.junit.Test;

public class AllTest {

    @Test
    public void reverseInteger(){
        ReverseInteger reverseInteger = new ReverseInteger();
        assert (reverseInteger.reverse(321)==123);
        assert (reverseInteger.reverse(-321)==-123);
        assert (reverseInteger.reverse(1111111119)==0);
        assert (reverseInteger.reverse(0)==0);
        assert (reverseInteger.reverse(00)==00);
    }

}