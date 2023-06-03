package mx.app.fil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class buscador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscador);

        WebView web = (WebView) findViewById(R.id.web_buscador);
        web.loadUrl("https://www.fil.com.mx/libros/cata_libros.asp");
    }

    public void Inicio6(View view){
        Intent info = new Intent(this,MainActivity.class);
        startActivity(info);
    }
}