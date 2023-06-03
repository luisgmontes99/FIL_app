package mx.app.fil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class FillC extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_c);

        WebView web = (WebView) findViewById(R.id.web_ninos);
        web.loadUrl("https://www.fil.com.mx/filninos/");
    }

    public void Inicio(View view){
        Intent info = new Intent(this,MainActivity.class);
        startActivity(info);
    }
}