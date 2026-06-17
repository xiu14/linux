package com.xiaomi.push;

import android.net.NetworkInfo;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class ay {
    private final NetworkInfo a;

    /* renamed from: a, reason: collision with other field name */
    private final ConcurrentHashMap<String, Object> f135a = new ConcurrentHashMap<>();

    public ay(NetworkInfo networkInfo) {
        this.a = networkInfo;
    }

    private <T> T a(String str) {
        Object obj;
        if (!this.f135a.containsKey(str)) {
            synchronized (str) {
                if (!this.f135a.contains(str)) {
                    obj = null;
                    switch (str) {
                        case "getType":
                            obj = Integer.valueOf(this.a.getType());
                            break;
                        case "getTypeName":
                            obj = this.a.getTypeName();
                            break;
                        case "getSubtype":
                            obj = Integer.valueOf(this.a.getSubtype());
                            break;
                        case "getSubtypeName":
                            obj = this.a.getSubtypeName();
                            break;
                        case "isConnected":
                            obj = Boolean.valueOf(this.a.isConnected());
                            break;
                        case "getState":
                            obj = this.a.getState();
                            break;
                        case "getDetailedState":
                            obj = this.a.getDetailedState();
                            break;
                    }
                    if (obj != null) {
                        this.f135a.put(str, obj);
                    }
                }
            }
        }
        return (T) this.f135a.get(str);
    }

    public int b() {
        return ((Integer) a("getSubtype")).intValue();
    }

    /* renamed from: b, reason: collision with other method in class */
    public String m124b() {
        return (String) a("getSubtypeName");
    }

    public int a() {
        return ((Integer) a("getType")).intValue();
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m122a() {
        return (String) a("getTypeName");
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m123a() {
        return ((Boolean) a("isConnected")).booleanValue();
    }

    /* renamed from: a, reason: collision with other method in class */
    public NetworkInfo.State m121a() {
        return (NetworkInfo.State) a("getState");
    }

    /* renamed from: a, reason: collision with other method in class */
    public NetworkInfo.DetailedState m120a() {
        return (NetworkInfo.DetailedState) a("getDetailedState");
    }
}
