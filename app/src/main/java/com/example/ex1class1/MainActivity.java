package com.example.ex1class1;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public String UserName;
    public String Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonlogin = (Button) findViewById(R.id.ButtonLog);
        buttonlogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                UserName = ((EditText) findViewById(R.id.UserText)).getText().toString();
                Password = ((EditText) findViewById(R.id.PasswordText)).getText().toString();
                if (UserName.equals("admin")&& Password.equals("admin")){
                    Toast.makeText(getApplicationContext(), "El usuario introducido o contraseña son correctos", Toast.LENGTH_SHORT).show();
                    Log.w("Acceso Aplicacion", "Se ha introducido correctamante el usuario y contraseña");

                }
                else {
                    Toast.makeText(getApplicationContext(), "El usuario introducido o contraseña son incorrectos", Toast.LENGTH_SHORT).show();
                    Log.e("Error 1", "Error, el usuario introduccido o contraseña son incorrectos");
                }
            }


        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
