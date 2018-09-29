package com.example.rawrensia.northspineapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.String;
import java.lang.Character;
import com.example.rawrensia.northspineapp.Account;



public class MainActivity extends AppCompatActivity {

    Button btnRegister;
    EditText txtMatricNum;
    EditText txtPassword;
    String matricNum, password;
    private Matcher matcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMatricNum = (EditText) findViewById(R.id.matricNum);
        txtPassword = (EditText) findViewById(R.id.password);
        txtPassword.setTransformationMethod(new AsteriskPasswordTransformationMethod());
        btnRegister = (Button) findViewById(R.id.register);

        btnRegister.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   matricNum = txtMatricNum.getText().toString();
                                                   password = txtPassword.getText().toString();
                                                   boolean goodMatricNum = false;
                                                   boolean goodPassword = false;
                                                   if (!matricNum.equals("") || !password.equals("") || (matricNum.length() == 9) )
                                                   {
                                                       goodMatricNum = true;
                                                       goodPassword = true;
                                                   }
                                                   else{
                                                       Toast.makeText(MainActivity.this, "Check if your inputs are correct. Matric no. must be 8 digits and password cannot be blank.", Toast.LENGTH_LONG).show();
                                                   }

                                                   if (goodMatricNum == true && goodPassword == true){
                                                       registerAccount(matricNum, password);
                                                       Toast.makeText(MainActivity.this, "You have successfully registered.", Toast.LENGTH_LONG).show();
                                                       Intent Layer = new Intent(MainActivity.this, HomeActivity.class);
                                                       startActivity(Layer);
                                                   }

                                               }
                                           }
        );
    }

    public void registerAccount(String matric, String pass){
        Account user = new Account(matric, pass);
    }
}
