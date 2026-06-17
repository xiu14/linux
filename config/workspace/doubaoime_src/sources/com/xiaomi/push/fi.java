package com.xiaomi.push;

import android.util.Pair;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class fi {
    private static Vector<Pair<String, Long>> a = new Vector<>();

    /* renamed from: a, reason: collision with other field name */
    private static ConcurrentHashMap<String, Long> f427a = new ConcurrentHashMap<>();

    public static String a() {
        StringBuilder sb = new StringBuilder();
        synchronized (a) {
            for (int i = 0; i < a.size(); i++) {
                Pair<String, Long> elementAt = a.elementAt(i);
                sb.append((String) elementAt.first);
                sb.append(Constants.COLON_SEPARATOR);
                sb.append(elementAt.second);
                if (i < a.size() - 1) {
                    sb.append(";");
                }
            }
            a.clear();
        }
        return sb.toString();
    }
}
