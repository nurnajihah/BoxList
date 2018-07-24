package sg.edu.rp.c346.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvBoxList;
    ArrayList<BoxListItem> alboxList;
    CustomAdapter caBoxList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvBoxList = findViewById(R.id.listViewColours);

        alboxList = new ArrayList<>();
        BoxListItem colour1 = new BoxListItem(true, false, false);
        BoxListItem colour2 = new BoxListItem(false, true, false);
        BoxListItem colour3 = new BoxListItem(false, false, true);

        alboxList.add(colour1);
        alboxList.add(colour2);
        alboxList.add(colour3);

        caBoxList = new CustomAdapter(this, R.layout.boxlist_item, alboxList);

        lvBoxList.setAdapter(caBoxList);

    }
}
