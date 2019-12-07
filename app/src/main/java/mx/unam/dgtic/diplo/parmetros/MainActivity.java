package mx.unam.dgtic.diplo.parmetros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Typeface fuenteFrontier;
    TextView tvNombre, tvEdad;
    EditText etNombre, etEdad;
    ImageButton ibAgregar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.meter, R.anim.mantener);
        setContentView(R.layout.activity_main);
        tvNombre = findViewById(R.id.tvNombre);
        tvEdad = findViewById(R.id.tvEdad);
        etNombre = findViewById(R.id.etNombre);
        etEdad = findViewById(R.id.etEdad);
        ibAgregar = findViewById(R.id.ibAgregar);

        ibAgregar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (etNombre.getText().toString().equals("") || etEdad.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"Lleana los campos", Toast.LENGTH_LONG);
                }else{
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                Bundle bundle = new Bundle();
                bundle.putString("NOMBRE", etNombre.getText().toString());  // Empaquetamos el texto del et
                bundle.putInt("EDAD", Integer.valueOf(etEdad.getText().toString()));
                intent.putExtras(bundle);
                startActivity(intent);}
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        overridePendingTransition(R.anim.mantener, R.anim.sacar);
    }
}
