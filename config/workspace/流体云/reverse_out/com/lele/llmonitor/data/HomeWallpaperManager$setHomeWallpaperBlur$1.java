package com.lele.llmonitor.data;
final class HomeWallpaperManager$setHomeWallpaperBlur$1 extends jj3 implements h11 {
    final synthetic float $clamped;
    final synthetic android.content.Context $context;
    final synthetic long $generation;
    int label;

    public HomeWallpaperManager$setHomeWallpaperBlur$1(long p1, android.content.Context p3, float p4, n60 p5)
    {
        this.$generation = p1;
        this.$context = p3;
        this.$clamped = p4;
        super(2, p5);
        return;
    }

    public final n60 create(Object p7, n60 p8)
    {
        return new com.lele.llmonitor.data.HomeWallpaperManager$setHomeWallpaperBlur$1(this.$generation, this.$context, this.$clamped, p8);
    }

    public final Object invoke(d80 p1, n60 p2)
    {
        return ((com.lele.llmonitor.data.HomeWallpaperManager$setHomeWallpaperBlur$1) this.create(p1, p2)).invokeSuspend(bw3.a);
    }

    public bridge synthetic Object invoke(Object p1, Object p2)
    {
        return this.invoke(((d80) p1), ((n60) p2));
    }

    public final Object invokeSuspend(Object p5)
    {
        bw3 v0_0 = this.label;
        if (v0_0 == null) {
            ib1.Q(p5);
            this.label = 1;
            bw3 v0_4 = e80.d;
            if (n54.r(300, this) == v0_4) {
                return v0_4;
            }
        } else {
            if (v0_0 != 1) {
                h.m("call to \'resume\' before \'invoke\' with coroutine");
                return 0;
            } else {
                ib1.Q(p5);
            }
        }
        bw3 v0_2 = bw3.a;
        if (this.$generation == com.lele.llmonitor.data.HomeWallpaperManager.access$getHomeWallpaperBlurGeneration$p()) {
            this.$context.getSharedPreferences("llmonitor_settings", 0).edit().putFloat("home_wallpaper_blur", this.$clamped).apply();
            com.lele.llmonitor.data.SettingsManager.INSTANCE.refreshLaunchAppearanceSnapshot();
            return v0_2;
        } else {
            return v0_2;
        }
    }
}
