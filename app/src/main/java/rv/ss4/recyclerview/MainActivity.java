package rv.ss4.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Data> data=new ArrayList<>();
        data.add(new Data("Cupcake"));
        data.add(new Data("Donut"));
        data.add(new Data("Eclair"));
        data.add(new Data("Froyo"));
        data.add(new Data("Gingerbread"));
        data.add(new Data("Honeycomb"));
        data.add(new Data("Ice Cream Sandwich"));
        data.add(new Data("Jelly Bean"));
        data.add(new Data("KitKat"));

        recyclerView=findViewById(R.id.recyclerview);
        myAdapter=new MyAdapter(data);
        RecyclerView.LayoutManager rvLayout=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(rvLayout);
        recyclerView.setAdapter(myAdapter);
    }
}
