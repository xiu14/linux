package com.bytedance.push.notification;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class j extends com.bytedance.common.push.c {
    private Notification a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private ComponentName f5771c;

    /* renamed from: g, reason: collision with root package name */
    private String f5775g;
    private String h;
    public List<String> i;
    public String j;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5773e = true;

    /* renamed from: f, reason: collision with root package name */
    private boolean f5774f = false;

    /* renamed from: d, reason: collision with root package name */
    private long f5772d = System.currentTimeMillis();

    public j(Notification notification, int i, List<String> list) {
        this.b = 1;
        this.a = notification;
        this.b = i;
        this.i = list;
    }

    public boolean n() {
        return this.f5774f;
    }

    public Map<String, Object> o() throws IllegalAccessException {
        Field[] declaredFields = this.a.getClass().getDeclaredFields();
        HashMap hashMap = new HashMap();
        StringBuilder M = e.a.a.a.a.M("\n");
        for (Field field : declaredFields) {
            if (!Modifier.isFinal(field.getModifiers()) && !Modifier.isStatic(field.getModifiers())) {
                field.setAccessible(true);
                if (TextUtils.equals(field.getName(), "extras")) {
                    Bundle bundle = this.a.extras;
                    if (bundle != null) {
                        for (String str : bundle.keySet()) {
                            List<String> list = this.i;
                            if (list == null || !list.contains(str)) {
                                Object[] objArr = new Object[3];
                                objArr[0] = str;
                                objArr[1] = bundle.get(str);
                                objArr[2] = bundle.get(str) != null ? bundle.get(str).getClass() : "null";
                                M.append(String.format("extra.%s:%s:%s\n", objArr));
                                hashMap.put(String.format("extra.%s", str), bundle.get(str));
                            } else {
                                com.bytedance.push.g0.f.c("NotificationEvent", String.format("filter filed extras.%s", str));
                            }
                        }
                    }
                } else {
                    List<String> list2 = this.i;
                    if (list2 == null || !list2.contains(field.getName())) {
                        M.append(String.format("%s:%s:%s\n", field.getName(), field.get(this.a), field.getType()));
                        hashMap.put(field.getName(), field.get(this.a));
                    } else {
                        com.bytedance.push.g0.f.c("NotificationEvent", String.format("filter filed %s", field.getName()));
                    }
                }
            }
        }
        com.bytedance.push.g0.f.c("NotificationEvent", M.toString());
        return hashMap;
    }

    public j p(boolean z) {
        this.f5773e = z;
        return this;
    }

    public j q(String str) {
        this.h = str;
        return this;
    }

    public j r(boolean z) {
        this.f5774f = z;
        return this;
    }

    public j s(String str) {
        this.f5775g = str;
        return this;
    }

    public JSONObject t() {
        String str;
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "client_time", this.f5772d);
        add(jSONObject, "notification_type", this.b);
        ComponentName componentName = this.f5771c;
        if (componentName == null) {
            add(jSONObject, "component", "null");
        } else {
            add(jSONObject, "component", componentName.toShortString());
        }
        if (!TextUtils.isEmpty(this.f5775g)) {
            add(jSONObject, "target_text_reg", this.f5775g);
        }
        if (!TextUtils.isEmpty(this.j)) {
            add(jSONObject, "op_pkg", this.j);
        }
        NotificationChannel notificationChannel = ((NotificationManager) com.ss.android.message.a.a().getSystemService(RemoteMessageConst.NOTIFICATION)).getNotificationChannel(this.a.getChannelId());
        if (notificationChannel == null) {
            add(jSONObject, "channel_is_open", false);
        } else {
            add(jSONObject, "channel_is_open", notificationChannel.getImportance() > 0);
            add(jSONObject, "channel_importance", notificationChannel.getImportance());
        }
        add(jSONObject, "push_is_open", com.ss.android.message.f.a.d(com.ss.android.message.a.a()) > 0);
        add(jSONObject, "is_valid", this.f5773e);
        add(jSONObject, "is_target_notification", this.f5774f);
        add(jSONObject, "stack", this.h);
        add(jSONObject, "process", com.ss.android.message.f.a.j(com.ss.android.message.a.a()));
        try {
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : ((HashMap) o()).entrySet()) {
                if (entry.getValue() == null) {
                    str = "null";
                } else if (entry.getValue() instanceof PendingIntent) {
                    PendingIntent pendingIntent = (PendingIntent) entry.getValue();
                    str = NotificationShowMonitor.inst().getContentIntentFromPendingIntent(pendingIntent);
                    if (TextUtils.isEmpty(str)) {
                        str = String.valueOf(entry.getValue());
                    } else {
                        hashSet.add(pendingIntent);
                    }
                } else {
                    str = String.valueOf(entry.getValue());
                }
                add(jSONObject, (String) entry.getKey(), str);
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                NotificationShowMonitor.inst().removeContentIntent((PendingIntent) it2.next());
            }
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public j(Notification notification, int i, ComponentName componentName, List<String> list) {
        this.b = 1;
        this.a = notification;
        this.b = i;
        this.f5771c = componentName;
        this.i = list;
    }
}
