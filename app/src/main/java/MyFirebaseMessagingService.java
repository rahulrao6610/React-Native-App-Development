package com.rnnotificationapp;

import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

        if (remoteMessage.getNotification() != null) {
            Log.d("FCM", "Notification Received: " + remoteMessage.getNotification().getBody());
            // TODO: Trigger local notification here (using NotificationCompat)
        }
    }
}
