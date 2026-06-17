package com.bytedance.frameworks.baselib.network;

import com.bytedance.common.utility.Logger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TTDelayStateManager {
    private static final String a = "TTDelayStateManager";
    private static volatile AppStartState b = AppStartState.NormalStart;

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f5002c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicLong f5003d = new AtomicLong(0);

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicLong f5004e = new AtomicLong(0);

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicLong f5005f = new AtomicLong(0);

    /* renamed from: g, reason: collision with root package name */
    private static final AtomicLong f5006g = new AtomicLong(0);

    public enum AppStartState {
        NormalStart(-1),
        ColdStart(0),
        HotStart(1),
        WarmStart(2);

        final int state;

        AppStartState(int i) {
            this.state = i;
        }

        public int getValue() {
            return this.state;
        }
    }

    public static AppStartState a() {
        return b;
    }

    public static AppStartState b() {
        if (Logger.debug()) {
            String str = a;
            StringBuilder M = e.a.a.a.a.M("get coldDuration hostDuration warmDuration ");
            M.append(f5004e.get());
            M.append(f5005f.get());
            M.append(f5006g.get());
            Logger.d(str, M.toString());
        }
        int ordinal = b.ordinal();
        if (ordinal == 1) {
            if (d(f5003d.get(), f5004e.get())) {
                b = AppStartState.NormalStart;
            }
            return b;
        }
        if (ordinal == 2) {
            if (d(f5003d.get(), f5005f.get())) {
                b = AppStartState.NormalStart;
            }
            return b;
        }
        if (ordinal != 3) {
            return b;
        }
        if (d(f5003d.get(), f5006g.get())) {
            b = AppStartState.NormalStart;
        }
        return b;
    }

    public static boolean c() {
        return f5002c.get();
    }

    private static boolean d(long j, long j2) {
        return (System.currentTimeMillis() / 1000) - j > j2;
    }

    public static void e(JSONObject jSONObject) {
        f5002c.set(jSONObject.optInt("request_tag_enabled") > 0);
        AtomicLong atomicLong = f5004e;
        atomicLong.set(jSONObject.optInt("cold_start_seconds"));
        AtomicLong atomicLong2 = f5005f;
        atomicLong2.set(jSONObject.optInt("hot_start_seconds"));
        AtomicLong atomicLong3 = f5006g;
        atomicLong3.set(jSONObject.optInt("warm_start_seconds"));
        if (Logger.debug()) {
            String str = a;
            StringBuilder M = e.a.a.a.a.M("set coldDuration hostDuration warmDuration ");
            M.append(atomicLong.get());
            M.append(atomicLong2.get());
            M.append(atomicLong3.get());
            Logger.d(str, M.toString());
        }
    }
}
