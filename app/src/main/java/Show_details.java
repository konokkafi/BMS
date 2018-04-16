import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.buildingmanagementsyestem.R;
import com.example.buildingmanagementsyestem.Rent;
import com.example.buildingmanagementsyestem.Save_rent;
import com.example.buildingmanagementsyestem.Show_rent;

import java.util.ArrayList;

/**
 * Created by konok on 4/15/18.
 */

public class Show_details extends AppCompatActivity{


    Save_rent my;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_rent);

        ListView listView = (ListView) findViewById(R.id.listview);

        my = new Save_rent(this);
        ArrayList<String> theList = new ArrayList<>();
        Cursor data = my.getListContents();

        if(data.getCount() == 0)
        {
            Toast.makeText(Show_details.this, "The database was emptyt ", Toast.LENGTH_LONG).show();
        }
        else
        {
            while (data.moveToNext()){
                theList.add(data.getString(1));
                ListAdapter listAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,theList);
                listView.setAdapter(listAdapter);

            }
        }
    }
}
