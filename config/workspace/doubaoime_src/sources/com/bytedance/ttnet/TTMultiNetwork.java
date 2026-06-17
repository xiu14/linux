package com.bytedance.ttnet;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.common.utility.Logger;
import com.bytedance.retrofit2.InterfaceC0701e;
import com.bytedance.retrofit2.InterfaceC0704h;
import com.bytedance.retrofit2.N;
import com.bytedance.retrofit2.mime.h;
import com.bytedance.ttnet.TTWiFiCellSwitcher;
import com.vivo.push.PushClient;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public class TTMultiNetwork {
    private static final String HEADER_ACTIVE_RESULT = "ActiveResult";
    private static final String HOST_MULTINET = "multinet";
    private static final String PATH_ACTIVATE_CELL = "/activatecell";
    private static final String TAG = "TTMultiNetwork";
    private static volatile State sCurrentState = State.STOPPED;
    private static volatile ActiveResult sActiveResult = ActiveResult.DEFAULT;
    private static Map<d, Handler> sObservers = new HashMap();

    public enum ActiveResult {
        DEFAULT(0),
        SUCCESS(1),
        FAILED(2),
        DEFERRED_UNSUITABLE_NETWORK(3),
        ACTIVATION_IN_PROGRESS(4);

        private final int code;

        ActiveResult(int i) {
            this.code = i;
        }

        static ActiveResult convertToResult(String str) {
            try {
                return values()[Integer.parseInt(str) - DEFAULT.code()];
            } catch (NumberFormatException unused) {
                return DEFAULT;
            }
        }

        int code() {
            return this.code;
        }

        public int getCode() {
            return this.code;
        }
    }

    public enum State {
        STOPPED(-1),
        NO_NETWORK(0),
        DEFAULT_CELLULAR_WITH_WIFI_DOWN(1),
        DEFAULT_WIFI_WITH_CELLULAR_DOWN(2),
        DEFAULT_WIFI_WITH_CELLULAR_UP(3),
        WAIT_CELLULAR_ALWAYS_UP(4),
        DEFAULT_VPN(5);

        final int state;

        State(int i) {
            this.state = i;
        }

        static State convertToState(int i) {
            return values()[i - STOPPED.code()];
        }

        public int code() {
            return this.state;
        }
    }

    class a implements InterfaceC0704h<h> {
        a() {
        }

        @Override // com.bytedance.retrofit2.InterfaceC0704h
        public void a(InterfaceC0701e<h> interfaceC0701e, N<h> n) {
            try {
                String str = null;
                Iterator<com.bytedance.retrofit2.client.b> it2 = n.e().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    com.bytedance.retrofit2.client.b next = it2.next();
                    if (TTMultiNetwork.HEADER_ACTIVE_RESULT.equalsIgnoreCase(next.a())) {
                        str = next.b();
                        break;
                    }
                }
                ActiveResult unused = TTMultiNetwork.sActiveResult = ActiveResult.convertToResult(str);
                TTMultiNetwork.notifyUserSpecifiedNetworkEnabled(PushClient.DEFAULT_REQUEST_ID.equals(str));
            } finally {
                try {
                } finally {
                }
            }
        }

        @Override // com.bytedance.retrofit2.InterfaceC0704h
        public void b(InterfaceC0701e<h> interfaceC0701e, Throwable th) {
            TTMultiNetwork.notifyUserSpecifiedNetworkEnabled(false);
            th.printStackTrace();
            interfaceC0701e.cancel();
        }
    }

    class b implements Runnable {
        final /* synthetic */ d a;
        final /* synthetic */ int b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6098c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f6099d;

        b(d dVar, int i, int i2, long j) {
            this.a = dVar;
            this.b = i;
            this.f6098c = i2;
            this.f6099d = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(State.convertToState(this.b), State.convertToState(this.f6098c), this.f6099d);
        }
    }

    class c implements Runnable {
        final /* synthetic */ d a;
        final /* synthetic */ boolean b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f6100c;

        c(d dVar, boolean z, long j) {
            this.a = dVar;
            this.b = z;
            this.f6100c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.b(this.b, this.f6100c);
        }
    }

    public interface d {
        void a(State state, State state2, long j);

        void b(boolean z, long j);
    }

    public static ActiveResult getActiveResult() {
        return sActiveResult;
    }

    public static State getCurrentState() {
        return sCurrentState;
    }

    private static void notifyMultiNetworkState(int i, int i2) {
        if (Logger.debug()) {
            Logger.d(TAG, "notifyMultiNetworkState, prev: " + i + ", curr: " + i2);
        }
        sCurrentState = State.convertToState(i2);
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (TTMultiNetwork.class) {
            for (Map.Entry<d, Handler> entry : sObservers.entrySet()) {
                d key = entry.getKey();
                Handler value = entry.getValue();
                if (value != null) {
                    value.post(new b(key, i, i2, currentTimeMillis));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void notifyUserSpecifiedNetworkEnabled(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (TTMultiNetwork.class) {
            for (Map.Entry<d, Handler> entry : sObservers.entrySet()) {
                d key = entry.getKey();
                Handler value = entry.getValue();
                if (value != null) {
                    value.post(new c(key, z, currentTimeMillis));
                }
            }
        }
    }

    public static void registerMultiNetObserver(d dVar, Handler handler) {
        Objects.requireNonNull(dVar, "observer == null");
        synchronized (TTMultiNetwork.class) {
            if (!sObservers.containsKey(dVar)) {
                if (handler == null) {
                    sObservers.put(dVar, new Handler(Looper.getMainLooper()));
                } else {
                    sObservers.put(dVar, handler);
                }
            }
        }
    }

    @Deprecated
    public static void triggerSwitchingToCellular() {
        TTWiFiCellSwitcher.inst().triggerSwitchingToNetwork(TTWiFiCellSwitcher.NetworkType.CELL);
    }

    public static void tryActivateAlternativeNet() {
        try {
            com.bytedance.feedbackerlib.a.H0(HOST_MULTINET, PATH_ACTIVATE_CELL, null, null, new a());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void unregisterMultiNetObserver(d dVar) {
        Objects.requireNonNull(dVar, "observer == null");
        synchronized (TTMultiNetwork.class) {
            sObservers.remove(dVar);
        }
    }
}
