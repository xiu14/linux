package com.huawei.e.a.a.b.g;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.common.PackageConstants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes2.dex */
public class a {
    private static final Uri a = Uri.parse("content://com.huawei.hwid");
    private static final String[] b = {"B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05", PackageConstants.SERVICES_SIGNATURE_V3};

    private static String a(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.createDeviceProtectedStorageContext().getFilesDir());
        return e.a.a.a.a.J(sb, File.separator, "aegis");
    }

    private static String b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    private static void c(InputStream inputStream, Context context) {
        FileOutputStream fileOutputStream;
        String a2 = a(context);
        if (!e.a.a.a.a.R0(a2) && !TextUtils.isEmpty(a2)) {
            File file = new File(a2);
            if (file.exists()) {
                b.e("BksUtil", "The directory  has already exists");
            } else if (!file.mkdirs()) {
                b.c("BksUtil", "create directory  failed");
            }
        }
        File file2 = new File(a2, "hmsrootcas.bks");
        if (file2.exists()) {
            file2.delete();
        }
        ?? r7 = 0;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                b.d("BksUtil", "write output stream ");
                fileOutputStream = new FileOutputStream(file2);
                r7 = 2048;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = r7;
            }
        } catch (IOException unused) {
        }
        try {
            byte[] bArr = new byte[2048];
            while (true) {
                int read = inputStream.read(bArr, 0, 2048);
                if (read == -1) {
                    break;
                } else {
                    fileOutputStream.write(bArr, 0, read);
                }
            }
            com.bytedance.feedbackerlib.a.b(fileOutputStream);
        } catch (IOException unused2) {
            fileOutputStream2 = fileOutputStream;
            b.c("BksUtil", " IOException");
            com.bytedance.feedbackerlib.a.b(fileOutputStream2);
            r7 = fileOutputStream2;
        } catch (Throwable th2) {
            th = th2;
            com.bytedance.feedbackerlib.a.b(fileOutputStream);
            throw th;
        }
    }

    private static byte[] d(Context context, String str) {
        PackageInfo packageInfo;
        if (context == null || TextUtils.isEmpty(str)) {
            Log.e("BksUtil", "packageName is null or context is null");
            return new byte[0];
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo(str, 64)) != null) {
                return packageInfo.signatures[0].toByteArray();
            }
        } catch (PackageManager.NameNotFoundException e2) {
            StringBuilder M = e.a.a.a.a.M("PackageManager.NameNotFoundException : ");
            M.append(e2.getMessage());
            Log.e("BksUtil", M.toString());
        } catch (Exception e3) {
            StringBuilder M2 = e.a.a.a.a.M("get pm exception : ");
            M2.append(e3.getMessage());
            Log.e("BksUtil", M2.toString());
        }
        return new byte[0];
    }

    private static String e(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return b(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            b.c("BksUtil", "inputstraem exception");
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.io.ByteArrayInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    private static void f(Context context) {
        InputStream inputStream;
        InputStream inputStream2;
        ?? r5;
        ?? r52;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            inputStream = context.getContentResolver().openInputStream(Uri.withAppendedPath(a, "files/hmsrootcas.bks"));
        } catch (Exception e2) {
            e = e2;
            inputStream = null;
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= -1) {
                        break;
                    } else {
                        byteArrayOutputStream2.write(bArr, 0, read);
                    }
                }
                byteArrayOutputStream2.flush();
                r52 = new ByteArrayInputStream(byteArrayOutputStream2.toByteArray());
            } catch (Exception e3) {
                e = e3;
                r52 = 0;
            } catch (Throwable th2) {
                th = th2;
                r52 = byteArrayOutputStream;
                byteArrayOutputStream = byteArrayOutputStream2;
                inputStream2 = r52;
                com.bytedance.feedbackerlib.a.a(inputStream);
                com.bytedance.feedbackerlib.a.b(byteArrayOutputStream);
                com.bytedance.feedbackerlib.a.a(inputStream2);
                throw th;
            }
            try {
                String string = e.a(context).getString("bks_hash", "");
                String e4 = e(byteArrayOutputStream2.toByteArray());
                if (i(context) && string.equals(e4)) {
                    b.d("BksUtil", "bks not update");
                    com.bytedance.feedbackerlib.a.a(inputStream);
                    com.bytedance.feedbackerlib.a.b(byteArrayOutputStream2);
                    com.bytedance.feedbackerlib.a.a(r52);
                }
                b.d("BksUtil", "update bks and sp");
                c(r52, context);
                e.a(context).edit().putString("bks_hash", e4).apply();
                com.bytedance.feedbackerlib.a.a(inputStream);
                com.bytedance.feedbackerlib.a.b(byteArrayOutputStream2);
                com.bytedance.feedbackerlib.a.a(r52);
            } catch (Exception e5) {
                e = e5;
                byteArrayOutputStream = byteArrayOutputStream2;
                r5 = r52;
                try {
                    b.c("BksUtil", "Get bks from HMS_VERSION_CODE exception : No content provider" + e.getMessage());
                    com.bytedance.feedbackerlib.a.a(inputStream);
                    com.bytedance.feedbackerlib.a.b(byteArrayOutputStream);
                    com.bytedance.feedbackerlib.a.a(r5);
                } catch (Throwable th3) {
                    th = th3;
                    byteArrayOutputStream2 = byteArrayOutputStream;
                    byteArrayOutputStream = r5;
                    r52 = byteArrayOutputStream;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    inputStream2 = r52;
                    com.bytedance.feedbackerlib.a.a(inputStream);
                    com.bytedance.feedbackerlib.a.b(byteArrayOutputStream);
                    com.bytedance.feedbackerlib.a.a(inputStream2);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = byteArrayOutputStream2;
                inputStream2 = r52;
                com.bytedance.feedbackerlib.a.a(inputStream);
                com.bytedance.feedbackerlib.a.b(byteArrayOutputStream);
                com.bytedance.feedbackerlib.a.a(inputStream2);
                throw th;
            }
        } catch (Exception e6) {
            e = e6;
            r5 = 0;
            b.c("BksUtil", "Get bks from HMS_VERSION_CODE exception : No content provider" + e.getMessage());
            com.bytedance.feedbackerlib.a.a(inputStream);
            com.bytedance.feedbackerlib.a.b(byteArrayOutputStream);
            com.bytedance.feedbackerlib.a.a(r5);
        } catch (Throwable th5) {
            th = th5;
            inputStream2 = null;
            com.bytedance.feedbackerlib.a.a(inputStream);
            com.bytedance.feedbackerlib.a.b(byteArrayOutputStream);
            com.bytedance.feedbackerlib.a.a(inputStream2);
            throw th;
        }
    }

    private static boolean g(String str) {
        int parseInt;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        b.d("BksUtil", "hms version code is : " + str);
        String[] split = str.split("\\.");
        String[] split2 = "4.0.2.300".split("\\.");
        int length = split.length;
        int length2 = split2.length;
        int max = Math.max(length, length2);
        int i = 0;
        while (i < max) {
            if (i < length) {
                try {
                    parseInt = Integer.parseInt(split[i]);
                } catch (Exception e2) {
                    StringBuilder M = e.a.a.a.a.M(" exception : ");
                    M.append(e2.getMessage());
                    b.c("BksUtil", M.toString());
                    return i >= length2;
                }
            } else {
                parseInt = 0;
            }
            int parseInt2 = i < length2 ? Integer.parseInt(split2[i]) : 0;
            if (parseInt < parseInt2) {
                return false;
            }
            if (parseInt > parseInt2) {
                return true;
            }
            i++;
        }
        return true;
    }

    private static String h(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        try {
            return b(MessageDigest.getInstance("SHA-256").digest(bArr));
        } catch (NoSuchAlgorithmException e2) {
            StringBuilder M = e.a.a.a.a.M("NoSuchAlgorithmException");
            M.append(e2.getMessage());
            Log.e("BksUtil", M.toString());
            return "";
        }
    }

    private static boolean i(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(a(context));
        return e.a.a.a.a.R0(e.a.a.a.a.J(sb, File.separator, "hmsrootcas.bks"));
    }

    public static synchronized InputStream j(Context context) {
        synchronized (a.class) {
            b.d("BksUtil", "get bks from tss begin");
            if (context != null) {
                b.g(context);
            }
            Context f2 = b.f();
            if (f2 == null) {
                b.c("BksUtil", "context is null");
                return null;
            }
            if (!g(d.a("com.huawei.hwid")) && !g(d.a(PackageConstants.SERVICES_PACKAGE_ALL_SCENE))) {
                b.c("BksUtil", "hms version code is too low : " + d.a("com.huawei.hwid"));
                return null;
            }
            byte[] d2 = d(f2, "com.huawei.hwid");
            String[] strArr = b;
            int length = strArr.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (strArr[i].equalsIgnoreCase(h(d2))) {
                    z = true;
                    break;
                }
                i++;
            }
            if (!z && !PackageConstants.SERVICES_SIGNATURE_V3.equalsIgnoreCase(h(d(f2, PackageConstants.SERVICES_PACKAGE_ALL_SCENE)))) {
                b.c("BksUtil", "hms sign error");
                return null;
            }
            f(f2);
            return k(f2);
        }
    }

    public static InputStream k(Context context) {
        if (!i(context)) {
            return null;
        }
        b.d("BksUtil", "getFilesBksIS ");
        try {
            return new FileInputStream(a(context) + File.separator + "hmsrootcas.bks");
        } catch (FileNotFoundException unused) {
            b.c("BksUtil", "FileNotFoundExceptio: ");
            return null;
        }
    }
}
