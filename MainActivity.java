package com.example.loginscreen;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    EditText emailText,passText;
    Button btn;

    protected void onCreate(Bundle savedInstaceState)
    {
        super.onCreate(savedInstaceState);
        setContentView(R.layout.activity_main);
    
        emailText=findViewById(R.id.email);
        passText=findViewById(R.id.pass);
        btn=findViewById(R.id.btn);
    
        btn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                String id=emailText.getText().toString();
                String pwd=passText.getText().toString();
                
                if(id.equals("mayur") && pwd.equals("123")) {
                    Intent i = new Intent(MainActivity.this, Welcome.class);
                    startActivity(i);
                }else{
                    Toast.makeText(getApplicationContext(),"Invalid Credentials",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}