import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vn.edu.tlu.m2151173753.Beverage;
import com.example.vn.edu.tlu.m2151173753.R;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    BeverageAdapter beverageAdapter;
    List<Beverage> beverageList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        beverageList = new ArrayList<>();
        beverageList.add(new Beverage("AMERICANO", "49.000 đ", R.drawable.ic_coffee));
        beverageList.add(new Beverage("CAPPUCCINO", "45.000 đ", R.drawable.ic_coffee));
        beverageList.add(new Beverage("ESPRESSO SỮA ĐÁ", "39.000 đ", R.drawable.ic_coffee));
        beverageList.add(new Beverage("MOCHA ĐÁ", "49.000 đ", R.drawable.ic_coffee));
        beverageList.add(new Beverage("CAFE ĐEN ĐÁ", "29.000 đ", R.drawable.ic_coffee));

        beverageAdapter = new BeverageAdapter(this, beverageList);
        recyclerView.setAdapter(beverageAdapter);
    }
}
