package com.abhishek.travindia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AndroidImageSlider extends AppCompatActivity {
 TextView t1,t2,t3,t4,t5;
    ImageView i1,i2,i3,i4,i5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_image_slider);
        i1=(ImageView)findViewById(R.id.i1);
        i2=(ImageView)findViewById(R.id.i2);
        i3=(ImageView)findViewById(R.id.i3);
        i4=(ImageView)findViewById(R.id.i4);
        i5=(ImageView)findViewById(R.id.i5);
        t1=(TextView)findViewById(R.id.t1);
        t2=(TextView)findViewById(R.id.t2);
        t3=(TextView)findViewById(R.id.t3);
        t4=(TextView)findViewById(R.id.t4);
        t5=(TextView)findViewById(R.id.t5);

        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewPageAndroid);
        AndroidImageAdapter adapterView = new AndroidImageAdapter(this);
        mViewPager.setAdapter(adapterView);}



    public void serve(View v)
    {
        Intent i=new Intent();
        i.setClass(this,MapsActivity.class);
        startActivity(i);
    }
    public void c2(View v)
    {
        Intent i=new Intent();
        i.setClass(this,SearchPlace.class);
        startActivity(i);
    }
    public void c3(View v)
    {
        Intent i=new Intent();
        i.setClass(this,Duration.class);
        startActivity(i);
    }
    public void c4(View v)
    {
        Intent i=new Intent();
        i.setClass(this,NoteList.class);
        startActivity(i);
    }
    public void c5(View v)
    {
        Intent i=new Intent();
        i.setClass(this,PlaceOnMap.class);
        startActivity(i);
    }
}