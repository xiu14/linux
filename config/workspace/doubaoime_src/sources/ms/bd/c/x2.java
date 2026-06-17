package ms.bd.c;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public abstract class x2 {
    public static final q4 a = new q4();
    public static final g4 b;

    static {
        g4 g4Var = new g4();
        b = g4Var;
        synchronized (g4.class) {
            g4.b = g4Var;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.io.Serializable, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.Serializable a(int r21, int r22, long r23, java.lang.String r25, java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 2525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.c.x2.a(int, int, long, java.lang.String, java.lang.Object):java.io.Serializable");
    }

    public static boolean b(Context context, String str, String str2) {
        try {
            String[] list = context.getAssets().list(str);
            if (list.length > 0) {
                new File(str2).mkdirs();
                for (String str3 : list) {
                    b(context, str + ((String) y2.a(16777217, 0, 0L, "d5730f", new byte[]{58})) + str3, str2 + ((String) y2.a(16777217, 0, 0L, "f10cfe", new byte[]{56})) + str3);
                }
                return true;
            }
            InputStream open = context.getAssets().open(str);
            FileOutputStream fileOutputStream = new FileOutputStream(str2);
            try {
                byte[] bArr = new byte[256];
                while (true) {
                    int read = open.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                fileOutputStream.flush();
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused2) {
                }
                if (open == null) {
                    throw th;
                }
                try {
                    open.close();
                    throw th;
                } catch (IOException unused3) {
                    throw th;
                }
            }
            try {
                fileOutputStream.close();
            } catch (IOException unused4) {
            }
            if (open == null) {
                return true;
            }
            try {
                open.close();
                return true;
            } catch (IOException unused5) {
                return true;
            }
        } catch (Exception unused6) {
            return false;
        }
    }
}
