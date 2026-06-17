package com.huawei.hms.opendevice;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.android.doubaoime.C0838R;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.IOUtils;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class l {
    private static final String a = "l";
    private static Map<String, String> b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f7411c = new Object();

    private static String a() {
        return "2A57086C86EF54970C1E6EB37BFC72B1";
    }

    private static byte[] a(String str, String str2, String str3, String str4) {
        return com.huawei.e.a.a.a.d.a.b(str, str2, str3, str4, 32, true);
    }

    private static byte[] b() {
        return a(d(), e(), c(), g());
    }

    public static void c(Context context) {
        synchronized (f7411c) {
            d(context.getApplicationContext());
            if (i()) {
                HMSLog.i(a, "The local secret is already in separate file mode.");
                return;
            }
            File file = new File(e.c(context.getApplicationContext()) + "/shared_prefs/LocalAvengers.xml");
            if (file.exists()) {
                if (file.exists() && !file.delete()) {
                    Log.e("IOUtil", "deleteSecure exception");
                }
                HMSLog.i(a, "destroy C, delete file LocalAvengers.xml.");
            }
            byte[] c2 = com.huawei.e.a.a.a.d.b.c(32);
            byte[] c3 = com.huawei.e.a.a.a.d.b.c(32);
            byte[] c4 = com.huawei.e.a.a.a.d.b.c(32);
            byte[] c5 = com.huawei.e.a.a.a.d.b.c(32);
            String a2 = d.a(c2);
            String a3 = d.a(c3);
            String a4 = d.a(c4);
            String a5 = d.a(c5);
            a(a2, a3, a4, a5, com.huawei.e.a.a.a.a.a.c(d.a(com.huawei.e.a.a.a.d.b.c(32)), a(a2, a3, a4, a5)), context);
            HMSLog.i(a, "generate D.");
        }
    }

    private static void d(Context context) {
        if (i()) {
            HMSLog.i(a, "secretKeyCache not empty.");
            return;
        }
        b.clear();
        String c2 = e.c(context);
        if (TextUtils.isEmpty(c2)) {
            return;
        }
        String a2 = m.a(c2 + "/files/math/m");
        String a3 = m.a(c2 + "/files/panda/p");
        String a4 = m.a(c2 + "/files/panda/d");
        String a5 = m.a(c2 + "/files/math/t");
        String a6 = m.a(c2 + "/files/s");
        if (n.a(a2, a3, a4, a5, a6)) {
            b.put("m", a2);
            b.put("p", a3);
            b.put("d", a4);
            b.put("t", a5);
            b.put("s", a6);
        }
    }

    private static synchronized String e(Context context) {
        synchronized (l.class) {
            String a2 = com.huawei.e.a.a.a.a.a.a(f(), b());
            if (n.a(a2)) {
                HMSLog.i(a, "keyS has been upgraded, no require operate again.");
                return a2;
            }
            String a3 = com.huawei.e.a.a.a.a.a.a(f(), h().a());
            if (n.a(a3)) {
                HMSLog.i(a, "keyS is encrypt by RootKeyUtil, upgrade encrypt mode.");
                a(com.huawei.e.a.a.a.a.a.c(a3, b()), context);
                return a3;
            }
            String a4 = com.huawei.e.a.a.a.a.a.a(f(), com.huawei.e.a.a.a.d.a.b(d(), e(), c(), g(), 32, false));
            if (!n.a(a4)) {
                HMSLog.e(a, "all mode unable to decrypt root key.");
                return "";
            }
            HMSLog.i(a, "keyS is encrypt by ExportRootKey with sha1, upgrade encrypt mode to sha256.");
            a(com.huawei.e.a.a.a.a.a.c(a4, b()), context);
            return a4;
        }
    }

    private static String f() {
        return a("s");
    }

    private static String g() {
        return a("t");
    }

    private static com.huawei.e.a.a.a.d.c h() {
        return com.huawei.e.a.a.a.d.c.b(d(), e(), c(), g());
    }

    private static boolean i() {
        return !TextUtils.isEmpty(f());
    }

    public static byte[] a(Context context) {
        byte[] a2 = d.a(context.getString(C0838R.string.push_cat_head));
        byte[] a3 = d.a(context.getString(C0838R.string.push_cat_body));
        return a(a(a(a2, a3), d.a(a())));
    }

    public static String b(Context context) {
        if (!i()) {
            HMSLog.i(a, "work key is empty, execute init.");
            c(context);
        }
        String a2 = com.huawei.e.a.a.a.a.a.a(f(), b());
        return n.a(a2) ? a2 : e(context);
    }

    private static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length == 0 || bArr2.length == 0) {
            return new byte[0];
        }
        int length = bArr.length;
        if (length != bArr2.length) {
            return new byte[0];
        }
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    private static byte[] a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return new byte[0];
        }
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (bArr[i] >> 2);
        }
        return bArr;
    }

    private static void a(String str, String str2, String str3, String str4, String str5, Context context) {
        String c2 = e.c(context.getApplicationContext());
        if (TextUtils.isEmpty(c2)) {
            return;
        }
        try {
            a("m", str, c2 + "/files/math/m");
            a("p", str2, c2 + "/files/panda/p");
            a("d", str3, c2 + "/files/panda/d");
            a("t", str4, c2 + "/files/math/t");
            a("s", str5, c2 + "/files/s");
        } catch (IOException unused) {
            HMSLog.e(a, "save key IOException.");
        }
    }

    private static String d() {
        return a("m");
    }

    private static void a(String str, Context context) {
        String c2 = e.c(context.getApplicationContext());
        if (TextUtils.isEmpty(c2)) {
            return;
        }
        try {
            a("s", str, c2 + "/files/s");
        } catch (IOException unused) {
            HMSLog.e(a, "save keyS IOException.");
        }
    }

    private static String e() {
        return a("p");
    }

    private static void a(String str, String str2, String str3) throws IOException {
        OutputStreamWriter outputStreamWriter;
        HMSLog.i(a, "save local secret key.");
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(str3);
            m.a(file);
            outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(outputStreamWriter);
                try {
                    bufferedWriter2.write(str2);
                    bufferedWriter2.flush();
                    b.put(str, str2);
                    IOUtils.closeQuietly((Writer) outputStreamWriter);
                    IOUtils.closeQuietly((Writer) bufferedWriter2);
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    IOUtils.closeQuietly((Writer) outputStreamWriter);
                    IOUtils.closeQuietly((Writer) bufferedWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStreamWriter = null;
        }
    }

    private static String c() {
        return a("d");
    }

    private static String a(String str) {
        String str2 = b.get(str);
        return TextUtils.isEmpty(str2) ? "" : str2;
    }
}
