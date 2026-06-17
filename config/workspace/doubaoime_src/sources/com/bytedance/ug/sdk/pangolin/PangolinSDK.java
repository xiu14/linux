package com.bytedance.ug.sdk.pangolin;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import androidx.annotation.Keep;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
/* loaded from: classes2.dex */
public class PangolinSDK {
    private static String[] mApkInfos = new String[3];
    private static volatile boolean mIsInit = false;

    private static String getApkPath(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo == null) {
                return null;
            }
            return applicationInfo.sourceDir;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getChannel(Context context) {
        if (!mIsInit) {
            initApkInfo(context);
            mIsInit = true;
        }
        Map<String, String> map = getMap(getExtra(context));
        return (map == null || map.size() <= 0) ? "" : map.get("meta_umeng_channel");
    }

    public static String getExtra(Context context) {
        if (!mIsInit) {
            initApkInfo(context);
            mIsInit = true;
        }
        return !TextUtils.isEmpty(mApkInfos[0]) ? mApkInfos[0] : !TextUtils.isEmpty(mApkInfos[1]) ? mApkInfos[1] : "";
    }

    public static Map<String, String> getMap(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            HashMap hashMap = new HashMap();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            return hashMap;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        } catch (Exception e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public static Map<String, String> getTraceInfo(Context context) {
        if (!mIsInit) {
            initApkInfo(context);
            mIsInit = true;
        }
        Map<String, String> map = getMap(mApkInfos[2]);
        return map == null ? new HashMap() : map;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void initApkInfo(android.content.Context r13) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ug.sdk.pangolin.PangolinSDK.initApkInfo(android.content.Context):void");
    }
}
