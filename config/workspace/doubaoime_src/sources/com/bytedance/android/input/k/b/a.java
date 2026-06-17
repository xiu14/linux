package com.bytedance.android.input.k.b;

import android.app.ApplicationExitInfo;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.android.input.keyboard.InputView;
import com.bytedance.android.input.keyboard.toolbar.entity.ToolbarType;
import com.bytedance.android.input.network.api.IRecommends;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.net.DefaultHttpServiceImpl;
import com.bytedance.apm.util.i;
import com.bytedance.apm6.perf.base.model.ThreadStatInfo;
import com.bytedance.applog.B.c;
import com.bytedance.applog.B.d;
import com.bytedance.applog.B.j;
import com.bytedance.applog.monitor.v3.EventStage;
import com.bytedance.applog.monitor.v3.StageEventType;
import com.bytedance.applog.monitor.v3.e;
import com.bytedance.applog.monitor.v3.g;
import com.bytedance.applog.sampling.util.CityHashUtils;
import com.bytedance.applog.w.k;
import com.bytedance.article.common.monitor.stack.HttpUtil$CompressType;
import com.bytedance.bdinstall.C0640u;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.crash.I;
import com.bytedance.crash.N.h;
import com.bytedance.crash.dumper.j.f;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.crash.monitor.l;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.bytedance.retrofit2.InterfaceC0701e;
import com.bytedance.services.apm.api.IHttpService;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.android.message.log.PushLog;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import com.vivo.push.PushClient;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.BindException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.Deflater;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipFile;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {
    public static String a;

    public static void A(File file) {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
                Object invoke = cls.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                Method declaredMethod = cls.getDeclaredMethod("dumpGfxInfo", FileDescriptor.class, String[].class);
                declaredMethod.setAccessible(true);
                FileOutputStream fileOutputStream2 = new FileOutputStream(new File(file, "gfxinfo.txt"));
                try {
                    declaredMethod.invoke(invoke, fileOutputStream2.getFD(), new String[0]);
                    fileOutputStream2.close();
                } catch (Throwable unused) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
        }
    }

    public static boolean A0(int i, int i2) {
        if (i <= 0) {
            return false;
        }
        return i >= i2 || ((long) new SecureRandom().nextInt(i2)) < ((long) i);
    }

    public static void B(File file) {
        boolean z;
        com.bytedance.crash.monitor.a e2 = l.e();
        if (e2 == null) {
            return;
        }
        f fVar = new f(file.getAbsolutePath() + "/sdk_info.json");
        fVar.a('{');
        ConcurrentHashMap<Integer, String> C = e2.j().C();
        boolean z2 = true;
        if (C == null || C.size() <= 0) {
            z = true;
        } else {
            fVar.i("sdk_info");
            fVar.a('{');
            z = true;
            for (Integer num : C.keySet()) {
                if (z) {
                    z = false;
                } else {
                    fVar.a(',');
                }
                fVar.i(String.valueOf(num));
                fVar.j(String.valueOf(C.get(num)));
            }
            fVar.a('}');
        }
        JSONObject y = e2.j().y();
        if (y.length() > 0) {
            if (!z) {
                fVar.a(',');
            }
            fVar.i("inner_sdk");
            fVar.a('{');
            Iterator<String> keys = y.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    String string = y.getString(next);
                    if (z2) {
                        z2 = false;
                    } else {
                        fVar.a(',');
                    }
                    fVar.i(next);
                    fVar.j(string);
                } catch (JSONException unused) {
                }
            }
            fVar.a('}');
        }
        fVar.a('}');
        fVar.h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        if (r3 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0031, code lost:
    
        if (r3 == null) goto L30;
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0041: MOVE (r0 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:31:0x0041 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] B0(java.io.File r5) {
        /*
            r0 = 0
            if (r5 == 0) goto L48
            boolean r1 = r5.exists()
            if (r1 != 0) goto La
            goto L48
        La:
            long r1 = r5.length()
            int r1 = (int) r1
            byte[] r2 = new byte[r1]
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c java.io.FileNotFoundException -> L37
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c java.io.FileNotFoundException -> L37
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c java.io.FileNotFoundException -> L37
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c java.io.FileNotFoundException -> L37
            r5 = 0
            r3.read(r2, r5, r1)     // Catch: java.io.IOException -> L26 java.io.FileNotFoundException -> L28 java.lang.Throwable -> L40
            r3.close()     // Catch: java.io.IOException -> L26 java.io.FileNotFoundException -> L28 java.lang.Throwable -> L40
            r3.close()     // Catch: java.lang.Throwable -> L25
        L25:
            return r2
        L26:
            r5 = move-exception
            goto L2e
        L28:
            r5 = move-exception
            goto L39
        L2a:
            r5 = move-exception
            goto L42
        L2c:
            r5 = move-exception
            r3 = r0
        L2e:
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L40
            if (r3 == 0) goto L3f
        L33:
            r3.close()     // Catch: java.lang.Throwable -> L3f
            goto L3f
        L37:
            r5 = move-exception
            r3 = r0
        L39:
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L40
            if (r3 == 0) goto L3f
            goto L33
        L3f:
            return r0
        L40:
            r5 = move-exception
            r0 = r3
        L42:
            if (r0 == 0) goto L47
            r0.close()     // Catch: java.lang.Throwable -> L47
        L47:
            throw r5
        L48:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.k.b.a.B0(java.io.File):byte[]");
    }

    public static void C(File file) {
        com.bytedance.crash.monitor.a e2 = l.e();
        if (e2 == null) {
            return;
        }
        HashMap hashMap = (HashMap) e2.j().w();
        if (hashMap.isEmpty()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            com.bytedance.crash.util.a.y(new File(file.getAbsolutePath() + "/custom_crash_reason.json"), jSONObject, false);
        } catch (Throwable unused) {
        }
    }

    @Nullable
    public static String C0(@NonNull File file) {
        FileInputStream fileInputStream;
        if (file.exists() && !file.isDirectory()) {
            int length = (int) file.length();
            byte[] bArr = new byte[length];
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Throwable unused) {
                fileInputStream = null;
            }
            try {
                String str = new String(bArr, 0, fileInputStream.read(bArr, 0, length));
                try {
                    fileInputStream.close();
                } catch (IOException unused2) {
                }
                return str;
            } catch (Throwable unused3) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                return null;
            }
        }
        return null;
    }

    public static void D(String str, Object obj) {
        Log.e("NPTH", str + " " + obj);
    }

    public static <L, O> boolean D0(Collection<L> collection, O o, i<? super L, O> iVar) {
        Iterator<L> it2 = collection.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            if (iVar.a(it2.next(), o)) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }

    public static void E(String str, Object obj, Throwable th) {
        if (h.d()) {
            Log.e("NPTH", str + " " + obj, th);
        }
    }

    public static /* synthetic */ InterfaceC0701e E0(IRecommends.KeyboardRecordApi keyboardRecordApi, com.google.gson.l lVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return keyboardRecordApi.request(lVar, z);
    }

    public static void F(Throwable th) {
        Log.e("NPTH", "", th);
    }

    public static void F0(String str, int i) {
        Object[] objArr = {Integer.valueOf(i), -1, -1};
        int i2 = com.bytedance.common.utility.reflect.a.b;
        try {
            com.bytedance.common.utility.reflect.a.a(Class.forName("android.os.FileUtils"), str, objArr);
        } catch (Exception e2) {
            Log.w("JavaCalls", e.a.a.a.a.u("Meet exception when call Method '", str, "' in ", "android.os.FileUtils"), e2);
        }
    }

    public static boolean G(String str, String str2) {
        return (Y(str) && Y(str2)) || (str != null && str.equals(str2));
    }

    public static void G0(@NonNull e eVar, @NonNull EventStage eventStage, @NonNull g gVar) {
        if (eVar.o()) {
            eVar.v(eventStage, gVar.a, gVar.b, gVar.f3836c, gVar.f3837d);
        }
    }

    public static byte[] H(String str, byte[] bArr, HttpUtil$CompressType httpUtil$CompressType, String str2, boolean z) throws Throwable {
        String str3;
        String str4;
        byte[] bArr2;
        String str5 = null;
        if (str == null) {
            return null;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        int length = bArr.length;
        if (HttpUtil$CompressType.GZIP == httpUtil$CompressType && length > 128) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                bArr = byteArrayOutputStream.toByteArray();
                str5 = DownloadHelper.GZIP;
            } catch (Throwable unused) {
                gZIPOutputStream.close();
                return null;
            }
        } else if (HttpUtil$CompressType.DEFLATER == httpUtil$CompressType && length > 128) {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(8192);
            Deflater deflater = new Deflater();
            deflater.setInput(bArr);
            deflater.finish();
            byte[] bArr3 = new byte[8192];
            while (!deflater.finished()) {
                byteArrayOutputStream2.write(bArr3, 0, deflater.deflate(bArr3));
            }
            deflater.end();
            bArr = byteArrayOutputStream2.toByteArray();
            str5 = "deflate";
        }
        byte[] bArr4 = bArr;
        String str6 = str5;
        if (!z) {
            return I(str, bArr4, str2, str6, "POST", true, false);
        }
        byte[] a2 = EncryptorUtil.a(bArr4, bArr4.length);
        if (a2 != null) {
            if (TextUtils.isEmpty(new URL(str).getQuery())) {
                if (!str.endsWith("?")) {
                    str = e.a.a.a.a.s(str, "?");
                }
            } else if (!str.endsWith(ContainerUtils.FIELD_DELIMITER)) {
                str = e.a.a.a.a.s(str, ContainerUtils.FIELD_DELIMITER);
            }
            str3 = e.a.a.a.a.s(str, "tt_data=a");
            bArr2 = a2;
            str4 = "application/octet-stream;tt-data=a";
        } else {
            str3 = str;
            str4 = str2;
            bArr2 = bArr4;
        }
        return I(str3, bArr2, str4, str6, "POST", true, true);
    }

    public static void H0(@NonNull e eVar, @NonNull EventStage eventStage, com.bytedance.applog.B.a aVar) {
        if (eVar.o()) {
            if (aVar instanceof c) {
                eVar.v(eventStage, ((c) aVar).x, String.valueOf(aVar.r), aVar.b, StageEventType.V1_EVENT);
                return;
            }
            if (aVar instanceof com.bytedance.applog.B.e) {
                eVar.v(eventStage, ((com.bytedance.applog.B.e) aVar).C(), String.valueOf(aVar.r), aVar.b, StageEventType.V3_EVENT);
                return;
            }
            if (aVar instanceof d) {
                eVar.v(eventStage, ((d) aVar).C(), String.valueOf(aVar.r), aVar.b, StageEventType.LOG_DATA);
            } else if (aVar instanceof com.bytedance.applog.B.g) {
                eVar.v(eventStage, "launch", String.valueOf(aVar.r), aVar.b, StageEventType.LAUNCH);
            } else if (aVar instanceof j) {
                eVar.v(eventStage, "terminate", String.valueOf(aVar.r), aVar.b, StageEventType.TERMINATE);
            }
        }
    }

    public static byte[] I(String str, byte[] bArr, String str2, String str3, String str4, boolean z, boolean z2) throws Throwable {
        Throwable th;
        HttpURLConnection httpURLConnection;
        byte[] L0;
        InputStream inputStream = null;
        try {
            if (z2) {
                LinkedList<Pair> linkedList = new LinkedList();
                httpURLConnection = com.bytedance.apm.util.j.a(e.b.f.a.a.a.g(str, linkedList));
                try {
                    if (!linkedList.isEmpty()) {
                        for (Pair pair : linkedList) {
                            if (pair != null) {
                                httpURLConnection.setRequestProperty((String) pair.first, (String) pair.second);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } finally {
                    }
                }
            } else {
                httpURLConnection = com.bytedance.apm.util.j.a(str);
            }
            httpURLConnection.setDoOutput(z);
            if (str2 != null) {
                httpURLConnection.setRequestProperty(DownloadHelper.CONTENT_TYPE, str2);
            }
            if (str3 != null) {
                httpURLConnection.setRequestProperty(DownloadHelper.CONTENT_ENCODING, str3);
            }
            httpURLConnection.setRequestProperty(DownloadHelper.ACCEPT_ENCODING, DownloadHelper.GZIP);
            httpURLConnection.setRequestProperty("Version-Code", PushClient.DEFAULT_REQUEST_ID);
            httpURLConnection.setRequestMethod(str4);
            if (bArr != null && bArr.length > 0) {
                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
                dataOutputStream.close();
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 200) {
                throw new com.bytedance.article.common.monitor.stack.e(responseCode, httpURLConnection.getResponseMessage());
            }
            InputStream inputStream2 = httpURLConnection.getInputStream();
            try {
                String contentEncoding = httpURLConnection.getContentEncoding();
                if (TextUtils.isEmpty(contentEncoding) || !contentEncoding.equalsIgnoreCase(DownloadHelper.GZIP)) {
                    L0 = L0(inputStream2);
                } else {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(inputStream2);
                    L0 = L0(gZIPInputStream);
                    gZIPInputStream.close();
                }
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (Exception unused) {
                    }
                }
                try {
                    httpURLConnection.disconnect();
                } catch (Exception unused2) {
                }
                return L0;
            } catch (Throwable th3) {
                inputStream = inputStream2;
                th = th3;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = null;
        }
    }

    public static Map<String, String> I0(String str, Map<String, String> map) {
        if (Y(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String string = jSONObject.getString(next);
                if (!Y(next) && !Y(string)) {
                    map.put(next, string);
                }
            }
            return map;
        } catch (Exception unused) {
            return map;
        }
    }

    public static JSONObject J(JSONObject jSONObject, String str) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            try {
                jSONObject.put(str, optJSONObject);
            } catch (JSONException unused) {
            }
        }
        return optJSONObject;
    }

    public static String[] J0(Set<String> set) {
        String[] strArr = new String[set.size()];
        Iterator<String> it2 = set.iterator();
        int i = 0;
        while (it2.hasNext()) {
            strArr[i] = it2.next();
            i++;
        }
        return strArr;
    }

    public static void K() {
        try {
            Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
            Object invoke = cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mRoots");
            declaredField.setAccessible(true);
            ArrayList arrayList = (ArrayList) declaredField.get(invoke);
            Field declaredField2 = Class.forName("android.view.ViewRootImpl").getDeclaredField("mView");
            declaredField2.setAccessible(true);
            Field declaredField3 = View.class.getDeclaredField("mRenderNode");
            declaredField3.setAccessible(true);
            Method l = com.bytedance.apm.t.l.d.l(Build.VERSION.SDK_INT > 28 ? Class.forName("android.graphics.RenderNode") : Class.forName("android.view.RenderNode"), "output", new Class[0]);
            for (int i = 0; i < arrayList.size(); i++) {
                l.invoke(declaredField3.get(declaredField2.get(arrayList.get(i))), new Object[0]);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static String[] K0(Set<String> set) {
        String[] strArr = new String[set.size()];
        Iterator<String> it2 = set.iterator();
        int i = 0;
        while (it2.hasNext()) {
            strArr[i] = it2.next();
            i++;
        }
        return strArr;
    }

    @Nullable
    public static JSONObject L(@Nullable JSONObject jSONObject, String... strArr) {
        if (jSONObject == null) {
            return null;
        }
        for (int i = 0; i < strArr.length - 1; i++) {
            jSONObject = jSONObject.optJSONObject(strArr[i]);
            if (jSONObject == null) {
                StringBuilder M = e.a.a.a.a.M("err get json: not found node:");
                M.append(strArr[i]);
                X("JSONUtil", M.toString());
                return null;
            }
        }
        return jSONObject;
    }

    public static byte[] L0(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                inputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    @Nullable
    public static JSONObject M(JSONObject jSONObject, String str) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return jSONObject.optJSONObject(str);
    }

    public static JSONObject M0(JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("oaid");
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("id", null);
                if (!TextUtils.isEmpty(optString)) {
                    jSONObject.put("oaid", optString);
                }
            }
        } catch (Exception e2) {
            k.z().i("transferHeader failed", e2, new Object[0]);
        }
        return jSONObject;
    }

    @Nullable
    public static String N(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            if (digest.length <= 0) {
                return null;
            }
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            char[] cArr2 = new char[digest.length * 2];
            int i = 0;
            for (byte b : digest) {
                int i2 = i + 1;
                cArr2[i] = cArr[(b >>> 4) & 15];
                i = i2 + 1;
                cArr2[i2] = cArr[b & 15];
            }
            return new String(cArr2);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static com.bytedance.services.apm.api.c N0(String str, List<File> list, Map<String, String> map) {
        try {
            IHttpService iHttpService = (IHttpService) com.bytedance.news.common.service.manager.c.a(IHttpService.class);
            if (iHttpService == null) {
                iHttpService = new DefaultHttpServiceImpl();
            }
            com.bytedance.services.apm.api.g buildMultipartUpload = iHttpService.buildMultipartUpload(str, "UTF-8", false);
            if (list != null && !list.isEmpty()) {
                for (File file : list) {
                    if (file.exists()) {
                        buildMultipartUpload.d(file.getName(), file, null, new HashMap());
                    }
                }
            }
            if (map != null && !map.isEmpty()) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    buildMultipartUpload.c(entry.getKey(), entry.getValue());
                }
            }
            String str2 = new String(buildMultipartUpload.b().b());
            if (!TextUtils.isEmpty(str2)) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    return new com.bytedance.services.apm.api.c(jSONObject.optInt("error_code", 0), jSONObject.optString("message", "").getBytes());
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static NetworkUtils.NetworkType O(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (1 == type) {
                    return NetworkUtils.NetworkType.WIFI;
                }
                if (type != 0) {
                    return NetworkUtils.NetworkType.MOBILE;
                }
                switch (((TelephonyManager) context.getSystemService("phone")).getNetworkType()) {
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        return NetworkUtils.NetworkType.MOBILE_3G;
                    case 4:
                    case 7:
                    case 11:
                    default:
                        return NetworkUtils.NetworkType.MOBILE;
                    case 13:
                        return NetworkUtils.NetworkType.MOBILE_4G;
                }
            }
            return NetworkUtils.NetworkType.NONE;
        } catch (Throwable unused) {
            return NetworkUtils.NetworkType.MOBILE;
        }
    }

    public static void O0(String str) {
        if (h.d()) {
            Log.w("NPTH", str);
        }
    }

    public static JSONObject P(boolean z, int i, Exception exc, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("success", z);
            jSONObject.put("code", i);
            if (exc != null) {
                jSONObject.put("exception", exc.getMessage() + Q(exc, 30));
                jSONObject.put("exception_object", exc);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public static void P0(Throwable th) {
        if (h.d()) {
            Log.w("NPTH", th);
        }
    }

    public static String Q(Throwable th, int i) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        for (StackTraceElement stackTraceElement : stackTrace) {
            i2++;
            StringBuilder M = e.a.a.a.a.M("\tat ");
            M.append(stackTraceElement.getClassName());
            sb.append(M.toString());
            sb.append(".");
            sb.append(stackTraceElement.getMethodName());
            sb.append("(");
            sb.append(stackTraceElement.getFileName());
            sb.append(Constants.COLON_SEPARATOR);
            sb.append(stackTraceElement.getLineNumber());
            sb.append(")\n");
            if (i2 > i) {
                break;
            }
        }
        return sb.toString();
    }

    public static void Q0(@NonNull com.bytedance.apm.v.d.d dVar, boolean z) {
        dVar.f3606f = com.bytedance.apm.B.d.a().b(z);
    }

    public static String R(StackTraceElement[] stackTraceElementArr) throws IllegalArgumentException {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            throw new IllegalArgumentException("stackTraceElements must not be null or empty");
        }
        StringBuilder sb = new StringBuilder(stackTraceElementArr.length * 30);
        for (int i = 0; i < stackTraceElementArr.length && i <= 40; i++) {
            if ((i != 0 || !"getThreadStackTrace".equals(stackTraceElementArr[0].getMethodName())) && (i != 1 || !"getStackTrace".equals(stackTraceElementArr[1].getMethodName()))) {
                StringBuilder M = e.a.a.a.a.M("\tat ");
                M.append(stackTraceElementArr[i].getClassName());
                sb.append(M.toString());
                sb.append(".");
                sb.append(stackTraceElementArr[i].getMethodName());
                sb.append("(");
                sb.append(stackTraceElementArr[i].getFileName());
                sb.append(Constants.COLON_SEPARATOR);
                sb.append(stackTraceElementArr[i].getLineNumber());
                sb.append(")\n");
            }
        }
        return sb.toString();
    }

    public static void R0(@NonNull JSONObject jSONObject, String str) throws JSONException {
        jSONObject.put("timestamp", System.currentTimeMillis());
        jSONObject.put("crash_time", System.currentTimeMillis());
        jSONObject.put("is_main_process", com.bytedance.apm.g.F());
        jSONObject.put("process_name", com.bytedance.apm.g.i());
        jSONObject.put("event_type", str);
        jSONObject.put("scene", ActivityLifeObserver.getInstance().getTopActivityClassName());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int S(@androidx.annotation.NonNull com.bytedance.applog.monitor.v3.e r2, @androidx.annotation.Nullable com.bytedance.applog.B.a r3) {
        /*
            boolean r0 = r2.o()
            r1 = 0
            if (r0 != 0) goto L8
            goto L49
        L8:
            boolean r0 = r3 instanceof com.bytedance.applog.B.c
            if (r0 == 0) goto L15
            com.bytedance.applog.B.c r3 = (com.bytedance.applog.B.c) r3
            java.lang.String r3 = r3.y
            boolean r3 = r2.m(r3)
            goto L4a
        L15:
            boolean r0 = r3 instanceof com.bytedance.applog.B.e
            if (r0 == 0) goto L24
            com.bytedance.applog.B.e r3 = (com.bytedance.applog.B.e) r3
            java.lang.String r3 = r3.C()
            boolean r3 = r2.m(r3)
            goto L4a
        L24:
            boolean r0 = r3 instanceof com.bytedance.applog.B.d
            if (r0 == 0) goto L33
            com.bytedance.applog.B.d r3 = (com.bytedance.applog.B.d) r3
            java.lang.String r3 = r3.C()
            boolean r3 = r2.m(r3)
            goto L4a
        L33:
            boolean r0 = r3 instanceof com.bytedance.applog.B.g
            if (r0 == 0) goto L3e
            java.lang.String r3 = "launch"
            boolean r3 = r2.m(r3)
            goto L4a
        L3e:
            boolean r3 = r3 instanceof com.bytedance.applog.B.j
            if (r3 == 0) goto L49
            java.lang.String r3 = "terminate"
            boolean r3 = r2.m(r3)
            goto L4a
        L49:
            r3 = r1
        L4a:
            if (r3 == 0) goto L54
            r1 = 1
            boolean r2 = r2.k()
            if (r2 == 0) goto L54
            r1 = 3
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.k.b.a.S(com.bytedance.applog.monitor.v3.e, com.bytedance.applog.B.a):int");
    }

    public static LinkedList<com.bytedance.apm.B.k.a> T(int i) {
        File[] listFiles = new File(e.a.a.a.a.k("/proc/", i, "/task/")).listFiles();
        LinkedList<com.bytedance.apm.B.k.a> linkedList = new LinkedList<>();
        BufferedReader bufferedReader = null;
        for (File file : listFiles) {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file.getPath() + "/stat")), 1000);
                try {
                    String readLine = bufferedReader2.readLine();
                    int lastIndexOf = readLine.lastIndexOf(41);
                    String substring = readLine.substring(0, lastIndexOf);
                    String substring2 = readLine.substring(lastIndexOf + 4);
                    int indexOf = substring.indexOf(40);
                    int intValue = Integer.valueOf(substring.substring(0, indexOf - 1)).intValue();
                    String substring3 = substring.substring(indexOf + 1);
                    String[] split = substring2.split(" ");
                    linkedList.add(new com.bytedance.apm.B.k.a(intValue, substring3, Long.parseLong(split[10]) + Long.parseLong(split[11])));
                    try {
                        bufferedReader2.close();
                    } catch (Throwable unused) {
                    }
                    bufferedReader = bufferedReader2;
                } catch (Exception unused2) {
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused4) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused5) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused6) {
                    }
                }
            } catch (Exception unused7) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return linkedList;
    }

    public static void U(int i, Map<Integer, com.bytedance.apm6.cpu.exception.e> map) {
        for (File file : new File(e.a.a.a.a.k("/proc/", i, "/task/")).listFiles()) {
            try {
                int parseInt = Integer.parseInt(file.getName());
                ThreadStatInfo f2 = com.bytedance.monitor.collector.j.h().f(i, parseInt);
                if (parseInt != 0 && f2 != null && !TextUtils.isEmpty(f2.threadName) && f2.threadCpuTime != 0) {
                    com.bytedance.apm6.cpu.exception.e eVar = new com.bytedance.apm6.cpu.exception.e();
                    eVar.n(parseInt);
                    eVar.o(f2.threadName);
                    eVar.m(f2.threadCpuTime);
                    map.put(Integer.valueOf(parseInt), eVar);
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static boolean V(String str, long j, long j2) {
        return j2 <= 0 || j2 > j || (CityHashUtils.d(str).longValue() >>> 32) % (j / j2) == 0;
    }

    public static void W(Object obj) {
        if (h.d()) {
            Log.i("NPTH", String.valueOf(obj));
        }
    }

    public static void X(String str, Object obj) {
        if (h.d()) {
            Log.i("NPTH", str + " " + obj);
        }
    }

    public static boolean Y(String str) {
        return str == null || str.length() == 0;
    }

    public static <T> boolean Z(Collection<T> collection) {
        return collection == null || collection.isEmpty();
    }

    public static int a(Throwable th, String[] strArr) {
        int i;
        int i2;
        int i3 = 1;
        if (th == null) {
            return 1;
        }
        boolean z = th instanceof com.bytedance.frameworks.baselib.network.http.l.c;
        if (z) {
            i3 = ((com.bytedance.frameworks.baselib.network.http.l.c) th).c();
        } else if (th instanceof com.bytedance.frameworks.baselib.network.http.p.d) {
            i3 = 20;
        } else {
            if (!(th instanceof g.a.b.c.a)) {
                if (th instanceof SocketTimeoutException) {
                    if (Y(th.getMessage()) || !th.getMessage().contains("connect timed out")) {
                        i3 = 3;
                    }
                } else if (th instanceof BindException) {
                    i3 = 7;
                } else if (th instanceof ConnectException) {
                    i3 = 8;
                } else if (th instanceof NoRouteToHostException) {
                    i3 = 9;
                } else if (th instanceof PortUnreachableException) {
                    i3 = 10;
                } else if (th instanceof SocketException) {
                    i3 = 5;
                    String message = th.getMessage();
                    if (message != null && message.indexOf("reset by peer") >= 0) {
                        i3 = 6;
                    }
                } else if (th instanceof UnknownHostException) {
                    i3 = 11;
                } else if (z) {
                    i3 = 19;
                } else if (th instanceof IOException) {
                    i3 = 4;
                }
            }
            i3 = 2;
        }
        try {
            if (i3 == 2) {
                String message2 = th.getMessage();
                if (Logger.debug()) {
                    Logger.d("ConvertIOException", "SC_CONNECT_TIMEOUT " + message2);
                }
                Matcher matcher = Pattern.compile("Connect to +([\\w\\.\\-]+)?/(\\[([a-zA-Z0-9:]+)\\]|(\\d{1,3}(\\.\\d{1,3}){3,3})):(\\d+) +timed out").matcher(message2);
                if (matcher.matches()) {
                    if (matcher.group(3) != null) {
                        strArr[0] = matcher.group(3);
                    } else if (matcher.group(4) != null) {
                        strArr[0] = matcher.group(4);
                    }
                }
                if (!Logger.debug()) {
                    return i3;
                }
                Logger.d("ConvertIOException", "SC_CONNECT_TIMEOUT ip " + strArr[0]);
                return i3;
            }
            if (i3 != 8) {
                if (i3 != 4) {
                    return i3;
                }
                String message3 = th.getMessage();
                if (message3.indexOf(" EIO (I/O error)") <= 0) {
                    if (!(th instanceof FileNotFoundException) && message3.indexOf(" ENOENT ") <= 0 && message3.indexOf("No such file or directory") <= 0) {
                        if (message3.indexOf(" ENOSPC ") <= 0 && message3.indexOf("No space left on device") <= 0) {
                            if (message3.indexOf(" EDQUOT ") > 0) {
                                i = 34;
                            } else if (message3.indexOf(" EROFS ") > 0) {
                                i = 35;
                            } else if (message3.indexOf(" EACCES ") > 0) {
                                i = 36;
                            } else {
                                if (message3.indexOf("ERR_TTNET_REQUEST_TIMED_OUT") <= 0) {
                                    return i3;
                                }
                                i = 38;
                            }
                        }
                        i = 32;
                    }
                    return 33;
                }
                i = 37;
                return i;
            }
            Throwable cause = th.getCause();
            if (cause == null || !(cause instanceof ConnectException)) {
                return i3;
            }
            String message4 = cause.getMessage();
            if (Logger.debug()) {
                Logger.d("ConvertIOException", "SC_CONNECT_EXCEPTION " + message4);
            }
            Matcher matcher2 = Pattern.compile("failed to connect to +([\\w\\.\\-]+)?/(\\[([a-zA-Z0-9:]+)\\]|(\\d{1,3}(\\.\\d{1,3}){3,3})) \\(port \\d+\\)( +after \\d+ms)?: +\\w+ failed: (E[A-Z]+) .*").matcher(message4);
            String str = null;
            if (matcher2.matches()) {
                if (matcher2.group(3) != null) {
                    strArr[0] = matcher2.group(3);
                } else if (matcher2.group(4) != null) {
                    strArr[0] = matcher2.group(4);
                }
                str = matcher2.group(7);
                if (str != null) {
                    if ("ECONNRESET".equals(str)) {
                        i2 = 12;
                    } else if ("ECONNREFUSED".equals(str)) {
                        i2 = 13;
                    } else if ("EHOSTUNREACH".equals(str)) {
                        i2 = 14;
                    } else if ("ENETUNREACH".equals(str)) {
                        i2 = 15;
                    } else if ("EADDRNOTAVAIL".equals(str)) {
                        i2 = 16;
                    } else if ("EADDRINUSE".equals(str)) {
                        i2 = 17;
                    }
                    i3 = i2;
                }
            }
            if (!Logger.debug()) {
                return i3;
            }
            Logger.d("ConvertIOException", "SC_CONNECT_EXCEPTION ip " + strArr[0] + " " + str);
            return i3;
        } catch (Exception unused) {
            return i3;
        }
    }

    public static boolean a0(List<?> list) {
        return list == null || list.size() == 0;
    }

    public static void b(@NonNull JSONObject jSONObject, String str, JSONArray jSONArray) {
        if (jSONArray.length() != 0) {
            y0(J(jSONObject, "custom_long"), str, jSONArray);
        }
    }

    public static boolean b0(JSONArray jSONArray) {
        return jSONArray == null || jSONArray.length() == 0;
    }

    public static void c(JSONObject jSONObject, Object... objArr) {
        if (jSONObject == null || objArr == null || objArr.length % 2 != 0 || objArr.length == 0) {
            D("JSONUtils", "Err use of addKVs!!!!!");
            return;
        }
        for (int i = 0; i < objArr.length; i += 2) {
            y0(jSONObject, String.valueOf(objArr[i]), objArr[i + 1]);
        }
    }

    public static boolean c0(JSONObject jSONObject) {
        return jSONObject == null || jSONObject.length() == 0;
    }

    public static void d(JSONObject jSONObject, String str, Object obj) {
        if (obj != null) {
            try {
                jSONObject.put(str, String.valueOf(obj));
            } catch (JSONException unused) {
            }
        }
    }

    public static boolean d0(String str) {
        return Y(str);
    }

    public static String e(Object[] objArr, String str) {
        if (objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Object obj : objArr) {
            if (z) {
                z = false;
            } else {
                sb.append(str);
            }
            sb.append(obj.toString());
        }
        return sb.toString();
    }

    public static boolean e0(List<?> list) {
        return list == null || list.size() == 0;
    }

    public static String f(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            Log.w("apm", str2 + " is empty, please make sure");
        }
        return str;
    }

    public static boolean f0(JSONObject jSONObject) {
        return jSONObject == null || jSONObject.length() == 0;
    }

    public static void g(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static <T> boolean g0(List<T> list) {
        return list == null || list.size() == 0;
    }

    public static void h(ZipFile zipFile) {
        if (zipFile == null) {
            return;
        }
        try {
            zipFile.close();
        } catch (IOException unused) {
        }
    }

    public static boolean h0(JSONArray jSONArray) {
        return jSONArray == null || jSONArray.length() == 0;
    }

    public static double i() {
        long currentTimeMillis = System.currentTimeMillis();
        long b = com.bytedance.monitor.collector.j.h().b();
        try {
            Thread.sleep(360L);
        } catch (InterruptedException unused) {
        }
        return (((com.bytedance.monitor.collector.j.h().b() - b) * 1000.0d) / (System.currentTimeMillis() - currentTimeMillis)) / com.bytedance.apm.util.b.e(100L);
    }

    public static boolean i0(String str, List<String> list, List<Pattern> list2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!e0(list)) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                if (str.contains(it2.next())) {
                    return true;
                }
            }
        }
        try {
            String path = new URI(str).getPath();
            if (!e0(list2)) {
                Iterator<Pattern> it3 = list2.iterator();
                while (it3.hasNext()) {
                    if (it3.next().matcher(path).matches()) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static void j(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null || jSONObject2.length() <= 0) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                if (opt == null) {
                    jSONObject.put(next, jSONObject2.opt(next));
                } else if (opt instanceof JSONObject) {
                    j(jSONObject.getJSONObject(next), jSONObject2.getJSONObject(next));
                } else if (opt instanceof JSONArray) {
                    JSONArray optJSONArray = jSONObject2.optJSONArray(next);
                    if (optJSONArray != null) {
                        JSONArray jSONArray = (JSONArray) opt;
                        if (jSONArray.length() == 1 && (jSONArray.opt(0) instanceof JSONObject) && (optJSONArray.opt(0) instanceof JSONObject)) {
                            j(jSONArray.getJSONObject(0), optJSONArray.getJSONObject(0));
                        } else {
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                jSONArray.put(optJSONArray.get(i));
                            }
                        }
                    }
                } else {
                    jSONObject.put(next, jSONObject2.opt(next));
                }
            }
        } catch (JSONException unused) {
        }
    }

    public static boolean j0(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isAvailable();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static byte[] k(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream(8192);
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                if (bArr != null) {
                    try {
                        gZIPOutputStream.write(bArr);
                    } catch (Throwable th) {
                        th = th;
                        try {
                            k.z().u(14, "compress with gzip failed", th, new Object[0]);
                            if (gZIPOutputStream != null) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (Throwable unused) {
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Throwable unused2) {
                                }
                            }
                            return null;
                        } finally {
                        }
                    }
                }
                try {
                    gZIPOutputStream.close();
                } catch (Throwable unused3) {
                }
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable unused4) {
                }
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
            gZIPOutputStream = null;
        }
    }

    public static boolean k0(JSONObject jSONObject, Set<String> set) {
        Iterator<String> it2 = set.iterator();
        while (it2.hasNext()) {
            if (!jSONObject.has(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public static final com.bytedance.android.input.network.utils.a l(String str) throws com.bytedance.android.input.network.utils.b {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair<String, String> c2 = com.bytedance.frameworks.baselib.network.http.p.l.c(str, linkedHashMap);
            return new com.bytedance.android.input.network.utils.a((String) c2.first, (String) c2.second, linkedHashMap);
        } catch (Exception unused) {
            throw new com.bytedance.android.input.network.utils.b(str);
        }
    }

    public static void l0(JSONObject jSONObject, Map<String, ? extends Object> map) {
        if (jSONObject != null) {
            try {
                for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (Throwable unused) {
            }
        }
    }

    @NonNull
    public static File m(@NonNull File file) {
        try {
            if (!file.exists()) {
                file.mkdirs();
            } else if (!file.isDirectory()) {
                file.delete();
                file.mkdirs();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return file;
    }

    public static void m0(String str) {
        if (com.bytedance.apm.g.B()) {
            com.bytedance.apm.y.d.d("AlogUploadTag", str, "");
        }
    }

    @NonNull
    public static File n(@NonNull File file, @NonNull String str) {
        File file2 = new File(file, str);
        m(file2);
        return file2;
    }

    public static String n0(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                String str2 = map.get(str);
                if (!Y(str) && !Y(str2)) {
                    jSONObject.put(str, str2);
                }
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    @NonNull
    public static File o(@NonNull File file, @NonNull String str) {
        File file2 = new File(file, str);
        if (file2.isDirectory()) {
            s(file2);
        }
        try {
            if (!file2.exists()) {
                file2.createNewFile();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return file2;
    }

    public static JSONObject o0(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return jSONObject2;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                jSONObject2.put(next, jSONObject.opt(next));
            } catch (JSONException e2) {
                k.z().t(Collections.singletonList("JsonUtils"), "Merge json interrupted.", e2, new Object[0]);
            }
        }
        return jSONObject2;
    }

    public static void p(Object obj) {
        if (h.f()) {
            Log.d("NPTH", String.valueOf(obj));
        }
    }

    public static void p0(Object obj, boolean z) {
        String name = obj instanceof String ? (String) obj : obj.getClass().getName();
        JSONObject jSONObject = new JSONObject();
        try {
            if (obj instanceof com.bytedance.apm.q.a.a) {
                jSONObject.put(PushLog.KEY_LABEL, ((com.bytedance.apm.q.a.a) obj).a());
            }
        } catch (Exception unused) {
        }
        String str = z ? "page_show" : "page_hide";
        if (z && ApmDelegate.i().g().k() != null) {
            ApmDelegate.i().g().k().a(name, true);
        }
        com.bytedance.apm.q.b.a.c(str, name, jSONObject);
    }

    public static void q(String str, Object obj) {
        if (h.f()) {
            Log.i("NPTH", str + " " + obj);
        }
    }

    public static int q0(JSONObject jSONObject, String str, String str2, String str3) {
        JSONObject r0 = r0(jSONObject, str, str2);
        if (r0 == null) {
            return 0;
        }
        return r0.optInt(str3, 0);
    }

    public static JSONObject r(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new JSONObject(jSONObject.toString());
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    @Nullable
    public static JSONObject r0(JSONObject jSONObject, String str, String str2) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject(str)) == null) {
            return null;
        }
        return optJSONObject.optJSONObject(str2);
    }

    public static void s(@NonNull File file) {
        File[] listFiles;
        if (file.exists()) {
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    s(file2);
                }
            }
            try {
                com.bytedance.crash.util.a.b(file);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[Catch: Exception -> 0x0031, TryCatch #0 {Exception -> 0x0031, blocks: (B:3:0x0001, B:5:0x0008, B:12:0x0015, B:14:0x0020, B:16:0x002a), top: B:2:0x0001 }] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<java.lang.String> s0(org.json.JSONObject r5, java.lang.String r6) {
        /*
            r0 = 0
            org.json.JSONArray r5 = r5.optJSONArray(r6)     // Catch: java.lang.Exception -> L31
            r6 = 0
            if (r5 == 0) goto L11
            int r1 = r5.length()     // Catch: java.lang.Exception -> L31
            if (r1 != 0) goto Lf
            goto L11
        Lf:
            r1 = r6
            goto L12
        L11:
            r1 = 1
        L12:
            if (r1 == 0) goto L15
            return r0
        L15:
            int r1 = r5.length()     // Catch: java.lang.Exception -> L31
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> L31
            r2.<init>(r1)     // Catch: java.lang.Exception -> L31
        L1e:
            if (r6 >= r1) goto L30
            java.lang.String r3 = r5.getString(r6)     // Catch: java.lang.Exception -> L31
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L31
            if (r4 != 0) goto L2d
            r2.add(r3)     // Catch: java.lang.Exception -> L31
        L2d:
            int r6 = r6 + 1
            goto L1e
        L30:
            return r2
        L31:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.k.b.a.s0(org.json.JSONObject, java.lang.String):java.util.List");
    }

    public static void t(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        try {
            file.delete();
        } catch (Throwable unused) {
        }
    }

    @Nullable
    public static List<String> t0(JSONObject jSONObject, String str) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (e.b.b.n.b.c(optJSONObject)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (optJSONObject.optInt(next) == 1) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void u(String str) {
        File file = new File(str);
        if (file.exists()) {
            if (file.isFile()) {
                file.delete();
                return;
            }
            String[] list = file.list();
            if (list == null) {
                return;
            }
            for (String str2 : list) {
                if (str2 != null) {
                    String str3 = File.separator;
                    String s = str.endsWith(str3) ? e.a.a.a.a.s(str, str2) : e.a.a.a.a.t(str, str3, str2);
                    File file2 = new File(s);
                    if (file2.isFile()) {
                        file2.delete();
                    }
                    if (file2.isDirectory()) {
                        u(s);
                    }
                }
            }
            file.delete();
        }
    }

    public static void u0(JSONObject jSONObject) {
        try {
            List<ApplicationExitInfo> b = com.bytedance.crash.Z.c.b();
            if (b == null) {
                return;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(MonitorConstants.CUSTOM);
            long optLong = jSONObject.optLong("crash_time");
            int optInt = jSONObject.optInt("pid");
            String optString = jSONObject.optString("process_name");
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            for (ApplicationExitInfo applicationExitInfo : b) {
                if (applicationExitInfo.getProcessName().equals(optString) && optInt == applicationExitInfo.getPid()) {
                    long timestamp = applicationExitInfo.getTimestamp() - optLong;
                    if (timestamp > 0 && timestamp <= 30000) {
                        if (applicationExitInfo.getReason() == 6) {
                            sb3.append(applicationExitInfo.getDescription() + Constants.ACCEPT_TIME_SEPARATOR_SP);
                        }
                        sb.append(applicationExitInfo.getReason() + Constants.ACCEPT_TIME_SEPARATOR_SP);
                        sb2.append("timestamp=" + applicationExitInfo.getTimestamp());
                        sb2.append(" crash_pid=" + optInt);
                        sb2.append(" crash_time=" + optLong + " \n");
                        sb2.append(applicationExitInfo);
                        sb2.append("\n");
                    }
                }
            }
            if (sb2.length() > 0) {
                optJSONObject.put("history_exit_process_list", sb2);
            }
            jSONObject.put("exit_reason", sb);
            if (sb3.length() > 0) {
                jSONObject.put("anr_reason_from_exit", sb3);
            }
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ void v(com.bytedance.android.input.keyboard.t.a.a aVar, ToolbarType toolbarType, com.bytedance.android.input.keyboard.toolbar.entity.a aVar2, int i, Object obj) {
        int i2 = i & 2;
        ((InputView) aVar).j(toolbarType, null);
    }

    public static List<Pair<String, String>> v0(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                for (int i = 0; i < entry.getValue().size(); i++) {
                    if (!TextUtils.isEmpty(entry.getKey())) {
                        arrayList.add(new Pair(entry.getKey(), entry.getValue().get(i)));
                    }
                }
            }
            String str = "NetUtils#parseHeaders" + arrayList;
            int i2 = C0640u.a;
        }
        return arrayList;
    }

    public static final int w(Context context, float f2) {
        kotlin.s.c.l.f(context, "context");
        return (int) ((f2 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static void w0(@NonNull JSONObject jSONObject) {
        com.bytedance.crash.monitor.a e2 = l.e();
        if (e2 == null) {
            return;
        }
        ConcurrentHashMap<Integer, String> C = e2.j().C();
        JSONObject jSONObject2 = new JSONObject();
        if (C != null) {
            try {
                if (C.size() > 0) {
                    for (Integer num : C.keySet()) {
                        jSONObject2.put(String.valueOf(num), C.get(num));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject y = e2.j().y();
        try {
            if (!f0(jSONObject2)) {
                jSONObject.put("sdk_info", jSONObject2);
            }
            if (f0(y)) {
                return;
            }
            jSONObject.put("inner_sdk", y);
        } catch (Throwable unused2) {
        }
    }

    public static void x(File file) {
        com.bytedance.crash.monitor.a e2 = l.e();
        if (e2 == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (e2.m() != 0 && !TextUtils.isEmpty(e2.n())) {
            try {
                jSONObject.put("version_code", e2.m());
                jSONObject.put("update_version_code", e2.i());
                jSONObject.put("version_name", e2.n());
                jSONObject.put("app_version", e2.n());
                jSONObject.put("manifest_version_code", e2.w());
            } catch (Throwable unused) {
            }
        }
        if (jSONObject.length() > 0) {
            try {
                com.bytedance.crash.util.a.x(new File(file, "version.json"), jSONObject.toString(), false);
            } catch (Exception unused2) {
            }
        }
    }

    public static void x0(@NonNull JSONObject jSONObject, File file) {
        String h = e.a.a.a.a.h(file, "sdk_info.json");
        if (h != null) {
            try {
                j(jSONObject, new JSONObject(h));
            } catch (JSONException e2) {
                W(e2);
            }
        }
    }

    public static void y(File file) {
        com.bytedance.crash.monitor.a e2 = l.e();
        if (e2 == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        Map<String, Object> e3 = e2.e();
        if (e3 != null) {
            try {
                for (String str : e3.keySet()) {
                    if (e3.get(str) != null) {
                        jSONObject.put(str, e3.get(str));
                    }
                }
                if (e3.containsKey("version_name")) {
                    jSONObject.put("crash_version_name", e3.get("version_name"));
                }
                if (e3.containsKey("update_version_code")) {
                    jSONObject.put("crash_update_version_code", e3.get("update_version_code"));
                }
                if (e3.containsKey("version_code")) {
                    jSONObject.put("crash_version_code", e3.get("version_code"));
                }
            } catch (Exception unused) {
            }
        }
        if (jSONObject.length() > 0) {
            try {
                com.bytedance.crash.util.a.x(new File(file, "common_params.json"), jSONObject.toString(), false);
            } catch (Exception unused2) {
            }
        }
    }

    public static JSONObject y0(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject != null && obj != null && !TextUtils.isEmpty(str)) {
            try {
                jSONObject.put(str, obj);
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public static void z(File file) {
        com.bytedance.crash.monitor.a e2 = l.e();
        if (e2 == null) {
            return;
        }
        if (new File(file.getAbsolutePath() + "/tags.txt").exists()) {
            return;
        }
        if (e2.j().H()) {
            NativeBridge.n(new File(file.getAbsolutePath() + "/tags.txt").getAbsolutePath());
            return;
        }
        if (I.l() != null) {
            return;
        }
        Map<String, String> t = e2.j().t();
        if (t.size() != 0) {
            f fVar = new f(file.getAbsolutePath() + "/filters.json");
            fVar.a('{');
            fVar.i("filters");
            boolean z = true;
            fVar.a('{');
            for (Map.Entry<String, String> entry : t.entrySet()) {
                if (z) {
                    z = false;
                } else {
                    fVar.a(',');
                }
                fVar.i(entry.getKey());
                fVar.j(entry.getValue());
            }
            fVar.a('}');
            fVar.a('}');
            fVar.h();
        }
    }

    public static void z0(JSONObject jSONObject, Map<? extends String, ?> map) {
        if (jSONObject != null) {
            try {
                for (Map.Entry<? extends String, ?> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (Throwable unused) {
            }
        }
    }
}
