package com.vivo.push.e.a;

import android.text.TextUtils;
import com.vivo.push.restructure.request.a.a.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class b implements com.vivo.push.restructure.request.a.a.b {
    public static final b.a<b> a = new c();
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private List<com.vivo.push.e.b> f8811c;

    /* renamed from: d, reason: collision with root package name */
    private int f8812d;

    public b(String str, List<com.vivo.push.e.b> list, int i) {
        this.f8811c = new ArrayList();
        this.b = str;
        this.f8812d = i;
        this.f8811c = list;
    }

    @Override // com.vivo.push.restructure.request.a.a.b
    public final void a(com.vivo.push.restructure.request.a.a.a aVar) {
        aVar.a(this.b);
        aVar.a(this.f8812d);
        aVar.a(this.f8811c);
    }

    public final List<String> a() {
        ArrayList arrayList = new ArrayList();
        Iterator<com.vivo.push.e.b> it2 = this.f8811c.iterator();
        while (it2.hasNext()) {
            String b = it2.next().b();
            if (!TextUtils.isEmpty(b)) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }

    protected b(com.vivo.push.restructure.request.a.a.a aVar) throws JSONException {
        this.f8811c = new ArrayList();
        this.b = aVar.c();
        this.f8812d = aVar.a();
        aVar.a(com.vivo.push.e.b.a, this.f8811c);
    }
}
