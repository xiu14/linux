package com.lele.llmonitor.data;
final class HomeWallpaperStorage$refreshStartupPreview$2 extends jj3 implements h11 {
    final synthetic int $backgroundArgb;
    final synthetic android.content.Context $context;
    final synthetic float $wallpaperAlpha;
    final synthetic float $wallpaperBlur;
    int label;

    public HomeWallpaperStorage$refreshStartupPreview$2(android.content.Context p1, int p2, float p3, float p4, n60 p5)
    {
        this.$context = p1;
        this.$backgroundArgb = p2;
        this.$wallpaperAlpha = p3;
        this.$wallpaperBlur = p4;
        super(2, p5);
        return;
    }

    public final n60 create(Object p7, n60 p8)
    {
        return new com.lele.llmonitor.data.HomeWallpaperStorage$refreshStartupPreview$2(this.$context, this.$backgroundArgb, this.$wallpaperAlpha, this.$wallpaperBlur, p8);
    }

    public final Object invoke(d80 p1, n60 p2)
    {
        return ((com.lele.llmonitor.data.HomeWallpaperStorage$refreshStartupPreview$2) this.create(p1, p2)).invokeSuspend(bw3.a);
    }

    public bridge synthetic Object invoke(Object p1, Object p2)
    {
        return this.invoke(((d80) p1), ((n60) p2));
    }

    public final Object invokeSuspend(Object p9)
    {
        if (this.label != 0) {
            h.m("call to \'resume\' before \'invoke\' with coroutine");
            return 0;
        } else {
            ib1.Q(p9);
            com.lele.llmonitor.data.HomeWallpaperStorage v1 = com.lele.llmonitor.data.HomeWallpaperStorage.INSTANCE;
            com.lele.llmonitor.data.HomeWallpaperStorage.access$ensureWallpaperDirectories(v1, this.$context);
            java.io.File v2 = v1.resolveWallpaperFile(this.$context);
            if ((v2.exists()) && (v2.length() > 0)) {
                return Boolean.valueOf(com.lele.llmonitor.data.HomeWallpaperStorage.access$exportStartupPreview(v1, v2, v1.resolveStartupPreviewFile(this.$context), this.$backgroundArgb, this.$wallpaperAlpha, this.$wallpaperBlur, this.$context.getResources().getDisplayMetrics().density));
            } else {
                v1.resolveStartupPreviewFile(this.$context).delete();
                return Boolean.FALSE;
            }
        }
    }
}
