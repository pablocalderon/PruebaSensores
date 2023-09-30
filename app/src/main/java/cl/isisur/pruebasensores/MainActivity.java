package cl.isisur.pruebasensores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mgr=(SensorManager) getSystemService(Context.SENSOR_SERVICE);
        textLista =(TextView) findViewById(R.id.sensorsList);
        List<Sensor> sensorList=mgr.getSensorList(Sensor.TYPE_ALL);
        StringBuilder stringBuilder= new StringBuilder();
        for (Sensor s: sensorList){
            stringBuilder.append(s.getName()).append("\n");
        }

        textLista.setVisibility(View.VISIBLE);
        textLista.setText(stringBuilder);


    }
}