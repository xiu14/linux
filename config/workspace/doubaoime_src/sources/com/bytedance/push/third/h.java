package com.bytedance.push.third;

import android.content.Context;
import android.content.Intent;
import com.ss.android.message.b;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class h implements com.ss.android.message.b {

    /* renamed from: c, reason: collision with root package name */
    private static volatile h f5884c;
    private List<com.ss.android.message.b> a = Collections.emptyList();
    private b.a b;

    class a implements b.a {
        a(h hVar) {
        }
    }

    private h() {
    }

    public static h h() {
        if (f5884c == null) {
            synchronized (h.class) {
                if (f5884c == null) {
                    f5884c = new h();
                }
            }
        }
        return f5884c;
    }

    @Override // com.ss.android.message.b
    public void a(b.a aVar) {
    }

    @Override // com.ss.android.message.b
    public void b(Context context, JSONObject jSONObject) {
        List<com.ss.android.message.b> list = this.a;
        if (list != null) {
            Iterator<com.ss.android.message.b> it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    it2.next().b(context, jSONObject);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    @Override // com.ss.android.message.b
    public void c(Context context, Map<String, String> map) {
        List<com.ss.android.message.b> list = this.a;
        if (list != null) {
            Iterator<com.ss.android.message.b> it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    it2.next().c(context, map);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    @Override // com.ss.android.message.c
    public void d(Context context) {
        List<com.ss.android.message.b> list = this.a;
        if (list != null) {
            Iterator<com.ss.android.message.b> it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    it2.next().d(context);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    @Override // com.ss.android.message.c
    public void e(Intent intent) {
        List<com.ss.android.message.b> list = this.a;
        if (list != null) {
            Iterator<com.ss.android.message.b> it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    it2.next().e(intent);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    @Override // com.ss.android.message.c
    public void f() {
        List<com.ss.android.message.b> list = this.a;
        if (list != null) {
            Iterator<com.ss.android.message.b> it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    it2.next().f();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    @Override // com.ss.android.message.b
    public void g(Context context, com.ss.android.g.b bVar) {
        this.b = new a(this);
        List<com.ss.android.message.b> list = this.a;
        if (list != null) {
            for (com.ss.android.message.b bVar2 : list) {
                try {
                    bVar2.a(this.b);
                    bVar2.g(context, bVar);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    public void i(List<com.ss.android.message.b> list) {
        this.a = list;
    }

    @Override // com.ss.android.message.b
    public void onStart() {
        List<com.ss.android.message.b> list = this.a;
        if (list != null) {
            Iterator<com.ss.android.message.b> it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    it2.next().onStart();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }
}
