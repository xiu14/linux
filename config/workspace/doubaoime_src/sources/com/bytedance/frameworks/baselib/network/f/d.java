package com.bytedance.frameworks.baselib.network.f;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.bytedance.frameworks.baselib.network.f.c;
import com.bytedance.frameworks.baselib.network.http.p.k;
import com.bytedance.frameworks.baselib.network.http.p.l;
import com.bytedance.retrofit2.A;
import com.bytedance.retrofit2.client.Request;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {
    private static final String a = "d";
    private static final AtomicBoolean b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private static final List<Pair<String, b>> f5072c = new CopyOnWriteArrayList();

    public static Request a(Request request, com.bytedance.frameworks.baselib.network.http.b bVar) {
        if (!b.get()) {
            List<Pair<String, b>> list = f5072c;
            if (!list.isEmpty()) {
                bVar.f5083d.F0.b.c();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Iterator<Pair<String, b>> it2 = list.iterator();
                Request.a aVar = null;
                Pair<String, String> pair = null;
                c cVar = null;
                while (true) {
                    boolean z = false;
                    boolean z2 = true;
                    if (!it2.hasNext()) {
                        if (!hashSet.isEmpty()) {
                            ArrayList arrayList = request.getHeaders() != null ? new ArrayList(request.getHeaders()) : new ArrayList();
                            arrayList.removeAll(hashSet);
                            aVar = request.newBuilder();
                            aVar.b(arrayList);
                        }
                        if (pair != null) {
                            if (!hashSet2.isEmpty()) {
                                Iterator it3 = hashSet2.iterator();
                                while (it3.hasNext()) {
                                    String str = (String) it3.next();
                                    if (!TextUtils.isEmpty(str)) {
                                        linkedHashMap.remove(str);
                                    }
                                }
                                z = true;
                            }
                            if (linkedHashMap2.isEmpty()) {
                                z2 = z;
                            } else {
                                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                                    if (entry != null) {
                                        List list2 = (List) linkedHashMap.get(entry.getKey());
                                        if (list2 == null) {
                                            list2 = new ArrayList();
                                            linkedHashMap.put((String) entry.getKey(), list2);
                                        }
                                        list2.addAll((Collection) entry.getValue());
                                    }
                                }
                            }
                            if (z2) {
                                String c2 = c(request.getUrl(), pair, linkedHashMap);
                                if (!TextUtils.isEmpty(c2) && !c2.equals(request.getUrl())) {
                                    if (aVar == null) {
                                        aVar = request.newBuilder();
                                    }
                                    aVar.g(c2);
                                }
                            }
                        }
                        Request a2 = aVar != null ? aVar.a() : request;
                        if (cVar != null) {
                            bVar.f5083d.F0.f5889e.f5915g = cVar.b();
                        }
                        A.a aVar2 = bVar.f5083d.F0.b;
                        aVar2.h = aVar2.a();
                        return a2;
                    }
                    Pair<String, b> next = it2.next();
                    if (next != null) {
                        String str2 = (String) next.first;
                        b bVar2 = (b) next.second;
                        if (bVar2 != null && !TextUtils.isEmpty(str2)) {
                            try {
                                if (bVar2.a(new a(request.getUrl(), request.getHeaders())) == null) {
                                    continue;
                                } else {
                                    c.a aVar3 = new c.a(str2);
                                    if (!com.bytedance.android.input.k.b.a.Z(request.getHeaders())) {
                                        throw null;
                                    }
                                    if (!com.bytedance.android.input.k.b.a.Z(null)) {
                                        if (pair == null) {
                                            try {
                                                pair = l.d(request.getUrl(), linkedHashMap);
                                            } catch (Throwable unused) {
                                            }
                                        }
                                        if (pair != null) {
                                            if (linkedHashMap.isEmpty()) {
                                                throw null;
                                            }
                                            throw null;
                                        }
                                    }
                                    if (com.bytedance.android.input.k.b.a.Z(null) && com.bytedance.android.input.k.b.a.Z(null) && com.bytedance.android.input.k.b.a.Z(null)) {
                                        z = true;
                                    }
                                    if (!z) {
                                        if (cVar == null) {
                                            cVar = new c();
                                        }
                                        cVar.a(aVar3);
                                    }
                                }
                            } catch (Throwable th) {
                                Log.e(a, "onCallToRequestAudit failed, callbackIdentify:" + str2, th);
                            }
                        }
                    }
                }
            }
        }
        return request;
    }

    public static void b(JSONObject jSONObject) {
        try {
            AtomicBoolean atomicBoolean = b;
            atomicBoolean.set(false);
            atomicBoolean.set(jSONObject.optInt("req_audit_disabled", 0) > 0);
        } catch (Throwable unused) {
        }
    }

    public static String c(String str, Pair<String, String> pair, Map<String, List<String>> map) {
        List<String> value;
        if (pair == null) {
            return str;
        }
        try {
            k kVar = new k(((String) pair.first) + ((String) pair.second));
            if (!map.isEmpty()) {
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    if (entry != null && !TextUtils.isEmpty(entry.getKey()) && (value = entry.getValue()) != null && !value.isEmpty()) {
                        Iterator<String> it2 = value.iterator();
                        while (it2.hasNext()) {
                            kVar.b(entry.getKey(), it2.next());
                        }
                    }
                }
            }
            String c2 = kVar.c();
            String encodedFragment = Uri.parse(str).getEncodedFragment();
            if (TextUtils.isEmpty(encodedFragment)) {
                return c2;
            }
            return c2 + "#" + encodedFragment;
        } catch (Throwable unused) {
            return str;
        }
    }
}
