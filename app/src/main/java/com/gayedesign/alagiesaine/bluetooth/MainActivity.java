package com.gayedesign.alagiesaine.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    BluetoothAdapter bluetoothAdapter;
    ListView listView;
    Set<BluetoothDevice> pairedDevices;
    Button onButton,offButton,discoverableButton,pairedDevicesButton,cancelDescovery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onButton = (Button) findViewById(R.id.onButton);
        offButton = (Button) findViewById(R.id.offButton);
        discoverableButton = (Button) findViewById(R.id.discoverableButton);
        pairedDevicesButton = (Button) findViewById(R.id.pairedDevicesButton);
        cancelDescovery = (Button) findViewById(R.id.cancelDescovery);
        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        listView = (ListView) findViewById(R.id.listView);
    }

    public void onButton(View view) {
        if(!bluetoothAdapter.isEnabled()){
            //bluetoothAdapter.enable();
            Intent onIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(onIntent,0);
            //Toast.makeText(getApplicationContext(),"Bluetooth turned on",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(getApplicationContext(),"Bluetooth already on",Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(getApplicationContext(),"Bluetooth turned on",Toast.LENGTH_SHORT).show();
    }
    public void offButton(View view) {
        bluetoothAdapter.disable();
    }

    public void discoverableButton(View view) {
        Intent discoverableIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
        startActivityForResult(discoverableIntent,0);
        Toast.makeText(getApplicationContext(),"Bluetooth is visible for 120 secs",Toast.LENGTH_SHORT).show();


    }
    public void pairedDevicesButton(View view) {
        ArrayList list = new ArrayList();
        pairedDevices = bluetoothAdapter.getBondedDevices();

        if (pairedDevices.size() > 0){
            for (BluetoothDevice devices : pairedDevices){
                list.add(devices.getName());
            }
        }

        final ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);

    }

    public void cancelDescovery(View view) {
        bluetoothAdapter.cancelDiscovery();
        Toast.makeText(getApplicationContext(),"Descovery cancelled",Toast.LENGTH_SHORT).show();
    }
}
