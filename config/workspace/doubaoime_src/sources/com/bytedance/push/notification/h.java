package com.bytedance.push.notification;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.push.C;
import com.bytedance.push.C0679c;
import com.bytedance.push.settings.LocalFrequencySettings;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class h {
    private static c a = new d(null);

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements c {
        private NotificationManager a = null;

        b(a aVar) {
        }

        NotificationManager a(Context context) {
            if (this.a == null) {
                this.a = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
            }
            return this.a;
        }
    }

    interface c {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(26)
    static class d extends b {
        private List<NotificationChannel> b;

        private d() {
            super(null);
        }

        private List<NotificationChannel> c(Context context) {
            List<NotificationChannel> list = this.b;
            if (list == null || list.isEmpty()) {
                try {
                    this.b = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannels();
                } catch (Throwable th) {
                    th.printStackTrace();
                    this.b = Collections.emptyList();
                }
            }
            return this.b;
        }

        private static boolean g(List<NotificationChannel> list, Map<String, com.bytedance.push.R.d> map) {
            if (list.size() != map.size()) {
                return false;
            }
            for (NotificationChannel notificationChannel : list) {
                com.bytedance.push.R.d dVar = map.get(notificationChannel.getId());
                if (dVar == null || dVar.e() != notificationChannel.getImportance() || dVar.f() != notificationChannel.getLockscreenVisibility() || dVar.a() != notificationChannel.canBypassDnd() || dVar.k() != notificationChannel.shouldShowLights() || dVar.l() != notificationChannel.shouldVibrate()) {
                    return false;
                }
            }
            return true;
        }

        private static Map<String, com.bytedance.push.R.d> h(JSONArray jSONArray) {
            if (jSONArray.length() == 0) {
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                hashMap.put(optJSONObject.optString("id"), new com.bytedance.push.R.d(optJSONObject));
            }
            return hashMap;
        }

        public void b(Context context, com.bytedance.push.R.d dVar) {
            boolean z;
            NotificationManager a = a(context);
            if (a == null || TextUtils.isEmpty(dVar.d()) || TextUtils.isEmpty(dVar.g()) || a.getNotificationChannel(dVar.d()) != null) {
                return;
            }
            int e2 = dVar.e();
            if (e2 < 0 || e2 > 5) {
                e2 = 3;
            }
            NotificationChannel notificationChannel = new NotificationChannel(dVar.d(), dVar.g(), e2);
            notificationChannel.setShowBadge(dVar.j());
            notificationChannel.setDescription(dVar.c());
            notificationChannel.enableVibration(dVar.l());
            notificationChannel.setBypassDnd(dVar.a());
            notificationChannel.enableLights(dVar.k());
            notificationChannel.setLockscreenVisibility(dVar.f());
            Iterator<String> keys = dVar.b().keys();
            while (true) {
                z = true;
                if (!keys.hasNext()) {
                    break;
                }
                String next = keys.next();
                Object opt = dVar.b().opt(next);
                if (opt != null) {
                    int i = com.bytedance.push.g0.c.f5701e;
                    try {
                        Field b = com.bytedance.push.g0.c.b(notificationChannel.getClass(), next);
                        b.setAccessible(true);
                        b.set(notificationChannel, opt);
                    } catch (Throwable unused) {
                    }
                }
            }
            String h = dVar.h();
            C0679c d2 = ((C) C.a()).d();
            if (!com.bytedance.push.g0.b.b(context, d2 != null ? d2.D : null, h, notificationChannel.getId(), new i(this, notificationChannel, context, a))) {
                if (d2 != null) {
                    int d3 = com.bytedance.push.g0.b.d(notificationChannel.getId(), d2.E, h);
                    if (d3 != -1) {
                        notificationChannel.setSound(com.bytedance.push.g0.b.e(context, d3), Notification.AUDIO_ATTRIBUTES_DEFAULT);
                        try {
                            a.createNotificationChannel(notificationChannel);
                        } catch (Throwable unused2) {
                        }
                    }
                }
                z = false;
            }
            if (z) {
                return;
            }
            try {
                a.createNotificationChannel(notificationChannel);
            } catch (Throwable unused3) {
            }
        }

        public JSONArray d(Context context) {
            List<NotificationChannel> c2 = c(context);
            JSONArray jSONArray = new JSONArray();
            if (c2 != null) {
                Iterator<NotificationChannel> it2 = c2.iterator();
                while (it2.hasNext()) {
                    try {
                        jSONArray.put(new com.bytedance.push.R.d(it2.next()).m());
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            return jSONArray;
        }

        public boolean e(Context context, int i) {
            boolean z = false;
            if (com.ss.android.message.f.a.d(context) != i) {
                return true;
            }
            try {
                List<NotificationChannel> c2 = c(context);
                String Q = ((LocalFrequencySettings) com.bytedance.push.settings.h.b(context, LocalFrequencySettings.class)).Q();
                if (!TextUtils.isEmpty(Q)) {
                    z = !g(c2, h(new JSONArray(Q)));
                } else if (c2 != null && !c2.isEmpty()) {
                    z = true;
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            return z;
        }

        public boolean f(Context context, int i) {
            boolean z = false;
            if (com.ss.android.message.f.a.d(context) != i) {
                return true;
            }
            try {
                List<NotificationChannel> c2 = c(context);
                String x = ((LocalFrequencySettings) com.bytedance.push.settings.h.b(context, LocalFrequencySettings.class)).x();
                if (!TextUtils.isEmpty(x)) {
                    z = !g(c2, h(new JSONArray(x)));
                } else if (c2 != null && !c2.isEmpty()) {
                    z = true;
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            return z;
        }

        d(a aVar) {
            super(null);
        }
    }

    public static c a() {
        return a;
    }
}
