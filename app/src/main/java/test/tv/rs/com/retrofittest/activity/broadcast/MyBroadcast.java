package test.tv.rs.com.retrofittest.activity.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Akash.Sharma on 11/2/2017.
 */

public class MyBroadcast extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context,"BroadCasting....",Toast.LENGTH_LONG).show();

    }
}
