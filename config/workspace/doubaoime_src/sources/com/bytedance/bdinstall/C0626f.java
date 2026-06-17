package com.bytedance.bdinstall;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.bdinstall.j0.a;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.crash.general.HardwareInfo;
import com.bytedance.crash.general.RomInfo;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.bdinstall.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0626f {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0645z f3979c;

    /* renamed from: f, reason: collision with root package name */
    private com.bytedance.bdinstall.util.j f3982f;
    private volatile boolean a = false;
    private int b = 36;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, String> f3980d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, String> f3981e = new ConcurrentHashMap();

    public C0626f(InterfaceC0645z interfaceC0645z) {
        this.f3979c = interfaceC0645z;
    }

    private static void b(Map<String, String> map, Map<String, String> map2, boolean z) {
        if (map != null) {
            try {
                if (map.isEmpty()) {
                    return;
                }
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (entry != null) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value) && (!z || !map2.containsKey(key))) {
                            map2.put(key, value);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public String a(Context context, StringBuilder sb, String str, boolean z, Level level) {
        boolean z2;
        com.bytedance.bdinstall.o0.c cVar;
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2)) {
            return sb2;
        }
        Uri parse = Uri.parse(sb2);
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        Uri.Builder buildUpon = parse.buildUpon();
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.b);
        linkedHashMap.put("device_platform", "android");
        linkedHashMap.put(RomInfo.KEY_OS_TYPE, com.bytedance.bdinstall.util.n.j() ? "harmony" : "android");
        try {
            if (com.bytedance.bdinstall.util.n.j()) {
                linkedHashMap.put("sub_os_api", String.valueOf(com.bytedance.bdinstall.util.r.a("hw_sc.build.os.apiversion")));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (z) {
            linkedHashMap.put("ssmix", "a");
        }
        linkedHashMap.put("_rticket", String.valueOf(System.currentTimeMillis()));
        Q m = ((C0632l) this.f3979c).m();
        Objects.requireNonNull(this.f3979c);
        String c2 = C0635o.c(m);
        TextUtils.isEmpty(c2);
        if (!TextUtils.isEmpty(c2)) {
            linkedHashMap.put("cdid", c2);
        }
        com.bytedance.bdinstall.util.k kVar = m != null ? new com.bytedance.bdinstall.util.k(m) : null;
        if (kVar != null) {
            String c3 = kVar.c();
            if (!TextUtils.isEmpty(c3)) {
                linkedHashMap.put("channel", c3);
            }
            linkedHashMap.put(WsConstants.KEY_APP_ID, String.valueOf(kVar.a()));
            String b = kVar.b();
            if (b != null) {
                linkedHashMap.put("app_name", b);
            } else {
                new IllegalArgumentException("app_name is null");
                int i = C0640u.a;
            }
            linkedHashMap.put("version_code", String.valueOf(kVar.g()));
            String f2 = kVar.f();
            if (f2 != null) {
                linkedHashMap.put("version_name", f2);
            }
            linkedHashMap.put("manifest_version_code", String.valueOf(kVar.d()));
            linkedHashMap.put("update_version_code", String.valueOf(kVar.e()));
        }
        InterfaceC0627g d2 = m != null ? m.d() : null;
        if (d2 == null) {
            d2 = null;
        }
        if (d2 != null) {
            String abVersion = d2.getAbVersion();
            if (!TextUtils.isEmpty(abVersion)) {
                linkedHashMap.put("ab_version", abVersion);
            }
            String abClient = d2.getAbClient();
            if (!TextUtils.isEmpty(abClient)) {
                linkedHashMap.put("ab_client", abClient);
            }
            String b2 = d2.b();
            if (!TextUtils.isEmpty(b2)) {
                linkedHashMap.put("ab_group", b2);
            }
            String abFeature = d2.getAbFeature();
            if (!TextUtils.isEmpty(abFeature)) {
                linkedHashMap.put("ab_feature", abFeature);
            }
            long abFlag = d2.getAbFlag();
            if (abFlag > 0) {
                linkedHashMap.put("abflag", String.valueOf(abFlag));
            }
        }
        if (m != null && (cVar = (com.bytedance.bdinstall.o0.c) com.bytedance.bdinstall.o0.d.a(com.bytedance.bdinstall.o0.c.class, String.valueOf(m.h()))) != null) {
            cVar.d(linkedHashMap);
        }
        String b3 = com.bytedance.bdinstall.util.u.b(context);
        if (!TextUtils.isEmpty(b3)) {
            linkedHashMap.put("resolution", b3);
        }
        int a = com.bytedance.bdinstall.util.u.a(context);
        if (a > 0) {
            linkedHashMap.put("dpi", String.valueOf(a));
        }
        String str2 = Build.BRAND;
        linkedHashMap.put("device_type", str2.equals("Pico") ? com.bytedance.bdinstall.util.n.b() : Build.MODEL);
        linkedHashMap.put(HardwareInfo.KEY_HW_VENDOR_BRAND, str2);
        linkedHashMap.put("language", Locale.getDefault().getLanguage());
        linkedHashMap.put(RomInfo.KEY_ROM_OS_API, String.valueOf(Build.VERSION.SDK_INT));
        try {
            String str3 = Build.VERSION.RELEASE;
            if (str3 != null && str3.length() > 10) {
                str3 = str3.substring(0, 10);
            }
            linkedHashMap.put(RomInfo.KEY_ROM_OS_VERSION, str3);
        } catch (Exception unused) {
        }
        com.bytedance.bdinstall.util.j jVar = this.f3982f;
        if (jVar != null) {
            String name = jVar.e().name();
            if (!TextUtils.isEmpty(name)) {
                linkedHashMap.put("ac", name);
                int i2 = C0640u.a;
            }
        } else {
            String d3 = NetworkUtils.d(context);
            if (!TextUtils.isEmpty(d3)) {
                linkedHashMap.put("ac", d3);
                int i3 = C0640u.a;
            }
        }
        b(this.f3980d, linkedHashMap, false);
        if (level == Level.L0) {
            b(this.f3981e, linkedHashMap, false);
        }
        boolean z3 = true;
        try {
            b(null, linkedHashMap, true);
        } catch (Exception unused2) {
            int i4 = C0640u.a;
        }
        boolean f3 = e0.f(context);
        P l = ((C0632l) this.f3979c).l();
        if (f3) {
            z2 = this.a;
            if (!z2 && (z2 = com.bytedance.bdinstall.util.g.d(context, m).getBoolean("_install_started_v2", false))) {
                this.a = true;
            }
        } else {
            z2 = (l == null || TextUtils.isEmpty(l.c()) || TextUtils.isEmpty(l.e())) ? false : true;
        }
        if (z2) {
            if (l != null) {
                if (!TextUtils.isEmpty(null)) {
                    linkedHashMap.put("klink_edi", null);
                }
                if (!TextUtils.isEmpty(null)) {
                    linkedHashMap.put("klink_eii", null);
                }
                if (!TextUtils.isEmpty(l.e())) {
                    linkedHashMap.put(WsConstants.KEY_INSTALL_ID, l.e());
                }
                if (!TextUtils.isEmpty(l.c())) {
                    linkedHashMap.put("device_id", l.c());
                }
                if (!TextUtils.isEmpty(l.d())) {
                    linkedHashMap.put("klink_egdi", l.d());
                }
                if (level == Level.L0) {
                    String f4 = l.f();
                    if (!TextUtils.isEmpty(f4)) {
                        linkedHashMap.put("openudid", f4);
                    }
                }
            }
            if (level == Level.L0) {
                if (m != null && !m.T()) {
                    String d4 = com.bytedance.bdinstall.util.o.d(context, m);
                    if (!TextUtils.isEmpty(d4)) {
                        linkedHashMap.put("mac_address", d4);
                    }
                    String b4 = com.bytedance.bdinstall.util.o.b(context, m);
                    int i5 = e0.f3978d;
                    if (!TextUtils.isEmpty(b4) && !b4.equalsIgnoreCase("unknown") && !b4.equalsIgnoreCase("None")) {
                        int i6 = 0;
                        while (true) {
                            if (i6 >= b4.length()) {
                                break;
                            }
                            if (b4.charAt(i6) != '0') {
                                z3 = false;
                                break;
                            }
                            i6++;
                        }
                    }
                    if (!z3) {
                        linkedHashMap.put("uuid", b4);
                    }
                }
                String a2 = com.bytedance.bdinstall.k0.a.c().a();
                if (!TextUtils.isEmpty(a2)) {
                    linkedHashMap.put("aliyun_uuid", a2);
                }
                if (f3) {
                    try {
                        String l2 = com.bytedance.bdinstall.m0.k.n(context).l();
                        if (!TextUtils.isEmpty(l2)) {
                            linkedHashMap.put("oaid", l2);
                        }
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
            }
        }
        if (m != null) {
            String i7 = m.i();
            int i8 = C0629i.f4007c;
            C0632l n = C0632l.n(i7);
            if (n != null) {
                boolean a3 = ((a.C0155a) n.e()).a();
                if (f3 && a3) {
                    com.bytedance.bdinstall.m0.k.n(context).m();
                }
            }
        }
        Objects.requireNonNull(this.f3979c);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str4 = (String) entry.getKey();
            String str5 = (String) entry.getValue();
            if (!queryParameterNames.contains(str4) && !TextUtils.isEmpty(str5)) {
                buildUpon.appendQueryParameter(str4, (String) entry.getValue());
            }
        }
        sb.delete(0, sb.length());
        sb.append(buildUpon.build().toString());
        this.b = linkedHashMap.size();
        return sb.toString();
    }

    public void c(com.bytedance.bdinstall.util.j jVar) {
        this.f3982f = jVar;
    }
}
