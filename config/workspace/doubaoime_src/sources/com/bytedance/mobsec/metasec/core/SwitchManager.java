package com.bytedance.mobsec.metasec.core;

import androidx.annotation.Keep;
import com.bytedance.mobsec.metasec.ml.b;
import com.prolificinteractive.materialcalendarview.r;
import java.util.concurrent.atomic.AtomicBoolean;
import ms.bd.c.y2;

/* loaded from: classes.dex */
public class SwitchManager {

    /* renamed from: d, reason: collision with root package name */
    private static volatile SwitchManager f5399d;
    private volatile b.a.InterfaceC0276b a;
    private volatile b.a.InterfaceC0275a b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f5400c = new AtomicBoolean(false);

    public interface OnSwitchUpdatedCallback {
        @Keep
        void call(boolean z);
    }

    private SwitchManager() {
    }

    public static SwitchManager a() {
        if (f5399d == null) {
            synchronized (SwitchManager.class) {
                if (f5399d == null) {
                    f5399d = new SwitchManager();
                }
            }
        }
        return f5399d;
    }

    @Keep
    private boolean checkAppSettingsUpdate() {
        if (this.b == null) {
            return false;
        }
        return this.b.a();
    }

    @Keep
    private String getAppSettings(String str) {
        if (this.a == null) {
            return "";
        }
        String a = this.a.a(str);
        return a;
    }

    public final boolean b(int i) {
        if (this.f5400c.get()) {
            return ((Boolean) y2.a(167772161, i, 0L, null, null)).booleanValue();
        }
        r.m((String) y2.a(16777217, 0, 0L, "5edebe", new byte[]{55, 112, 77, 81, 24, 118, 118, 87, 44, 59, 39, 39, 20, 16, 81, 126, 118, 80, 58, 58, 100, 98, 22, 3, 81, 107, 122, 4, 6, 34, 45, 115, 20, 25, 112, 115, 56, 69, 50, 48, 54, 39, 30, 2, 29, 124, 57, 80, 117, 60, 42, 110, 3, 24, 92, 126, 63, 94, 48, 49, 100, 126, 18, 5, 19, 50, 6, 72, 48, 52, 55, 98, 87, 18, 92, 126, 58, 4, 38, 48, 48, 114, 7, 33, 79, 125, 46, 93, 117, 51, 45, 117, 4, 5, 19}), Integer.valueOf(i));
        return false;
    }
}
