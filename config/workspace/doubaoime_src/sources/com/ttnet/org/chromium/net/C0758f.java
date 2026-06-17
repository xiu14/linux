package com.ttnet.org.chromium.net;

import java.util.Comparator;

/* renamed from: com.ttnet.org.chromium.net.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0758f implements Comparator<i> {
    C0758f() {
    }

    @Override // java.util.Comparator
    public int compare(i iVar, i iVar2) {
        int signum;
        i iVar3 = iVar;
        i iVar4 = iVar2;
        if ("Fallback-Cronet-Provider".equals(iVar3.c())) {
            return 1;
        }
        if ("Fallback-Cronet-Provider".equals(iVar4.c())) {
            return -1;
        }
        String d2 = iVar3.d();
        String d3 = iVar4.d();
        if (d2 == null || d3 == null) {
            throw new IllegalArgumentException("The input values cannot be null");
        }
        String[] split = d2.split("\\.");
        String[] split2 = d3.split("\\.");
        for (int i = 0; i < split.length && i < split2.length; i++) {
            try {
                int parseInt = Integer.parseInt(split[i]);
                int parseInt2 = Integer.parseInt(split2[i]);
                if (parseInt != parseInt2) {
                    signum = Integer.signum(parseInt - parseInt2);
                    break;
                }
            } catch (NumberFormatException e2) {
                StringBuilder M = e.a.a.a.a.M("Unable to convert version segments into integers: ");
                M.append(split[i]);
                M.append(" & ");
                M.append(split2[i]);
                throw new IllegalArgumentException(M.toString(), e2);
            }
        }
        signum = Integer.signum(split.length - split2.length);
        return -signum;
    }
}
