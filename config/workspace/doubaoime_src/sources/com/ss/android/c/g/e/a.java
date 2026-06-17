package com.ss.android.c.g.e;

import com.ss.android.c.g.b;

/* loaded from: classes2.dex */
public class a implements b {
    @Override // com.ss.android.c.g.b
    public String a(Object obj) {
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) obj;
        StringBuilder sb = new StringBuilder(256);
        if (stackTraceElementArr == null || stackTraceElementArr.length == 0) {
            return null;
        }
        if (stackTraceElementArr.length == 1) {
            StringBuilder M = e.a.a.a.a.M("\t─ ");
            M.append(stackTraceElementArr[0].toString());
            return M.toString();
        }
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                sb.append("\n");
            }
            if (i != length - 1) {
                sb.append("\t├ ");
                sb.append(stackTraceElementArr[i].toString());
                sb.append("\n");
            } else {
                sb.append("\t└ ");
                sb.append(stackTraceElementArr[i].toString());
            }
        }
        return sb.toString();
    }
}
