package com.example.bog_app_2;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //The setup of the button that switch activities
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity();
            }
        });

    }

    // openActivity purpose is to start the activity "PDFViewActivity" when the button is pressed.
    public void openActivity() {
        Intent intent = new Intent(this, PDFViewActivity.class);
        startActivity(intent);
    }


}