package com.bytedance.android.input.basic.applog.impl;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.bdinstall.C0633m;
import com.bytedance.bdinstall.J;
import com.bytedance.bdinstall.Q;
import com.ss.android.message.log.PushLog;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import kotlin.e;
import kotlin.s.c.l;
import kotlin.s.c.m;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {
    public static final b a = null;
    private static boolean b = true;

    /* renamed from: c, reason: collision with root package name */
    private static final e f2051c = kotlin.a.c(C0054b.a);

    public static final class a implements com.bytedance.applog.d {

        /* renamed from: com.bytedance.android.input.basic.applog.impl.b$a$a, reason: collision with other inner class name */
        public static final class C0053a implements J {
            C0053a() {
            }

            @Override // com.bytedance.bdinstall.J
            public String a(Context context, Q q) {
                Log.i("AppLogInitializer", "getMac hook: return null");
                return "";
            }

            @Override // com.bytedance.bdinstall.J
            public String b(Context context, Q q) {
                Log.i("AppLogInitializer", "getDefaultImeiOrMeid hook: return null");
                return "";
            }

            @Override // com.bytedance.bdinstall.J
            public String c(Context context, Q q) {
                Log.i("AppLogInitializer", "getSerial hook: return null");
                return "";
            }

            @Override // com.bytedance.bdinstall.J
            public String[] d(Context context, Q q) {
                Log.i("AppLogInitializer", "getSimSerialNumbers hook: return null");
                return new String[0];
            }

            @Override // com.bytedance.bdinstall.J
            public JSONArray e(Context context) {
                IAppGlobals.a aVar;
                Log.i("AppLogInitializer", "getIPV6Address hook");
                JSONArray jSONArray = new JSONArray();
                try {
                    aVar = IAppGlobals.a;
                    Objects.requireNonNull(aVar);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                if (aVar.C() && NetworkInterface.getNetworkInterfaces() != null) {
                    Iterator it2 = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
                    while (it2.hasNext()) {
                        NetworkInterface networkInterface = (NetworkInterface) it2.next();
                        String name = networkInterface.getName();
                        if ("dummy0".equals(name) || "wlan0".equals(name)) {
                            Iterator it3 = Collections.list(networkInterface.getInetAddresses()).iterator();
                            while (it3.hasNext()) {
                                String hostAddress = ((InetAddress) it3.next()).getHostAddress();
                                if (!TextUtils.isEmpty(hostAddress)) {
                                    if (!(hostAddress.indexOf(58) < 0)) {
                                        int indexOf = hostAddress.indexOf(37);
                                        if ("dummy0".equals(name)) {
                                            JSONObject jSONObject = new JSONObject();
                                            jSONObject.put("type", "client_tun");
                                            if (indexOf >= 0) {
                                                hostAddress = hostAddress.substring(0, indexOf);
                                            }
                                            jSONObject.put(PushLog.KEY_VALUE, hostAddress.toUpperCase());
                                            jSONArray.put(jSONObject);
                                        } else if ("wlan0".equals(name) || "fe80".equalsIgnoreCase(hostAddress.split("::")[0])) {
                                            JSONObject jSONObject2 = new JSONObject();
                                            jSONObject2.put("type", "client_anpi");
                                            if (indexOf >= 0) {
                                                hostAddress = hostAddress.substring(0, indexOf);
                                            }
                                            jSONObject2.put(PushLog.KEY_VALUE, hostAddress.toUpperCase());
                                            jSONArray.put(jSONObject2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    l.e(jSONArray, "getIPV6Address(context)");
                    return jSONArray;
                }
                jSONArray = new JSONArray();
                l.e(jSONArray, "getIPV6Address(context)");
                return jSONArray;
            }

            @Override // com.bytedance.bdinstall.J
            public String f(Context context, int i, Q q) {
                Log.i("AppLogInitializer", "getImei hook: return null");
                return "";
            }

            @Override // com.bytedance.bdinstall.J
            public String g(Context context, int i, Q q) {
                Log.i("AppLogInitializer", "getMeid hook: return null");
                return "";
            }
        }

        a() {
        }

        @Override // com.bytedance.applog.d
        public void a() {
        }

        @Override // com.bytedance.applog.d
        public void b(C0633m c0633m) {
            if (c0633m != null) {
                c0633m.C(new C0053a());
            }
        }
    }

    /* renamed from: com.bytedance.android.input.basic.applog.impl.b$b, reason: collision with other inner class name */
    static final class C0054b extends m implements kotlin.s.b.a<c> {
        public static final C0054b a = new C0054b();

        C0054b() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public c invoke() {
            return new c();
        }
    }

    public static final void b() {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        com.bytedance.applog.l lVar = new com.bytedance.applog.l("401734", d.a.b.a.c(aVar));
        Objects.requireNonNull(aVar);
        lVar.r("oime");
        lVar.A(0);
        lVar.w((c) f2051c.getValue());
        lVar.s(true);
        lVar.u(true);
        Objects.requireNonNull(aVar);
        long j = 100309006;
        lVar.C(j);
        Objects.requireNonNull(aVar);
        lVar.B("1.3.9");
        Objects.requireNonNull(aVar);
        lVar.z(j);
        Objects.requireNonNull(aVar);
        lVar.D(String.valueOf(6));
        lVar.v(false);
        StringBuilder sb = new StringBuilder();
        sb.append("initialize: versionCode: ");
        Objects.requireNonNull(aVar);
        sb.append(100309006);
        sb.append(", versionName: ");
        sb.append(lVar.m());
        sb.append(", updateVersionCode: ");
        sb.append(lVar.k());
        sb.append(", versionMinor: ");
        sb.append(lVar.o());
        aVar.j("AppLogInitializer", sb.toString());
        lVar.t(new a());
        Objects.requireNonNull(aVar);
        com.bytedance.applog.a.p(true);
        com.bytedance.applog.a.j(aVar.getApplication(), lVar);
        com.bytedance.applog.a.o(true);
        com.bytedance.applog.a.s(false);
    }

    public static final void c(boolean z) {
        b = z;
    }
}
