package com.bytedance.crash.util;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.crash.C0652g;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {
    private static String a;
    private static DateFormat b;

    /* renamed from: c, reason: collision with root package name */
    private static DateFormat f4712c;

    /* renamed from: d, reason: collision with root package name */
    private static DateFormat f4713d;

    /* renamed from: e, reason: collision with root package name */
    private static DateFormat f4714e;

    public static void A(String str, String str2) throws Exception {
        File file = new File(str);
        ZipOutputStream zipOutputStream = null;
        try {
            new File(str2).getParentFile().mkdirs();
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(new FileOutputStream(str2));
            try {
                B(zipOutputStream2, file, "");
                try {
                    zipOutputStream2.close();
                } catch (Throwable unused) {
                }
            } catch (Throwable th) {
                th = th;
                zipOutputStream = zipOutputStream2;
                if (zipOutputStream != null) {
                    try {
                        zipOutputStream.close();
                    } catch (Throwable unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static void B(ZipOutputStream zipOutputStream, File file, String str) throws IOException {
        FileInputStream fileInputStream;
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            zipOutputStream.putNextEntry(new ZipEntry(e.a.a.a.a.s(str, "/")));
            String s = str.length() == 0 ? "" : e.a.a.a.a.s(str, "/");
            for (File file2 : listFiles) {
                StringBuilder M = e.a.a.a.a.M(s);
                M.append(file2.getName());
                B(zipOutputStream, file2, M.toString());
            }
            return;
        }
        zipOutputStream.putNextEntry(new ZipEntry(str));
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (-1 == read) {
                    try {
                        fileInputStream.close();
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                zipOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (Throwable unused2) {
                }
            }
            throw th;
        }
    }

    public static void a(File file, File file2, int i, boolean z) {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        if (file == null || file2 == null || !file.exists()) {
            return;
        }
        if (!file2.exists() || z) {
            FileInputStream fileInputStream2 = null;
            try {
                try {
                    file2.getParentFile().mkdirs();
                    fileInputStream = new FileInputStream(file);
                    try {
                        fileOutputStream = new FileOutputStream(file2, z);
                    } catch (Exception unused) {
                        fileOutputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = null;
                    }
                } catch (Throwable unused2) {
                    return;
                }
            } catch (Exception unused3) {
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
            try {
                byte[] bArr = new byte[8192];
                int i2 = 0;
                try {
                    do {
                        int read = fileInputStream.read(bArr);
                        if (read > 0) {
                            fileOutputStream.write(bArr, 0, read);
                            i2 += read;
                        }
                        break;
                    } while (i2 < i);
                    break;
                    fileInputStream.close();
                } catch (Throwable unused4) {
                }
                fileOutputStream.close();
            } catch (Exception unused5) {
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (Throwable unused6) {
                    }
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (Throwable unused7) {
                    }
                }
                if (fileOutputStream == null) {
                    throw th;
                }
                try {
                    fileOutputStream.close();
                    throw th;
                } catch (Throwable unused8) {
                    throw th;
                }
            }
        }
    }

    public static boolean b(@NonNull File file) {
        boolean b2;
        boolean z = true;
        if (!file.exists()) {
            return true;
        }
        if (!file.canWrite()) {
            return false;
        }
        if (file.isFile()) {
            return file.delete();
        }
        if (!file.isDirectory()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        for (int i = 0; listFiles != null && i < listFiles.length; i++) {
            if (!listFiles[i].isFile()) {
                b2 = b(listFiles[i]);
            } else if (listFiles[i].canWrite()) {
                b2 = listFiles[i].delete();
            } else {
                z = false;
            }
            z &= b2;
        }
        return z & file.delete();
    }

    public static String c(long j) {
        if (b == null) {
            b = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        }
        return b.format(new Date(j));
    }

    public static String d(long j) {
        if (f4712c == null) {
            f4712c = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
        }
        return f4712c.format(new Date(j));
    }

    public static String e() {
        String str = a;
        return str != null ? str : "";
    }

    @NonNull
    public static String f() {
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        String j = j();
        a = j;
        return j == null ? "" : j;
    }

    public static DateFormat g() {
        if (f4713d == null) {
            f4713d = new SimpleDateFormat("yyyy-MM-dd@HH-mm-ss", Locale.getDefault());
        }
        return f4713d;
    }

    public static DateFormat h() {
        if (f4714e == null) {
            f4714e = new SimpleDateFormat("yyyy-MM-dd@HH-mm-ss.SSS", Locale.getDefault());
        }
        return f4714e;
    }

    @NonNull
    public static String i() {
        if (TextUtils.isEmpty(a)) {
            a = j();
        }
        return a;
    }

    @NonNull
    private static String j() {
        FileInputStream fileInputStream;
        int read;
        StringBuilder sb = new StringBuilder();
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream("/proc/self/cmdline");
            } catch (Throwable unused) {
            }
        } catch (Exception unused2) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[64];
            do {
                read = fileInputStream.read(bArr, 0, 64);
                for (int i = 0; i < read; i++) {
                    char c2 = (char) bArr[i];
                    if (c2 != 0 && c2 != '\n') {
                        sb.append(c2);
                    }
                    read = -1;
                    break;
                }
            } while (read > 0);
            fileInputStream.close();
        } catch (Exception unused3) {
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            return sb.toString();
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (Throwable unused4) {
                }
            }
            throw th;
        }
        return sb.toString();
    }

    public static boolean k() {
        return l(C0652g.g());
    }

    public static boolean l(Context context) {
        return m(context, i());
    }

    public static boolean m(Context context, String str) {
        if (str == null || str.contains(Constants.COLON_SEPARATOR)) {
            return false;
        }
        if (context == null) {
            context = C0652g.g();
        }
        if (context == null) {
            return false;
        }
        if (str.equals(context.getPackageName())) {
            return true;
        }
        return str.equals(context.getApplicationInfo().processName);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object n(java.io.File r5) {
        /*
            java.lang.String r0 = "NPTH_CATCH_NEW"
            r1 = 0
            boolean r2 = r5.exists()     // Catch: java.lang.Throwable -> L59
            if (r2 != 0) goto L2d
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59
            r3.<init>()     // Catch: java.lang.Throwable -> L59
            java.lang.String r4 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L59
            r3.append(r4)     // Catch: java.lang.Throwable -> L59
            java.lang.String r4 = ".bk"
            r3.append(r4)     // Catch: java.lang.Throwable -> L59
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L59
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L59
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L59
            if (r3 != 0) goto L2a
            return r1
        L2a:
            r2.renameTo(r5)     // Catch: java.lang.Throwable -> L59
        L2d:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L44
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L44
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L52
            r3.<init>(r2)     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L52
            java.lang.Object r1 = r3.readObject()     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L52
            r2.close()     // Catch: java.lang.Throwable -> L51
            goto L51
        L3f:
            r3 = move-exception
            goto L46
        L41:
            r5 = move-exception
            r2 = r1
            goto L53
        L44:
            r3 = move-exception
            r2 = r1
        L46:
            b(r5)     // Catch: java.lang.Throwable -> L52
            com.bytedance.crash.Q.b.e(r0, r3)     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto L51
            r2.close()     // Catch: java.lang.Throwable -> L51
        L51:
            return r1
        L52:
            r5 = move-exception
        L53:
            if (r2 == 0) goto L58
            r2.close()     // Catch: java.lang.Throwable -> L58
        L58:
            throw r5     // Catch: java.lang.Throwable -> L59
        L59:
            r5 = move-exception
            com.bytedance.crash.Q.b.e(r0, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.a.n(java.io.File):java.lang.Object");
    }

    public static long o(String str) throws ParseException {
        if (f4712c == null) {
            f4712c = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
        }
        Date parse = f4712c.parse(str);
        if (parse != null) {
            return parse.getTime();
        }
        return 0L;
    }

    public static String p(File file) throws IOException {
        return q(file, "\n");
    }

    public static String q(File file, String str) throws IOException {
        if (file == null || !file.exists()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            while (true) {
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine != null) {
                        if (sb.length() != 0 && str != null) {
                            sb.append(str);
                        }
                        sb.append(readLine);
                    } else {
                        try {
                            break;
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    throw th;
                }
            }
            bufferedReader2.close();
            return sb.toString();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String r(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return q(new File(str), "\n");
    }

    public static JSONArray s(@NonNull File file, long j) throws IOException {
        JSONArray jSONArray = new JSONArray();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            if (j > 0) {
                try {
                    bufferedReader2.skip(j);
                    bufferedReader2.readLine();
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused) {
                        }
                    }
                    throw th;
                }
            }
            while (true) {
                String readLine = bufferedReader2.readLine();
                if (readLine != null) {
                    jSONArray.put(readLine);
                } else {
                    try {
                        break;
                    } catch (Throwable unused2) {
                    }
                }
            }
            bufferedReader2.close();
            return jSONArray;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Nullable
    public static JSONArray t(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return s(new File(str), -1L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037 A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #3 {all -> 0x003a, blocks: (B:12:0x0030, B:19:0x0037), top: B:11:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void u(java.io.File r3, org.json.JSONArray r4, boolean r5) {
        /*
            if (r3 != 0) goto L3
            return
        L3:
            java.io.File r0 = r3.getParentFile()
            r0.mkdirs()
            r0 = 0
            if (r4 != 0) goto L22
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L35
            r5 = 0
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = ""
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Throwable -> L20
            r4.write(r3)     // Catch: java.lang.Throwable -> L20
            r4.flush()     // Catch: java.lang.Throwable -> L20
            goto L30
        L20:
            r0 = r4
            goto L35
        L22:
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L35
            java.io.FileWriter r2 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L35
            r2.<init>(r3, r5)     // Catch: java.lang.Throwable -> L35
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L35
            com.bytedance.crash.util.JSONWriter.h(r4, r1)     // Catch: java.lang.Throwable -> L34
            r4 = r1
        L30:
            r4.close()     // Catch: java.lang.Throwable -> L3a
            goto L3a
        L34:
            r0 = r1
        L35:
            if (r0 == 0) goto L3a
            r0.close()     // Catch: java.lang.Throwable -> L3a
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.a.u(java.io.File, org.json.JSONArray, boolean):void");
    }

    public static void v(String str) {
        a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void w(java.io.File r5, java.lang.Object r6) {
        /*
            java.lang.String r0 = "NPTH_CATCH_NEW"
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L7f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7f
            r2.<init>()     // Catch: java.lang.Throwable -> L7f
            java.lang.String r3 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L7f
            r2.append(r3)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r3 = ".bk"
            r2.append(r3)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L7f
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7f
            boolean r2 = r5.isDirectory()     // Catch: java.lang.Throwable -> L7f
            if (r2 == 0) goto L26
            b(r5)     // Catch: java.lang.Throwable -> L7f
            goto L38
        L26:
            boolean r2 = r5.exists()     // Catch: java.lang.Throwable -> L7f
            if (r2 == 0) goto L38
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L7f
            if (r2 == 0) goto L35
            r1.delete()     // Catch: java.lang.Throwable -> L7f
        L35:
            r5.renameTo(r1)     // Catch: java.lang.Throwable -> L7f
        L38:
            r2 = 0
            r3 = 0
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            r3.writeObject(r6)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            r2 = 1
            r4.close()     // Catch: java.lang.Throwable -> L5f
            goto L5f
        L4c:
            r5 = move-exception
            goto L79
        L4e:
            r6 = move-exception
            r3 = r4
            goto L54
        L51:
            r5 = move-exception
            goto L78
        L53:
            r6 = move-exception
        L54:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L51
            com.bytedance.crash.Q.b.e(r0, r6)     // Catch: java.lang.Throwable -> L51
            if (r3 == 0) goto L5f
            r3.close()     // Catch: java.lang.Throwable -> L5f
        L5f:
            boolean r6 = r1.exists()     // Catch: java.lang.Throwable -> L7f
            if (r6 == 0) goto L83
            if (r2 == 0) goto L6b
            b(r1)     // Catch: java.lang.Throwable -> L7f
            goto L83
        L6b:
            boolean r6 = r5.exists()     // Catch: java.lang.Throwable -> L7f
            if (r6 == 0) goto L74
            b(r5)     // Catch: java.lang.Throwable -> L7f
        L74:
            r1.renameTo(r5)     // Catch: java.lang.Throwable -> L7f
            goto L83
        L78:
            r4 = r3
        L79:
            if (r4 == 0) goto L7e
            r4.close()     // Catch: java.lang.Throwable -> L7e
        L7e:
            throw r5     // Catch: java.lang.Throwable -> L7f
        L7f:
            r5 = move-exception
            com.bytedance.crash.Q.b.e(r0, r5)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.a.w(java.io.File, java.lang.Object):void");
    }

    public static void x(@NonNull File file, @NonNull String str, boolean z) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        file.getParentFile().mkdirs();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, z);
            try {
                fileOutputStream2.write(str.getBytes());
                fileOutputStream2.flush();
                try {
                    fileOutputStream2.close();
                } catch (Throwable unused) {
                }
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void y(@NonNull File file, @NonNull JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return;
        }
        file.getParentFile().mkdirs();
        BufferedWriter bufferedWriter = null;
        try {
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file, z));
                try {
                    JSONWriter.i(jSONObject, bufferedWriter2);
                    bufferedWriter2.close();
                } catch (Throwable unused) {
                    bufferedWriter = bufferedWriter2;
                    if (bufferedWriter != null) {
                        bufferedWriter.close();
                    }
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
        }
    }

    public static void z(OutputStream outputStream, @NonNull List<File> list) throws IOException {
        if (list.size() == 0) {
            return;
        }
        ZipOutputStream zipOutputStream = null;
        try {
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(outputStream);
            try {
                zipOutputStream2.putNextEntry(new ZipEntry("/"));
                for (File file : list) {
                    if (file != null && file.exists()) {
                        File[] listFiles = file.isDirectory() ? file.listFiles() : new File[]{file};
                        if (listFiles != null) {
                            for (File file2 : listFiles) {
                                B(zipOutputStream2, file2, file2.getName());
                            }
                        }
                    }
                }
                try {
                    zipOutputStream2.close();
                } catch (Throwable unused) {
                }
            } catch (Throwable th) {
                th = th;
                zipOutputStream = zipOutputStream2;
                if (zipOutputStream != null) {
                    try {
                        zipOutputStream.close();
                    } catch (Throwable unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
