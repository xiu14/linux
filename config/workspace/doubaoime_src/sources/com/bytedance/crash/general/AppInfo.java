package com.bytedance.crash.general;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.File;
import java.io.FilenameFilter;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import org.json.JSONObject;

@Keep
/* loaded from: classes.dex */
public class AppInfo implements Serializable {
    private static final String KEY_APP_DISPLAY_NAME = "display_name";
    private static final String KEY_APP_PACKAGE = "package";
    private static final String KEY_APP_RELEASE_BUILD = "release_build";
    private static final String KEY_APP_VERIFY_INFO = "verify_info";
    private static final String KEY_NPTH_BYTRACE_ID = "bytrace_id";
    public static final String KEY_NPTH_VERSION_CODE = "sdk_version";
    public static final String KEY_NPTH_VERSION_NAME = "sdk_version_name";
    private static final int MAX_FILE_COUNT = 3;
    private static final String SUFFIX = ".aif";
    private static final long TOW_WEEKS = 1209600000;
    private static final long serialVersionUID = 1;
    Map<String, Object> mAppExtension;
    int mAppVersionCode;
    String mAppVersionName;
    String mBitWide;
    String mDisplayName;
    long mLastUpdateTime;
    String mNpthBytraceId;
    int mNpthVersionCode;
    String mNpthVersionName;
    String mPackageName;
    String mReleaseBuild;

    static class a implements FilenameFilter {
        a() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.endsWith(AppInfo.SUFFIX);
        }
    }

    static class b implements Comparator<File> {
        b() {
        }

        @Override // java.util.Comparator
        @RequiresApi(api = 19)
        public int compare(File file, File file2) {
            return Long.compare(AppInfo.getLastUpdateTime(file2), AppInfo.getLastUpdateTime(file));
        }
    }

    private static void clear(@NonNull File file) {
        File[] sortedFilesArray = getSortedFilesArray(file);
        if (sortedFilesArray != null) {
            if (sortedFilesArray.length > 3) {
                long currentTimeMillis = System.currentTimeMillis();
                for (int i = 3; i < sortedFilesArray.length; i++) {
                    long lastUpdateTime = getLastUpdateTime(sortedFilesArray[i]);
                    if (lastUpdateTime < 0 || currentTimeMillis - lastUpdateTime > TOW_WEEKS) {
                        sortedFilesArray[i].delete();
                    }
                }
            }
        }
    }

    static AppInfo findAppInfo(File file, long j) {
        File[] sortedFilesArray = getSortedFilesArray(file);
        if (sortedFilesArray == null) {
            return null;
        }
        for (File file2 : sortedFilesArray) {
            try {
                AppInfo appInfo = (AppInfo) com.bytedance.crash.util.a.n(file2);
                if (appInfo != null && j > appInfo.mLastUpdateTime) {
                    return appInfo;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.bytedance.crash.general.AppInfo get(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.NonNull java.io.File r8) {
        /*
            java.lang.String r0 = r7.getPackageName()
            r1 = 0
            android.content.pm.PackageManager r2 = r7.getPackageManager()     // Catch: java.lang.Throwable -> L32
            r3 = 0
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r0, r3)     // Catch: java.lang.Throwable -> L32
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r4.<init>()     // Catch: java.lang.Throwable -> L2f
            long r5 = r2.lastUpdateTime     // Catch: java.lang.Throwable -> L2f
            r4.append(r5)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r5 = ".aif"
            r4.append(r5)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L2f
            r3.<init>(r8, r4)     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r1 = com.bytedance.crash.util.a.n(r3)     // Catch: java.lang.Throwable -> L30
            com.bytedance.crash.general.AppInfo r1 = (com.bytedance.crash.general.AppInfo) r1     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L34
            return r1
        L2f:
            r3 = r1
        L30:
            r1 = r2
            goto L33
        L32:
            r3 = r1
        L33:
            r2 = r1
        L34:
            com.bytedance.crash.general.AppInfo r1 = new com.bytedance.crash.general.AppInfo
            r1.<init>()
            r1.mPackageName = r0
            boolean r0 = com.bytedance.crash.jni.NativeBridge.E()
            if (r0 == 0) goto L44
            java.lang.String r0 = "64"
            goto L46
        L44:
            java.lang.String r0 = "32"
        L46:
            r1.mBitWide = r0
            java.lang.String r0 = com.bytedance.crash.N.a.b()
            r1.mReleaseBuild = r0
            r0 = 4020158(0x3d57be, float:5.633441E-39)
            r1.mNpthVersionCode = r0
            java.lang.String r0 = "4.2.1-rc.8-oime"
            r1.mNpthVersionName = r0
            java.lang.String r0 = com.bytedance.crash.dumper.b.d()
            r1.mNpthBytraceId = r0
            java.util.Map r0 = com.bytedance.crash.N.a.a()
            r1.mAppExtension = r0
            if (r2 == 0) goto L7f
            long r4 = r2.lastUpdateTime
            r1.mLastUpdateTime = r4
            int r0 = r2.versionCode
            r1.mAppVersionCode = r0
            java.lang.String r0 = r2.versionName
            r1.mAppVersionName = r0
            android.content.pm.ApplicationInfo r0 = r2.applicationInfo
            if (r0 == 0) goto L7f
            int r0 = r0.labelRes
            if (r0 <= 0) goto L7f
            java.lang.String r7 = r7.getString(r0)
            r1.mDisplayName = r7
        L7f:
            if (r3 == 0) goto L87
            clear(r8)
            com.bytedance.crash.util.a.w(r3, r1)
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.general.AppInfo.get(android.content.Context, java.io.File):com.bytedance.crash.general.AppInfo");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getLastUpdateTime(File file) {
        try {
            return Long.parseLong(file.getName().substring(0, r2.length() - 4));
        } catch (Throwable unused) {
            return -1L;
        }
    }

    private static File[] getSortedFilesArray(File file) {
        File[] listFiles = file.listFiles(new a());
        if (listFiles != null) {
            Arrays.sort(listFiles, new b());
        }
        return listFiles;
    }

    void putTo(JSONObject jSONObject) {
        com.bytedance.android.input.k.b.a.y0(jSONObject, "package", this.mPackageName);
        com.bytedance.android.input.k.b.a.y0(jSONObject, KEY_APP_DISPLAY_NAME, this.mDisplayName);
        com.bytedance.android.input.k.b.a.y0(jSONObject, "app_version", this.mAppVersionName);
        com.bytedance.android.input.k.b.a.y0(jSONObject, "version_code", Integer.valueOf(this.mAppVersionCode));
        com.bytedance.android.input.k.b.a.y0(jSONObject, KEY_APP_VERIFY_INFO, this.mBitWide);
        com.bytedance.android.input.k.b.a.y0(jSONObject, KEY_APP_RELEASE_BUILD, this.mReleaseBuild);
        com.bytedance.android.input.k.b.a.y0(jSONObject, KEY_NPTH_BYTRACE_ID, this.mNpthBytraceId);
        com.bytedance.android.input.k.b.a.y0(jSONObject, "sdk_version", Integer.valueOf(this.mNpthVersionCode));
        com.bytedance.android.input.k.b.a.y0(jSONObject, KEY_NPTH_VERSION_NAME, this.mNpthVersionName);
        com.bytedance.android.input.k.b.a.y0(jSONObject, "last_update_time", Long.valueOf(this.mLastUpdateTime));
        Map<String, Object> map = this.mAppExtension;
        if (map != null) {
            for (String str : map.keySet()) {
                com.bytedance.android.input.k.b.a.y0(jSONObject, str, this.mAppExtension.get(str));
            }
        }
    }
}
