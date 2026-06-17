package com.huawei.hms.hatool;

import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public class x {
    private String a = q0.i().getFilesDir().getPath();

    x() {
    }

    private String a(String str) {
        return this.a + "/hms/component/".replace("component", str);
    }

    private void a(String str, String str2) {
        File file = new File(a(str));
        File file2 = new File(a(str), e.a.a.a.a.s("hianalytics_", str));
        if (!file.exists() && file.mkdirs()) {
            v.c("hmsSdk", "file directory is mkdirs");
        }
        if (a(file2)) {
            k1.a(file2, str2);
        } else {
            v.f("hmsSdk", "refreshComponent():file is not found,and file is create failed");
        }
    }

    private boolean a(File file) {
        if (file.exists()) {
            return true;
        }
        try {
            return file.createNewFile();
        } catch (IOException unused) {
            v.f("hmsSdk", "create new file error!");
            return false;
        }
    }

    private char[] a(String str, String str2, String str3, String str4) {
        byte[] Q = com.bytedance.feedbackerlib.a.Q(str);
        byte[] Q2 = com.bytedance.feedbackerlib.a.Q(str2);
        byte[] Q3 = com.bytedance.feedbackerlib.a.Q(str3);
        byte[] Q4 = com.bytedance.feedbackerlib.a.Q(str4);
        int length = Q.length;
        if (length > Q2.length) {
            length = Q2.length;
        }
        if (length > Q3.length) {
            length = Q3.length;
        }
        if (length > Q4.length) {
            length = Q4.length;
        }
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) (((Q[i] ^ Q2[i]) ^ Q3[i]) ^ Q4[i]);
        }
        return cArr;
    }

    private String b(String str) {
        File file = new File(a(str), e.a.a.a.a.s("hianalytics_", str));
        if (a(file)) {
            return k1.a(file);
        }
        String d2 = com.huawei.e.a.a.a.d.b.d(128);
        k1.a(file, d2);
        return d2;
    }

    private boolean b() {
        long a = d.a(q0.i(), "Privacy_MY", "assemblyFlash", -1L);
        if (-1 != a) {
            return System.currentTimeMillis() - a > 31536000000L;
        }
        v.c("hmsSdk", "First init components");
        return true;
    }

    private static boolean b(File file) {
        File[] listFiles;
        if (file == null || !file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length == 0) {
            return false;
        }
        for (File file2 : listFiles) {
            if (file2.isFile()) {
                if (!file2.delete()) {
                    StringBuilder M = e.a.a.a.a.M("delete file failed : ");
                    M.append(file2.getName());
                    v.c("hmsSdk", M.toString());
                }
            } else if (file2.isDirectory()) {
                b(file2);
            }
        }
        return file.delete();
    }

    public static boolean c() {
        return b(new File(q0.i().getFilesDir().getPath() + "/hms"));
    }

    private String d() {
        return "f6040d0e807aaec325ecf44823765544e92905158169f694b282bf17388632cf95a83bae7d2d235c1f039b0df1dcca5fda619b6f7f459f2ff8d70ddb7b601592fe29fcae58c028f319b3b12495e67aa5390942a997a8cb572c8030b2df5c2b622608bea02b0c3e5d4dff3f72c9e3204049a45c0760cd3604af8d57f0e0c693cc";
    }

    public String a() {
        String b;
        String b2;
        String b3;
        String b4;
        byte[] bArr;
        String d2 = d();
        if (b()) {
            v.c("hmsSdk", "refresh components");
            b = com.huawei.e.a.a.a.d.b.d(128);
            a("aprpap", b);
            b2 = com.huawei.e.a.a.a.d.b.d(128);
            a("febdoc", b2);
            b3 = com.huawei.e.a.a.a.d.b.d(128);
            a("marfil", b3);
            b4 = com.huawei.e.a.a.a.d.b.d(128);
            a("maywnj", b4);
            d.b(q0.i(), "Privacy_MY", "assemblyFlash", System.currentTimeMillis());
        } else {
            b = b("aprpap");
            b2 = b("febdoc");
            b3 = b("marfil");
            b4 = b("maywnj");
        }
        char[] a = a(b, b2, b3, d2);
        byte[] Q = com.bytedance.feedbackerlib.a.Q(b4);
        if (a == null || a.length <= 0) {
            com.huawei.e.a.a.a.d.d.a("PBKDF2", "pbkdf password is empty.");
            bArr = new byte[0];
        } else if (Q.length <= 0) {
            com.huawei.e.a.a.a.d.d.a("PBKDF2", "pbkdf salt is empty.");
            bArr = new byte[0];
        } else if (Q.length < 16) {
            com.huawei.e.a.a.a.d.d.a("PBKDF2", "pbkdf salt parameter length is not enough, length must be more than 16.");
            bArr = new byte[0];
        } else {
            com.huawei.e.a.a.a.d.d.a("PBKDF2", "pbkdf bytes parameter count is less than 256.");
            bArr = new byte[0];
        }
        return com.bytedance.feedbackerlib.a.f(bArr);
    }
}
