package mx.app.fil;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TableRow;

import androidx.appcompat.app.AppCompatActivity;

public class act_info extends AppCompatActivity {

    String _llegar = "https://www.fil.com.mx/info/como_llegar.asp";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_info);

        //Como llegar a la fil
        TableRow btn_fila6 = findViewById(R.id.info_fila_6);
        btn_fila6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri link_1 = Uri.parse(_llegar);
                Intent i = new Intent(Intent.ACTION_VIEW,link_1);
                startActivity(i);
            }
        });
    }

    public void Inicio2(View view){
        Intent info = new Intent(this,MainActivity.class);
        startActivity(info);
    }


}