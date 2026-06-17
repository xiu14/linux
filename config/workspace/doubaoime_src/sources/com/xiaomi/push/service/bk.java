package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.core.location.LocationRequestCompat;
import com.xiaomi.push.hz;
import com.xiaomi.push.service.s;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class bk {
    private b a;

    private static class a {
        private static final bk a = new bk();
    }

    public interface b {
        void a(String str, int i);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static bk m789a() {
        return a.a;
    }

    private void b(s.d[] dVarArr, int i) {
        if (dVarArr == null) {
            return;
        }
        String str = null;
        HashMap hashMap = new HashMap();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (dVarArr[i3] != null && dVarArr[i3].f1151a != null) {
                String str2 = dVarArr[i3].f1151a.f1145a;
                if (!TextUtils.isEmpty(str2)) {
                    Integer num = (Integer) hashMap.get(str2);
                    int intValue = num != null ? 1 + num.intValue() : 1;
                    hashMap.put(str2, Integer.valueOf(intValue));
                    if (intValue > i2) {
                        str = str2;
                        i2 = intValue;
                    }
                }
            }
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.a(str, i2);
    }

    private bk() {
    }

    public void a(b bVar) {
        this.a = bVar;
    }

    private int a() {
        Context m841a = com.xiaomi.push.t.m841a();
        if (m841a == null) {
            return 16384;
        }
        return Math.max(aq.a(m841a).a(hz.TaskHeapSizeMax.a(), 16384), 8192);
    }

    /* renamed from: a, reason: collision with other method in class */
    private long m788a() {
        Context m841a = com.xiaomi.push.t.m841a();
        return m841a == null ? LocationRequestCompat.PASSIVE_INTERVAL : m841a.getSharedPreferences("mipush_extra", 0).getLong("last_limit_app_id_upload_time", 0L);
    }

    private void a(long j) {
        Context m841a = com.xiaomi.push.t.m841a();
        if (m841a == null) {
            return;
        }
        SharedPreferences.Editor edit = m841a.getSharedPreferences("mipush_extra", 0).edit();
        edit.putLong("last_limit_app_id_upload_time", j);
        edit.apply();
    }

    void a(s.d[] dVarArr, int i) {
        if (this.a == null || dVarArr == null || i <= 8192) {
            return;
        }
        try {
            if (i > a()) {
                long currentTimeMillis = System.currentTimeMillis();
                if (Math.abs(currentTimeMillis - m788a()) > com.heytap.mcssdk.constant.a.f6888f) {
                    b(dVarArr, i);
                    a(currentTimeMillis);
                }
            }
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("check task count error: ");
            M.append(e2.getMessage());
            com.xiaomi.channel.commonutils.logger.c.d(M.toString());
        }
    }
}
