package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Register the view for the context menu
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        View view = findViewById(R.id.main_layout);
        registerForContextMenu(view);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu, menu);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.menu_red) {
            // Change screen color to red
            getWindow().getDecorView().setBackgroundColor(Color.RED);
            return true;
        } else if (itemId == R.id.menu_green) {
            // Change screen color to green
            getWindow().getDecorView().setBackgroundColor(Color.GREEN);
            return true;
        } else if (itemId == R.id.menu_blue) {
            // Change screen color to blue
            getWindow().getDecorView().setBackgroundColor(Color.BLUE);
            return true;
        } else {
            return super.onContextItemSelected(item);
        }
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.main_menu, menu);
//        return true;
//    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.menu_red) {
            // Change screen color to red
            getWindow().getDecorView().setBackgroundColor(Color.RED);
            return true;
        } else if (id == R.id.menu_green) {
            // Change screen color to green
            getWindow().getDecorView().setBackgroundColor(Color.GREEN);
            return true;
        } else if (id == R.id.menu_blue) {
            // Change screen color to blue
            getWindow().getDecorView().setBackgroundColor(Color.BLUE);
            return true;
        } else {
            return super.onContextItemSelected(item);
        }

    }

}