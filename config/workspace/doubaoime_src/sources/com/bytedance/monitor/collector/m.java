package com.bytedance.monitor.collector;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;

/* loaded from: classes.dex */
public class m {
    public static boolean a = false;

    public static String a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "unknown message";
        }
        try {
            String[] split = str.split(Constants.COLON_SEPARATOR);
            String str3 = split.length == 2 ? split[1] : "";
            if (str.contains("{") && str.contains("}")) {
                str2 = str.split("\\{")[0];
                try {
                    str = str2 + str.split("\\}")[1];
                } catch (Throwable unused) {
                    return str2;
                }
            } else {
                str2 = str;
            }
            if (str.contains("@")) {
                String[] split2 = str.split("@");
                if (split2.length > 1) {
                    str = split2[0];
                }
            }
            if (str.contains("(") && str.contains(")") && !str.endsWith(" null")) {
                String[] split3 = str.split("\\(");
                if (split3.length > 1) {
                    str = split3[1];
                }
                str = str.replace(")", "");
            }
            if (str.startsWith(" ")) {
                str = str.replace(" ", "");
            }
            return str + str3;
        } catch (Throwable unused2) {
            return str;
        }
    }

    public static String b(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return "Invalid Stack\n";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            i++;
            StringBuilder M = e.a.a.a.a.M("\tat ");
            M.append(stackTraceElement.getClassName());
            sb.append(M.toString());
            sb.append(".");
            sb.append(stackTraceElement.getMethodName());
            sb.append("(");
            sb.append(stackTraceElement.getFileName());
            sb.append(Constants.COLON_SEPARATOR);
            sb.append(stackTraceElement.getLineNumber());
            sb.append(")\n");
            if (i > 40) {
                break;
            }
        }
        return sb.toString();
    }
}
