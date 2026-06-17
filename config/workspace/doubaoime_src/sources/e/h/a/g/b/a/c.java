package e.h.a.g.b.a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Process;
import android.text.TextUtils;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class c {
    private static String[] a;

    public static Map<String, Boolean> a(Context context) {
        HashMap hashMap = new HashMap();
        String[] strArr = a;
        if (strArr != null) {
            for (String str : strArr) {
                hashMap.put(str, Boolean.valueOf(!TextUtils.isEmpty(str) && context.checkPermission(str, Process.myPid(), Process.myUid()) == 0));
            }
        }
        return hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static File b(Context context) {
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        BufferedWriter bufferedWriter2 = null;
        try {
            a = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            StringBuilder sb = new StringBuilder();
            sb.append(com.monitor.cloudmessage.utils.a.e(context).getAbsolutePath());
            String str = File.separator;
            String J2 = e.a.a.a.a.J(sb, str, "permissionInfo");
            String t = e.a.a.a.a.t(J2, str, "permission.txt");
            try {
                try {
                    File file = new File(J2);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    fileWriter = new FileWriter(J2 + str + "permission.txt");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter2 = J2;
                }
                try {
                    bufferedWriter = new BufferedWriter(fileWriter);
                    try {
                        for (Map.Entry entry : ((HashMap) a(context)).entrySet()) {
                            bufferedWriter.write(String.format("permission: %s, result: %b\n", entry.getKey(), entry.getValue()));
                        }
                        try {
                            bufferedWriter.close();
                            fileWriter.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                        return new File(t);
                    } catch (IOException e3) {
                        e = e3;
                        e.printStackTrace();
                        if (bufferedWriter != null) {
                            try {
                                bufferedWriter.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                                return null;
                            }
                        }
                        if (fileWriter != null) {
                            fileWriter.close();
                        }
                        return null;
                    }
                } catch (IOException e5) {
                    e = e5;
                    bufferedWriter = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedWriter2 != null) {
                        try {
                            bufferedWriter2.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                            throw th;
                        }
                    }
                    if (fileWriter != null) {
                        fileWriter.close();
                    }
                    throw th;
                }
            } catch (IOException e7) {
                e = e7;
                bufferedWriter = null;
                fileWriter = null;
            } catch (Throwable th3) {
                th = th3;
                fileWriter = null;
            }
        } catch (PackageManager.NameNotFoundException e8) {
            e8.printStackTrace();
            return null;
        }
    }
}
