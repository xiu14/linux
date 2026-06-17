package com.google.gson.internal.sql;

import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.t;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes2.dex */
public final class a {
    public static final boolean a;
    public static final DefaultDateTypeAdapter.b<? extends Date> b;

    /* renamed from: c, reason: collision with root package name */
    public static final DefaultDateTypeAdapter.b<? extends Date> f6823c;

    /* renamed from: d, reason: collision with root package name */
    public static final t f6824d;

    /* renamed from: e, reason: collision with root package name */
    public static final t f6825e;

    /* renamed from: f, reason: collision with root package name */
    public static final t f6826f;

    /* renamed from: com.google.gson.internal.sql.a$a, reason: collision with other inner class name */
    class C0337a extends DefaultDateTypeAdapter.b<java.sql.Date> {
        C0337a(Class cls) {
            super(cls);
        }

        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.b
        protected java.sql.Date b(Date date) {
            return new java.sql.Date(date.getTime());
        }
    }

    class b extends DefaultDateTypeAdapter.b<Timestamp> {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.b
        protected Timestamp b(Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        if (z) {
            b = new C0337a(java.sql.Date.class);
            f6823c = new b(Timestamp.class);
            f6824d = SqlDateTypeAdapter.b;
            f6825e = SqlTimeTypeAdapter.b;
            f6826f = SqlTimestampTypeAdapter.b;
            return;
        }
        b = null;
        f6823c = null;
        f6824d = null;
        f6825e = null;
        f6826f = null;
    }
}
