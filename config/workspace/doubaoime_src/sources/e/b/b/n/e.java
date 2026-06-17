package e.b.b.n;

import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/* loaded from: classes.dex */
public class e {
    public static String a(String str, Map<String, String> map) {
        if (!TextUtils.isDigitsOnly(str) && map != null && !map.isEmpty()) {
            if (str.indexOf("?") < 0) {
                str = e.a.a.a.a.s(str, "?");
            }
            if (str.endsWith("?")) {
                StringBuilder M = e.a.a.a.a.M(str);
                M.append(b("sdk_version", "UTF-8"));
                M.append(ContainerUtils.KEY_VALUE_DELIMITER);
                M.append(b(String.valueOf(1), "UTF-8"));
                str = M.toString();
            } else {
                StringBuilder S = e.a.a.a.a.S(str, ContainerUtils.FIELD_DELIMITER);
                S.append(b("sdk_version", "UTF-8"));
                S.append(ContainerUtils.KEY_VALUE_DELIMITER);
                S.append(b(String.valueOf(1), "UTF-8"));
                str = S.toString();
            }
            if (map.size() > 0) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (map.get(entry.getKey()) != null) {
                        if (str.endsWith("?")) {
                            StringBuilder M2 = e.a.a.a.a.M(str);
                            M2.append(b(entry.getKey().toString(), "UTF-8"));
                            M2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                            M2.append(b(map.get(entry.getKey()).toString(), "UTF-8"));
                            str = M2.toString();
                        } else {
                            StringBuilder S2 = e.a.a.a.a.S(str, ContainerUtils.FIELD_DELIMITER);
                            S2.append(b(entry.getKey().toString(), "UTF-8"));
                            S2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                            S2.append(b(map.get(entry.getKey()).toString(), "UTF-8"));
                            str = S2.toString();
                        }
                    }
                }
            }
        }
        return str;
    }

    private static String b(String str, String str2) {
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
