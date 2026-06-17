package com.huawei.agconnect.core.c;

import com.huawei.b.f;

/* loaded from: classes2.dex */
final class b implements f.a {
    b() {
    }

    @Override // com.huawei.b.f.a
    public String a(com.huawei.b.d dVar) {
        String str;
        if (dVar.c().equals(com.huawei.b.b.f6949c)) {
            str = "/agcgw_all/CN";
        } else if (dVar.c().equals(com.huawei.b.b.f6951e)) {
            str = "/agcgw_all/RU";
        } else if (dVar.c().equals(com.huawei.b.b.f6950d)) {
            str = "/agcgw_all/DE";
        } else {
            if (!dVar.c().equals(com.huawei.b.b.f6952f)) {
                return null;
            }
            str = "/agcgw_all/SG";
        }
        return dVar.a(str);
    }
}
