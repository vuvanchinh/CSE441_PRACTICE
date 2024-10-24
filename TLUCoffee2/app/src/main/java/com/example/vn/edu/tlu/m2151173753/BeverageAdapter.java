import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vn.edu.tlu.m2151173753.Beverage;
import com.example.vn.edu.tlu.m2151173753.R;

import java.util.List;

public class BeverageAdapter extends RecyclerView.Adapter<BeverageAdapter.BeverageViewHolder> {
    private Context context;
    private List<Beverage> monList;

    public BeverageAdapter(Context context, List<Beverage> monList) {
        this.context = context;
        this.monList = monList;
    }

    @NonNull
    @Override
    public BeverageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_beverage, parent, false);
        return new BeverageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BeverageViewHolder holder, int position) {
        Beverage mon = monList.get(position);
        holder.monName.setText(mon.getTenMon());
        holder.monPrice.setText(mon.getGiaMon());
        holder.monImage.setImageResource(mon.getHinhAnh());
        // Xử lý sự kiện khi nhấn nút "Đặt món"
        holder.btnDatMon.setOnClickListener(v -> {
            // Xử lý logic đặt món ở đây
        });
    }

    @Override
    public int getItemCount() {
        return monList.size();
    }

    public static class BeverageViewHolder extends RecyclerView.ViewHolder {
        TextView monName, monPrice;
        ImageView monImage;
        Button btnDatMon;

        public BeverageViewHolder(@NonNull View itemView) {
            super(itemView);
            monName = itemView.findViewById(R.id.monName);
            monPrice = itemView.findViewById(R.id.monPrice);
            monImage = itemView.findViewById(R.id.monImage);
            btnDatMon = itemView.findViewById(R.id.btnDatMon);
        }
    }
}
