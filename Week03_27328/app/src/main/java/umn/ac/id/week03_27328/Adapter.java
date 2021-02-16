package umn.ac.id.week03_27328;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    Context ctx;
    List<String> lists;
    Adapter(Context context, List<String> data){
        this.ctx = context;
        this.lists = data;
    }
    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(ctx).inflate(R.layout.content_main, parent, false);
        return new Adapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvDummyItem.setText(lists.get(position));
        holder.llDummyItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ctx, lists.get(position) + " Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return lists.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvDummyItem;
        LinearLayout llDummyItem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvDummyItem = itemView.findViewById(R.id.tvDummyItem);
            llDummyItem = itemView.findViewById(R.id.llDummyItem);
        }
    }
}
