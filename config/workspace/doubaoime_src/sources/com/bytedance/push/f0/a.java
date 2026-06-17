package com.bytedance.push.f0;

import android.text.TextUtils;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.push.g0.f;
import com.bytedance.push.interfaze.u;
import com.bytedance.push.settings.LocalSettings;
import com.bytedance.push.settings.h;
import com.ss.android.message.e;
import com.ss.android.ug.bus.UgCallbackCenter;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    private static volatile a f5692d;
    private com.bytedance.common.push.e.a a;
    private String b = null;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f5693c = new AtomicBoolean(false);

    /* renamed from: com.bytedance.push.f0.a$a, reason: collision with other inner class name */
    class C0300a implements UgCallbackCenter.b<Object> {
        C0300a(a aVar) {
        }
    }

    class b implements UgCallbackCenter.b<Object> {
        b(a aVar) {
        }
    }

    class c implements UgCallbackCenter.b<Object> {
        c(a aVar) {
        }
    }

    class d implements Runnable {
        final /* synthetic */ com.bytedance.common.push.e.a a;
        final /* synthetic */ u b;

        d(com.bytedance.common.push.e.a aVar, u uVar) {
            this.a = aVar;
            this.b = uVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.common.push.e.a aVar = this.a;
            if (aVar == null || this.b == null) {
                return;
            }
            String a = aVar.a();
            if (a.this.b != null && TextUtils.equals(a, a.this.b)) {
                f.g("UidSync", "sdk has sync curUid,do nothing");
                return;
            }
            a.this.b = a;
            String m0 = ((LocalSettings) h.b(com.ss.android.message.a.a(), LocalSettings.class)).m0();
            f.g("UidSync", "repeat start,last_sec_uid=" + m0);
            f.g("UidSync", "repeat start,cur secUid=" + a);
            if (TextUtils.equals("init_sec_uid", m0)) {
                f.g("UidSync", "last sec_uid is INIT_SEC_UID,do nothing");
                return;
            }
            if (TextUtils.equals(a, m0)) {
                return;
            }
            f.g("UidSync", "find curUid update,force update token " + a);
            com.bytedance.common.push.d.b(new com.bytedance.push.d0.c(this.b, "passport_refresh"));
        }
    }

    public static a d() {
        if (f5692d == null) {
            synchronized (a.class) {
                if (f5692d == null) {
                    f5692d = new a();
                }
            }
        }
        return f5692d;
    }

    public void c(u uVar, com.bytedance.common.push.e.a aVar) {
        boolean h = com.ss.android.pushmanager.setting.c.c().g().h();
        f.g("UidSync", "[checkUidUpdate]enableBackUpTokenRefresh:" + h);
        if (!h) {
            f.g("UidSync", "[checkUidUpdate]do nothing because enableBackUpTokenRefresh is false");
        } else {
            f.g("UidSync", "[checkUidUpdate]check uid change after 3000ms");
            e.e().f(new d(aVar, uVar), WsConstants.EXIT_DELAY_TIME);
        }
    }

    public void e(u uVar, com.bytedance.common.push.e.a aVar) {
        f.g("UidSync", "[observerUidChangeEvent]");
        if (!this.f5693c.compareAndSet(false, true)) {
            f.g("UidSync", "[observerUidChangeEvent]do nothing because repeat invoke");
            return;
        }
        this.a = aVar;
        this.b = aVar.a();
        this.a.d(new C0300a(this));
        this.a.j(new b(this));
        this.a.s(new c(this));
    }
}
