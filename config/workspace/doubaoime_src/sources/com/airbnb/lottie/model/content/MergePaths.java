package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.v.b.l;

/* loaded from: classes.dex */
public class MergePaths implements b {
    private final String a;
    private final MergePathsMode b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f1296c;

    public enum MergePathsMode {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static MergePathsMode forId(int i) {
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
        }
    }

    public MergePaths(String str, MergePathsMode mergePathsMode, boolean z) {
        this.a = str;
        this.b = mergePathsMode;
        this.f1296c = z;
    }

    @Override // com.airbnb.lottie.model.content.b
    @Nullable
    public com.airbnb.lottie.v.b.c a(com.airbnb.lottie.i iVar, com.airbnb.lottie.model.layer.b bVar) {
        if (iVar.j()) {
            return new l(this);
        }
        com.airbnb.lottie.y.d.c("Animation contains merge paths but they are disabled.");
        return null;
    }

    public MergePathsMode b() {
        return this.b;
    }

    public boolean c() {
        return this.f1296c;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("MergePaths{mode=");
        M.append(this.b);
        M.append('}');
        return M.toString();
    }
}
