package com.bytedance.frameworks.baselib.network.http.p;

import com.huawei.hms.framework.common.ContainerUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class k {
    private final Map<String, List<String>> a = new LinkedHashMap();
    private String b;

    public k(String str) {
        this.b = str;
    }

    public void a(String str, int i) {
        List<String> list = this.a.get(str);
        if (list == null) {
            list = new LinkedList<>();
        }
        list.add(String.valueOf(i));
        this.a.put(str, list);
    }

    public void b(String str, String str2) {
        List<String> list = this.a.get(str);
        if (list == null) {
            list = new LinkedList<>();
        }
        list.add(String.valueOf(str2));
        this.a.put(str, list);
    }

    public String c() {
        String encode;
        if (this.a.isEmpty()) {
            return this.b;
        }
        Map<String, List<String>> map = this.a;
        Pattern pattern = l.a;
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            try {
                String encode2 = URLEncoder.encode(entry.getKey(), "UTF-8");
                List<String> value = entry.getValue();
                if (value != null && value.size() > 0) {
                    for (String str : value) {
                        if (str != null) {
                            try {
                                encode = URLEncoder.encode(str, "UTF-8");
                            } catch (UnsupportedEncodingException e2) {
                                throw new IllegalArgumentException(e2);
                            }
                        } else {
                            encode = "";
                        }
                        if (sb.length() > 0) {
                            sb.append(ContainerUtils.FIELD_DELIMITER);
                        }
                        sb.append(encode2);
                        if (!encode.isEmpty()) {
                            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                            sb.append(encode);
                        }
                    }
                }
            } catch (UnsupportedEncodingException e3) {
                throw new IllegalArgumentException(e3);
            }
        }
        String sb2 = sb.toString();
        String str2 = this.b;
        return (str2 == null || str2.length() == 0) ? sb2 : this.b.indexOf(63) >= 0 ? e.a.a.a.a.K(new StringBuilder(), this.b, ContainerUtils.FIELD_DELIMITER, sb2) : e.a.a.a.a.K(new StringBuilder(), this.b, "?", sb2);
    }

    public String toString() {
        return c();
    }
}
