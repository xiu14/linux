package e.b.f.a.a;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.bytedance.crash.general.HardwareInfo;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class a {
    private static InterfaceC0430a a;

    /* renamed from: e.b.f.a.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC0430a {
        boolean a();

        boolean b();

        boolean g();
    }

    private static Uri a(String str, String str2, int i, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            if (str != null) {
                sb.append(str);
                sb.append("://");
            }
            sb.append(str2);
            if (i > 0) {
                sb.append(':');
                sb.append(i);
            }
        }
        if (str3 == null || !str3.startsWith("/")) {
            sb.append('/');
        }
        if (str3 != null) {
            sb.append(str3);
        }
        if (str4 != null) {
            sb.append('?');
            sb.append(str4);
        }
        if (str5 != null) {
            sb.append('#');
            sb.append(str5);
        }
        return Uri.parse(sb.toString());
    }

    private static String b(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    private static String c(List<Pair<String, List<String>>> list, boolean z, String str) {
        StringBuilder sb = new StringBuilder();
        for (Pair<String, List<String>> pair : list) {
            String str2 = (String) pair.first;
            if (z) {
                str2 = b(str2, str);
            }
            List<String> list2 = (List) pair.second;
            if (list2 != null && list2.size() > 0) {
                for (String str3 : list2) {
                    if (z) {
                        str3 = str3 != null ? b(str3, str) : "";
                    }
                    if (sb.length() > 0) {
                        sb.append(ContainerUtils.FIELD_DELIMITER);
                    }
                    e.a.a.a.a.K0(sb, str2, ContainerUtils.KEY_VALUE_DELIMITER, str3);
                }
            }
        }
        return sb.toString();
    }

    public static void d(Uri uri, Map<String, List<String>> map) throws IOException {
        if (uri == null) {
            throw new IOException("parseUrl url is null !!!");
        }
        try {
            String encodedQuery = uri.getEncodedQuery();
            if (encodedQuery != null) {
                for (String str : encodedQuery.split(ContainerUtils.FIELD_DELIMITER)) {
                    int indexOf = str.indexOf(ContainerUtils.KEY_VALUE_DELIMITER);
                    if (indexOf >= 0) {
                        String decode = URLDecoder.decode(str.substring(0, indexOf), "UTF-8");
                        List<String> list = map.get(decode);
                        if (list == null) {
                            list = new LinkedList<>();
                        }
                        list.add(URLDecoder.decode(str.substring(indexOf + 1), "UTF-8"));
                        map.put(decode, list);
                    } else {
                        String decode2 = URLDecoder.decode(str, "UTF-8");
                        List<String> list2 = map.get(decode2);
                        if (list2 == null) {
                            list2 = new LinkedList<>();
                        }
                        list2.add("");
                        map.put(decode2, list2);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
            throw new IOException("parseUrl url is null !!!");
        }
    }

    public static void e(InterfaceC0430a interfaceC0430a) {
        a = interfaceC0430a;
    }

    private static boolean f(Map<String, List<String>> map, List<Pair<String, List<String>>> list, String str) throws UnsupportedEncodingException {
        if (TextUtils.isEmpty(str) || !map.containsKey(str)) {
            return false;
        }
        list.add(new Pair<>(str, map.get(str)));
        if (a.b()) {
            return true;
        }
        map.remove(str);
        return true;
    }

    public static String g(String str, List<Pair<String, String>> list) {
        if (TextUtils.isEmpty(str) || a == null) {
            return str;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Uri parse = Uri.parse(str);
            d(parse, linkedHashMap);
            LinkedList linkedList = new LinkedList();
            f(linkedHashMap, linkedList, "device_id");
            f(linkedHashMap, linkedList, "device_type");
            f(linkedHashMap, linkedList, HardwareInfo.KEY_HW_VENDOR_BRAND);
            f(linkedHashMap, linkedList, "uuid");
            f(linkedHashMap, linkedList, "openudid");
            String c2 = c(linkedList, false, "UTF-8");
            if (TextUtils.isEmpty(c2)) {
                return str;
            }
            byte[] bytes = c2.getBytes();
            byte[] a2 = EncryptorUtil.a(bytes, bytes.length);
            if (a2 == null) {
                return str;
            }
            String encodeToString = Base64.encodeToString(a2, 2);
            LinkedList linkedList2 = new LinkedList();
            if (a.g()) {
                LinkedList linkedList3 = new LinkedList();
                linkedList3.add(encodeToString);
                linkedList2.add(new Pair("ss_queries", linkedList3));
            }
            if (a.a() && list != null) {
                list.add(new Pair<>("X-SS-QUERIES", b(encodeToString, "UTF-8")));
            }
            if (!linkedHashMap.isEmpty()) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (entry != null) {
                        linkedList2.add(new Pair(entry.getKey(), entry.getValue()));
                    }
                }
            }
            return a(parse.getScheme(), parse.getHost(), parse.getPort(), parse.getPath(), c(linkedList2, true, "UTF-8"), parse.getFragment()).toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return str;
        }
    }
}
