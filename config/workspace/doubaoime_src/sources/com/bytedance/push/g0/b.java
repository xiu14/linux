package com.bytedance.push.g0;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.bytedance.push.notification.r;
import java.io.File;

/* loaded from: classes2.dex */
public class b {
    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|(1:3)|4|(4:5|6|(1:10)|11)|(15:13|14|(1:16)(1:42)|17|(1:19)(1:41)|20|21|22|23|24|(1:26)(1:36)|27|29|30|31)|44|14|(0)(0)|17|(0)(0)|20|21|22|23|24|(0)(0)|27|29|30|31) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01e2, code lost:
    
        r15 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01e3, code lost:
    
        r1 = e.a.a.a.a.M("exception when build androidContext:");
        r1.append(r15.getLocalizedMessage());
        com.bytedance.push.g0.f.e("UiAdaptationUtils", r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01b1, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01b2, code lost:
    
        r3 = e.a.a.a.a.M("exception when build androidSettingsContext:");
        r3.append(r1.getLocalizedMessage());
        com.bytedance.push.g0.f.e("UiAdaptationUtils", r3.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map<java.lang.String, java.lang.String> a(android.content.Context r15) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.g0.b.a(android.content.Context):java.util.Map");
    }

    public static boolean b(Context context, com.bytedance.push.notification.b bVar, String str, String str2, r rVar) {
        if (bVar != null && !TextUtils.isEmpty(str) && ((str.contains("http://") || str.contains("https://")) && str.endsWith("mp3"))) {
            try {
                String f2 = f(context, str2);
                if (TextUtils.isEmpty(f2)) {
                    return false;
                }
                if (new File(f2).exists()) {
                    rVar.a(f2);
                    return true;
                }
                bVar.c(str, f2, rVar);
                return true;
            } catch (Throwable th) {
                StringBuilder M = e.a.a.a.a.M("Failed to create custom sound channel, create default channel！");
                M.append(th.getMessage());
                f.g("CustomSoundUtils", M.toString());
            }
        }
        return false;
    }

    private static float c(Resources resources, int i) {
        try {
            return resources.getDimension(i);
        } catch (Throwable unused) {
            return -1.0f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int d(java.lang.String r2, int[] r3, java.lang.String r4) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = -1
            if (r0 == 0) goto L9
        L7:
            r2 = r1
            goto L1e
        L9:
            java.lang.String r0 = "custom_sound"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L1a
            int r0 = r2.length()
            int r0 = r0 + r1
            java.lang.String r2 = r2.substring(r0)
        L1a:
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L7
        L1e:
            if (r2 != r1) goto L2c
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 == 0) goto L28
        L26:
            r2 = r1
            goto L2c
        L28:
            int r2 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Throwable -> L26
        L2c:
            if (r2 < 0) goto L35
            if (r3 == 0) goto L35
            int r4 = r3.length
            if (r4 <= r2) goto L35
            r1 = r3[r2]
        L35:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.g0.b.d(java.lang.String, int[], java.lang.String):int");
    }

    public static Uri e(Context context, int i) {
        StringBuilder M = e.a.a.a.a.M("android.resource://");
        M.append(context.getPackageName());
        M.append("/");
        M.append(i);
        return Uri.parse(M.toString());
    }

    public static String f(Context context, String str) {
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_RINGTONES);
        return (externalFilesDir.exists() || externalFilesDir.mkdir()) ? e.a.a.a.a.u(externalFilesDir.getAbsolutePath(), "/", str, ".mp3") : "";
    }

    public static Uri g(Context context, String str) {
        boolean z = com.ss.android.message.f.a.f8353g;
        return (com.ss.android.message.f.a.A("huawei") || com.ss.android.message.f.a.A("honor") || com.ss.android.message.f.a.A("oppo") || com.ss.android.message.f.a.A("vivo")) ? Uri.fromFile(new File(str)) : FileProvider.getUriForFile(context, e.a.a.a.a.c(context, new StringBuilder(), ".push.file_provider"), new File(str));
    }
}
