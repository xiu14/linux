package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.xiaomi.push.ai;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class dr {
    private static volatile dr a;

    /* renamed from: a, reason: collision with other field name */
    private Context f278a;

    /* renamed from: a, reason: collision with other field name */
    private final ConcurrentLinkedQueue<b> f279a;

    class a extends b {
        a() {
            super();
        }

        @Override // com.xiaomi.push.dr.b, com.xiaomi.push.ai.b
        public void b() {
            dr.this.b();
        }
    }

    class b extends ai.b {
        long a = System.currentTimeMillis();

        b() {
        }

        public boolean a() {
            return true;
        }

        @Override // com.xiaomi.push.ai.b
        public void b() {
        }

        /* renamed from: b, reason: collision with other method in class */
        final boolean m255b() {
            return System.currentTimeMillis() - this.a > 172800000;
        }
    }

    private dr(Context context) {
        ConcurrentLinkedQueue<b> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        this.f279a = concurrentLinkedQueue;
        this.f278a = context;
        concurrentLinkedQueue.add(new a());
        b(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        try {
            File file = new File(this.f278a.getFilesDir() + "/.logcache");
            if (file.exists() && file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    file2.delete();
                }
            }
        } catch (NullPointerException unused) {
        }
    }

    private void c() {
        while (!this.f279a.isEmpty()) {
            b peek = this.f279a.peek();
            if (peek != null) {
                if (!peek.m255b() && this.f279a.size() <= 6) {
                    return;
                }
                com.xiaomi.channel.commonutils.logger.c.c("remove Expired task");
                this.f279a.remove(peek);
            }
        }
    }

    public static dr a(Context context) {
        if (a == null) {
            synchronized (dr.class) {
                if (a == null) {
                    a = new dr(context);
                }
            }
        }
        a.f278a = context;
        return a;
    }

    private void b(long j) {
        if (this.f279a.isEmpty()) {
            return;
        }
        hn.a(new ai.b() { // from class: com.xiaomi.push.dr.2
            ai.b a;

            @Override // com.xiaomi.push.ai.b
            public void b() {
                b bVar = (b) dr.this.f279a.peek();
                if (bVar == null || !bVar.a()) {
                    return;
                }
                if (dr.this.f279a.remove(bVar)) {
                    this.a = bVar;
                }
                ai.b bVar2 = this.a;
                if (bVar2 != null) {
                    bVar2.b();
                }
            }

            @Override // com.xiaomi.push.ai.b
            /* renamed from: c */
            public void mo256c() {
                ai.b bVar = this.a;
                if (bVar != null) {
                    bVar.mo256c();
                }
            }
        }, j);
    }

    class c extends b {
        int a;

        /* renamed from: a, reason: collision with other field name */
        File f288a;

        /* renamed from: a, reason: collision with other field name */
        String f289a;

        /* renamed from: a, reason: collision with other field name */
        boolean f290a;
        String b;

        /* renamed from: b, reason: collision with other field name */
        boolean f291b;

        c(String str, String str2, File file, boolean z) {
            super();
            this.f289a = str;
            this.b = str2;
            this.f288a = file;
            this.f291b = z;
        }

        private boolean c() {
            int i;
            int i2 = 0;
            SharedPreferences sharedPreferences = dr.this.f278a.getSharedPreferences("log.timestamp", 0);
            String string = sharedPreferences.getString("log.requst", "");
            long currentTimeMillis = System.currentTimeMillis();
            try {
                JSONObject jSONObject = new JSONObject(string);
                currentTimeMillis = jSONObject.getLong(CrashHianalyticsData.TIME);
                i = jSONObject.getInt("times");
            } catch (JSONException unused) {
                i = 0;
            }
            if (System.currentTimeMillis() - currentTimeMillis >= com.heytap.mcssdk.constant.a.f6888f) {
                currentTimeMillis = System.currentTimeMillis();
            } else {
                if (i > 10) {
                    return false;
                }
                i2 = i;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(CrashHianalyticsData.TIME, currentTimeMillis);
                jSONObject2.put("times", i2 + 1);
                sharedPreferences.edit().putString("log.requst", jSONObject2.toString()).commit();
            } catch (JSONException e2) {
                StringBuilder M = e.a.a.a.a.M("JSONException on put ");
                M.append(e2.getMessage());
                com.xiaomi.channel.commonutils.logger.c.c(M.toString());
            }
            return true;
        }

        @Override // com.xiaomi.push.dr.b
        public boolean a() {
            return ax.d(dr.this.f278a) || (this.f291b && ax.m117a(dr.this.f278a));
        }

        @Override // com.xiaomi.push.dr.b, com.xiaomi.push.ai.b
        public void b() {
            try {
                if (c()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("uid", com.xiaomi.push.service.bi.m780a());
                    hashMap.put("token", this.b);
                    hashMap.put("net", ax.m112a(dr.this.f278a));
                    ax.a(this.f289a, hashMap, this.f288a, "file");
                }
                this.f290a = true;
            } catch (IOException unused) {
            }
        }

        @Override // com.xiaomi.push.ai.b
        /* renamed from: c, reason: collision with other method in class */
        public void mo256c() {
            if (!this.f290a) {
                int i = this.a + 1;
                this.a = i;
                if (i < 3) {
                    dr.this.f279a.add(this);
                }
            }
            if (this.f290a || this.a >= 3) {
                this.f288a.delete();
            }
            dr.this.a((1 << this.a) * 1000);
        }
    }

    public void a(final String str, final String str2, final Date date, final Date date2, final int i, final boolean z) {
        this.f279a.add(new b() { // from class: com.xiaomi.push.dr.1

            /* renamed from: a, reason: collision with other field name */
            File f281a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.xiaomi.push.dr.b, com.xiaomi.push.ai.b
            public void b() {
                try {
                    File file = new File(dr.this.f278a.getFilesDir() + "/.logcache");
                    if (x.m849a(file)) {
                        file.mkdirs();
                        if (file.isDirectory()) {
                            dq dqVar = new dq();
                            dqVar.a(i);
                            this.f281a = dqVar.a(dr.this.f278a, date, date2, file);
                        }
                    }
                } catch (NullPointerException unused) {
                }
            }

            @Override // com.xiaomi.push.ai.b
            /* renamed from: c */
            public void mo256c() {
                File file = this.f281a;
                if (file != null && file.exists()) {
                    dr.this.f279a.add(dr.this.new c(str, str2, this.f281a, z));
                }
                dr.this.a(0L);
            }
        });
        b(0L);
    }

    public void a() {
        c();
        a(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j) {
        b peek = this.f279a.peek();
        if (peek == null || !peek.a()) {
            return;
        }
        b(j);
    }
}
