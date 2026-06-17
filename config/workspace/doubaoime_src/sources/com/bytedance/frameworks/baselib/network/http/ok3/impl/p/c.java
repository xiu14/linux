package com.bytedance.frameworks.baselib.network.http.ok3.impl.p;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.frameworks.baselib.network.http.p.l;
import com.bytedance.retrofit2.client.Request;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {
    private static volatile c a;
    private static a b;

    /* renamed from: c, reason: collision with root package name */
    private static final ReentrantReadWriteLock f5200c = new ReentrantReadWriteLock();

    private c() {
    }

    public static c b() {
        if (a == null) {
            synchronized (c.class) {
                if (a == null) {
                    a = new c();
                }
            }
        }
        return a;
    }

    private List<com.bytedance.retrofit2.client.b> c(Request request, d dVar, b bVar) {
        Map<String, String> map;
        ArrayList arrayList = null;
        if (request != null && bVar != null) {
            if (com.bytedance.android.input.k.b.a.Z(dVar.f5202d) && ((map = dVar.f5201c) == null || map.isEmpty())) {
                return null;
            }
            arrayList = request.getHeaders() == null ? new ArrayList() : new ArrayList(request.getHeaders());
            if (!com.bytedance.android.input.k.b.a.Z(arrayList) && !com.bytedance.android.input.k.b.a.Z(dVar.f5202d)) {
                for (String str : dVar.f5202d) {
                    List<com.bytedance.retrofit2.client.b> headers = request.headers(str);
                    if (headers != null) {
                        arrayList.removeAll(headers);
                        if (bVar.f5198d == null) {
                            bVar.f5198d = new HashSet();
                        }
                        bVar.f5198d.add(str);
                    }
                }
            }
            Map<String, String> map2 = dVar.f5201c;
            if (map2 != null && !map2.isEmpty()) {
                for (Map.Entry<String, String> entry : dVar.f5201c.entrySet()) {
                    if (entry != null && !TextUtils.isEmpty(entry.getKey()) && entry.getValue() != null) {
                        arrayList.add(new com.bytedance.retrofit2.client.b(entry.getKey(), entry.getValue()));
                        if (bVar.f5197c == null) {
                            bVar.f5197c = new HashSet();
                        }
                        bVar.f5197c.add(entry.getKey());
                    }
                }
            }
        }
        return arrayList;
    }

    private boolean d(Map<String, List<String>> map, d dVar, b bVar) {
        boolean z = false;
        if (bVar != null) {
            if (!map.isEmpty() && !com.bytedance.android.input.k.b.a.Z(dVar.b)) {
                for (String str : dVar.b) {
                    if (!TextUtils.isEmpty(str) && map.remove(str) != null) {
                        if (bVar.b == null) {
                            bVar.b = new HashSet();
                        }
                        bVar.b.add(str);
                        z = true;
                    }
                }
            }
            Map<String, String> map2 = dVar.a;
            if (map2 != null && !map2.isEmpty()) {
                for (Map.Entry<String, String> entry : dVar.a.entrySet()) {
                    if (entry != null && !TextUtils.isEmpty(entry.getKey()) && entry.getValue() != null) {
                        String key = entry.getKey();
                        List<String> list = map.get(key);
                        if (list == null) {
                            list = new ArrayList<>();
                            map.put(key, list);
                        }
                        list.add(entry.getValue());
                        if (bVar.a == null) {
                            bVar.a = new HashSet();
                        }
                        bVar.a.add(entry.getKey());
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    public static void e(JSONObject jSONObject) {
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = f5200c;
            reentrantReadWriteLock.writeLock().lock();
            a aVar = new a();
            b = aVar;
            if (!aVar.g(jSONObject)) {
                b.h(false);
            }
            List<Pair<com.bytedance.frameworks.baselib.network.c.c.a, d>> c2 = b.c();
            if (c2 == null || c2.isEmpty()) {
                b.h(false);
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            f5200c.writeLock().unlock();
            throw th;
        }
    }

    public String a(String str, Request request, b bVar, List<com.bytedance.retrofit2.client.b> list) {
        a aVar;
        d b2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ReentrantReadWriteLock reentrantReadWriteLock = f5200c;
        reentrantReadWriteLock.readLock().lock();
        Pair<String, String> pair = null;
        boolean z = false;
        try {
            aVar = b;
        } finally {
            try {
            } finally {
            }
        }
        if (aVar != null && aVar.d() && (b2 = b.b(str)) != null) {
            List<com.bytedance.retrofit2.client.b> c2 = c(request, b2, bVar);
            if (!com.bytedance.android.input.k.b.a.Z(c2)) {
                list.addAll(c2);
            }
            try {
                pair = l.d(str, linkedHashMap);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (pair != null) {
                z = d(linkedHashMap, b2, bVar);
            }
            return !z ? str : com.bytedance.frameworks.baselib.network.f.d.c(str, pair, linkedHashMap);
        }
        reentrantReadWriteLock.readLock().unlock();
        return str;
    }
}
