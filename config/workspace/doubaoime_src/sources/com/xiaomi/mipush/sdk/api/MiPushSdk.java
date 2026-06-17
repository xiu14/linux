package com.xiaomi.mipush.sdk.api;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.c;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.mipush.sdk.b;
import com.xiaomi.push.ba;
import com.xiaomi.push.t;
import e.a.a.a.a;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public class MiPushSdk {
    private static final String AUTHORITY_PUSH_COMMON = "com.xiaomi.push.provider.PUSH_COMMON";
    public static final int FLAG_IS_PHONE_SUPPORT_EXTENSION = 262144;
    public static final int FLAG_PROFILE_ID = 4;
    public static final int FLAG_SUPPORT_CALLKIT = 524288;
    private static final String KEY_IS_SUPPORTED = "is_supported";
    private static final String KEY_PUSH_SUPPORT_FLAG = "push_support_flag";
    private static final String META_KEY_PUSH_SUPPORT_FLAG = "pushSupportFlag";
    private static final String METHOD_IS_PUSH_SUPPORT = "is_push_support";
    private static final long PROFILE_TASK_TIME_OUT = 5000;
    private static final long REGISTER_TASK_TIME_OUT = 10000;
    private static final String TASK_NAME_ADD_PROFILE_ID = "addProfileId";
    private static final String TASK_NAME_DELETE_ALL_PROFILE_ID = "deleteAllProfileId";
    private static final String TASK_NAME_DELETE_PROFILE_ID = "deleteProfileId";
    private static final String TASK_NAME_DELETE_TOKEN = "deleteToken";
    private static final String TASK_NAME_GET_TOKEN = "getToken";
    private static final String TASK_NAME_QUERY_PROFILE_ID = "queryProfileId";
    private static final String TASK_NAME_REAL_ADD_PROFILE_ID = "realAddProfileId";
    private static final String TASK_NAME_REAL_DELETE_ALL_PROFILE_ID = "realDeleteAllProfileId";
    private static final String TASK_NAME_REAL_DELETE_PROFILE_ID = "realDeleteProfileId";
    private static final String TASK_NAME_REAL_QUERY_PROFILE_ID = "realQueryProfileId";

    private static class InstanceHolder {
        private static final MiPushSdk sInstance = new MiPushSdk();

        private InstanceHolder() {
        }
    }

    public static MiPushSdk getInstance() {
        return InstanceHolder.sInstance;
    }

    public Task<Void> addProfileId(final String str) {
        final TaskImpl taskImpl = new TaskImpl();
        ba.a(TASK_NAME_ADD_PROFILE_ID, new Runnable() { // from class: com.xiaomi.mipush.sdk.api.MiPushSdk.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    FutureTask futureTask = new FutureTask(new Callable<String>() { // from class: com.xiaomi.mipush.sdk.api.MiPushSdk.2.1
                        @Override // java.util.concurrent.Callable
                        public String call() {
                            Bundle addProfileId = MiPushClient.addProfileId(str);
                            if (addProfileId == null) {
                                c.m15a("execute failed");
                                taskImpl.setException(new IllegalStateException("execute failed"));
                            } else if (TextUtils.equals(addProfileId.getString("code"), "0")) {
                                taskImpl.setResult(null);
                            } else {
                                taskImpl.setException(new IllegalStateException(addProfileId.getString("msg")));
                            }
                            return null;
                        }
                    });
                    ba.a(MiPushSdk.TASK_NAME_REAL_ADD_PROFILE_ID, futureTask, false);
                    futureTask.get(5000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    taskImpl.setException(new Exception("addProfileId error", e2));
                } catch (TimeoutException e3) {
                    taskImpl.setException(new Exception("addProfileId timeout", e3));
                } catch (Exception e4) {
                    taskImpl.setException(new Exception("addProfileId error", e4));
                }
            }
        }, true);
        return taskImpl;
    }

    public Task<Void> deleteAllProfileId() {
        final TaskImpl taskImpl = new TaskImpl();
        ba.a(TASK_NAME_DELETE_ALL_PROFILE_ID, new Runnable() { // from class: com.xiaomi.mipush.sdk.api.MiPushSdk.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    FutureTask futureTask = new FutureTask(new Callable<String>() { // from class: com.xiaomi.mipush.sdk.api.MiPushSdk.4.1
                        @Override // java.util.concurrent.Callable
                        public String call() {
                            Bundle deleteAllProfileId = MiPushClient.deleteAllProfileId();
                            if (deleteAllProfileId == null) {
                                c.m15a("delete all profile id failed");
                                taskImpl.setException(new IllegalStateException("delete all profile id failed"));
                            } else if (TextUtils.equals(deleteAllProfileId.getString("code"), "0")) {
                                taskImpl.setResult(null);
                            } else {
                                taskImpl.setException(new IllegalStateException(deleteAllProfileId.getString("msg")));
                            }
                            return null;
                        }
                    });
                    ba.a(MiPushSdk.TASK_NAME_REAL_DELETE_ALL_PROFILE_ID, futureTask, false);
                    futureTask.get(5000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    taskImpl.setException(new Exception("deleteAllProfileId error", e2));
                } catch (TimeoutException e3) {
                    taskImpl.setException(new Exception("deleteAllProfileId timeout", e3));
                } catch (Exception e4) {
                    taskImpl.setException(new Exception("deleteAllProfileId error", e4));
                }
            }
        }, true);
        return taskImpl;
    }

    public Task<Void> deleteProfileId(final String str) {
        final TaskImpl taskImpl = new TaskImpl();
        ba.a(TASK_NAME_DELETE_PROFILE_ID, new Runnable() { // from class: com.xiaomi.mipush.sdk.api.MiPushSdk.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    FutureTask futureTask = new FutureTask(new Callable<String>() { // from class: com.xiaomi.mipush.sdk.api.MiPushSdk.3.1
                        @Override // java.util.concurrent.Callable
                        public String call() {
                            Bundle deleteProfileId = MiPushClient.deleteProfileId(str);
                            if (deleteProfileId == null) {
                                c.m15a("execute failed");
                                taskImpl.setException(new IllegalStateException("execute failed"));
                            } else if (TextUtils.equals(deleteProfileId.getString("code"), "0")) {
                                taskImpl.setResult(null);
                            } else {
                                taskImpl.setException(new IllegalStateException(deleteProfileId.getString("msg")));
                            }
                            return null;
                        }
                    });
                    ba.a(MiPushSdk.TASK_NAME_REAL_DELETE_PROFILE_ID, futureTask, false);
                    futureTask.get(5000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    taskImpl.setException(new Exception("deleteProfileId error", e2));
                } catch (TimeoutException e3) {
                    taskImpl.setException(new Exception("deleteProfileId timeout", e3));
                } catch (Exception e4) {
                    taskImpl.setException(new Exception("deleteProfileId error", e4));
                }
            }
        }, true);
        return taskImpl;
    }

    public Task<Void> deleteToken() {
        final TaskImpl taskImpl = new TaskImpl();
        ba.a(TASK_NAME_DELETE_TOKEN, new Runnable() { // from class: com.xiaomi.mipush.sdk.api.MiPushSdk.6
            @Override // java.lang.Runnable
            public void run() {
                FutureTask futureTask = null;
                try {
                    try {
                        if (t.m841a() == null) {
                            c.m15a("MiPushSdk not init");
                            taskImpl.setException(new IllegalStateException("MiPushSdk not init"));
                        } else {
                            if (!TextUtils.isEmpty(MiPushClient.getRegId(t.m841a()))) {
                                FutureTask futureTask2 = new FutureTask(new Callable<String>() { // from class: com.xiaomi.mipush.sdk.api.MiPushSdk.6.1
                                    @Override // java.util.concurrent.Callable
                                    public String call() {
                                        if (TextUtils.isEmpty(MiPushClient.getRegId(t.m841a()))) {
                                            taskImpl.setResult(null);
                                        } else {
                                            taskImpl.setException(new IllegalStateException("unregister is not success"));
                                        }
                                        return null;
                                    }
                                });
                                try {
                                    b.m41a(t.m841a()).a("UNREGISTER", futureTask2);
                                    MiPushClient.unregisterPush(t.m841a());
                                    futureTask2.get(10000L, TimeUnit.MILLISECONDS);
                                    b.m41a(t.m841a()).b("UNREGISTER", futureTask2);
                                    return;
                                } catch (InterruptedException e2) {
                                    futureTask = futureTask2;
                                    e = e2;
                                    Thread.currentThread().interrupt();
                                    taskImpl.setException(new Exception("deleteToken error", e));
                                    b.m41a(t.m841a()).b("UNREGISTER", futureTask);
                                    return;
                                } catch (TimeoutException e3) {
                                    e = e3;
                                    futureTask = futureTask2;
                                    taskImpl.setException(new Exception("deleteToken timeout", e));
                                    b.m41a(t.m841a()).b("UNREGISTER", futureTask);
                                    return;
                                } catch (Exception e4) {
                                    futureTask = futureTask2;
                                    e = e4;
                                    taskImpl.setException(new Exception("deleteToken error", e));
                                    b.m41a(t.m841a()).b("UNREGISTER", futureTask);
                                    return;
                                } catch (Throwable th) {
                                    th = th;
                                    futureTask = futureTask2;
                                    b.m41a(t.m841a()).b("UNREGISTER", futureTask);
                                    throw th;
                                }
                            }
                            taskImpl.setResult(null);
                        }
                        b.m41a(t.m841a()).b("UNREGISTER", null);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (InterruptedException e5) {
                    e = e5;
                } catch (TimeoutException e6) {
                    e = e6;
                } catch (Exception e7) {
                    e = e7;
                }
            }
        }, false);
        return taskImpl;
    }

    public Task<String> getToken() {
        final TaskImpl taskImpl = new TaskImpl();
        ba.a(TASK_NAME_GET_TOKEN, new Runnable() { // from class: com.xiaomi.mipush.sdk.api.MiPushSdk.1
            @Override // java.lang.Runnable
            public void run() {
                Context m841a = t.m841a();
                if (m841a == null) {
                    c.m15a("MiPushSdk not init");
                    taskImpl.setException(new IllegalStateException("MiPushSdk not init"));
                    return;
                }
                if (TextUtils.isEmpty(b.m41a(m841a).m42a())) {
                    taskImpl.setException(new IllegalStateException("MiPushSdk not init"));
                    return;
                }
                FutureTask futureTask = null;
                try {
                    try {
                        String regId = MiPushClient.getRegId(m841a);
                        if (TextUtils.isEmpty(regId)) {
                            FutureTask futureTask2 = new FutureTask(new Callable<String>() { // from class: com.xiaomi.mipush.sdk.api.MiPushSdk.1.1
                                @Override // java.util.concurrent.Callable
                                public String call() {
                                    String regId2 = MiPushClient.getRegId(t.m841a());
                                    if (TextUtils.isEmpty(regId2)) {
                                        taskImpl.setException(new IllegalStateException("regId is empty"));
                                        return null;
                                    }
                                    taskImpl.setResult(regId2);
                                    return null;
                                }
                            });
                            try {
                                b.m41a(t.m841a()).a("REGISTER", futureTask2);
                                futureTask2.get(10000L, TimeUnit.MILLISECONDS);
                                futureTask = futureTask2;
                            } catch (InterruptedException e2) {
                                futureTask = futureTask2;
                                e = e2;
                                Thread.currentThread().interrupt();
                                taskImpl.setException(new Exception("getToken error", e));
                                b.m41a(t.m841a()).b("UNREGISTER", futureTask);
                            } catch (TimeoutException e3) {
                                e = e3;
                                futureTask = futureTask2;
                                taskImpl.setException(new Exception("getToken timeout", e));
                                b.m41a(t.m841a()).b("UNREGISTER", futureTask);
                            } catch (Exception e4) {
                                futureTask = futureTask2;
                                e = e4;
                                taskImpl.setException(new Exception("getToken error", e));
                                b.m41a(t.m841a()).b("UNREGISTER", futureTask);
                            } catch (Throwable th) {
                                th = th;
                                futureTask = futureTask2;
                                b.m41a(t.m841a()).b("UNREGISTER", futureTask);
                                throw th;
                            }
                        } else {
                            taskImpl.setResult(regId);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (InterruptedException e5) {
                    e = e5;
                } catch (TimeoutException e6) {
                    e = e6;
                } catch (Exception e7) {
                    e = e7;
                }
                b.m41a(t.m841a()).b("UNREGISTER", futureTask);
            }
        }, false);
        return taskImpl;
    }

    public void init(Context context, String str, String str2) {
        MiPushClient.registerPush(context, str, str2);
    }

    public boolean isPushSupport(int i) {
        try {
            Context m841a = t.m841a();
            if (m841a == null) {
                c.m15a("isPushSupport: context is null");
                return false;
            }
            if (!MiPushClient.shouldUseMIUIPush(m841a)) {
                c.m15a("isPushSupport: xmsf not supported or not installed");
                return false;
            }
            Bundle bundle = new Bundle();
            bundle.putInt(KEY_PUSH_SUPPORT_FLAG, i);
            Bundle call = m841a.getContentResolver().call(Uri.parse("content://com.xiaomi.push.provider.PUSH_COMMON"), METHOD_IS_PUSH_SUPPORT, (String) null, bundle);
            if (call == null) {
                c.m15a("isPushSupport: result is null, XMSF may not be available");
                return false;
            }
            boolean z = call.getBoolean(KEY_IS_SUPPORTED, false);
            c.b("isPushSupport: flag=" + i + ", result=" + z);
            return z;
        } catch (Throwable th) {
            StringBuilder M = a.M("isPushSupport error: ");
            M.append(th.getMessage());
            c.a(M.toString(), th);
            return false;
        }
    }

    public boolean isSupport(Context context) {
        return MiPushClient.shouldUseMIUIPush(context);
    }

    public Task<List<String>> queryProfileIds() {
        final TaskImpl taskImpl = new TaskImpl();
        ba.a(TASK_NAME_QUERY_PROFILE_ID, new Runnable() { // from class: com.xiaomi.mipush.sdk.api.MiPushSdk.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    FutureTask futureTask = new FutureTask(new Callable<String>() { // from class: com.xiaomi.mipush.sdk.api.MiPushSdk.5.1
                        @Override // java.util.concurrent.Callable
                        public String call() {
                            Bundle queryProfileIds = MiPushClient.queryProfileIds();
                            if (queryProfileIds == null) {
                                c.m15a("query profile id failed");
                                taskImpl.setException(new IllegalStateException("query profile id failed"));
                                return null;
                            }
                            if (TextUtils.equals(queryProfileIds.getString("code"), "0")) {
                                taskImpl.setResult(queryProfileIds.getStringArrayList("allProfileIds"));
                                return null;
                            }
                            taskImpl.setException(new IllegalStateException(queryProfileIds.getString("msg")));
                            return null;
                        }
                    });
                    ba.a(MiPushSdk.TASK_NAME_REAL_QUERY_PROFILE_ID, futureTask, false);
                    futureTask.get(5000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    taskImpl.setException(new Exception("queryProfileIds error", e2));
                } catch (TimeoutException e3) {
                    taskImpl.setException(new Exception("queryProfileIds timeout", e3));
                } catch (Exception e4) {
                    taskImpl.setException(new Exception("queryProfileIds error", e4));
                }
            }
        }, true);
        return taskImpl;
    }

    private MiPushSdk() {
    }
}
