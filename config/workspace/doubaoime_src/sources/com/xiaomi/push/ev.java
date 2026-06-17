package com.xiaomi.push;

import android.os.Build;
import android.text.TextUtils;
import com.xiaomi.push.a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class ev {
    public final int a;

    /* renamed from: a, reason: collision with other field name */
    private a.AbstractBinderC0410a f407a;

    /* renamed from: a, reason: collision with other field name */
    private Boolean f408a;

    /* renamed from: a, reason: collision with other field name */
    private Object f409a;

    /* renamed from: a, reason: collision with other field name */
    private final CopyOnWriteArraySet<b> f410a;

    /* renamed from: a, reason: collision with other field name */
    private AtomicReference<Integer> f411a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9083c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9084d;

    private static class a {
        private static final ev a = new ev();
    }

    public interface b {
        void a(String str);
    }

    protected void a(b bVar) {
        if (bVar == null) {
            return;
        }
        this.f410a.add(bVar);
    }

    public boolean b() {
        return this.f411a.get() != null && this.f411a.get().intValue() >= 1;
    }

    private ev() {
        this.a = -1;
        this.b = -2;
        this.f9083c = -3;
        this.f9084d = -4;
        this.f408a = Boolean.FALSE;
        this.f411a = new AtomicReference<>();
        this.f410a = new CopyOnWriteArraySet<>();
        try {
            if (!k.m655a(t.m841a())) {
                com.xiaomi.channel.commonutils.logger.c.m15a("[Proxy] NO XMSF NO Support");
                return;
            }
            if (TextUtils.equals(Build.PRODUCT, "xuanyuan")) {
                return;
            }
            Object a2 = bh.a("miui.telephony.TelephonyManagerEx", "getDefault", new Object[0]);
            this.f409a = a2;
            if (a2 == null) {
                com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[Proxy] TelephonyManagerEx does not exist");
                return;
            }
            Object a3 = bh.a(a2, "isModemTcpKaSupported", new Object[0]);
            if (a3 instanceof Boolean) {
                this.f408a = (Boolean) a3;
            }
            com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[Proxy] hardware heartbeat supportability:" + this.f408a);
            if (this.f408a.booleanValue()) {
                a.AbstractBinderC0410a abstractBinderC0410a = new a.AbstractBinderC0410a() { // from class: com.xiaomi.push.ev.1
                    @Override // com.xiaomi.push.a
                    public void a(String str) {
                        ev.this.a(str);
                    }
                };
                this.f407a = abstractBinderC0410a;
                bh.a(this.f409a, "registerModemTcpKaCallback", abstractBinderC0410a);
            }
            Object a4 = bh.a(this.f409a, "getTcpKeepAliveFeatureSupportVersion", new Object[0]);
            if (a4 instanceof Integer) {
                this.f411a.set((Integer) a4);
            }
        } catch (Throwable th) {
            e.a.a.a.a.w0("[Proxy] exception occurred when proxy TME init, exception: ", th, "HwKaMgr");
        }
    }

    protected void a(String str) {
        Iterator<b> it2 = this.f410a.iterator();
        while (it2.hasNext()) {
            it2.next().a(str);
        }
    }

    public int b(int i) {
        try {
            if (!m371a()) {
                com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[Proxy] not support modem keep alive when stop tcp keep alive");
                return -1;
            }
            Object a2 = bh.a(this.f409a, "stopTcpKeepAlive", Integer.valueOf(i));
            if (a2 instanceof Integer) {
                return ((Integer) a2).intValue();
            }
            return -3;
        } catch (Throwable th) {
            e.a.a.a.a.w0("[Proxy] exception occurred in stopping tcp keep alive, exception: ", th, "HwKaMgr");
            return -4;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m371a() {
        return this.f408a.booleanValue();
    }

    /* renamed from: a, reason: collision with other method in class */
    public Integer m370a() {
        return this.f411a.get();
    }

    public final int a(String str, int i, String str2, int i2, int i3) {
        try {
            if (!m371a()) {
                com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[Proxy] not support modem keep alive when start tcp monitor register");
                return -1;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && i >= 0 && i <= 65535 && i2 >= 0 && i2 <= 65535) {
                Object a2 = bh.a(this.f409a, "startTcpMonitorRegister", str, Integer.valueOf(i), str2, Integer.valueOf(i2), Integer.valueOf(i3));
                if (a2 instanceof Integer) {
                    return ((Integer) a2).intValue();
                }
                return -3;
            }
            com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[Proxy] illegal ip address/port when start tcp monitor register");
            return -2;
        } catch (Throwable th) {
            e.a.a.a.a.w0("[Proxy] exception occurred in starting tcp monitor register, exception: ", th, "HwKaMgr");
            return -4;
        }
    }

    public final int a(int i) {
        try {
            if (!m371a()) {
                com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[Proxy] not support modem keep alive when stop tcp monitor register");
                return -1;
            }
            Object a2 = bh.a(this.f409a, "stopTcpMonitorRegister", Integer.valueOf(i));
            if (a2 instanceof Integer) {
                return ((Integer) a2).intValue();
            }
            return -3;
        } catch (Throwable th) {
            e.a.a.a.a.w0("[Proxy] exception occurred in stopping tcp monitor register, exception: ", th, "HwKaMgr");
            return -4;
        }
    }

    public int a(String str, int i, String str2, int i2, int i3, int i4) {
        try {
            if (!m371a()) {
                com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[Proxy] not support modem keep alive when start tcp keep alive");
                return -1;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && i >= 0 && i <= 65535 && i2 >= 0 && i2 <= 65535) {
                Object a2 = bh.a(this.f409a, "startTcpKeepAlive", str, Integer.valueOf(i), str2, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
                if (a2 instanceof Integer) {
                    return ((Integer) a2).intValue();
                }
                return -3;
            }
            com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[Proxy] illegal ip address/port when start tcp keep alive");
            return -2;
        } catch (Throwable th) {
            e.a.a.a.a.w0("[Proxy] exception occurred in starting tcp keep alive, exception: ", th, "HwKaMgr");
            return -4;
        }
    }

    public static ev a() {
        return a.a;
    }
}
