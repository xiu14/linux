package com.bytedance.common.wschannel;

import android.app.Application;
import com.bytedance.common.wschannel.c;
import com.bytedance.common.wschannel.client.m;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class j {
    private static com.bytedance.common.wschannel.client.j a = new m();
    private static Map<Integer, f> b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private static AtomicBoolean f4259c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f4260d = 0;

    /* JADX INFO: Access modifiers changed from: private */
    static class a implements c.InterfaceC0179c {
        private final Application a;

        a(Application application) {
            this.a = application;
        }

        @Override // com.bytedance.common.wschannel.c.InterfaceC0179c
        public void a() {
            if (j.f4259c.get()) {
                ((m) j.a).b(this.a);
            }
        }

        @Override // com.bytedance.common.wschannel.c.InterfaceC0179c
        public void b() {
            if (j.f4259c.get()) {
                ((m) j.a).c(this.a);
            }
        }
    }

    static f c(int i) {
        return b.get(Integer.valueOf(i));
    }
}
