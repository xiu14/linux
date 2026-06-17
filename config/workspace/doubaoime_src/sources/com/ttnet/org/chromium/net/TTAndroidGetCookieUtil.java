package com.ttnet.org.chromium.net;

import com.ttnet.org.chromium.base.annotations.CalledByNative;
import java.net.CookieHandler;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class TTAndroidGetCookieUtil {
    @CalledByNative
    public static String getCookieHeader(String str) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        try {
            CookieHandler cookieHandler = CookieHandler.getDefault();
            Map<String, List<String>> map = cookieHandler != null ? cookieHandler.get(new URI(str), hashMap) : null;
            if (map != null && map.size() > 0) {
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    if ("Cookie".equalsIgnoreCase(entry.getKey()) && !entry.getValue().isEmpty()) {
                        int i = 0;
                        for (String str2 : entry.getValue()) {
                            if (i > 0) {
                                sb.append("; ");
                            }
                            sb.append(str2);
                            i++;
                        }
                    }
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return sb.toString();
        }
    }
}
