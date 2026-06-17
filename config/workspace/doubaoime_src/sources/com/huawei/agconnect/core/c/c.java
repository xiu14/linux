package com.huawei.agconnect.core.c;

import com.huawei.b.f;

/* loaded from: classes2.dex */
final class c implements f.a {
    c() {
    }

    @Override // com.huawei.b.f.a
    public String a(com.huawei.b.d dVar) {
        String str;
        if (dVar.c().equals(com.huawei.b.b.f6949c)) {
            str = "/agcgw_all/CN_back";
        } else if (dVar.c().equals(com.huawei.b.b.f6951e)) {
            str = "/agcgw_all/RU_back";
        } else if (dVar.c().equals(com.huawei.b.b.f6950d)) {
            str = "/agcgw_all/DE_back";
        } else {
            if (!dVar.c().equals(com.huawei.b.b.f6952f)) {
                return null;
            }
            str = "/agcgw_all/SG_back";
        }
        return dVar.a(str);
    }
}
