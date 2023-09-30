package cl.isisur.pruebasensores;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private SensorManager mgr;
    private TextView textLista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mgr=(SensorManager) getSystemService(Context.SENSOR_SERVICE);
        textLista =(TextView) findViewById(R.id.sensorsList);
        List<Sensor> sensorList=mgr.getSensorList(Sensor.TYPE_ALL);
        StringBuilder stringBuilder= new StringBuilder();
        for (Sensor s: sensorList){
            stringBuilder.append(s.getName());
        }

        textLista.setVisibility(View.VISIBLE);
        textLista.setText(stringBuilder);


    }
}