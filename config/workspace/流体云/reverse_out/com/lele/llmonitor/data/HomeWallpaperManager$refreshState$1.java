package com.lele.llmonitor.data;
final class HomeWallpaperManager$refreshState$1 extends jj3 implements h11 {
    final synthetic android.content.Context $context;
    final synthetic java.io.File $currentFile;
    final synthetic long $generation;
    int label;

    public HomeWallpaperManager$refreshState$1(long p1, android.content.Context p3, java.io.File p4, n60 p5)
    {
        this.$generation = p1;
        this.$context = p3;
        this.$currentFile = p4;
        super(2, p5);
        return;
    }

    public final n60 create(Object p7, n60 p8)
    {
        return new com.lele.llmonitor.data.HomeWallpaperManager$refreshState$1(this.$generation, this.$context, this.$currentFile, p8);
    }

    public final Object invoke(d80 p1, n60 p2)
    {
        return ((com.lele.llmonitor.data.HomeWallpaperManager$refreshState$1) this.create(p1, p2)).invokeSuspend(bw3.a);
    }

    public bridge synthetic Object invoke(Object p1, Object p2)
    {
        return this.invoke(((d80) p1), ((n60) p2));
    }

    public final Object invokeSuspend(Object p6)
    {
        bw3 v0_0 = this.label;
        if (v0_0 == null) {
            ib1.Q(p6);
            bw3 v0_1 = new com.lele.llmonitor.data.HomeWallpaperManager$refreshState$1$resolvedHistory$1(this.$context, this.$currentFile, 0);
            this.label = 1;
            p6 = xt3.k0(bd0.f, v0_1, this);
            bw3 v0_2 = e80.d;
            if (p6 == v0_2) {
                return v0_2;
            }
        } else {
            if (v0_0 != 1) {
                h.m("call to \'resume\' before \'invoke\' with coroutine");
                return 0;
            } else {
                ib1.Q(p6);
            }
        }
        bw3 v0_4 = bw3.a;
        if (this.$generation == com.lele.llmonitor.data.HomeWallpaperManager.access$getHistoryRefreshGeneration$p()) {
            com.lele.llmonitor.data.HomeWallpaperManager.INSTANCE.getHistoryFiles().setValue(((java.util.List) p6));
            return v0_4;
        } else {
            return v0_4;
        }
    }
}
