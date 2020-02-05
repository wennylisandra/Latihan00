package id.ac.poliban.mi.wenny.latihan00;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //menentukan layout yang digunakan oleh mainActivity
        //ada di folder res/layout
        setContentView(R.layout.activity_main);

        //hubungkan view/komponen yang ada di layout
        //ke object dari kelas yang sesuai dengan view/komponen tersebut
        Button btfirst = findViewById(R.id.btfirst);
        Button btsecond = findViewById(R.id.btsecond);
        Button btthird = findViewById(R.id.btthird);
        Button btforth = findViewById(R.id.btforth);
        //memasang event listener kepada masing2 object Button
        //dengan parameter this (object dari kelas sekarang)
        btfirst.setOnClickListener(this);
        btsecond.setOnClickListener(this);
        btthird.setOnClickListener(this);
        btforth.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R. id.btfirst:
                Toast.makeText(this, "Hei anda sudah mengklik tomnbol First", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btsecond:
                Toast.makeText(this, "Hei Tombol Second!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btthird:
                Toast.makeText(this, "Hei Tombol Third!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btforth:
                Toast.makeText(this, "Hei Tombol Forth!", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
