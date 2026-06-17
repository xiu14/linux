package e.b.b.h.d;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.apm6.util.timetask.AsyncTaskManagerType;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.crash.general.RomInfo;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import e.b.b.n.e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {
    private static AtomicInteger a = new AtomicInteger(0);
    private static boolean b = true;

    /* renamed from: c, reason: collision with root package name */
    private static String f9458c;

    static class a extends com.bytedance.apm6.util.timetask.a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f9459d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f9460e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Throwable f9461f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, String str2, Throwable th) {
            super(0L, 0L);
            this.f9459d = str;
            this.f9460e = str2;
            this.f9461f = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.a(this.f9459d, this.f9460e, this.f9461f);
        }
    }

    static void a(String str, String str2, Throwable th) {
        e.b.b.h.d.a aVar = new e.b.b.h.d.a(e.a.a.a.a.u("tag=", str, " message=", str2), th);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event_type", "exception");
            jSONObject.put("timestamp", System.currentTimeMillis());
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            aVar.printStackTrace(printWriter);
            Throwable cause = aVar.getCause();
            if (cause != null) {
                cause.printStackTrace(printWriter);
                Throwable cause2 = cause.getCause();
                if (cause2 != null) {
                    cause2.printStackTrace(printWriter);
                }
            }
            String stringWriter2 = stringWriter.toString();
            printWriter.close();
            jSONObject.put("stack", stringWriter2);
            jSONObject.put("exception_type", 1);
            jSONObject.put("message", str + BundleUtil.UNDERLINE_TAG + str2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("apm_sdk", "apm6_error");
            jSONObject2.put("host_aid", String.valueOf(e.b.b.h.c.a.f()));
            jSONObject.put("filters", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            jSONObject3.put(RemoteMessageConst.DATA, jSONArray);
            JSONObject jSONObject4 = new JSONObject();
            e.b.b.n.b.a(jSONObject4, e.b.b.h.c.a.r());
            if (e.b.b.h.c.a.g() != null) {
                e.b.b.n.b.a(jSONObject4, null);
            }
            jSONObject4.put(RomInfo.KEY_OS_TYPE, "Android");
            jSONObject4.put(WsConstants.KEY_APP_ID, 2085);
            jSONObject4.put("device_id", e.b.b.h.c.a.l());
            jSONObject4.put("channel", e.b.b.h.c.a.i());
            jSONObject4.put("version_code", e.b.b.h.c.a.w());
            jSONObject4.put("update_version_code", e.b.b.h.c.a.t());
            jSONObject4.put("device_id", e.b.b.h.c.a.l());
            jSONObject4.put("uid", e.b.b.h.c.a.v());
            jSONObject4.put("process_name", e.b.b.h.c.a.k());
            jSONObject3.put("header", jSONObject4);
            if (e.b.b.n.a.b()) {
                Log.e("APM-CustomException", "tag:" + str + " message:" + str2, aVar);
            }
            d(f9458c, jSONObject3.toString().getBytes());
        } catch (Throwable unused) {
        }
    }

    private static e.b.b.m.f.a b(String str, byte[] bArr) {
        HashMap hashMap = new HashMap();
        if (bArr.length > 128) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
                GZIPOutputStream gZIPOutputStream = null;
                try {
                    GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream2.write(bArr);
                        try {
                            gZIPOutputStream2.close();
                        } catch (Throwable unused) {
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        hashMap.put(DownloadHelper.CONTENT_ENCODING, DownloadHelper.GZIP);
                        bArr = byteArray;
                    } catch (Throwable th) {
                        th = th;
                        gZIPOutputStream = gZIPOutputStream2;
                        if (gZIPOutputStream != null) {
                            try {
                                gZIPOutputStream.close();
                            } catch (Throwable unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException unused3) {
            }
        }
        return new e.b.b.m.f.a(e.a(str, e.b.b.h.c.a.u()), hashMap, bArr);
    }

    static void c(String str, String str2, Throwable th) {
        com.bytedance.apm.y.a.a(str, str2);
        if (!b || a.get() >= 3) {
            return;
        }
        a.incrementAndGet();
        com.bytedance.apm6.util.timetask.b.a(AsyncTaskManagerType.IO).c(new a(str, str2, th));
    }

    private static void d(String str, byte[] bArr) {
        if (!NetworkUtils.h(e.b.b.n.a.a())) {
            if (e.b.b.n.a.b()) {
                e.b.b.n.g.b.a("APM-CustomException", "network unreachable");
                return;
            }
            return;
        }
        if (bArr == null || bArr.length == 0) {
            return;
        }
        try {
            e.b.b.m.f.a b2 = b(str, bArr);
            if (e.b.b.n.a.b()) {
                e.b.b.n.g.b.a("APM-CustomException", "http request:url:" + b2.a + " headers:" + b2.b);
            }
            e.b.b.h.c.a.e(b2.a, b2.b, b2.f9492c);
        } catch (Throwable th) {
            if (e.b.b.n.a.b()) {
                th.printStackTrace();
            }
        }
    }

    public static void e(boolean z) {
        b = z;
    }

    public static void f(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f9458c = str;
    }
}
