package mx.app.fil;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.chip.Chip;

public class Redes_sociales extends AppCompatActivity {

    private Chip link_1;
    String _url1 = "https://www.facebook.com/filgdl";
    private Chip link_2;
    String _url2 = "https://www.instagram.com/filguadalajara/";
    private Chip link_3;
    String _url3 = "https://www.youtube.com/filguadalajara";
    private Chip link_4;
    String _url4 = "https://twitter.com/filguadalajara";
    private Chip link_5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redes_sociales);

        //RED SOCIAL DE FACEBOOK
        link_1 = findViewById(R.id.link1);
        link_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri link_11 = Uri.parse(_url1);
                Intent i = new Intent(Intent.ACTION_VIEW,link_11);
                startActivity(i);
            }
        });

        //RED SOCIAL DE INSTAGRAM
        link_2 = findViewById(R.id.link2);
        link_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri link_21 = Uri.parse(_url2);
                Intent i = new Intent(Intent.ACTION_VIEW,link_21);
                startActivity(i);
            }
        });

        //RED SOCIAL DE YOUTUBE
        link_3 = findViewById(R.id.link3);
        link_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri link_31 = Uri.parse(_url3);
                Intent i = new Intent(Intent.ACTION_VIEW,link_31);
                startActivity(i);
            }
        });

        //RED SOCIAL DE TWITTER
        link_4 = findViewById(R.id.link4);
        link_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri link_41 = Uri.parse(_url4);
                Intent i = new Intent(Intent.ACTION_VIEW,link_41);
                startActivity(i);
            }
        });
    }

    public void regreso2(View view){
        Intent info = new Intent(this,MainActivity.class);
        startActivity(info);
    }
}