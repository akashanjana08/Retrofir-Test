package test.tv.rs.com.retrofittest.activity.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import test.tv.rs.com.retrofittest.R;
import test.tv.rs.com.retrofittest.activity.model.Student;


/**
 * Created by Akash.Sharma on 9/22/2017.
 */

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentHolderView>{

    public static class StudentHolderView extends RecyclerView.ViewHolder
    {

         TextView nametxtview;
         TextView phonetxtview;

        public StudentHolderView(View v)
        {
            super(v);
            nametxtview = (TextView)v.findViewById(R.id.name);
            phonetxtview = (TextView)v.findViewById(R.id.phone);
        }

    }

    public StudentAdapter(){


    }

    @Override
    public StudentHolderView onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_student, parent, false);

        return new StudentHolderView(view);
    }

    @Override
    public void onBindViewHolder(StudentHolderView holder, int position) {

          // Student stu = ls.get(position);
          holder.nametxtview.setText("Akash");
          holder.phonetxtview.setText("9878965478");
    }

    @Override
    public int getItemCount() {
        return 9;
    }
}
