package com.adam.app.android_simple_test;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;


public class ExampleUtilsTest {

    @Test
    public void checkString_empty_returnTrue() {
//        fail("Not implemented yet.");
        assertThat(Utils.isStringEmpty("")).isTrue();
    }
}
