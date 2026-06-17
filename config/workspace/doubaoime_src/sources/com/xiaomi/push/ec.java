package com.xiaomi.push;

import android.content.Context;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.xiaomi.mipush.sdk.Constants;

/* loaded from: classes2.dex */
public class ec extends eb {
    public ec(Context context, int i) {
        super(context, i);
    }

    @Override // com.xiaomi.push.eb
    public hw a() {
        return hw.Storage;
    }

    @Override // com.xiaomi.push.ah.a
    /* renamed from: a */
    public String mo139a() {
        return "23";
    }

    @Override // com.xiaomi.push.eb
    public String b() {
        StringBuilder M = e.a.a.a.a.M("ram:");
        M.append(j.m613a());
        M.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        M.append("rom:");
        M.append(j.m618b());
        M.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        M.append("ramOriginal:");
        M.append(j.c());
        M.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        M.append("romOriginal:");
        M.append(j.d());
        return M.toString();
    }
}
