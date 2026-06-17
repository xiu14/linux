package com.ss.android.c.g.c;

import com.ss.android.c.g.b;

/* loaded from: classes2.dex */
public class a implements b {
    @Override // com.ss.android.c.g.b
    public String a(Object obj) {
        String[] strArr = (String[]) obj;
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        String[] strArr2 = new String[strArr.length];
        int i = 0;
        for (String str : strArr) {
            if (str != null) {
                strArr2[i] = str;
                i++;
            }
        }
        if (i == 0) {
            return "";
        }
        StringBuilder S = e.a.a.a.a.S("╔═══════════════════════════════════════════════════════════════════════════════════════════════════", "\n");
        for (int i2 = 0; i2 < i; i2++) {
            String str2 = strArr2[i2];
            StringBuilder sb = new StringBuilder(str2.length() + 10);
            String[] split = str2.split("\n");
            int length = split.length;
            for (int i3 = 0; i3 < length; i3++) {
                if (i3 != 0) {
                    sb.append("\n");
                }
                String str3 = split[i3];
                sb.append((char) 9553);
                sb.append(str3);
            }
            S.append(sb.toString());
            if (i2 != i - 1) {
                e.a.a.a.a.K0(S, "\n", "╟───────────────────────────────────────────────────────────────────────────────────────────────────", "\n");
            } else {
                S.append("\n");
                S.append("╚═══════════════════════════════════════════════════════════════════════════════════════════════════");
            }
        }
        return S.toString();
    }
}
