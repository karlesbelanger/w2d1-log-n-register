package ca.kgb.login2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private String loginCredential = "Karles";
    private String passwordCredential = "4444";
    private EditText edTxtLoggin;
    private EditText edTxtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Intent intent = getIntent();
        if(intent != null) {

            edTxtLoggin = (EditText) findViewById(R.id.user);
            edTxtPass = (EditText) findViewById(R.id.password);

            String username = getIntent().getStringExtra("username");
            String password = getIntent().getStringExtra("password");
            if (username != null && username.length() > 0) {
                loginCredential = username;
            }
            if ( password != null && password.length() > 0) {
                passwordCredential = password;
            }
        }
    }

    public void doLogIn(View view) {
        edTxtLoggin = (EditText) findViewById(R.id.user);
        edTxtPass = (EditText) findViewById(R.id.password);
        String logIn = edTxtLoggin.getText().toString();
        String password = edTxtPass.getText().toString();
        Log.d(TAG, "checkCredential: " + logIn + " " + password);
        if (logIn.equals(loginCredential) && password.equals(passwordCredential)) {
            //edTxtLoggin.setText("Congradulation you have logged in");
            Intent intent = new Intent(this, Welcome.class);

            intent.putExtra("username", logIn);
            //intent.putExtra("password", password);

            startActivity(intent);
        } else {
            edTxtLoggin.setText("Wrong username or password entered!");
        }

    }

    public void doSignUp(View view) {
        Intent intent = new Intent(this, Register.class);

        startActivity(intent);
    }


}
