package com.huawei.hms.hatool;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* loaded from: classes2.dex */
public class u {
    private List<b1> a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f7400c;

    /* renamed from: d, reason: collision with root package name */
    private String f7401d;

    public u(List<b1> list, String str, String str2, String str3) {
        this.a = list;
        this.b = str;
        this.f7400c = str2;
        this.f7401d = str3;
    }

    private void a(List<b1> list, String str, String str2) {
        if (list.isEmpty()) {
            return;
        }
        int size = (list.size() / 500) + 1;
        for (int i = 0; i < size; i++) {
            int i2 = i * 500;
            List<b1> subList = list.subList(i2, Math.min(list.size(), i2 + 500));
            String replace = UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
            long currentTimeMillis = System.currentTimeMillis();
            long b = a1.b(str2, str) * com.heytap.mcssdk.constant.a.f6888f;
            ArrayList arrayList = new ArrayList();
            for (b1 b1Var : subList) {
                if (!c0.a(b1Var.b(), currentTimeMillis, b)) {
                    arrayList.add(b1Var);
                }
            }
            if (arrayList.size() > 0) {
                new l0(str2, str, this.f7401d, arrayList, replace).a();
            } else {
                v.e("hmsSdk", "No data to report handler");
            }
        }
    }

    public void a() {
        if (!"_default_config_tag".equals(this.f7400c)) {
            a(this.a, this.f7400c, this.b);
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (b1 b1Var : this.a) {
            String c2 = b1Var.c();
            if (TextUtils.isEmpty(c2) || "oper".equals(c2)) {
                arrayList4.add(b1Var);
            } else if ("maint".equals(c2)) {
                arrayList.add(b1Var);
            } else if ("preins".equals(c2)) {
                arrayList2.add(b1Var);
            } else if ("diffprivacy".equals(c2)) {
                arrayList3.add(b1Var);
            }
        }
        a(arrayList4, "oper", "_default_config_tag");
        a(arrayList, "maint", "_default_config_tag");
        a(arrayList2, "preins", "_default_config_tag");
        a(arrayList3, "diffprivacy", "_default_config_tag");
    }
}
