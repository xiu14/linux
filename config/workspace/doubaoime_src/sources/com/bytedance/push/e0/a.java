package com.bytedance.push.e0;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.bytedance.common.push.e.c;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.push.C;
import com.bytedance.push.g0.f;
import com.bytedance.push.helper.NetWorkStatusMonitorHelper;
import com.bytedance.push.interfaze.x;
import com.bytedance.push.third.PushManager;
import com.ss.android.message.e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class a implements x, Handler.Callback, Observer {
    private final Set<Integer> b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private final Map<Integer, b> f5658c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f5659d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    private c.a f5660e = new C0294a(this);

    /* renamed from: f, reason: collision with root package name */
    private int f5661f = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f5662g = false;
    private boolean h = false;
    private com.bytedance.push.settings.C.b a = com.ss.android.pushmanager.setting.c.c().g().d();

    /* renamed from: com.bytedance.push.e0.a$a, reason: collision with other inner class name */
    class C0294a implements c.a {
        C0294a(a aVar) {
        }
    }

    class b {
        private int a;
        private String b;

        /* renamed from: c, reason: collision with root package name */
        private final AtomicBoolean f5663c = new AtomicBoolean(false);

        public b(int i) {
            this.a = i;
        }

        static void a(b bVar, String str) {
            Objects.requireNonNull(bVar);
            f.g("TokenRetryTask", "[startRetry]pushType:" + bVar.a + " retryReason:" + str + " mRetrying:" + bVar.f5663c + " mRetryingReason:" + bVar.b);
            if (!bVar.f5663c.compareAndSet(false, true)) {
                StringBuilder M = e.a.a.a.a.M("[retryForEnterBackground]do nothing because mRetryingReason:");
                M.append(bVar.b);
                f.g("TokenRetryTask", M.toString());
                return;
            }
            bVar.b = str;
            f.g("TokenRetryTask", "[retryForEnterBackground]retry token register because " + str);
            PushManager.inst().registerPush(com.ss.android.message.a.a(), bVar.a);
            ((C) C.a()).r().onTokenRetry(bVar.a, str);
            long j = a.this.a.b * 1000;
            f.g("TokenRetryTask", "[retryForEnterBackground]send token register timeout message after " + j);
            WeakHandler b = e.e().b();
            Message obtainMessage = b.obtainMessage(20250116, Integer.valueOf(bVar.a));
            Bundle bundle = new Bundle();
            bundle.putString("retry_reason", str);
            obtainMessage.setData(bundle);
            b.sendMessageDelayed(obtainMessage, j);
        }

        public String b() {
            return this.b;
        }

        public void c(String str) {
            StringBuilder M = e.a.a.a.a.M("[retryFailed]pushType:");
            M.append(this.a);
            M.append(" retryReason:");
            M.append(str);
            f.g("TokenRetryTask", M.toString());
            ((C) C.a()).r().onTokenRetryResult(this.a, false, str);
            this.f5663c.set(false);
            this.b = null;
        }
    }

    public a() {
        e.e().a(this);
    }

    public void c(int i) {
        f.g("TokenRetryService", "[onPushAdapterRegister]pushType:" + i);
        com.bytedance.push.settings.C.b bVar = this.a;
        if (!bVar.a) {
            f.g("TokenRetryService", "[onPushAdapterRegister]do nothing because enableTokenRetry is false");
            return;
        }
        if (!bVar.f5799c.contains(Integer.valueOf(i))) {
            f.g("TokenRetryService", "[onPushAdapterRegister]do nothing because needRetryChannel not contains " + i);
            return;
        }
        synchronized (this.b) {
            if (this.b.contains(Integer.valueOf(i))) {
                f.g("TokenRetryService", "[onPushAdapterRegister]do nothing because mNeedRetrySenderSet has contains " + i);
                return;
            }
            this.b.add(Integer.valueOf(i));
            long j = this.a.b * 1000;
            f.g("TokenRetryService", "[onPushAdapterRegister]send token register timeout message after " + j);
            WeakHandler b2 = e.e().b();
            b2.sendMessageDelayed(b2.obtainMessage(20250115, Integer.valueOf(i)), j);
        }
    }

    public void d(int i) {
        b bVar;
        f.g("TokenRetryService", "[onUpdateTokenSuccess]pushType:" + i);
        if (!this.a.a) {
            f.g("TokenRetryService", "[onUpdateTokenSuccess]do nothing because enableTokenRetry is false");
            return;
        }
        synchronized (this.b) {
            if (!this.b.contains(Integer.valueOf(i))) {
                f.g("TokenRetryService", "[onUpdateTokenSuccess]needn't retry:" + i);
                return;
            }
            this.b.remove(Integer.valueOf(i));
            synchronized (this.f5658c) {
                if (!this.f5658c.isEmpty() && (bVar = this.f5658c.get(Integer.valueOf(i))) != null) {
                    ((C) C.a()).r().onTokenRetryResult(i, true, bVar.b());
                    this.f5658c.remove(Integer.valueOf(i));
                }
            }
            f.g("TokenRetryService", "[onUpdateTokenSuccess]remove timeout message for " + i);
            e.e().b().removeMessages(20250115, Integer.valueOf(i));
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 20250115) {
            StringBuilder M = e.a.a.a.a.M("[handleMessage]MSG_WHAT_TOKEN_REGISTER_TIMEOUT:");
            M.append(message.obj);
            f.g("TokenRetryService", M.toString());
            int intValue = ((Integer) message.obj).intValue();
            synchronized (this.f5658c) {
                if (this.f5658c.get(Integer.valueOf(intValue)) == null) {
                    this.f5658c.put(Integer.valueOf(intValue), new b(intValue));
                }
            }
            if (this.f5659d.compareAndSet(false, true)) {
                StringBuilder M2 = e.a.a.a.a.M("[registerTokenRetryCallback]retryAfterNetworkChanged:");
                M2.append(this.a.f5800d);
                M2.append(" loopRetryIntervalInSecond:");
                M2.append(this.a.f5802f);
                M2.append(" triggerRetryEventList.size:");
                M2.append(this.a.h.size());
                M2.append(" retryAfterEnterBackground:");
                M2.append(this.a.f5803g);
                f.g("TokenRetryService", M2.toString());
                if (this.a.f5800d) {
                    NetWorkStatusMonitorHelper.b().a(new com.bytedance.push.e0.b(this));
                }
                if (this.a.f5802f > 0) {
                    WeakHandler b2 = e.e().b();
                    b2.sendMessageDelayed(b2.obtainMessage(20250117), this.a.f5802f * 1000);
                }
                if (!this.a.h.isEmpty()) {
                    c eventReportListener = com.bytedance.common.g.a.c().e().c().o.getEventReportListener();
                    f.g("TokenRetryService", "[registerTokenRetryCallback]eventReportListener:" + eventReportListener);
                    if (eventReportListener != null) {
                        eventReportListener.a(this.f5660e);
                    } else {
                        f.m("TokenRetryService", "[registerTokenRetryCallback]not monitor event report because eventReportListener is null");
                    }
                }
                if (this.a.f5803g) {
                    StringBuilder M3 = e.a.a.a.a.M("[registerTokenRetryCallback]mHasRegisterAppStatusObserver:");
                    M3.append(this.h);
                    f.g("TokenRetryService", M3.toString());
                    if (!this.h) {
                        this.h = true;
                        this.f5662g = com.bytedance.common.push.b.e().j();
                        com.bytedance.common.push.b.e().addObserver(this);
                    }
                }
            }
            return true;
        }
        if (i != 20250117) {
            if (i == 20250116) {
                int intValue2 = ((Integer) message.obj).intValue();
                String string = message.getData().getString("retry_reason");
                StringBuilder M4 = e.a.a.a.a.M("[handleMessage]MSG_WHAT_TOKEN_RETRY_TIMEOUT:");
                M4.append(message.obj);
                M4.append(" retryReason:");
                M4.append(string);
                f.g("TokenRetryService", M4.toString());
                synchronized (this.f5658c) {
                    if (!this.f5658c.isEmpty()) {
                        b bVar = this.f5658c.get(Integer.valueOf(intValue2));
                        if (bVar != null) {
                            bVar.c(string);
                        } else {
                            ((C) C.a()).r().onTokenRetryResult(intValue2, true, string);
                        }
                    }
                }
            }
            return false;
        }
        f.g("TokenRetryService", "[handleMessage]MSG_WHAT_TOKEN_REGISTER_AGAIN");
        synchronized (this.f5658c) {
            if (this.f5658c.isEmpty()) {
                this.f5661f = 0;
                f.g("TokenRetryService", "[handleMessage]update mLoopRetryTimes to 0");
            } else {
                f.g("TokenRetryService", "[handleMessage]maxLoopRetryTimes:" + this.a.f5801e + " mLoopRetryTimes:" + this.f5661f);
                int i2 = this.a.f5801e;
                if (i2 > 0 && this.f5661f >= i2) {
                    f.g("TokenRetryService", "[handleMessage]not loop retry because mLoopRetryTimes >maxRetryTimes,mLoopRetryTimes:" + this.f5661f + " maxRetryTimes:" + this.a.f5801e);
                    return true;
                }
                this.f5661f++;
                f.g("TokenRetryService", "[handleMessage]update mLoopRetryTimes to " + this.f5661f);
                Iterator<b> it2 = this.f5658c.values().iterator();
                while (it2.hasNext()) {
                    b.a(it2.next(), "interval_loop");
                }
                WeakHandler b3 = e.e().b();
                b3.sendMessageDelayed(b3.obtainMessage(20250117), this.a.f5802f * 1000);
            }
            return true;
        }
    }

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        StringBuilder M = e.a.a.a.a.M("app status changed,mIsBackground:");
        M.append(this.f5662g);
        M.append(" isBackground:");
        M.append(booleanValue);
        f.g("TokenRetryService", M.toString());
        if (!this.f5662g && booleanValue) {
            synchronized (this.f5658c) {
                Iterator<b> it2 = this.f5658c.values().iterator();
                while (it2.hasNext()) {
                    b.a(it2.next(), "enter_background");
                }
            }
        }
        this.f5662g = booleanValue;
    }
}
