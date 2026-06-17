package com.bytedance.android.input.basic.settings.impl;

import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.news.common.settings.SettingsConfigProvider;
import com.bytedance.news.common.settings.a;
import com.bytedance.news.common.settings.b;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class SettingsConfigProviderImpl implements SettingsConfigProvider {
    public static final a Companion = new a(null);
    private static final String TAG = "Settings_SettingsConfigProvider";

    public static final class a {
        public a(kotlin.s.c.g gVar) {
        }
    }

    @Override // com.bytedance.news.common.settings.SettingsConfigProvider
    public com.bytedance.news.common.settings.a getConfig() {
        IAppGlobals.a aVar = IAppGlobals.a;
        boolean equals = aVar.getApplication().getPackageName().equals(d.a.b.a.d());
        a.b bVar = new a.b();
        bVar.b(aVar.getApplication());
        bVar.d(new g());
        bVar.c(equals);
        com.bytedance.news.common.settings.a a2 = bVar.a();
        l.e(a2, "config");
        return a2;
    }

    @Override // com.bytedance.news.common.settings.SettingsConfigProvider
    public com.bytedance.news.common.settings.b getLazyConfig() {
        b.C0281b c0281b = new b.C0281b();
        Objects.requireNonNull(IAppGlobals.a);
        c0281b.b(String.valueOf(100309006));
        com.bytedance.news.common.settings.b a2 = c0281b.a();
        l.e(a2, "lazyConfig");
        return a2;
    }
}
