package ca.yorku.apptest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.io.File;


public class recycle_adapter extends RecyclerView.Adapter<recycle_adapter.holder>{

    Context context;
    File[] files; // Files and folders


    public recycle_adapter(Context context, File[] files) {
        this.context = context;
        this.files = files;

    }

    @Override
    public recycle_adapter.holder onCreateViewHolder( ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(context).inflate(R.layout.recycler_display, viewGroup, false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder( recycle_adapter.holder viewHolder, int i) {

        File select = files[i];
        viewHolder.view.setText(select.getName());


    }

    @Override
    public int getItemCount() {
        return files.length;
    }

    public class holder extends RecyclerView.ViewHolder {

        TextView view;

        public holder( View itemView) {
            super(itemView);
            view = itemView.findViewById((R.id.file_name));
        }
    }
}
