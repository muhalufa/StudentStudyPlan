package au.edu.tafesa.itstudies.studentstudyplan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.view.View.OnClickListener;

import javax.xml.transform.Source;

public class Login extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText etUsername = findViewById(R.id.etUsername);

        EditText etPassword = findViewById(R.id.etPassword);

        Button btnLogin = findViewById(R.id.btnLogin);
        HandleBtnLoginOnClick loginBtnHandler = new HandleBtnLoginOnClick();
        btnLogin.setOnClickListener(loginBtnHandler);
    }

    public class HandleBtnLoginOnClick implements OnClickListener {
        public static final String CLASS_TAG="HandleBtnLoginOnClick";

        public void onClick(View v){
            Activity sourceActivity = Login.this;
            Class destinationClass = InformationPage.class;
            Intent editIntent = new Intent(sourceActivity, destinationClass);
            //Sending the information to receiver through intent object ^ // No DATA to load or sent ATM so just gonna open activity
            //for sending //editIntent.putExtra(String, data);

            startActivity(editIntent);
            //For sending to receive startActivityForResult(editIntent, ...)
        }
    }
}
