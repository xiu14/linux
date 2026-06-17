package com.xiaomi.push.service;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.xiaomi.push.ff;
import com.xiaomi.push.iq;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class ah {
    abstract long a(Context context, ff ffVar, Map<String, String> map);

    abstract Intent a(Context context, iq iqVar, int i, Bundle bundle);

    abstract ff a(Context context, int i, String str, Map<String, String> map);

    abstract void a(iq iqVar, Map<String, String> map, int i, Notification notification);

    abstract void a(String str);

    /* renamed from: a, reason: collision with other method in class */
    abstract boolean m734a(Context context, int i, String str, Map<String, String> map);

    abstract boolean a(Map<String, String> map, int i, Notification notification);
}
