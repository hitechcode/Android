package lib.listview.custom.com.customlistviewlibrary;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity{


    String[] itemName ={
            "Television",
            "Radio",
            "Smartphone",
            "Fan",
            "Microwave",
            "Computer",
            "Refrigerator",
            "Toaster"
    };

    String[] itemDescription ={
            "item description",
            "item description",
            "item description",
            "item description",
            "item description",
            "item description",
            "item description",
            "item description",
    };

    Integer[] imgID={
            R.drawable.ic_launcher,
            R.drawable.ic_launcher,
            R.drawable.ic_launcher,
            R.drawable.ic_launcher,
            R.drawable.ic_launcher,
            R.drawable.ic_launcher,
            R.drawable.ic_launcher,
            R.drawable.ic_launcher,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CustomListView customView = new CustomListView(this);
        customView.setAttributes(imgID,itemName,itemDescription);
        ListView listView = customView.getListView();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(getApplicationContext(), "positoin "+(position+1),
                        Toast.LENGTH_LONG).show();

            }
        });
    }
}