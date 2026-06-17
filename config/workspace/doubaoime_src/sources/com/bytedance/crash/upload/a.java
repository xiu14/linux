package com.bytedance.crash.upload;

import com.bytedance.crash.CrashType;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class a {
    private static final ConcurrentLinkedQueue<a> a = new ConcurrentLinkedQueue<>();
    private static final LinkedList<C0217a> b = new LinkedList<>();

    /* renamed from: com.bytedance.crash.upload.a$a, reason: collision with other inner class name */
    public static class C0217a {
        public C0217a(JSONObject jSONObject, CrashType crashType) {
            if (crashType == CrashType.LAUNCH) {
                JSONArray jSONArray = (JSONArray) jSONObject.opt(RemoteMessageConst.DATA);
                if (jSONArray != null) {
                    jSONArray.optJSONObject(0);
                } else {
                    new JSONObject();
                }
            }
            jSONObject.optJSONObject("header");
        }
    }

    public static void a() {
        ConcurrentLinkedQueue<a> concurrentLinkedQueue = a;
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        Iterator<a> it2 = concurrentLinkedQueue.iterator();
        while (it2.hasNext()) {
            try {
                Objects.requireNonNull(it2.next());
            } catch (Throwable unused) {
            }
        }
    }

    public static void c(CrashType crashType, JSONObject jSONObject) {
        C0217a c0217a = new C0217a(jSONObject, crashType);
        b.add(c0217a);
        ConcurrentLinkedQueue<a> concurrentLinkedQueue = a;
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        Iterator<a> it2 = concurrentLinkedQueue.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().b(crashType, c0217a);
            } catch (Throwable unused) {
            }
        }
    }

    public abstract void b(CrashType crashType, C0217a c0217a);
}
