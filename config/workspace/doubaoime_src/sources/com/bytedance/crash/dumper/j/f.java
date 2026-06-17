package com.bytedance.crash.dumper.j;

/* loaded from: classes.dex */
public class f extends i {
    public f(String str) {
        super(str);
    }

    public f i(String str) {
        a('\"');
        d(str);
        a('\"');
        a(':');
        a(' ');
        return this;
    }

    public f j(String str) {
        a('\"');
        int length = str == null ? 0 : str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\f') {
                d("\\f");
            } else if (charAt == '\r') {
                d("\\r");
            } else if (charAt == '\"' || charAt == '\\') {
                a('\\');
                a(charAt);
            } else if (charAt != 8232 && charAt != 8233) {
                switch (charAt) {
                    case '\b':
                        d("\\b");
                        break;
                    case '\t':
                        d("\\t");
                        break;
                    case '\n':
                        d("\\n");
                        break;
                    default:
                        if (charAt <= 31) {
                            d(String.format("\\u%04x", Integer.valueOf(charAt)));
                            break;
                        } else {
                            a(charAt);
                            break;
                        }
                }
            } else {
                d(String.format("\\u%04x", Integer.valueOf(charAt)));
            }
        }
        a('\"');
        return this;
    }
}
