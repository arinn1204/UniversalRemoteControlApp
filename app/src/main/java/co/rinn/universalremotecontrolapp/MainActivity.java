package co.rinn.universalremotecontrolapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private void goToControllerActivity() {
        Intent intent = new Intent(this, ControllerScreen.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button PairButton = (Button) findViewById(R.id.PairBtn);
        PairButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //do bluetooth shit here to establish connection
                goToControllerActivity();
            }
        });
    }
}
