package com.tk.rbmobile.pruebatecnica1;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import com.tk.rbmobile.pruebatecnica1.fragments.FragmentTab_one;
import com.tk.rbmobile.pruebatecnica1.fragments.FragmentTab_two;


public class MainActivity extends FragmentActivity {



    //https://www.apple.com/itunes/affiliates/resources/documentation/itunes-store-web-service-search-api.html

    private FragmentTabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        tabHost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);

        tabHost.addTab(tabHost.newTabSpec("Tab1").setIndicator("Tab1"), FragmentTab_one.class, null);
        tabHost.addTab(tabHost.newTabSpec("Tab2").setIndicator("Tab2"),FragmentTab_two.class,null);

    }


}
