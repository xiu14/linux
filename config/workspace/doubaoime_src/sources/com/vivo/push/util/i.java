package com.vivo.push.util;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.model.NotifyArriveCallbackByUser;
import java.util.Map;

/* loaded from: classes2.dex */
public final class i extends b {

    /* renamed from: e, reason: collision with root package name */
    private int f8920e = 0;

    /* JADX WARN: Removed duplicated region for block: B:69:0x011d A[Catch: Exception -> 0x0191, TryCatch #1 {Exception -> 0x0191, blocks: (B:3:0x0005, B:5:0x000b, B:8:0x0013, B:17:0x003b, B:20:0x015d, B:23:0x0173, B:25:0x0044, B:26:0x0061, B:28:0x007e, B:59:0x00df, B:60:0x00f1, B:61:0x00fb, B:63:0x0105, B:65:0x0111, B:69:0x011d, B:70:0x0143, B:72:0x0153, B:73:0x0189, B:30:0x0083, B:32:0x0095, B:35:0x009c, B:36:0x00a4, B:38:0x00aa, B:41:0x00b2, B:44:0x00b8, B:47:0x00c4, B:54:0x00d4, B:56:0x00da), top: B:2:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0143 A[Catch: Exception -> 0x0191, TryCatch #1 {Exception -> 0x0191, blocks: (B:3:0x0005, B:5:0x000b, B:8:0x0013, B:17:0x003b, B:20:0x015d, B:23:0x0173, B:25:0x0044, B:26:0x0061, B:28:0x007e, B:59:0x00df, B:60:0x00f1, B:61:0x00fb, B:63:0x0105, B:65:0x0111, B:69:0x011d, B:70:0x0143, B:72:0x0153, B:73:0x0189, B:30:0x0083, B:32:0x0095, B:35:0x009c, B:36:0x00a4, B:38:0x00aa, B:41:0x00b2, B:44:0x00b8, B:47:0x00c4, B:54:0x00d4, B:56:0x00da), top: B:2:0x0005, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.content.Intent b(android.content.Context r10, com.vivo.push.model.InsideNotificationItem r11, com.vivo.push.model.NotifyArriveCallbackByUser r12) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.i.b(android.content.Context, com.vivo.push.model.InsideNotificationItem, com.vivo.push.model.NotifyArriveCallbackByUser):android.content.Intent");
    }

    @Override // com.vivo.push.util.b
    protected final int a() {
        return this.f8920e;
    }

    @Override // com.vivo.push.util.b
    protected final Intent a(Context context, InsideNotificationItem insideNotificationItem, NotifyArriveCallbackByUser notifyArriveCallbackByUser) {
        return b(context, insideNotificationItem, notifyArriveCallbackByUser);
    }

    @Override // com.vivo.push.util.b
    protected final PendingIntent a(Context context, Intent intent) {
        return PendingIntent.getActivity(context, (int) SystemClock.uptimeMillis(), intent, 201326592);
    }

    private Intent a(String str, String str2, InsideNotificationItem insideNotificationItem, Context context) {
        try {
            Intent parseUri = Intent.parseUri(str, 1);
            parseUri.setSelector(null);
            parseUri.setPackage(str2);
            parseUri.setFlags(335544320);
            a(parseUri, insideNotificationItem.getParams());
            int a = a(parseUri, str2);
            if (a <= 0) {
                return parseUri;
            }
            this.f8920e = a;
            t.c(context, " 落地页未找到，通知不展示：  " + this.f8920e);
            return null;
        } catch (Exception e2) {
            t.a("AndroidTwelveNotifyClickIntentParam", "sendFakeNoticeToClient open activity error : ".concat(String.valueOf(str)), e2);
            this.f8920e = 2158;
            return null;
        }
    }

    private Intent a(Map<String, String> map, String str, Context context) {
        Intent intent = new Intent();
        intent.setPackage(str);
        try {
            intent = context.getPackageManager().getLaunchIntentForPackage(str);
            if (intent != null) {
                intent.setFlags(335544320);
                a(intent, map);
            } else {
                this.f8920e = 2162;
                t.a("AndroidTwelveNotifyClickIntentParam", "sendFakeNoticeToClient LaunchIntent is null");
            }
        } catch (Exception e2) {
            e.a.a.a.a.h0(e2, new StringBuilder("sendFakeNoticeToClient LaunchIntent Exception"), "AndroidTwelveNotifyClickIntentParam");
        }
        return intent;
    }

    private static Intent a(Intent intent, Map<String, String> map) {
        if (map != null && map.entrySet() != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry != null && entry.getKey() != null) {
                    intent.putExtra(entry.getKey(), entry.getValue());
                }
            }
        }
        return intent;
    }

    private int a(Intent intent, String str) {
        int a = a(intent);
        t.d("AndroidTwelveNotifyClickIntentParam", "checkSkipContentParameterLegal canfindactivity code : ".concat(String.valueOf(a)));
        if (a != 0) {
            return a;
        }
        int b = b(intent, str);
        t.d("AndroidTwelveNotifyClickIntentParam", "checkSkipContentParameterLegal packagefit code : ".concat(String.valueOf(b)));
        if (b != 0) {
            return b;
        }
        return 0;
    }

    private int a(Intent intent) {
        if (intent.resolveActivityInfo(this.f8911c.getPackageManager(), 65536) != null) {
            return 0;
        }
        t.a("AndroidTwelveNotifyClickIntentParam", "activity is null  ");
        t.c(this.f8911c, " 跳转参数对应的Activity找不到 通知不展示   2162");
        return 2162;
    }

    private int b(Intent intent, String str) {
        if (intent != null && !TextUtils.isEmpty(str)) {
            try {
                String packageName = intent.getComponent() != null ? intent.getComponent().getPackageName() : intent.getPackage();
                if (TextUtils.isEmpty(packageName) || TextUtils.equals(str, packageName)) {
                    return 0;
                }
                t.d("AndroidTwelveNotifyClickIntentParam", "activity component error : local pkgName is " + str + "; but remote pkgName is " + packageName);
                t.a(this.f8911c, " 跳转参数对应的包名不是当前应用包名    local pkgName is " + str + "; but remote pkgName is " + packageName + " code =2813");
                return 2813;
            } catch (Exception e2) {
                e.a.a.a.a.h0(e2, new StringBuilder("checkSkipContentPackage open activity error :  error "), "AndroidTwelveNotifyClickIntentParam");
                return 2158;
            }
        }
        StringBuilder sb = new StringBuilder("checkSkipContentPackageFit intent = : ");
        Object obj = intent;
        if (intent == null) {
            obj = "";
        }
        sb.append(obj);
        sb.append(" mPkgName = ");
        sb.append(str);
        t.a("AndroidTwelveNotifyClickIntentParam", sb.toString());
        return 2158;
    }
}
