package com.nayanzin.jnidemo;

import static org.assertj.core.api.Assertions.assertThat;

import com.nayanzin.jnidemo.config.NativeAwareTestBase;
import org.junit.Test;

public class NativeExampleTest extends NativeAwareTestBase {

    private NativeExample nativeExample = new NativeExample();

    @Test
    public void nativeIntMethodTest() {
        assertThat(nativeExample.square(2)).isEqualTo(4);
    }
}