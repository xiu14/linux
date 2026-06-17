package com.heytap.mcssdk;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.heytap.mcssdk.constant.MessageConstant;
import com.heytap.mcssdk.d.e;
import com.heytap.mcssdk.liquid.DownloadRequest;
import com.heytap.mcssdk.liquid.OnLiquidSettingChangeListener;
import com.heytap.mcssdk.utils.StatUtil;
import com.heytap.mcssdk.utils.Utils;
import com.heytap.mcssdk.utils.d;
import com.heytap.mcssdk.utils.f;
import com.heytap.mcssdk.utils.g;
import com.heytap.mcssdk.utils.j;
import com.heytap.msp.push.callback.ICallBackResultService;
import com.heytap.msp.push.callback.IGetAppNotificationCallBackService;
import com.heytap.msp.push.callback.ILiquidTaskQueryCallback;
import com.heytap.msp.push.callback.INotificationPermissionCallback;
import com.heytap.msp.push.callback.IPackageAuthCallbackListener;
import com.heytap.msp.push.callback.ISetAppNotificationCallBackService;
import com.heytap.msp.push.mode.MessageStat;
import com.heytap.msp.push.statis.StatisticUtils;
import com.mcs.aidl.IMcsSdkService;
import com.mcs.aidl.INotifiPermissionCallback;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PushService implements b {
    private static final String ACTION_ACTIVE = "com.heytap.mcs.action.active";
    private static final String ACTION_NOTIFICATION_ADVANCE = "com.heytap.mcs.action.NOTIFICATION_ADVANCE";
    private static final int ANDROID_T_SDK_VERSION_CODE = 32;
    private static final String APP_PACKAGE = "appPackage";
    private static final String APP_VERSION_CODE = "versionCode";
    private static final String APP_VERSION_NAME = "versionName";
    private static final String COMMAND_TYPE_ACCELERATE_PING = "acceleratePing";
    private static final int DEFAULT_API_MAX_COUNT = 2;
    public static final int DEVICE_NOT_SUPPORT_LIQUID = -2;
    private static final String EVENT_ID = "eventID";
    private static final String EXTRA = "extra";
    private static final String GLOBAL_ID = "globalID";
    private static final String KEY_CALLBACK = "result_callback";
    private static final String KEY_COMMAND_TYPE = "commandType";
    private static final int MAX_HOUR_IN_DAY = 23;
    private static final int MAX_LIQUID_BATCH_LIMIT = 200;
    private static final int MAX_MIN_IN_HOUR = 59;
    private static final int MCS_SUPPORT_AUTH_DETAIL_QUERY_VERSION = 52808;
    private static final int MCS_SUPPORT_LIQUID_DOWNLOAD_VERSION = 52800;
    private static final int MCS_SUPPORT_VERSION = 1019;
    private static final String MESSAGE_ID = "messageID";
    private static final String MESSAGE_TYPE = "messageType";
    public static final String MINI_PROGRAM_PKG = "miniProgramPkg";
    private static final String NEW_MCS_RECEIVE_SDK_ACTION_Base64 = "Y29tLm1jcy5hY3Rpb24uUkVDRUlWRV9TREtfTUVTU0FHRQ==";
    private static final String PUSH_SDK_VERSION = "pushSdkVersion";
    private static final long REGISTER_TIMEOUT_MS = 10000;
    private static final int SDK_INT_24 = 24;
    private static final String SUPPORT_CALLKIT_DATA = "supportCallkitDataBind";
    private static final String SUPPORT_LIQUID_DOWNLOAD = "supportLiquidDownload";
    private static final String SUPPORT_LIQUID_DOWNLOAD_BATCH = "supportLiquidDownloadBatch";
    private static final String SUPPORT_OPEN_PUSH = "supportOpenPush";
    private static final int SYSTEM_UID = 1000;
    private static final String TAG = "PushService";
    private static final String TASK_ID = "taskID";
    private static final String TYPE = "type";
    private static boolean sIsNewMcsPkg;
    private static String sMcsPkgName;
    private final ConcurrentHashMap<Integer, com.heytap.mcssdk.b.a> mAppLimitMap;
    private String mAuthCode;
    private Context mContext;
    private Handler mHandler;
    private ICallBackResultService mICallBackResultService;
    private IGetAppNotificationCallBackService mIGetAppNotificationCallBackService;
    private ISetAppNotificationCallBackService mISetAppNotificationCallBackService;
    private final List<e> mParsers;
    private PermissionCallbackProxy mPermissionCallback;
    private final List<com.heytap.mcssdk.e.c> mProcessors;
    private String mRegisterID;
    private f mRegisterTimeoutTask;
    private String mVerifyCode;
    private boolean needStaticRegister;
    private static final int[] OLD_MCS_PACKAGE = {99, 111, 109, 46, 99, 111, 108, 111, 114, 111, 115, 46, 109, 99, 115};
    private static final int[] OLD_MCS_RECEIVE_SDK_ACTION = {99, 111, 109, 46, 99, 111, 108, 111, 114, 111, 115, 46, 109, 99, 115, 115, 100, 107, 46, 97, 99, 116, 105, 111, 110, 46, 82, 69, 67, 69, 73, 86, 69, 95, 83, 68, 75, 95, 77, 69, 83, 83, 65, 71, 69};
    private static final int[] NEW_MCS_PACKAGE = {99, 111, 109, 46, 104, 101, 121, 116, 97, 112, 46, 109, 99, 115};
    private static final int[] CALLKIT_PROVIDER_URI = {99, 111, 110, 116, 101, 110, 116, 58, 47, 47, 99, 111, 109, 46, 111, 115, 46, 99, 97, 108, 108, 115, 101, 114, 118, 105, 99, 101, 46, 99, 97, 108, 108, 107, 105, 116, 95, 112, 114, 111, 118, 105, 100, 101, 114};
    private static String NEW_MCS_RECEIVE_SDK_ACTION = "";
    private static int sCount = 0;
    private static volatile Boolean isSupportLiquid = null;
    private static volatile Boolean isSupportLiquidBatch = null;
    private static volatile Boolean isTabletDevice = null;

    public static final class PermissionCallbackProxy extends INotifiPermissionCallback.Stub {
        private static final long a = 2000;
        private INotificationPermissionCallback b;

        /* renamed from: c, reason: collision with root package name */
        private long f6868c = 0;

        private boolean b() {
            return SystemClock.elapsedRealtime() - this.f6868c <= a;
        }

        private void c() {
            this.f6868c = SystemClock.elapsedRealtime();
        }

        private void d() {
            this.f6868c = 0L;
        }

        public void a() {
            d();
            this.b = null;
        }

        public boolean a(INotificationPermissionCallback iNotificationPermissionCallback) {
            if (b()) {
                return false;
            }
            c();
            this.b = iNotificationPermissionCallback;
            return true;
        }

        @Override // com.mcs.aidl.INotifiPermissionCallback
        public void onFail(int i, String str) {
            d();
            INotificationPermissionCallback iNotificationPermissionCallback = this.b;
            if (iNotificationPermissionCallback != null) {
                iNotificationPermissionCallback.onFail(i, str);
            }
            this.b = null;
        }

        @Override // com.mcs.aidl.INotifiPermissionCallback
        public void onSuccess() {
            d();
            INotificationPermissionCallback iNotificationPermissionCallback = this.b;
            if (iNotificationPermissionCallback != null) {
                iNotificationPermissionCallback.onSuccess();
            }
            this.b = null;
        }
    }

    private static class a {
        private static final PushService a = new PushService();

        private a() {
        }
    }

    private PushService() {
        this.mProcessors = new ArrayList();
        this.mParsers = new ArrayList();
        this.mRegisterID = null;
        this.needStaticRegister = true;
        this.mPermissionCallback = new PermissionCallbackProxy();
        synchronized (PushService.class) {
            int i = sCount;
            if (i > 0) {
                throw new RuntimeException("PushService can't create again!");
            }
            sCount = i + 1;
        }
        addParser(new com.heytap.mcssdk.d.c());
        addParser(new com.heytap.mcssdk.d.a());
        addParser(new com.heytap.mcssdk.d.b());
        addProcessor(new com.heytap.mcssdk.e.b());
        addProcessor(new com.heytap.mcssdk.e.a());
        this.mAppLimitMap = new ConcurrentHashMap<>();
    }

    private com.heytap.mcssdk.b.a addCommandToMap(int i) {
        String str;
        if (!this.mAppLimitMap.containsKey(Integer.valueOf(i))) {
            com.heytap.mcssdk.b.a aVar = new com.heytap.mcssdk.b.a(System.currentTimeMillis(), 1);
            this.mAppLimitMap.put(Integer.valueOf(i), aVar);
            com.heytap.mcssdk.utils.e.b("addCommandToMap :appBean is null");
            return aVar;
        }
        com.heytap.mcssdk.b.a aVar2 = this.mAppLimitMap.get(Integer.valueOf(i));
        if (checkTimeNeedUpdate(aVar2)) {
            aVar2.a(1);
            aVar2.a(System.currentTimeMillis());
            str = "addCommandToMap : appLimitBean.setCount(1)";
        } else {
            aVar2.a(aVar2.b() + 1);
            str = "addCommandToMap :appLimitBean.getCount() + 1";
        }
        com.heytap.mcssdk.utils.e.b(str);
        return aVar2;
    }

    private synchronized void addParser(e eVar) {
        if (eVar != null) {
            this.mParsers.add(eVar);
        }
    }

    private synchronized void addProcessor(com.heytap.mcssdk.e.c cVar) {
        if (cVar != null) {
            this.mProcessors.add(cVar);
        }
    }

    private boolean checkAll() {
        return checkContext() && checkRegisterID();
    }

    private boolean checkContext() {
        return this.mContext != null;
    }

    private boolean checkIsTabletDevice() {
        if (isTabletDevice == null) {
            isTabletDevice = Boolean.valueOf(d.a());
        }
        return isTabletDevice.booleanValue();
    }

    private boolean checkRegisterID() {
        return this.mRegisterID != null;
    }

    private boolean checkTimeNeedUpdate(com.heytap.mcssdk.b.a aVar) {
        long a2 = aVar.a();
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder Q = e.a.a.a.a.Q("checkTimeNeedUpdate : lastedTime ", a2, " currentTime:");
        Q.append(currentTimeMillis);
        com.heytap.mcssdk.utils.e.b(Q.toString());
        return currentTimeMillis - a2 > getAppLimitCLickTime();
    }

    private boolean checkTop(Activity activity) {
        String name;
        ComponentName componentName;
        ActivityManager activityManager = (ActivityManager) activity.getSystemService("activity");
        List<ActivityManager.AppTask> appTasks = activityManager.getAppTasks();
        if (appTasks != null && appTasks.size() > 0) {
            ActivityManager.AppTask appTask = appTasks.get(0);
            if (appTask.getTaskInfo().topActivity != null) {
                name = activity.getClass().getName();
                componentName = appTask.getTaskInfo().topActivity;
                return name.equals(componentName.getClassName());
            }
        }
        List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
        if (runningTasks == null || runningTasks.size() <= 0) {
            return false;
        }
        ActivityManager.RunningTaskInfo runningTaskInfo = runningTasks.get(0);
        name = activity.getClass().getName();
        componentName = runningTaskInfo.topActivity;
        return name.equals(componentName.getClassName());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean checkVerifyRequest(com.heytap.mcssdk.liquid.DownloadRequest r5) {
        /*
            r4 = this;
            java.lang.String r0 = r5.getTraceId()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            r2 = 2
            r3 = 0
            if (r0 == 0) goto Lf
        Ld:
            r1 = r3
            goto L5d
        Lf:
            java.lang.String r0 = r5.getDesc()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
            r2 = 17
            goto Ld
        L1c:
            int r0 = r5.getLoadingType()
            if (r0 == r1) goto L2b
            int r0 = r5.getLoadingType()
            if (r0 == r2) goto L2b
            r2 = 8
            goto Ld
        L2b:
            com.heytap.mcs.liquid.model.ActionInfo r0 = r5.getAction()
            if (r0 != 0) goto L34
            r2 = 19
            goto Ld
        L34:
            com.heytap.mcs.liquid.model.ActionInfo r0 = r5.getManagerAction()
            if (r0 != 0) goto L3d
            r2 = 20
            goto Ld
        L3d:
            int r0 = r5.getPercent()
            if (r0 < 0) goto L5a
            int r0 = r5.getPercent()
            r2 = 100
            if (r0 <= r2) goto L4c
            goto L5a
        L4c:
            java.lang.String r0 = r5.getPkgName()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L58
            r2 = 7
            goto Ld
        L58:
            r2 = r3
            goto L5d
        L5a:
            r2 = 22
            goto Ld
        L5d:
            if (r1 != 0) goto L75
            com.heytap.msp.push.callback.ILiquidDownloadCallback r0 = r5.getCallback()
            if (r0 == 0) goto L74
            com.heytap.msp.push.callback.ILiquidDownloadCallback r0 = r5.getCallback()
            java.lang.String r1 = r5.getTraceId()
            int r5 = r5.getStatus()
            r0.onFailed(r1, r2, r5)
        L74:
            return r3
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.heytap.mcssdk.PushService.checkVerifyRequest(com.heytap.mcssdk.liquid.DownloadRequest):boolean");
    }

    public static PushService getInstance() {
        return a.a;
    }

    private Intent getIntent(int i, String str, JSONObject jSONObject) {
        Intent intent = new Intent();
        intent.setAction(getReceiveSdkAction(this.mContext));
        intent.setPackage(getMcsPackageName(this.mContext));
        intent.putExtra("type", i);
        JSONObject jSONObject2 = new JSONObject();
        try {
            Context context = this.mContext;
            jSONObject2.putOpt(APP_VERSION_NAME, Utils.getVersionName(context, context.getPackageName()));
            Context context2 = this.mContext;
            jSONObject2.putOpt(APP_VERSION_CODE, Integer.valueOf(Utils.getVersionCode(context2, context2.getPackageName())));
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.putOpt(next, jSONObject.get(next));
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            intent.putExtra("extra", jSONObject2.toString());
            throw th;
        }
        intent.putExtra("extra", jSONObject2.toString());
        intent.putExtra(com.heytap.mcssdk.constant.b.D, str);
        intent.putExtra("appPackage", this.mContext.getPackageName());
        intent.putExtra(com.heytap.mcssdk.constant.b.z, this.mAuthCode);
        intent.putExtra(com.heytap.mcssdk.constant.b.A, this.mVerifyCode);
        intent.putExtra(com.heytap.mcssdk.constant.b.B, this.mRegisterID);
        intent.putExtra(com.heytap.mcssdk.constant.b.C, getSDKVersionName());
        intent.putExtra(com.heytap.mcssdk.constant.b.E, getUserId(this.mContext));
        return intent;
    }

    private String getMcsPackageNameInner(Context context) {
        String str = TAG;
        com.heytap.mcssdk.utils.e.b(str, "getMcsPackageNameInner -- ");
        try {
            try {
                PackageManager packageManager = context.getPackageManager();
                String string = Utils.getString(NEW_MCS_PACKAGE);
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(string, 0);
                if (applicationInfo != null) {
                    boolean z = (applicationInfo.flags & 1) == 1;
                    int packageUid = packageManager.getPackageUid("android", 0);
                    int i = applicationInfo.uid;
                    int a2 = j.a();
                    r1 = (z || (j.a(i, a2) == packageUid)) ? string : null;
                    com.heytap.mcssdk.utils.e.b(str, "getMcsPackageNameInner packageUid = " + i + ", systemUid = " + packageUid + ", userId = " + a2);
                }
                return r1;
            } catch (PackageManager.NameNotFoundException e2) {
                com.heytap.mcssdk.utils.e.e(TAG, "NameNotFoundException in get mcs package name:" + e2.getMessage());
                return r1;
            } catch (Exception e3) {
                com.heytap.mcssdk.utils.e.e(TAG, "Error in get mcs package name:" + e3.getMessage());
                return r1;
            }
        } catch (Throwable unused) {
            return r1;
        }
    }

    public static int getSDKVersionCode() {
        return com.heytap.mcssdk.a.f6872f;
    }

    public static String getSDKVersionName() {
        return com.heytap.mcssdk.a.f6873g;
    }

    private int getUserId(Context context) {
        try {
            return ((Integer) Context.class.getMethod("getUserId", new Class[0]).invoke(context, new Object[0])).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    private boolean isMcsSupportCallkit() {
        String mcsPackageName = getMcsPackageName(this.mContext);
        boolean isSupportPush = Utils.isSupportPush(this.mContext, mcsPackageName, SUPPORT_CALLKIT_DATA);
        com.heytap.mcssdk.utils.e.b(TAG, "isSupportCallkit -- " + isSupportPush);
        return Utils.isExistPackage(this.mContext, mcsPackageName) && isSupportPush;
    }

    private boolean isSupportPushInner(Context context) {
        if (this.mContext == null) {
            this.mContext = context.getApplicationContext();
        }
        String mcsPackageName = getMcsPackageName(this.mContext);
        boolean z = Utils.isExistPackage(this.mContext, mcsPackageName) && Utils.getVersionCode(this.mContext, mcsPackageName) >= 1019 && Utils.isSupportPush(this.mContext, mcsPackageName, SUPPORT_OPEN_PUSH);
        com.heytap.mcssdk.utils.e.b(TAG, "isSupportPushInner -- " + z);
        return z;
    }

    private static boolean isSystemApp(Context context, String str) {
        return (TextUtils.isEmpty(str) || (context.getPackageManager().getPackageInfo(str, 0).applicationInfo.flags & 129) == 0) ? false : true;
    }

    private static boolean isSystemProviderRegistered(Context context, String str) {
        try {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 0);
            if (resolveContentProvider != null) {
                return isSystemApp(context, resolveContentProvider.packageName);
            }
            return false;
        } catch (Exception e2) {
            com.heytap.mcssdk.utils.e.e("isSystemProviderRegistered ex: " + e2);
            return false;
        }
    }

    @Deprecated
    private static void onAppStart(Context context) {
        StatUtil.statisticMessage(context, new MessageStat(context.getPackageName(), "app_start", null));
    }

    private void startMcsService(int i, String str, JSONObject jSONObject) {
        if (checkCommandLimit(i)) {
            if (this.mICallBackResultService != null) {
                this.mICallBackResultService.onError(getErrorCode(i), "api_call_too_frequently", this.mContext.getPackageName(), getMiniProgramPkgFromJSON(jSONObject));
                return;
            }
            return;
        }
        try {
            this.mContext.startService(getIntent(i, str, jSONObject));
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("startMcsService--Exception");
            M.append(e2.getMessage());
            com.heytap.mcssdk.utils.e.e(M.toString());
        }
    }

    private void startMcsService(int i, JSONObject jSONObject) {
        startMcsService(i, "", jSONObject);
    }

    private void startRegisterTimeoutTask() {
        synchronized (this) {
            if (this.mHandler == null) {
                this.mHandler = new Handler(Looper.getMainLooper());
            }
            if (this.mRegisterTimeoutTask == null) {
                this.mRegisterTimeoutTask = new f(this.mHandler, 10000L);
            }
            this.mRegisterTimeoutTask.a();
        }
    }

    public void active(Context context) {
        String str;
        if (context == null) {
            str = "active context null";
        } else {
            if (!checkCommandLimit(MessageConstant.CommandId.COMMAND_NOTIFICATION_ACTIVE)) {
                try {
                    Intent intent = new Intent();
                    intent.setAction(ACTION_ACTIVE);
                    intent.setPackage(getMcsPackageName(context));
                    intent.putExtra(KEY_COMMAND_TYPE, COMMAND_TYPE_ACCELERATE_PING);
                    if (context.getPackageManager().resolveService(intent, 128) == null) {
                        com.heytap.mcssdk.utils.e.b(com.heytap.mcssdk.utils.e.a, "active unsupported");
                    } else {
                        context.startService(intent);
                    }
                    return;
                } catch (Throwable th) {
                    com.heytap.mcssdk.utils.e.a(com.heytap.mcssdk.utils.e.a, th);
                    return;
                }
            }
            str = "active internal limit!";
        }
        com.heytap.mcssdk.utils.e.e(com.heytap.mcssdk.utils.e.a, str);
    }

    public void bindMcsService(int i) {
        if (!checkCommandLimit(i)) {
            final Intent intent = getIntent(i, "", null);
            this.mContext.bindService(intent, new ServiceConnection() { // from class: com.heytap.mcssdk.PushService.1
                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    Bundle bundle = new Bundle();
                    bundle.putAll(intent.getExtras());
                    try {
                        IMcsSdkService.Stub.asInterface(iBinder).process(bundle);
                    } catch (Exception e2) {
                        com.heytap.mcssdk.utils.e.b("bindMcsService exception:" + e2);
                    }
                    PushService.this.mContext.unbindService(this);
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName componentName) {
                }
            }, 1);
        } else {
            ICallBackResultService iCallBackResultService = this.mICallBackResultService;
            if (iCallBackResultService != null) {
                iCallBackResultService.onError(getErrorCode(i), "api_call_too_frequently", this.mContext.getPackageName(), "");
            }
        }
    }

    @Override // com.heytap.mcssdk.b
    public void cancelNotification(JSONObject jSONObject) {
        if (checkAll()) {
            startMcsService(MessageConstant.CommandId.COMMAND_CANCEL_NOTIFICATION, jSONObject);
        } else {
            com.heytap.mcssdk.utils.e.e(com.heytap.mcssdk.utils.e.a, "please call the register first!");
        }
    }

    public void cancelRegisterTimeoutTask() {
        synchronized (this) {
            f fVar = this.mRegisterTimeoutTask;
            if (fVar != null) {
                fVar.b();
            }
        }
    }

    public boolean checkCommandLimit(int i) {
        return (i == 12291 || i == 12312 || addCommandToMap(i).b() <= 2) ? false : true;
    }

    @Override // com.heytap.mcssdk.b
    public void clearNotificationAdvanceCallback() {
        this.mPermissionCallback.a();
    }

    @Override // com.heytap.mcssdk.b
    public void clearNotificationType() {
        clearNotificationType(null);
    }

    @Override // com.heytap.mcssdk.b
    public void clearNotificationType(JSONObject jSONObject) {
        if (checkAll()) {
            startMcsService(MessageConstant.CommandId.COMMAND_CLEAR_NOTIFICATION_TYPE, jSONObject);
        } else {
            com.heytap.mcssdk.utils.e.e(com.heytap.mcssdk.utils.e.a, "please call the register first!");
        }
    }

    @Override // com.heytap.mcssdk.b
    public void clearNotifications() {
        clearNotifications(null);
    }

    @Override // com.heytap.mcssdk.b
    public void clearNotifications(JSONObject jSONObject) {
        if (checkContext()) {
            startMcsService(MessageConstant.CommandId.COMMAND_CLEAR_PKG_NOTIFICATION, jSONObject);
        } else {
            com.heytap.mcssdk.utils.e.e(com.heytap.mcssdk.utils.e.a, "please call the register first!");
        }
    }

    @Override // com.heytap.mcssdk.b
    public void disableAppNotificationSwitch(ISetAppNotificationCallBackService iSetAppNotificationCallBackService) {
        if (checkContext()) {
            this.mISetAppNotificationCallBackService = iSetAppNotificationCallBackService;
            startMcsService(MessageConstant.CommandId.COMMAND_APP_NOTIFICATION_CLOSE, null);
        } else if (getPushCallback() != null) {
            this.mISetAppNotificationCallBackService.onSetAppNotificationSwitch(-2);
        }
    }

    @Override // com.heytap.mcssdk.b
    public void enableAppNotificationSwitch(ISetAppNotificationCallBackService iSetAppNotificationCallBackService) {
        if (checkContext()) {
            this.mISetAppNotificationCallBackService = iSetAppNotificationCallBackService;
            startMcsService(MessageConstant.CommandId.COMMAND_APP_NOTIFICATION_OPEN, null);
        } else {
            ISetAppNotificationCallBackService iSetAppNotificationCallBackService2 = this.mISetAppNotificationCallBackService;
            if (iSetAppNotificationCallBackService2 != null) {
                iSetAppNotificationCallBackService2.onSetAppNotificationSwitch(-2);
            }
        }
    }

    @Override // com.heytap.mcssdk.b
    public long getAppLimitCLickTime() {
        return 1000L;
    }

    public Map<Integer, com.heytap.mcssdk.b.a> getAppLimitMap() {
        return this.mAppLimitMap;
    }

    @Override // com.heytap.mcssdk.b
    public void getAppNotificationSwitch(IGetAppNotificationCallBackService iGetAppNotificationCallBackService) {
        if (checkContext()) {
            this.mIGetAppNotificationCallBackService = iGetAppNotificationCallBackService;
            startMcsService(MessageConstant.CommandId.COMMAND_APP_NOTIFICATION_GET, null);
        } else {
            IGetAppNotificationCallBackService iGetAppNotificationCallBackService2 = this.mIGetAppNotificationCallBackService;
            if (iGetAppNotificationCallBackService2 != null) {
                iGetAppNotificationCallBackService2.onGetAppNotificationSwitch(-2, 0);
            }
        }
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getErrorCode(int i) {
        switch (i) {
            case MessageConstant.CommandId.COMMAND_REGISTER /* 12289 */:
                return -1;
            case MessageConstant.CommandId.COMMAND_UNREGISTER /* 12290 */:
                return -2;
            case MessageConstant.CommandId.COMMAND_STATISTIC /* 12291 */:
                return -14;
            default:
                switch (i) {
                    case MessageConstant.CommandId.COMMAND_SET_PUSH_TIME /* 12298 */:
                        return -11;
                    case MessageConstant.CommandId.COMMAND_PAUSE_PUSH /* 12299 */:
                        return -3;
                    case MessageConstant.CommandId.COMMAND_RESUME_PUSH /* 12300 */:
                        return -4;
                    default:
                        switch (i) {
                            case MessageConstant.CommandId.COMMAND_GET_PUSH_STATUS /* 12306 */:
                                return -10;
                            case MessageConstant.CommandId.COMMAND_SET_NOTIFICATION_TYPE /* 12307 */:
                                return -6;
                            case MessageConstant.CommandId.COMMAND_CLEAR_NOTIFICATION_TYPE /* 12308 */:
                                return -7;
                            case MessageConstant.CommandId.COMMAND_GET_NOTIFICATION_STATUS /* 12309 */:
                                return -5;
                            case MessageConstant.CommandId.COMMAND_SET_NOTIFICATION_SETTINGS /* 12310 */:
                                return -8;
                            case MessageConstant.CommandId.COMMAND_CLEAR_PKG_NOTIFICATION /* 12311 */:
                                return -9;
                            case MessageConstant.CommandId.COMMAND_SEND_INSTANT_ACK /* 12312 */:
                                return -13;
                            case MessageConstant.CommandId.COMMAND_NOTIFICATION_ALLOWANCE /* 12313 */:
                                return -12;
                            default:
                                switch (i) {
                                    case MessageConstant.CommandId.COMMAND_APP_NOTIFICATION_OPEN /* 12316 */:
                                        return -15;
                                    case MessageConstant.CommandId.COMMAND_APP_NOTIFICATION_CLOSE /* 12317 */:
                                        return -16;
                                    case MessageConstant.CommandId.COMMAND_APP_NOTIFICATION_GET /* 12318 */:
                                        return -17;
                                    default:
                                        return 0;
                                }
                        }
                }
        }
    }

    public String getMcsPackageName(Context context) {
        boolean z;
        if (sMcsPkgName == null) {
            String mcsPackageNameInner = getMcsPackageNameInner(context);
            if (mcsPackageNameInner == null) {
                sMcsPkgName = Utils.getString(OLD_MCS_PACKAGE);
                z = false;
            } else {
                sMcsPkgName = mcsPackageNameInner;
                z = true;
            }
            sIsNewMcsPkg = z;
        }
        return sMcsPkgName;
    }

    public String getMiniProgramPkgFromJSON(JSONObject jSONObject) {
        if (jSONObject == null) {
            return "";
        }
        try {
            try {
                return jSONObject.optString("miniProgramPkg");
            } catch (Exception e2) {
                com.heytap.mcssdk.utils.e.b("Error happened in getMiniProgramPkgFromJSON() :" + e2.getMessage());
                return "";
            }
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // com.heytap.mcssdk.b
    public void getNotificationStatus() {
        getNotificationStatus(null);
    }

    @Override // com.heytap.mcssdk.b
    public void getNotificationStatus(JSONObject jSONObject) {
        if (checkAll()) {
            startMcsService(MessageConstant.CommandId.COMMAND_GET_NOTIFICATION_STATUS, jSONObject);
        } else if (getPushCallback() != null) {
            getPushCallback().onGetNotificationStatus(-2, 0);
        }
    }

    public List<e> getParsers() {
        return this.mParsers;
    }

    public List<com.heytap.mcssdk.e.c> getProcessors() {
        return this.mProcessors;
    }

    public ICallBackResultService getPushCallback() {
        return this.mICallBackResultService;
    }

    public IGetAppNotificationCallBackService getPushGetAppNotificationCallBack() {
        return this.mIGetAppNotificationCallBackService;
    }

    public ISetAppNotificationCallBackService getPushSetAppNotificationCallBack() {
        return this.mISetAppNotificationCallBackService;
    }

    public void getPushStatus() {
        if (checkAll()) {
            startMcsService(MessageConstant.CommandId.COMMAND_GET_PUSH_STATUS, null);
        } else if (getPushCallback() != null) {
            getPushCallback().onGetPushStatus(-2, 0);
        }
    }

    public int getPushVersionCode() {
        if (!checkContext()) {
            return 0;
        }
        Context context = this.mContext;
        return Utils.getVersionCode(context, getMcsPackageName(context));
    }

    public String getPushVersionName() {
        if (!checkContext()) {
            return "";
        }
        Context context = this.mContext;
        return Utils.getVersionName(context, getMcsPackageName(context));
    }

    public String getReceiveSdkAction(Context context) {
        if (sMcsPkgName == null) {
            getMcsPackageNameInner(context);
        }
        if (!sIsNewMcsPkg) {
            return Utils.getString(OLD_MCS_RECEIVE_SDK_ACTION);
        }
        if (TextUtils.isEmpty(NEW_MCS_RECEIVE_SDK_ACTION)) {
            NEW_MCS_RECEIVE_SDK_ACTION = new String(Base64.decode(NEW_MCS_RECEIVE_SDK_ACTION_Base64, 0));
        }
        return NEW_MCS_RECEIVE_SDK_ACTION;
    }

    @Override // com.heytap.mcssdk.b
    public void getRegister() {
        getRegister(null);
    }

    @Override // com.heytap.mcssdk.b
    public void getRegister(JSONObject jSONObject) {
        if (checkContext()) {
            startMcsService(MessageConstant.CommandId.COMMAND_REGISTER, jSONObject);
        } else if (getPushCallback() != null) {
            getPushCallback().onRegister(-2, null, null, null);
        }
    }

    @Override // com.heytap.mcssdk.b
    public String getRegisterID() {
        return this.mRegisterID;
    }

    public PushService init(Context context, boolean z) {
        if (context == null) {
            throw new IllegalArgumentException("context can't be null");
        }
        innerInit(context);
        com.heytap.mcssdk.utils.e.f(z);
        return this;
    }

    public void innerInit(Context context) {
        boolean z;
        this.mContext = context.getApplicationContext();
        if (this.mHandler == null) {
            this.mHandler = new Handler(Looper.getMainLooper());
        }
        if (sMcsPkgName == null) {
            String mcsPackageNameInner = getMcsPackageNameInner(context);
            if (mcsPackageNameInner == null) {
                sMcsPkgName = Utils.getString(OLD_MCS_PACKAGE);
                z = false;
            } else {
                sMcsPkgName = mcsPackageNameInner;
                z = true;
            }
            sIsNewMcsPkg = z;
        }
    }

    public boolean isCallKitProviderAvailable() {
        return isSystemProviderRegistered(this.mContext, Uri.parse(Utils.getString(CALLKIT_PROVIDER_URI)).getAuthority());
    }

    public boolean isMCSSupportLiquidAuthDetailQuery() {
        if (isOsVersion15()) {
            String mcsPackageName = getMcsPackageName(this.mContext);
            return Utils.isExistPackage(this.mContext, mcsPackageName) && Utils.getVersionCode(this.mContext, mcsPackageName) >= MCS_SUPPORT_AUTH_DETAIL_QUERY_VERSION;
        }
        String str = TAG;
        StringBuilder M = e.a.a.a.a.M("Device not supported LiquidBatch: SDK version ");
        M.append(Build.VERSION.SDK_INT);
        M.append(" < 35");
        com.heytap.mcssdk.utils.e.b(str, M.toString());
        return false;
    }

    public boolean isMcsSupportLiquid() {
        if (isOsVersion15()) {
            String mcsPackageName = getMcsPackageName(this.mContext);
            return Utils.isExistPackage(this.mContext, mcsPackageName) && Utils.isSupportPush(this.mContext, mcsPackageName, SUPPORT_LIQUID_DOWNLOAD);
        }
        String str = TAG;
        StringBuilder M = e.a.a.a.a.M("Device not supported Liquid: SDK version ");
        M.append(Build.VERSION.SDK_INT);
        M.append(" < 35");
        com.heytap.mcssdk.utils.e.b(str, M.toString());
        return false;
    }

    public boolean isMcsSupportLiquidBatch() {
        if (isOsVersion15()) {
            String mcsPackageName = getMcsPackageName(this.mContext);
            return Utils.isExistPackage(this.mContext, mcsPackageName) && Utils.getVersionCode(this.mContext, mcsPackageName) >= MCS_SUPPORT_LIQUID_DOWNLOAD_VERSION;
        }
        String str = TAG;
        StringBuilder M = e.a.a.a.a.M("Device not supported LiquidBatch: SDK version ");
        M.append(Build.VERSION.SDK_INT);
        M.append(" < 35");
        com.heytap.mcssdk.utils.e.b(str, M.toString());
        return false;
    }

    public boolean isOsVersion15() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            return true;
        }
        com.heytap.mcssdk.utils.e.b(TAG, "Device not supported Liquid: SDK version " + i + " < 35");
        return false;
    }

    public boolean isSupportCallkit(Context context) {
        if (this.mContext == null) {
            this.mContext = context.getApplicationContext();
        }
        boolean z = isMcsSupportCallkit() && isCallKitProviderAvailable();
        com.heytap.mcssdk.utils.e.b(TAG, "isSupportCallkit -- " + z);
        return z;
    }

    @Override // com.heytap.mcssdk.b
    public boolean isSupportLiquid(Context context) {
        if (this.mContext == null) {
            this.mContext = context.getApplicationContext();
        }
        boolean z = false;
        if (checkCommandLimit(MessageConstant.CommandId.COMMAND_IS_SUPPORT_LIQUID)) {
            com.heytap.mcssdk.utils.e.e(com.heytap.mcssdk.utils.e.a, "Avoid frequently calling isSupportLiquid.");
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 35) {
            com.heytap.mcssdk.utils.e.b(TAG, "Device not supported: SDK version " + i + " < 35");
            return false;
        }
        if (isMcsSupportLiquid() && com.heytap.mcssdk.liquid.b.a().b() && !checkIsTabletDevice()) {
            z = true;
        }
        com.heytap.mcssdk.utils.e.b(TAG, "isSupportPushInner -- " + z);
        return z;
    }

    @Override // com.heytap.mcssdk.b
    public boolean isSupportLiquidBatch(Context context) {
        if (this.mContext == null) {
            this.mContext = context.getApplicationContext();
        }
        if (this.mContext == null) {
            String str = TAG;
            StringBuilder M = e.a.a.a.a.M("isSupportLiquidBatch --  mContext is null after assign :");
            M.append(this.mContext == null);
            com.heytap.mcssdk.utils.e.e(str, M.toString());
            return false;
        }
        if (checkCommandLimit(MessageConstant.CommandId.COMMAND_IS_SUPPORT_LIQUID_BATCH)) {
            com.heytap.mcssdk.utils.e.e(com.heytap.mcssdk.utils.e.a, "Avoid frequently calling isSupportLiquidBatch.");
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 35) {
            com.heytap.mcssdk.utils.e.b(TAG, "Device not supported: SDK version " + i + " < 35");
            return false;
        }
        boolean z = isMcsSupportLiquidBatch() && com.heytap.mcssdk.liquid.b.a().b() && !checkIsTabletDevice();
        com.heytap.mcssdk.utils.e.b(TAG, "isSupportLiquidBatch -- " + z);
        return z;
    }

    public boolean isSupportPushByClient(Context context) {
        return isSupportPushInner(context);
    }

    @Override // com.heytap.mcssdk.b
    public void openNotificationSettings() {
        openNotificationSettings(null);
    }

    @Override // com.heytap.mcssdk.b
    public void openNotificationSettings(JSONObject jSONObject) {
        if (checkAll()) {
            startMcsService(MessageConstant.CommandId.COMMAND_SET_NOTIFICATION_SETTINGS, jSONObject);
        } else {
            com.heytap.mcssdk.utils.e.e(com.heytap.mcssdk.utils.e.a, "please call the register first!");
        }
    }

    @Override // com.heytap.mcssdk.b
    public void pausePush() {
        pausePush(null);
    }

    @Override // com.heytap.mcssdk.b
    public void pausePush(JSONObject jSONObject) {
        if (checkAll()) {
            startMcsService(MessageConstant.CommandId.COMMAND_PAUSE_PUSH, jSONObject);
        } else {
            com.heytap.mcssdk.utils.e.e(com.heytap.mcssdk.utils.e.a, "please call the register first!");
        }
    }

    @Override // com.heytap.mcssdk.b
    public void queryLiquidTask(Context context, ILiquidTaskQueryCallback iLiquidTaskQueryCallback) {
        if (context == null) {
            if (iLiquidTaskQueryCallback != null) {
                iLiquidTaskQueryCallback.onFailure(DownloadRequest.ErrorCode.ERROR_CONTEXT);
            }
        } else if (checkCommandLimit(MessageConstant.CommandId.COMMAND_LIQUID_QUERY_TASK)) {
            if (iLiquidTaskQueryCallback != null) {
                iLiquidTaskQueryCallback.onFailure(DownloadRequest.ErrorCode.ERROR_CODE_FREQUENT);
            }
        } else {
            if (this.mContext == null) {
                this.mContext = context.getApplicationContext();
            }
            com.heytap.mcssdk.liquid.b.a().a(context, iLiquidTaskQueryCallback);
        }
    }

    @Override // com.heytap.mcssdk.b
    public void queryPackageAuthDetail(Context context, String str, IPackageAuthCallbackListener iPackageAuthCallbackListener) {
        if (context == null) {
            return;
        }
        if (this.mContext == null) {
            this.mContext = context.getApplicationContext();
        }
        if (!isSupportLiquid(context)) {
            if (iPackageAuthCallbackListener != null) {
                iPackageAuthCallbackListener.onAuthResult(-2);
            }
        } else if (isMCSSupportLiquidAuthDetailQuery()) {
            com.heytap.mcssdk.liquid.b.a().a(context, str, iPackageAuthCallbackListener);
        } else {
            iPackageAuthCallbackListener.onAuthResult(4);
        }
    }

    @Override // com.heytap.mcssdk.b
    public void register(Context context, String str, String str2, ICallBackResultService iCallBackResultService) {
        register(context, str, str2, null, iCallBackResultService);
    }

    @Override // com.heytap.mcssdk.b
    public void register(Context context, String str, String str2, JSONObject jSONObject, ICallBackResultService iCallBackResultService) {
        if (context == null) {
            if (iCallBackResultService != null) {
                iCallBackResultService.onRegister(-2, null, null, null);
                return;
            }
            return;
        }
        if (this.mContext == null) {
            this.mContext = context.getApplicationContext();
        }
        if (!Utils.isSupportPushByClient(this.mContext)) {
            if (iCallBackResultService != null) {
                iCallBackResultService.onRegister(-2, null, null, null);
                return;
            }
            return;
        }
        if (this.needStaticRegister) {
            com.heytap.mcssdk.utils.e.b("registerAction:", "Will static push_register event :");
            StatisticUtils.statisticEvent(this.mContext, "push_register");
            this.needStaticRegister = false;
        }
        this.mAuthCode = str;
        this.mVerifyCode = str2;
        this.mICallBackResultService = iCallBackResultService;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.putOpt(DBDefinition.APP_VERSION_CODE, Integer.valueOf(Utils.getVersionCode(context)));
            jSONObject.putOpt("appVersionName", Utils.getVersionName(context));
            int c2 = g.f().c();
            jSONObject.putOpt(com.heytap.mcssdk.constant.b.H, com.heytap.mcssdk.constant.b.I);
            jSONObject.putOpt(com.heytap.mcssdk.constant.b.G, Integer.valueOf(c2));
            if (com.heytap.mcssdk.utils.e.g()) {
                com.heytap.mcssdk.utils.e.b(TAG, "register() timeoutCount: " + c2);
            }
        } catch (JSONException e2) {
            StringBuilder M = e.a.a.a.a.M("register-Exception:");
            M.append(e2.getMessage());
            com.heytap.mcssdk.utils.e.e(M.toString());
        }
        cancelRegisterTimeoutTask();
        startRegisterTimeoutTask();
        startMcsService(MessageConstant.CommandId.COMMAND_REGISTER, jSONObject);
    }

    public void registerLiquidSettingChangeListener(Context context, OnLiquidSettingChangeListener onLiquidSettingChangeListener) {
        com.heytap.mcssdk.liquid.b.a().a(context, onLiquidSettingChangeListener);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012b  */
    @Override // com.heytap.mcssdk.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void requestDownloadSeeding(com.heytap.mcssdk.liquid.DownloadRequest r5) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.heytap.mcssdk.PushService.requestDownloadSeeding(com.heytap.mcssdk.liquid.DownloadRequest):void");
    }

    @Override // com.heytap.mcssdk.b
    public void requestDownloadSeedingList(List<DownloadRequest> list) {
        if (!checkContext()) {
            com.heytap.mcssdk.utils.e.e(com.heytap.mcssdk.utils.e.a, "please initialize first!");
            com.heytap.mcssdk.liquid.b.a().a(DownloadRequest.ErrorCode.ERROR_CONTEXT, list);
            return;
        }
        Objects.requireNonNull(list, "requestList is null");
        if (com.heytap.mcssdk.utils.e.g()) {
            com.heytap.mcssdk.utils.e.b(TAG, "requestDownloadSeedingList --original:" + list);
        }
        if (checkCommandLimit(MessageConstant.CommandId.COMMAND_LIQUID_REQUEST_BATCH)) {
            com.heytap.mcssdk.liquid.b.a().a(DownloadRequest.ErrorCode.ERROR_CODE_FREQUENT, list);
            return;
        }
        if (checkIsTabletDevice()) {
            com.heytap.mcssdk.liquid.b.a().a(36, list);
            return;
        }
        if (!isOsVersion15()) {
            com.heytap.mcssdk.liquid.b.a().a(DownloadRequest.ErrorCode.ERROR_OS_VERSION_BELOW_15, list);
            return;
        }
        if (!com.heytap.mcssdk.liquid.b.a().b()) {
            com.heytap.mcssdk.liquid.b.a().a(30, list);
            return;
        }
        if (isSupportLiquidBatch == null) {
            isSupportLiquidBatch = Boolean.valueOf(isMcsSupportLiquidBatch());
        }
        if (!isSupportLiquidBatch.booleanValue()) {
            com.heytap.mcssdk.liquid.b.a().a(DownloadRequest.ErrorCode.ERROR_MCS_NOT_SUPPORT_LIQUID_BATCH, list);
            return;
        }
        if (list.size() >= 200) {
            com.heytap.mcssdk.liquid.b.a().a(DownloadRequest.ErrorCode.ERROR_MAX_LIMIT, list.subList(200, list.size()));
            list = list.subList(0, 200);
        }
        if (!list.isEmpty()) {
            Iterator<DownloadRequest> it2 = list.iterator();
            while (it2.hasNext()) {
                if (!checkVerifyRequest(it2.next())) {
                    it2.remove();
                }
            }
        }
        if (com.heytap.mcssdk.utils.e.g()) {
            com.heytap.mcssdk.utils.e.b(TAG, "requestDownloadSeedingList -- requestList:" + list);
        }
        if (list.isEmpty()) {
            return;
        }
        com.heytap.mcssdk.liquid.b.a().a(getContext(), list);
    }

    @Override // com.heytap.mcssdk.b
    public void requestNotificationAdvance(Activity activity, INotificationPermissionCallback iNotificationPermissionCallback, int i) {
        if (activity == null) {
            if (iNotificationPermissionCallback != null) {
                iNotificationPermissionCallback.onFail(2000, null);
                return;
            }
            return;
        }
        if (checkCommandLimit(MessageConstant.CommandId.COMMAND_NOTIFICATION_ADVANCE)) {
            if (iNotificationPermissionCallback != null) {
                iNotificationPermissionCallback.onFail(INotificationPermissionCallback.CODE_FREQUENT, null);
                return;
            }
            return;
        }
        if (!checkTop(activity)) {
            if (iNotificationPermissionCallback != null) {
                iNotificationPermissionCallback.onFail(INotificationPermissionCallback.CODE_NOT_TOP, null);
                return;
            }
            return;
        }
        if (activity.checkPermission("android.permission.POST_NOTIFICATIONS", Process.myPid(), Process.myUid()) == 0) {
            if (iNotificationPermissionCallback != null) {
                iNotificationPermissionCallback.onFail(INotificationPermissionCallback.CODE_HAD_PERMISSION, null);
                return;
            }
            return;
        }
        if (!this.mPermissionCallback.a(iNotificationPermissionCallback)) {
            if (iNotificationPermissionCallback != null) {
                iNotificationPermissionCallback.onFail(INotificationPermissionCallback.CODE_SHOWING, null);
                return;
            }
            return;
        }
        Intent intent = new Intent();
        intent.setAction(ACTION_NOTIFICATION_ADVANCE);
        intent.setPackage(getMcsPackageName(activity));
        Bundle bundle = new Bundle();
        bundle.putBinder(KEY_CALLBACK, this.mPermissionCallback);
        intent.putExtras(bundle);
        intent.putExtra(com.heytap.mcssdk.constant.b.E, getUserId(this.mContext));
        try {
            activity.startActivityForResult(intent, i);
        } catch (ActivityNotFoundException unused) {
            if (iNotificationPermissionCallback != null) {
                iNotificationPermissionCallback.onFail(INotificationPermissionCallback.CODE_UNSUPPORT, null);
            }
        }
    }

    @Override // com.heytap.mcssdk.b
    public void requestNotificationPermission() {
        int i = Build.VERSION.SDK_INT;
        if (i < 32) {
            if (checkContext()) {
                bindMcsService(MessageConstant.CommandId.COMMAND_NOTIFICATION_ALLOWANCE);
                return;
            } else {
                com.heytap.mcssdk.utils.e.e(com.heytap.mcssdk.utils.e.a, "please call the register first!");
                return;
            }
        }
        com.heytap.mcssdk.utils.e.b(TAG, "requestNotificationPermission() will return due to Android T device , current device Android SDK version code is :" + i);
    }

    @Override // com.heytap.mcssdk.b
    public void resumePush() {
        resumePush(null);
    }

    @Override // com.heytap.mcssdk.b
    public void resumePush(JSONObject jSONObject) {
        if (checkAll()) {
            startMcsService(MessageConstant.CommandId.COMMAND_RESUME_PUSH, jSONObject);
        } else {
            com.heytap.mcssdk.utils.e.e(com.heytap.mcssdk.utils.e.a, "please call the register first!");
        }
    }

    public void setAppKeySecret(String str, String str2) {
        this.mAuthCode = str;
        this.mVerifyCode = str2;
    }

    @Override // com.heytap.mcssdk.b
    public void setNotificationType(int i) {
        setNotificationType(i, null);
    }

    @Override // com.heytap.mcssdk.b
    public void setNotificationType(int i, JSONObject jSONObject) {
        if (!checkAll()) {
            com.heytap.mcssdk.utils.e.e(com.heytap.mcssdk.utils.e.a, "please call the register first!");
            return;
        }
        startMcsService(MessageConstant.CommandId.COMMAND_SET_NOTIFICATION_TYPE, i + "", jSONObject);
    }

    public void setPushCallback(ICallBackResultService iCallBackResultService) {
        this.mICallBackResultService = iCallBackResultService;
    }

    @Override // com.heytap.mcssdk.b
    public void setPushTime(List<Integer> list, int i, int i2, int i3, int i4) {
        setPushTime(list, i, i2, i3, i4, null);
    }

    @Override // com.heytap.mcssdk.b
    public void setPushTime(List<Integer> list, int i, int i2, int i3, int i4, JSONObject jSONObject) {
        if (!checkAll()) {
            if (getPushCallback() != null) {
                getPushCallback().onSetPushTime(-2, "please call the register first!");
                return;
            }
            return;
        }
        if (list == null || list.size() <= 0 || i < 0 || i2 < 0 || i3 < i || i3 > 23 || i4 < i2 || i4 > 59) {
            throw new IllegalArgumentException("params are not all right,please check params");
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("weekDays", com.heytap.mcssdk.b.b.a(list));
            jSONObject2.put("startHour", i);
            jSONObject2.put("startMin", i2);
            jSONObject2.put("endHour", i3);
            jSONObject2.put("endMin", i4);
            startMcsService(MessageConstant.CommandId.COMMAND_SET_PUSH_TIME, jSONObject2.toString(), jSONObject);
        } catch (JSONException e2) {
            com.heytap.mcssdk.utils.e.e(com.heytap.mcssdk.utils.e.a, e2.getLocalizedMessage());
        }
    }

    @Override // com.heytap.mcssdk.b
    public void setRegisterID(String str) {
        this.mRegisterID = str;
    }

    @Override // com.heytap.mcssdk.b
    public void unRegister() {
        unRegister(null);
    }

    public void unRegister(Context context, String str, String str2, JSONObject jSONObject, ICallBackResultService iCallBackResultService) {
        this.mAuthCode = str;
        this.mVerifyCode = str2;
        this.mContext = context.getApplicationContext();
        this.mICallBackResultService = iCallBackResultService;
        unRegister(jSONObject);
    }

    @Override // com.heytap.mcssdk.b
    public void unRegister(JSONObject jSONObject) {
        if (checkContext()) {
            startMcsService(MessageConstant.CommandId.COMMAND_UNREGISTER, jSONObject);
        } else if (getPushCallback() != null) {
            getPushCallback().onUnRegister(-2, this.mContext.getPackageName(), getMiniProgramPkgFromJSON(jSONObject));
        }
    }

    public void unRegisterLiquidChangeSettingObserver(Context context) {
        com.heytap.mcssdk.liquid.b.a().a(context);
    }
}
