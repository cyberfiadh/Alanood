package com.cyberfiadh.apps.alanood;

import android.app.Dialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;

import java.sql.Connection;


public class Main extends ActionBarActivity {
    MapsActivity mMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_new) {
            onItemSelectedNew();
        }
        else if (id == R.id.action_edit) {
            onItemSelectedEdit();
        }
        else if (id == R.id.action_search) {
            onItemSelectedSearch();
        }
        else if (id == R.id.action_settings) {
            onItemSelectedSettings();
        }
        else if (id == R.id.action_about) {
            onItemSelectedAbout();
        }
        return super.onOptionsItemSelected(item);
    }

    public void onItemSelectedNew(){
        System.out.println("New selected");
        // TODO: New Window
    }
    public void onItemSelectedEdit(){
        System.out.println("Edit selected");
        // TODO: Edit Window
    }
    public void onItemSelectedSearch(){
        System.out.println("Search selected");
        // TODO: Search Window
    }
    public void onItemSelectedSettings(){
        System.out.println("Settings selected");
        // TODO: Settings Window
    }
    public void onItemSelectedAbout(){
        System.out.println("About selected");
        // TODO: About Window
    }
}
