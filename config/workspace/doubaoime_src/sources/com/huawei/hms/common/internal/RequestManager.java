package com.huawei.hms.common.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.core.aidl.IAIDLInvoke;
import com.huawei.hms.support.log.HMSLog;
import e.a.a.a.a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes2.dex */
public class RequestManager implements Handler.Callback {
    public static final int NOTIFY_CONNECT_FAILED = 10012;
    public static final int NOTIFY_CONNECT_SUCCESS = 10011;
    public static final int NOTIFY_CONNECT_SUSPENDED = 10013;
    private static volatile RequestManager b;

    /* renamed from: c, reason: collision with root package name */
    private static Handler f7254c;
    private static final Object a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static Queue<HuaweiApi.RequestHandler> f7255d = new ConcurrentLinkedQueue();

    /* renamed from: e, reason: collision with root package name */
    private static Map<String, HuaweiApi.RequestHandler> f7256e = new LinkedHashMap();

    private RequestManager(Looper looper) {
        f7254c = new Handler(looper, this);
    }

    public static void addRequestToQueue(HuaweiApi.RequestHandler requestHandler) {
        f7255d.add(requestHandler);
    }

    public static void addToConnectedReqMap(final String str, final HuaweiApi.RequestHandler requestHandler) {
        if (f7254c == null) {
            return;
        }
        HMSLog.i("RequestManager", "addToConnectedReqMap");
        f7254c.post(new Runnable() { // from class: com.huawei.hms.common.internal.RequestManager.1
            @Override // java.lang.Runnable
            public void run() {
                RequestManager.f7256e.put(str, requestHandler);
            }
        });
    }

    private void b() {
        while (!f7255d.isEmpty()) {
            HuaweiApi.RequestHandler poll = f7255d.poll();
            if (poll != null) {
                Object client = poll.getClient();
                if (client instanceof BaseHmsClient) {
                    BaseHmsClient baseHmsClient = (BaseHmsClient) client;
                    baseHmsClient.setService(IAIDLInvoke.Stub.asInterface(baseHmsClient.getAdapter().getServiceBinder()));
                    poll.onConnected();
                }
            }
        }
    }

    private void c() {
        HMSLog.i("RequestManager", "NOTIFY_CONNECT_SUSPENDED.");
        while (!f7255d.isEmpty()) {
            f7255d.poll().onConnectionSuspended(1);
        }
        d();
    }

    private void d() {
        StringBuilder M = a.M("notifyRunningRequestConnectSuspend, connectedReqMap.size(): ");
        M.append(f7256e.size());
        HMSLog.i("RequestManager", M.toString());
        Iterator<Map.Entry<String, HuaweiApi.RequestHandler>> it2 = f7256e.entrySet().iterator();
        while (it2.hasNext()) {
            try {
                it2.next().getValue().onConnectionSuspended(1);
            } catch (RuntimeException e2) {
                StringBuilder M2 = a.M("NOTIFY_CONNECT_SUSPENDED Exception: ");
                M2.append(e2.getMessage());
                HMSLog.e("RequestManager", M2.toString());
            }
            it2.remove();
        }
    }

    public static Handler getHandler() {
        return f7254c;
    }

    public static RequestManager getInstance() {
        synchronized (a) {
            if (b == null) {
                HandlerThread handlerThread = new HandlerThread("RequestManager");
                handlerThread.start();
                b = new RequestManager(handlerThread.getLooper());
            }
        }
        return b;
    }

    public static void removeReqByTransId(final String str) {
        if (f7254c == null) {
            return;
        }
        HMSLog.i("RequestManager", "removeReqByTransId");
        f7254c.post(new Runnable() { // from class: com.huawei.hms.common.internal.RequestManager.2
            @Override // java.lang.Runnable
            public void run() {
                RequestManager.f7256e.remove(str);
            }
        });
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message == null) {
            return false;
        }
        HMSLog.i("RequestManager", "RequestManager handleMessage.");
        switch (message.what) {
            case NOTIFY_CONNECT_SUCCESS /* 10011 */:
                b();
                break;
            case NOTIFY_CONNECT_FAILED /* 10012 */:
                a(message);
                break;
            case NOTIFY_CONNECT_SUSPENDED /* 10013 */:
                c();
                break;
            default:
                StringBuilder M = a.M("handleMessage unknown msg:");
                M.append(message.what);
                HMSLog.i("RequestManager", M.toString());
                break;
        }
        return false;
    }

    private void a(Message message) {
        HMSLog.i("RequestManager", "NOTIFY_CONNECT_FAILED.");
        try {
            BaseHmsClient.ConnectionResultWrapper connectionResultWrapper = (BaseHmsClient.ConnectionResultWrapper) message.obj;
            HuaweiApi.RequestHandler request = connectionResultWrapper.getRequest();
            f7255d.remove(request);
            request.onConnectionFailed(connectionResultWrapper.getConnectionResult());
        } catch (RuntimeException e2) {
            StringBuilder M = a.M("<handleConnectFailed> handle Failed");
            M.append(e2.getMessage());
            HMSLog.e("RequestManager", M.toString());
        }
    }
}
