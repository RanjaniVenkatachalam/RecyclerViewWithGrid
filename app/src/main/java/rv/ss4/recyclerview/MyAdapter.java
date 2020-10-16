package rv.ss4.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

//1.constructor
   List listdata;

    public MyAdapter(List listdata) {
        this.listdata = listdata;
    }


    //3
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //2.3 set the layout
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.rv_textview, viewGroup, false);
        //2.4
        return new MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(MyViewHolder viewHolder, int i) {
        Data data= (Data) listdata.get(i);
        viewHolder.name.setText(data.getAndroidVersions());
    }
    @Override
    public int getItemCount() {
        return listdata.size();
    }

    //2
    class MyViewHolder extends RecyclerView.ViewHolder {
        //2.1
        TextView name;
        public MyViewHolder(View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.text);
        }
    }
}
