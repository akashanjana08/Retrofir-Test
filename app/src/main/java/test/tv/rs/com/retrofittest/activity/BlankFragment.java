package test.tv.rs.com.retrofittest.activity;


import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

import butterknife.BindColor;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import test.tv.rs.com.retrofittest.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    @BindView(R.id.tv1)
    TextView textview1;


    @BindView(R.id.tv2)
    TextView textview2;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        ButterKnife.bind(this,view);

        Bundle bundle   = getArguments();
        textview1.setText(bundle.getString("Name"));
        textview2.setText(bundle.getString("mobile"));

        Intent intent = new Intent(getActivity(),MyLocalBindService.class);
        getActivity().bindService(intent,serviceConnection, Context.BIND_AUTO_CREATE);

        return view;
    }


    @OnClick(R.id.stopService)
    public void stopMyService()
    {
        getActivity().stopService(new Intent(getActivity(),MyService.class));
    }


    ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {

            MyLocalBindService.LocalBinder localBindservice = (MyLocalBindService.LocalBinder)service;
            MyLocalBindService myLocalBinder = localBindservice.getService();
            Date date = myLocalBinder.getCurrentDate();
            Toast.makeText(getActivity(),date.toString(),Toast.LENGTH_LONG).show();

        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };

}
