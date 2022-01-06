package com.paklur.user.optionmenu;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @SuppressLint("NonConstantResourceId")
    @Override


    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.profile){
            startActivity(new Intent(this, ProfileActivity.class));
        } else if (item.getItemId() == R.id.settings) {
            startActivity(new Intent(this, SettingsActivity.class));
        } else if (item.getItemId() == R.id.signout) {
            finish();
        }
        return true;
    }
}