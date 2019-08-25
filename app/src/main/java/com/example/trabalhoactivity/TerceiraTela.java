package com.example.trabalhoactivity;


import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TerceiraTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira_tela);
        notificacao();
    }
private void notificacao() {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        NotificationChannel channel = new NotificationChannel("my_channel_id", "my_channel", NotificationManager.IMPORTANCE_DEFAULT);
        NotificationManager nm = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        nm.createNotificationChannel(channel);
    }
    NotificationCompat.Builder Builder = new NotificationCompat.Builder(this,"my_channel_id");
    Builder.setSmallIcon(R.drawable.ic_launcher_background);
    Builder.setContentTitle("Shhiuuuuu!");
    Builder.setContentText("Eles sabem que viu");
    Builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);

    NotificationManager nm = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
    nm.notify(123456, Builder.build());
    }
}