package com.xiaomi.push;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.SystemClock;
import android.telephony.SubscriptionManager;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes2.dex */
public class ax {
    private static final AtomicReference<a<ay>> a = new AtomicReference<>(m109a());

    /* renamed from: a, reason: collision with other field name */
    public static final Pattern f133a = Pattern.compile("([^\\s;]+)(.*)");
    public static final Pattern b = Pattern.compile("(.*?charset\\s*=[^a-zA-Z0-9]*)([-a-zA-Z0-9]+)(.*)", 2);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f8992c = Pattern.compile("(\\<\\?xml\\s+.*?encoding\\s*=[^a-zA-Z0-9]*)([-a-zA-Z0-9]+)(.*)", 2);

    private static class a<T> extends FutureTask<T> {
        private long a;

        public a(Callable<T> callable) {
            super(callable);
        }

        public boolean a() {
            return k.m655a(t.m841a()) || (isDone() && Math.abs(SystemClock.elapsedRealtime() - this.a) > 1800000);
        }

        @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            this.a = SystemClock.elapsedRealtime();
            super.run();
        }
    }

    public static final class b extends FilterInputStream {
        private boolean a;

        public b(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int read;
            if (!this.a && (read = super.read(bArr, i, i2)) != -1) {
                return read;
            }
            this.a = true;
            return -1;
        }
    }

    public static class c {
        public int a;

        /* renamed from: a, reason: collision with other field name */
        public Map<String, String> f134a;

        public String toString() {
            return String.format("resCode = %1$d, headers = %2$s", Integer.valueOf(this.a), this.f134a.toString());
        }
    }

    public static InputStream a(Context context, URL url, boolean z, String str, String str2) {
        return a(context, url, z, str, str2, null, null);
    }

    /* renamed from: b, reason: collision with other method in class */
    public static void m119b() {
        a.set(m109a());
    }

    public static boolean c(Context context) {
        ay m110a = m110a();
        return m110a != null && m110a.m123a();
    }

    public static boolean d(Context context) {
        return d(m110a());
    }

    public static boolean e(ay ayVar) {
        return ayVar != null && ayVar.m123a() && ayVar.a() == 0;
    }

    public static boolean f(ay ayVar) {
        return ayVar != null && ayVar.a() == 0 && 20 == ayVar.b();
    }

    public static boolean g(ay ayVar) {
        return ayVar != null && ayVar.a() == 0 && 13 == ayVar.b();
    }

    public static boolean h(ay ayVar) {
        if (ayVar == null || ayVar.a() != 0) {
            return false;
        }
        String m124b = ayVar.m124b();
        if (!"TD-SCDMA".equalsIgnoreCase(m124b) && !"CDMA2000".equalsIgnoreCase(m124b) && !"WCDMA".equalsIgnoreCase(m124b)) {
            switch (ayVar.b()) {
            }
            return false;
        }
        return true;
    }

    public static boolean i(ay ayVar) {
        if (ayVar == null || ayVar.a() != 0) {
            return false;
        }
        int b2 = ayVar.b();
        return b2 == 1 || b2 == 2 || b2 == 4 || b2 == 7 || b2 == 11;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m115a() {
        m119b();
    }

    public static boolean b(ay ayVar) {
        boolean z;
        ConnectivityManager connectivityManager;
        NetworkCapabilities networkCapabilities;
        if (ayVar == null) {
            return false;
        }
        Context m841a = t.m841a();
        if (m841a != null && (connectivityManager = (ConnectivityManager) m841a.getSystemService("connectivity")) != null) {
            try {
                networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            } catch (Exception unused) {
            }
            if (networkCapabilities != null) {
                z = networkCapabilities.hasCapability(16);
                return z && c(ayVar);
            }
        }
        z = false;
        if (z) {
            return false;
        }
    }

    public static boolean d(ay ayVar) {
        return ayVar != null && 1 == ayVar.a();
    }

    public static boolean e(Context context) {
        return f(m110a());
    }

    /* renamed from: a, reason: collision with other method in class */
    public static Object m111a(Context context) {
        if (context == null) {
            context = t.m841a();
        }
        ConnectivityManager.NetworkCallback networkCallback = null;
        if (context == null || k.m655a(context)) {
            return null;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkRequest build = new NetworkRequest.Builder().build();
            ConnectivityManager.NetworkCallback networkCallback2 = new ConnectivityManager.NetworkCallback() { // from class: com.xiaomi.push.ax.1
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network) {
                    super.onAvailable(network);
                    ax.m119b();
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network) {
                    super.onLost(network);
                    ax.m119b();
                }
            };
            try {
                connectivityManager.registerNetworkCallback(build, networkCallback2);
                return networkCallback2;
            } catch (Throwable th) {
                th = th;
                networkCallback = networkCallback2;
                com.xiaomi.channel.commonutils.logger.c.m15a("exception occurred in adding network callback :" + th);
                return networkCallback;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean c(ay ayVar) {
        return ayVar != null && ayVar.m123a();
    }

    public static boolean f(Context context) {
        return g(m110a());
    }

    public static boolean g(Context context) {
        return h(m110a());
    }

    public static boolean b(Context context) {
        return b(m110a());
    }

    public static boolean h(Context context) {
        return i(m110a());
    }

    public static void a(Context context, Object obj) {
        if (context == null || obj == null) {
            return;
        }
        try {
            if (obj instanceof ConnectivityManager.NetworkCallback) {
                ((ConnectivityManager) context.getSystemService("connectivity")).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) obj);
            }
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.c.m15a("exception occurred in removing network callback :" + th);
        }
    }

    public static int b() {
        try {
            Object a2 = bh.a("android.telephony.SubscriptionManager", "getPhoneId", Integer.valueOf(SubscriptionManager.getDefaultDataSubscriptionId()));
            if (a2 instanceof Integer) {
                return ((Integer) a2).intValue();
            }
            return -1;
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.c.d("exception occurred when get phone card number. " + th);
            return -1;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private static a<ay> m109a() {
        return new a<>(new Callable<ay>() { // from class: com.xiaomi.push.ax.2
            @Override // java.util.concurrent.Callable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ay call() {
                NetworkInfo activeNetworkInfo;
                Context m841a = t.m841a();
                if (m841a == null) {
                    return null;
                }
                try {
                    ConnectivityManager connectivityManager = (ConnectivityManager) m841a.getSystemService("connectivity");
                    if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                        return null;
                    }
                    return new ay(activeNetworkInfo);
                } catch (Exception unused) {
                    return null;
                }
            }
        });
    }

    /* renamed from: a, reason: collision with other method in class */
    public static ay m110a() {
        if (t.m841a() == null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("SDK not initialized");
            return null;
        }
        AtomicReference<a<ay>> atomicReference = a;
        a<ay> aVar = atomicReference.get();
        if (aVar == null) {
            return null;
        }
        try {
            if (aVar.a()) {
                aVar = m109a();
                atomicReference.set(aVar);
            }
            if (!aVar.isDone()) {
                aVar.run();
            }
            return aVar.get();
        } catch (Exception unused) {
            return null;
        }
    }

    public static InputStream a(Context context, URL url, boolean z, String str, String str2, Map<String, String> map, c cVar) {
        if (context == null) {
            throw new IllegalArgumentException("context");
        }
        if (url != null) {
            URL url2 = !z ? new URL(a(url.toString())) : url;
            try {
                HttpURLConnection.setFollowRedirects(true);
                HttpURLConnection m113a = m113a(context, url2);
                m113a.setConnectTimeout(10000);
                m113a.setReadTimeout(15000);
                if (!TextUtils.isEmpty(str)) {
                    m113a.setRequestProperty(DownloadConstants.USER_AGENT, str);
                }
                if (str2 != null) {
                    m113a.setRequestProperty("Cookie", str2);
                }
                if (map != null) {
                    for (String str3 : map.keySet()) {
                        m113a.setRequestProperty(str3, map.get(str3));
                    }
                }
                if (cVar != null && (url.getProtocol().equals("http") || url.getProtocol().equals("https"))) {
                    cVar.a = m113a.getResponseCode();
                    if (cVar.f134a == null) {
                        cVar.f134a = new HashMap();
                    }
                    int i = 0;
                    while (true) {
                        String headerFieldKey = m113a.getHeaderFieldKey(i);
                        String headerField = m113a.getHeaderField(i);
                        if (headerFieldKey == null && headerField == null) {
                            break;
                        }
                        if (!TextUtils.isEmpty(headerFieldKey) && !TextUtils.isEmpty(headerField)) {
                            cVar.f134a.put(headerFieldKey, headerField);
                        }
                        i++;
                    }
                }
                return new b(m113a.getInputStream());
            } catch (IOException e2) {
                StringBuilder M = e.a.a.a.a.M("IOException:");
                M.append(e2.getClass().getSimpleName());
                throw new IOException(M.toString());
            } catch (Throwable th) {
                throw new IOException(th.getMessage());
            }
        }
        throw new IllegalArgumentException("url");
    }

    public static String a(Context context, URL url) {
        return a(context, url, false, null, "UTF-8", null);
    }

    public static String a(Context context, URL url, boolean z, String str, String str2, String str3) {
        InputStream inputStream;
        try {
            inputStream = a(context, url, z, str, str3);
            try {
                StringBuilder sb = new StringBuilder(1024);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, str2));
                char[] cArr = new char[4096];
                while (true) {
                    int read = bufferedReader.read(cArr);
                    if (-1 != read) {
                        sb.append(cArr, 0, read);
                    } else {
                        y.a((Closeable) inputStream);
                        return sb.toString();
                    }
                }
            } catch (Throwable th) {
                th = th;
                y.a((Closeable) inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        new String();
        return String.format("%s&key=%s", str, bl.a(String.format("%sbe988a6134bc8254465424e5a70ef037", str)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String a(String str, Map<String, String> map, File file, String str2) {
        if (!file.exists()) {
            return null;
        }
        String name = file.getName();
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
                httpURLConnection.setRequestProperty(DownloadHelper.CONTENT_TYPE, "multipart/form-data;boundary=*****");
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                httpURLConnection.setFixedLengthStreamingMode(name.length() + 77 + ((int) file.length()) + str2.length());
                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                dataOutputStream.writeBytes("--*****\r\n");
                dataOutputStream.writeBytes("Content-Disposition: form-data; name=\"" + str2 + "\";filename=\"" + file.getName() + "\"\r\n");
                dataOutputStream.writeBytes("\r\n");
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        dataOutputStream.write(bArr, 0, read);
                        dataOutputStream.flush();
                    }
                    dataOutputStream.writeBytes("\r\n");
                    dataOutputStream.writeBytes("--");
                    dataOutputStream.writeBytes("*****");
                    dataOutputStream.writeBytes("--");
                    dataOutputStream.writeBytes("\r\n");
                    dataOutputStream.flush();
                    StringBuffer stringBuffer = new StringBuffer();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new b(httpURLConnection.getInputStream())));
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                stringBuffer.append(readLine);
                            } else {
                                String stringBuffer2 = stringBuffer.toString();
                                y.a((Closeable) fileInputStream);
                                y.a(bufferedReader);
                                return stringBuffer2;
                            }
                        } catch (IOException e2) {
                            e = e2;
                            throw new IOException("IOException:" + e.getClass().getSimpleName());
                        } catch (Throwable th) {
                            th = th;
                            throw new IOException(th.getMessage());
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                y.a((Closeable) null);
                y.a((Closeable) file);
                throw th3;
            }
        } catch (IOException e4) {
            e = e4;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static int a(Context context) {
        return a(m110a());
    }

    public static int a(ay ayVar) {
        if (ayVar == null) {
            return -1;
        }
        return ayVar.a();
    }

    /* renamed from: a, reason: collision with other method in class */
    public static HttpURLConnection m113a(Context context, URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m117a(Context context) {
        return a(context) >= 0;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m118a(ay ayVar) {
        return a(ayVar) >= 0;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m116a() {
        return e(m110a());
    }

    /* renamed from: a, reason: collision with other method in class */
    public static String m112a(Context context) {
        if (d(context)) {
            return "wifi";
        }
        ay m110a = m110a();
        if (m110a == null) {
            return "";
        }
        return (m110a.m122a() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + m110a.m124b()).toLowerCase();
    }

    public static av a(Context context, String str, Map<String, String> map) {
        return a(context, str, "POST", (Map<String, String>) null, a(map));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static av a(Context context, String str, String str2, Map<String, String> map, String str3) {
        boolean z;
        BufferedReader bufferedReader;
        OutputStream outputStream;
        av avVar = new av();
        try {
            try {
                try {
                    HttpURLConnection m113a = m113a(context, m114a(str));
                    m113a.setConnectTimeout(10000);
                    m113a.setReadTimeout(15000);
                    String str4 = str2;
                    if (str2 == 0) {
                        str4 = "GET";
                    }
                    m113a.setRequestMethod(str4);
                    int i = 0;
                    if (map != null) {
                        z = DownloadHelper.GZIP.equalsIgnoreCase(map.get(DownloadHelper.CONTENT_ENCODING));
                        for (String str5 : map.keySet()) {
                            m113a.setRequestProperty(str5, map.get(str5));
                        }
                    } else {
                        z = false;
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        m113a.setDoOutput(true);
                        byte[] bytes = str3.getBytes();
                        if (z) {
                            outputStream = new GZIPOutputStream(m113a.getOutputStream());
                        } else {
                            outputStream = m113a.getOutputStream();
                        }
                        try {
                            outputStream.write(bytes, 0, bytes.length);
                            outputStream.flush();
                            outputStream.close();
                        } catch (IOException e2) {
                            e = e2;
                            throw new IOException("err while request " + str + Constants.COLON_SEPARATOR + e.getClass().getSimpleName());
                        } catch (Throwable th) {
                            th = th;
                            throw new IOException(th.getMessage());
                        }
                    }
                    avVar.a = m113a.getResponseCode();
                    com.xiaomi.channel.commonutils.logger.c.m15a("Http POST Response Code: " + avVar.a);
                    while (true) {
                        String headerFieldKey = m113a.getHeaderFieldKey(i);
                        String headerField = m113a.getHeaderField(i);
                        if (headerFieldKey == null && headerField == null) {
                            try {
                                break;
                            } catch (IOException unused) {
                                bufferedReader = new BufferedReader(new InputStreamReader(new b(m113a.getErrorStream())));
                            }
                        } else {
                            avVar.f132a.put(headerFieldKey, headerField);
                            i = i + 1 + 1;
                        }
                    }
                    bufferedReader = new BufferedReader(new InputStreamReader(new b(m113a.getInputStream())));
                } catch (IOException e3) {
                    e = e3;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                StringBuffer stringBuffer = new StringBuffer();
                String property = System.getProperty("line.separator");
                for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                    stringBuffer.append(readLine);
                    stringBuffer.append(property);
                }
                avVar.f131a = stringBuffer.toString();
                bufferedReader.close();
                y.a((Closeable) null);
                y.a((Closeable) null);
                return avVar;
            } catch (IOException e4) {
                e = e4;
                throw new IOException("err while request " + str + Constants.COLON_SEPARATOR + e.getClass().getSimpleName());
            } catch (Throwable th3) {
                th = th3;
                throw new IOException(th.getMessage());
            }
        } catch (Throwable th4) {
            y.a((Closeable) null);
            y.a((Closeable) str2);
            throw th4;
        }
    }

    public static String a(Map<String, String> map) {
        if (map == null || map.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                try {
                    stringBuffer.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                    stringBuffer.append(ContainerUtils.KEY_VALUE_DELIMITER);
                    stringBuffer.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
                    stringBuffer.append(ContainerUtils.FIELD_DELIMITER);
                } catch (UnsupportedEncodingException e2) {
                    com.xiaomi.channel.commonutils.logger.c.m15a("Failed to convert from params map to string: " + e2);
                    com.xiaomi.channel.commonutils.logger.c.m15a("map: " + map.toString());
                    return null;
                }
            }
        }
        if (stringBuffer.length() > 0) {
            stringBuffer = stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        return stringBuffer.toString();
    }

    /* renamed from: a, reason: collision with other method in class */
    private static URL m114a(String str) {
        return new URL(str);
    }

    public static int a() {
        Context m841a = t.m841a();
        if (m841a != null) {
            if (!c(m841a)) {
                return 0;
            }
            if (!b(m841a)) {
                return 1;
            }
            if (d(m841a)) {
                return 2;
            }
            if (m116a()) {
                return 3;
            }
        }
        return -1;
    }
}
