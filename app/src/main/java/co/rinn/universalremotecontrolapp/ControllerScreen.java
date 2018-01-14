package co.rinn.universalremotecontrolapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ControllerScreen extends AppCompatActivity {
    private void BTSend(int code) {
        //do something with the BT stack to send the code to the device
    }
    //if the bluetooth connection is killed, this function should be called
    private void goToMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void ButtonClick(View v) {
        switch(v.getId()) {
            case R.id.PowerBtn:
                BTSend(0xFE);
                break;

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controller_screen);
        Button PowerButton = (Button) findViewById(R.id.PowerBtn);
        PowerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ButtonClick(v);
            }
        });
    }
}
