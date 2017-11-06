package test.tv.rs.com.retrofittest.activity;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import test.tv.rs.com.retrofittest.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link OneFragment#} factory method to
 * create an instance of this fragment.
 */
public class OneFragment extends Fragment {

    @BindView(R.id.editText1)
    EditText edt1;

    @BindView(R.id.editText2)
    EditText edt2;

    @BindView(R.id.submit_button)
    Button  submit_button;



    // TODO: Rename parameter arguments, choose names that match
   @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

       View view = inflater.inflate(R.layout.fragment_one, container, false);

       ButterKnife.bind(OneFragment.this,view);


        /*submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                BlankFragment bf= new BlankFragment();
                Bundle b = new Bundle();
                b.putString("Name",edt1.getText().toString());
                b.putString("mobile",edt2.getText().toString());
                bf.setArguments(b);


                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,bf).commit();

            }
        });*/
       return view;
    }

    @OnClick(R.id.submit_button)
    public void submitButton(View view)
    {
        new Thread(){

            @Override
            public void run() {

                getActivity().startService(new Intent(getActivity(),MyService.class));
            }
        }.start();
        showDialog();

//        BlankFragment bf= new BlankFragment();
//        Bundle b = new Bundle();
//        b.putString("Name",edt1.getText().toString());
//        b.putString("mobile",edt2.getText().toString());
//        bf.setArguments(b);
//        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,bf).commit();
    }


    private void showDialog()
    {

         AlertDialog.Builder alertDialog =new AlertDialog.Builder(getActivity());
         alertDialog.setMessage("Alert Box");
         alertDialog.create().show();
    }

}
