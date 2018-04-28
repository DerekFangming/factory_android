package com.factory.factory.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import com.factory.factory.R;
import com.factory.factory.adapters.LoginListAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView tableView = (RecyclerView) findViewById(R.id.registerList);

        LoginListAdapter tableViewAdapter = new LoginListAdapter();

        tableView.setAdapter(tableViewAdapter);
    }
}
