package com.example.evaluacion;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnAgregar;
    private Button btnLimpiar;
    private EditText habito1;
    private EditText habito2;
    private EditText habito3;
    private EditText habito4;
    private EditText habito5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar vistas
        btnAgregar = findViewById(R.id.btnAgregar);
        btnLimpiar = findViewById(R.id.btnlimpiar);
        habito1 = findViewById(R.id.habito1);
        habito2 = findViewById(R.id.habito2);
        habito3 = findViewById(R.id.habito3);
        habito4 = findViewById(R.id.habito4);
        habito5 = findViewById(R.id.habito5);

        // Establecer onClickListener para el botón Agregar
        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarHabitos();
            }
        });

        // Establecer onClickListener para el botón Limpiar
        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                limpiarHabitos();
            }
        });
    }

    private void agregarHabitos() {
        // Obtener el texto de cada EditText
        String textoHabito1 = habito1.getText().toString();
        String textoHabito2 = habito2.getText().toString();
        String textoHabito3 = habito3.getText().toString();
        String textoHabito4 = habito4.getText().toString();
        String textoHabito5 = habito5.getText().toString();

        // Realizar las acciones necesarias al hacer clic en Agregar
        // Puedes realizar operaciones con los textos, como imprimirlos o guardarlos en una lista, base de datos, etc.
        // Aquí simplemente los imprimiré en el Logcat como ejemplo.
        System.out.println("Hábito 1: " + textoHabito1);
        System.out.println("Hábito 2: " + textoHabito2);
        System.out.println("Hábito 3: " + textoHabito3);
        System.out.println("Hábito 4: " + textoHabito4);
        System.out.println("Hábito 5: " + textoHabito5);
    }

    private void limpiarHabitos() {
        // Limpiar el texto de cada EditText
        habito1.getText().clear();
        habito2.getText().clear();
        habito3.getText().clear();
        habito4.getText().clear();
        habito5.getText().clear();
    }
}
