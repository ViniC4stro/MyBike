package br.com.senac.mybike;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ReservasActivity extends AppCompatActivity {
    FloatingActionButton fabReservar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reservas_layout);

        fabReservar = findViewById(R.id.fabReservar);

        fabReservar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Reserva Realizada!",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}