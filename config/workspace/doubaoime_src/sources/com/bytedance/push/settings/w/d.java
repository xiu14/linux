package com.bytedance.push.settings.w;

import android.app.NotificationChannel;
import android.os.Parcel;
import android.util.Base64;

/* loaded from: classes2.dex */
public class d {
    private NotificationChannel a;

    public d(NotificationChannel notificationChannel) {
        this.a = notificationChannel;
    }

    public void a(String str) {
        byte[] decode = Base64.decode(str, 0);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
        this.a = (NotificationChannel) NotificationChannel.CREATOR.createFromParcel(obtain);
    }

    public String b() {
        Parcel obtain = Parcel.obtain();
        this.a.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return Base64.encodeToString(marshall, 0);
    }

    public d() {
    }
}
