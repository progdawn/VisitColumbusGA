package com.progdawn.visitcolumbusga;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] places = {"Visit Columbus", "White Water Express", "Heritage Park", "Homeless Camp", "River Rafting"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.attraction, places));
    }

    protected void onListItemClick(ListView I, View v, int position, long id){
        switch(position){
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://visitcolumbusga.com/")));
                break;
            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.whitewaterexpress.com/chattahoochee/")));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, Heritage.class));
                break;
            case 3:
                startActivity(new Intent(MainActivity.this, Homeless.class));
                break;
            case 4:
                startActivity(new Intent(MainActivity.this, River.class));
                break;
        }
    }
}
