package my.examapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Main1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
    }

    //////////////////////////////////////////////////
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = null;
        switch (item.getItemId()) {

            case R.id.action_settings1:
                intent = new Intent(Main1Activity.this, MainActivity.class);
                break;

            case R.id.action_settings2:
                intent = new Intent(Main1Activity.this, Main1Activity.class);
                break;

            case R.id.action_settings3:
                intent = new Intent(Main1Activity.this, SetBluetooth.class);
                break;

        }

        startActivity(intent);


        return true;

    }
}