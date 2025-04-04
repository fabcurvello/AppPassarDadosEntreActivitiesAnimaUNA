package com.fabriciocurvello.apppassardadosentreactivitiesanimauna;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SegundaActivity extends AppCompatActivity {

    private TextView tvIdade;
    private TextView tvResposta;
    private Button btRetornar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_segunda);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tvIdade = findViewById(R.id.tv_idade_activity_segunda);
        tvResposta = findViewById(R.id.tv_resposta_activity_segunda);
        btRetornar = findViewById(R.id.bt_retornar_activity_segunda);

        int idade = recuperarIdade();

        validarSituacaoIdade(idade);

        btRetornar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish(); // Encerra esta Activity
            }
        });
    } // fim do onCreate

    private int recuperarIdade() {
        //Recuperar os dados que foram enviados pela intent
        Bundle dados = getIntent().getExtras();
        int idade = dados.getInt("idadeInserida");

        //Inserindo a idade recuperada na TextView. Necessário converter de int para String.
        tvIdade.setText( String.valueOf(idade) );
        return idade;
    }

    private void validarSituacaoIdade(int idade) {
        //Verificando se é menor ou maior de idade para exibir na tvResposta
        if ( idade < 18 ) {
            tvResposta.setText("Você é menor de idade.");
        } else {
            tvResposta.setText("Você é maior de idade.");
        }
    }
}