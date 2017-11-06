package test.tv.rs.com.retrofittest.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import test.tv.rs.com.retrofittest.R;
import test.tv.rs.com.retrofittest.activity.adapter.StudentAdapter;
import test.tv.rs.com.retrofittest.activity.model.Student;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new StudentAdapter());


    }


    public void onSend(View view)
    {

        Toast.makeText(this, "Hello MOTO", Toast.LENGTH_SHORT).show();
        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
        sharingIntent.setType("text/html");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, Html.fromHtml("<p>This is the text that will be shared.</p>"));
        startActivity(Intent.createChooser(sharingIntent,"Share using"));
    }



    List<Student> getListCollection()
    {

        List<Student> ls = new ArrayList<Student>();
        ls.add(new Student("Akash","9878775754"));
        ls.add(new Student("Akash","9878775754"));
        ls.add(new Student("Akash","9878775754"));
        ls.add(new Student("Akash","9878775754"));
        ls.add(new Student("Akash","9878775754"));

        return ls;

    }

}
