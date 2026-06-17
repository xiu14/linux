package com.alibaba.fastjson;

/* loaded from: classes.dex */
public enum PropertyNamingStrategy {
    CamelCase,
    PascalCase,
    SnakeCase,
    KebabCase;

    public String translate(String str) {
        int ordinal = ordinal();
        int i = 0;
        if (ordinal == 0) {
            char charAt = str.charAt(0);
            if (charAt < 'A' || charAt > 'Z') {
                return str;
            }
            char[] charArray = str.toCharArray();
            charArray[0] = (char) (charArray[0] + ' ');
            return new String(charArray);
        }
        if (ordinal == 1) {
            char charAt2 = str.charAt(0);
            if (charAt2 < 'a' || charAt2 > 'z') {
                return str;
            }
            char[] charArray2 = str.toCharArray();
            charArray2[0] = (char) (charArray2[0] - ' ');
            return new String(charArray2);
        }
        if (ordinal == 2) {
            StringBuilder sb = new StringBuilder();
            while (i < str.length()) {
                char charAt3 = str.charAt(i);
                if (charAt3 < 'A' || charAt3 > 'Z') {
                    sb.append(charAt3);
                } else {
                    char c2 = (char) (charAt3 + ' ');
                    if (i > 0) {
                        sb.append('_');
                    }
                    sb.append(c2);
                }
                i++;
            }
            return sb.toString();
        }
        if (ordinal != 3) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        while (i < str.length()) {
            char charAt4 = str.charAt(i);
            if (charAt4 < 'A' || charAt4 > 'Z') {
                sb2.append(charAt4);
            } else {
                char c3 = (char) (charAt4 + ' ');
                if (i > 0) {
                    sb2.append('-');
                }
                sb2.append(c3);
            }
            i++;
        }
        return sb2.toString();
    }
}
