package com.bytedance.ttnet;

import android.os.Handler;
import android.os.Looper;
import com.vivo.push.PushClient;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public class TTWiFiCellSwitcher {
    private static final String ACTION_NAME = "wifi-to-cell";
    private static final String ACTION_PATH_NOTIFY_SWITCH = "/notify-switch";
    private static final String ACTION_PATH_START = "/start";
    private static final String ACTION_PATH_STOP = "/stop";
    private static final String ACTION_PATH_TRIGGER = "/trigger-switch";
    private static final String ACTION_PATH_TRIGGER_THIRD_PARTY = "/trigger-third-party";
    private static final String TAG = "TTWiFiCellSwitchManager";
    private volatile State mCurrentState = State.STOPPED;
    private final Map<b, Handler> mObservers = new HashMap();

    public enum NetworkType {
        WIFI(0),
        CELL(1);

        final int networkType;

        NetworkType(int i) {
            this.networkType = i;
        }

        public int code() {
            return this.networkType;
        }
    }

    public enum State {
        UNKNOWN(Integer.MIN_VALUE),
        STOPPED(-1),
        NO_NETWORK(0),
        DEFAULT_CELLULAR(1),
        DEFAULT_WIFI_WITH_CELLULAR_DOWN(2),
        DEFAULT_WIFI_WITH_CELLULAR_UP(3),
        WAIT_CELLULAR_ALWAYS_UP(4),
        WAIT_USER_ALLOW_TO_CELLULAR(5),
        WIFI_WITH_CELLULAR_TRANS_DATA(6),
        EVALUATE_CELLULAR(7),
        WAIT_USER_ALLOW_TO_WIFI(8);

        private static final Map<Integer, State> BY_CODE = new HashMap();
        final int state;

        static {
            State[] values = values();
            for (int i = 0; i < 11; i++) {
                State state = values[i];
                BY_CODE.put(Integer.valueOf(state.state), state);
            }
        }

        State(int i) {
            this.state = i;
        }

        public static State convertToState(int i) {
            State state = BY_CODE.get(Integer.valueOf(i));
            return state != null ? state : UNKNOWN;
        }

        public int code() {
            return this.state;
        }
    }

    class a implements Runnable {
        final /* synthetic */ b a;
        final /* synthetic */ int b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6107c;

        a(TTWiFiCellSwitcher tTWiFiCellSwitcher, b bVar, int i, int i2) {
            this.a = bVar;
            this.b = i;
            this.f6107c = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(State.convertToState(this.b), State.convertToState(this.f6107c));
        }
    }

    public interface b {
        void a(State state, State state2);
    }

    private static final class c {
        static final TTWiFiCellSwitcher a = new TTWiFiCellSwitcher();
    }

    private void handleWiFiToCellState(int i, int i2) {
        this.mCurrentState = State.convertToState(i2);
        synchronized (this) {
            for (Map.Entry<b, Handler> entry : this.mObservers.entrySet()) {
                b key = entry.getKey();
                Handler value = entry.getValue();
                if (value != null) {
                    value.post(new a(this, key, i, i2));
                }
            }
        }
    }

    public static TTWiFiCellSwitcher inst() {
        return c.a;
    }

    private static void notifyWiFiToCellState(int i, int i2) {
        inst().handleWiFiToCellState(i, i2);
    }

    public State getCurrentState() {
        return this.mCurrentState;
    }

    @Deprecated
    public boolean notifySwitchToMultiNetwork(boolean z) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("enable", z ? PushClient.DEFAULT_REQUEST_ID : "0");
            com.bytedance.feedbackerlib.a.G0(ACTION_NAME, ACTION_PATH_NOTIFY_SWITCH, hashMap, null);
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public void registerObserver(b bVar, Handler handler) {
        Objects.requireNonNull(bVar, "observer == null");
        synchronized (this) {
            if (!this.mObservers.containsKey(bVar)) {
                if (handler == null) {
                    this.mObservers.put(bVar, new Handler(Looper.getMainLooper()));
                } else {
                    this.mObservers.put(bVar, handler);
                }
            }
        }
    }

    public void start() {
        try {
            com.bytedance.feedbackerlib.a.G0(ACTION_NAME, ACTION_PATH_START, null, null);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void stop() {
        try {
            com.bytedance.feedbackerlib.a.G0(ACTION_NAME, ACTION_PATH_STOP, null, null);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Deprecated
    public void triggerSwitchingToCellular() {
        try {
            com.bytedance.feedbackerlib.a.G0(ACTION_NAME, ACTION_PATH_TRIGGER_THIRD_PARTY, null, null);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void triggerSwitchingToNetwork(NetworkType networkType) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("network-type", Integer.toString(networkType.code()));
            com.bytedance.feedbackerlib.a.G0(ACTION_NAME, ACTION_PATH_TRIGGER, hashMap, null);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void unregisterObserver(b bVar) {
        Objects.requireNonNull(bVar, "observer == null");
        synchronized (this) {
            this.mObservers.remove(bVar);
        }
    }
}
