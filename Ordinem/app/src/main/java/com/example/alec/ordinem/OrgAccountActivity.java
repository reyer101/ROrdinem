package com.example.alec.ordinem;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OrgAccountActivity extends AppCompatActivity {

    private TextView chapmanTV1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_org_account);

        this.chapmanTV1 = (TextView) findViewById(R.id.tv_chapman1);

        AssetManager am = getApplicationContext().getAssets();

        Typeface lemonMilk = Typeface.createFromAsset(getAssets(), "fonts/LemonMilk.otf");
        chapmanTV1.setTypeface(lemonMilk);
    }
}
