package e.h.a.g.b.a;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;

/* loaded from: classes2.dex */
public class a {
    private static boolean a = false;
    private static String b;

    public static File a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            a = true;
            b = str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getApplicationInfo().dataDir);
        String str2 = File.separator;
        String J2 = e.a.a.a.a.J(sb, str2, "databases");
        String K = e.a.a.a.a.K(new StringBuilder(), context.getApplicationInfo().dataDir, str2, "dbFiles");
        String t = e.a.a.a.a.t(K, str2, "/tmp");
        File file = new File(J2);
        if (file.exists()) {
            for (File file2 : file.listFiles()) {
                String name = file2.getName();
                if (name.endsWith(".db") && !a && !com.monitor.cloudmessage.utils.a.c(file2.getAbsolutePath(), t, name)) {
                    return null;
                }
                if (a && !TextUtils.isEmpty(b) && b.equals(name) && !com.monitor.cloudmessage.utils.a.c(file2.getAbsolutePath(), t, name)) {
                    return null;
                }
            }
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(K);
            String str3 = File.separator;
            sb2.append(str3);
            sb2.append("db.zip");
            com.monitor.cloudmessage.utils.a.i(t, sb2.toString());
            com.monitor.cloudmessage.utils.a.g(t);
            return new File(e.a.a.a.a.t(K, str3, "db.zip"));
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
