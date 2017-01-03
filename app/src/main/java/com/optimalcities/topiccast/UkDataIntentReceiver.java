package com.optimalcities.topiccast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class UkDataIntentReceiver extends BroadcastReceiver {
    public UkDataIntentReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.

        String result = intent.getStringExtra(Constants.UK_DATA_BROADCAST_ACTION_RESULT);
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
