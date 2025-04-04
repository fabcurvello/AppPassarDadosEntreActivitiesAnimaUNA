package com.fabriciocurvello.apppassardadosentreactivitiesanimauna;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText etIdade;
    private Button btEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        etIdade = findViewById(R.id.et_idade);
        btEnviar = findViewById(R.id.bt_enviar);

        btEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, "CLICOU", Toast.LENGTH_SHORT).show();

                //Capturar a idade que está no EditText e converter de String para int
                int idade = Integer.parseInt(etIdade.getText().toString());

                // Intenção de inicializar a SegundaActivity
                Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);

                //Passar dados pela intent
                intent.putExtra("idadeInserida", idade);

                //Iniciar a intent
                startActivity(intent);

            }
        });

    }
}