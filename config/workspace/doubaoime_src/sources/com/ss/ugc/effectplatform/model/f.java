package com.ss.ugc.effectplatform.model;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.ss.ugc.effectplatform.model.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class f {
    private c a;
    private d.a.e.b<String, ModelInfo> b;

    public f(d.a.e.b<String, ModelInfo> bVar) {
        l.g(bVar, RemoteMessageConst.DATA);
        this.b = bVar;
    }

    public final c a() {
        ModelInfo modelInfo;
        String name;
        c cVar = this.a;
        if (cVar != null) {
            return cVar;
        }
        HashMap hashMap = new HashMap();
        Iterator it2 = ((ArrayList) this.b.d()).iterator();
        while (it2.hasNext() && (name = (modelInfo = (ModelInfo) it2.next()).getName()) != null) {
            if (!hashMap.containsKey(name)) {
                hashMap.put(name, modelInfo.getVersion());
            } else if (!l.a((String) hashMap.get(name), modelInfo.getVersion())) {
                throw new RuntimeException(e.a.a.a.a.t("model ", name, " has different versions in ServerTable,Please modify the file to the correct format "));
            }
        }
        c cVar2 = new c();
        d.a.e.b<String, c.a> bVar = new d.a.e.b<>();
        for (String str : this.b.b()) {
            Iterator<ModelInfo> it3 = this.b.a(str).iterator();
            while (it3.hasNext()) {
                bVar.c(str, new c.a(it3.next()));
            }
        }
        cVar2.d(bVar);
        this.a = cVar2;
        return cVar2;
    }
}
