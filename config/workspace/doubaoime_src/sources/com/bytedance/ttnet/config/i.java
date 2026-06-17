package com.bytedance.ttnet.config;

import com.bytedance.common.utility.Logger;
import com.xiaomi.mipush.sdk.Constants;
import java.net.CookieHandler;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public class i {
    private static volatile i a;

    static void a(i iVar, String str, String str2) {
        Objects.requireNonNull(iVar);
        CookieHandler cookieHandler = CookieHandler.getDefault();
        if (cookieHandler == null) {
            Logger.e("ShareCookieHostsSync", "Default CookieHandler is null.");
            return;
        }
        List<String> c2 = iVar.c(str);
        List<String> c3 = iVar.c(str2);
        ArrayList<String> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((ArrayList) c3).iterator();
        while (it2.hasNext()) {
            String str3 = (String) it2.next();
            if (com.bytedance.ttnet.utils.d.a(str3, c2)) {
                if (Logger.debug()) {
                    e.a.a.a.a.s0("kept hosts add: ", str3, "ShareCookieHostsSync");
                }
                arrayList.add(str3);
            } else {
                if (Logger.debug()) {
                    e.a.a.a.a.s0("added hosts add: ", str3, "ShareCookieHostsSync");
                }
                arrayList2.add(str3);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        if (arrayList.isEmpty()) {
            arrayList = arrayList2;
        }
        Map<String, List<String>> hashMap = new HashMap<>();
        for (String str4 : arrayList) {
            try {
                hashMap = cookieHandler.get(new URI("https://" + str4 + "/"), null);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (hashMap.size() > 0) {
                if (!Logger.debug()) {
                    break;
                }
                Logger.d("ShareCookieHostsSync", "Sync cookie from host: " + str4 + " sync cookies: " + hashMap.toString());
                break;
            }
            continue;
        }
        if (hashMap == null || hashMap.isEmpty()) {
            return;
        }
        List<String> list = hashMap.get("Cookie");
        if ((list == null || list.isEmpty()) && ((list = hashMap.get("cookie")) == null || list.isEmpty())) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList3 = new ArrayList();
        Iterator<String> it3 = list.iterator();
        while (it3.hasNext()) {
            for (String str5 : it3.next().split(";")) {
                if (!com.bytedance.android.input.k.b.a.Y(str5)) {
                    arrayList3.add(str5.trim());
                }
            }
        }
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            String str6 = (String) it4.next();
            ArrayList arrayList4 = new ArrayList();
            try {
                URI uri = new URI("https://" + str6 + "/");
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    String str7 = (String) it5.next();
                    if (!com.bytedance.android.input.k.b.a.Y(str7)) {
                        arrayList4.add(str7 + "; Domain=" + str6);
                    }
                }
                linkedHashMap.put("Set-Cookie", arrayList4);
                cookieHandler.put(uri, linkedHashMap);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public static i b() {
        if (a == null) {
            synchronized (i.class) {
                if (a == null) {
                    a = new i();
                }
            }
        }
        return a;
    }

    private List<String> c(String str) {
        ArrayList arrayList = new ArrayList();
        if (com.bytedance.android.input.k.b.a.Y(str)) {
            return arrayList;
        }
        for (String str2 : str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            if (!com.bytedance.android.input.k.b.a.Y(str2)) {
                arrayList.add(str2.trim());
            }
        }
        return arrayList;
    }
}
