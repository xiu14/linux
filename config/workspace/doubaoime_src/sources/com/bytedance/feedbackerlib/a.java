package com.bytedance.feedbackerlib;

import android.annotation.TargetApi;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.core.view.ViewCompat;
import com.bytedance.android.service.manager.pull.PullConfiguration;
import com.bytedance.apm.g;
import com.bytedance.apm.y.d;
import com.bytedance.common.utility.Logger;
import com.bytedance.feedbackerlib.manager.z;
import com.bytedance.frameworks.baselib.network.http.p.l;
import com.bytedance.lego.init.InitScheduler;
import com.bytedance.memory.e.a;
import com.bytedance.memory.shrink.e;
import com.bytedance.memory.shrink.f;
import com.bytedance.news.common.service.manager.IService;
import com.bytedance.news.common.service.manager.c;
import com.bytedance.retrofit2.H;
import com.bytedance.retrofit2.InterfaceC0701e;
import com.bytedance.retrofit2.InterfaceC0704h;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.h;
import com.bytedance.security.Sword.Sword;
import com.bytedance.services.apm.api.IApmAgent;
import com.bytedance.services.apm.api.b;
import com.bytedance.services.slardar.config.IConfigManager;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.bytedance.ttnet.utils.TTNetProtocolUtil$Service;
import com.facebook.drawee.drawable.B;
import com.facebook.drawee.drawable.C;
import com.facebook.drawee.drawable.C0714b;
import com.facebook.drawee.drawable.InterfaceC0716d;
import com.facebook.drawee.drawable.o;
import com.prolificinteractive.materialcalendarview.r;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.vivo.push.PushClient;
import com.vivo.push.PushClientConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.Inflater;
import java.util.zip.ZipFile;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {
    public static boolean A(String str, String str2, String str3) {
        JSONObject configJSON;
        JSONObject optJSONObject;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            try {
                IConfigManager iConfigManager = (IConfigManager) c.a(IConfigManager.class);
                if (iConfigManager == null || (configJSON = iConfigManager.getConfigJSON(str)) == null || (optJSONObject = configJSON.optJSONObject(str2)) == null) {
                    return false;
                }
                return optJSONObject.optInt(str3, 0) == 1;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    public static void A0(String str, String str2, int i, Map<String, String> map) {
        if (g.B()) {
            d.b("cloudmessage", e.a.a.a.a.s("report: commandId=", str), e.a.a.a.a.s(", message=", str2), e.a.a.a.a.j(", code=", i), ", specificParams=" + map);
        }
        e.h.a.j.c.b bVar = new e.h.a.j.c.b(0L, false, str, map != null ? new HashMap(map) : null);
        bVar.h(i);
        bVar.i(str2);
        e.h.a.j.a.c(bVar);
    }

    public static Field B(Class<?> cls, String str) {
        int i = Build.VERSION.SDK_INT;
        if (!(i >= 28 || (i == 27 && Build.VERSION.PREVIEW_SDK_INT > 0))) {
            return e.b.i.a.b.a(cls, str);
        }
        try {
            Field field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(cls, str);
            field.setAccessible(true);
            return field;
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public static void B0(String str, JSONObject jSONObject, int i, String str2) {
        try {
            com.bytedance.ttnet.d tTNetDepend = TTNetInit.getTTNetDepend();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("module_type", str);
            if (i != Integer.MAX_VALUE) {
                jSONObject2.put("code", i);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject2.put("message", str2);
            }
            jSONObject2.put("detail_log", jSONObject);
            if (Logger.debug()) {
                Logger.d("TTReportAllLog", jSONObject2.toString());
            }
            Objects.requireNonNull((com.bytedance.android.input.ttnet.d) tTNetDepend);
            com.bytedance.apm.c.d("ttnet_all_log", jSONObject2);
        } catch (Throwable unused) {
        }
    }

    public static String C() {
        Objects.requireNonNull(TTNetInit.getTTNetDepend());
        if (TextUtils.isEmpty("snssdk.com")) {
            throw new IllegalArgumentException("hostSuffix is not init !!!");
        }
        return "snssdk.com";
    }

    public static void C0(ZipFile zipFile) {
        if (zipFile == null) {
            return;
        }
        try {
            zipFile.close();
        } catch (Throwable unused) {
        }
    }

    public static JSONObject D(Map<String, List<String>> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    if (entry.getKey() == null) {
                        jSONObject.put("Response", entry.getValue());
                    } else {
                        jSONObject.put(entry.getKey().toString(), entry.getValue());
                    }
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return jSONObject;
    }

    public static void D0(@Nullable Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static String E(HashMap<String, String> hashMap) {
        JSONObject jSONObject = new JSONObject();
        if (hashMap != null) {
            try {
                for (String str : hashMap.keySet()) {
                    jSONObject.put(str, hashMap.get(str));
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return jSONObject.toString();
    }

    public static URI E0(String str) throws RuntimeException {
        if (com.bytedance.android.input.k.b.a.Y(str)) {
            return null;
        }
        try {
            try {
                return new URI(str);
            } catch (Exception unused) {
                return n(str);
            }
        } catch (URISyntaxException unused2) {
            return URI.create(str.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
        }
    }

    public static boolean F(String str) {
        return A("performance_modules", "memory", str) || com.bytedance.memory.a.a.j().g();
    }

    public static void F0(Context context, int i, String str) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            switch (i) {
                case 1:
                    linkedHashMap.put("ssids", str);
                    break;
                case 2:
                    linkedHashMap.put("dns", str);
                    break;
                case 3:
                    linkedHashMap.put("https_dns", str);
                    break;
                case 4:
                    linkedHashMap.put("tnc_config", str);
                    break;
                case 5:
                    linkedHashMap.put("tnc_etag", str);
                    break;
                case 6:
                    linkedHashMap.put("tnc_abtest", str);
                    break;
                case 7:
                    linkedHashMap.put("is_full_config", str);
                    break;
            }
            if (Logger.debug()) {
                Logger.d("PushService", "saveData = " + str);
            }
            Objects.requireNonNull((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend());
        } catch (Exception unused) {
        }
    }

    public static boolean G(String str) {
        return A("performance_modules", "memory", str);
    }

    public static void G0(String str, String str2, Map<String, String> map, Map<String, String> map2) throws IOException {
        String t = e.a.a.a.a.t("https://", str, str2);
        Pair<String, String> c2 = l.c(t, map);
        String str3 = (String) c2.first;
        String str4 = (String) c2.second;
        H j = RetrofitUtils.j(str3);
        if (j == null) {
            throw new IOException(e.a.a.a.a.s("Failed to get Retrofit instance for base URL: ", str3));
        }
        TTNetProtocolUtil$Service tTNetProtocolUtil$Service = (TTNetProtocolUtil$Service) j.e(TTNetProtocolUtil$Service.class);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.bytedance.retrofit2.client.b("x-ttnet-protocol-handler", PushClient.DEFAULT_REQUEST_ID));
        arrayList.add(new com.bytedance.retrofit2.client.b(Request.KEY_BYPASS_TTNET_FEATURES, PushClient.DEFAULT_REQUEST_ID));
        InterfaceC0701e<h> call = tTNetProtocolUtil$Service.getCall(str4, map, false, arrayList);
        try {
            try {
                call.execute();
            } catch (Exception e2) {
                throw new IOException("TTNet-protocol request execution failed for URL: " + t, e2);
            }
        } finally {
            call.cancel();
        }
    }

    public static int H(@NonNull Context context) {
        NetworkInfo activeNetworkInfo;
        NetworkInfo.State state;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable()) {
            return 0;
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
        if (networkInfo == null || (state = networkInfo.getState()) == null) {
            return 6;
        }
        return (state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING) ? 1 : 6;
    }

    public static void H0(String str, String str2, Map<String, String> map, Map<String, String> map2, InterfaceC0704h<h> interfaceC0704h) throws IOException {
        Pair<String, String> c2 = l.c("https://" + str + str2, null);
        String str3 = (String) c2.first;
        String str4 = (String) c2.second;
        H j = RetrofitUtils.j(str3);
        if (j == null) {
            throw new IOException(e.a.a.a.a.s("Failed to get Retrofit instance for base URL: ", str3));
        }
        TTNetProtocolUtil$Service tTNetProtocolUtil$Service = (TTNetProtocolUtil$Service) j.e(TTNetProtocolUtil$Service.class);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.bytedance.retrofit2.client.b("x-ttnet-protocol-handler", PushClient.DEFAULT_REQUEST_ID));
        arrayList.add(new com.bytedance.retrofit2.client.b(Request.KEY_BYPASS_TTNET_FEATURES, PushClient.DEFAULT_REQUEST_ID));
        tTNetProtocolUtil$Service.getCall(str4, null, false, arrayList).enqueue(interfaceC0704h);
    }

    @Nullable
    public static String I() {
        Object obj;
        try {
            obj = com.bytedance.feedbackerlib.util.g.c(Class.forName("android.app.ActivityThread"), "currentActivityThread", new Object[0]);
        } catch (Throwable unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        try {
            ApplicationInfo applicationInfo = (ApplicationInfo) com.bytedance.feedbackerlib.util.a.b(com.bytedance.feedbackerlib.util.a.b(obj, "mBoundApplication"), "appInfo");
            if (applicationInfo == null) {
                return null;
            }
            return applicationInfo.packageName;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void I0(Drawable drawable, Drawable.Callback callback, C c2) {
        if (drawable != 0) {
            drawable.setCallback(callback);
            if (drawable instanceof B) {
                ((B) drawable).b(c2);
            }
        }
    }

    @TargetApi(19)
    public static String J(Context context, Uri uri) {
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
                String[] split = DocumentsContract.getDocumentId(uri).split(Constants.COLON_SEPARATOR);
                if ("primary".equalsIgnoreCase(split[0])) {
                    return Environment.getExternalStorageDirectory() + "/" + split[1];
                }
            } else {
                if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
                    return y(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), null, null);
                }
                if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
                    String[] split2 = DocumentsContract.getDocumentId(uri).split(Constants.COLON_SEPARATOR);
                    String str = split2[0];
                    if ("image".equals(str)) {
                        uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if ("video".equals(str)) {
                        uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if ("audio".equals(str)) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                    return y(context, uri2, "_id=?", new String[]{split2[1]});
                }
            }
        } else {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                return y(context, uri, null, null);
            }
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    public static void J0(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i), -1, -1};
        int i2 = e.b.i.a.f.a.b;
        try {
            e.b.i.a.f.a.a(Class.forName("android.os.FileUtils"), "setPermissions", objArr);
        } catch (Exception e2) {
            Log.w("JavaCalls", e.a.a.a.a.u("Meet exception when call Method '", "setPermissions", "' in ", "android.os.FileUtils"), e2);
        }
    }

    public static com.huawei.b.b K(String str, String str2) {
        if (str == null) {
            if (str2 != null) {
                if (str2.contains("connect-drcn")) {
                    return com.huawei.b.b.f6949c;
                }
                if (str2.contains("connect-dre")) {
                    return com.huawei.b.b.f6950d;
                }
                if (str2.contains("connect-drru")) {
                    return com.huawei.b.b.f6951e;
                }
                if (str2.contains("connect-dra")) {
                    return com.huawei.b.b.f6952f;
                }
            }
            return com.huawei.b.b.b;
        }
        switch (str) {
            case "CN":
                return com.huawei.b.b.f6949c;
            case "DE":
                return com.huawei.b.b.f6950d;
            case "RU":
                return com.huawei.b.b.f6951e;
            case "SG":
                return com.huawei.b.b.f6952f;
            default:
                return com.huawei.b.b.b;
        }
    }

    public static void K0(@Nullable View view, int i) {
        ViewGroup.LayoutParams layoutParams;
        if (view == null || (layoutParams = view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    public static String L(String str, String str2) {
        try {
            Matcher matcher = Pattern.compile(".*(((" + str2 + "=[^;]*)|(" + str2 + "=\"[\";]*))|(" + str2 + "=.*$)).*").matcher(str);
            if (matcher.matches()) {
                return matcher.group(1);
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @WorkerThread
    public static File L0(@NonNull File file, @NonNull File file2) {
        FileInputStream fileInputStream;
        BufferedOutputStream bufferedOutputStream;
        FileInputStream fileInputStream2;
        BufferedOutputStream bufferedOutputStream2;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            P0("shrink_begin");
            a.c o = com.bytedance.memory.a.a.j().i().o();
            File file3 = new File(com.bytedance.memory.c.b.c().g(), ".mini.hprof");
            if (o == null || z("close_native_shrink")) {
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                        try {
                            new com.bytedance.memory.shrink.d(new BufferedInputStream(fileInputStream)).a(new e(new f(bufferedOutputStream)));
                            try {
                                bufferedOutputStream.close();
                            } catch (Throwable unused) {
                            }
                            try {
                                fileInputStream.close();
                            } catch (Throwable unused2) {
                            }
                            com.bytedance.memory.b.g.c(file2, file3, true);
                            com.bytedance.memory.heap.a.e().k(5);
                        } catch (Throwable th) {
                            th = th;
                            if (bufferedOutputStream != null) {
                                try {
                                    bufferedOutputStream.close();
                                } catch (Throwable unused3) {
                                }
                            }
                            if (fileInputStream == null) {
                                throw th;
                            }
                            try {
                                fileInputStream.close();
                                throw th;
                            } catch (Throwable unused4) {
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedOutputStream = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream = null;
                    bufferedOutputStream = null;
                }
            } else if (o.a(file, file3)) {
                com.bytedance.memory.heap.a.e().k(3);
            } else {
                try {
                    fileInputStream2 = new FileInputStream(file);
                    try {
                        bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file2));
                        try {
                            new com.bytedance.memory.shrink.d(new BufferedInputStream(fileInputStream2)).a(new e(new f(bufferedOutputStream2)));
                            try {
                                bufferedOutputStream2.close();
                            } catch (Throwable unused5) {
                            }
                            try {
                                fileInputStream2.close();
                            } catch (Throwable unused6) {
                            }
                            com.bytedance.memory.b.g.c(file2, file3, true);
                            com.bytedance.memory.heap.a.e().k(5);
                        } catch (Throwable th4) {
                            th = th4;
                            if (bufferedOutputStream2 != null) {
                                try {
                                    bufferedOutputStream2.close();
                                } catch (Throwable unused7) {
                                }
                            }
                            if (fileInputStream2 == null) {
                                throw th;
                            }
                            try {
                                fileInputStream2.close();
                                throw th;
                            } catch (Throwable unused8) {
                                throw th;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        bufferedOutputStream2 = null;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    fileInputStream2 = null;
                    bufferedOutputStream2 = null;
                }
            }
            P0("shrink_end");
            S0("shrink_time", System.currentTimeMillis() - currentTimeMillis);
            S0("origin_size", file.length() / DownloadConstants.KB);
            S0("shrink_size", file3.length() / DownloadConstants.KB);
            com.bytedance.memory.b.c.b("shrink hprof file %s, size: %dk to %s, size: %dk, use time:%d", file.getPath(), Long.valueOf(file.length() / DownloadConstants.KB), file3.getPath(), Long.valueOf(file3.length() / DownloadConstants.KB), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            if (!file3.exists() || file3.length() <= 0) {
                return null;
            }
            return file3;
        } catch (Exception e2) {
            com.bytedance.services.apm.api.a.e(e2, "shrink failed");
            e2.printStackTrace();
            return null;
        }
    }

    public static final boolean M(com.bytedance.lego.init.model.b bVar) {
        kotlin.s.c.l.g(bVar, "receiver$0");
        if (bVar.f5306d.contains("all")) {
            return true;
        }
        List<String> list = bVar.f5306d;
        InitScheduler initScheduler = InitScheduler.INSTANCE;
        if (list.contains(initScheduler.getConfig$initscheduler_release().getProcessName())) {
            return true;
        }
        if (initScheduler.getConfig$initscheduler_release().isMainProcess()) {
            return bVar.f5306d.contains(PullConfiguration.PROCESS_NAME_MAIN);
        }
        if (bVar.f5306d.contains("nonmain")) {
            return true;
        }
        int ordinal = initScheduler.getProcessMatchMode$initscheduler_release().ordinal();
        if (ordinal == 1) {
            List<String> list2 = bVar.f5306d;
            kotlin.s.c.l.b(list2, "runInProcess");
            for (String str : list2) {
                String processName = InitScheduler.INSTANCE.getConfig$initscheduler_release().getProcessName();
                kotlin.s.c.l.b(str, "it");
                if (kotlin.text.a.f(processName, str, true)) {
                    return true;
                }
            }
            return false;
        }
        if (ordinal != 2) {
            return false;
        }
        List<String> list3 = bVar.f5306d;
        kotlin.s.c.l.b(list3, "runInProcess");
        for (String str2 : list3) {
            String processName2 = InitScheduler.INSTANCE.getConfig$initscheduler_release().getProcessName();
            kotlin.s.c.l.b(str2, "it");
            if (kotlin.text.a.c(processName2, str2, true)) {
                return true;
            }
        }
        return false;
    }

    public static long M0(InputStream inputStream, long j) throws IOException {
        e.c.c.d.h.a(j >= 0);
        long j2 = j;
        while (j2 > 0) {
            long skip = inputStream.skip(j2);
            if (skip <= 0) {
                if (inputStream.read() == -1) {
                    return j - j2;
                }
                skip = 1;
            }
            j2 -= skip;
        }
        return j;
    }

    public static final boolean N(com.bytedance.lego.init.model.f fVar) {
        kotlin.s.c.l.g(fVar, "receiver$0");
        if (fVar.f5314e.contains("all")) {
            return true;
        }
        List<String> list = fVar.f5314e;
        InitScheduler initScheduler = InitScheduler.INSTANCE;
        if (list.contains(initScheduler.getConfig$initscheduler_release().getProcessName())) {
            return true;
        }
        if (initScheduler.getConfig$initscheduler_release().isMainProcess()) {
            return fVar.f5314e.contains(PullConfiguration.PROCESS_NAME_MAIN);
        }
        if (fVar.f5314e.contains("nonmain")) {
            return true;
        }
        int ordinal = initScheduler.getProcessMatchMode$initscheduler_release().ordinal();
        if (ordinal == 1) {
            List<String> list2 = fVar.f5314e;
            kotlin.s.c.l.b(list2, "runInProcess");
            for (String str : list2) {
                String processName = InitScheduler.INSTANCE.getConfig$initscheduler_release().getProcessName();
                kotlin.s.c.l.b(str, "it");
                if (kotlin.text.a.f(processName, str, true)) {
                    return true;
                }
            }
            return false;
        }
        if (ordinal != 2) {
            return false;
        }
        List<String> list3 = fVar.f5314e;
        kotlin.s.c.l.b(list3, "runInProcess");
        for (String str2 : list3) {
            String processName2 = InitScheduler.INSTANCE.getConfig$initscheduler_release().getProcessName();
            kotlin.s.c.l.b(str2, "it");
            if (kotlin.text.a.c(processName2, str2, true)) {
                return true;
            }
        }
        return false;
    }

    public static String N0(InputStream inputStream, String str) throws UnsupportedEncodingException, IOException {
        StringWriter stringWriter = new StringWriter();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, str);
        char[] cArr = new char[4096];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (-1 == read) {
                return stringWriter.toString();
            }
            stringWriter.write(cArr, 0, read);
        }
    }

    public static boolean O(byte[] bArr, byte[] bArr2, int i) {
        Objects.requireNonNull(bArr);
        Objects.requireNonNull(bArr2);
        if (bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static String O0(byte[] bArr) {
        Inflater inflater = new Inflater();
        inflater.reset();
        inflater.setInput(bArr, 0, bArr.length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        try {
            try {
                byte[] bArr2 = new byte[1024];
                while (!inflater.finished()) {
                    byteArrayOutputStream.write(bArr2, 0, inflater.inflate(bArr2));
                }
                bArr = byteArrayOutputStream.toByteArray();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            inflater.end();
            return new String(bArr);
        } finally {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        }
    }

    public static int P(int i, int i2) {
        return ((i + 31) * 31) + i2;
    }

    public static void P0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            IApmAgent iApmAgent = (IApmAgent) c.a(IApmAgent.class);
            if (iApmAgent != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(str, 1);
                iApmAgent.monitorEvent("memory_dump_event", jSONObject, null, null);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static byte[] Q(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        try {
            String upperCase = str.toUpperCase(Locale.ENGLISH);
            int length = upperCase.length() / 2;
            byte[] bArr = new byte[length];
            try {
                byte[] bytes = upperCase.getBytes("UTF-8");
                for (int i = 0; i < length; i++) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("0x");
                    int i2 = i * 2;
                    sb.append(new String(new byte[]{bytes[i2]}, "UTF-8"));
                    bArr[i] = (byte) (((byte) (Byte.decode(sb.toString()).byteValue() << 4)) ^ Byte.decode("0x" + new String(new byte[]{bytes[i2 + 1]}, "UTF-8")).byteValue());
                }
                return bArr;
            } catch (UnsupportedEncodingException | NumberFormatException e2) {
                StringBuilder M = e.a.a.a.a.M("hex string 2 byte array exception : ");
                M.append(e2.getMessage());
                com.huawei.e.a.a.a.d.d.a("HexUtil", M.toString());
                return new byte[0];
            }
        } catch (Throwable th) {
            StringBuilder M2 = e.a.a.a.a.M("hex string toUpperCase exception : ");
            M2.append(th.getMessage());
            com.huawei.e.a.a.a.d.d.a("HexUtil", M2.toString());
            return new byte[0];
        }
    }

    public static void Q0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            IApmAgent iApmAgent = (IApmAgent) c.a(IApmAgent.class);
            if (iApmAgent != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(str, 1);
                b.C0316b a = com.bytedance.services.apm.api.b.a();
                a.f("memory_dump_event");
                a.e(jSONObject);
                a.d(true);
                iApmAgent.monitorEvent(new com.bytedance.services.apm.api.b(a));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void R(@NonNull String str, @NonNull String str2) {
        Log.i("feedbacker.tag", "==> " + str + " i: " + str2);
    }

    public static boolean R0(String str, File file, String str2, String str3) {
        if (g.B()) {
            StringBuilder M = e.a.a.a.a.M("postFile=");
            M.append(file.getAbsolutePath());
            d.b("cloudmessage", e.a.a.a.a.s("postFile: commandId=", str), M.toString(), e.a.a.a.a.s(", uploadMessage=", str3), e.a.a.a.a.s(", fileType=", str2));
        }
        return e.h.a.j.d.a.d(file, 1, str2, str, str3, System.currentTimeMillis(), null);
    }

    public static final <T extends IService> T S(kotlin.reflect.c<T> cVar) {
        kotlin.s.c.l.g(cVar, "receiver$0");
        return (T) c.a(r.O(cVar));
    }

    public static void S0(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            IApmAgent iApmAgent = (IApmAgent) c.a(IApmAgent.class);
            if (iApmAgent != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(str, j);
                iApmAgent.monitorEvent("memory_dump_event", null, jSONObject, null);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static boolean T(String str, String str2) {
        try {
            if (str != null && str2 != null) {
                return Pattern.compile(str2).matcher(str).find();
            }
            com.bytedance.push.g0.f.m("PatternUtils", "[inputMatchRegText]return false because  input or reg is null,input:" + str + " reg:" + str2);
            return false;
        } catch (Throwable th) {
            com.bytedance.push.g0.f.f("PatternUtils", "[match]inputMatchRegText match exception ", th);
            return false;
        }
    }

    public static void T0(File file, e.c.c.c.a aVar) {
        aVar.b(file);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    T0(file2, aVar);
                } else {
                    aVar.a(file2);
                }
            }
        }
        aVar.c(file);
    }

    public static boolean U(List<?> list) {
        return list == null || list.size() == 0;
    }

    public static boolean V(List<?> list) {
        return list == null || list.size() == 0;
    }

    public static boolean W() {
        String str = Build.BRAND;
        if (!TextUtils.isEmpty(str) && str.toLowerCase().contains("honor")) {
            return true;
        }
        String str2 = Build.MODEL;
        if (!TextUtils.isEmpty(str2) && str2.toLowerCase().contains("honor")) {
            return true;
        }
        String str3 = Build.MANUFACTURER;
        return !TextUtils.isEmpty(str3) && str3.toLowerCase().contains("honor");
    }

    public static boolean X(int i, int i2, com.facebook.imagepipeline.common.e eVar) {
        return eVar == null ? ((float) v(i)) >= 2048.0f && v(i2) >= 2048 : v(i) >= eVar.a && v(i2) >= eVar.b;
    }

    public static boolean Y(com.facebook.imagepipeline.image.f fVar, com.facebook.imagepipeline.common.e eVar) {
        if (fVar == null) {
            return false;
        }
        int G = fVar.G();
        return (G == 90 || G == 270) ? X(fVar.x(), fVar.N(), eVar) : X(fVar.N(), fVar.x(), eVar);
    }

    public static boolean Z(Context context, String str) {
        if (context == null) {
            return false;
        }
        PackageInfo packageInfo = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            } catch (Exception unused) {
                return false;
            }
        }
        return packageInfo != null && packageInfo.applicationInfo.enabled;
    }

    public static void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
                com.huawei.e.a.a.b.g.b.c("IOUtil", "closeSecure IOException");
            }
        }
    }

    public static final boolean a0(com.bytedance.lego.init.model.f fVar) {
        kotlin.s.c.l.g(fVar, "receiver$0");
        return kotlin.s.c.l.a("init_shceduler_internal_task", fVar.b);
    }

    public static void b(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
                com.huawei.e.a.a.b.g.b.c("IOUtil", "closeSecure IOException");
            }
        }
    }

    public static boolean b0(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo("com.ss.android.lark", 0) != null;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean c(String[] strArr) {
        return true;
    }

    public static boolean c0(@NonNull Context context) {
        return context == null || context.getApplicationContext() == null || H(context) == 0;
    }

    public static byte[] d(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("ASCII not found!", e2);
        }
    }

    public static boolean d0() {
        String str = Build.BRAND;
        if (!TextUtils.isEmpty(str) && str.toLowerCase().contains("vivo")) {
            return true;
        }
        String str2 = Build.MODEL;
        if (!TextUtils.isEmpty(str2) && str2.toLowerCase().contains("vivo")) {
            return true;
        }
        String str3 = Build.MANUFACTURER;
        return !TextUtils.isEmpty(str3) && str3.toLowerCase().contains("vivo");
    }

    public static String e(boolean z) {
        return Boolean.valueOf(z).toString();
    }

    public static void e0(@NonNull String str, @Nullable Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            com.bytedance.framwork.core.sdkmonitor.f b = z.b();
            b.T(str, 0, new JSONObject(), null, null);
            b.y();
        } catch (RuntimeException unused) {
        }
    }

    public static String f(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static void f0(@NonNull String str, @NonNull String str2, String... strArr) {
        com.bytedance.framwork.core.sdkmonitor.f b = z.b();
        if (b == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("logID", str);
            jSONObject.put(com.heytap.mcssdk.constant.b.i, str2);
            jSONObject.put("args", Arrays.asList(strArr));
        } catch (Throwable unused) {
        }
        b.O("feedbacker_float_window_hide", null, null, jSONObject);
        b.y();
    }

    public static long g(long j, long j2) {
        if (j == -1 || j2 == -1 || j > j2) {
            return -1L;
        }
        return o0(j2 - j);
    }

    public static void g0(@NonNull String str, @NonNull String str2, String... strArr) {
        com.bytedance.framwork.core.sdkmonitor.f b = z.b();
        if (b == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("logID", str);
            jSONObject.put(com.heytap.mcssdk.constant.b.i, str2);
            jSONObject.put("args", Arrays.asList(strArr));
        } catch (Throwable unused) {
        }
        b.O("feedbacker_float_window_show", null, null, jSONObject);
        b.y();
    }

    public static void h(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void h0(@NonNull String str, @NonNull String str2, String... strArr) {
        com.bytedance.framwork.core.sdkmonitor.f b = z.b();
        if (b == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("logID", str);
            jSONObject.put(com.heytap.mcssdk.constant.b.i, str2);
            jSONObject.put("args", Arrays.asList(strArr));
        } catch (Throwable unused) {
        }
        b.O("feedbacker_module_classification", null, null, jSONObject);
        b.y();
    }

    public static <T> T i(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException(str);
    }

    public static void i0(@NonNull String str, @NonNull String str2, String... strArr) {
        com.bytedance.framwork.core.sdkmonitor.f b = z.b();
        if (b == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("logID", str);
            jSONObject.put(com.heytap.mcssdk.constant.b.i, str2);
            jSONObject.put("args", Arrays.asList(strArr));
        } catch (Throwable unused) {
        }
        b.O("feedbacker_record", null, null, jSONObject);
        b.y();
    }

    public static <T> T j(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(e.a.a.a.a.s(str, " must not be null"));
    }

    public static void j0(@NonNull String str, @NonNull String str2, String... strArr) {
        com.bytedance.framwork.core.sdkmonitor.f b = z.b();
        if (b == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("logID", str);
            jSONObject.put(com.heytap.mcssdk.constant.b.i, str2);
            jSONObject.put("args", Arrays.asList(strArr));
        } catch (Throwable unused) {
        }
        b.O("feedbacker_sso", null, null, jSONObject);
        b.y();
    }

    public static void k(BufferedReader bufferedReader) {
        try {
            bufferedReader.close();
        } catch (Exception e2) {
            String stackTraceString = Log.getStackTraceString(e2);
            int i = e.b.o.a.d.b.b;
            Log.e("watson_assist", stackTraceString);
        }
    }

    public static void k0(String str, long j) {
        com.bytedance.framwork.core.sdkmonitor.f b = z.b();
        if (b == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("sso_log_id", str);
            jSONObject2.put("duration", j + "");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        b.T("sso_succeed", 0, new JSONObject(), jSONObject2, jSONObject);
        b.y();
    }

    public static void l(Drawable drawable, Drawable drawable2) {
        if (drawable == null || drawable == drawable2) {
            return;
        }
        drawable.setBounds(drawable2.getBounds());
        drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
        drawable.setLevel(drawable2.getLevel());
        drawable.setVisible(drawable2.isVisible(), false);
        drawable.setState(drawable2.getState());
    }

    public static void l0(@NonNull String str, @NonNull String str2, String... strArr) {
        com.bytedance.framwork.core.sdkmonitor.f b = z.b();
        if (b == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("logID", str);
            jSONObject.put(com.heytap.mcssdk.constant.b.i, str2);
            jSONObject.put("args", Arrays.asList(strArr));
        } catch (Throwable unused) {
        }
        b.O("feedbacker_submit_feedback", null, null, jSONObject);
        b.y();
    }

    public static File m(Context context) {
        String J2 = e.a.a.a.a.J(new StringBuilder(), context.getApplicationInfo().dataDir, "/shared_prefs");
        String J3 = e.a.a.a.a.J(new StringBuilder(), context.getApplicationInfo().dataDir, "/spFiles");
        String J4 = e.a.a.a.a.J(e.a.a.a.a.M(J3), File.separator, "/tmp");
        File file = new File(J2);
        if (file.exists()) {
            for (File file2 : file.listFiles()) {
                String name = file2.getName();
                if (name.endsWith(".xml") && !com.monitor.cloudmessage.utils.a.c(file2.getAbsolutePath(), J4, name)) {
                    return null;
                }
            }
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(J3);
            String str = File.separator;
            sb.append(str);
            sb.append("sp.zip");
            com.monitor.cloudmessage.utils.a.i(J4, sb.toString());
            com.monitor.cloudmessage.utils.a.g(J4);
            return new File(e.a.a.a.a.t(J3, str, "sp.zip"));
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static void m0(File file) throws e.c.c.c.b {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            if (!file.delete()) {
                throw new e.c.c.c.b(file.getAbsolutePath(), new e.c.c.c.c(file.getAbsolutePath()));
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new e.c.c.c.b(file.getAbsolutePath());
        }
    }

    public static URI n(String str) throws RuntimeException {
        if (com.bytedance.android.input.k.b.a.Y(str)) {
            return null;
        }
        try {
            int indexOf = str.indexOf("?");
            if (indexOf > 0) {
                str = str.substring(0, indexOf);
            }
            return URI.create(str);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public static int n0(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & ViewCompat.MEASURED_SIZE_MASK;
        }
        return (i & ViewCompat.MEASURED_SIZE_MASK) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }

    public static String o(byte[] bArr) {
        try {
            byte[] decode = Base64.decode(bArr, 0);
            byte[] bArr2 = new byte[0];
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec("yuNttCSojTyxZods".getBytes(), "AES");
                Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
                cipher.init(2, secretKeySpec);
                bArr2 = cipher.doFinal(decode);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            String str = new String(bArr2);
            int indexOf = str.indexOf("$");
            return indexOf != -1 ? str.substring(0, indexOf) : str;
        } catch (Exception e3) {
            e3.printStackTrace();
            return "";
        }
    }

    public static long o0(long j) {
        if (j == -1) {
            return -1L;
        }
        return j / 1000;
    }

    public static byte[] p(byte[] bArr, int i) {
        if (bArr != null && bArr.length != 0) {
            try {
                return Sword.clientUnpackedBase64(new String(bArr, i, bArr.length - i));
            } catch (Throwable th) {
                StringBuilder M = e.a.a.a.a.M("decrypt error:");
                M.append(Log.getStackTraceString(th));
                com.bytedance.push.g0.f.e("", M.toString());
            }
        }
        return null;
    }

    public static long p0(long j) {
        if (j == -1) {
            return -1L;
        }
        return j / 1000000;
    }

    public static boolean q(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                z &= r(file2);
            }
        }
        return z;
    }

    public static void q0(String str, String str2) {
        Log.d("EventReportUtil", e.a.a.a.a.v("onEvent() called with: event = [", str, "], from = [", str2, "]"));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("trigger", str2);
            com.bytedance.praisedialoglib.manager.a.j().H(str, jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static boolean r(File file) {
        if (file.isDirectory()) {
            q(file);
        }
        return file.delete();
    }

    public static void r0(String str) {
        Log.d("EventReportUtil", "onMarketEvent() called with: pkgName = [" + str + "]");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(PushClientConstants.TAG_PKG_NAME, str);
            com.bytedance.praisedialoglib.manager.a.j().H("evaluate_jump_market", jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static void s(@NonNull String str, @Nullable String str2, @Nullable Throwable th) {
        Log.e("feedbacker.tag", e.a.a.a.a.u("==> ", str, " e: ", str2), th);
    }

    public static BufferedReader s0(File file) {
        if (file == null) {
            return null;
        }
        if (!file.exists()) {
            StringBuilder M = e.a.a.a.a.M("file:");
            M.append(file.getName());
            M.append(" not exist");
            String sb = M.toString();
            int i = e.b.o.a.d.b.b;
            Log.w("watson_assist", sb);
            return null;
        }
        if (file.canRead()) {
            try {
                return new BufferedReader(new FileReader(file), 10000);
            } catch (Exception e2) {
                String stackTraceString = Log.getStackTraceString(e2);
                int i2 = e.b.o.a.d.b.b;
                Log.e("watson_assist", stackTraceString);
                return null;
            }
        }
        StringBuilder M2 = e.a.a.a.a.M("file:");
        M2.append(file.getName());
        M2.append(" can not read");
        String sb2 = M2.toString();
        int i3 = e.b.o.a.d.b.b;
        Log.w("watson_assist", sb2);
        return null;
    }

    public static boolean t(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    @Nullable
    public static List<String> t0(JSONObject jSONObject, String str) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray(str);
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                return null;
            }
            int length = optJSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                String string = optJSONArray.getString(i);
                if (!TextUtils.isEmpty(string)) {
                    arrayList.add(string);
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String u(String str) {
        int i = 0;
        if (str.length() > 0) {
            while (str.charAt(i) == '/') {
                i++;
            }
        }
        StringBuilder M = e.a.a.a.a.M("/");
        M.append(str.substring(i));
        return M.toString();
    }

    @Nullable
    public static List<Pattern> u0(JSONObject jSONObject, String str) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray(str);
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                return null;
            }
            int length = optJSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                String string = optJSONArray.getString(i);
                if (!TextUtils.isEmpty(string)) {
                    arrayList.add(Pattern.compile(string));
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    public static int v(int i) {
        return (int) (i * 1.3333334f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> void v0(Map<K, V> map, Map<K, V> map2) {
        if (map == null || map2 == 0 || map2.isEmpty()) {
            return;
        }
        map.putAll(map2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static o w(Drawable drawable) {
        if (drawable == 0) {
            return null;
        }
        if (drawable instanceof o) {
            return (o) drawable;
        }
        if (drawable instanceof InterfaceC0716d) {
            return w(((InterfaceC0716d) drawable).l());
        }
        if (drawable instanceof C0714b) {
            C0714b c0714b = (C0714b) drawable;
            int e2 = c0714b.e();
            for (int i = 0; i < e2; i++) {
                o w = w(c0714b.a(i));
                if (w != null) {
                    return w;
                }
            }
        }
        return null;
    }

    public static int w0(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("len is negative");
        }
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i + i3, i2 - i3);
            if (read == -1) {
                break;
            }
            i3 += read;
        }
        return i3;
    }

    public static String x(Context context, int i) {
        Object obj = null;
        switch (i) {
            case 1:
                Objects.requireNonNull(TTNetInit.getTTNetDepend());
                break;
            case 2:
                Objects.requireNonNull(TTNetInit.getTTNetDepend());
                break;
            case 3:
                Objects.requireNonNull(TTNetInit.getTTNetDepend());
                break;
            case 4:
                Objects.requireNonNull(TTNetInit.getTTNetDepend());
                break;
            case 5:
                Objects.requireNonNull(TTNetInit.getTTNetDepend());
                break;
            case 6:
                Objects.requireNonNull(TTNetInit.getTTNetDepend());
                break;
            case 7:
                Objects.requireNonNull(TTNetInit.getTTNetDepend());
                break;
            default:
                obj = "";
                break;
        }
        return obj instanceof String ? String.valueOf(obj) : "";
    }

    public static void x0(String str, e.b.o.a.d.c cVar) {
        BufferedReader s0;
        if (str == null || (s0 = s0(new File(str))) == null) {
            return;
        }
        boolean z = true;
        while (z) {
            try {
                String readLine = s0.readLine();
                if (readLine == null) {
                    break;
                } else {
                    z = cVar.a(readLine);
                }
            } catch (IOException e2) {
                String stackTraceString = Log.getStackTraceString(e2);
                int i = e.b.o.a.d.b.b;
                Log.e("watson_assist", stackTraceString);
            }
        }
        k(s0);
    }

    public static String y(Context context, Uri uri, String str, String[] strArr) {
        Cursor cursor = null;
        try {
            Cursor query = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndexOrThrow("_data"));
                        query.close();
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static <L, O> boolean y0(Collection<L> collection, O o, com.bytedance.framwork.core.sdklib.util.a<? super L, O> aVar) {
        Iterator<L> it2 = collection.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            if (aVar.a(it2.next(), o)) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean z(String str) {
        return A("custom_event_settings", "allow_service_name", str);
    }

    public static void z0(File file, File file2) throws e.c.c.c.e {
        Objects.requireNonNull(file);
        file2.delete();
        if (file.renameTo(file2)) {
            return;
        }
        Throwable th = null;
        if (file2.exists()) {
            th = new e.c.c.c.c(file2.getAbsolutePath());
        } else if (!file.getParentFile().exists()) {
            th = new e.c.c.c.d(file.getAbsolutePath());
        } else if (!file.exists()) {
            th = new FileNotFoundException(file.getAbsolutePath());
        }
        StringBuilder M = e.a.a.a.a.M("Unknown error renaming ");
        M.append(file.getAbsolutePath());
        M.append(" to ");
        M.append(file2.getAbsolutePath());
        throw new e.c.c.c.e(M.toString(), th);
    }
}
