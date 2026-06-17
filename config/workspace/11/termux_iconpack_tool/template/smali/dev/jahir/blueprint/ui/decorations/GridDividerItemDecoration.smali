.class public final Ldev/jahir/blueprint/ui/decorations/GridDividerItemDecoration;
.super Landroidx/recyclerview/widget/z;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 3

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/z;-><init>(Landroid/content/Context;I)V

    .line 2
    .line 3
    .line 4
    sget p2, Ldev/jahir/frames/R$color;->dividers:I

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-static {p1, p2, v2, v0, v1}, Ldev/jahir/frames/extensions/context/ContextKt;->color$default(Landroid/content/Context;IIILjava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const p2, 0x3da3d70a    # 0.08f

    .line 14
    .line 15
    .line 16
    invoke-static {p1, p2}, Ldev/jahir/frames/extensions/resources/ColorKt;->withAlpha(IF)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    :try_start_0
    new-instance p2, Landroid/graphics/drawable/GradientDrawable;

    .line 21
    .line 22
    sget-object v0, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 23
    .line 24
    filled-new-array {p1, p1}, [I

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-direct {p2, v0, p1}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    int-to-float p1, p1

    .line 33
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 42
    .line 43
    mul-float v0, v0, p1

    .line 44
    .line 45
    float-to-int v0, v0

    .line 46
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 55
    .line 56
    mul-float p1, p1, v1

    .line 57
    .line 58
    float-to-int p1, p1

    .line 59
    invoke-virtual {p2, v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setSize(II)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/z;->setDrawable(Landroid/graphics/drawable/Drawable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    .line 64
    .line 65
    :catch_0
    return-void
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method
