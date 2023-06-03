package mx.app.fil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class Aviso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aviso);

        WebView web = (WebView) findViewById(R.id.web_aviso);
        web.loadUrl("https://transparencia.udg.mx/aviso-confidencialidad-integral");

    }

    public void Inicio3(View view){
        Intent info = new Intent(this,MainActivity.class);
        startActivity(info);
    }
}