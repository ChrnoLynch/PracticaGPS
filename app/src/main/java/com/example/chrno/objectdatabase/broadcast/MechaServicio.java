package com.example.chrno.objectdatabase.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.example.chrno.objectdatabase.servicio.ServicioGPS;

public class MechaServicio extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        final Context c = context;
        Intent serviceIntent = new Intent(context,ServicioGPS.class);
        context.startService(serviceIntent);
    }
}