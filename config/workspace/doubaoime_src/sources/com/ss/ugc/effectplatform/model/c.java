package com.ss.ugc.effectplatform.model;

import com.ss.android.message.log.PushLog;
import com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class c {
    private d.a.e.b<String, a> a = new d.a.e.b<>();
    private d.a.a.b<String, ModelInfo> b = new d.a.a.b<>(false, 1);

    public static final class a {
        private ModelInfo a;

        public a(ModelInfo modelInfo) {
            l.g(modelInfo, "modelInfo");
            this.a = modelInfo;
        }

        public final ModelInfo a() {
            return this.a;
        }

        public final String b() {
            return this.a.getName();
        }

        public final ExtendedUrlModel c() {
            return this.a.getFile_url();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                return l.a(this.a, ((a) obj).a);
            }
            throw new kotlin.l("null cannot be cast to non-null type com.ss.ugc.effectplatform.model.LoadedModelList.ModelInfoState");
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public final ExtendedUrlModel a(String str) {
        l.g(str, "modelName");
        Iterator it2 = ((ArrayList) this.a.d()).iterator();
        while (it2.hasNext()) {
            a aVar = (a) it2.next();
            if (l.a(aVar.b(), str)) {
                return aVar.c();
            }
        }
        throw new IllegalArgumentException(e.a.a.a.a.t("modelName ", str, " doesn't exist"));
    }

    public final Map<String, ModelInfo> b() {
        if (this.b.isEmpty()) {
            for (a aVar : this.a.d()) {
                this.b.put(aVar.a().getName(), aVar.a());
            }
        }
        return this.b;
    }

    public final d.a.e.b<String, a> c() {
        return this.a;
    }

    public final void d(d.a.e.b<String, a> bVar) {
        l.g(bVar, PushLog.KEY_VALUE);
        this.a = bVar;
        this.b.clear();
        Iterator it2 = ((ArrayList) bVar.d()).iterator();
        while (it2.hasNext()) {
            a aVar = (a) it2.next();
            this.b.put(aVar.a().getName(), aVar.a());
        }
    }
}
