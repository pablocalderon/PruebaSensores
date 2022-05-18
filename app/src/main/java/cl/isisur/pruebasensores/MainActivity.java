package cl.isisur.pruebasensores;

//import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;


public class MainActivity extends AppCompatActivity {
      private SensorManager mgr;
      private TextView textList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mgr =(SensorManager)getSystemService(Context.SENSOR_SERVICE);
        textList=(TextView) findViewById(R.id.sensorsList);
        List<Sensor> sensorList =mgr.getSensorList(Sensor.TYPE_ALL);
        StringBuilder strBuilder = new StringBuilder();
        for (Sensor s: sensorList){

            strBuilder.append(s.getName()+"\n");
        }
        textList.setVisibility(View.VISIBLE);
        textList.setText(strBuilder);

    }
}