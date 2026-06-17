package com.ss.android.pushmanager.setting;

import com.bytedance.android.service.manager.push.settings.ISettingsUpdateListener;
import com.bytedance.push.settings.LocalSettings;
import com.bytedance.push.settings.PushOnlineSettings;
import com.bytedance.push.settings.h;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static c f8372c;
    private final Set<ISettingsUpdateListener> a = new HashSet();
    private Boolean b = null;

    private c() {
        PushMultiProcessSharedProvider.e(com.ss.android.message.a.a());
    }

    public static c c() {
        if (f8372c == null) {
            synchronized (c.class) {
                if (f8372c == null) {
                    f8372c = new c();
                }
            }
        }
        return f8372c;
    }

    public boolean a() {
        Boolean bool = this.b;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(g().i());
        this.b = valueOf;
        return valueOf.booleanValue();
    }

    public String b() {
        a a = a.a();
        Objects.requireNonNull(a);
        HashMap hashMap = new HashMap();
        a.b(hashMap);
        return (String) hashMap.get("device_id");
    }

    public String d() {
        return e().P();
    }

    public LocalSettings e() {
        return (LocalSettings) h.b(com.ss.android.message.a.a(), LocalSettings.class);
    }

    public String f() {
        return e().n();
    }

    public PushOnlineSettings g() {
        return (PushOnlineSettings) h.b(com.ss.android.message.a.a(), PushOnlineSettings.class);
    }

    public Object[] h() {
        Object[] array;
        synchronized (this.a) {
            array = this.a.toArray();
        }
        return array;
    }

    public boolean i() {
        return e().v0() && g().A();
    }

    public void j(ISettingsUpdateListener iSettingsUpdateListener) {
        synchronized (this.a) {
            this.a.add(iSettingsUpdateListener);
        }
    }

    public void k(ISettingsUpdateListener iSettingsUpdateListener) {
        synchronized (this.a) {
            this.a.remove(iSettingsUpdateListener);
        }
    }
}
