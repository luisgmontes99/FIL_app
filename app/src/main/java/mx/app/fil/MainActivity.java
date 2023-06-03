package mx.app.fil;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String gif_url = "https://cuceimobile.space/fil/img_horizontal.gif";
        ImageView imagengif = (ImageView) findViewById(R.id.img_gif) ;

        Uri urlparse = Uri.parse(gif_url);
        Glide.with(getApplicationContext()).load(urlparse).into(imagengif);

    }




    public void Info(View view){
        Intent info = new Intent(this,act_info.class);
        startActivity(info);
    }

    public void Foro(View view){
        Intent info = new Intent(this,foro.class);
        startActivity(info);
    }

    public void Redes(View view){
        Intent info = new Intent(this,Redes_sociales.class);
        startActivity(info);
    }

    public void FILC(View view){
        Intent info = new Intent(this,FillC.class);
        startActivity(info);
    }

    public void Aviso(View view){
        Intent info = new Intent(this,Aviso.class);
        startActivity(info);
    }

    public void progra(View view){
        Intent info = new Intent(this, Programa_G.class);
        startActivity(info);
    }

    public void buscador(View view){
        Intent info = new Intent(this, buscador.class);
        startActivity(info);
    }

}