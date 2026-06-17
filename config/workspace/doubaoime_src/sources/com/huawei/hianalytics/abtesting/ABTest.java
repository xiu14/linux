package com.huawei.hianalytics.abtesting;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hianalytics.g.b;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public class ABTest {
    public static String getExpParam(String str, String str2) {
        b.b("ABTest", "getExpParam() is execute");
        if (TextUtils.isEmpty(str)) {
            b.c("ABTest", "paramkey is null");
        } else {
            String a = a.a().a(str);
            if (!TextUtils.isEmpty(a)) {
                return a;
            }
        }
        return str2;
    }

    public static void initABTest(Context context, ABTestConfig aBTestConfig) {
        b.b("ABTest", "initABTest() is execute");
        a.a().a(context, aBTestConfig);
    }

    public static void onEvent(String str, String str2, LinkedHashMap<String, String> linkedHashMap) {
        b.b("ABTest", "onEvent() is execute");
        if (TextUtils.isEmpty(str)) {
            b.c("ABTest", "onEvent() paramkey is null");
        } else {
            a.a().a(str, str2, linkedHashMap);
        }
    }

    public static void onReport() {
        b.b("ABTest", "onReport() is execute");
        a.a().b();
    }

    public static void setExpSyncInterval(int i) {
        b.b("ABTest", "setExpSyncInterval() is execute");
        if (i < 10) {
            i = 10;
        }
        a.a().a(i);
    }

    public static void syncExpParameters() {
        b.b("ABTest", "syncExpParameters() is execute");
        a.a().c();
    }
}
