package com.xiaomi.push;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.vivo.push.PushClient;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ct {
    protected static Context a;

    /* renamed from: a, reason: collision with other field name */
    private static a f196a;

    /* renamed from: a, reason: collision with other field name */
    private static ct f197a;

    /* renamed from: c, reason: collision with root package name */
    private static String f9019c;

    /* renamed from: d, reason: collision with root package name */
    private static String f9020d;

    /* renamed from: a, reason: collision with other field name */
    private long f199a;

    /* renamed from: a, reason: collision with other field name */
    private cs f200a;

    /* renamed from: a, reason: collision with other field name */
    protected b f201a;

    /* renamed from: a, reason: collision with other field name */
    private String f202a;

    /* renamed from: a, reason: collision with other field name */
    protected final Map<String, cq> f203a;

    /* renamed from: b, reason: collision with other field name */
    private final long f204b;

    /* renamed from: b, reason: collision with other field name */
    private String f205b;

    /* renamed from: c, reason: collision with other field name */
    private long f206c;
    protected static final Map<String, cp> b = new HashMap();

    /* renamed from: a, reason: collision with other field name */
    protected static boolean f198a = false;

    public interface a {
        ct a(Context context, cs csVar, b bVar, String str);
    }

    public interface b {
        String a(String str);
    }

    protected ct(Context context, cs csVar, b bVar, String str) {
        this(context, csVar, bVar, str, null, null);
    }

    public static synchronized ct a() {
        ct ctVar;
        synchronized (ct.class) {
            ctVar = f197a;
            if (ctVar == null) {
                throw new IllegalStateException("the host manager is not initialized yet.");
            }
        }
        return ctVar;
    }

    private String f() {
        return "host_fallbacks";
    }

    private String g() {
        try {
            PackageInfo packageInfo = a.getPackageManager().getPackageInfo(a.getPackageName(), 16384);
            return packageInfo != null ? packageInfo.versionName : "0";
        } catch (Exception unused) {
            return "0";
        }
    }

    public cp b(String str) {
        return a(str, true);
    }

    protected String b() {
        return "resolver.msg.xiaomi.net";
    }

    protected cp c(String str) {
        cq cqVar;
        cp a2;
        synchronized (this.f203a) {
            m182a();
            cqVar = this.f203a.get(str);
        }
        if (cqVar == null || (a2 = cqVar.a()) == null) {
            return null;
        }
        return a2;
    }

    public cp d(String str) {
        cp cpVar;
        Map<String, cp> map = b;
        synchronized (map) {
            cpVar = map.get(str);
        }
        return cpVar;
    }

    protected cp e(String str) {
        if (System.currentTimeMillis() - this.f206c <= this.f199a * 60 * 1000) {
            return null;
        }
        this.f206c = System.currentTimeMillis();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str);
        cp cpVar = a(arrayList).get(0);
        if (cpVar != null) {
            this.f199a = 0L;
            return cpVar;
        }
        long j = this.f199a;
        if (j >= 15) {
            return null;
        }
        this.f199a = j + 1;
        return null;
    }

    protected ct(Context context, cs csVar, b bVar, String str, String str2, String str3) {
        this.f203a = new HashMap();
        this.f202a = "0";
        this.f199a = 0L;
        this.f204b = 15L;
        this.f206c = 0L;
        this.f205b = "isp_prov_city_country_ip";
        this.f201a = bVar;
        if (csVar == null) {
            this.f200a = new cs() { // from class: com.xiaomi.push.ct.1
                @Override // com.xiaomi.push.cs
                public boolean a(String str4) {
                    return true;
                }
            };
        } else {
            this.f200a = csVar;
        }
        this.f202a = str;
        f9019c = str2 == null ? context.getPackageName() : str2;
        f9020d = str3 == null ? g() : str3;
    }

    /* renamed from: b, reason: collision with other method in class */
    public void m183b() {
        ArrayList<String> arrayList;
        synchronized (this.f203a) {
            m182a();
            arrayList = new ArrayList<>(this.f203a.keySet());
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                cq cqVar = this.f203a.get(arrayList.get(size));
                if (cqVar != null && cqVar.a() != null) {
                    arrayList.remove(size);
                }
            }
        }
        ArrayList<cp> a2 = a(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            if (a2.get(i) != null) {
                a(arrayList.get(i), a2.get(i));
            }
        }
    }

    public static synchronized void a(a aVar) {
        synchronized (ct.class) {
            f196a = aVar;
            f197a = null;
        }
    }

    protected String d() {
        BufferedInputStream bufferedInputStream;
        FileInputStream fileInputStream;
        File file;
        try {
            file = new File(a.getFilesDir(), f());
        } catch (Throwable th) {
            th = th;
            bufferedInputStream = null;
            fileInputStream = null;
        }
        if (file.isFile()) {
            fileInputStream = new FileInputStream(file);
            try {
                bufferedInputStream = new BufferedInputStream(fileInputStream);
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = null;
            }
            try {
                String str = new String(i.a(m177a(), y.a((InputStream) bufferedInputStream)), StandardCharsets.UTF_8);
                com.xiaomi.channel.commonutils.logger.c.b("load host fallbacks = " + str);
                return str;
            } catch (Throwable th3) {
                th = th3;
                try {
                    com.xiaomi.channel.commonutils.logger.c.m15a("load host exception " + th.getMessage());
                    return null;
                } finally {
                    y.a((Closeable) bufferedInputStream);
                    y.a((Closeable) fileInputStream);
                }
            }
        }
        y.a((Closeable) null);
        y.a((Closeable) null);
        return null;
    }

    public static synchronized void a(Context context, cs csVar, b bVar, String str, String str2, String str3) {
        synchronized (ct.class) {
            Context applicationContext = context.getApplicationContext();
            a = applicationContext;
            if (applicationContext == null) {
                a = context;
            }
            if (f197a == null) {
                a aVar = f196a;
                if (aVar == null) {
                    f197a = new ct(context, csVar, bVar, str, str2, str3);
                } else {
                    f197a = aVar.a(context, csVar, bVar, str);
                }
            }
        }
    }

    public String c() {
        StringBuilder sb = new StringBuilder();
        synchronized (this.f203a) {
            for (Map.Entry<String, cq> entry : this.f203a.entrySet()) {
                sb.append(entry.getKey());
                sb.append(":\n");
                sb.append(entry.getValue().toString());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    protected String e() {
        if ("com.xiaomi.xmsf".equals(f9019c)) {
            return f9019c;
        }
        return e.a.a.a.a.J(new StringBuilder(), f9019c, ":pushservice");
    }

    /* renamed from: e, reason: collision with other method in class */
    public void m187e() {
        String next;
        synchronized (this.f203a) {
            Iterator<cq> it2 = this.f203a.values().iterator();
            while (it2.hasNext()) {
                it2.next().a(true);
            }
            while (true) {
                for (boolean z = false; !z; z = true) {
                    Iterator<String> it3 = this.f203a.keySet().iterator();
                    while (it3.hasNext()) {
                        next = it3.next();
                        if (this.f203a.get(next).m172a().isEmpty()) {
                            break;
                        }
                    }
                }
                this.f203a.remove(next);
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    static String m176a() {
        if (a == null) {
            return "unknown";
        }
        try {
            ay m110a = ax.m110a();
            if (m110a == null) {
                return "unknown";
            }
            if (m110a.a() == 1) {
                return "WIFI-UNKNOWN";
            }
            return m110a.m122a() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + m110a.m124b();
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    protected void m184b(String str) {
        synchronized (this.f203a) {
            this.f203a.clear();
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("ver") == 2) {
                JSONArray optJSONArray = jSONObject.optJSONArray(RemoteMessageConst.DATA);
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        cq a2 = new cq().a(optJSONArray.getJSONObject(i));
                        this.f203a.put(a2.m171a(), a2);
                    }
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("reserved");
                if (optJSONArray2 != null) {
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        JSONObject jSONObject2 = optJSONArray2.getJSONObject(i2);
                        String optString = jSONObject2.optString("host");
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                cp a3 = new cp(optString).a(jSONObject2);
                                b.put(a3.f193b, a3);
                                com.xiaomi.channel.commonutils.logger.c.m15a("load local reserved host for " + a3.f193b);
                            } catch (JSONException unused) {
                                com.xiaomi.channel.commonutils.logger.c.m15a("parse reserved host fail.");
                            }
                        }
                    }
                }
            } else {
                throw new JSONException("Bad version");
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public cp m178a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return a(new URL(str).getHost(), true);
        }
        throw new IllegalArgumentException("the url is empty");
    }

    /* renamed from: c, reason: collision with other method in class */
    public void m185c() {
        FileOutputStream fileOutputStream;
        Closeable closeable;
        BufferedOutputStream bufferedOutputStream;
        Exception e2;
        synchronized (this.f203a) {
            BufferedOutputStream bufferedOutputStream2 = null;
            try {
                try {
                    String jSONObject = m179a().toString();
                    com.xiaomi.channel.commonutils.logger.c.b("persist host fallbacks = " + jSONObject);
                    if (TextUtils.isEmpty(jSONObject)) {
                        fileOutputStream = null;
                    } else {
                        fileOutputStream = a.openFileOutput(f(), 0);
                        try {
                            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                            try {
                                bufferedOutputStream.write(i.b(m177a(), jSONObject.getBytes(StandardCharsets.UTF_8)));
                                bufferedOutputStream.flush();
                                bufferedOutputStream2 = bufferedOutputStream;
                            } catch (Exception e3) {
                                e2 = e3;
                                com.xiaomi.channel.commonutils.logger.c.m15a("persist bucket failure: " + e2.getMessage());
                                y.a(bufferedOutputStream);
                                y.a(fileOutputStream);
                            }
                        } catch (Exception e4) {
                            e = e4;
                            bufferedOutputStream = null;
                            e2 = e;
                            com.xiaomi.channel.commonutils.logger.c.m15a("persist bucket failure: " + e2.getMessage());
                            y.a(bufferedOutputStream);
                            y.a(fileOutputStream);
                        } catch (Throwable th) {
                            th = th;
                            closeable = null;
                            th = th;
                            y.a(closeable);
                            y.a(fileOutputStream);
                            throw th;
                        }
                    }
                    y.a(bufferedOutputStream2);
                } catch (Throwable th2) {
                    th = th2;
                    y.a(closeable);
                    y.a(fileOutputStream);
                    throw th;
                }
            } catch (Exception e5) {
                e = e5;
                fileOutputStream = null;
                bufferedOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
                closeable = null;
            }
            y.a(fileOutputStream);
        }
    }

    /* renamed from: d, reason: collision with other method in class */
    public void m186d() {
        String e2 = e();
        try {
            File file = new File(a.getFilesDir(), e2);
            if (file.exists()) {
                boolean delete = file.delete();
                StringBuilder sb = new StringBuilder();
                sb.append("Delete old host fallbacks file ");
                sb.append(e2);
                sb.append(delete ? " successful." : " failed.");
                com.xiaomi.channel.commonutils.logger.c.m15a(sb.toString());
            } else {
                com.xiaomi.channel.commonutils.logger.c.b("Old host fallbacks file " + e2 + " does not exist.");
            }
        } catch (Exception e3) {
            StringBuilder U = e.a.a.a.a.U("Delete old host fallbacks file ", e2, " error: ");
            U.append(e3.getMessage());
            com.xiaomi.channel.commonutils.logger.c.m15a(U.toString());
        }
    }

    public cp a(String str, boolean z) {
        cp e2;
        com.xiaomi.channel.commonutils.logger.c.b("HostManager", "-->getFallbacksByHost(): host=", str, ", fetchRemoteIfNeed=", Boolean.valueOf(z));
        if (!TextUtils.isEmpty(str)) {
            if (!this.f200a.a(str)) {
                return null;
            }
            cp c2 = c(str);
            return (c2 == null || !c2.b()) ? (z && ax.m117a(a) && (e2 = e(str)) != null) ? e2 : new cp(str, c2) { // from class: com.xiaomi.push.ct.2
                cp a;
                final /* synthetic */ cp b;

                {
                    this.b = c2;
                    this.a = c2;
                    ((cp) this).f193b = ((cp) this).f193b;
                    if (c2 != null) {
                        this.f9017f = c2.f9017f;
                    }
                }

                @Override // com.xiaomi.push.cp
                public synchronized ArrayList<String> a(boolean z2) {
                    ArrayList<String> arrayList;
                    arrayList = new ArrayList<>();
                    cp cpVar = this.a;
                    if (cpVar != null) {
                        arrayList.addAll(cpVar.a(true));
                    }
                    Map<String, cp> map = ct.b;
                    synchronized (map) {
                        cp cpVar2 = map.get(((cp) this).f193b);
                        if (cpVar2 != null) {
                            Iterator<String> it2 = cpVar2.a(true).iterator();
                            while (it2.hasNext()) {
                                String next = it2.next();
                                if (arrayList.indexOf(next) == -1) {
                                    arrayList.add(next);
                                }
                            }
                            arrayList.remove(((cp) this).f193b);
                            arrayList.add(((cp) this).f193b);
                        }
                    }
                    return arrayList;
                }

                @Override // com.xiaomi.push.cp
                public boolean b() {
                    return false;
                }

                @Override // com.xiaomi.push.cp
                public synchronized void a(String str2, co coVar) {
                    cp cpVar = this.a;
                    if (cpVar != null) {
                        cpVar.a(str2, coVar);
                    }
                }
            } : c2;
        }
        throw new IllegalArgumentException("the host is empty");
    }

    private ArrayList<cp> a(ArrayList<String> arrayList) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        m187e();
        synchronized (this.f203a) {
            m182a();
            for (String str : this.f203a.keySet()) {
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        Map<String, cp> map = b;
        synchronized (map) {
            for (Object obj : map.values().toArray()) {
                cp cpVar = (cp) obj;
                if (!cpVar.b()) {
                    b.remove(cpVar.f193b);
                }
            }
        }
        if (!arrayList.contains(b())) {
            arrayList.add(b());
        }
        ArrayList<cp> arrayList2 = new ArrayList<>(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(null);
        }
        try {
            String str2 = ax.d(a) ? "wifi" : "wap";
            String a2 = a(arrayList, str2, this.f202a, true);
            if (!TextUtils.isEmpty(a2)) {
                JSONObject jSONObject3 = new JSONObject(a2);
                com.xiaomi.channel.commonutils.logger.c.b(a2);
                if ("OK".equalsIgnoreCase(jSONObject3.getString(ExifInterface.LATITUDE_SOUTH))) {
                    JSONObject jSONObject4 = jSONObject3.getJSONObject("R");
                    String string = jSONObject4.getString("province");
                    String string2 = jSONObject4.getString("city");
                    String string3 = jSONObject4.getString("isp");
                    String string4 = jSONObject4.getString("ip");
                    String string5 = jSONObject4.getString("country");
                    JSONObject jSONObject5 = jSONObject4.getJSONObject(str2);
                    com.xiaomi.channel.commonutils.logger.c.c("get bucket: net=" + string3 + ", hosts=" + jSONObject5.toString());
                    int i2 = 0;
                    while (i2 < arrayList.size()) {
                        String str3 = arrayList.get(i2);
                        JSONArray optJSONArray = jSONObject5.optJSONArray(str3);
                        if (optJSONArray == null) {
                            com.xiaomi.channel.commonutils.logger.c.m15a("no bucket found for " + str3);
                            jSONObject = jSONObject5;
                        } else {
                            cp cpVar2 = new cp(str3);
                            int i3 = 0;
                            while (i3 < optJSONArray.length()) {
                                String string6 = optJSONArray.getString(i3);
                                if (TextUtils.isEmpty(string6)) {
                                    jSONObject2 = jSONObject5;
                                } else {
                                    jSONObject2 = jSONObject5;
                                    cpVar2.a(new cw(string6, optJSONArray.length() - i3));
                                }
                                i3++;
                                jSONObject5 = jSONObject2;
                            }
                            jSONObject = jSONObject5;
                            arrayList2.set(i2, cpVar2);
                            cpVar2.f9018g = string5;
                            cpVar2.f9014c = string;
                            cpVar2.f9016e = string3;
                            cpVar2.f9017f = string4;
                            cpVar2.f9015d = string2;
                            if (jSONObject4.has("stat-percent")) {
                                cpVar2.a(jSONObject4.getDouble("stat-percent"));
                            }
                            if (jSONObject4.has("stat-domain")) {
                                cpVar2.b(jSONObject4.getString("stat-domain"));
                            }
                            if (jSONObject4.has(RemoteMessageConst.TTL)) {
                                cpVar2.a(jSONObject4.getInt(RemoteMessageConst.TTL) * 1000);
                            }
                            m181a(cpVar2.a());
                        }
                        i2++;
                        jSONObject5 = jSONObject;
                    }
                    JSONObject optJSONObject = jSONObject4.optJSONObject("reserved");
                    if (optJSONObject != null) {
                        long j = jSONObject4.has("reserved-ttl") ? jSONObject4.getInt("reserved-ttl") * 1000 : 604800000L;
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            JSONArray optJSONArray2 = optJSONObject.optJSONArray(next);
                            if (optJSONArray2 == null) {
                                com.xiaomi.channel.commonutils.logger.c.m15a("no bucket found for " + next);
                            } else {
                                cp cpVar3 = new cp(next);
                                cpVar3.a(j);
                                for (int i4 = 0; i4 < optJSONArray2.length(); i4++) {
                                    String string7 = optJSONArray2.getString(i4);
                                    if (!TextUtils.isEmpty(string7)) {
                                        cpVar3.a(new cw(string7, optJSONArray2.length() - i4));
                                    }
                                }
                                Map<String, cp> map2 = b;
                                synchronized (map2) {
                                    if (this.f200a.a(next)) {
                                        map2.put(next, cpVar3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("failed to get bucket ");
            M.append(e2.getMessage());
            com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            cp cpVar4 = arrayList2.get(i5);
            if (cpVar4 != null) {
                a(arrayList.get(i5), cpVar4);
            }
        }
        m185c();
        return arrayList2;
    }

    protected String a(ArrayList<String> arrayList, String str, String str2, boolean z) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new au("type", str));
        if (str.equals("wap")) {
            arrayList3.add(new au("conpt", a(ax.m112a(a))));
        }
        if (z) {
            arrayList3.add(new au("reserved", PushClient.DEFAULT_REQUEST_ID));
        }
        arrayList3.add(new au("uuid", str2));
        arrayList3.add(new au("list", bm.a(arrayList, Constants.ACCEPT_TIME_SEPARATOR_SP)));
        arrayList3.add(new au("countrycode", com.xiaomi.push.service.c.a(a).b()));
        arrayList3.add(new au("push_sdk_vc", String.valueOf(BuildConfig.VERSION_CODE)));
        String b2 = b();
        cp c2 = c(b2);
        String format = String.format(Locale.US, "https://%1$s/gslb/?ver=5.0", b2);
        if (c2 == null) {
            arrayList2.add(format);
            Map<String, cp> map = b;
            synchronized (map) {
                cp cpVar = map.get(b2);
                if (cpVar != null) {
                    Iterator<String> it2 = cpVar.a(true).iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(String.format(Locale.US, "https://%1$s/gslb/?ver=5.0", it2.next()));
                    }
                }
            }
        } else {
            arrayList2 = c2.a(format);
        }
        Iterator<String> it3 = arrayList2.iterator();
        IOException e2 = null;
        while (it3.hasNext()) {
            Uri.Builder buildUpon = Uri.parse(it3.next()).buildUpon();
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                aw awVar = (aw) it4.next();
                buildUpon.appendQueryParameter(awVar.a(), awVar.b());
            }
            try {
                b bVar = this.f201a;
                if (bVar == null) {
                    return ax.a(a, new URL(buildUpon.toString()));
                }
                return bVar.a(buildUpon.toString());
            } catch (IOException e3) {
                e2 = e3;
            }
        }
        if (e2 == null) {
            return null;
        }
        StringBuilder M = e.a.a.a.a.M("network exception: ");
        M.append(e2.getMessage());
        com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
        throw e2;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m180a() {
        synchronized (this.f203a) {
            this.f203a.clear();
        }
    }

    public void a(String str, cp cpVar) {
        if (!TextUtils.isEmpty(str) && cpVar != null) {
            if (this.f200a.a(str)) {
                synchronized (this.f203a) {
                    m182a();
                    if (this.f203a.containsKey(str)) {
                        this.f203a.get(str).a(cpVar);
                    } else {
                        cq cqVar = new cq(str);
                        cqVar.a(cpVar);
                        this.f203a.put(str, cqVar);
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("the argument is invalid " + str + ", " + cpVar);
    }

    /* renamed from: a, reason: collision with other method in class */
    protected boolean m182a() {
        synchronized (this.f203a) {
            if (f198a) {
                return true;
            }
            f198a = true;
            this.f203a.clear();
            try {
                String d2 = d();
                if (!TextUtils.isEmpty(d2)) {
                    m184b(d2);
                    com.xiaomi.channel.commonutils.logger.c.b("loading the new hosts succeed");
                    return true;
                }
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.c.m15a("load bucket failure: " + th.getMessage());
            }
            return false;
        }
    }

    public static void a(String str, String str2) {
        Map<String, cp> map = b;
        cp cpVar = map.get(str);
        synchronized (map) {
            if (cpVar == null) {
                cp cpVar2 = new cp(str);
                cpVar2.a(604800000L);
                cpVar2.m169a(str2);
                map.put(str, cpVar2);
            } else {
                cpVar.m169a(str2);
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private byte[] m177a() {
        return bl.m132a(a.getPackageName() + "_key_salt");
    }

    static String a(String str) {
        try {
            int length = str.length();
            byte[] bytes = str.getBytes("UTF-8");
            for (int i = 0; i < bytes.length; i++) {
                byte b2 = bytes[i];
                int i2 = b2 & 240;
                if (i2 != 240) {
                    bytes[i] = (byte) (((b2 & 15) ^ ((byte) (((b2 >> 4) + length) & 15))) | i2);
                }
            }
            return new String(bytes);
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m181a(String str) {
        this.f205b = str;
    }

    /* renamed from: a, reason: collision with other method in class */
    protected JSONObject m179a() {
        JSONObject jSONObject;
        synchronized (this.f203a) {
            jSONObject = new JSONObject();
            jSONObject.put("ver", 2);
            JSONArray jSONArray = new JSONArray();
            Iterator<cq> it2 = this.f203a.values().iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next().m173a());
            }
            jSONObject.put(RemoteMessageConst.DATA, jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            Iterator<cp> it3 = b.values().iterator();
            while (it3.hasNext()) {
                jSONArray2.put(it3.next().m168a());
            }
            jSONObject.put("reserved", jSONArray2);
        }
        return jSONObject;
    }
}
