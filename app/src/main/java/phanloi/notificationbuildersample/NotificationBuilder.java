package phanloi.notificationbuildersample;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.NotificationCompat;

import static android.support.v4.app.NotificationCompat.PRIORITY_MAX;

/**
 * Copyright (c) 2017, VNG Corp. All rights reserved.
 *
 * @author Lio <loipn@vng.com.vn>
 * @version 1.0
 * @since June 26, 2017
 */

public class NotificationBuilder {

    public static void showNormalNotification(Context context) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
        builder.setContentTitle(context.getString(R.string.app_name))
                .setContentText("Lorem Ipsum is simply dummy text of the printing and typesetting industry.")
                .setSmallIcon(R.mipmap.ic_launcher)
                .setColor(0x017477)
                .setAutoCancel(true)
                .setDefaults(Notification.DEFAULT_ALL)
                .setPriority(PRIORITY_MAX);
        Notification notification = builder.build();

        NotificationManager nm = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        nm.notify(100, notification);
    }

    public static void showLargeNotification(Context context) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
        builder.setContentTitle(context.getString(R.string.app_name))
                .setContentText("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.")
                .setSmallIcon(R.mipmap.ic_launcher)
                .setColor(0x017477)
                .setAutoCancel(true)
                .setDefaults(Notification.DEFAULT_ALL)
                .setPriority(PRIORITY_MAX);
        Notification notification = new NotificationCompat.BigTextStyle(builder).bigText("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.").build();
//        Notification notification = builder.build();

        NotificationManager nm = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        nm.notify(100, notification);
    }
}
