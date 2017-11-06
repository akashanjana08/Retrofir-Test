package test.tv.rs.com.retrofittest.activity;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Akash.Sharma on 11/1/2017.
 */

public class MyLocalBindService extends Service {


    IBinder ibinder = new LocalBinder();

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return ibinder;
    }

   public class LocalBinder extends Binder{

        MyLocalBindService getService(){

            return MyLocalBindService.this;
        }
    }

    public Date getCurrentDate() {
        return Calendar.getInstance().getTime();
    }

}
