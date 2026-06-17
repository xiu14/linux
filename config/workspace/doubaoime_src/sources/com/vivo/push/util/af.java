package com.vivo.push.util;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class af implements e {
    private static final HashMap<String, Integer> a = new HashMap<>();
    private static final HashMap<String, Long> b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private static final HashMap<String, String> f8899c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private static af f8900d;

    /* renamed from: e, reason: collision with root package name */
    private Context f8901e;

    /* renamed from: f, reason: collision with root package name */
    private e f8902f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8903g;

    private af(Context context) {
        this.f8903g = false;
        this.f8901e = context;
        this.f8903g = a(context);
        t.d("SystemCache", "init status is " + this.f8903g + ";  curCache is " + this.f8902f);
    }

    public static synchronized af b(Context context) {
        af afVar;
        synchronized (af.class) {
            if (f8900d == null) {
                f8900d = new af(context.getApplicationContext());
            }
            afVar = f8900d;
        }
        return afVar;
    }

    public final void a() {
        ae aeVar = new ae();
        if (aeVar.a(this.f8901e)) {
            aeVar.a();
            t.d("SystemCache", "sp cache is cleared");
        }
    }

    @Override // com.vivo.push.util.e
    public final boolean a(Context context) {
        ac acVar = new ac();
        this.f8902f = acVar;
        boolean a2 = acVar.a(context);
        if (!a2) {
            ae aeVar = new ae();
            this.f8902f = aeVar;
            a2 = aeVar.a(context);
        }
        if (!a2) {
            this.f8902f = null;
        }
        return a2;
    }

    @Override // com.vivo.push.util.e
    public final String a(String str, String str2) {
        e eVar;
        String str3 = f8899c.get(str);
        return (str3 != null || (eVar = this.f8902f) == null) ? str3 : eVar.a(str, str2);
    }
}
