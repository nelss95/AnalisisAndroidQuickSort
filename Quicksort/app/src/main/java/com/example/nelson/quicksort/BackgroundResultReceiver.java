package com.example.nelson.quicksort;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
/**
 * Created by nelson on 01/05/15.
 */
public class BackgroundResultReceiver extends ResultReceiver {
    private Receiver mReceiver;

    public BackgroundResultReceiver(Handler handler) {
        super(handler);
    }

    public void setReceiver(Receiver receiver) {
        mReceiver = receiver;
    }

    public interface Receiver {
        public void onReceiveResult(int resultCode, Bundle resultData);
    }

    @Override
    protected void onReceiveResult(int resultCode, Bundle resultData) {
        if (mReceiver != null) {
            mReceiver.onReceiveResult(resultCode, resultData);
        }
    }
}