package com.bytedance.lighten.core.k;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class a {
    private List<String> a = new ArrayList();

    public a(List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                this.a.add(str);
            }
        }
    }

    public List<String> a() {
        return this.a;
    }

    public boolean b() {
        List<String> list = this.a;
        return list == null || list.isEmpty();
    }
}
