package test.tv.rs.com.retrofittest.activity;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import test.tv.rs.com.retrofittest.R;

/**
 * Created by Akash.Sharma on 10/26/2017.
 */

public class ExampleFragmentActivity extends AppCompatActivity {

    boolean locationAccepted;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_fragment);

        Toast.makeText(this,"Oncreate",Toast.LENGTH_LONG).show();

        getSupportFragmentManager().beginTransaction().replace(R.id.container, new OneFragment()).commit();
        requestPermissions(new String[]{"android.permission.READ_PHONE_STATE"},200);
     }


    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"onPause",Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onStart",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onStop",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onResume",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"onRestart",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onRequestPermissionsResult(int permsRequestCode, String[] permissions, int[] grantResults) {

        switch (permsRequestCode) {

            case 200:

                locationAccepted = grantResults[0] == PackageManager.PERMISSION_GRANTED;
                break;

        }
    }
}
