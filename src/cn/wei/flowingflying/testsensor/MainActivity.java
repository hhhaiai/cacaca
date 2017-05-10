package cn.wei.flowingflying.testsensor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		getMenuInflater().inflate(R.menu.main_menu, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId()){
		case R.id.test_sensor_list:
			startActivity(new Intent(this,SensorListActivity.class));
			break;
		case R.id.test_light_sensor:
			startActivity(new Intent(this,LightSensorActivity.class));
			break;
		case R.id.test_proximity_sensor:
			startActivity(new Intent(this,ProximitySensorActivity.class));
			break;
		case R.id.test_gyroscope_sensor:
			startActivity(new Intent(this,GyroscopeSensorActivity.class));
			break;
		case R.id.test_accelerometer_sensor:
			startActivity(new Intent(this,AccelerometerSensorActivity.class));
			break;
		case R.id.test_accelerometer_2_sensor:
			startActivity(new Intent(this,GravityActivity.class));
			break;
		case R.id.test_magnetic_sensor:
			startActivity(new Intent(this,MagneticFieldSensorActivity.class));
			break;
		case R.id.test_orientation:
			startActivity(new Intent(this,VirtualJax.class));
			break;
		default:
			break;
		}
		return true;
	}
	
	
}
