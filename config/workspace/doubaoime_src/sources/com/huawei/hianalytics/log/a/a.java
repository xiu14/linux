package com.huawei.hianalytics.log.a;

import android.text.TextUtils;
import android.util.Base64;
import com.huawei.hianalytics.util.d;
import com.huawei.hms.framework.common.ContainerUtils;
import java.nio.charset.Charset;
import java.text.MessageFormat;

/* loaded from: classes2.dex */
public final class a {
    public static String a(String str, String str2, String str3) {
        b bVar;
        StringBuffer stringBuffer = new StringBuffer(512);
        if (str.startsWith("https") || str.startsWith("http")) {
            String substring = str.substring(str.indexOf("//") + 2);
            str = substring.substring(substring.indexOf("/"));
        }
        if (str.contains("?")) {
            String substring2 = str.substring(0, str.indexOf(63));
            bVar = str.substring(str.indexOf("?")).length() > 1 ? new b(str.substring(str.indexOf("?") + 1)) : new b(null);
            str = substring2;
        } else {
            bVar = new b(null);
        }
        stringBuffer.append("POST&");
        String a = bVar.a(com.heytap.mcssdk.constant.b.u);
        if (TextUtils.isEmpty(a)) {
            com.huawei.hianalytics.g.b.d("AuthoHeadUtil", "appid is empty！");
            return null;
        }
        stringBuffer.append(str.substring(str.indexOf("/")));
        stringBuffer.append(ContainerUtils.FIELD_DELIMITER);
        stringBuffer.append(bVar.a());
        stringBuffer.append(ContainerUtils.FIELD_DELIMITER);
        stringBuffer.append(str2);
        stringBuffer.append("&appID=");
        stringBuffer.append(a);
        byte[] encode = Base64.encode(d.a(stringBuffer.toString(), str3), 2);
        return MessageFormat.format("HMAC-SHA256 appID={0}, signature=\"{1}\"", a, encode != null ? new String(encode, Charset.forName("UTF-8")) : null);
    }
}
