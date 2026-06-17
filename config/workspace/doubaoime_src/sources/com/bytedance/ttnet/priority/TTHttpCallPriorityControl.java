package com.bytedance.ttnet.priority;

import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.frameworks.baselib.network.asynctask.NetworkAsyncTaskType;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.config.TTHttpCallThrottleControl;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TTHttpCallPriorityControl implements com.bytedance.retrofit2.T.a {

    /* renamed from: e, reason: collision with root package name */
    private static volatile TTHttpCallPriorityControl f6228e;
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final Map<String, a> b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private a f6229c = new com.bytedance.ttnet.priority.a();

    /* renamed from: d, reason: collision with root package name */
    private final ReadWriteLock f6230d = new ReentrantReadWriteLock();

    public enum ModeType {
        DEFAULT(0),
        NORMAL_DELAY(1),
        RUNTIME_DELAY(2),
        PRIORITY(3),
        NOT_REACHED(4);

        private final int value;

        ModeType(int i) {
            this.value = i;
        }

        public static ModeType fromValue(int i) {
            ModeType[] values = values();
            for (int i2 = 0; i2 < 5; i2++) {
                ModeType modeType = values[i2];
                if (modeType.getValue() == i) {
                    return modeType;
                }
            }
            throw new IllegalArgumentException(e.a.a.a.a.j("Invalid value: ", i));
        }

        public int getValue() {
            return this.value;
        }
    }

    public static abstract class a implements com.bytedance.retrofit2.T.a {
        protected final e a = new e();
        protected String b = "";

        /* renamed from: c, reason: collision with root package name */
        private Date f6231c = null;

        /* renamed from: d, reason: collision with root package name */
        private Date f6232d = null;

        /* renamed from: e, reason: collision with root package name */
        private boolean f6233e = true;

        /* renamed from: f, reason: collision with root package name */
        private int f6234f = 1000;

        /* renamed from: g, reason: collision with root package name */
        private com.bytedance.frameworks.baselib.network.asynctask.b f6235g = null;

        static boolean e(a aVar) {
            Objects.requireNonNull(aVar);
            if (Logger.debug()) {
                StringBuilder M = e.a.a.a.a.M("isInLifecycle, stateName: ");
                M.append(aVar.b);
                M.append(", beginTime: ");
                M.append(aVar.f6231c);
                M.append(", endTime: ");
                M.append(aVar.f6232d);
                Logger.d("TTHttpCallPriorityControl", M.toString());
            }
            if (!aVar.f6233e) {
                return false;
            }
            if (aVar.f6231c != null && aVar.f6232d != null) {
                Date date = new Date();
                if (!date.after(aVar.f6231c) || !date.before(aVar.f6232d)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.bytedance.retrofit2.T.a
        public void c(Request request) {
            this.a.e(request);
        }

        boolean f(JSONObject jSONObject) {
            String optString = jSONObject.optString("state_name", "");
            this.b = optString;
            if (TextUtils.isEmpty(optString)) {
                return false;
            }
            jSONObject.optInt(WsConstants.KEY_CONNECTION_STATE, -1);
            int optInt = jSONObject.optInt("delay_disable_time_ms", 1000);
            this.f6234f = optInt;
            this.f6234f = optInt > 0 ? optInt : 1000;
            String optString2 = jSONObject.optString("lifecycle");
            if (!"".equals(optString2)) {
                ArrayList arrayList = new ArrayList();
                if (com.bytedance.frameworks.baselib.network.http.p.h.c(optString2, arrayList) && arrayList.size() == 2) {
                    this.f6233e = true;
                    this.f6231c = (Date) arrayList.get(0);
                    this.f6232d = (Date) arrayList.get(1);
                    if (Logger.debug()) {
                        StringBuilder M = e.a.a.a.a.M("initLifecycle, stateName: ");
                        M.append(this.b);
                        M.append(", beginTime: ");
                        M.append(this.f6231c.toString());
                        M.append(", endTime: ");
                        M.append(this.f6232d.toString());
                        Logger.d("TTHttpCallPriorityControl", M.toString());
                    }
                } else {
                    if (Logger.debug()) {
                        Logger.d("TTHttpCallPriorityControl", "initLifecycle, parse lifecycle failed");
                    }
                    this.f6233e = false;
                }
            }
            return true;
        }

        void g() {
            if (this.f6235g != null) {
                com.bytedance.frameworks.baselib.network.asynctask.c.d(NetworkAsyncTaskType.NETWORK).f(this.f6235g);
            }
        }

        abstract ModeType h();
    }

    public static TTHttpCallPriorityControl f() {
        if (f6228e == null) {
            synchronized (TTHttpCallThrottleControl.class) {
                if (f6228e == null) {
                    f6228e = new TTHttpCallPriorityControl();
                }
            }
        }
        return f6228e;
    }

    public static Integer g(Map<String, Integer> map, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (String str2 : map.keySet()) {
            if (str.startsWith(str2)) {
                return map.get(str2);
            }
        }
        return null;
    }

    public static Set<String> h(JSONObject jSONObject, String str) {
        JSONArray optJSONArray;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        if (jSONObject == null || (optJSONArray = jSONObject.optJSONArray(str)) == null) {
            return copyOnWriteArraySet;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            String optString = optJSONArray.optString(i);
            if (!TextUtils.isEmpty(optString)) {
                copyOnWriteArraySet.add(optString);
            }
        }
        return copyOnWriteArraySet;
    }

    public static boolean i(Set<String> set, String str) {
        if (TextUtils.isEmpty(str) || set == null) {
            return false;
        }
        Iterator<String> it2 = set.iterator();
        while (it2.hasNext()) {
            if (str.startsWith(it2.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.retrofit2.T.a
    public boolean a(Request request, Executor executor, Runnable runnable) throws Exception {
        if (Logger.debug()) {
            StringBuilder M = e.a.a.a.a.M("current mode is ");
            M.append(e());
            Logger.d("TTHttpCallPriorityControl", M.toString());
        }
        if (!this.a.get() && this.f6229c.h() != ModeType.DEFAULT) {
            return false;
        }
        if (((request == null || TextUtils.isEmpty(request.getPath())) ? false : true) && a.e(this.f6229c)) {
            return this.f6229c.a(request, executor, runnable);
        }
        return false;
    }

    @Override // com.bytedance.retrofit2.T.a
    public void b(Request request) throws Exception {
        if (Logger.debug()) {
            StringBuilder M = e.a.a.a.a.M("current mode is ");
            M.append(e());
            Logger.d("TTHttpCallPriorityControl", M.toString());
        }
        if (this.a.get() || this.f6229c.h() == ModeType.DEFAULT) {
            if (((request == null || TextUtils.isEmpty(request.getPath())) ? false : true) && a.e(this.f6229c)) {
                this.f6229c.b(request);
            }
        }
    }

    @Override // com.bytedance.retrofit2.T.a
    public void c(Request request) {
        if (!this.a.get() || request == null) {
            return;
        }
        this.f6229c.c(request);
    }

    @Override // com.bytedance.retrofit2.T.a
    public Request d(Request request) {
        return (!this.a.get() || request == null) ? request : this.f6229c.d(request);
    }

    public ModeType e() {
        this.f6230d.writeLock().lock();
        try {
            return this.f6229c.h();
        } finally {
            this.f6230d.writeLock().unlock();
        }
    }

    public void j(JSONObject jSONObject) {
        this.a.set(false);
        this.b.clear();
        JSONArray optJSONArray = jSONObject.optJSONArray("tt_req_delay_config");
        boolean z = jSONObject.optInt("state_delay_enabled") > 0;
        boolean z2 = TTNetInit.getStateDelayNewStrategyEnabled() && (jSONObject.optInt("state_new_strategy_enabled", 1) > 0);
        if (!z || optJSONArray == null || !z2) {
            k();
            return;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            String optString = optJSONObject.optString("state_name", "");
            if (!TextUtils.isEmpty(optString)) {
                ModeType fromValue = ModeType.fromValue(optJSONObject.optInt("type", ModeType.NOT_REACHED.getValue()));
                a aVar = null;
                if (fromValue == ModeType.NORMAL_DELAY) {
                    aVar = new b();
                } else if (fromValue == ModeType.RUNTIME_DELAY) {
                    aVar = new d();
                } else if (fromValue == ModeType.PRIORITY) {
                    aVar = new c();
                }
                if (aVar != null && aVar.f(optJSONObject)) {
                    if (Logger.debug()) {
                        e.a.a.a.a.s0("mode name is ", optString, "TTHttpCallPriorityControl");
                    }
                    concurrentHashMap.put(optString, aVar);
                }
            }
        }
        if (Logger.debug()) {
            StringBuilder M = e.a.a.a.a.M("mode size is ");
            M.append(concurrentHashMap.size());
            Logger.d("TTHttpCallPriorityControl", M.toString());
        }
        this.b.putAll(concurrentHashMap);
        this.a.set(true);
    }

    public void k() {
        this.f6230d.writeLock().lock();
        try {
            this.f6229c.g();
            this.f6229c = new com.bytedance.ttnet.priority.a();
            if (Logger.debug()) {
                Logger.d("TTHttpCallPriorityControl", "set mode " + this.f6229c.h());
            }
        } finally {
            this.f6230d.writeLock().unlock();
        }
    }
}
