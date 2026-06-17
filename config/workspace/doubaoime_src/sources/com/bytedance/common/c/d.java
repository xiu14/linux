package com.bytedance.common.c;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Locale;

/* loaded from: classes.dex */
public class d {
    private Hashtable a = new Hashtable();

    public d() {
    }

    private static boolean b(char c2) {
        return c2 > ' ' && c2 < 127 && "()<>@,;:/[]?=\\\"".indexOf(c2) < 0;
    }

    private static int c(String str, int i) {
        int length = str.length();
        while (i < length && Character.isWhitespace(str.charAt(i))) {
            i++;
        }
        return i;
    }

    public String a(String str) {
        return (String) this.a.get(str.trim().toLowerCase(Locale.ENGLISH));
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.ensureCapacity(this.a.size() * 16);
        Enumeration keys = this.a.keys();
        while (keys.hasMoreElements()) {
            String str = (String) keys.nextElement();
            stringBuffer.append("; ");
            stringBuffer.append(str);
            stringBuffer.append('=');
            String str2 = (String) this.a.get(str);
            int length = str2.length();
            boolean z = false;
            for (int i = 0; i < length && !z; i++) {
                z = !b(str2.charAt(i));
            }
            if (z) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.ensureCapacity((int) (length * 1.5d));
                stringBuffer2.append('\"');
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt = str2.charAt(i2);
                    if (charAt == '\\' || charAt == '\"') {
                        stringBuffer2.append('\\');
                    }
                    stringBuffer2.append(charAt);
                }
                stringBuffer2.append('\"');
                str2 = stringBuffer2.toString();
            }
            stringBuffer.append(str2);
        }
        return stringBuffer.toString();
    }

    public d(String str) throws e {
        int length;
        int i;
        String substring;
        if (str != null && (length = str.length()) > 0) {
            int c2 = c(str, 0);
            while (c2 < length && str.charAt(c2) == ';') {
                int c3 = c(str, c2 + 1);
                if (c3 >= length) {
                    return;
                }
                int i2 = c3;
                while (i2 < length && b(str.charAt(i2))) {
                    i2++;
                }
                String lowerCase = str.substring(c3, i2).toLowerCase(Locale.ENGLISH);
                int c4 = c(str, i2);
                if (c4 < length && str.charAt(c4) == '=') {
                    int c5 = c(str, c4 + 1);
                    if (c5 < length) {
                        char charAt = str.charAt(c5);
                        if (charAt == '\"') {
                            int i3 = c5 + 1;
                            if (i3 >= length) {
                                throw new e("Encountered unterminated quoted parameter value.");
                            }
                            int i4 = i3;
                            while (i4 < length && (charAt = str.charAt(i4)) != '\"') {
                                if (charAt == '\\') {
                                    i4++;
                                }
                                i4++;
                            }
                            if (charAt == '\"') {
                                String substring2 = str.substring(i3, i4);
                                int length2 = substring2.length();
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.ensureCapacity(length2);
                                boolean z = false;
                                for (int i5 = 0; i5 < length2; i5++) {
                                    char charAt2 = substring2.charAt(i5);
                                    if (!z && charAt2 != '\\') {
                                        stringBuffer.append(charAt2);
                                    } else if (z) {
                                        stringBuffer.append(charAt2);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                }
                                substring = stringBuffer.toString();
                                i = i4 + 1;
                            } else {
                                throw new e("Encountered unterminated quoted parameter value.");
                            }
                        } else if (b(charAt)) {
                            i = c5;
                            while (i < length && b(str.charAt(i))) {
                                i++;
                            }
                            substring = str.substring(c5, i);
                        } else {
                            throw new e(e.a.a.a.a.j("Unexpected character encountered at index ", c5));
                        }
                        this.a.put(lowerCase, substring);
                        c2 = c(str, i);
                    } else {
                        throw new e(e.a.a.a.a.s("Couldn't find a value for parameter named ", lowerCase));
                    }
                } else {
                    throw new e("Couldn't find the '=' that separates a parameter name from its value.");
                }
            }
            if (c2 < length) {
                throw new e("More characters encountered in input than expected.");
            }
        }
    }
}
