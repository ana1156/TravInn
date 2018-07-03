package com.abhishek.travindia;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import static com.abhishek.travindia.NDb._id;
import static com.abhishek.travindia.NDb.mynotes;
import static com.abhishek.travindia.NDb.name;


public class MyNotes extends AppCompatActivity {
    private ListView obj;

    NDb mydb;
    FloatingActionButton btnadd;
    ListView mylist;
    Menu menu;
    AlertDialog.Builder alertDialogBuilder;
    AlertDialog alertDialog;
    Context context = this;
    CoordinatorLayout coordinatorLayout;
    SimpleCursorAdapter adapter;
    private Snackbar snackbar;
    SQLiteDatabase db;
    String[] fieldNames = new String[]{_id, name, NDb.dates, NDb.remark};
    @RequiresApi(api = Build.VERSION_CODES.ICE_CREAM_SANDWICH)
 /*  @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_notes);

        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinatorLayout);
        mydb = new NDb(this);
        btnadd = (FloatingActionButton) findViewById(R.id.btnadd);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle dataBundle = new Bundle();
                dataBundle.putInt("id", 0);
                Intent intent = new Intent(getApplicationContext(), DisplayNotes.class);
                intent.putExtras(dataBundle);
                startActivity(intent);
                finish();
            }
        });

        Cursor c = mydb.fetchAll();
        String[] fieldNames = new String[] { NDb.name, NDb._id, NDb.dates, NDb.remark };


        int[] display = new int[]{R.id.txtidrow, R.id.txtnamerow, R.id.txtdate, R.id.txtremark};
        adapter = new SimpleCursorAdapter(this, R.layout.listtemplate, c, fieldNames, display, 0);
        mylist = (ListView) findViewById(R.id.listView1);

        //--------------------------------------------------------------------------------------------------------------------------------------


    }
    //----------------------------------------------------------------------------------------------------------------------------
    public ArrayList<String> getAllStringValues() {
        ArrayList<String> yourStringValues = new ArrayList<String>();
        Cursor result = db.query(true, mynotes, new String[]{name}, null, null, null, null,
                null, null);

        if (result.moveToFirst()) {
            do {
                yourStringValues.add(result.getString(result
                        .getColumnIndex(name)));

            } while (result.moveToNext());
        } else {
            return null;
        }
        return yourStringValues;
    }

//---------------------------------------------------------------------------------------------------------------------------
    mylist.setOnItemClickListener(new OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
            LinearLayout linearLayoutParent = (LinearLayout) arg1;
                                                      LinearLayout linearLayoutChild = (LinearLayout) linearLayoutParent.getChildAt(0);
                                                      TextView m = (TextView) linearLayoutChild.getChildAt(1);
                                                      Bundle dataBundle = new Bundle();
                                                      try {
                                                          dataBundle.putInt("id", Integer.parseInt(m.getText().toString()));
                                                      } catch (Exception e) {
                                                          Log.d("Numberformatexception", e.toString());
                                                      }
                                                      Intent intent = new Intent(MyNotes.this, DisplayNotes.class);
                                                      intent.putExtras(dataBundle);
                                                      startActivity(intent);
                                                      finish();
                                                  }
                                              }

*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_notes);
        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinatorLayout);
        mydb = new NDb(this);
        btnadd = (FloatingActionButton) findViewById(R.id.btnadd);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle dataBundle = new Bundle();
                dataBundle.putInt("id", 0);
                Intent intent = new Intent(getApplicationContext(),
                        DisplayNotes.class);
                intent.putExtras(dataBundle);
                startActivity(intent);
                finish();
            }
        });        /* btnadd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Bundle dataBundle = new Bundle();
                    dataBundle.putInt("id", 0);
                    Intent intent = new Intent(getApplicationContext(), DisplayNotes.class);
                    intent.putExtras(dataBundle);
                    startActivity(intent);
                    finish();
                }
            });*/
        Cursor c = mydb.fetchAll();
        String[] fieldNames = new String[] { NDb.name, NDb._id, NDb.dates, NDb.remark };
        int[] display = new int[] { R.id.txtnamerow, R.id.txtidrow,
                R.id.txtdate,R.id.txtremark };
        adapter = new SimpleCursorAdapter(this, R.layout.listtemplate, c, fieldNames, display, 0);
        mylist = (ListView) findViewById(R.id.listView1);
}       public ArrayList<String> getAllStringValues(){
    mylist.setOnItemClickListener(new OnItemClickListener() {
                                                  @Override
                                                  public void onItemClick (AdapterView < ? > arg0, View arg1,int arg2, long arg3){
                                                      LinearLayout linearLayoutParent = (LinearLayout) arg1;
                                                      LinearLayout linearLayoutChild = (LinearLayout) linearLayoutParent
                                                              .getChildAt(0);
                                                      TextView m = (TextView) linearLayoutChild.getChildAt(1);
                                                      Bundle dataBundle = new Bundle();
                                                      try {
                                                          dataBundle.putInt("id", Integer.parseInt(m.getText().toString()));
                                                      } catch (Exception e) {
                                                          Log.d("Numberformatexception", e.toString()); }

                                                      Intent intent = new Intent(getApplicationContext(),
                                                              DisplayNotes.class);
                                                      intent.putExtras(dataBundle);
                                                      startActivity(intent);
                                                      finish();
                                                  }
                                              });

            ArrayList<String> yourStringValues = new ArrayList<String>();
            Cursor result = db.query(true, mynotes , new String[] { name }, null, null, null, null,
                    null, null);

            if (result.moveToFirst()) {
                do {
                    yourStringValues.add(result.getString(result
                            .getColumnIndex(name)));

                } while (result.moveToNext());
            } else {
                return null;
            }
            return yourStringValues;

}
      /*  mylist.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
             public ArrayList<String> getAllStringValues() {
        ArrayList<String> yourStringValues = new ArrayList<String>();
        Cursor result = db.query(true, mynotes, new String[]{name}, null, null, null, null,
                null, null);

        if (result.moveToFirst()) {
            do {
                yourStringValues.add(result.getString(result
                        .getColumnIndex(name)));

            } while (result.moveToNext());
        } else {
            return null;
        }
        return yourStringValues;
    }
                                    long arg3) {*/





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        this.menu = menu;
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId()) {
            case R.id.add:
                Bundle dataBundle = new Bundle();
                dataBundle.putInt("id", 0);
                Intent intent = new Intent(getApplicationContext(), DisplayNotes.class);
                intent.putExtras(dataBundle);
                startActivity(intent);
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }}