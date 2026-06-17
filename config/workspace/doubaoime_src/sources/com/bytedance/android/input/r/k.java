package com.bytedance.android.input.r;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICommonParams;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.crash.Npth;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class k {

    class a implements ICommonParams {
        a() {
        }

        @Override // com.bytedance.crash.ICommonParams
        public Map<String, Object> getCommonParams() {
            HashMap hashMap = new HashMap();
            IAppGlobals.a aVar = IAppGlobals.a;
            Objects.requireNonNull(aVar);
            hashMap.put(WsConstants.KEY_APP_ID, "401734");
            Objects.requireNonNull(aVar);
            hashMap.put("channel", d.a.b.a.c(aVar));
            Objects.requireNonNull(aVar);
            hashMap.put("app_version", "1.3.9");
            Objects.requireNonNull(aVar);
            hashMap.put("version_code", 100309006);
            Objects.requireNonNull(aVar);
            hashMap.put("update_version_code", 100309006);
            return hashMap;
        }

        @Override // com.bytedance.crash.ICommonParams
        public String getDeviceId() {
            return com.bytedance.applog.a.c();
        }

        @Override // com.bytedance.crash.ICommonParams
        public List<String> getPatchInfo() {
            return null;
        }

        @Override // com.bytedance.crash.ICommonParams
        public Map<String, Integer> getPluginInfo() {
            return null;
        }

        @Override // com.bytedance.crash.ICommonParams
        public String getSessionId() {
            return null;
        }

        @Override // com.bytedance.crash.ICommonParams
        public long getUserId() {
            return Long.valueOf(com.bytedance.applog.a.i()).longValue();
        }
    }

    class b implements ICrashCallback {
        b() {
        }

        @Override // com.bytedance.crash.ICrashCallback
        public void onCrash(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("crash occurs!\n");
                if (thread != null) {
                    sb.append("thread-name:");
                    sb.append(thread.getName());
                    sb.append("\n");
                    sb.append("thread-id:");
                    sb.append(thread.getId());
                    sb.append("\n");
                    sb.append("\n");
                }
                sb.append("crash-type:");
                sb.append(crashType);
                sb.append("\n");
                if (str != null) {
                    sb.append(str);
                    sb.append("\n");
                }
                j.j("NpthHelper", sb.toString());
            } catch (Exception e2) {
                j.k("NpthHelper", "registerCrashCallback error", e2);
            }
        }
    }

    public static void a(Context context) {
        String str;
        Signature[] apkContentsSigners;
        Npth.getConfigManager().setDebugMode(false);
        try {
            PackageManager packageManager = context.getPackageManager();
            apkContentsSigners = Build.VERSION.SDK_INT >= 28 ? packageManager.getPackageInfo(context.getPackageName(), 134217728).signingInfo.getApkContentsSigners() : packageManager.getPackageInfo(context.getPackageName(), 64).signatures;
        } catch (Exception e2) {
            j.k("NpthHelper", "getSignature error", e2);
        }
        if (apkContentsSigners != null && apkContentsSigners.length != 0) {
            byte[] digest = MessageDigest.getInstance("MD5").digest(apkContentsSigners[0].toByteArray());
            StringBuilder sb = new StringBuilder(digest.length * 2);
            for (byte b2 : digest) {
                sb.append(Character.forDigit((b2 >> 4) & 15, 16));
                sb.append(Character.forDigit(b2 & 15, 16));
            }
            str = sb.toString();
            Npth.addTag("signature", str);
            Npth.init(context, new a(), true, true, true);
            Npth.unregisterCrashCallback(new b(), CrashType.ALL);
        }
        str = "none";
        Npth.addTag("signature", str);
        Npth.init(context, new a(), true, true, true);
        Npth.unregisterCrashCallback(new b(), CrashType.ALL);
    }
}
