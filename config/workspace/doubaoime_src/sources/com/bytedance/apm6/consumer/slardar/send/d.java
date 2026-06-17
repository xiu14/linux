package com.bytedance.apm6.consumer.slardar.send;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.apm.doctor.DoctorManager;
import com.bytedance.apm6.consumer.slardar.send.DropDataMonitor;
import com.bytedance.apm6.consumer.slardar.send.b;
import com.bytedance.apm6.consumer.slardar.send.downgrade.DowngradeInfo;
import com.bytedance.services.apm.api.i;
import com.bytedance.services.apm.api.j;
import com.bytedance.services.slardar.config.IConfigManager;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {
    private static HashMap<e, d> j = new HashMap<>();
    private static volatile int k;
    private String a;
    private volatile boolean b;

    /* renamed from: c, reason: collision with root package name */
    private int f3639c;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f3641e;

    /* renamed from: f, reason: collision with root package name */
    private List<String> f3642f;

    /* renamed from: g, reason: collision with root package name */
    private i f3643g;
    private j h;

    /* renamed from: d, reason: collision with root package name */
    private String f3640d = null;
    private int i = 0;

    private d(e eVar) {
        this.f3642f = eVar.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private e.b.b.m.f.a b(java.lang.String r11, byte[] r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm6.consumer.slardar.send.d.b(java.lang.String, byte[], boolean):e.b.b.m.f.a");
    }

    private String c(byte[] bArr, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(Base64.decode(bArr, 0))).replaceAll("\\$+$", "");
        } catch (Throwable th) {
            if (e.b.b.n.a.b()) {
                List<String> list = e.b.b.e.a.a.a;
                e.b.b.n.g.b.c("APM-Slardar", "decodeData", th);
            }
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
    
        r8 = new org.json.JSONObject();
        r8.put("message", "success");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0098, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.json.JSONObject d(com.bytedance.services.apm.api.c r8) {
        /*
            r7 = this;
            java.lang.String r0 = "success"
            java.lang.String r1 = "message"
            r2 = 0
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> La3
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Exception -> La3
            byte[] r5 = r8.b()     // Catch: java.lang.Exception -> La3
            r4.<init>(r5)     // Catch: java.lang.Exception -> La3
            r3.<init>(r4)     // Catch: java.lang.Exception -> La3
            java.util.Map r8 = r8.a()     // Catch: java.lang.Exception -> La3
            if (r8 == 0) goto L37
            boolean r4 = r8.isEmpty()     // Catch: java.lang.Exception -> La3
            if (r4 != 0) goto L37
            java.lang.String r4 = "ran"
            java.lang.Object r4 = r8.get(r4)     // Catch: java.lang.Exception -> La3
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> La3
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> La3
            if (r5 == 0) goto L38
            java.lang.String r4 = "Ran"
            java.lang.Object r8 = r8.get(r4)     // Catch: java.lang.Exception -> La3
            r4 = r8
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> La3
            goto L38
        L37:
            r4 = r2
        L38:
            r8 = 1
            java.lang.String r5 = "data"
            java.lang.String r5 = r3.optString(r5)     // Catch: java.lang.Throwable -> L9a
            boolean r6 = r5.isEmpty()     // Catch: java.lang.Throwable -> L9a
            if (r6 != 0) goto L6d
            boolean r3 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L9a
            if (r3 != 0) goto L5f
            byte[] r3 = r5.getBytes()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r3 = r7.c(r3, r4)     // Catch: java.lang.Throwable -> L9a
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L9a
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L9a
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L9a
            r8 = r8 ^ r3
            r3 = r4
            goto L6d
        L5f:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L9a
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L9a
            byte[] r5 = r5.getBytes()     // Catch: java.lang.Throwable -> L9a
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L9a
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L9a
        L6d:
            boolean r4 = e.b.b.n.b.c(r3)     // Catch: java.lang.Throwable -> L9a
            if (r4 == 0) goto L74
            goto L8e
        L74:
            java.lang.String r4 = "configs"
            org.json.JSONObject r4 = r3.optJSONObject(r4)     // Catch: java.lang.Throwable -> L9a
            boolean r5 = e.b.b.n.b.c(r4)     // Catch: java.lang.Throwable -> L9a
            if (r5 == 0) goto L81
            goto L8e
        L81:
            java.lang.Class<e.b.b.e.a.g> r5 = e.b.b.e.a.g.class
            java.lang.Object r5 = e.b.b.m.c.a(r5)     // Catch: java.lang.Throwable -> L9a
            e.b.b.e.a.g r5 = (e.b.b.e.a.g) r5     // Catch: java.lang.Throwable -> L9a
            if (r5 == 0) goto L8e
            r5.a(r4)     // Catch: java.lang.Throwable -> L9a
        L8e:
            if (r8 != 0) goto L99
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L9a
            r8.<init>()     // Catch: java.lang.Throwable -> L9a
            r8.put(r1, r0)     // Catch: java.lang.Throwable -> L9a
            return r8
        L99:
            return r3
        L9a:
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Exception -> La3
            r8.<init>()     // Catch: java.lang.Exception -> La3
            r8.put(r1, r0)     // Catch: java.lang.Exception -> La3
            return r8
        La3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm6.consumer.slardar.send.d.d(com.bytedance.services.apm.api.c):org.json.JSONObject");
    }

    public static d e(e eVar) {
        if (j.containsKey(eVar)) {
            return j.get(eVar);
        }
        j.put(eVar, new d(eVar));
        return j.get(eVar);
    }

    private String f() {
        List<String> list = this.f3642f;
        if (!TextUtils.isEmpty(this.a)) {
            if (list != null && list.size() > 0) {
                try {
                    return "https://" + this.a + new URL(list.get(0)).getPath();
                } catch (Throwable unused) {
                }
            }
            return null;
        }
        if (!TextUtils.isEmpty(this.f3640d)) {
            return this.f3640d;
        }
        if (this.b) {
            this.f3639c++;
        }
        int size = list.size();
        int i = this.f3639c;
        if (size > i && i >= 0) {
            return list.get(i);
        }
        this.f3639c = 0;
        return list.get(0);
    }

    public static void h(int i) {
        if (i == 2) {
            if (System.currentTimeMillis() - e.b.b.n.a.a().getSharedPreferences("dict_interval", 0).getLong("force_zstd_timestamp", 0L) <= 3600000) {
                k = 1;
                return;
            }
        }
        k = i;
    }

    byte[] a(byte[] bArr) throws JSONException {
        JSONObject jSONObject = new JSONObject(new String(bArr));
        IConfigManager iConfigManager = (IConfigManager) com.bytedance.news.common.service.manager.c.a(IConfigManager.class);
        if (iConfigManager != null) {
            JSONObject retrieveSettingsParams = iConfigManager.retrieveSettingsParams();
            JSONObject jSONObject2 = new JSONObject();
            String valueOf = String.valueOf(e.b.b.h.c.a.f());
            if (!TextUtils.isEmpty(valueOf) && !valueOf.equals("0")) {
                jSONObject2.put(valueOf, retrieveSettingsParams);
                jSONObject.put("settings_params", jSONObject2);
            }
        }
        return jSONObject.toString().getBytes();
    }

    boolean g(byte[] bArr) {
        byte[] bArr2;
        boolean equals;
        boolean z;
        DropDataMonitor dropDataMonitor;
        DropDataMonitor dropDataMonitor2;
        IConfigManager iConfigManager;
        JSONObject optJSONObject;
        if (bArr == null || bArr.length == 0) {
            return true;
        }
        try {
            String f2 = f();
            if (this.h == null) {
                this.h = (j) e.b.b.m.c.a(j.class);
            }
            if (this.h != null) {
                try {
                    this.h.b(new URL(f2).getHost());
                } catch (MalformedURLException unused) {
                }
            }
            try {
                bArr2 = a(bArr);
            } catch (JSONException e2) {
                com.bytedance.services.apm.api.a.e(e2, "NetworkSender->sendLog(byte[] bytes)");
                List<String> list = e.b.b.e.a.a.a;
                e.b.b.n.g.b.b("APM-Slardar", " appendSettingsParams wrong ");
                bArr2 = bArr;
            }
            e.b.b.m.f.a b = b(f2, bArr2, false);
            if (e.b.b.n.a.b()) {
                DoctorManager.getInstance().b("APM_SEND_DATA", "url:" + b.a + " header:" + b.b);
                List<String> list2 = e.b.b.e.a.a.a;
                e.b.b.n.g.b.a("APM-Slardar", "sendLog createRequest: origin Bytes=" + bArr2.length + " compressed Bytes=" + b.f9492c.length + " url=" + b.a + " headers=" + b.b);
            }
            com.bytedance.services.apm.api.c e3 = e.b.b.h.c.a.e(b.a, b.b, b.f9492c);
            if (e.b.b.n.a.b()) {
                List<String> list3 = e.b.b.e.a.a.a;
                StringBuilder sb = new StringBuilder();
                sb.append("http result:");
                sb.append(e3 == null ? -1 : e3.c() + " header:" + e3.a());
                e.b.b.n.g.b.a("APM-Slardar", sb.toString());
            }
            this.a = null;
            this.f3640d = null;
            if (e3 != null && e3.c() > 0) {
                this.b = false;
                if (500 <= e3.c() && e3.c() <= 600) {
                    Boolean bool = this.f3641e;
                    if (bool != null && bool.booleanValue()) {
                        b.C0133b.a.l();
                    }
                    this.f3641e = Boolean.TRUE;
                    return false;
                }
                JSONObject d2 = d(e3);
                if (d2 != null && e3.c() == 200) {
                    String optString = d2.optString("message");
                    String optString2 = d2.optString("redirect");
                    long optLong = d2.optLong("delay");
                    if (d2.optLong("server_code", 0L) == 10001 && k == 2 && this.f3643g != null && this.i == 0) {
                        k = 1;
                        e.b.b.n.a.a().getSharedPreferences("dict_interval", 0).edit().putLong("dict_interval", 0L).putLong("force_zstd_timestamp", System.currentTimeMillis()).commit();
                        this.i++;
                        boolean g2 = g(bArr2);
                        this.i--;
                        return g2;
                    }
                    JSONObject optJSONObject2 = d2.optJSONObject("settings_info");
                    if (optJSONObject2 != null && (iConfigManager = (IConfigManager) com.bytedance.news.common.service.manager.c.a(IConfigManager.class)) != null && (optJSONObject = optJSONObject2.optJSONObject(String.valueOf(e.b.b.h.c.a.f()))) != null) {
                        iConfigManager.updateWithSpecificAidResult(optJSONObject);
                    }
                    if ("success".equals(optString)) {
                        b.C0133b.a.n();
                        this.f3640d = f2;
                        this.f3641e = Boolean.FALSE;
                        z = true;
                        equals = false;
                    } else {
                        this.f3641e = Boolean.TRUE;
                        equals = "drop data".equals(optString);
                        if (e.b.b.n.a.b()) {
                            List<String> list4 = e.b.b.e.a.a.a;
                            e.b.b.n.g.b.a("APM-Slardar", "responseMessage:" + optString);
                        }
                        z = false;
                    }
                    try {
                        if (e.b.b.n.a.b()) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("RESPONSE_DATA_URL", b.a);
                            if (e3.a() != null) {
                                JSONObject jSONObject2 = new JSONObject();
                                for (Map.Entry<String, String> entry : e3.a().entrySet()) {
                                    try {
                                        if (entry.getKey() != null) {
                                            jSONObject2.put(entry.getKey(), entry.getValue());
                                        }
                                    } catch (Throwable unused2) {
                                    }
                                }
                                jSONObject.put("RESPONSE_DATA_HEADERS", jSONObject2);
                            }
                            jSONObject.put("RESPONSE_DATA_BODY_TEXT", d2);
                            com.bytedance.apm.doctor.a.g(bArr2, jSONObject);
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    JSONObject optJSONObject3 = d2.optJSONObject("downgrade_rule");
                    if (optJSONObject3 != null) {
                        com.bytedance.apm6.consumer.slardar.send.downgrade.a.a().c(DowngradeInfo.a(optJSONObject3), true);
                    }
                    this.a = optString2;
                    if (optLong > 0) {
                        b.C0133b.a.a(optLong);
                    }
                    if (equals) {
                        b.C0133b.a.b();
                        if (e3.a() != null) {
                            dropDataMonitor2 = DropDataMonitor.a.a;
                            dropDataMonitor2.d(e3.a().get("x-tt-logid"));
                        }
                        dropDataMonitor = DropDataMonitor.a.a;
                        dropDataMonitor.e(System.currentTimeMillis());
                    } else {
                        b.C0133b.a.m();
                    }
                    return z;
                }
                this.f3641e = Boolean.TRUE;
                return false;
            }
            this.b = true;
            Boolean bool2 = this.f3641e;
            if (bool2 != null && bool2.booleanValue()) {
                b.C0133b.a.s();
            }
            this.f3641e = Boolean.TRUE;
            return false;
        } catch (Throwable th2) {
            List<String> list5 = e.b.b.e.a.a.a;
            e.b.b.n.g.b.c("APM-Slardar", "sendLog failed.", th2);
            return false;
        }
    }
}
