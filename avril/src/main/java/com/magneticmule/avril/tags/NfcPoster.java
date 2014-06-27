package com.magneticmule.avril.tags;

import android.content.Intent;
import android.nfc.NfcAdapter;
import android.nfc.Tag;

/**
 * Created by tommy on 12/06/14.
 */
public class NfcPoster extends Poster implements Readable, Writeable {

    private Tag mTag = null;
    private PayLoad mPayLoad = null;

    public PayLoad readTag(Intent intent) {
        mTag = intent.getParcelableExtra(NfcAdapter.EXTRA_TAG);
        payLoad = new PayLoad(mTag);

        return payLoad;
    }

    @Override
    public void writeTag() {

    }


}
