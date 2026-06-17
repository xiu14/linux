.class public Lcom/google/android/material/shape/MaterialShapeDrawable;
.super Landroid/graphics/drawable/Drawable;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lf0/g;
.implements Lcom/google/android/material/shape/Shapeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;,
        Lcom/google/android/material/shape/MaterialShapeDrawable$CompatibilityShadowMode;
    }
.end annotation


# static fields
.field public static final E:Landroid/graphics/Paint;


# instance fields
.field public A:Landroid/graphics/PorterDuffColorFilter;

.field public B:I

.field public final C:Landroid/graphics/RectF;

.field public D:Z

.field public h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

.field public final i:[Lcom/google/android/material/shape/ShapePath$ShadowCompatOperation;

.field public final j:[Lcom/google/android/material/shape/ShapePath$ShadowCompatOperation;

.field public final k:Ljava/util/BitSet;

.field public l:Z

.field public final m:Landroid/graphics/Matrix;

.field public final n:Landroid/graphics/Path;

.field public final o:Landroid/graphics/Path;

.field public final p:Landroid/graphics/RectF;

.field public final q:Landroid/graphics/RectF;

.field public final r:Landroid/graphics/Region;

.field public final s:Landroid/graphics/Region;

.field public t:Lcom/google/android/material/shape/ShapeAppearanceModel;

.field public final u:Landroid/graphics/Paint;

.field public final v:Landroid/graphics/Paint;

.field public final w:Lcom/google/android/material/shadow/ShadowRenderer;

.field public final x:Lcom/google/android/material/shape/ShapeAppearancePathProvider$PathListener;

.field public final y:Lcom/google/android/material/shape/ShapeAppearancePathProvider;

.field public z:Landroid/graphics/PorterDuffColorFilter;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/google/android/material/shape/MaterialShapeDrawable;->E:Landroid/graphics/Paint;

    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    .line 14
    .line 15
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->DST_OUT:Landroid/graphics/PorterDuff$Mode;

    .line 16
    .line 17
    invoke-direct {v1, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 21
    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/material/shape/ShapeAppearanceModel;

    invoke-direct {v0}, Lcom/google/android/material/shape/ShapeAppearanceModel;-><init>()V

    invoke-direct {p0, v0}, Lcom/google/android/material/shape/MaterialShapeDrawable;-><init>(Lcom/google/android/material/shape/ShapeAppearanceModel;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 2
    invoke-static {p1, p2, p3, p4}, Lcom/google/android/material/shape/ShapeAppearanceModel;->c(Landroid/content/Context;Landroid/util/AttributeSet;II)Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;->a()Lcom/google/android/material/shape/ShapeAppearanceModel;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/material/shape/MaterialShapeDrawable;-><init>(Lcom/google/android/material/shape/ShapeAppearanceModel;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;)V
    .locals 5

    .line 4
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    const/4 v0, 0x4

    .line 5
    new-array v1, v0, [Lcom/google/android/material/shape/ShapePath$ShadowCompatOperation;

    iput-object v1, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->i:[Lcom/google/android/material/shape/ShapePath$ShadowCompatOperation;

    .line 6
    new-array v0, v0, [Lcom/google/android/material/shape/ShapePath$ShadowCompatOperation;

    iput-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->j:[Lcom/google/android/material/shape/ShapePath$ShadowCompatOperation;

    .line 7
    new-instance v0, Ljava/util/BitSet;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Ljava/util/BitSet;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->k:Ljava/util/BitSet;

    .line 8
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->m:Landroid/graphics/Matrix;

    .line 9
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->n:Landroid/graphics/Path;

    .line 10
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->o:Landroid/graphics/Path;

    .line 11
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->p:Landroid/graphics/RectF;

    .line 12
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->q:Landroid/graphics/RectF;

    .line 13
    new-instance v0, Landroid/graphics/Region;

    invoke-direct {v0}, Landroid/graphics/Region;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->r:Landroid/graphics/Region;

    .line 14
    new-instance v0, Landroid/graphics/Region;

    invoke-direct {v0}, Landroid/graphics/Region;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->s:Landroid/graphics/Region;

    .line 15
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->u:Landroid/graphics/Paint;

    .line 16
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v2, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->v:Landroid/graphics/Paint;

    .line 17
    new-instance v3, Lcom/google/android/material/shadow/ShadowRenderer;

    invoke-direct {v3}, Lcom/google/android/material/shadow/ShadowRenderer;-><init>()V

    iput-object v3, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->w:Lcom/google/android/material/shadow/ShadowRenderer;

    .line 18
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-virtual {v3}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    if-ne v3, v4, :cond_0

    .line 19
    sget-object v3, Lcom/google/android/material/shape/ShapeAppearancePathProvider$Lazy;->a:Lcom/google/android/material/shape/ShapeAppearancePathProvider;

    goto :goto_0

    .line 20
    :cond_0
    new-instance v3, Lcom/google/android/material/shape/ShapeAppearancePathProvider;

    invoke-direct {v3}, Lcom/google/android/material/shape/ShapeAppearancePathProvider;-><init>()V

    :goto_0
    iput-object v3, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->y:Lcom/google/android/material/shape/ShapeAppearancePathProvider;

    .line 21
    new-instance v3, Landroid/graphics/RectF;

    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    iput-object v3, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->C:Landroid/graphics/RectF;

    .line 22
    iput-boolean v1, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->D:Z

    .line 23
    iput-object p1, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 24
    sget-object p1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 25
    sget-object p1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 26
    invoke-virtual {p0}, Lcom/google/android/material/shape/MaterialShapeDrawable;->r()Z

    .line 27
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/shape/MaterialShapeDrawable;->q([I)Z

    .line 28
    new-instance p1, Lcom/google/android/material/shape/MaterialShapeDrawable$1;

    invoke-direct {p1, p0}, Lcom/google/android/material/shape/MaterialShapeDrawable$1;-><init>(Lcom/google/android/material/shape/MaterialShapeDrawable;)V

    iput-object p1, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->x:Lcom/google/android/material/shape/ShapeAppearancePathProvider$PathListener;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/shape/ShapeAppearanceModel;)V
    .locals 1

    .line 3
    new-instance v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    invoke-direct {v0, p1}, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;-><init>(Lcom/google/android/material/shape/ShapeAppearanceModel;)V

    invoke-direct {p0, v0}, Lcom/google/android/material/shape/MaterialShapeDrawable;-><init>(Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/shape/MaterialShapeDrawable;->invalidateSelf()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final b(Landroid/graphics/RectF;Landroid/graphics/Path;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 2
    .line 3
    iget-object v2, v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->a:Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 4
    .line 5
    iget v3, v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->i:F

    .line 6
    .line 7
    iget-object v5, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->x:Lcom/google/android/material/shape/ShapeAppearancePathProvider$PathListener;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->y:Lcom/google/android/material/shape/ShapeAppearancePathProvider;

    .line 10
    .line 11
    move-object v4, p1

    .line 12
    move-object v6, p2

    .line 13
    invoke-virtual/range {v1 .. v6}, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->a(Lcom/google/android/material/shape/ShapeAppearanceModel;FLandroid/graphics/RectF;Lcom/google/android/material/shape/ShapeAppearancePathProvider$PathListener;Landroid/graphics/Path;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 17
    .line 18
    iget p1, p1, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->h:F

    .line 19
    .line 20
    const/high16 p2, 0x3f800000    # 1.0f

    .line 21
    .line 22
    cmpl-float p1, p1, p2

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    iget-object p1, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->m:Landroid/graphics/Matrix;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/graphics/Matrix;->reset()V

    .line 29
    .line 30
    .line 31
    iget-object p2, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 32
    .line 33
    iget p2, p2, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->h:F

    .line 34
    .line 35
    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const/high16 v1, 0x40000000    # 2.0f

    .line 40
    .line 41
    div-float/2addr v0, v1

    .line 42
    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    div-float/2addr v2, v1

    .line 47
    invoke-virtual {p1, p2, p2, v0, v2}, Landroid/graphics/Matrix;->setScale(FFFF)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v6, p1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    iget-object p1, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->C:Landroid/graphics/RectF;

    .line 54
    .line 55
    const/4 p2, 0x1

    .line 56
    invoke-virtual {v6, p1, p2}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 57
    .line 58
    .line 59
    return-void
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method

.method public final c(I)I
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 2
    .line 3
    iget v1, v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->m:F

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    add-float/2addr v1, v2

    .line 7
    iget v3, v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->l:F

    .line 8
    .line 9
    add-float/2addr v1, v3

    .line 10
    iget-object v0, v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->b:Lcom/google/android/material/elevation/ElevationOverlayProvider;

    .line 11
    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    iget-boolean v3, v0, Lcom/google/android/material/elevation/ElevationOverlayProvider;->a:Z

    .line 15
    .line 16
    if-eqz v3, :cond_3

    .line 17
    .line 18
    const/16 v3, 0xff

    .line 19
    .line 20
    invoke-static {p1, v3}, Le0/d;->n(II)I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    iget v5, v0, Lcom/google/android/material/elevation/ElevationOverlayProvider;->d:I

    .line 25
    .line 26
    if-ne v4, v5, :cond_3

    .line 27
    .line 28
    iget v4, v0, Lcom/google/android/material/elevation/ElevationOverlayProvider;->e:F

    .line 29
    .line 30
    cmpg-float v5, v4, v2

    .line 31
    .line 32
    if-lez v5, :cond_1

    .line 33
    .line 34
    cmpg-float v5, v1, v2

    .line 35
    .line 36
    if-gtz v5, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    div-float/2addr v1, v4

    .line 40
    float-to-double v4, v1

    .line 41
    invoke-static {v4, v5}, Ljava/lang/Math;->log1p(D)D

    .line 42
    .line 43
    .line 44
    move-result-wide v4

    .line 45
    double-to-float v1, v4

    .line 46
    const/high16 v4, 0x40900000    # 4.5f

    .line 47
    .line 48
    mul-float v1, v1, v4

    .line 49
    .line 50
    const/high16 v4, 0x40000000    # 2.0f

    .line 51
    .line 52
    add-float/2addr v1, v4

    .line 53
    const/high16 v4, 0x42c80000    # 100.0f

    .line 54
    .line 55
    div-float/2addr v1, v4

    .line 56
    const/high16 v4, 0x3f800000    # 1.0f

    .line 57
    .line 58
    invoke-static {v1, v4}, Ljava/lang/Math;->min(FF)F

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    :goto_0
    const/4 v1, 0x0

    .line 64
    :goto_1
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    invoke-static {p1, v3}, Le0/d;->n(II)I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    iget v3, v0, Lcom/google/android/material/elevation/ElevationOverlayProvider;->b:I

    .line 73
    .line 74
    invoke-static {p1, v3, v1}, Lcom/google/android/material/color/MaterialColors;->e(IIF)I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    cmpl-float v1, v1, v2

    .line 79
    .line 80
    if-lez v1, :cond_2

    .line 81
    .line 82
    iget v0, v0, Lcom/google/android/material/elevation/ElevationOverlayProvider;->c:I

    .line 83
    .line 84
    if-eqz v0, :cond_2

    .line 85
    .line 86
    sget v1, Lcom/google/android/material/elevation/ElevationOverlayProvider;->f:I

    .line 87
    .line 88
    invoke-static {v0, v1}, Le0/d;->n(II)I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    invoke-static {v0, p1}, Le0/d;->j(II)I

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    :cond_2
    invoke-static {p1, v4}, Le0/d;->n(II)I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    :cond_3
    return p1
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
.end method

.method public final d(Landroid/graphics/Canvas;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->k:Ljava/util/BitSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/BitSet;->cardinality()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "MaterialShapeDrawable"

    .line 10
    .line 11
    const-string v1, "Compatibility shadow requested but can\'t be drawn for all operations in this shape."

    .line 12
    .line 13
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 17
    .line 18
    iget v0, v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->p:I

    .line 19
    .line 20
    iget-object v1, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->n:Landroid/graphics/Path;

    .line 21
    .line 22
    iget-object v2, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->w:Lcom/google/android/material/shadow/ShadowRenderer;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object v0, v2, Lcom/google/android/material/shadow/ShadowRenderer;->a:Landroid/graphics/Paint;

    .line 27
    .line 28
    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    const/4 v0, 0x0

    .line 32
    const/4 v3, 0x0

    .line 33
    :goto_0
    const/4 v4, 0x4

    .line 34
    if-ge v3, v4, :cond_2

    .line 35
    .line 36
    iget-object v4, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->i:[Lcom/google/android/material/shape/ShapePath$ShadowCompatOperation;

    .line 37
    .line 38
    aget-object v4, v4, v3

    .line 39
    .line 40
    iget-object v5, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 41
    .line 42
    iget v5, v5, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->o:I

    .line 43
    .line 44
    sget-object v6, Lcom/google/android/material/shape/ShapePath$ShadowCompatOperation;->b:Landroid/graphics/Matrix;

    .line 45
    .line 46
    invoke-virtual {v4, v6, v2, v5, p1}, Lcom/google/android/material/shape/ShapePath$ShadowCompatOperation;->a(Landroid/graphics/Matrix;Lcom/google/android/material/shadow/ShadowRenderer;ILandroid/graphics/Canvas;)V

    .line 47
    .line 48
    .line 49
    iget-object v4, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->j:[Lcom/google/android/material/shape/ShapePath$ShadowCompatOperation;

    .line 50
    .line 51
    aget-object v4, v4, v3

    .line 52
    .line 53
    iget-object v5, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 54
    .line 55
    iget v5, v5, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->o:I

    .line 56
    .line 57
    invoke-virtual {v4, v6, v2, v5, p1}, Lcom/google/android/material/shape/ShapePath$ShadowCompatOperation;->a(Landroid/graphics/Matrix;Lcom/google/android/material/shadow/ShadowRenderer;ILandroid/graphics/Canvas;)V

    .line 58
    .line 59
    .line 60
    add-int/lit8 v3, v3, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    iget-boolean v2, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->D:Z

    .line 64
    .line 65
    if-eqz v2, :cond_3

    .line 66
    .line 67
    iget-object v2, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 68
    .line 69
    iget v2, v2, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->p:I

    .line 70
    .line 71
    int-to-double v2, v2

    .line 72
    int-to-double v4, v0

    .line 73
    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    .line 74
    .line 75
    .line 76
    move-result-wide v6

    .line 77
    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    .line 78
    .line 79
    .line 80
    move-result-wide v6

    .line 81
    mul-double v6, v6, v2

    .line 82
    .line 83
    double-to-int v0, v6

    .line 84
    iget-object v2, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 85
    .line 86
    iget v2, v2, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->p:I

    .line 87
    .line 88
    int-to-double v2, v2

    .line 89
    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    .line 90
    .line 91
    .line 92
    move-result-wide v4

    .line 93
    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    .line 94
    .line 95
    .line 96
    move-result-wide v4

    .line 97
    mul-double v4, v4, v2

    .line 98
    .line 99
    double-to-int v2, v4

    .line 100
    neg-int v3, v0

    .line 101
    int-to-float v3, v3

    .line 102
    neg-int v4, v2

    .line 103
    int-to-float v4, v4

    .line 104
    invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 105
    .line 106
    .line 107
    sget-object v3, Lcom/google/android/material/shape/MaterialShapeDrawable;->E:Landroid/graphics/Paint;

    .line 108
    .line 109
    invoke-virtual {p1, v1, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 110
    .line 111
    .line 112
    int-to-float v0, v0

    .line 113
    int-to-float v1, v2

    .line 114
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 115
    .line 116
    .line 117
    :cond_3
    return-void
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lcom/google/android/material/shape/MaterialShapeDrawable;->z:Landroid/graphics/PorterDuffColorFilter;

    .line 6
    .line 7
    iget-object v3, v0, Lcom/google/android/material/shape/MaterialShapeDrawable;->u:Landroid/graphics/Paint;

    .line 8
    .line 9
    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v3}, Landroid/graphics/Paint;->getAlpha()I

    .line 13
    .line 14
    .line 15
    move-result v6

    .line 16
    iget-object v2, v0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 17
    .line 18
    iget v2, v2, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->k:I

    .line 19
    .line 20
    ushr-int/lit8 v4, v2, 0x7

    .line 21
    .line 22
    add-int/2addr v2, v4

    .line 23
    mul-int v2, v2, v6

    .line 24
    .line 25
    ushr-int/lit8 v2, v2, 0x8

    .line 26
    .line 27
    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 28
    .line 29
    .line 30
    iget-object v2, v0, Lcom/google/android/material/shape/MaterialShapeDrawable;->A:Landroid/graphics/PorterDuffColorFilter;

    .line 31
    .line 32
    iget-object v7, v0, Lcom/google/android/material/shape/MaterialShapeDrawable;->v:Landroid/graphics/Paint;

    .line 33
    .line 34
    invoke-virtual {v7, v2}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 35
    .line 36
    .line 37
    iget-object v2, v0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 38
    .line 39
    iget v2, v2, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->j:F

    .line 40
    .line 41
    invoke-virtual {v7, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v7}, Landroid/graphics/Paint;->getAlpha()I

    .line 45
    .line 46
    .line 47
    move-result v8

    .line 48
    iget-object v2, v0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 49
    .line 50
    iget v2, v2, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->k:I

    .line 51
    .line 52
    ushr-int/lit8 v4, v2, 0x7

    .line 53
    .line 54
    add-int/2addr v2, v4

    .line 55
    mul-int v2, v2, v8

    .line 56
    .line 57
    ushr-int/lit8 v2, v2, 0x8

    .line 58
    .line 59
    invoke-virtual {v7, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 60
    .line 61
    .line 62
    iget-boolean v2, v0, Lcom/google/android/material/shape/MaterialShapeDrawable;->l:Z

    .line 63
    .line 64
    const/4 v4, 0x0

    .line 65
    move v5, v2

    .line 66
    move-object v2, v3

    .line 67
    iget-object v3, v0, Lcom/google/android/material/shape/MaterialShapeDrawable;->n:Landroid/graphics/Path;

    .line 68
    .line 69
    if-eqz v5, :cond_2

    .line 70
    .line 71
    invoke-virtual {v0}, Lcom/google/android/material/shape/MaterialShapeDrawable;->i()Z

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    const/4 v9, 0x0

    .line 76
    const/high16 v10, 0x40000000    # 2.0f

    .line 77
    .line 78
    if-eqz v5, :cond_0

    .line 79
    .line 80
    invoke-virtual {v7}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    div-float/2addr v5, v10

    .line 85
    goto :goto_0

    .line 86
    :cond_0
    const/4 v5, 0x0

    .line 87
    :goto_0
    neg-float v5, v5

    .line 88
    iget-object v11, v0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 89
    .line 90
    iget-object v11, v11, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->a:Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 91
    .line 92
    new-instance v12, Lcom/google/android/material/shape/MaterialShapeDrawable$2;

    .line 93
    .line 94
    invoke-direct {v12, v5}, Lcom/google/android/material/shape/MaterialShapeDrawable$2;-><init>(F)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v11, v12}, Lcom/google/android/material/shape/ShapeAppearanceModel;->g(Lcom/google/android/material/shape/ShapeAppearanceModel$CornerSizeUnaryOperator;)Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 98
    .line 99
    .line 100
    move-result-object v14

    .line 101
    iput-object v14, v0, Lcom/google/android/material/shape/MaterialShapeDrawable;->t:Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 102
    .line 103
    iget-object v5, v0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 104
    .line 105
    iget v15, v5, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->i:F

    .line 106
    .line 107
    invoke-virtual {v0}, Lcom/google/android/material/shape/MaterialShapeDrawable;->g()Landroid/graphics/RectF;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    iget-object v11, v0, Lcom/google/android/material/shape/MaterialShapeDrawable;->q:Landroid/graphics/RectF;

    .line 112
    .line 113
    invoke-virtual {v11, v5}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Lcom/google/android/material/shape/MaterialShapeDrawable;->i()Z

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    if-eqz v5, :cond_1

    .line 121
    .line 122
    invoke-virtual {v7}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    div-float v9, v5, v10

    .line 127
    .line 128
    :cond_1
    invoke-virtual {v11, v9, v9}, Landroid/graphics/RectF;->inset(FF)V

    .line 129
    .line 130
    .line 131
    iget-object v5, v0, Lcom/google/android/material/shape/MaterialShapeDrawable;->o:Landroid/graphics/Path;

    .line 132
    .line 133
    const/16 v17, 0x0

    .line 134
    .line 135
    iget-object v13, v0, Lcom/google/android/material/shape/MaterialShapeDrawable;->y:Lcom/google/android/material/shape/ShapeAppearancePathProvider;

    .line 136
    .line 137
    move-object/from16 v18, v5

    .line 138
    .line 139
    move-object/from16 v16, v11

    .line 140
    .line 141
    invoke-virtual/range {v13 .. v18}, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->a(Lcom/google/android/material/shape/ShapeAppearanceModel;FLandroid/graphics/RectF;Lcom/google/android/material/shape/ShapeAppearancePathProvider$PathListener;Landroid/graphics/Path;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0}, Lcom/google/android/material/shape/MaterialShapeDrawable;->g()Landroid/graphics/RectF;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    invoke-virtual {v0, v5, v3}, Lcom/google/android/material/shape/MaterialShapeDrawable;->b(Landroid/graphics/RectF;Landroid/graphics/Path;)V

    .line 149
    .line 150
    .line 151
    iput-boolean v4, v0, Lcom/google/android/material/shape/MaterialShapeDrawable;->l:Z

    .line 152
    .line 153
    :cond_2
    iget-object v5, v0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 154
    .line 155
    iget v9, v5, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->n:I

    .line 156
    .line 157
    const/4 v10, 0x1

    .line 158
    if-eq v9, v10, :cond_6

    .line 159
    .line 160
    iget v10, v5, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->o:I

    .line 161
    .line 162
    if-lez v10, :cond_6

    .line 163
    .line 164
    const/4 v10, 0x2

    .line 165
    if-eq v9, v10, :cond_3

    .line 166
    .line 167
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 168
    .line 169
    iget-object v5, v5, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->a:Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 170
    .line 171
    invoke-virtual {v0}, Lcom/google/android/material/shape/MaterialShapeDrawable;->g()Landroid/graphics/RectF;

    .line 172
    .line 173
    .line 174
    move-result-object v11

    .line 175
    invoke-virtual {v5, v11}, Lcom/google/android/material/shape/ShapeAppearanceModel;->e(Landroid/graphics/RectF;)Z

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    if-nez v5, :cond_6

    .line 180
    .line 181
    invoke-virtual {v3}, Landroid/graphics/Path;->isConvex()Z

    .line 182
    .line 183
    .line 184
    move-result v5

    .line 185
    if-nez v5, :cond_6

    .line 186
    .line 187
    const/16 v5, 0x1d

    .line 188
    .line 189
    if-ge v9, v5, :cond_6

    .line 190
    .line 191
    :cond_3
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 192
    .line 193
    .line 194
    iget-object v5, v0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 195
    .line 196
    iget v5, v5, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->p:I

    .line 197
    .line 198
    int-to-double v11, v5

    .line 199
    int-to-double v4, v4

    .line 200
    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    .line 201
    .line 202
    .line 203
    move-result-wide v13

    .line 204
    invoke-static {v13, v14}, Ljava/lang/Math;->sin(D)D

    .line 205
    .line 206
    .line 207
    move-result-wide v13

    .line 208
    mul-double v13, v13, v11

    .line 209
    .line 210
    double-to-int v9, v13

    .line 211
    iget-object v11, v0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 212
    .line 213
    iget v11, v11, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->p:I

    .line 214
    .line 215
    int-to-double v11, v11

    .line 216
    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    .line 217
    .line 218
    .line 219
    move-result-wide v4

    .line 220
    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    .line 221
    .line 222
    .line 223
    move-result-wide v4

    .line 224
    mul-double v4, v4, v11

    .line 225
    .line 226
    double-to-int v4, v4

    .line 227
    int-to-float v5, v9

    .line 228
    int-to-float v4, v4

    .line 229
    invoke-virtual {v1, v5, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 230
    .line 231
    .line 232
    iget-boolean v4, v0, Lcom/google/android/material/shape/MaterialShapeDrawable;->D:Z

    .line 233
    .line 234
    if-nez v4, :cond_4

    .line 235
    .line 236
    invoke-virtual/range {p0 .. p1}, Lcom/google/android/material/shape/MaterialShapeDrawable;->d(Landroid/graphics/Canvas;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 240
    .line 241
    .line 242
    goto/16 :goto_1

    .line 243
    .line 244
    :cond_4
    iget-object v4, v0, Lcom/google/android/material/shape/MaterialShapeDrawable;->C:Landroid/graphics/RectF;

    .line 245
    .line 246
    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    .line 247
    .line 248
    .line 249
    move-result v5

    .line 250
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 251
    .line 252
    .line 253
    move-result-object v9

    .line 254
    invoke-virtual {v9}, Landroid/graphics/Rect;->width()I

    .line 255
    .line 256
    .line 257
    move-result v9

    .line 258
    int-to-float v9, v9

    .line 259
    sub-float/2addr v5, v9

    .line 260
    float-to-int v5, v5

    .line 261
    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    .line 262
    .line 263
    .line 264
    move-result v9

    .line 265
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 266
    .line 267
    .line 268
    move-result-object v11

    .line 269
    invoke-virtual {v11}, Landroid/graphics/Rect;->height()I

    .line 270
    .line 271
    .line 272
    move-result v11

    .line 273
    int-to-float v11, v11

    .line 274
    sub-float/2addr v9, v11

    .line 275
    float-to-int v9, v9

    .line 276
    if-ltz v5, :cond_5

    .line 277
    .line 278
    if-ltz v9, :cond_5

    .line 279
    .line 280
    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    .line 281
    .line 282
    .line 283
    move-result v11

    .line 284
    float-to-int v11, v11

    .line 285
    iget-object v12, v0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 286
    .line 287
    iget v12, v12, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->o:I

    .line 288
    .line 289
    mul-int/lit8 v12, v12, 0x2

    .line 290
    .line 291
    add-int/2addr v12, v11

    .line 292
    add-int/2addr v12, v5

    .line 293
    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    .line 294
    .line 295
    .line 296
    move-result v4

    .line 297
    float-to-int v4, v4

    .line 298
    iget-object v11, v0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 299
    .line 300
    iget v11, v11, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->o:I

    .line 301
    .line 302
    mul-int/lit8 v11, v11, 0x2

    .line 303
    .line 304
    add-int/2addr v11, v4

    .line 305
    add-int/2addr v11, v9

    .line 306
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 307
    .line 308
    invoke-static {v12, v11, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 309
    .line 310
    .line 311
    move-result-object v4

    .line 312
    new-instance v10, Landroid/graphics/Canvas;

    .line 313
    .line 314
    invoke-direct {v10, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 318
    .line 319
    .line 320
    move-result-object v11

    .line 321
    iget v11, v11, Landroid/graphics/Rect;->left:I

    .line 322
    .line 323
    iget-object v12, v0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 324
    .line 325
    iget v12, v12, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->o:I

    .line 326
    .line 327
    sub-int/2addr v11, v12

    .line 328
    sub-int/2addr v11, v5

    .line 329
    int-to-float v5, v11

    .line 330
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 331
    .line 332
    .line 333
    move-result-object v11

    .line 334
    iget v11, v11, Landroid/graphics/Rect;->top:I

    .line 335
    .line 336
    iget-object v12, v0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 337
    .line 338
    iget v12, v12, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->o:I

    .line 339
    .line 340
    sub-int/2addr v11, v12

    .line 341
    sub-int/2addr v11, v9

    .line 342
    int-to-float v9, v11

    .line 343
    neg-float v11, v5

    .line 344
    neg-float v12, v9

    .line 345
    invoke-virtual {v10, v11, v12}, Landroid/graphics/Canvas;->translate(FF)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v0, v10}, Lcom/google/android/material/shape/MaterialShapeDrawable;->d(Landroid/graphics/Canvas;)V

    .line 349
    .line 350
    .line 351
    const/4 v10, 0x0

    .line 352
    invoke-virtual {v1, v4, v5, v9, v10}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 359
    .line 360
    .line 361
    goto :goto_1

    .line 362
    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 363
    .line 364
    const-string v2, "Invalid shadow bounds. Check that the treatments result in a valid path."

    .line 365
    .line 366
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    throw v1

    .line 370
    :cond_6
    :goto_1
    iget-object v4, v0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 371
    .line 372
    iget-object v5, v4, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->q:Landroid/graphics/Paint$Style;

    .line 373
    .line 374
    sget-object v9, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    .line 375
    .line 376
    if-eq v5, v9, :cond_7

    .line 377
    .line 378
    sget-object v9, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 379
    .line 380
    if-ne v5, v9, :cond_8

    .line 381
    .line 382
    :cond_7
    iget-object v4, v4, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->a:Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 383
    .line 384
    invoke-virtual {v0}, Lcom/google/android/material/shape/MaterialShapeDrawable;->g()Landroid/graphics/RectF;

    .line 385
    .line 386
    .line 387
    move-result-object v5

    .line 388
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/material/shape/MaterialShapeDrawable;->e(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;Lcom/google/android/material/shape/ShapeAppearanceModel;Landroid/graphics/RectF;)V

    .line 389
    .line 390
    .line 391
    :cond_8
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/material/shape/MaterialShapeDrawable;->i()Z

    .line 392
    .line 393
    .line 394
    move-result v0

    .line 395
    if-eqz v0, :cond_9

    .line 396
    .line 397
    invoke-virtual/range {p0 .. p1}, Lcom/google/android/material/shape/MaterialShapeDrawable;->f(Landroid/graphics/Canvas;)V

    .line 398
    .line 399
    .line 400
    :cond_9
    invoke-virtual {v2, v6}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v7, v8}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 404
    .line 405
    .line 406
    return-void
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
.end method

.method public final e(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;Lcom/google/android/material/shape/ShapeAppearanceModel;Landroid/graphics/RectF;)V
    .locals 1

    .line 1
    invoke-virtual {p4, p5}, Lcom/google/android/material/shape/ShapeAppearanceModel;->e(Landroid/graphics/RectF;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p3, p4, Lcom/google/android/material/shape/ShapeAppearanceModel;->f:Lcom/google/android/material/shape/CornerSize;

    .line 8
    .line 9
    invoke-interface {p3, p5}, Lcom/google/android/material/shape/CornerSize;->a(Landroid/graphics/RectF;)F

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    iget-object p4, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 14
    .line 15
    iget p4, p4, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->i:F

    .line 16
    .line 17
    mul-float p3, p3, p4

    .line 18
    .line 19
    invoke-virtual {p1, p5, p3, p3, p2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-virtual {p1, p3, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 24
    .line 25
    .line 26
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
.end method

.method public f(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    iget-object v4, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->t:Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/shape/MaterialShapeDrawable;->g()Landroid/graphics/RectF;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v5, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->q:Landroid/graphics/RectF;

    .line 8
    .line 9
    invoke-virtual {v5, v0}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/android/material/shape/MaterialShapeDrawable;->i()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->v:Landroid/graphics/Paint;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {v2}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/high16 v1, 0x40000000    # 2.0f

    .line 25
    .line 26
    div-float/2addr v0, v1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    :goto_0
    invoke-virtual {v5, v0, v0}, Landroid/graphics/RectF;->inset(FF)V

    .line 30
    .line 31
    .line 32
    iget-object v3, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->o:Landroid/graphics/Path;

    .line 33
    .line 34
    move-object v0, p0

    .line 35
    move-object v1, p1

    .line 36
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/material/shape/MaterialShapeDrawable;->e(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;Lcom/google/android/material/shape/ShapeAppearanceModel;Landroid/graphics/RectF;)V

    .line 37
    .line 38
    .line 39
    return-void
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
.end method

.method public final g()Landroid/graphics/RectF;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->p:Landroid/graphics/RectF;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 8
    .line 9
    .line 10
    return-object v1
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public getAlpha()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 2
    .line 3
    iget v0, v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->k:I

    .line 4
    .line 5
    return v0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public getOpacity()I
    .locals 1

    .line 1
    const/4 v0, -0x3

    .line 2
    return v0
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public getOutline(Landroid/graphics/Outline;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 2
    .line 3
    iget v1, v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->n:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    if-ne v1, v2, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->a:Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/android/material/shape/MaterialShapeDrawable;->g()Landroid/graphics/RectF;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Lcom/google/android/material/shape/ShapeAppearanceModel;->e(Landroid/graphics/RectF;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/google/android/material/shape/MaterialShapeDrawable;->h()F

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iget-object v1, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 26
    .line 27
    iget v1, v1, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->i:F

    .line 28
    .line 29
    mul-float v0, v0, v1

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {p1, v1, v0}, Landroid/graphics/Outline;->setRoundRect(Landroid/graphics/Rect;F)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/material/shape/MaterialShapeDrawable;->g()Landroid/graphics/RectF;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v1, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->n:Landroid/graphics/Path;

    .line 44
    .line 45
    invoke-virtual {p0, v0, v1}, Lcom/google/android/material/shape/MaterialShapeDrawable;->b(Landroid/graphics/RectF;Landroid/graphics/Path;)V

    .line 46
    .line 47
    .line 48
    invoke-static {p1, v1}, Lcom/google/android/material/drawable/DrawableUtils;->e(Landroid/graphics/Outline;Landroid/graphics/Path;)V

    .line 49
    .line 50
    .line 51
    return-void
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
.end method

.method public final getPadding(Landroid/graphics/Rect;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->g:Landroid/graphics/Rect;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    return p1

    .line 12
    :cond_0
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final getShapeAppearanceModel()Lcom/google/android/material/shape/ShapeAppearanceModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->a:Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 4
    .line 5
    return-object v0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final getTransparentRegion()Landroid/graphics/Region;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->r:Landroid/graphics/Region;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroid/graphics/Region;->set(Landroid/graphics/Rect;)Z

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/android/material/shape/MaterialShapeDrawable;->g()Landroid/graphics/RectF;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v2, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->n:Landroid/graphics/Path;

    .line 15
    .line 16
    invoke-virtual {p0, v0, v2}, Lcom/google/android/material/shape/MaterialShapeDrawable;->b(Landroid/graphics/RectF;Landroid/graphics/Path;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->s:Landroid/graphics/Region;

    .line 20
    .line 21
    invoke-virtual {v0, v2, v1}, Landroid/graphics/Region;->setPath(Landroid/graphics/Path;Landroid/graphics/Region;)Z

    .line 22
    .line 23
    .line 24
    sget-object v2, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    .line 25
    .line 26
    invoke-virtual {v1, v0, v2}, Landroid/graphics/Region;->op(Landroid/graphics/Region;Landroid/graphics/Region$Op;)Z

    .line 27
    .line 28
    .line 29
    return-object v1
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final h()F
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->a:Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 4
    .line 5
    iget-object v0, v0, Lcom/google/android/material/shape/ShapeAppearanceModel;->e:Lcom/google/android/material/shape/CornerSize;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/material/shape/MaterialShapeDrawable;->g()Landroid/graphics/RectF;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v0, v1}, Lcom/google/android/material/shape/CornerSize;->a(Landroid/graphics/RectF;)F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final i()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->q:Landroid/graphics/Paint$Style;

    .line 4
    .line 5
    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 10
    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->v:Landroid/graphics/Paint;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x0

    .line 20
    cmpl-float v0, v0, v1

    .line 21
    .line 22
    if-lez v0, :cond_1

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    return v0

    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    return v0
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final invalidateSelf()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->l:Z

    .line 3
    .line 4
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 5
    .line 6
    .line 7
    return-void
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public isStateful()Z
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_3

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->e:Landroid/content/res/ColorStateList;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_3

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 25
    .line 26
    iget-object v0, v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->d:Landroid/content/res/ColorStateList;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_3

    .line 35
    .line 36
    :cond_1
    iget-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 37
    .line 38
    iget-object v0, v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->c:Landroid/content/res/ColorStateList;

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    const/4 v0, 0x0

    .line 50
    return v0

    .line 51
    :cond_3
    :goto_0
    const/4 v0, 0x1

    .line 52
    return v0
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method public final j(Landroid/content/Context;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 2
    .line 3
    new-instance v1, Lcom/google/android/material/elevation/ElevationOverlayProvider;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Lcom/google/android/material/elevation/ElevationOverlayProvider;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iput-object v1, v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->b:Lcom/google/android/material/elevation/ElevationOverlayProvider;

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/android/material/shape/MaterialShapeDrawable;->s()V

    .line 11
    .line 12
    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final k(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 2
    .line 3
    iget v1, v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->m:F

    .line 4
    .line 5
    cmpl-float v1, v1, p1

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput p1, v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->m:F

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/android/material/shape/MaterialShapeDrawable;->s()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final l(Landroid/content/res/ColorStateList;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->c:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    iput-object p1, v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->c:Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, Lcom/google/android/material/shape/MaterialShapeDrawable;->onStateChange([I)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final m(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 2
    .line 3
    iget v1, v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->i:F

    .line 4
    .line 5
    cmpl-float v1, v1, p1

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iput p1, v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->i:F

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->l:Z

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/google/android/material/shape/MaterialShapeDrawable;->invalidateSelf()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public mutate()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;-><init>(Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 9
    .line 10
    return-object p0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final n(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->w:Lcom/google/android/material/shadow/ShadowRenderer;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/shadow/ShadowRenderer;->c(I)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 12
    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final o()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 2
    .line 3
    iget v1, v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->n:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    if-eq v1, v2, :cond_0

    .line 7
    .line 8
    iput v2, v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->n:I

    .line 9
    .line 10
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public onBoundsChange(Landroid/graphics/Rect;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->l:Z

    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    .line 5
    .line 6
    .line 7
    return-void
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public onStateChange([I)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/material/shape/MaterialShapeDrawable;->q([I)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0}, Lcom/google/android/material/shape/MaterialShapeDrawable;->r()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez p1, :cond_1

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 17
    :goto_1
    if-eqz p1, :cond_2

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/google/android/material/shape/MaterialShapeDrawable;->invalidateSelf()V

    .line 20
    .line 21
    .line 22
    :cond_2
    return p1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final p(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 2
    .line 3
    iget v1, v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->p:I

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    iput p1, v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->p:I

    .line 8
    .line 9
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final q([I)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->c:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->u:Landroid/graphics/Paint;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    iget-object v3, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 15
    .line 16
    iget-object v3, v3, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->c:Landroid/content/res/ColorStateList;

    .line 17
    .line 18
    invoke-virtual {v3, p1, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eq v2, v3, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    :goto_0
    iget-object v2, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 31
    .line 32
    iget-object v2, v2, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->d:Landroid/content/res/ColorStateList;

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    iget-object v2, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->v:Landroid/graphics/Paint;

    .line 37
    .line 38
    invoke-virtual {v2}, Landroid/graphics/Paint;->getColor()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    iget-object v4, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 43
    .line 44
    iget-object v4, v4, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->d:Landroid/content/res/ColorStateList;

    .line 45
    .line 46
    invoke-virtual {v4, p1, v3}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eq v3, p1, :cond_1

    .line 51
    .line 52
    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 53
    .line 54
    .line 55
    return v1

    .line 56
    :cond_1
    return v0
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
.end method

.method public final r()Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->z:Landroid/graphics/PorterDuffColorFilter;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->A:Landroid/graphics/PorterDuffColorFilter;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 6
    .line 7
    iget-object v3, v2, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->e:Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    iget-object v2, v2, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->f:Landroid/graphics/PorterDuff$Mode;

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    if-eqz v3, :cond_1

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    const/4 v6, 0x0

    .line 22
    invoke-virtual {v3, v5, v6}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    invoke-virtual {p0, v3}, Lcom/google/android/material/shape/MaterialShapeDrawable;->c(I)I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    iput v3, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->B:I

    .line 31
    .line 32
    new-instance v5, Landroid/graphics/PorterDuffColorFilter;

    .line 33
    .line 34
    invoke-direct {v5, v3, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    :goto_0
    iget-object v2, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->u:Landroid/graphics/Paint;

    .line 39
    .line 40
    invoke-virtual {v2}, Landroid/graphics/Paint;->getColor()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-virtual {p0, v2}, Lcom/google/android/material/shape/MaterialShapeDrawable;->c(I)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    iput v3, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->B:I

    .line 49
    .line 50
    if-eq v3, v2, :cond_2

    .line 51
    .line 52
    new-instance v5, Landroid/graphics/PorterDuffColorFilter;

    .line 53
    .line 54
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 55
    .line 56
    invoke-direct {v5, v3, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    const/4 v5, 0x0

    .line 61
    :goto_1
    iput-object v5, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->z:Landroid/graphics/PorterDuffColorFilter;

    .line 62
    .line 63
    iget-object v2, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    const/4 v2, 0x0

    .line 69
    iput-object v2, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->A:Landroid/graphics/PorterDuffColorFilter;

    .line 70
    .line 71
    iget-object v2, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget-object v2, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->z:Landroid/graphics/PorterDuffColorFilter;

    .line 77
    .line 78
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_4

    .line 83
    .line 84
    iget-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->A:Landroid/graphics/PorterDuffColorFilter;

    .line 85
    .line 86
    invoke-static {v1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_3

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    const/4 v0, 0x0

    .line 94
    return v0

    .line 95
    :cond_4
    :goto_2
    return v4
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method public final s()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 2
    .line 3
    iget v1, v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->m:F

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    add-float/2addr v1, v2

    .line 7
    const/high16 v2, 0x3f400000    # 0.75f

    .line 8
    .line 9
    mul-float v2, v2, v1

    .line 10
    .line 11
    float-to-double v2, v2

    .line 12
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    double-to-int v2, v2

    .line 17
    iput v2, v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->o:I

    .line 18
    .line 19
    iget-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 20
    .line 21
    const/high16 v2, 0x3e800000    # 0.25f

    .line 22
    .line 23
    mul-float v1, v1, v2

    .line 24
    .line 25
    float-to-double v1, v1

    .line 26
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 27
    .line 28
    .line 29
    move-result-wide v1

    .line 30
    double-to-int v1, v1

    .line 31
    iput v1, v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->p:I

    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/google/android/material/shape/MaterialShapeDrawable;->r()Z

    .line 34
    .line 35
    .line 36
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 37
    .line 38
    .line 39
    return-void
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method public setAlpha(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 2
    .line 3
    iget v1, v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->k:I

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    iput p1, v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->k:I

    .line 8
    .line 9
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final setShapeAppearanceModel(Lcom/google/android/material/shape/ShapeAppearanceModel;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 2
    .line 3
    iput-object p1, v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->a:Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/material/shape/MaterialShapeDrawable;->invalidateSelf()V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final setTint(I)V
    .locals 0

    .line 1
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lcom/google/android/material/shape/MaterialShapeDrawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public setTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 2
    .line 3
    iput-object p1, v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->e:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/material/shape/MaterialShapeDrawable;->r()Z

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 9
    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/shape/MaterialShapeDrawable;->h:Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->f:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    iput-object p1, v0, Lcom/google/android/material/shape/MaterialShapeDrawable$MaterialShapeDrawableState;->f:Landroid/graphics/PorterDuff$Mode;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/android/material/shape/MaterialShapeDrawable;->r()Z

    .line 10
    .line 11
    .line 12
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method
