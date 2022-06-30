package br.com.senac.mybike;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;

public class MenuPrincipalActivity extends AppCompatActivity implements View.OnClickListener {
    CardView cardClient, cardReservation, cardMaintence,
            cardSales, cardAccessories, cardCatalog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal_layout);

        cardClient = findViewById(R.id.cardClient);
        cardReservation = findViewById(R.id.cardReservation);
        cardMaintence = findViewById(R.id.cardMaintence);
        cardSales = findViewById(R.id.cardSales);
        cardAccessories = findViewById(R.id.cardAccessories);
        cardCatalog = findViewById(R.id.cardCatalog);

        cardClient.setOnClickListener(this);
        cardReservation.setOnClickListener(this);
        cardMaintence.setOnClickListener(this);
        cardSales.setOnClickListener(this);
        cardAccessories.setOnClickListener(this);
        cardCatalog.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

    }
}