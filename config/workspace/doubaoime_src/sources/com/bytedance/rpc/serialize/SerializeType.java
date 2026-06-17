package com.bytedance.rpc.serialize;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public enum SerializeType {
    JSON("application/json; charset=utf-8"),
    PB("application/x-protobuf"),
    THRIFT("application/application/x-thrift"),
    FORM("application/x-www-form-urlencoded; charset=UTF-8");

    private static final String TOKEN = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    private static final Pattern TYPE_SUBTYPE = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    String mContentType;

    SerializeType(String str) {
        this.mContentType = str;
    }

    public static SerializeType parser(String str) {
        if (!e.b.l.q.c.c(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        SerializeType[] values = values();
        for (int i = 0; i < 4; i++) {
            SerializeType serializeType = values[i];
            if (serializeType.getContentType().equals(lowerCase)) {
                return serializeType;
            }
        }
        return null;
    }

    public String getContentType() {
        return this.mContentType;
    }

    public String[] getTypeAndSubType() {
        return getTypeAndSubType(this.mContentType);
    }

    public static String[] getTypeAndSubType(String str) {
        Matcher matcher = TYPE_SUBTYPE.matcher(str);
        if (!matcher.lookingAt()) {
            return e.b.l.q.c.a;
        }
        String group = matcher.group(1);
        Locale locale = Locale.US;
        return new String[]{group.toLowerCase(locale), matcher.group(2).toLowerCase(locale)};
    }
}
