package com.example.user.sherlock;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by User on 26.03.2018.
 */

public class SecondActivity extends AppCompatActivity {

    public final static String THIEF = "ru.user.sherlock.THIEF";

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.second_activity);
    }


    public void onRadioClick(View view) {

        Intent answerIntent = new Intent();

        switch (view.getId()){
            case R.id.radioDog:
                answerIntent.putExtra(THIEF, "Сраный пёсик");
                    break;
            case R.id.radioCrow:
                answerIntent.putExtra(THIEF, "Ворона");
                break;
            case R.id.radioCat:
                answerIntent.putExtra(THIEF, "Лошадь Пржевальского");
                break;
                default:
                    break;
        }
        setResult(RESULT_OK, answerIntent);
        finish();
    }
}
