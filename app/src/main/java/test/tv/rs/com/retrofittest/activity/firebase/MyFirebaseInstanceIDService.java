package test.tv.rs.com.retrofittest.activity.firebase;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Akash.Sharma on 10/27/2017.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {

    private static String TAG = "Token_Instance";

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server
        // sendRegistrationToServer(refreshedToken);
    }
}

