package com.bytedance.push.settings.w;

import com.bytedance.push.settings.PushOnlineSettings;
import java.util.List;

/* loaded from: classes2.dex */
public class f {
    private static volatile f r;
    public boolean a;
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5859c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5860d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5861e;

    /* renamed from: f, reason: collision with root package name */
    public List<String> f5862f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5863g;
    public boolean h;
    public boolean i;
    public boolean j;
    public List<List<String>> k;
    public List<String> l;
    public List<String> m;
    public List<l> n;
    public long o;
    public List<String> p;
    public List<String> q;

    public static f a() {
        if (r == null) {
            synchronized (f.class) {
                if (r == null) {
                    r = ((PushOnlineSettings) com.bytedance.push.settings.h.b(com.ss.android.message.a.a(), PushOnlineSettings.class)).p();
                }
            }
        }
        return r;
    }
}
