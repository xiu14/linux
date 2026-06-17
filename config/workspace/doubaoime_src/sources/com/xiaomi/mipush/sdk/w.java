package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.push.BuildConfig;
import com.xiaomi.push.ab;
import com.xiaomi.push.ah;
import com.xiaomi.push.bm;
import com.xiaomi.push.hu;
import com.xiaomi.push.hz;
import com.xiaomi.push.ie;
import com.xiaomi.push.ih;
import com.xiaomi.push.it;
import com.xiaomi.push.service.aq;
import com.xiaomi.push.service.as;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public class w {
    /* JADX INFO: Access modifiers changed from: private */
    public static String c(List<String> list) {
        String a = bm.a(d(list));
        return (TextUtils.isEmpty(a) || a.length() <= 4) ? "" : a.substring(0, 4).toLowerCase();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(List<String> list) {
        String str = "";
        if (ab.a(list)) {
            return "";
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, Collator.getInstance(Locale.CHINA));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            if (!TextUtils.isEmpty(str)) {
                str = e.a.a.a.a.s(str, Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            str = e.a.a.a.a.s(str, str2);
        }
        return str;
    }

    public static void a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        long j = sharedPreferences.getLong("last_sync_info", -1L);
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        long a = aq.a(context).a(hz.SyncInfoFrequency.a(), 1209600);
        if (j == -1) {
            sharedPreferences.edit().putLong("last_sync_info", currentTimeMillis).commit();
        } else if (Math.abs(currentTimeMillis - j) > a) {
            a(context, true);
            sharedPreferences.edit().putLong("last_sync_info", currentTimeMillis).commit();
        }
    }

    public static void a(final Context context, final boolean z) {
        ah.a(context).a(new Runnable() { // from class: com.xiaomi.mipush.sdk.w.1
            @Override // java.lang.Runnable
            public void run() {
                com.xiaomi.channel.commonutils.logger.c.m15a("do sync info");
                it itVar = new it(as.a(), false);
                b m41a = b.m41a(context);
                itVar.c(ie.SyncInfo.f611a);
                itVar.b(m41a.m42a());
                itVar.d(context.getPackageName());
                HashMap hashMap = new HashMap();
                itVar.f750a = hashMap;
                Context context2 = context;
                com.xiaomi.push.m.a(hashMap, "app_version", com.xiaomi.push.h.m454a(context2, context2.getPackageName()));
                Map<String, String> map = itVar.f750a;
                Context context3 = context;
                com.xiaomi.push.m.a(map, Constants.EXTRA_KEY_APP_VERSION_CODE, Integer.toString(com.xiaomi.push.h.a(context3, context3.getPackageName())));
                com.xiaomi.push.m.a(itVar.f750a, Constants.EXTRA_KEY_PUSH_BUNDLE_VERSION_CODE, Integer.toString(com.xiaomi.push.h.a(context)));
                com.xiaomi.push.m.a(itVar.f750a, "push_sdk_vn", BuildConfig.VERSION_NAME);
                com.xiaomi.push.m.a(itVar.f750a, "push_sdk_vc", Integer.toString(BuildConfig.VERSION_CODE));
                com.xiaomi.push.m.a(itVar.f750a, "token", m41a.b());
                if (!com.xiaomi.push.k.m662e()) {
                    String a = bm.a(com.xiaomi.push.j.b(context));
                    String d2 = com.xiaomi.push.j.d(context);
                    if (!TextUtils.isEmpty(d2)) {
                        a = e.a.a.a.a.t(a, Constants.ACCEPT_TIME_SEPARATOR_SP, d2);
                    }
                    if (!TextUtils.isEmpty(a)) {
                        com.xiaomi.push.m.a(itVar.f750a, Constants.EXTRA_KEY_IMEI_MD5, a);
                    }
                }
                com.xiaomi.push.aq.a(context).a(itVar.f750a);
                com.xiaomi.push.m.a(itVar.f750a, Constants.EXTRA_KEY_REG_ID, m41a.m49c());
                com.xiaomi.push.m.a(itVar.f750a, Constants.EXTRA_KEY_REG_SECRET, m41a.d());
                com.xiaomi.push.m.a(itVar.f750a, Constants.EXTRA_KEY_ACCEPT_TIME, MiPushClient.getAcceptTime(context).replace(Constants.ACCEPT_TIME_SEPARATOR_SP, Constants.ACCEPT_TIME_SEPARATOR_SERVER));
                if (z) {
                    com.xiaomi.push.m.a(itVar.f750a, Constants.EXTRA_KEY_ALIASES_MD5, w.c(MiPushClient.getAllAlias(context)));
                    com.xiaomi.push.m.a(itVar.f750a, Constants.EXTRA_KEY_TOPICS_MD5, w.c(MiPushClient.getAllTopic(context)));
                    com.xiaomi.push.m.a(itVar.f750a, Constants.EXTRA_KEY_ACCOUNTS_MD5, w.c(MiPushClient.getAllUserAccount(context)));
                } else {
                    com.xiaomi.push.m.a(itVar.f750a, Constants.EXTRA_KEY_ALIASES, w.d(MiPushClient.getAllAlias(context)));
                    com.xiaomi.push.m.a(itVar.f750a, Constants.EXTRA_KEY_TOPICS, w.d(MiPushClient.getAllTopic(context)));
                    com.xiaomi.push.m.a(itVar.f750a, Constants.EXTRA_KEY_ACCOUNTS, w.d(MiPushClient.getAllUserAccount(context)));
                }
                u.a(context).a((u) itVar, hu.Notification, false, (ih) null);
            }
        });
    }

    public static void a(Context context, it itVar) {
        StringBuilder M = e.a.a.a.a.M("need to update local info with: ");
        M.append(itVar.m574a());
        com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
        String str = itVar.m574a().get(Constants.EXTRA_KEY_ACCEPT_TIME);
        if (str != null) {
            MiPushClient.removeAcceptTime(context);
            String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            if (split.length == 2) {
                MiPushClient.addAcceptTime(context, split[0], split[1]);
                if ("00:00".equals(split[0]) && "00:00".equals(split[1])) {
                    b.m41a(context).a(true);
                } else {
                    b.m41a(context).a(false);
                }
            }
        }
        String str2 = itVar.m574a().get(Constants.EXTRA_KEY_ALIASES);
        if (str2 != null) {
            MiPushClient.removeAllAliases(context);
            if (!"".equals(str2)) {
                for (String str3 : str2.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                    MiPushClient.addAlias(context, str3);
                }
            }
        }
        String str4 = itVar.m574a().get(Constants.EXTRA_KEY_TOPICS);
        if (str4 != null) {
            MiPushClient.removeAllTopics(context);
            if (!"".equals(str4)) {
                for (String str5 : str4.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                    MiPushClient.addTopic(context, str5);
                }
            }
        }
        String str6 = itVar.m574a().get(Constants.EXTRA_KEY_ACCOUNTS);
        if (str6 != null) {
            MiPushClient.removeAllAccounts(context);
            if ("".equals(str6)) {
                return;
            }
            for (String str7 : str6.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                MiPushClient.addAccount(context, str7);
            }
        }
    }
}
