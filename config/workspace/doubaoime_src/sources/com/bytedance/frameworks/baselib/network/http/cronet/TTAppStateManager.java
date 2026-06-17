package com.bytedance.frameworks.baselib.network.http.cronet;

/* loaded from: classes.dex */
public class TTAppStateManager {
    private static volatile AppStartState a = AppStartState.NormalStart;

    public enum AppStartState {
        NormalStart(-1),
        ColdStart(0),
        HotStart(1),
        WarmStart(2),
        WeakNet(3),
        Default(4);

        final int state;

        AppStartState(int i) {
            this.state = i;
        }

        public int getValue() {
            return this.state;
        }
    }

    static {
        AppStartState appStartState = AppStartState.Default;
    }

    public static int a() {
        return a.state;
    }
}
