package com.xiaomi.push.service;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/* loaded from: classes2.dex */
public class ad {
    private static Object a = new Object();

    /* renamed from: a, reason: collision with other field name */
    private static Map<String, Queue<String>> f1013a = new HashMap();

    public static boolean a(XMPushService xMPushService, String str, String str2) {
        return a(xMPushService, str, str2, "");
    }

    public static boolean a(XMPushService xMPushService, String str, String str2, String str3) {
        synchronized (a) {
            if (str3 == null) {
                str3 = "";
            }
            String str4 = str3 + str;
            SharedPreferences sharedPreferences = xMPushService.getSharedPreferences("push_message_ids", 0);
            Queue<String> queue = f1013a.get(str4);
            if (queue == null) {
                String[] split = sharedPreferences.getString(str4, "").split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                LinkedList linkedList = new LinkedList();
                for (String str5 : split) {
                    if (!TextUtils.isEmpty(str5)) {
                        linkedList.add(str5);
                    }
                }
                f1013a.put(str4, linkedList);
                queue = linkedList;
            }
            if (queue.contains(str2)) {
                return true;
            }
            queue.add(str2);
            if (queue.size() > 25) {
                queue.poll();
            }
            String a2 = com.xiaomi.push.bm.a(queue, Constants.ACCEPT_TIME_SEPARATOR_SP);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(str4, a2);
            edit.commit();
            return false;
        }
    }
}
