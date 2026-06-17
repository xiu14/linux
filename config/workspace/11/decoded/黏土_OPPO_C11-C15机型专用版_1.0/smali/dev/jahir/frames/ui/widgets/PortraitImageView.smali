.class public Ldev/jahir/frames/ui/widgets/PortraitImageView;
.super Lcom/google/android/material/imageview/ShapeableImageView;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field private gradientColors:[I

.field private heightMultiplier:F

.field private final overlay:Landroid/graphics/Paint;

.field private final overlayBounds:Landroid/graphics/RectF;

.field private final overlayGradient:Landroid/graphics/Paint;

.field private final overlayGradientBounds:Landroid/graphics/RectF;

.field private overlayGradientModel:Lcom/google/android/material/shape/ShapeAppearanceModel;

.field private final overlayGradientPath:Landroid/graphics/Path;

.field private final overlayPath:Landroid/graphics/Path;

.field private final pathProvider:Lcom/google/android/material/shape/ShapeAppearancePathProvider;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Ldev/jahir/frames/ui/widgets/PortraitImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Ldev/jahir/frames/ui/widgets/PortraitImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/material/imageview/ShapeableImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/high16 p3, 0x3fa00000    # 1.25f

    .line 5
    iput p3, p0, Ldev/jahir/frames/ui/widgets/PortraitImageView;->heightMultiplier:F

    .line 6
    new-instance p3, Lcom/google/android/material/shape/ShapeAppearancePathProvider;

    invoke-direct {p3}, Lcom/google/android/material/shape/ShapeAppearancePathProvider;-><init>()V

    iput-object p3, p0, Ldev/jahir/frames/ui/widgets/PortraitImageView;->pathProvider:Lcom/google/android/material/shape/ShapeAppearancePathProvider;

    .line 7
    new-instance p3, Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-direct {p3, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p3, p0, Ldev/jahir/frames/ui/widgets/PortraitImageView;->overlay:Landroid/graphics/Paint;

    .line 8
    new-instance p3, Landroid/graphics/RectF;

    invoke-direct {p3}, Landroid/graphics/RectF;-><init>()V

    iput-object p3, p0, Ldev/jahir/frames/ui/widgets/PortraitImageView;->overlayBounds:Landroid/graphics/RectF;

    .line 9
    new-instance p3, Landroid/graphics/Path;

    invoke-direct {p3}, Landroid/graphics/Path;-><init>()V

    iput-object p3, p0, Ldev/jahir/frames/ui/widgets/PortraitImageView;->overlayPath:Landroid/graphics/Path;

    .line 10
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p3, p0, Ldev/jahir/frames/ui/widgets/PortraitImageView;->overlayGradient:Landroid/graphics/Paint;

    .line 11
    new-instance p3, Lcom/google/android/material/shape/ShapeAppearanceModel;

    invoke-direct {p3}, Lcom/google/android/material/shape/ShapeAppearanceModel;-><init>()V

    iput-object p3, p0, Ldev/jahir/frames/ui/widgets/PortraitImageView;->overlayGradientModel:Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 12
    new-instance p3, Landroid/graphics/RectF;

    invoke-direct {p3}, Landroid/graphics/RectF;-><init>()V

    iput-object p3, p0, Ldev/jahir/frames/ui/widgets/PortraitImageView;->overlayGradientBounds:Landroid/graphics/RectF;

    .line 13
    new-instance p3, Landroid/graphics/Path;

    invoke-direct {p3}, Landroid/graphics/Path;-><init>()V

    iput-object p3, p0, Ldev/jahir/frames/ui/widgets/PortraitImageView;->overlayGradientPath:Landroid/graphics/Path;

    const/high16 p3, 0x33000000

    const/4 v0, 0x0

    const/high16 v1, -0x80000000

    .line 14
    filled-new-array {v1, p3, v0}, [I

    move-result-object p3

    iput-object p3, p0, Ldev/jahir/frames/ui/widgets/PortraitImageView;->gradientColors:[I

    .line 15
    invoke-direct {p0, p1, p2}, Ldev/jahir/frames/ui/widgets/PortraitImageView;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/e;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 3
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Ldev/jahir/frames/ui/widgets/PortraitImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final init(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    sget-object v0, Ldev/jahir/frames/R$styleable;->PortraitImageView:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, p2, v0, v1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const-string p2, "obtainStyledAttributes(...)"

    .line 9
    .line 10
    invoke-static {p1, p2}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    :try_start_0
    sget p2, Ldev/jahir/frames/R$styleable;->PortraitImageView_heightMultiplier:I

    .line 14
    .line 15
    const/high16 v0, 0x3fa00000    # 1.25f

    .line 16
    .line 17
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    iput p2, p0, Ldev/jahir/frames/ui/widgets/PortraitImageView;->heightMultiplier:F

    .line 22
    .line 23
    sget p2, Ldev/jahir/frames/R$styleable;->PortraitImageView_overlayColor:I

    .line 24
    .line 25
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    invoke-virtual {p0, p2}, Ldev/jahir/frames/ui/widgets/PortraitImageView;->setOverlayColor(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception p2

    .line 37
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 38
    .line 39
    .line 40
    throw p2
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
.end method

.method private final updateGradientParams()V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-interface {v1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    goto :goto_0

    .line 14
    :catch_0
    nop

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    move-object v1, v2

    .line 17
    :goto_0
    instance-of v3, v1, Landroid/view/ViewGroup;

    .line 18
    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    move-object v2, v1

    .line 22
    check-cast v2, Landroid/view/ViewGroup;

    .line 23
    .line 24
    :cond_1
    if-eqz v2, :cond_2

    .line 25
    .line 26
    sget v1, Ldev/jahir/frames/R$id;->wallpaper_details_background:I

    .line 27
    .line 28
    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 35
    .line 36
    .line 37
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    :cond_2
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    int-to-float v4, v1

    .line 43
    if-lez v0, :cond_3

    .line 44
    .line 45
    int-to-float v0, v0

    .line 46
    sub-float v0, v4, v0

    .line 47
    .line 48
    :goto_2
    move v6, v0

    .line 49
    goto :goto_3

    .line 50
    :cond_3
    const v0, 0x3f333333    # 0.7f

    .line 51
    .line 52
    .line 53
    mul-float v0, v0, v4

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :goto_3
    iget-object v0, p0, Ldev/jahir/frames/ui/widgets/PortraitImageView;->overlayGradientBounds:Landroid/graphics/RectF;

    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    int-to-float v1, v1

    .line 63
    const/4 v2, 0x0

    .line 64
    invoke-virtual {v0, v2, v6, v1, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Ldev/jahir/frames/ui/widgets/PortraitImageView;->overlayGradient:Landroid/graphics/Paint;

    .line 68
    .line 69
    new-instance v2, Landroid/graphics/LinearGradient;

    .line 70
    .line 71
    iget-object v7, p0, Ldev/jahir/frames/ui/widgets/PortraitImageView;->gradientColors:[I

    .line 72
    .line 73
    const/4 v1, 0x3

    .line 74
    new-array v8, v1, [F

    .line 75
    .line 76
    fill-array-data v8, :array_0

    .line 77
    .line 78
    .line 79
    sget-object v9, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 80
    .line 81
    const/4 v3, 0x0

    .line 82
    const/4 v5, 0x0

    .line 83
    invoke-direct/range {v2 .. v9}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 87
    .line 88
    .line 89
    iget-object v0, p0, Ldev/jahir/frames/ui/widgets/PortraitImageView;->overlayGradientPath:Landroid/graphics/Path;

    .line 90
    .line 91
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 92
    .line 93
    .line 94
    iget-object v1, p0, Ldev/jahir/frames/ui/widgets/PortraitImageView;->pathProvider:Lcom/google/android/material/shape/ShapeAppearancePathProvider;

    .line 95
    .line 96
    iget-object v2, p0, Ldev/jahir/frames/ui/widgets/PortraitImageView;->overlayGradientModel:Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 97
    .line 98
    iget-object v4, p0, Ldev/jahir/frames/ui/widgets/PortraitImageView;->overlayGradientBounds:Landroid/graphics/RectF;

    .line 99
    .line 100
    iget-object v6, p0, Ldev/jahir/frames/ui/widgets/PortraitImageView;->overlayGradientPath:Landroid/graphics/Path;

    .line 101
    .line 102
    const/4 v5, 0x0

    .line 103
    const/high16 v3, 0x3f800000    # 1.0f

    .line 104
    .line 105
    invoke-virtual/range {v1 .. v6}, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->a(Lcom/google/android/material/shape/ShapeAppearanceModel;FLandroid/graphics/RectF;Lcom/google/android/material/shape/ShapeAppearancePathProvider$PathListener;Landroid/graphics/Path;)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :array_0
    .array-data 4
        0x0
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data
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

.method private final updateOverlayModel()V
    .locals 2

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/ui/widgets/PortraitImageView;->overlayGradientModel:Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/shape/ShapeAppearanceModel;->f()Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0}, Lcom/google/android/material/imageview/ShapeableImageView;->getShapeAppearanceModel()Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v1, v1, Lcom/google/android/material/shape/ShapeAppearanceModel;->d:Lcom/google/android/material/shape/CornerTreatment;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;->d(Lcom/google/android/material/shape/CornerTreatment;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/android/material/imageview/ShapeableImageView;->getShapeAppearanceModel()Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object v1, v1, Lcom/google/android/material/shape/ShapeAppearanceModel;->c:Lcom/google/android/material/shape/CornerTreatment;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;->f(Lcom/google/android/material/shape/CornerTreatment;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/google/android/material/imageview/ShapeableImageView;->getShapeAppearanceModel()Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iget-object v1, v1, Lcom/google/android/material/shape/ShapeAppearanceModel;->h:Lcom/google/android/material/shape/CornerSize;

    .line 30
    .line 31
    iput-object v1, v0, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;->h:Lcom/google/android/material/shape/CornerSize;

    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/google/android/material/imageview/ShapeableImageView;->getShapeAppearanceModel()Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object v1, v1, Lcom/google/android/material/shape/ShapeAppearanceModel;->g:Lcom/google/android/material/shape/CornerSize;

    .line 38
    .line 39
    iput-object v1, v0, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;->g:Lcom/google/android/material/shape/CornerSize;

    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;->a()Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p0, Ldev/jahir/frames/ui/widgets/PortraitImageView;->overlayGradientModel:Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 46
    .line 47
    return-void
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

.method private final updateOverlayParams()V
    .locals 7

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/ui/widgets/PortraitImageView;->overlayBounds:Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    int-to-float v1, v1

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    int-to-float v2, v2

    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-virtual {v0, v3, v3, v1, v2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Ldev/jahir/frames/ui/widgets/PortraitImageView;->overlayPath:Landroid/graphics/Path;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Ldev/jahir/frames/ui/widgets/PortraitImageView;->pathProvider:Lcom/google/android/material/shape/ShapeAppearancePathProvider;

    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/google/android/material/imageview/ShapeableImageView;->getShapeAppearanceModel()Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iget-object v4, p0, Ldev/jahir/frames/ui/widgets/PortraitImageView;->overlayBounds:Landroid/graphics/RectF;

    .line 29
    .line 30
    iget-object v6, p0, Ldev/jahir/frames/ui/widgets/PortraitImageView;->overlayPath:Landroid/graphics/Path;

    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    const/high16 v3, 0x3f800000    # 1.0f

    .line 34
    .line 35
    invoke-virtual/range {v1 .. v6}, Lcom/google/android/material/shape/ShapeAppearancePathProvider;->a(Lcom/google/android/material/shape/ShapeAppearanceModel;FLandroid/graphics/RectF;Lcom/google/android/material/shape/ShapeAppearancePathProvider$PathListener;Landroid/graphics/Path;)V

    .line 36
    .line 37
    .line 38
    return-void
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
.end method


# virtual methods
.method public onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/widget/ImageView;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ldev/jahir/frames/ui/widgets/PortraitImageView;->updateOverlayModel()V

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

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/google/android/material/imageview/ShapeableImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Ldev/jahir/frames/ui/widgets/PortraitImageView;->overlayPath:Landroid/graphics/Path;

    .line 10
    .line 11
    iget-object v1, p0, Ldev/jahir/frames/ui/widgets/PortraitImageView;->overlay:Landroid/graphics/Paint;

    .line 12
    .line 13
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Ldev/jahir/frames/ui/widgets/PortraitImageView;->overlayGradientPath:Landroid/graphics/Path;

    .line 17
    .line 18
    iget-object v1, p0, Ldev/jahir/frames/ui/widgets/PortraitImageView;->overlayGradient:Landroid/graphics/Paint;

    .line 19
    .line 20
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public onMeasure(II)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    int-to-float p2, p2

    .line 6
    iget v0, p0, Ldev/jahir/frames/ui/widgets/PortraitImageView;->heightMultiplier:F

    .line 7
    .line 8
    mul-float p2, p2, v0

    .line 9
    .line 10
    float-to-int p2, p2

    .line 11
    const/high16 v0, 0x40000000    # 2.0f

    .line 12
    .line 13
    or-int/2addr p2, v0

    .line 14
    invoke-super {p0, p1, p2}, Lcom/google/android/material/imageview/ShapeableImageView;->onMeasure(II)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Ldev/jahir/frames/ui/widgets/PortraitImageView;->updateOverlayParams()V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Ldev/jahir/frames/ui/widgets/PortraitImageView;->updateGradientParams()V

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
.end method

.method public final setGradientColors([I)V
    .locals 1

    .line 1
    const-string v0, "colors"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Ldev/jahir/frames/ui/widgets/PortraitImageView;->gradientColors:[I

    .line 7
    .line 8
    invoke-direct {p0}, Ldev/jahir/frames/ui/widgets/PortraitImageView;->updateGradientParams()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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

.method public final setOverlayColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldev/jahir/frames/ui/widgets/PortraitImageView;->overlay:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 4
    .line 5
    .line 6
    return-void
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public setShapeAppearanceModel(Lcom/google/android/material/shape/ShapeAppearanceModel;)V
    .locals 1

    .line 1
    const-string v0, "shapeAppearanceModel"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(Lcom/google/android/material/shape/ShapeAppearanceModel;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ldev/jahir/frames/ui/widgets/PortraitImageView;->updateOverlayModel()V

    .line 10
    .line 11
    .line 12
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
