package mx.app.fil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class foro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foro);

        WebView web = (WebView) findViewById(R.id.web_foro);
        web.loadUrl("");
    }

    public void Inicio4(View view){
        Intent info = new Intent(this,MainActivity.class);
        startActivity(info);
    }
}