package test.tv.rs.com.retrofittest.activity;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by Akash.Sharma on 11/6/2017.
 */

public class MessangerBindService extends Service {


    IBinder iBinder = new Messenger(new ServiceHandler()).getBinder();

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return iBinder;
    }


    class ServiceHandler extends Handler{

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

            Bundle bundle = msg.getData();
            String ClientData  = bundle.getString("ClientData");
            Toast.makeText(getApplicationContext(),ClientData,Toast.LENGTH_LONG).show();

        }
    }

}
