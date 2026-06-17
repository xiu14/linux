package com.bytedance.android.input.keyboard.emoji;

import com.bytedance.android.input.environment.api.IEnvironment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class r implements q {
    private final String a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2726c;

    /* renamed from: d, reason: collision with root package name */
    private final int f2727d;

    public r() {
        StringBuilder sb = new StringBuilder();
        IEnvironment.a aVar = IEnvironment.a;
        Objects.requireNonNull(aVar);
        sb.append(aVar.l());
        sb.append("kaomoji_history.txt");
        this.a = sb.toString();
        this.b = "symbol/kaomoji.txt";
        this.f2726c = "symbol/kaomoji_hot.txt";
        this.f2727d = 4;
    }

    @Override // com.bytedance.android.input.keyboard.emoji.q
    public String a() {
        return this.b;
    }

    @Override // com.bytedance.android.input.keyboard.emoji.q
    public String b() {
        return this.a;
    }

    @Override // com.bytedance.android.input.keyboard.emoji.q
    public String c(i iVar) {
        kotlin.s.c.l.f(iVar, "item");
        return iVar.c() + '\t' + iVar.d();
    }

    @Override // com.bytedance.android.input.keyboard.emoji.q
    public String d() {
        return this.f2726c;
    }

    @Override // com.bytedance.android.input.keyboard.emoji.q
    public i e(String str) {
        kotlin.s.c.l.f(str, "text");
        List J2 = kotlin.text.a.J(str, new String[]{"\t"}, false, 0, 6, null);
        if (J2.isEmpty()) {
            return new i(1, str, 0, 4);
        }
        return J2.size() == 1 ? new i(1, (String) J2.get(0), 0, 4) : new i(Integer.parseInt((String) J2.get(0)), (String) J2.get(1), 0, 4);
    }

    public final void f(h hVar) {
        boolean z;
        kotlin.s.c.l.f(hVar, "group");
        ArrayList arrayList = new ArrayList();
        for (i iVar : hVar.d()) {
            if (arrayList.isEmpty()) {
                arrayList.add(iVar);
            } else {
                Iterator it2 = arrayList.iterator();
                int i = 0;
                int i2 = 0;
                while (it2.hasNext()) {
                    i2 += ((i) it2.next()).c();
                }
                boolean z2 = iVar.c() + i2 >= this.f2727d;
                if (iVar.c() + i2 == this.f2727d) {
                    i2 += iVar.c();
                    arrayList.add(iVar);
                    z = false;
                } else {
                    z = true;
                }
                if (z2) {
                    int i3 = this.f2727d - i2;
                    for (Object obj : arrayList) {
                        int i4 = i + 1;
                        if (i < 0) {
                            kotlin.collections.g.b0();
                            throw null;
                        }
                        i iVar2 = (i) obj;
                        if (i3 <= 1 || i3 >= 3) {
                            if (i != arrayList.size() - 1) {
                                iVar2.e(iVar2.c());
                            } else if (i2 == this.f2727d) {
                                iVar2.e(iVar2.c());
                            } else {
                                iVar2.e((this.f2727d - i2) + iVar2.c());
                            }
                        } else if (arrayList.size() == 1) {
                            iVar2.e(this.f2727d);
                        } else if (i == arrayList.size() - 1 || i == arrayList.size() - 2) {
                            iVar2.e(iVar2.c() + 1);
                        } else {
                            iVar2.e(iVar2.c());
                        }
                        i = i4;
                    }
                    arrayList.clear();
                    if (z) {
                        arrayList.add(iVar);
                    }
                }
                if (!z2) {
                    arrayList.add(iVar);
                }
            }
        }
    }
}
