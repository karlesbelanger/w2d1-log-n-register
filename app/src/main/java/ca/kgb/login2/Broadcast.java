package ca.kgb.login2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Broadcast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast);
    }

    public void doMagic(View view) {
        Toast.makeText(Broadcast.this, "Hello World", Toast.LENGTH_SHORT).show();
    }
}
