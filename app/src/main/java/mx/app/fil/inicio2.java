package mx.app.fil;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import java.util.Timer;
import java.util.TimerTask;

public class inicio2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio2);

        ImageView imagenload = (ImageView) findViewById(R.id.img_cartel) ;

        Picasso.get()
                .load("https://cuceimobile.space/fil/img_cartel2.jpg")
                .error(R.drawable.img_cartel2)
                .fit()
                .centerInside()
                .into(imagenload);

        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(inicio2.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        };
        Timer tiempo = new Timer();
        tiempo.schedule(tarea,3000);

    }
}