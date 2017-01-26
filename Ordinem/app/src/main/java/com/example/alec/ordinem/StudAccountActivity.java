package com.example.alec.ordinem;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Locale;

public class StudAccountActivity extends AppCompatActivity {

    private TextView chapmanTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stud_account);

        this.chapmanTV = (TextView) findViewById(R.id.tv_chapman);

        AssetManager am = getApplicationContext().getAssets();

        Typeface lemonMilk = Typeface.createFromAsset(getAssets(), "fonts/LemonMilk.otf");
        chapmanTV.setTypeface(lemonMilk);
    }
}
