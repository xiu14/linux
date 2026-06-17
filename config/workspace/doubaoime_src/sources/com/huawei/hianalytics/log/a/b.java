package com.huawei.hianalytics.log.a;

import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public class b {
    private SortedMap<String, String> a = new TreeMap();

    public b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (String str2 : str.split(ContainerUtils.FIELD_DELIMITER)) {
            int indexOf = str2.indexOf(ContainerUtils.KEY_VALUE_DELIMITER);
            this.a.put(str2.substring(0, indexOf), str2.substring(indexOf + 1));
        }
    }

    public String a() {
        StringBuilder sb = new StringBuilder(512);
        try {
            for (Map.Entry<String, String> entry : this.a.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key)) {
                    String encode = URLEncoder.encode(key, "UTF-8");
                    if (sb.length() > 0) {
                        sb.append(ContainerUtils.FIELD_DELIMITER);
                    }
                    String value = entry.getValue();
                    String decode = !TextUtils.isEmpty(value) ? URLDecoder.decode(value, "UTF-8") : "";
                    sb.append(encode);
                    sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                    sb.append(decode);
                }
            }
            return sb.toString();
        } catch (UnsupportedEncodingException unused) {
            com.huawei.hianalytics.g.b.c("CanonicalQueryString", "Exception when toString,Encode does not support!");
            return "";
        }
    }

    public String a(String str) {
        String str2 = this.a.get(URLEncoder.encode(str, "UTF-8"));
        return !TextUtils.isEmpty(str2) ? URLDecoder.decode(str2, "UTF-8") : str2;
    }
}
