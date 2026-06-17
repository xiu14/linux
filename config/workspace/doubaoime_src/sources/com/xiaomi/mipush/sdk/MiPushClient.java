package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.vivo.push.PushClient;
import com.xiaomi.clientreport.data.Config;
import com.xiaomi.clientreport.manager.ClientReportClient;
import com.xiaomi.mipush.sdk.MiTinyDataClient;
import com.xiaomi.push.BuildConfig;
import com.xiaomi.push.ah;
import com.xiaomi.push.ax;
import com.xiaomi.push.bm;
import com.xiaomi.push.dn;
import com.xiaomi.push.dw;
import com.xiaomi.push.dx;
import com.xiaomi.push.el;
import com.xiaomi.push.em;
import com.xiaomi.push.en;
import com.xiaomi.push.fs;
import com.xiaomi.push.hu;
import com.xiaomi.push.hy;
import com.xiaomi.push.hz;
import com.xiaomi.push.ie;
import com.xiaomi.push.ih;
import com.xiaomi.push.ii;
import com.xiaomi.push.io;
import com.xiaomi.push.it;
import com.xiaomi.push.iu;
import com.xiaomi.push.iy;
import com.xiaomi.push.ja;
import com.xiaomi.push.jc;
import com.xiaomi.push.service.aq;
import com.xiaomi.push.service.as;
import com.xiaomi.push.service.ay;
import com.xiaomi.push.service.receivers.NetworkStatusReceiver;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public abstract class MiPushClient {
    public static final String COMMAND_REGISTER = "register";
    public static final String COMMAND_SET_ACCEPT_TIME = "accept-time";
    public static final String COMMAND_SET_ACCOUNT = "set-account";
    public static final String COMMAND_SET_ALIAS = "set-alias";
    public static final String COMMAND_SUBSCRIBE_TOPIC = "subscribe-topic";
    public static final String COMMAND_UNREGISTER = "unregister";
    public static final String COMMAND_UNSET_ACCOUNT = "unset-account";
    public static final String COMMAND_UNSET_ALIAS = "unset-alias";
    public static final String COMMAND_UNSUBSCRIBE_TOPIC = "unsubscibe-topic";
    public static final String PREF_EXTRA = "mipush_extra";
    public static final int SEND_STATUS_APP_INFO_INVALID = -7;
    public static final int SEND_STATUS_CONTEXT_IS_NULL = -1;
    public static final int SEND_STATUS_INTERNAL_EXCEPTION = -5;
    public static final int SEND_STATUS_INVALID_REGISTRATION_INFO = -2;
    public static final int SEND_STATUS_NO_NETWORK_CONNECTIVITY = -6;
    public static final int SEND_STATUS_OK = 0;
    public static final int SEND_STATUS_PUSH_ENGINE_NOT_SUPPORT = -3;
    public static final int SEND_STATUS_REQUEST_TOO_FREQUENTLY = -4;
    private static Context sContext;
    public static final String COMMAND_SUBSCRIBE_LBS = fs.COMMAND_SUBSCRIBE_LBS_PUSH.f436a;
    public static final String COMMAND_UNSUBSCRIBE_LBS = fs.COMMAND_UNSUBSCRIBE_LBS_PUSH.f436a;
    public static final String COMMAND_CHECK_SUPPORT_LBS = fs.COMMAND_CHECK_SUPPORT_LBS.f436a;
    private static long sCurMsgId = System.currentTimeMillis();

    public static class CodeResult {
        private long resultCode = -1;

        public long getResultCode() {
            return this.resultCode;
        }

        protected void setResultCode(long j) {
            this.resultCode = j;
        }
    }

    public interface ICallbackResult<R> {
        void onResult(R r);
    }

    @Deprecated
    public static abstract class MiPushClientCallback {
        private String category;

        protected String getCategory() {
            return this.category;
        }

        public void onCommandResult(String str, long j, String str2, List<String> list) {
        }

        public void onInitializeResult(long j, String str, String str2) {
        }

        public void onReceiveMessage(MiPushMessage miPushMessage) {
        }

        public void onReceiveMessage(String str, String str2, String str3, boolean z) {
        }

        public void onSubscribeResult(long j, String str, String str2) {
        }

        public void onUnsubscribeResult(long j, String str, String str2) {
        }

        protected void setCategory(String str) {
            this.category = str;
        }
    }

    public static class TokenResult {
        private String token = null;
        private long resultCode = -1;

        public long getResultCode() {
            return this.resultCode;
        }

        public String getToken() {
            return this.token;
        }

        protected void setResultCode(long j) {
            this.resultCode = j;
        }

        protected void setToken(String str) {
            this.token = str;
        }
    }

    public interface UPSRegisterCallBack extends ICallbackResult<TokenResult> {
    }

    public interface UPSTurnCallBack extends ICallbackResult<CodeResult> {
    }

    public interface UPSUnRegisterCallBack extends ICallbackResult<TokenResult> {
    }

    private static boolean acceptTimeSet(Context context, String str, String str2) {
        return TextUtils.equals(getAcceptTime(context), str + Constants.ACCEPT_TIME_SEPARATOR_SP + str2);
    }

    public static long accountSetTime(Context context, String str) {
        return context.getSharedPreferences("mipush_extra", 0).getLong("account_" + str, -1L);
    }

    static synchronized void addAcceptTime(Context context, String str, String str2) {
        synchronized (MiPushClient.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.putString(Constants.EXTRA_KEY_ACCEPT_TIME, str + Constants.ACCEPT_TIME_SEPARATOR_SP + str2);
            com.xiaomi.push.q.a(edit);
        }
    }

    static synchronized void addAccount(Context context, String str) {
        synchronized (MiPushClient.class) {
            context.getSharedPreferences("mipush_extra", 0).edit().putLong("account_" + str, System.currentTimeMillis()).commit();
        }
    }

    static synchronized void addAlias(Context context, String str) {
        synchronized (MiPushClient.class) {
            context.getSharedPreferences("mipush_extra", 0).edit().putLong("alias_" + str, System.currentTimeMillis()).commit();
        }
    }

    public static Bundle addProfileId(String str) {
        if (TextUtils.isEmpty(str)) {
            Bundle bundle = new Bundle();
            bundle.putString("code", PushClient.DEFAULT_REQUEST_ID);
            bundle.putString("msg", "profileId is empty");
            return bundle;
        }
        Bundle checkUnregisterStatus = checkUnregisterStatus();
        if (checkUnregisterStatus != null) {
            return checkUnregisterStatus;
        }
        try {
            Uri parse = Uri.parse("content://com.xiaomi.push.provider.profile");
            Bundle bundle2 = new Bundle();
            bundle2.putString("profileId", str);
            return com.xiaomi.push.t.m841a().getContentResolver().call(parse, "addProfileId", (String) null, bundle2);
        } catch (Exception e2) {
            String str2 = "error occurred while execute method addProfileId. Exception:" + e2;
            Bundle bundle3 = new Bundle();
            bundle3.putString("code", PushClient.DEFAULT_REQUEST_ID);
            bundle3.putString("msg", str2);
            com.xiaomi.channel.commonutils.logger.c.d(str2);
            return null;
        }
    }

    private static void addPullNotificationTime(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
        edit.putLong("last_pull_notification", System.currentTimeMillis());
        com.xiaomi.push.q.a(edit);
    }

    private static void addRegRequestTime(Context context) {
        addRequestTime(context, "last_reg_request");
    }

    private static void addRequestTime(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
        edit.putLong(str, System.currentTimeMillis());
        com.xiaomi.push.q.a(edit);
    }

    static synchronized void addTopic(Context context, String str) {
        synchronized (MiPushClient.class) {
            context.getSharedPreferences("mipush_extra", 0).edit().putLong("topic_" + str, System.currentTimeMillis()).commit();
        }
    }

    public static long aliasSetTime(Context context, String str) {
        return context.getSharedPreferences("mipush_extra", 0).getLong("alias_" + str, -1L);
    }

    public static void awakeApps(final Context context, final String[] strArr) {
        ah.a(context).a(new Runnable() { // from class: com.xiaomi.mipush.sdk.MiPushClient.4
            @Override // java.lang.Runnable
            public void run() {
                PackageInfo packageInfo;
                try {
                    for (String str : strArr) {
                        if (!TextUtils.isEmpty(str) && (packageInfo = context.getPackageManager().getPackageInfo(str, 4)) != null) {
                            MiPushClient.awakePushServiceByPackageInfo(context, packageInfo);
                        }
                    }
                } catch (Throwable th) {
                    com.xiaomi.channel.commonutils.logger.c.m18a(th);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void awakePushServiceByPackageInfo(Context context, PackageInfo packageInfo) {
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                if (serviceInfo.exported && serviceInfo.enabled && "com.xiaomi.mipush.sdk.PushMessageHandler".equals(serviceInfo.name) && !context.getPackageName().equals(serviceInfo.packageName)) {
                    try {
                        Thread.sleep(((long) ((Math.random() * 2.0d) + 1.0d)) * 1000);
                        Intent intent = new Intent();
                        intent.setClassName(serviceInfo.packageName, serviceInfo.name);
                        intent.setAction("com.xiaomi.mipush.sdk.WAKEUP");
                        intent.putExtra("waker_pkgname", context.getPackageName());
                        PushMessageHandler.a(context, intent);
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
            }
        }
    }

    public static int checkLBSPushSupport(Context context, String str, String str2) {
        try {
            if (context == null) {
                com.xiaomi.channel.commonutils.logger.c.m15a("Context is null when checking LBS push support.");
                return -1;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                initContext(context);
                if (!com.xiaomi.push.h.a(context, "com.xiaomi.xmsf", "lbs_push_support")) {
                    com.xiaomi.channel.commonutils.logger.c.m15a("Push client not support when checking LBS push support.");
                    return -3;
                }
                if (!shouldSendRequest(context, "last_check_lbs_push_support_request")) {
                    com.xiaomi.channel.commonutils.logger.c.m15a("Could not check LBS push support within 5s repeatedly.");
                    return -4;
                }
                addRequestTime(context, "last_check_lbs_push_support_request");
                String a = as.a();
                String packageName = context.getPackageName();
                fs fsVar = fs.COMMAND_CHECK_SUPPORT_LBS;
                io ioVar = new io(a, str, fsVar.f436a);
                ArrayList arrayList = new ArrayList();
                arrayList.add(fsVar.f436a);
                ioVar.f711a = arrayList;
                ioVar.d(packageName);
                u.a(context).a(ioVar, hu.Command, false, false, null, false, packageName, str, true, false, ay.q);
                return 0;
            }
            com.xiaomi.channel.commonutils.logger.c.m15a("appID|appToken is empty when checking LBS push support.");
            return -7;
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.c.m15a("error occurred when checking LBS push support. e:" + th);
            return -5;
        }
    }

    private static void checkNotNull(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(e.a.a.a.a.t("param ", str, " is not nullable"));
        }
    }

    private static Bundle checkUnregisterStatus() {
        Context m841a = com.xiaomi.push.t.m841a();
        if (m841a == null) {
            Bundle bundle = new Bundle();
            bundle.putString("code", PushClient.DEFAULT_REQUEST_ID);
            bundle.putString("msg", "Push SDK not init");
            return bundle;
        }
        if (b.m41a(m841a).m50c()) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("code", PushClient.DEFAULT_REQUEST_ID);
        bundle2.putString("msg", "register info is invalid");
        com.xiaomi.channel.commonutils.logger.c.m15a("register info is invalid");
        return bundle2;
    }

    protected static void clearExtras(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
        edit.clear();
        edit.commit();
    }

    private static void clearExtrasForInitialize(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
        Iterator<String> it2 = getAllAlias(context).iterator();
        while (it2.hasNext()) {
            edit.remove("alias_" + it2.next());
        }
        Iterator<String> it3 = getAllUserAccount(context).iterator();
        while (it3.hasNext()) {
            edit.remove("account_" + it3.next());
        }
        Iterator<String> it4 = getAllTopic(context).iterator();
        while (it4.hasNext()) {
            edit.remove("topic_" + it4.next());
        }
        edit.remove(Constants.EXTRA_KEY_LBS_PUSH);
        edit.remove(Constants.EXTRA_KEY_ACCEPT_TIME);
        edit.commit();
    }

    public static void clearLocalNotificationType(Context context) {
        u.a(context).f();
    }

    public static void clearNotification(Context context, int i) {
        u.a(context).a(i);
    }

    public static Bundle deleteAllProfileId() {
        Bundle checkUnregisterStatus = checkUnregisterStatus();
        if (checkUnregisterStatus != null) {
            return checkUnregisterStatus;
        }
        try {
            return com.xiaomi.push.t.m841a().getContentResolver().call(Uri.parse("content://com.xiaomi.push.provider.profile"), "deleteAllProfileId", (String) null, new Bundle());
        } catch (Exception e2) {
            String str = "error occurred while execute method delete all profile id. Exception:" + e2;
            Bundle bundle = new Bundle();
            bundle.putString("code", PushClient.DEFAULT_REQUEST_ID);
            bundle.putString("msg", str);
            com.xiaomi.channel.commonutils.logger.c.d(str);
            return null;
        }
    }

    public static Bundle deleteProfileId(String str) {
        if (TextUtils.isEmpty(str)) {
            Bundle bundle = new Bundle();
            bundle.putString("code", PushClient.DEFAULT_REQUEST_ID);
            bundle.putString("msg", "profileId is empty");
            return bundle;
        }
        Bundle checkUnregisterStatus = checkUnregisterStatus();
        if (checkUnregisterStatus != null) {
            return checkUnregisterStatus;
        }
        try {
            Uri parse = Uri.parse("content://com.xiaomi.push.provider.profile");
            Bundle bundle2 = new Bundle();
            bundle2.putString("profileId", str);
            return com.xiaomi.push.t.m841a().getContentResolver().call(parse, "deleteProfileId", (String) null, bundle2);
        } catch (Exception e2) {
            String str2 = "error occurred while execute method delete profile id. Exception:" + e2;
            Bundle bundle3 = new Bundle();
            bundle3.putString("code", PushClient.DEFAULT_REQUEST_ID);
            bundle3.putString("msg", str2);
            com.xiaomi.channel.commonutils.logger.c.d(str2);
            return null;
        }
    }

    public static void disablePush(Context context) {
        u.a(context).a(true);
    }

    public static void enablePush(Context context) {
        u.a(context).a(false);
    }

    protected static String getAcceptTime(Context context) {
        return context.getSharedPreferences("mipush_extra", 0).getString(Constants.EXTRA_KEY_ACCEPT_TIME, "00:00-23:59");
    }

    public static List<String> getAllAlias(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getSharedPreferences("mipush_extra", 0).getAll().keySet()) {
            if (str.startsWith("alias_")) {
                arrayList.add(str.substring(6));
            }
        }
        return arrayList;
    }

    public static List<String> getAllTopic(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getSharedPreferences("mipush_extra", 0).getAll().keySet()) {
            if (str.startsWith("topic_") && !str.contains("**ALL**")) {
                arrayList.add(str.substring(6));
            }
        }
        return arrayList;
    }

    public static List<String> getAllUserAccount(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getSharedPreferences("mipush_extra", 0).getAll().keySet()) {
            if (str.startsWith("account_")) {
                arrayList.add(str.substring(8));
            }
        }
        return arrayList;
    }

    public static String getAppRegion(Context context) {
        if (b.m41a(context).m50c()) {
            return b.m41a(context).f();
        }
        return null;
    }

    private static boolean getDefaultSwitch() {
        return com.xiaomi.push.k.m659b();
    }

    protected static boolean getOpenFCMPush(Context context) {
        checkNotNull(context, "context");
        return e.a(context).b(d.ASSEMBLE_PUSH_FCM);
    }

    protected static boolean getOpenHmsPush(Context context) {
        checkNotNull(context, "context");
        return e.a(context).b(d.ASSEMBLE_PUSH_HUAWEI);
    }

    protected static boolean getOpenOPPOPush(Context context) {
        checkNotNull(context, "context");
        return e.a(context).b(d.ASSEMBLE_PUSH_COS);
    }

    protected static boolean getOpenVIVOPush(Context context) {
        return e.a(context).b(d.ASSEMBLE_PUSH_FTOS);
    }

    public static String getRegId(Context context) {
        if (b.m41a(context).m50c()) {
            return b.m41a(context).m49c();
        }
        return null;
    }

    public static boolean hasSubscribedLBSPush(Context context, String str, String str2) {
        try {
            if (context == null) {
                com.xiaomi.channel.commonutils.logger.c.m15a("context is null when checking LBS push subscription status");
                return false;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                initContext(context);
                if (!com.xiaomi.push.h.a(context, "com.xiaomi.xmsf", "lbs_push_support")) {
                    com.xiaomi.channel.commonutils.logger.c.m15a("push client not support when checking LBS push subscription status");
                    return false;
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
                if (sharedPreferences != null) {
                    return sharedPreferences.contains(Constants.EXTRA_KEY_LBS_PUSH);
                }
                com.xiaomi.channel.commonutils.logger.c.m15a("sp is null when checking LBS push subscription status");
                return false;
            }
            com.xiaomi.channel.commonutils.logger.c.m15a("appID|appToken is empty when checking LBS push subscription status");
            return false;
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.c.m15a("error occurred when checking LBS push subscription status. e:" + th);
            return false;
        }
    }

    private static void initContext(Context context) {
        if (context != null && com.xiaomi.push.t.m841a() == null) {
            Context applicationContext = context.getApplicationContext();
            sContext = applicationContext;
            com.xiaomi.push.t.a(applicationContext);
        }
    }

    private static void initEventPerfLogic(final Context context) {
        en.a(new en.a() { // from class: com.xiaomi.mipush.sdk.MiPushClient.5
            @Override // com.xiaomi.push.en.a
            public void uploader(Context context2, hy hyVar) {
                MiTinyDataClient.upload(context2, hyVar);
            }
        });
        Config a = en.a(context);
        com.xiaomi.clientreport.manager.a.a(context).a(BuildConfig.VERSION_NAME);
        ClientReportClient.init(context, a, new el(context), new em(context));
        a.a(context);
        k.a(context, a);
        aq.a(context).a(new aq.a(100, "perf event job update") { // from class: com.xiaomi.mipush.sdk.MiPushClient.6
            @Override // com.xiaomi.push.service.aq.a
            protected void onCallback() {
                en.m353a(context);
            }
        });
    }

    @Deprecated
    public static void initialize(Context context, String str, String str2, MiPushClientCallback miPushClientCallback) {
        initialize(context, str, str2, miPushClientCallback, null, null);
    }

    private static void operateSyncAction(Context context) {
        if ("syncing".equals(p.a(sContext).a(v.DISABLE_PUSH))) {
            disablePush(sContext);
        }
        if ("syncing".equals(p.a(sContext).a(v.ENABLE_PUSH))) {
            enablePush(sContext);
        }
        p a = p.a(sContext);
        v vVar = v.UPLOAD_HUAWEI_TOKEN;
        if ("syncing".equals(a.a(vVar))) {
            u.a(sContext).a((String) null, vVar, d.ASSEMBLE_PUSH_HUAWEI, "init");
        }
        if ("syncing".equals(p.a(sContext).a(v.UPLOAD_FCM_TOKEN))) {
            syncAssembleFCMPushToken(sContext);
        }
        p a2 = p.a(sContext);
        v vVar2 = v.UPLOAD_COS_TOKEN;
        if ("syncing".equals(a2.a(vVar2))) {
            u.a(sContext).a((String) null, vVar2, d.ASSEMBLE_PUSH_COS, "init");
        }
        p a3 = p.a(sContext);
        v vVar3 = v.UPLOAD_FTOS_TOKEN;
        if ("syncing".equals(a3.a(vVar3))) {
            u.a(context).a((String) null, vVar3, d.ASSEMBLE_PUSH_FTOS, "init");
        }
    }

    public static void pausePush(Context context, String str) {
        setAcceptTime(context, 0, 0, 0, 0, str);
    }

    public static Bundle queryProfileIds() {
        Bundle checkUnregisterStatus = checkUnregisterStatus();
        if (checkUnregisterStatus != null) {
            return checkUnregisterStatus;
        }
        try {
            return com.xiaomi.push.t.m841a().getContentResolver().call(Uri.parse("content://com.xiaomi.push.provider.profile"), "queryProfileIds", (String) null, new Bundle());
        } catch (Exception e2) {
            String str = "error occurred while execute method query profile ids. Exception:" + e2;
            Bundle bundle = new Bundle();
            bundle.putString("code", PushClient.DEFAULT_REQUEST_ID);
            bundle.putString("msg", str);
            com.xiaomi.channel.commonutils.logger.c.d(str);
            return null;
        }
    }

    static void reInitialize(Context context, ii iiVar) {
        com.xiaomi.channel.commonutils.logger.c.e("re-register reason: " + iiVar);
        String a = bm.a(6);
        String m42a = b.m41a(context).m42a();
        String b = b.m41a(context).b();
        b.m41a(context).m43a();
        clearExtrasForInitialize(context);
        clearNotification(context);
        b.m41a(context).a(Constants.a());
        b.m41a(context).a(m42a, b, a);
        iu iuVar = new iu();
        iuVar.a(as.b());
        iuVar.b(m42a);
        iuVar.e(b);
        iuVar.f(a);
        iuVar.d(context.getPackageName());
        iuVar.c(com.xiaomi.push.h.m454a(context, context.getPackageName()));
        Context context2 = sContext;
        iuVar.b(com.xiaomi.push.h.a(context2, context2.getPackageName()));
        iuVar.d(com.xiaomi.push.h.a(sContext));
        iuVar.h(BuildConfig.VERSION_NAME);
        iuVar.a(BuildConfig.VERSION_CODE);
        iuVar.a(iiVar);
        int a2 = com.xiaomi.push.j.a();
        if (a2 >= 0) {
            iuVar.c(a2);
        }
        u.a(context).a(iuVar, false);
    }

    @Deprecated
    public static void registerCrashHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
    }

    private static void registerNetworkReceiver(Context context) {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            com.xiaomi.push.n.a(context.getApplicationContext(), new NetworkStatusReceiver(null), intentFilter, 2);
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.c.m15a("dynamic register network status receiver failed:" + th);
        }
        ax.m111a(sContext);
    }

    public static void registerPush(Context context, String str, String str2) {
        registerPush(context, str, str2, new PushConfiguration());
    }

    public static void registerToken(Context context, String str, String str2, String str3, UPSRegisterCallBack uPSRegisterCallBack) {
        registerPush(context, str, str2, new PushConfiguration(), null, uPSRegisterCallBack);
    }

    static synchronized void removeAcceptTime(Context context) {
        synchronized (MiPushClient.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.remove(Constants.EXTRA_KEY_ACCEPT_TIME);
            com.xiaomi.push.q.a(edit);
        }
    }

    static synchronized void removeAccount(Context context, String str) {
        synchronized (MiPushClient.class) {
            context.getSharedPreferences("mipush_extra", 0).edit().remove("account_" + str).commit();
        }
    }

    static synchronized void removeAlias(Context context, String str) {
        synchronized (MiPushClient.class) {
            context.getSharedPreferences("mipush_extra", 0).edit().remove("alias_" + str).commit();
        }
    }

    static synchronized void removeAllAccounts(Context context) {
        synchronized (MiPushClient.class) {
            Iterator<String> it2 = getAllUserAccount(context).iterator();
            while (it2.hasNext()) {
                removeAccount(context, it2.next());
            }
        }
    }

    static synchronized void removeAllAliases(Context context) {
        synchronized (MiPushClient.class) {
            Iterator<String> it2 = getAllAlias(context).iterator();
            while (it2.hasNext()) {
                removeAlias(context, it2.next());
            }
        }
    }

    static synchronized void removeAllTopics(Context context) {
        synchronized (MiPushClient.class) {
            Iterator<String> it2 = getAllTopic(context).iterator();
            while (it2.hasNext()) {
                removeTopic(context, it2.next());
            }
        }
    }

    static synchronized void removeLBS(Context context) {
        synchronized (MiPushClient.class) {
            context.getSharedPreferences("mipush_extra", 0).edit().remove(Constants.EXTRA_KEY_LBS_PUSH).commit();
        }
    }

    static synchronized void removeTopic(Context context, String str) {
        synchronized (MiPushClient.class) {
            context.getSharedPreferences("mipush_extra", 0).edit().remove("topic_" + str).commit();
        }
    }

    public static void removeWindow(Context context) {
        u.a(context).m92e();
    }

    public static void reportAppRunInBackground(Context context, boolean z) {
        if (b.m41a(context).m48b()) {
            ie ieVar = z ? ie.APP_SLEEP : ie.APP_WAKEUP;
            it itVar = new it();
            itVar.b(b.m41a(context).m42a());
            itVar.c(ieVar.f611a);
            itVar.d(context.getPackageName());
            itVar.a(as.a());
            itVar.a(false);
            u.a(context).a((u) itVar, hu.Notification, false, (ih) null, false);
        }
    }

    static void reportIgnoreRegMessageClicked(Context context, String str, ih ihVar, String str2, String str3) {
        it itVar = new it();
        if (TextUtils.isEmpty(str3)) {
            com.xiaomi.channel.commonutils.logger.c.d("do not report clicked message");
            return;
        }
        itVar.b(str3);
        itVar.c("bar:click");
        itVar.a(str);
        itVar.a(false);
        u.a(context).a(itVar, hu.Notification, false, true, ihVar, true, str2, str3);
    }

    @Deprecated
    public static void reportMessageClicked(Context context, String str) {
        reportMessageClicked(context, str, null, null);
    }

    public static void resumePush(Context context, String str) {
        setAcceptTime(context, 0, 0, 23, 59, str);
    }

    static synchronized void saveLBS(Context context) {
        synchronized (MiPushClient.class) {
            context.getSharedPreferences("mipush_extra", 0).edit().putLong(Constants.EXTRA_KEY_LBS_PUSH, System.currentTimeMillis()).commit();
        }
    }

    private static void scheduleDataCollectionJobs(Context context) {
        if (aq.a(sContext).a(hz.DataCollectionSwitch.a(), getDefaultSwitch())) {
            dw.a().a(new i(context));
            ah.a(sContext).a(new Runnable() { // from class: com.xiaomi.mipush.sdk.MiPushClient.2
                @Override // java.lang.Runnable
                public void run() {
                    dx.a(MiPushClient.sContext);
                }
            }, 10);
        }
    }

    private static void scheduleOcVersionCheckJob() {
        ah.a(sContext).a(new o(sContext), aq.a(sContext).a(hz.OcVersionCheckFrequency.a(), RemoteMessageConst.DEFAULT_TTL), 5);
    }

    public static void setAcceptTime(Context context, int i, int i2, int i3, int i4, String str) {
        if (i < 0 || i >= 24 || i3 < 0 || i3 >= 24 || i2 < 0 || i2 >= 60 || i4 < 0 || i4 >= 60) {
            throw new IllegalArgumentException("the input parameter is not valid.");
        }
        long rawOffset = ((TimeZone.getTimeZone("GMT+08").getRawOffset() - TimeZone.getDefault().getRawOffset()) / 1000) / 60;
        long j = ((((i * 60) + i2) + rawOffset) + 1440) % 1440;
        long j2 = ((((i3 * 60) + i4) + rawOffset) + 1440) % 1440;
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(j / 60), Long.valueOf(j % 60)));
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(j2 / 60), Long.valueOf(j2 % 60)));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(String.format("%1$02d:%2$02d", Integer.valueOf(i), Integer.valueOf(i2)));
        arrayList2.add(String.format("%1$02d:%2$02d", Integer.valueOf(i3), Integer.valueOf(i4)));
        if (!acceptTimeSet(context, (String) arrayList.get(0), (String) arrayList.get(1))) {
            setCommand(context, fs.COMMAND_SET_ACCEPT_TIME.f436a, (ArrayList<String>) arrayList, str);
        } else if (1 == PushMessageHelper.getPushMode(context)) {
            PushMessageHandler.a(context, str, fs.COMMAND_SET_ACCEPT_TIME.f436a, 0L, null, arrayList2);
        } else {
            PushMessageHelper.sendCommandMessageBroadcast(context, PushMessageHelper.generateCommandMessage(fs.COMMAND_SET_ACCEPT_TIME.f436a, arrayList2, 0L, null, null, null));
        }
    }

    public static void setAlias(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        setCommand(context, fs.COMMAND_SET_ALIAS.f436a, str, str2);
    }

    protected static void setCommand(Context context, String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
        }
        fs fsVar = fs.COMMAND_SET_ALIAS;
        if (fsVar.f436a.equalsIgnoreCase(str) && Math.abs(System.currentTimeMillis() - aliasSetTime(context, str2)) < com.heytap.mcssdk.constant.a.f6888f) {
            if (1 == PushMessageHelper.getPushMode(context)) {
                PushMessageHandler.a(context, str3, str, 0L, null, arrayList);
                return;
            } else {
                PushMessageHelper.sendCommandMessageBroadcast(context, PushMessageHelper.generateCommandMessage(fsVar.f436a, arrayList, 0L, null, str3, null));
                return;
            }
        }
        if (fs.COMMAND_UNSET_ALIAS.f436a.equalsIgnoreCase(str) && aliasSetTime(context, str2) < 0) {
            StringBuilder M = e.a.a.a.a.M("Don't cancel alias for ");
            M.append(bm.a(arrayList.toString(), 3));
            M.append(" is unseted");
            com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
            return;
        }
        fs fsVar2 = fs.COMMAND_SET_ACCOUNT;
        if (fsVar2.f436a.equalsIgnoreCase(str) && Math.abs(System.currentTimeMillis() - accountSetTime(context, str2)) < 3600000) {
            if (1 == PushMessageHelper.getPushMode(context)) {
                PushMessageHandler.a(context, str3, str, 0L, null, arrayList);
                return;
            } else {
                PushMessageHelper.sendCommandMessageBroadcast(context, PushMessageHelper.generateCommandMessage(fsVar2.f436a, arrayList, 0L, null, str3, null));
                return;
            }
        }
        if (!fs.COMMAND_UNSET_ACCOUNT.f436a.equalsIgnoreCase(str) || accountSetTime(context, str2) >= 0) {
            setCommand(context, str, (ArrayList<String>) arrayList, str3);
            return;
        }
        StringBuilder M2 = e.a.a.a.a.M("Don't cancel account for ");
        M2.append(bm.a(arrayList.toString(), 3));
        M2.append(" is unseted");
        com.xiaomi.channel.commonutils.logger.c.m15a(M2.toString());
    }

    public static void setLocalNotificationType(Context context, int i) {
        u.a(context).b(i & (-1));
    }

    public static void setUserAccount(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        setCommand(context, fs.COMMAND_SET_ACCOUNT.f436a, str, str2);
    }

    private static boolean shouldPullNotification(Context context) {
        return Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong("last_pull_notification", -1L)) > 300000;
    }

    private static boolean shouldSendRegRequest(Context context) {
        return shouldSendRequest(context, "last_reg_request");
    }

    private static boolean shouldSendRequest(Context context, String str) {
        if (context == null) {
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            str = "UNKONW";
        }
        return Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong(str, -1L)) > com.heytap.mcssdk.constant.a.r;
    }

    public static boolean shouldUseMIUIPush(Context context) {
        return u.a(context).m86a();
    }

    public static void subscribe(Context context, String str, String str2) {
        if (TextUtils.isEmpty(b.m41a(context).m42a()) || TextUtils.isEmpty(str)) {
            return;
        }
        if (Math.abs(System.currentTimeMillis() - topicSubscribedTime(context, str)) <= com.heytap.mcssdk.constant.a.f6888f) {
            if (1 == PushMessageHelper.getPushMode(context)) {
                PushMessageHandler.a(context, str2, 0L, null, str);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            PushMessageHelper.sendCommandMessageBroadcast(context, PushMessageHelper.generateCommandMessage(fs.COMMAND_SUBSCRIBE_TOPIC.f436a, arrayList, 0L, null, null, null));
            return;
        }
        iy iyVar = new iy();
        String a = as.a();
        iyVar.a(a);
        iyVar.b(b.m41a(context).m42a());
        iyVar.c(str);
        iyVar.d(context.getPackageName());
        iyVar.e(str2);
        com.xiaomi.channel.commonutils.logger.c.e("cmd:" + fs.COMMAND_SUBSCRIBE_TOPIC + ", " + a);
        u.a(context).a((u) iyVar, hu.Subscription, (ih) null);
    }

    public static int subscribeLBSPush(Context context, String str, String str2) {
        try {
            if (context == null) {
                com.xiaomi.channel.commonutils.logger.c.m15a("context is null when subscribing LBS push");
                return -1;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                initContext(context);
                if (b.m41a(context).m50c() && !b.m41a(sContext).m53f()) {
                    if (!com.xiaomi.push.h.a(context, "com.xiaomi.xmsf", "lbs_push_support")) {
                        com.xiaomi.channel.commonutils.logger.c.m15a("Push client not support when subscribing LBS push.");
                        return -3;
                    }
                    if (!ax.c(context)) {
                        com.xiaomi.channel.commonutils.logger.c.m15a("Network is disconnected when subscribing LBS push.");
                        return -6;
                    }
                    if (!shouldSendRequest(context, "last_subscribe_lbs_push_request")) {
                        com.xiaomi.channel.commonutils.logger.c.m15a("Could not subscribe LBS push within 5s repeatedly.");
                        return -4;
                    }
                    addRequestTime(sContext, "last_subscribe_lbs_push_request");
                    String a = as.a();
                    String packageName = context.getPackageName();
                    String str3 = COMMAND_SUBSCRIBE_LBS;
                    io ioVar = new io(a, str, str3);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(str3);
                    ioVar.f711a = arrayList;
                    ioVar.d(packageName);
                    u.a(context).a(ioVar, hu.Command, false, false, null, true, packageName, str, true, false, "com.xiaomi.mipush.SEND_MESSAGE");
                    return 0;
                }
                com.xiaomi.channel.commonutils.logger.c.m15a("Invalid registration information when subscribing LBS push.");
                return -2;
            }
            com.xiaomi.channel.commonutils.logger.c.m15a("appID|appToken is empty when subscribing LBS push.");
            return -7;
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.c.m15a("error occurred when subscribing LBS push. e:" + th);
            return -5;
        }
    }

    @Deprecated
    public static void syncAssembleCOSPushToken(Context context) {
    }

    public static void syncAssembleFCMPushToken(Context context) {
        u.a(context).a((String) null, v.UPLOAD_FCM_TOKEN, d.ASSEMBLE_PUSH_FCM, "");
    }

    @Deprecated
    public static void syncAssembleFTOSPushToken(Context context) {
    }

    @Deprecated
    public static void syncAssemblePushToken(Context context) {
    }

    public static long topicSubscribedTime(Context context, String str) {
        return context.getSharedPreferences("mipush_extra", 0).getLong("topic_" + str, -1L);
    }

    public static void turnOffPush(Context context, UPSTurnCallBack uPSTurnCallBack) {
        disablePush(context);
        if (uPSTurnCallBack != null) {
            CodeResult codeResult = new CodeResult();
            codeResult.setResultCode(0L);
            codeResult.getResultCode();
            uPSTurnCallBack.onResult(codeResult);
        }
    }

    public static void turnOnPush(Context context, UPSTurnCallBack uPSTurnCallBack) {
        enablePush(context);
        if (uPSTurnCallBack != null) {
            CodeResult codeResult = new CodeResult();
            codeResult.setResultCode(0L);
            codeResult.getResultCode();
            uPSTurnCallBack.onResult(codeResult);
        }
    }

    public static void unRegisterToken(Context context, UPSUnRegisterCallBack uPSUnRegisterCallBack) {
        unregisterPush(context);
        if (uPSUnRegisterCallBack != null) {
            TokenResult tokenResult = new TokenResult();
            tokenResult.setToken(null);
            tokenResult.getToken();
            tokenResult.setResultCode(0L);
            tokenResult.getResultCode();
            uPSUnRegisterCallBack.onResult(tokenResult);
        }
    }

    public static void unregisterPush(Context context) {
        f.c(context);
        aq.a(context).m762a();
        if (b.m41a(context).m48b()) {
            ja jaVar = new ja();
            jaVar.a(as.a());
            jaVar.b(b.m41a(context).m42a());
            jaVar.c(b.m41a(context).m49c());
            jaVar.e(b.m41a(context).b());
            jaVar.d(context.getPackageName());
            u.a(context).a(jaVar);
            PushMessageHandler.a();
            PushMessageHandler.b();
            b.m41a(context).m47b();
            clearLocalNotificationType(context);
            clearNotification(context);
            clearExtras(context);
        }
    }

    public static void unsetAlias(Context context, String str, String str2) {
        setCommand(context, fs.COMMAND_UNSET_ALIAS.f436a, str, str2);
    }

    public static void unsetUserAccount(Context context, String str, String str2) {
        setCommand(context, fs.COMMAND_UNSET_ACCOUNT.f436a, str, str2);
    }

    public static void unsubscribe(Context context, String str, String str2) {
        if (b.m41a(context).m48b()) {
            if (topicSubscribedTime(context, str) < 0) {
                StringBuilder M = e.a.a.a.a.M("Don't cancel subscribe for ");
                M.append(bm.a(str, 3));
                M.append(" is unsubscribed");
                com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
                return;
            }
            jc jcVar = new jc();
            String a = as.a();
            jcVar.a(a);
            jcVar.b(b.m41a(context).m42a());
            jcVar.c(str);
            jcVar.d(context.getPackageName());
            jcVar.e(str2);
            com.xiaomi.channel.commonutils.logger.c.e("cmd:" + fs.COMMAND_UNSUBSCRIBE_TOPIC + ", " + a);
            u.a(context).a((u) jcVar, hu.UnSubscription, (ih) null);
        }
    }

    public static int unsubscribeLBSPush(Context context, String str, String str2) {
        try {
            if (context == null) {
                com.xiaomi.channel.commonutils.logger.c.m15a("context is null when unsubscribing LBS push");
                return -1;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                initContext(context);
                if (b.m41a(context).m50c() && !b.m41a(sContext).m53f()) {
                    if (!com.xiaomi.push.h.a(context, "com.xiaomi.xmsf", "lbs_push_support")) {
                        com.xiaomi.channel.commonutils.logger.c.m15a("Push client not support when unsubscribing LBS push.");
                        return -3;
                    }
                    if (!ax.b(context)) {
                        com.xiaomi.channel.commonutils.logger.c.m15a("Network is disconnected when unsubscribing LBS push.");
                        return -6;
                    }
                    if (!shouldSendRequest(context, "last_unsubscribe_lbs_push_request")) {
                        com.xiaomi.channel.commonutils.logger.c.m15a("Could not unsubscribe LBS push within 5s repeatedly.");
                        return -4;
                    }
                    addRequestTime(sContext, "last_unsubscribe_lbs_push_request");
                    String a = as.a();
                    String packageName = context.getPackageName();
                    String str3 = COMMAND_UNSUBSCRIBE_LBS;
                    io ioVar = new io(a, str, str3);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(str3);
                    ioVar.f711a = arrayList;
                    ioVar.d(packageName);
                    u.a(context).a(ioVar, hu.Command, false, false, null, true, packageName, str, true, false, "com.xiaomi.mipush.SEND_MESSAGE");
                    return 0;
                }
                com.xiaomi.channel.commonutils.logger.c.m15a("Invalid registration information when unsubscribing LBS push.");
                return -2;
            }
            com.xiaomi.channel.commonutils.logger.c.m15a("appID|appToken is empty when unsubscribing LBS push");
            return -7;
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.c.m15a("error occurred when unsubscribing LBS push. e:" + th);
            return -5;
        }
    }

    private static void updateImeiOrOaid() {
        new Thread(new Runnable() { // from class: com.xiaomi.mipush.sdk.MiPushClient.3
            @Override // java.lang.Runnable
            public void run() {
                if (com.xiaomi.push.k.m662e()) {
                    return;
                }
                if (com.xiaomi.push.j.b(MiPushClient.sContext) != null || com.xiaomi.push.aq.a(MiPushClient.sContext).mo102a()) {
                    it itVar = new it();
                    itVar.b(b.m41a(MiPushClient.sContext).m42a());
                    itVar.c(ie.ClientInfoUpdate.f611a);
                    itVar.a(as.a());
                    itVar.a(new HashMap());
                    String str = "";
                    String b = com.xiaomi.push.j.b(MiPushClient.sContext);
                    if (!TextUtils.isEmpty(b)) {
                        StringBuilder M = e.a.a.a.a.M("");
                        M.append(bm.a(b));
                        str = M.toString();
                    }
                    String d2 = com.xiaomi.push.j.d(MiPushClient.sContext);
                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(d2)) {
                        str = e.a.a.a.a.t(str, Constants.ACCEPT_TIME_SEPARATOR_SP, d2);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        itVar.m574a().put(Constants.EXTRA_KEY_IMEI_MD5, str);
                    }
                    com.xiaomi.push.aq.a(MiPushClient.sContext).a(itVar.m574a());
                    int a = com.xiaomi.push.j.a();
                    if (a >= 0) {
                        itVar.m574a().put("space_id", Integer.toString(a));
                    }
                    u.a(MiPushClient.sContext).a((u) itVar, hu.Notification, false, (ih) null);
                }
            }
        }).start();
    }

    public static void clearNotification(Context context, String str, String str2) {
        u.a(context).a(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void initialize(Context context, String str, String str2, MiPushClientCallback miPushClientCallback, String str3, ICallbackResult iCallbackResult) {
        try {
            com.xiaomi.channel.commonutils.logger.c.a(context.getApplicationContext());
            com.xiaomi.channel.commonutils.logger.c.e("sdk_version = 7_9_2-C");
            com.xiaomi.push.aq.a(context).a();
            dn.a(context);
            if (miPushClientCallback != null) {
                PushMessageHandler.a(miPushClientCallback);
            }
            if (iCallbackResult != null) {
                PushMessageHandler.a(iCallbackResult);
            }
            if (com.xiaomi.push.t.m845a(sContext)) {
                m.a(sContext);
            }
            boolean z = b.m41a(sContext).a() != Constants.a();
            if (!z && !shouldSendRegRequest(sContext)) {
                u.a(sContext).m83a();
                com.xiaomi.channel.commonutils.logger.c.m15a("Could not send  register message within 5s repeatly .");
                return;
            }
            if (z || !b.m41a(sContext).a(str, str2) || b.m41a(sContext).m53f()) {
                String a = bm.a(6);
                b.m41a(sContext).m43a();
                b.m41a(sContext).a(Constants.a());
                b.m41a(sContext).a(str, str2, a);
                MiTinyDataClient.a.a().b(MiTinyDataClient.PENDING_REASON_APPID);
                clearExtras(sContext);
                clearNotification(context);
                iu iuVar = new iu();
                iuVar.a(as.b());
                iuVar.b(str);
                iuVar.e(str2);
                iuVar.d(sContext.getPackageName());
                iuVar.f(a);
                Context context2 = sContext;
                iuVar.b(com.xiaomi.push.h.a(context2, context2.getPackageName()));
                iuVar.d(com.xiaomi.push.h.a(sContext));
                Context context3 = sContext;
                iuVar.c(com.xiaomi.push.h.m454a(context3, context3.getPackageName()));
                iuVar.h(BuildConfig.VERSION_NAME);
                iuVar.a(BuildConfig.VERSION_CODE);
                iuVar.a(ii.Init);
                if (!TextUtils.isEmpty(str3)) {
                    iuVar.g(str3);
                }
                if (!com.xiaomi.push.k.m662e()) {
                    String c2 = com.xiaomi.push.j.c(sContext);
                    if (!TextUtils.isEmpty(c2)) {
                        iuVar.i(bm.a(c2) + Constants.ACCEPT_TIME_SEPARATOR_SP + com.xiaomi.push.j.e(sContext));
                    }
                }
                int a2 = com.xiaomi.push.j.a();
                if (a2 >= 0) {
                    iuVar.c(a2);
                }
                u.a(sContext).a(iuVar, z);
                sContext.getSharedPreferences("mipush_extra", 4).getBoolean("mipush_registed", true);
            } else {
                if (1 == PushMessageHelper.getPushMode(sContext)) {
                    checkNotNull(miPushClientCallback, "callback");
                    miPushClientCallback.onInitializeResult(0L, null, b.m41a(sContext).m49c());
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(b.m41a(sContext).m49c());
                    PushMessageHelper.sendCommandMessageBroadcast(sContext, PushMessageHelper.generateCommandMessage(fs.COMMAND_REGISTER.f436a, arrayList, 0L, null, null, null));
                }
                u.a(sContext).m83a();
                if (b.m41a(sContext).m45a()) {
                    it itVar = new it();
                    itVar.b(b.m41a(sContext).m42a());
                    itVar.c(ie.ClientInfoUpdate.f611a);
                    itVar.a(as.a());
                    HashMap hashMap = new HashMap();
                    itVar.f750a = hashMap;
                    Context context4 = sContext;
                    hashMap.put("app_version", com.xiaomi.push.h.m454a(context4, context4.getPackageName()));
                    itVar.f750a.put("push_bundle_version", String.valueOf(com.xiaomi.push.h.a(sContext)));
                    Map<String, String> map = itVar.f750a;
                    Context context5 = sContext;
                    map.put(Constants.EXTRA_KEY_APP_VERSION_CODE, Integer.toString(com.xiaomi.push.h.a(context5, context5.getPackageName())));
                    itVar.f750a.put("push_sdk_vn", BuildConfig.VERSION_NAME);
                    itVar.f750a.put("push_sdk_vc", Integer.toString(BuildConfig.VERSION_CODE));
                    String e2 = b.m41a(sContext).e();
                    if (!TextUtils.isEmpty(e2)) {
                        itVar.f750a.put("deviceid", e2);
                    }
                    u.a(sContext).a((u) itVar, hu.Notification, false, (ih) null);
                    u.a(sContext).m84a(sContext);
                }
                if (!com.xiaomi.push.m.m665a(sContext, "update_devId", false)) {
                    updateImeiOrOaid();
                    com.xiaomi.push.m.a(sContext, "update_devId", true);
                }
                if (shouldUseMIUIPush(sContext) && shouldPullNotification(sContext)) {
                    it itVar2 = new it();
                    itVar2.b(b.m41a(sContext).m42a());
                    itVar2.c(ie.PullOfflineMessage.f611a);
                    itVar2.a(as.a());
                    itVar2.a(false);
                    u.a(sContext).a((u) itVar2, hu.Notification, false, (ih) null, false);
                    addPullNotificationTime(sContext);
                }
            }
            addRegRequestTime(sContext);
            scheduleOcVersionCheckJob();
            scheduleDataCollectionJobs(sContext);
            initEventPerfLogic(sContext);
            w.a(sContext);
            if (!sContext.getPackageName().equals("com.xiaomi.xmsf")) {
                if (Logger.getUserLogger() != null) {
                    Logger.setLogger(sContext, Logger.getUserLogger());
                }
                com.xiaomi.channel.commonutils.logger.c.a(2);
            }
            operateSyncAction(context);
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.c.m18a(th);
        }
    }

    public static void registerPush(Context context, String str, String str2, String str3) {
        registerPush(context, str, str2, new PushConfiguration(), str3, null);
    }

    public static void reportMessageClicked(Context context, MiPushMessage miPushMessage) {
        ih ihVar = new ih();
        ihVar.a(miPushMessage.getMessageId());
        ihVar.b(miPushMessage.getTopic());
        ihVar.d(miPushMessage.getDescription());
        ihVar.c(miPushMessage.getTitle());
        ihVar.c(miPushMessage.getNotifyId());
        ihVar.a(miPushMessage.getNotifyType());
        ihVar.b(miPushMessage.getPassThrough());
        ihVar.a(miPushMessage.getExtra());
        reportMessageClicked(context, miPushMessage.getMessageId(), ihVar, null);
    }

    public static void clearNotification(Context context) {
        u.a(context).a(-1);
    }

    public static void registerPush(Context context, String str, String str2, PushConfiguration pushConfiguration) {
        registerPush(context, str, str2, pushConfiguration, null, null);
    }

    private static void registerPush(Context context, final String str, final String str2, PushConfiguration pushConfiguration, final String str3, final ICallbackResult iCallbackResult) {
        checkNotNull(context, "context");
        checkNotNull(str, com.heytap.mcssdk.constant.b.u);
        checkNotNull(str2, "appToken");
        Context applicationContext = context.getApplicationContext();
        sContext = applicationContext;
        if (applicationContext == null) {
            sContext = context;
        }
        Context context2 = sContext;
        com.xiaomi.push.t.a(context2);
        if (!NetworkStatusReceiver.a()) {
            registerNetworkReceiver(sContext);
        }
        e.a(sContext).a(pushConfiguration);
        ah.a(context2).a(new Runnable() { // from class: com.xiaomi.mipush.sdk.MiPushClient.1
            @Override // java.lang.Runnable
            public void run() {
                MiPushClient.initialize(MiPushClient.sContext, str, str2, null, str3, iCallbackResult);
            }
        });
    }

    static void reportMessageClicked(Context context, String str, ih ihVar, String str2) {
        it itVar = new it();
        if (TextUtils.isEmpty(str2)) {
            if (b.m41a(context).m48b()) {
                itVar.b(b.m41a(context).m42a());
            } else {
                com.xiaomi.channel.commonutils.logger.c.d("do not report clicked message");
                return;
            }
        } else {
            itVar.b(str2);
        }
        itVar.c("bar:click");
        itVar.a(str);
        itVar.a(false);
        u.a(context).a((u) itVar, hu.Notification, false, ihVar);
    }

    protected static void setCommand(Context context, String str, ArrayList<String> arrayList, String str2) {
        if (TextUtils.isEmpty(b.m41a(context).m42a())) {
            return;
        }
        io ioVar = new io();
        String a = as.a();
        ioVar.a(a);
        ioVar.b(b.m41a(context).m42a());
        ioVar.c(str);
        Iterator<String> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ioVar.m549a(it2.next());
        }
        ioVar.e(str2);
        ioVar.d(context.getPackageName());
        com.xiaomi.channel.commonutils.logger.c.e("cmd:" + str + ", " + a);
        u.a(context).a((u) ioVar, hu.Command, (ih) null);
    }
}
