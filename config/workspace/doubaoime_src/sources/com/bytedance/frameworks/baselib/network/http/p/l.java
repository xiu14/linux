package com.bytedance.frameworks.baselib.network.http.p;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class l {
    public static final Pattern a = Pattern.compile("(((?:(?i:http|https|rtsp|ws|wss)://(?:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,64}(?:\\:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,25})?\\@)?)?(?:(([a-zA-Z0-9[ -\ud7ff豈-\ufdcfﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]](?:[a-zA-Z0-9[ -\ud7ff豈-\ufdcfﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]_\\-]{0,61}[a-zA-Z0-9[ -\ud7ff豈-\ufdcfﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]]){0,1}\\.)+(xn\\-\\-[\\w\\-]{0,58}\\w|[a-zA-Z[ -\ud7ff豈-\ufdcfﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]]{2,63})|((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9]))))(?:\\:\\d{1,5})?)([/\\?](?:(?:[a-zA-Z0-9[ -\ud7ff豈-\ufdcfﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]];/\\?:@&=#~\\-\\.\\+!\\*'\\(\\),_\\$])|(?:%[a-fA-F0-9]{2}))*)?(?:\\b|$|^))");

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!(str != null && str.length() > 7 && str.substring(0, 8).equalsIgnoreCase("https://"))) {
            if (!(str != null && str.length() > 6 && str.substring(0, 7).equalsIgnoreCase("http://"))) {
                if (!(str != null && str.length() > 5 && str.substring(0, 6).equalsIgnoreCase("wss://"))) {
                    if (!(str != null && str.length() > 4 && str.substring(0, 5).equalsIgnoreCase("ws://"))) {
                        return false;
                    }
                }
            }
        }
        try {
            return a.matcher(str).matches();
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static boolean b(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        int length = str.length();
        int length2 = str2.length();
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        int i4 = -1;
        while (i < length) {
            if (i2 < length2 && (str2.charAt(i2) == '?' || str2.charAt(i2) == str.charAt(i))) {
                i++;
                i2++;
            } else if (i2 < length2 && str2.charAt(i2) == '*') {
                i4 = i;
                i3 = i2;
                i2++;
            } else {
                if (i3 == -1) {
                    return false;
                }
                i2 = i3 + 1;
                i4++;
                i = i4;
            }
        }
        while (i2 < length2) {
            if (str2.charAt(i2) != '*') {
                return false;
            }
            i2++;
        }
        return true;
    }

    @Deprecated
    public static Pair<String, String> c(String str, Map<String, String> map) throws IOException {
        String encodedQuery;
        if (com.bytedance.android.input.k.b.a.Y(str)) {
            throw new IOException("parseUrl url is null !!!");
        }
        try {
            Uri parse = Uri.parse(str);
            StringBuilder sb = new StringBuilder();
            String scheme = parse.getScheme();
            String host = parse.getHost();
            int port = parse.getPort();
            if (host != null) {
                if (scheme != null) {
                    sb.append(scheme);
                    sb.append("://");
                }
                sb.append(host);
                if (port > 0) {
                    sb.append(':');
                    sb.append(port);
                }
            }
            String sb2 = sb.toString();
            String encodedPath = parse.getEncodedPath();
            if (map != null && (encodedQuery = parse.getEncodedQuery()) != null) {
                for (String str2 : encodedQuery.split(ContainerUtils.FIELD_DELIMITER)) {
                    int indexOf = str2.indexOf(ContainerUtils.KEY_VALUE_DELIMITER);
                    if (indexOf >= 0) {
                        map.put(URLDecoder.decode(str2.substring(0, indexOf), "UTF-8"), URLDecoder.decode(str2.substring(indexOf + 1), "UTF-8"));
                    } else {
                        map.put(URLDecoder.decode(str2, "UTF-8"), "");
                    }
                }
            }
            return new Pair<>(sb2, encodedPath);
        } catch (Throwable th) {
            th.printStackTrace();
            throw new IOException("parseUrl url is fail !!!");
        }
    }

    public static Pair<String, String> d(String str, Map<String, List<String>> map) throws IOException {
        if (com.bytedance.android.input.k.b.a.Y(str)) {
            throw new IOException("parseUrl url is null !!!");
        }
        try {
            Uri parse = Uri.parse(str);
            StringBuilder sb = new StringBuilder();
            String scheme = parse.getScheme();
            String host = parse.getHost();
            int port = parse.getPort();
            if (host != null) {
                if (scheme != null) {
                    sb.append(scheme);
                    sb.append("://");
                }
                sb.append(host);
                if (port > 0) {
                    sb.append(':');
                    sb.append(port);
                }
            }
            String sb2 = sb.toString();
            String encodedPath = parse.getEncodedPath();
            String encodedQuery = parse.getEncodedQuery();
            if (encodedQuery != null) {
                for (String str2 : encodedQuery.split(ContainerUtils.FIELD_DELIMITER)) {
                    int indexOf = str2.indexOf(ContainerUtils.KEY_VALUE_DELIMITER);
                    if (indexOf >= 0) {
                        String decode = URLDecoder.decode(str2.substring(0, indexOf), "UTF-8");
                        List<String> list = map.get(decode);
                        if (list == null) {
                            list = new LinkedList<>();
                        }
                        list.add(URLDecoder.decode(str2.substring(indexOf + 1), "UTF-8"));
                        map.put(decode, list);
                    } else {
                        String decode2 = URLDecoder.decode(str2, "UTF-8");
                        List<String> list2 = map.get(decode2);
                        if (list2 == null) {
                            list2 = new LinkedList<>();
                        }
                        list2.add("");
                        map.put(decode2, list2);
                    }
                }
            }
            return new Pair<>(sb2, encodedPath);
        } catch (Throwable th) {
            th.printStackTrace();
            throw new IOException("parseUrl url is fail !!!");
        }
    }

    public static URI e(String str) throws RuntimeException {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            try {
                return new URI(str);
            } catch (URISyntaxException unused) {
                return URI.create(str.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            }
        } catch (Exception unused2) {
            if (str.isEmpty()) {
                return null;
            }
            try {
                int indexOf = str.indexOf("?");
                if (indexOf > 0) {
                    str = str.substring(0, indexOf);
                }
                return URI.create(str);
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }
}
