package com.obric.common.upgrade.util;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.s.c.g;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final a f7600c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static volatile d f7601d;
    private final SharedPreferences a;
    private final SharedPreferences.Editor b;

    @SourceDebugExtension({"SMAP\nSharedPreferencesUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedPreferencesUtils.kt\ncom/obric/common/upgrade/util/SharedPreferencesUtils$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n1#2:119\n*E\n"})
    public static final class a {
        public a(g gVar) {
        }

        public final d a(Context context, String str) {
            l.f(context, "context");
            l.f(str, "name");
            d dVar = d.f7601d;
            if (dVar == null) {
                synchronized (this) {
                    dVar = d.f7601d;
                    if (dVar == null) {
                        dVar = new d(context, str, null);
                        d.f7601d = dVar;
                    }
                }
            }
            return dVar;
        }
    }

    public d(Context context, String str, g gVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        l.e(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
        this.a = sharedPreferences;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        l.e(edit, "sharedPreferences.edit()");
        this.b = edit;
    }

    public final boolean c(String str, boolean z) {
        l.f(str, "key");
        return this.a.getBoolean(str, z);
    }

    public final long d(String str, long j) {
        l.f(str, "key");
        return this.a.getLong(str, j);
    }

    public final void e(String str, boolean z) {
        l.f(str, "key");
        this.b.putBoolean(str, z).apply();
    }

    public final void f(String str, long j) {
        l.f(str, "key");
        this.b.putLong(str, j).apply();
    }
}
