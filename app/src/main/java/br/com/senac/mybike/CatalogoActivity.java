package br.com.senac.mybike;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class CatalogoActivity extends AppCompatActivity {
    RecyclerView idRecCatalogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.catalogo_layout);

        idRecCatalogo = findViewById(R.id.idRecCatalogo);

        // MONTAGEM DO LAYOUT QUE SERÁ UTILIZADO NA LISTA
        idRecCatalogo.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));

        // VAI DEIXAR A LISTA MAIS EFICIÊNTE
        idRecCatalogo.hasFixedSize();

        // INTANCIAR O ADAPTADOR
        MyAdapter adapter = new MyAdapter();

        // EXECUTAR A MONTAGEM DA LISTA COMO O MODELO
        idRecCatalogo.setAdapter(adapter);

    }
}