package com.magneticmule.avril.tests;

/**
 * Created by tommy on 12/06/14.
 */

import com.magneticmule.avril.tags.NfcPoster;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import static org.fest.assertions.api.ANDROID.assertThat;


@Config(emulateSdk = 18) //Robolectric support API level 18,17, 16, but not 19
@RunWith(RobolectricTestRunner.class)
public class NfcPosterTest {

    private NfcPoster nfcPoster;

    @Before
    public void setup() {
        //do whatever is necessary before every test
        // nfcPoster = Robolectric.
    }

    @Test
    public void testReturnedPayload() {

    }
}
