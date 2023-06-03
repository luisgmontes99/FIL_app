package mx.app.fil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class Programa_G extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programa_g);

        WebView web = (WebView) findViewById(R.id.web_pro);
        web.loadUrl("https://www.fil.com.mx/prog/resultados.asp?r=3&idsr=2&f=0&e=2022&ids=0");
    }

    public void Inicio5(View view){
        Intent info = new Intent(this,MainActivity.class);
        startActivity(info);
    }
}