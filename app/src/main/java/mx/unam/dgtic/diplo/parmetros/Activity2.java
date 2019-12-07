package mx.unam.dgtic.diplo.parmetros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class Activity2 extends AppCompatActivity {
    private static final String LOGTAG = "DEPURACION";
    ImageView ivEstrella;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        /* Recibir la info de la activity pasada */
        Bundle bundle = new Bundle();
        bundle = getIntent().getExtras();
        String nombre = bundle.getString("NOMBRE", "No hay dato");
        int edad = bundle.getInt("EDAD");

        Log.d(LOGTAG, "La info que llegó al activity es: " + nombre + " y la edad: " + edad);

        ivEstrella = findViewById(R.id.ivEstrella);
        ivEstrella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this, Activity3.class);
                startActivity(intent);
            }
        });
    }
}
