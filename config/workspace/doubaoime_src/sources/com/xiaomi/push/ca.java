package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.push.ah;
import com.xiaomi.push.cj;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class ca {
    private static volatile ca a;

    /* renamed from: a, reason: collision with other field name */
    private Context f161a;

    /* renamed from: a, reason: collision with other field name */
    private ck f163a;

    /* renamed from: a, reason: collision with other field name */
    private cl f164a;

    /* renamed from: e, reason: collision with root package name */
    private String f9008e;

    /* renamed from: f, reason: collision with root package name */
    private String f9009f;

    /* renamed from: a, reason: collision with other field name */
    private final String f165a = "push_stat_sp";

    /* renamed from: b, reason: collision with other field name */
    private final String f166b = "upload_time";

    /* renamed from: c, reason: collision with other field name */
    private final String f167c = "delete_time";

    /* renamed from: d, reason: collision with root package name */
    private final String f9007d = "check_time";

    /* renamed from: a, reason: collision with other field name */
    private ah.a f162a = new ah.a() { // from class: com.xiaomi.push.ca.1
        @Override // com.xiaomi.push.ah.a
        /* renamed from: a */
        public String mo139a() {
            return "10052";
        }

        @Override // java.lang.Runnable
        public void run() {
            com.xiaomi.channel.commonutils.logger.c.c("exec== mUploadJob");
            if (ca.this.f164a != null) {
                ca.this.f164a.a(ca.this.f161a);
                ca.this.b("upload_time");
            }
        }
    };
    private ah.a b = new ah.a() { // from class: com.xiaomi.push.ca.2
        @Override // com.xiaomi.push.ah.a
        /* renamed from: a */
        public String mo139a() {
            return "10054";
        }

        @Override // java.lang.Runnable
        public void run() {
            com.xiaomi.channel.commonutils.logger.c.c("exec== DbSizeControlJob");
            cj.a(ca.this.f161a).a(new cc(ca.this.c(), new WeakReference(ca.this.f161a)));
            ca.this.b("check_time");
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private ah.a f9006c = new ah.a() { // from class: com.xiaomi.push.ca.3
        @Override // com.xiaomi.push.ah.a
        /* renamed from: a */
        public String mo139a() {
            return "10053";
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ca.this.f164a != null) {
                ca.this.f164a.b(ca.this.f161a);
                ca.this.b("delete_time");
            }
        }
    };

    private ca(Context context) {
        this.f161a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        SharedPreferences.Editor edit = this.f161a.getSharedPreferences("push_stat_sp", 0).edit();
        edit.putLong(str, System.currentTimeMillis());
        q.a(edit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c() {
        return this.f161a.getDatabasePath(cb.f169a).getAbsolutePath();
    }

    public static ca a(Context context) {
        if (a == null) {
            synchronized (ca.class) {
                if (a == null) {
                    a = new ca(context);
                }
            }
        }
        return a;
    }

    public String b() {
        return this.f9009f;
    }

    private boolean a() {
        return com.xiaomi.push.service.aq.a(this.f161a).a(hz.StatDataSwitch.a(), true);
    }

    public void a(cj.a aVar) {
        cj.a(this.f161a).a(aVar);
    }

    public void a(String str, String str2, Boolean bool) {
        if (this.f163a != null) {
            if (bool.booleanValue()) {
                this.f163a.a(this.f161a, str2, str);
            } else {
                this.f163a.b(this.f161a, str2, str);
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m161a() {
        return this.f9008e;
    }

    public void a(String str) {
        if (a() && !TextUtils.isEmpty(str)) {
            a(cm.a(this.f161a, str));
        }
    }

    public void a(hy hyVar) {
        if (a() && com.xiaomi.push.service.bl.a(hyVar.e())) {
            a(cg.a(this.f161a, c(), hyVar));
        }
    }
}
