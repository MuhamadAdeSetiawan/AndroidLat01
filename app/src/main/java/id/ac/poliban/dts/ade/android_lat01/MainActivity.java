package id.ac.poliban.dts.ade.android_lat01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Memasang event listener & menangani event handler
        initComponents();
    }

    private void initComponents(){
        //pasang event listener
        Button btAjax = findViewById(R.id.btAjax);
        Button btBarcelona = findViewById(R.id.btBarcelona);
        Button btRealMadrid = findViewById(R.id.btRealMadrid);
        Button btRoma = findViewById(R.id.btRoma);
        Button btJuventus = findViewById(R.id.btJuventus);
        Button btArsenal = findViewById(R.id.btArsenal);

        //tangani kejadian (event handler)
        //menggunakan object yang dibuat dari kelas anonim
        //yang mengimplementasikan interface OnClickListener

        btAjax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "I'm Ajax in The Amsterdam!", Toast.LENGTH_SHORT).show();
            }
        });
        btBarcelona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Sorry MAdrid I'm Fans Barcalona", Toast.LENGTH_SHORT).show();
            }
        });
        btRealMadrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "HALLA MADRID", Toast.LENGTH_SHORT).show();
            }
        });
        btRoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "OLE OLE OLEE !!!", Toast.LENGTH_SHORT).show();
            }
        });
        btJuventus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "CR 7 IS THE BEST", Toast.LENGTH_SHORT).show();
            }
        });
        btArsenal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "HERE'S COME'S THE GUNNERS", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
