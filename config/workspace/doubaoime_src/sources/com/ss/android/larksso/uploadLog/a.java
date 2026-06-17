package com.ss.android.larksso.uploadLog;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.bytedance.common.wschannel.WsConstants;
import com.ss.android.larksso.uploadLog.b;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class a {
    public static final AtomicInteger a = new AtomicInteger(0);
    public static List<b> b = Collections.synchronizedList(new ArrayList());

    /* renamed from: c, reason: collision with root package name */
    public static Set<b> f8337c = Collections.synchronizedSet(new HashSet());

    /* renamed from: d, reason: collision with root package name */
    public static HandlerC0377a f8338d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f8339e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static final Object f8340f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static String f8341g;
    public static String h;
    public static boolean i;
    public static URL j;

    /* renamed from: com.ss.android.larksso.uploadLog.a$a, reason: collision with other inner class name */
    public static class HandlerC0377a extends Handler {
        public HandlerC0377a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i;
            HttpURLConnection httpURLConnection;
            Throwable th;
            super.handleMessage(message);
            int i2 = message.what;
            if (i2 == 0) {
                b bVar = (b) message.obj;
                if (bVar.h) {
                    boolean isEmpty = a.b.isEmpty();
                    a.b.add(bVar);
                    if (isEmpty) {
                        sendEmptyMessageDelayed(1, WsConstants.EXIT_DELAY_TIME);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i2 != 1) {
                return;
            }
            ArrayList arrayList = new ArrayList(a.b);
            a.b.clear();
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size() - 50;
            if (size <= 0) {
                i = 0;
            } else {
                ListIterator listIterator = arrayList.listIterator();
                i = 0;
                while (listIterator.hasNext() && size > 0) {
                    listIterator.next();
                    listIterator.remove();
                    size--;
                    i++;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            if (!arrayList.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList3.add((b) it2.next());
                }
                arrayList2.add(arrayList3);
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                List<b> list = (List) it3.next();
                if (list != null && !list.isEmpty()) {
                    com.ss.android.larksso.uploadLog.b bVar2 = new com.ss.android.larksso.uploadLog.b();
                    String str = Build.MANUFACTURER;
                    String str2 = Build.VERSION.RELEASE;
                    String str3 = a.f8341g;
                    bVar2.a = new ArrayList();
                    for (b bVar3 : list) {
                        List<b.C0378b> list2 = bVar2.a;
                        b.C0378b c0378b = new b.C0378b();
                        b.a aVar = new b.a();
                        long j = bVar3.f8346g;
                        String str4 = bVar3.i;
                        boolean z = a.i;
                        Process.myPid();
                        try {
                            com.alibaba.fastjson.a.d(aVar);
                        } catch (Throwable unused) {
                        }
                        list2.add(c0378b);
                    }
                    URL url = a.j;
                    if (url != null) {
                        try {
                            byte[] bytes = com.alibaba.fastjson.a.d(bVar2).getBytes();
                            httpURLConnection = (HttpURLConnection) url.openConnection();
                            try {
                                httpURLConnection.setConnectTimeout(3000);
                                httpURLConnection.setDoInput(true);
                                httpURLConnection.setDoOutput(true);
                                httpURLConnection.setRequestMethod("POST");
                                httpURLConnection.setUseCaches(false);
                                httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
                                httpURLConnection.setRequestProperty("Locale", "zh_CN");
                                httpURLConnection.setRequestProperty("X-Request-ID", UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, ""));
                                httpURLConnection.setRequestProperty("X-Terminal-Type", ExifInterface.GPS_MEASUREMENT_3D);
                                httpURLConnection.setRequestProperty("X-Api-Version", "3-10");
                                httpURLConnection.setRequestProperty(DownloadHelper.CONTENT_TYPE, "application/json;charset=utf-8");
                                httpURLConnection.setRequestProperty("X-Passport-Unit", "eu_nc");
                                httpURLConnection.getOutputStream().write(bytes, 0, bytes.length);
                                if (httpURLConnection.getResponseCode() == 200) {
                                    InputStream inputStream = httpURLConnection.getInputStream();
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    byte[] bArr = new byte[1024];
                                    if (inputStream != null) {
                                        while (true) {
                                            try {
                                                int read = inputStream.read(bArr);
                                                if (read == -1) {
                                                    break;
                                                }
                                                bArr.toString();
                                                byteArrayOutputStream.write(bArr, 0, read);
                                            } catch (Throwable th2) {
                                                th2.printStackTrace();
                                            }
                                        }
                                        new String(byteArrayOutputStream.toByteArray(), "utf-8");
                                        byteArrayOutputStream.flush();
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    th.printStackTrace();
                                } finally {
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                }
                            }
                        } catch (Throwable th4) {
                            httpURLConnection = null;
                            th = th4;
                        }
                    }
                }
                synchronized (a.f8340f) {
                    a.f8337c.addAll(list);
                }
            }
            if (i > 0) {
                String j2 = e.a.a.a.a.j("limitEvents remove ", i);
                try {
                    a.b(LogLevel.info.a, "LogUpload: " + j2 + ",LarkSSO=true,associate_id=" + ((String) null), false, true);
                    Log.i("LogUpload", j2);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public static class b {
        public String a;
        public String b;

        /* renamed from: c, reason: collision with root package name */
        public String f8342c;

        /* renamed from: d, reason: collision with root package name */
        public String f8343d;

        /* renamed from: e, reason: collision with root package name */
        public String f8344e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f8345f;

        /* renamed from: g, reason: collision with root package name */
        public long f8346g;
        public boolean h;
        public String i;
    }

    public static void a(String str, String str2) {
        try {
            b(LogLevel.error.a, str + ": " + str2 + ",LarkSSO=true,associate_id=" + ((String) null), false, true);
            Log.e(str, str2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void b(String str, String str2, boolean z, boolean z2) {
        b bVar;
        synchronized (f8340f) {
            Iterator<b> it2 = f8337c.iterator();
            bVar = null;
            while (it2.hasNext()) {
                bVar = it2.next();
                it2.remove();
            }
        }
        if (bVar == null) {
            bVar = new b();
        }
        bVar.b = str;
        bVar.f8342c = str2;
        bVar.f8345f = z;
        bVar.f8344e = Thread.currentThread().getName();
        bVar.a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSSXXX", Locale.getDefault()).format(new Date());
        bVar.f8346g = a.getAndIncrement();
        bVar.h = z2;
        bVar.i = h;
        try {
            bVar.f8343d = "file";
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        Message obtain = Message.obtain();
        obtain.what = 0;
        obtain.obj = bVar;
        if (f8338d == null) {
            synchronized (f8339e) {
                if (f8338d == null) {
                    HandlerThread handlerThread = new HandlerThread("LogUpload");
                    handlerThread.start();
                    f8338d = new HandlerC0377a(handlerThread.getLooper());
                }
            }
        }
        f8338d.sendMessage(obtain);
    }
}
