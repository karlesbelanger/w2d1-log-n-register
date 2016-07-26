package ca.kgb.login2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Register extends AppCompatActivity {

    private static final String TAG = "Register_Activity";
    private EditText edTxtUser;
    private EditText edTxtEmail;
    private EditText edTxtPass;
    private TextView errMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void doRegister(View view) {
        edTxtUser = (EditText) findViewById(R.id.user);
        edTxtEmail = (EditText) findViewById(R.id.email);
        edTxtPass = (EditText) findViewById(R.id.password);
        errMessage = (TextView) findViewById(R.id.errorMess);

        String user = edTxtUser.getText().toString();
        String email = edTxtEmail.getText().toString();
        String password = edTxtPass.getText().toString();

        Log.d(TAG, "Register : " + user + " " + email + " " + password);
        if (user.length()> 0 && email.length()> 0 && password.length()> 0) {
            Intent intent = new Intent(this, MainActivity.class);

            intent.putExtra("username", user);
            intent.putExtra("email", user);
            intent.putExtra("password", password);

            startActivity(intent);
        } else {
            errMessage.setText("Please fill all lines.");
        }
    }
}
