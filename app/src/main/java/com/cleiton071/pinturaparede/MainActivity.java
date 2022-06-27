package com.cleiton071.pinturaparede;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.slot1 = findViewById(R.id.layout_slot1);
        this.mViewHolder.slot2 = findViewById(R.id.layout_slot2);
        this.mViewHolder.slot3 = findViewById(R.id.layout_slot3);
        this.mViewHolder.slot4 = findViewById(R.id.layout_slot4);
        this.mViewHolder.addParede = findViewById(R.id.button_addParede);
        this.mViewHolder.addParede.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_addParede) {

            Intent in = new Intent(this, infoParede.class);
            startActivity(in);
        }
    }

    private static class ViewHolder {

        LinearLayout slot1;
        LinearLayout slot2;
        LinearLayout slot3;
        LinearLayout slot4;
        Button addParede;
    }
}