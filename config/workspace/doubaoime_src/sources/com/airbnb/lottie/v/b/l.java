package com.airbnb.lottie.v.b;

import android.annotation.TargetApi;
import android.graphics.Path;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@TargetApi(19)
/* loaded from: classes.dex */
public class l implements m, j {
    private final Path a = new Path();
    private final Path b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final Path f1397c = new Path();

    /* renamed from: d, reason: collision with root package name */
    private final List<m> f1398d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final MergePaths f1399e;

    public l(MergePaths mergePaths) {
        this.f1399e = mergePaths;
    }

    @TargetApi(19)
    private void a(Path.Op op) {
        this.b.reset();
        this.a.reset();
        for (int size = this.f1398d.size() - 1; size >= 1; size--) {
            m mVar = this.f1398d.get(size);
            if (mVar instanceof d) {
                d dVar = (d) mVar;
                List<m> e2 = dVar.e();
                for (int size2 = e2.size() - 1; size2 >= 0; size2--) {
                    Path path = e2.get(size2).getPath();
                    path.transform(dVar.h());
                    this.b.addPath(path);
                }
            } else {
                this.b.addPath(mVar.getPath());
            }
        }
        m mVar2 = this.f1398d.get(0);
        if (mVar2 instanceof d) {
            d dVar2 = (d) mVar2;
            List<m> e3 = dVar2.e();
            for (int i = 0; i < e3.size(); i++) {
                Path path2 = e3.get(i).getPath();
                path2.transform(dVar2.h());
                this.a.addPath(path2);
            }
        } else {
            this.a.set(mVar2.getPath());
        }
        this.f1397c.op(this.a, this.b, op);
    }

    @Override // com.airbnb.lottie.v.b.c
    public void b(List<c> list, List<c> list2) {
        for (int i = 0; i < this.f1398d.size(); i++) {
            this.f1398d.get(i).b(list, list2);
        }
    }

    @Override // com.airbnb.lottie.v.b.j
    public void e(ListIterator<c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c previous = listIterator.previous();
            if (previous instanceof m) {
                this.f1398d.add((m) previous);
                listIterator.remove();
            }
        }
    }

    @Override // com.airbnb.lottie.v.b.m
    public Path getPath() {
        this.f1397c.reset();
        if (this.f1399e.c()) {
            return this.f1397c;
        }
        int ordinal = this.f1399e.b().ordinal();
        if (ordinal == 0) {
            for (int i = 0; i < this.f1398d.size(); i++) {
                this.f1397c.addPath(this.f1398d.get(i).getPath());
            }
        } else if (ordinal == 1) {
            a(Path.Op.UNION);
        } else if (ordinal == 2) {
            a(Path.Op.REVERSE_DIFFERENCE);
        } else if (ordinal == 3) {
            a(Path.Op.INTERSECT);
        } else if (ordinal == 4) {
            a(Path.Op.XOR);
        }
        return this.f1397c;
    }
}
