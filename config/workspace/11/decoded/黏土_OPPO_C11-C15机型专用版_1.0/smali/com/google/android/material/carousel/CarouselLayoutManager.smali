.class public Lcom/google/android/material/carousel/CarouselLayoutManager;
.super Landroidx/recyclerview/widget/p1;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lcom/google/android/material/carousel/Carousel;
.implements Landroidx/recyclerview/widget/c2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/carousel/CarouselLayoutManager$DebugItemDecoration;,
        Lcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;,
        Lcom/google/android/material/carousel/CarouselLayoutManager$LayoutDirection;,
        Lcom/google/android/material/carousel/CarouselLayoutManager$ChildCalculations;
    }
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public final d:Lcom/google/android/material/carousel/CarouselLayoutManager$DebugItemDecoration;

.field public final e:Lcom/google/android/material/carousel/MultiBrowseCarouselStrategy;

.field public f:Lcom/google/android/material/carousel/KeylineStateList;

.field public g:Lcom/google/android/material/carousel/KeylineState;

.field public h:I

.field public i:Ljava/util/HashMap;

.field public j:Lcom/google/android/material/carousel/CarouselOrientationHelper;

.field public final k:Landroid/view/View$OnLayoutChangeListener;

.field public l:I

.field public m:I

.field public final n:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/material/carousel/MultiBrowseCarouselStrategy;

    invoke-direct {v0}, Lcom/google/android/material/carousel/MultiBrowseCarouselStrategy;-><init>()V

    .line 2
    invoke-direct {p0}, Landroidx/recyclerview/widget/p1;-><init>()V

    .line 3
    new-instance v1, Lcom/google/android/material/carousel/CarouselLayoutManager$DebugItemDecoration;

    invoke-direct {v1}, Lcom/google/android/material/carousel/CarouselLayoutManager$DebugItemDecoration;-><init>()V

    iput-object v1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->d:Lcom/google/android/material/carousel/CarouselLayoutManager$DebugItemDecoration;

    const/4 v1, 0x0

    .line 4
    iput v1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->h:I

    .line 5
    new-instance v2, Lcom/google/android/material/carousel/a;

    invoke-direct {v2, p0}, Lcom/google/android/material/carousel/a;-><init>(Lcom/google/android/material/carousel/CarouselLayoutManager;)V

    iput-object v2, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->k:Landroid/view/View$OnLayoutChangeListener;

    const/4 v2, -0x1

    .line 6
    iput v2, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->m:I

    .line 7
    iput v1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->n:I

    .line 8
    iput-object v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->e:Lcom/google/android/material/carousel/MultiBrowseCarouselStrategy;

    .line 9
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->w()V

    .line 10
    invoke-virtual {p0, v1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->setOrientation(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnknownNullness"
        }
    .end annotation

    .line 11
    invoke-direct {p0}, Landroidx/recyclerview/widget/p1;-><init>()V

    .line 12
    new-instance p3, Lcom/google/android/material/carousel/CarouselLayoutManager$DebugItemDecoration;

    invoke-direct {p3}, Lcom/google/android/material/carousel/CarouselLayoutManager$DebugItemDecoration;-><init>()V

    iput-object p3, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->d:Lcom/google/android/material/carousel/CarouselLayoutManager$DebugItemDecoration;

    const/4 p3, 0x0

    .line 13
    iput p3, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->h:I

    .line 14
    new-instance p4, Lcom/google/android/material/carousel/a;

    invoke-direct {p4, p0}, Lcom/google/android/material/carousel/a;-><init>(Lcom/google/android/material/carousel/CarouselLayoutManager;)V

    iput-object p4, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->k:Landroid/view/View$OnLayoutChangeListener;

    const/4 p4, -0x1

    .line 15
    iput p4, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->m:I

    .line 16
    iput p3, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->n:I

    .line 17
    new-instance p4, Lcom/google/android/material/carousel/MultiBrowseCarouselStrategy;

    invoke-direct {p4}, Lcom/google/android/material/carousel/MultiBrowseCarouselStrategy;-><init>()V

    .line 18
    iput-object p4, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->e:Lcom/google/android/material/carousel/MultiBrowseCarouselStrategy;

    .line 19
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->w()V

    if-eqz p2, :cond_0

    .line 20
    sget-object p4, Lcom/google/android/material/R$styleable;->Carousel:[I

    invoke-virtual {p1, p2, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 21
    sget p2, Lcom/google/android/material/R$styleable;->Carousel_carousel_alignment:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    .line 22
    iput p2, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->n:I

    .line 23
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->w()V

    .line 24
    sget p2, Lcom/google/android/material/R$styleable;->RecyclerView_android_orientation:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    invoke-virtual {p0, p2}, Lcom/google/android/material/carousel/CarouselLayoutManager;->setOrientation(I)V

    .line 25
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_0
    return-void
.end method

.method public static p(Ljava/util/List;FZ)Lcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;
    .locals 13

    .line 1
    const/4 v0, -0x1

    .line 2
    const v1, 0x7f7fffff    # Float.MAX_VALUE

    .line 3
    .line 4
    .line 5
    const v2, -0x800001

    .line 6
    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const v2, 0x7f7fffff    # Float.MAX_VALUE

    .line 10
    .line 11
    .line 12
    const v3, 0x7f7fffff    # Float.MAX_VALUE

    .line 13
    .line 14
    .line 15
    const v4, -0x800001

    .line 16
    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, -0x1

    .line 20
    const/4 v7, -0x1

    .line 21
    const/4 v8, -0x1

    .line 22
    const/4 v9, -0x1

    .line 23
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v10

    .line 27
    if-ge v5, v10, :cond_5

    .line 28
    .line 29
    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v10

    .line 33
    check-cast v10, Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 34
    .line 35
    if-eqz p2, :cond_0

    .line 36
    .line 37
    iget v10, v10, Lcom/google/android/material/carousel/KeylineState$Keyline;->b:F

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    iget v10, v10, Lcom/google/android/material/carousel/KeylineState$Keyline;->a:F

    .line 41
    .line 42
    :goto_1
    sub-float v11, v10, p1

    .line 43
    .line 44
    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    .line 45
    .line 46
    .line 47
    move-result v11

    .line 48
    cmpg-float v12, v10, p1

    .line 49
    .line 50
    if-gtz v12, :cond_1

    .line 51
    .line 52
    cmpg-float v12, v11, v1

    .line 53
    .line 54
    if-gtz v12, :cond_1

    .line 55
    .line 56
    move v6, v5

    .line 57
    move v1, v11

    .line 58
    :cond_1
    cmpl-float v12, v10, p1

    .line 59
    .line 60
    if-lez v12, :cond_2

    .line 61
    .line 62
    cmpg-float v12, v11, v2

    .line 63
    .line 64
    if-gtz v12, :cond_2

    .line 65
    .line 66
    move v8, v5

    .line 67
    move v2, v11

    .line 68
    :cond_2
    cmpg-float v11, v10, v3

    .line 69
    .line 70
    if-gtz v11, :cond_3

    .line 71
    .line 72
    move v7, v5

    .line 73
    move v3, v10

    .line 74
    :cond_3
    cmpl-float v11, v10, v4

    .line 75
    .line 76
    if-lez v11, :cond_4

    .line 77
    .line 78
    move v9, v5

    .line 79
    move v4, v10

    .line 80
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_5
    if-ne v6, v0, :cond_6

    .line 84
    .line 85
    move v6, v7

    .line 86
    :cond_6
    if-ne v8, v0, :cond_7

    .line 87
    .line 88
    move v8, v9

    .line 89
    :cond_7
    new-instance p1, Lcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;

    .line 90
    .line 91
    invoke-interface {p0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    check-cast p2, Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 96
    .line 97
    invoke-interface {p0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    check-cast p0, Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 102
    .line 103
    invoke-direct {p1, p2, p0}, Lcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;-><init>(Lcom/google/android/material/carousel/KeylineState$Keyline;Lcom/google/android/material/carousel/KeylineState$Keyline;)V

    .line 104
    .line 105
    .line 106
    return-object p1
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
.end method


# virtual methods
.method public final canScrollHorizontally()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

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

.method public final canScrollVertically()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    return v0
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

.method public final computeHorizontalScrollExtent(Landroidx/recyclerview/widget/e2;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->f:Lcom/google/android/material/carousel/KeylineStateList;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getItemCount()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x1

    .line 16
    if-gt v0, v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->f:Lcom/google/android/material/carousel/KeylineStateList;

    .line 20
    .line 21
    iget-object v0, v0, Lcom/google/android/material/carousel/KeylineStateList;->a:Lcom/google/android/material/carousel/KeylineState;

    .line 22
    .line 23
    iget v0, v0, Lcom/google/android/material/carousel/KeylineState;->a:F

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->computeHorizontalScrollRange(Landroidx/recyclerview/widget/e2;)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    int-to-float p1, p1

    .line 30
    div-float/2addr v0, p1

    .line 31
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getWidth()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    int-to-float p1, p1

    .line 36
    mul-float p1, p1, v0

    .line 37
    .line 38
    float-to-int p1, p1

    .line 39
    return p1

    .line 40
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 41
    return p1
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

.method public final computeHorizontalScrollOffset(Landroidx/recyclerview/widget/e2;)I
    .locals 0

    .line 1
    iget p1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->a:I

    .line 2
    .line 3
    return p1
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final computeHorizontalScrollRange(Landroidx/recyclerview/widget/e2;)I
    .locals 1

    .line 1
    iget p1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->c:I

    .line 2
    .line 3
    iget v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->b:I

    .line 4
    .line 5
    sub-int/2addr p1, v0

    .line 6
    return p1
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

.method public final computeScrollVectorForPosition(I)Landroid/graphics/PointF;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->f:Lcom/google/android/material/carousel/KeylineStateList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return-object p1

    .line 7
    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->l(I)Lcom/google/android/material/carousel/KeylineState;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0, p1, v0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->n(ILcom/google/android/material/carousel/KeylineState;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iget v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->a:I

    .line 16
    .line 17
    sub-int/2addr p1, v0

    .line 18
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->q()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    new-instance v0, Landroid/graphics/PointF;

    .line 26
    .line 27
    int-to-float p1, p1

    .line 28
    invoke-direct {v0, p1, v1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_1
    new-instance v0, Landroid/graphics/PointF;

    .line 33
    .line 34
    int-to-float p1, p1

    .line 35
    invoke-direct {v0, v1, p1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 36
    .line 37
    .line 38
    return-object v0
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
.end method

.method public final computeVerticalScrollExtent(Landroidx/recyclerview/widget/e2;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->f:Lcom/google/android/material/carousel/KeylineStateList;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getItemCount()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x1

    .line 16
    if-gt v0, v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->f:Lcom/google/android/material/carousel/KeylineStateList;

    .line 20
    .line 21
    iget-object v0, v0, Lcom/google/android/material/carousel/KeylineStateList;->a:Lcom/google/android/material/carousel/KeylineState;

    .line 22
    .line 23
    iget v0, v0, Lcom/google/android/material/carousel/KeylineState;->a:F

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->computeVerticalScrollRange(Landroidx/recyclerview/widget/e2;)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    int-to-float p1, p1

    .line 30
    div-float/2addr v0, p1

    .line 31
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getHeight()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    int-to-float p1, p1

    .line 36
    mul-float p1, p1, v0

    .line 37
    .line 38
    float-to-int p1, p1

    .line 39
    return p1

    .line 40
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 41
    return p1
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

.method public final computeVerticalScrollOffset(Landroidx/recyclerview/widget/e2;)I
    .locals 0

    .line 1
    iget p1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->a:I

    .line 2
    .line 3
    return p1
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final computeVerticalScrollRange(Landroidx/recyclerview/widget/e2;)I
    .locals 1

    .line 1
    iget p1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->c:I

    .line 2
    .line 3
    iget v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->b:I

    .line 4
    .line 5
    sub-int/2addr p1, v0

    .line 6
    return p1
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

.method public final d(Landroid/view/View;ILcom/google/android/material/carousel/CarouselLayoutManager$ChildCalculations;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->g:Lcom/google/android/material/carousel/KeylineState;

    .line 2
    .line 3
    iget v0, v0, Lcom/google/android/material/carousel/KeylineState;->a:F

    .line 4
    .line 5
    const/high16 v1, 0x40000000    # 2.0f

    .line 6
    .line 7
    div-float/2addr v0, v1

    .line 8
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/p1;->addView(Landroid/view/View;I)V

    .line 9
    .line 10
    .line 11
    iget p2, p3, Lcom/google/android/material/carousel/CarouselLayoutManager$ChildCalculations;->c:F

    .line 12
    .line 13
    sub-float v1, p2, v0

    .line 14
    .line 15
    float-to-int v1, v1

    .line 16
    add-float/2addr p2, v0

    .line 17
    float-to-int p2, p2

    .line 18
    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->j:Lcom/google/android/material/carousel/CarouselOrientationHelper;

    .line 19
    .line 20
    invoke-virtual {v0, p1, v1, p2}, Lcom/google/android/material/carousel/CarouselOrientationHelper;->j(Landroid/view/View;II)V

    .line 21
    .line 22
    .line 23
    iget p2, p3, Lcom/google/android/material/carousel/CarouselLayoutManager$ChildCalculations;->b:F

    .line 24
    .line 25
    iget-object p3, p3, Lcom/google/android/material/carousel/CarouselLayoutManager$ChildCalculations;->d:Lcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/material/carousel/CarouselLayoutManager;->y(Landroid/view/View;FLcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;)V

    .line 28
    .line 29
    .line 30
    return-void
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
.end method

.method public final e(FF)F
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->r()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sub-float/2addr p1, p2

    .line 8
    return p1

    .line 9
    :cond_0
    add-float/2addr p1, p2

    .line 10
    return p1
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

.method public final f(ILandroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/e2;)V
    .locals 5

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->i(I)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    :goto_0
    invoke-virtual {p3}, Landroidx/recyclerview/widget/e2;->b()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-ge p1, v1, :cond_2

    .line 10
    .line 11
    invoke-virtual {p0, p2, v0, p1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->u(Landroidx/recyclerview/widget/x1;FI)Lcom/google/android/material/carousel/CarouselLayoutManager$ChildCalculations;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, v1, Lcom/google/android/material/carousel/CarouselLayoutManager$ChildCalculations;->d:Lcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;

    .line 16
    .line 17
    iget v3, v1, Lcom/google/android/material/carousel/CarouselLayoutManager$ChildCalculations;->c:F

    .line 18
    .line 19
    invoke-virtual {p0, v3, v2}, Lcom/google/android/material/carousel/CarouselLayoutManager;->s(FLcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_0
    iget-object v4, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->g:Lcom/google/android/material/carousel/KeylineState;

    .line 27
    .line 28
    iget v4, v4, Lcom/google/android/material/carousel/KeylineState;->a:F

    .line 29
    .line 30
    invoke-virtual {p0, v0, v4}, Lcom/google/android/material/carousel/CarouselLayoutManager;->e(FF)F

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {p0, v3, v2}, Lcom/google/android/material/carousel/CarouselLayoutManager;->t(FLcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    iget-object v2, v1, Lcom/google/android/material/carousel/CarouselLayoutManager$ChildCalculations;->a:Landroid/view/View;

    .line 42
    .line 43
    const/4 v3, -0x1

    .line 44
    invoke-virtual {p0, v2, v3, v1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->d(Landroid/view/View;ILcom/google/android/material/carousel/CarouselLayoutManager$ChildCalculations;)V

    .line 45
    .line 46
    .line 47
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    :goto_2
    return-void
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
.end method

.method public final g(ILandroidx/recyclerview/widget/x1;)V
    .locals 6

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->i(I)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    :goto_0
    if-ltz p1, :cond_3

    .line 6
    .line 7
    invoke-virtual {p0, p2, v0, p1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->u(Landroidx/recyclerview/widget/x1;FI)Lcom/google/android/material/carousel/CarouselLayoutManager$ChildCalculations;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, v1, Lcom/google/android/material/carousel/CarouselLayoutManager$ChildCalculations;->d:Lcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;

    .line 12
    .line 13
    iget v3, v1, Lcom/google/android/material/carousel/CarouselLayoutManager$ChildCalculations;->c:F

    .line 14
    .line 15
    invoke-virtual {p0, v3, v2}, Lcom/google/android/material/carousel/CarouselLayoutManager;->t(FLcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    goto :goto_3

    .line 22
    :cond_0
    iget-object v4, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->g:Lcom/google/android/material/carousel/KeylineState;

    .line 23
    .line 24
    iget v4, v4, Lcom/google/android/material/carousel/KeylineState;->a:F

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->r()Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-eqz v5, :cond_1

    .line 31
    .line 32
    add-float/2addr v0, v4

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    sub-float/2addr v0, v4

    .line 35
    :goto_1
    invoke-virtual {p0, v3, v2}, Lcom/google/android/material/carousel/CarouselLayoutManager;->s(FLcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    iget-object v2, v1, Lcom/google/android/material/carousel/CarouselLayoutManager$ChildCalculations;->a:Landroid/view/View;

    .line 43
    .line 44
    const/4 v3, 0x0

    .line 45
    invoke-virtual {p0, v2, v3, v1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->d(Landroid/view/View;ILcom/google/android/material/carousel/CarouselLayoutManager$ChildCalculations;)V

    .line 46
    .line 47
    .line 48
    :goto_2
    add-int/lit8 p1, p1, -0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    :goto_3
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
.end method

.method public final generateDefaultLayoutParams()Landroidx/recyclerview/widget/q1;
    .locals 2

    .line 1
    new-instance v0, Landroidx/recyclerview/widget/q1;

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    invoke-direct {v0, v1, v1}, Landroidx/recyclerview/widget/q1;-><init>(II)V

    .line 5
    .line 6
    .line 7
    return-object v0
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

.method public final getDecoratedBoundsWithMargins(Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 4

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/p1;->getDecoratedBoundsWithMargins(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Landroid/graphics/Rect;->centerY()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    int-to-float p1, p1

    .line 9
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->q()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p2}, Landroid/graphics/Rect;->centerX()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    int-to-float p1, p1

    .line 20
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->g:Lcom/google/android/material/carousel/KeylineState;

    .line 21
    .line 22
    iget-object v0, v0, Lcom/google/android/material/carousel/KeylineState;->b:Ljava/util/List;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-static {v0, p1, v1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->p(Ljava/util/List;FZ)Lcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, v0, Lcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;->a:Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 30
    .line 31
    iget v2, v1, Lcom/google/android/material/carousel/KeylineState$Keyline;->d:F

    .line 32
    .line 33
    iget-object v0, v0, Lcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;->b:Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 34
    .line 35
    iget v3, v0, Lcom/google/android/material/carousel/KeylineState$Keyline;->d:F

    .line 36
    .line 37
    iget v1, v1, Lcom/google/android/material/carousel/KeylineState$Keyline;->b:F

    .line 38
    .line 39
    iget v0, v0, Lcom/google/android/material/carousel/KeylineState$Keyline;->b:F

    .line 40
    .line 41
    invoke-static {v2, v3, v1, v0, p1}, Lcom/google/android/material/animation/AnimationUtils;->b(FFFFF)F

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->q()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    const/4 v1, 0x0

    .line 50
    const/high16 v2, 0x40000000    # 2.0f

    .line 51
    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    int-to-float v0, v0

    .line 59
    sub-float/2addr v0, p1

    .line 60
    div-float/2addr v0, v2

    .line 61
    goto :goto_0

    .line 62
    :cond_1
    const/4 v0, 0x0

    .line 63
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->q()Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_2

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    int-to-float v1, v1

    .line 75
    sub-float/2addr v1, p1

    .line 76
    div-float/2addr v1, v2

    .line 77
    :goto_1
    iget p1, p2, Landroid/graphics/Rect;->left:I

    .line 78
    .line 79
    int-to-float p1, p1

    .line 80
    add-float/2addr p1, v0

    .line 81
    float-to-int p1, p1

    .line 82
    iget v2, p2, Landroid/graphics/Rect;->top:I

    .line 83
    .line 84
    int-to-float v2, v2

    .line 85
    add-float/2addr v2, v1

    .line 86
    float-to-int v2, v2

    .line 87
    iget v3, p2, Landroid/graphics/Rect;->right:I

    .line 88
    .line 89
    int-to-float v3, v3

    .line 90
    sub-float/2addr v3, v0

    .line 91
    float-to-int v0, v3

    .line 92
    iget v3, p2, Landroid/graphics/Rect;->bottom:I

    .line 93
    .line 94
    int-to-float v3, v3

    .line 95
    sub-float/2addr v3, v1

    .line 96
    float-to-int v1, v3

    .line 97
    invoke-virtual {p2, p1, v2, v0, v1}, Landroid/graphics/Rect;->set(IIII)V

    .line 98
    .line 99
    .line 100
    return-void
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
.end method

.method public final h(Landroid/view/View;FLcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;)F
    .locals 5

    .line 1
    iget-object v0, p3, Lcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;->a:Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 2
    .line 3
    iget v1, v0, Lcom/google/android/material/carousel/KeylineState$Keyline;->b:F

    .line 4
    .line 5
    iget-object p3, p3, Lcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;->b:Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 6
    .line 7
    iget v2, p3, Lcom/google/android/material/carousel/KeylineState$Keyline;->b:F

    .line 8
    .line 9
    iget v3, v0, Lcom/google/android/material/carousel/KeylineState$Keyline;->a:F

    .line 10
    .line 11
    iget v4, p3, Lcom/google/android/material/carousel/KeylineState$Keyline;->a:F

    .line 12
    .line 13
    invoke-static {v1, v2, v3, v4, p2}, Lcom/google/android/material/animation/AnimationUtils;->b(FFFFF)F

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget-object v2, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->g:Lcom/google/android/material/carousel/KeylineState;

    .line 18
    .line 19
    invoke-virtual {v2}, Lcom/google/android/material/carousel/KeylineState;->b()Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    if-eq p3, v2, :cond_1

    .line 24
    .line 25
    iget-object v2, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->g:Lcom/google/android/material/carousel/KeylineState;

    .line 26
    .line 27
    invoke-virtual {v2}, Lcom/google/android/material/carousel/KeylineState;->d()Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    if-ne v0, v2, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return v1

    .line 35
    :cond_1
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Landroidx/recyclerview/widget/q1;

    .line 40
    .line 41
    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->j:Lcom/google/android/material/carousel/CarouselOrientationHelper;

    .line 42
    .line 43
    invoke-virtual {v0, p1}, Lcom/google/android/material/carousel/CarouselOrientationHelper;->b(Landroidx/recyclerview/widget/q1;)F

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->g:Lcom/google/android/material/carousel/KeylineState;

    .line 48
    .line 49
    iget v0, v0, Lcom/google/android/material/carousel/KeylineState;->a:F

    .line 50
    .line 51
    div-float/2addr p1, v0

    .line 52
    sub-float/2addr p2, v4

    .line 53
    const/high16 v0, 0x3f800000    # 1.0f

    .line 54
    .line 55
    iget p3, p3, Lcom/google/android/material/carousel/KeylineState$Keyline;->c:F

    .line 56
    .line 57
    sub-float/2addr v0, p3

    .line 58
    add-float/2addr v0, p1

    .line 59
    mul-float v0, v0, p2

    .line 60
    .line 61
    add-float/2addr v0, v1

    .line 62
    return v0
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
.end method

.method public final i(I)F
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->j:Lcom/google/android/material/carousel/CarouselOrientationHelper;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/material/carousel/CarouselOrientationHelper;->h()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->a:I

    .line 8
    .line 9
    sub-int/2addr v0, v1

    .line 10
    int-to-float v0, v0

    .line 11
    iget-object v1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->g:Lcom/google/android/material/carousel/KeylineState;

    .line 12
    .line 13
    iget v1, v1, Lcom/google/android/material/carousel/KeylineState;->a:F

    .line 14
    .line 15
    int-to-float p1, p1

    .line 16
    mul-float v1, v1, p1

    .line 17
    .line 18
    invoke-virtual {p0, v0, v1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->e(FF)F

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
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

.method public final isAutoMeasureEnabled()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

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

.method public final j(Landroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/e2;)V
    .locals 5

    .line 1
    :goto_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-lez v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/p1;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v3, Landroid/graphics/Rect;

    .line 14
    .line 15
    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-super {p0, v0, v3}, Landroidx/recyclerview/widget/p1;->getDecoratedBoundsWithMargins(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->q()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    invoke-virtual {v3}, Landroid/graphics/Rect;->centerX()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    :goto_1
    int-to-float v3, v3

    .line 32
    goto :goto_2

    .line 33
    :cond_0
    invoke-virtual {v3}, Landroid/graphics/Rect;->centerY()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    goto :goto_1

    .line 38
    :goto_2
    iget-object v4, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->g:Lcom/google/android/material/carousel/KeylineState;

    .line 39
    .line 40
    iget-object v4, v4, Lcom/google/android/material/carousel/KeylineState;->b:Ljava/util/List;

    .line 41
    .line 42
    invoke-static {v4, v3, v2}, Lcom/google/android/material/carousel/CarouselLayoutManager;->p(Ljava/util/List;FZ)Lcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-virtual {p0, v3, v4}, Lcom/google/android/material/carousel/CarouselLayoutManager;->t(FLcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_1

    .line 51
    .line 52
    invoke-virtual {p0, v0, p1}, Landroidx/recyclerview/widget/p1;->removeAndRecycleView(Landroid/view/View;Landroidx/recyclerview/widget/x1;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    :goto_3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    sub-int/2addr v0, v2

    .line 61
    if-ltz v0, :cond_3

    .line 62
    .line 63
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    sub-int/2addr v0, v2

    .line 68
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/p1;->getChildAt(I)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    new-instance v3, Landroid/graphics/Rect;

    .line 73
    .line 74
    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-super {p0, v0, v3}, Landroidx/recyclerview/widget/p1;->getDecoratedBoundsWithMargins(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->q()Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-eqz v4, :cond_2

    .line 85
    .line 86
    invoke-virtual {v3}, Landroid/graphics/Rect;->centerX()I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    :goto_4
    int-to-float v3, v3

    .line 91
    goto :goto_5

    .line 92
    :cond_2
    invoke-virtual {v3}, Landroid/graphics/Rect;->centerY()I

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    goto :goto_4

    .line 97
    :goto_5
    iget-object v4, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->g:Lcom/google/android/material/carousel/KeylineState;

    .line 98
    .line 99
    iget-object v4, v4, Lcom/google/android/material/carousel/KeylineState;->b:Ljava/util/List;

    .line 100
    .line 101
    invoke-static {v4, v3, v2}, Lcom/google/android/material/carousel/CarouselLayoutManager;->p(Ljava/util/List;FZ)Lcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    invoke-virtual {p0, v3, v4}, Lcom/google/android/material/carousel/CarouselLayoutManager;->s(FLcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;)Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-eqz v3, :cond_3

    .line 110
    .line 111
    invoke-virtual {p0, v0, p1}, Landroidx/recyclerview/widget/p1;->removeAndRecycleView(Landroid/view/View;Landroidx/recyclerview/widget/x1;)V

    .line 112
    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-nez v0, :cond_4

    .line 120
    .line 121
    iget v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->h:I

    .line 122
    .line 123
    sub-int/2addr v0, v2

    .line 124
    invoke-virtual {p0, v0, p1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->g(ILandroidx/recyclerview/widget/x1;)V

    .line 125
    .line 126
    .line 127
    iget v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->h:I

    .line 128
    .line 129
    invoke-virtual {p0, v0, p1, p2}, Lcom/google/android/material/carousel/CarouselLayoutManager;->f(ILandroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/e2;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_4
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/p1;->getChildAt(I)Landroid/view/View;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/p1;->getPosition(Landroid/view/View;)I

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    sub-int/2addr v1, v2

    .line 146
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/p1;->getChildAt(I)Landroid/view/View;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/p1;->getPosition(Landroid/view/View;)I

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    sub-int/2addr v0, v2

    .line 155
    invoke-virtual {p0, v0, p1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->g(ILandroidx/recyclerview/widget/x1;)V

    .line 156
    .line 157
    .line 158
    add-int/2addr v1, v2

    .line 159
    invoke-virtual {p0, v1, p1, p2}, Lcom/google/android/material/carousel/CarouselLayoutManager;->f(ILandroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/e2;)V

    .line 160
    .line 161
    .line 162
    return-void
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
.end method

.method public final k()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0

    .line 12
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getHeight()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0
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

.method public final l(I)Lcom/google/android/material/carousel/KeylineState;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->i:Ljava/util/HashMap;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getItemCount()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/lit8 v1, v1, -0x1

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-static {p1, v2, v1}, La/a;->m(III)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Lcom/google/android/material/carousel/KeylineState;

    .line 29
    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_0
    iget-object p1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->f:Lcom/google/android/material/carousel/KeylineStateList;

    .line 34
    .line 35
    iget-object p1, p1, Lcom/google/android/material/carousel/KeylineStateList;->a:Lcom/google/android/material/carousel/KeylineState;

    .line 36
    .line 37
    return-object p1
.end method

.method public final m(I)I
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->f:Lcom/google/android/material/carousel/KeylineStateList;

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->a:I

    .line 4
    .line 5
    int-to-float v1, v1

    .line 6
    iget v2, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->b:I

    .line 7
    .line 8
    int-to-float v2, v2

    .line 9
    iget v3, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->c:I

    .line 10
    .line 11
    int-to-float v3, v3

    .line 12
    const/4 v4, 0x1

    .line 13
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/material/carousel/KeylineStateList;->b(FFFZ)Lcom/google/android/material/carousel/KeylineState;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0, p1, v0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->n(ILcom/google/android/material/carousel/KeylineState;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget v1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->a:I

    .line 22
    .line 23
    sub-int/2addr v0, v1

    .line 24
    iget-object v1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->i:Ljava/util/HashMap;

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->l(I)Lcom/google/android/material/carousel/KeylineState;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {p0, p1, v1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->n(ILcom/google/android/material/carousel/KeylineState;)I

    .line 33
    .line 34
    .line 35
    :cond_0
    return v0
    .line 36
    .line 37
.end method

.method public final measureChildWithMargins(Landroid/view/View;II)V
    .locals 7

    .line 1
    instance-of v0, p1, Lcom/google/android/material/carousel/Maskable;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroidx/recyclerview/widget/q1;

    .line 10
    .line 11
    new-instance v1, Landroid/graphics/Rect;

    .line 12
    .line 13
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1, v1}, Landroidx/recyclerview/widget/p1;->calculateItemDecorationsForChild(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 17
    .line 18
    .line 19
    iget v2, v1, Landroid/graphics/Rect;->left:I

    .line 20
    .line 21
    iget v3, v1, Landroid/graphics/Rect;->right:I

    .line 22
    .line 23
    add-int/2addr v2, v3

    .line 24
    add-int/2addr v2, p2

    .line 25
    iget p2, v1, Landroid/graphics/Rect;->top:I

    .line 26
    .line 27
    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    .line 28
    .line 29
    add-int/2addr p2, v1

    .line 30
    add-int/2addr p2, p3

    .line 31
    iget-object p3, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->f:Lcom/google/android/material/carousel/KeylineStateList;

    .line 32
    .line 33
    if-eqz p3, :cond_0

    .line 34
    .line 35
    iget-object v1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->j:Lcom/google/android/material/carousel/CarouselOrientationHelper;

    .line 36
    .line 37
    iget v1, v1, Lcom/google/android/material/carousel/CarouselOrientationHelper;->a:I

    .line 38
    .line 39
    if-nez v1, :cond_0

    .line 40
    .line 41
    iget-object v1, p3, Lcom/google/android/material/carousel/KeylineStateList;->a:Lcom/google/android/material/carousel/KeylineState;

    .line 42
    .line 43
    iget v1, v1, Lcom/google/android/material/carousel/KeylineState;->a:F

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 47
    .line 48
    int-to-float v1, v1

    .line 49
    :goto_0
    if-eqz p3, :cond_1

    .line 50
    .line 51
    iget-object v3, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->j:Lcom/google/android/material/carousel/CarouselOrientationHelper;

    .line 52
    .line 53
    iget v3, v3, Lcom/google/android/material/carousel/CarouselOrientationHelper;->a:I

    .line 54
    .line 55
    const/4 v4, 0x1

    .line 56
    if-ne v3, v4, :cond_1

    .line 57
    .line 58
    iget-object p3, p3, Lcom/google/android/material/carousel/KeylineStateList;->a:Lcom/google/android/material/carousel/KeylineState;

    .line 59
    .line 60
    iget p3, p3, Lcom/google/android/material/carousel/KeylineState;->a:F

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    iget p3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 64
    .line 65
    int-to-float p3, p3

    .line 66
    :goto_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getWidth()I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getWidthMode()I

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getPaddingLeft()I

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getPaddingRight()I

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    add-int/2addr v6, v5

    .line 83
    iget v5, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 84
    .line 85
    add-int/2addr v6, v5

    .line 86
    iget v5, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 87
    .line 88
    add-int/2addr v6, v5

    .line 89
    add-int/2addr v6, v2

    .line 90
    float-to-int v1, v1

    .line 91
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->q()Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    invoke-static {v3, v4, v6, v1, v2}, Landroidx/recyclerview/widget/p1;->getChildMeasureSpec(IIIIZ)I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getHeight()I

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getHeightMode()I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getPaddingTop()I

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getPaddingBottom()I

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    add-int/2addr v5, v4

    .line 116
    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 117
    .line 118
    add-int/2addr v5, v4

    .line 119
    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 120
    .line 121
    add-int/2addr v5, v0

    .line 122
    add-int/2addr v5, p2

    .line 123
    float-to-int p2, p3

    .line 124
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->canScrollVertically()Z

    .line 125
    .line 126
    .line 127
    move-result p3

    .line 128
    invoke-static {v2, v3, v5, p2, p3}, Landroidx/recyclerview/widget/p1;->getChildMeasureSpec(IIIIZ)I

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    invoke-virtual {p1, v1, p2}, Landroid/view/View;->measure(II)V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 137
    .line 138
    const-string p2, "All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup."

    .line 139
    .line 140
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    throw p1
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
.end method

.method public final n(ILcom/google/android/material/carousel/KeylineState;)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->r()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/high16 v1, 0x40000000    # 2.0f

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->k()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    int-to-float v0, v0

    .line 14
    invoke-virtual {p2}, Lcom/google/android/material/carousel/KeylineState;->c()Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget v2, v2, Lcom/google/android/material/carousel/KeylineState$Keyline;->a:F

    .line 19
    .line 20
    sub-float/2addr v0, v2

    .line 21
    int-to-float p1, p1

    .line 22
    iget p2, p2, Lcom/google/android/material/carousel/KeylineState;->a:F

    .line 23
    .line 24
    mul-float p1, p1, p2

    .line 25
    .line 26
    sub-float/2addr v0, p1

    .line 27
    div-float/2addr p2, v1

    .line 28
    sub-float/2addr v0, p2

    .line 29
    float-to-int p1, v0

    .line 30
    return p1

    .line 31
    :cond_0
    int-to-float p1, p1

    .line 32
    iget v0, p2, Lcom/google/android/material/carousel/KeylineState;->a:F

    .line 33
    .line 34
    mul-float p1, p1, v0

    .line 35
    .line 36
    invoke-virtual {p2}, Lcom/google/android/material/carousel/KeylineState;->a()Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iget v0, v0, Lcom/google/android/material/carousel/KeylineState$Keyline;->a:F

    .line 41
    .line 42
    sub-float/2addr p1, v0

    .line 43
    iget p2, p2, Lcom/google/android/material/carousel/KeylineState;->a:F

    .line 44
    .line 45
    div-float/2addr p2, v1

    .line 46
    add-float/2addr p2, p1

    .line 47
    float-to-int p1, p2

    .line 48
    return p1
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

.method public final o(ILcom/google/android/material/carousel/KeylineState;)I
    .locals 6

    .line 1
    iget-object v0, p2, Lcom/google/android/material/carousel/KeylineState;->b:Ljava/util/List;

    .line 2
    .line 3
    iget v1, p2, Lcom/google/android/material/carousel/KeylineState;->c:I

    .line 4
    .line 5
    iget v2, p2, Lcom/google/android/material/carousel/KeylineState;->d:I

    .line 6
    .line 7
    add-int/lit8 v2, v2, 0x1

    .line 8
    .line 9
    invoke-interface {v0, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const v1, 0x7fffffff

    .line 18
    .line 19
    .line 20
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 31
    .line 32
    int-to-float v3, p1

    .line 33
    iget v4, p2, Lcom/google/android/material/carousel/KeylineState;->a:F

    .line 34
    .line 35
    mul-float v3, v3, v4

    .line 36
    .line 37
    const/high16 v5, 0x40000000    # 2.0f

    .line 38
    .line 39
    div-float/2addr v4, v5

    .line 40
    add-float/2addr v4, v3

    .line 41
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->r()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_1

    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->k()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    int-to-float v3, v3

    .line 52
    iget v2, v2, Lcom/google/android/material/carousel/KeylineState$Keyline;->a:F

    .line 53
    .line 54
    sub-float/2addr v3, v2

    .line 55
    sub-float/2addr v3, v4

    .line 56
    float-to-int v2, v3

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    iget v2, v2, Lcom/google/android/material/carousel/KeylineState$Keyline;->a:F

    .line 59
    .line 60
    sub-float/2addr v4, v2

    .line 61
    float-to-int v2, v4

    .line 62
    :goto_1
    iget v3, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->a:I

    .line 63
    .line 64
    sub-int/2addr v2, v3

    .line 65
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-le v3, v4, :cond_0

    .line 74
    .line 75
    move v1, v2

    .line 76
    goto :goto_0

    .line 77
    :cond_2
    return v1
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
.end method

.method public final onAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/p1;->onAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->e:Lcom/google/android/material/carousel/MultiBrowseCarouselStrategy;

    .line 9
    .line 10
    iget v2, v1, Lcom/google/android/material/carousel/CarouselStrategy;->a:F

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    cmpl-float v4, v2, v3

    .line 14
    .line 15
    if-lez v4, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    sget v4, Lcom/google/android/material/R$dimen;->m3_carousel_small_item_size_min:I

    .line 23
    .line 24
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDimension(I)F

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    :goto_0
    iput v2, v1, Lcom/google/android/material/carousel/CarouselStrategy;->a:F

    .line 29
    .line 30
    iget v2, v1, Lcom/google/android/material/carousel/CarouselStrategy;->b:F

    .line 31
    .line 32
    cmpl-float v3, v2, v3

    .line 33
    .line 34
    if-lez v3, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sget v2, Lcom/google/android/material/R$dimen;->m3_carousel_small_item_size_max:I

    .line 42
    .line 43
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    :goto_1
    iput v2, v1, Lcom/google/android/material/carousel/CarouselStrategy;->b:F

    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->w()V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->k:Landroid/view/View$OnLayoutChangeListener;

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 55
    .line 56
    .line 57
    return-void
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

.method public final onDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/x1;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/p1;->onDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->k:Landroid/view/View$OnLayoutChangeListener;

    .line 5
    .line 6
    invoke-virtual {p1, p2}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

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

.method public final onFocusSearchFailed(Landroid/view/View;ILandroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/e2;)Landroid/view/View;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result p4

    .line 5
    if-nez p4, :cond_0

    .line 6
    .line 7
    goto/16 :goto_4

    .line 8
    .line 9
    :cond_0
    iget-object p4, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->j:Lcom/google/android/material/carousel/CarouselOrientationHelper;

    .line 10
    .line 11
    iget p4, p4, Lcom/google/android/material/carousel/CarouselOrientationHelper;->a:I

    .line 12
    .line 13
    const/high16 v0, -0x80000000

    .line 14
    .line 15
    const/4 v1, -0x1

    .line 16
    const/4 v2, 0x1

    .line 17
    if-eq p2, v2, :cond_5

    .line 18
    .line 19
    const/4 v3, 0x2

    .line 20
    if-eq p2, v3, :cond_3

    .line 21
    .line 22
    const/16 v3, 0x11

    .line 23
    .line 24
    if-eq p2, v3, :cond_7

    .line 25
    .line 26
    const/16 v3, 0x21

    .line 27
    .line 28
    if-eq p2, v3, :cond_6

    .line 29
    .line 30
    const/16 v3, 0x42

    .line 31
    .line 32
    if-eq p2, v3, :cond_4

    .line 33
    .line 34
    const/16 v3, 0x82

    .line 35
    .line 36
    if-eq p2, v3, :cond_2

    .line 37
    .line 38
    new-instance p4, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v3, "Unknown focus request:"

    .line 41
    .line 42
    invoke-direct {p4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    const-string p4, "CarouselLayoutManager"

    .line 53
    .line 54
    invoke-static {p4, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 55
    .line 56
    .line 57
    :cond_1
    const/high16 p2, -0x80000000

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    if-ne p4, v2, :cond_1

    .line 61
    .line 62
    :cond_3
    :goto_0
    const/4 p2, 0x1

    .line 63
    goto :goto_2

    .line 64
    :cond_4
    if-nez p4, :cond_1

    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->r()Z

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    if-eqz p2, :cond_3

    .line 71
    .line 72
    :cond_5
    :goto_1
    const/4 p2, -0x1

    .line 73
    goto :goto_2

    .line 74
    :cond_6
    if-ne p4, v2, :cond_1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_7
    if-nez p4, :cond_1

    .line 78
    .line 79
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->r()Z

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    if-eqz p2, :cond_5

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :goto_2
    if-ne p2, v0, :cond_8

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_8
    const/4 p4, 0x0

    .line 90
    if-ne p2, v1, :cond_d

    .line 91
    .line 92
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/p1;->getPosition(Landroid/view/View;)I

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-nez p1, :cond_9

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_9
    invoke-virtual {p0, p4}, Landroidx/recyclerview/widget/p1;->getChildAt(I)Landroid/view/View;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/p1;->getPosition(Landroid/view/View;)I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    sub-int/2addr p1, v2

    .line 108
    if-ltz p1, :cond_b

    .line 109
    .line 110
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getItemCount()I

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    if-lt p1, p2, :cond_a

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_a
    invoke-virtual {p0, p1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->i(I)F

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    invoke-virtual {p0, p3, p2, p1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->u(Landroidx/recyclerview/widget/x1;FI)Lcom/google/android/material/carousel/CarouselLayoutManager$ChildCalculations;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    iget-object p2, p1, Lcom/google/android/material/carousel/CarouselLayoutManager$ChildCalculations;->a:Landroid/view/View;

    .line 126
    .line 127
    invoke-virtual {p0, p2, p4, p1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->d(Landroid/view/View;ILcom/google/android/material/carousel/CarouselLayoutManager$ChildCalculations;)V

    .line 128
    .line 129
    .line 130
    :cond_b
    :goto_3
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->r()Z

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    if-eqz p1, :cond_c

    .line 135
    .line 136
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    add-int/lit8 p4, p1, -0x1

    .line 141
    .line 142
    :cond_c
    invoke-virtual {p0, p4}, Landroidx/recyclerview/widget/p1;->getChildAt(I)Landroid/view/View;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    return-object p1

    .line 147
    :cond_d
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/p1;->getPosition(Landroid/view/View;)I

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getItemCount()I

    .line 152
    .line 153
    .line 154
    move-result p2

    .line 155
    sub-int/2addr p2, v2

    .line 156
    if-ne p1, p2, :cond_e

    .line 157
    .line 158
    :goto_4
    const/4 p1, 0x0

    .line 159
    return-object p1

    .line 160
    :cond_e
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    sub-int/2addr p1, v2

    .line 165
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/p1;->getChildAt(I)Landroid/view/View;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/p1;->getPosition(Landroid/view/View;)I

    .line 170
    .line 171
    .line 172
    move-result p1

    .line 173
    add-int/2addr p1, v2

    .line 174
    if-ltz p1, :cond_10

    .line 175
    .line 176
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getItemCount()I

    .line 177
    .line 178
    .line 179
    move-result p2

    .line 180
    if-lt p1, p2, :cond_f

    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_f
    invoke-virtual {p0, p1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->i(I)F

    .line 184
    .line 185
    .line 186
    move-result p2

    .line 187
    invoke-virtual {p0, p3, p2, p1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->u(Landroidx/recyclerview/widget/x1;FI)Lcom/google/android/material/carousel/CarouselLayoutManager$ChildCalculations;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    iget-object p2, p1, Lcom/google/android/material/carousel/CarouselLayoutManager$ChildCalculations;->a:Landroid/view/View;

    .line 192
    .line 193
    invoke-virtual {p0, p2, v1, p1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->d(Landroid/view/View;ILcom/google/android/material/carousel/CarouselLayoutManager$ChildCalculations;)V

    .line 194
    .line 195
    .line 196
    :cond_10
    :goto_5
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->r()Z

    .line 197
    .line 198
    .line 199
    move-result p1

    .line 200
    if-eqz p1, :cond_11

    .line 201
    .line 202
    goto :goto_6

    .line 203
    :cond_11
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    add-int/lit8 p4, p1, -0x1

    .line 208
    .line 209
    :goto_6
    invoke-virtual {p0, p4}, Landroidx/recyclerview/widget/p1;->getChildAt(I)Landroid/view/View;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    return-object p1
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
.end method

.method public final onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/p1;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-lez v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/p1;->getChildAt(I)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/p1;->getPosition(Landroid/view/View;)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/lit8 v0, v0, -0x1

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/p1;->getChildAt(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/p1;->getPosition(Landroid/view/View;)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    .line 37
    .line 38
    .line 39
    :cond_0
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

.method public final onItemsAdded(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getItemCount()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget p2, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->l:I

    .line 6
    .line 7
    if-eq p1, p2, :cond_4

    .line 8
    .line 9
    iget-object p3, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->f:Lcom/google/android/material/carousel/KeylineStateList;

    .line 10
    .line 11
    if-nez p3, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object p3, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->e:Lcom/google/android/material/carousel/MultiBrowseCarouselStrategy;

    .line 15
    .line 16
    iget v0, p3, Lcom/google/android/material/carousel/MultiBrowseCarouselStrategy;->c:I

    .line 17
    .line 18
    if-ge p2, v0, :cond_1

    .line 19
    .line 20
    invoke-interface {p0}, Lcom/google/android/material/carousel/Carousel;->getItemCount()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget v1, p3, Lcom/google/android/material/carousel/MultiBrowseCarouselStrategy;->c:I

    .line 25
    .line 26
    if-ge v0, v1, :cond_2

    .line 27
    .line 28
    :cond_1
    iget v0, p3, Lcom/google/android/material/carousel/MultiBrowseCarouselStrategy;->c:I

    .line 29
    .line 30
    if-lt p2, v0, :cond_3

    .line 31
    .line 32
    invoke-interface {p0}, Lcom/google/android/material/carousel/Carousel;->getItemCount()I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    iget p3, p3, Lcom/google/android/material/carousel/MultiBrowseCarouselStrategy;->c:I

    .line 37
    .line 38
    if-ge p2, p3, :cond_3

    .line 39
    .line 40
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->w()V

    .line 41
    .line 42
    .line 43
    :cond_3
    iput p1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->l:I

    .line 44
    .line 45
    :cond_4
    :goto_0
    return-void
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
.end method

.method public final onItemsRemoved(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getItemCount()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget p2, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->l:I

    .line 6
    .line 7
    if-eq p1, p2, :cond_4

    .line 8
    .line 9
    iget-object p3, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->f:Lcom/google/android/material/carousel/KeylineStateList;

    .line 10
    .line 11
    if-nez p3, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object p3, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->e:Lcom/google/android/material/carousel/MultiBrowseCarouselStrategy;

    .line 15
    .line 16
    iget v0, p3, Lcom/google/android/material/carousel/MultiBrowseCarouselStrategy;->c:I

    .line 17
    .line 18
    if-ge p2, v0, :cond_1

    .line 19
    .line 20
    invoke-interface {p0}, Lcom/google/android/material/carousel/Carousel;->getItemCount()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget v1, p3, Lcom/google/android/material/carousel/MultiBrowseCarouselStrategy;->c:I

    .line 25
    .line 26
    if-ge v0, v1, :cond_2

    .line 27
    .line 28
    :cond_1
    iget v0, p3, Lcom/google/android/material/carousel/MultiBrowseCarouselStrategy;->c:I

    .line 29
    .line 30
    if-lt p2, v0, :cond_3

    .line 31
    .line 32
    invoke-interface {p0}, Lcom/google/android/material/carousel/Carousel;->getItemCount()I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    iget p3, p3, Lcom/google/android/material/carousel/MultiBrowseCarouselStrategy;->c:I

    .line 37
    .line 38
    if-ge p2, p3, :cond_3

    .line 39
    .line 40
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->w()V

    .line 41
    .line 42
    .line 43
    :cond_3
    iput p1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->l:I

    .line 44
    .line 45
    :cond_4
    :goto_0
    return-void
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
.end method

.method public final onLayoutChildren(Landroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/e2;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p2 .. p2}, Landroidx/recyclerview/widget/e2;->b()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-lez v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->k()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    int-to-float v1, v1

    .line 15
    const/4 v3, 0x0

    .line 16
    cmpg-float v1, v1, v3

    .line 17
    .line 18
    if-gtz v1, :cond_1

    .line 19
    .line 20
    :cond_0
    const/4 v14, 0x0

    .line 21
    goto/16 :goto_12

    .line 22
    .line 23
    :cond_1
    invoke-virtual {v0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->r()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    iget-object v3, v0, Lcom/google/android/material/carousel/CarouselLayoutManager;->f:Lcom/google/android/material/carousel/KeylineStateList;

    .line 28
    .line 29
    const/4 v4, 0x1

    .line 30
    if-nez v3, :cond_2

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    const/4 v3, 0x0

    .line 35
    :goto_0
    if-eqz v3, :cond_3

    .line 36
    .line 37
    invoke-virtual/range {p0 .. p1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->v(Landroidx/recyclerview/widget/x1;)V

    .line 38
    .line 39
    .line 40
    :cond_3
    iget-object v5, v0, Lcom/google/android/material/carousel/CarouselLayoutManager;->f:Lcom/google/android/material/carousel/KeylineStateList;

    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->r()Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-eqz v6, :cond_4

    .line 47
    .line 48
    invoke-virtual {v5}, Lcom/google/android/material/carousel/KeylineStateList;->a()Lcom/google/android/material/carousel/KeylineState;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    goto :goto_1

    .line 53
    :cond_4
    invoke-virtual {v5}, Lcom/google/android/material/carousel/KeylineStateList;->c()Lcom/google/android/material/carousel/KeylineState;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    :goto_1
    if-eqz v6, :cond_5

    .line 58
    .line 59
    invoke-virtual {v5}, Lcom/google/android/material/carousel/KeylineState;->c()Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    goto :goto_2

    .line 64
    :cond_5
    invoke-virtual {v5}, Lcom/google/android/material/carousel/KeylineState;->a()Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    :goto_2
    iget v6, v6, Lcom/google/android/material/carousel/KeylineState$Keyline;->a:F

    .line 69
    .line 70
    iget v5, v5, Lcom/google/android/material/carousel/KeylineState;->a:F

    .line 71
    .line 72
    const/high16 v7, 0x40000000    # 2.0f

    .line 73
    .line 74
    div-float/2addr v5, v7

    .line 75
    invoke-virtual {v0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->r()Z

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    if-eqz v7, :cond_6

    .line 80
    .line 81
    add-float/2addr v6, v5

    .line 82
    goto :goto_3

    .line 83
    :cond_6
    sub-float/2addr v6, v5

    .line 84
    :goto_3
    iget-object v5, v0, Lcom/google/android/material/carousel/CarouselLayoutManager;->j:Lcom/google/android/material/carousel/CarouselOrientationHelper;

    .line 85
    .line 86
    invoke-virtual {v5}, Lcom/google/android/material/carousel/CarouselOrientationHelper;->h()I

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    int-to-float v5, v5

    .line 91
    sub-float/2addr v5, v6

    .line 92
    float-to-int v5, v5

    .line 93
    iget-object v6, v0, Lcom/google/android/material/carousel/CarouselLayoutManager;->f:Lcom/google/android/material/carousel/KeylineStateList;

    .line 94
    .line 95
    invoke-virtual {v0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->r()Z

    .line 96
    .line 97
    .line 98
    move-result v7

    .line 99
    if-eqz v7, :cond_7

    .line 100
    .line 101
    invoke-virtual {v6}, Lcom/google/android/material/carousel/KeylineStateList;->c()Lcom/google/android/material/carousel/KeylineState;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    goto :goto_4

    .line 106
    :cond_7
    invoke-virtual {v6}, Lcom/google/android/material/carousel/KeylineStateList;->a()Lcom/google/android/material/carousel/KeylineState;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    :goto_4
    if-eqz v7, :cond_8

    .line 111
    .line 112
    invoke-virtual {v6}, Lcom/google/android/material/carousel/KeylineState;->a()Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    goto :goto_5

    .line 117
    :cond_8
    invoke-virtual {v6}, Lcom/google/android/material/carousel/KeylineState;->c()Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 118
    .line 119
    .line 120
    move-result-object v8

    .line 121
    :goto_5
    invoke-virtual/range {p2 .. p2}, Landroidx/recyclerview/widget/e2;->b()I

    .line 122
    .line 123
    .line 124
    move-result v9

    .line 125
    sub-int/2addr v9, v4

    .line 126
    int-to-float v9, v9

    .line 127
    iget v6, v6, Lcom/google/android/material/carousel/KeylineState;->a:F

    .line 128
    .line 129
    mul-float v9, v9, v6

    .line 130
    .line 131
    if-eqz v7, :cond_9

    .line 132
    .line 133
    const/high16 v6, -0x40800000    # -1.0f

    .line 134
    .line 135
    goto :goto_6

    .line 136
    :cond_9
    const/high16 v6, 0x3f800000    # 1.0f

    .line 137
    .line 138
    :goto_6
    mul-float v9, v9, v6

    .line 139
    .line 140
    if-eqz v7, :cond_a

    .line 141
    .line 142
    iget v6, v8, Lcom/google/android/material/carousel/KeylineState$Keyline;->g:F

    .line 143
    .line 144
    neg-float v6, v6

    .line 145
    goto :goto_7

    .line 146
    :cond_a
    iget v6, v8, Lcom/google/android/material/carousel/KeylineState$Keyline;->h:F

    .line 147
    .line 148
    :goto_7
    iget v10, v8, Lcom/google/android/material/carousel/KeylineState$Keyline;->a:F

    .line 149
    .line 150
    iget-object v11, v0, Lcom/google/android/material/carousel/CarouselLayoutManager;->j:Lcom/google/android/material/carousel/CarouselOrientationHelper;

    .line 151
    .line 152
    invoke-virtual {v11}, Lcom/google/android/material/carousel/CarouselOrientationHelper;->h()I

    .line 153
    .line 154
    .line 155
    move-result v11

    .line 156
    int-to-float v11, v11

    .line 157
    sub-float/2addr v10, v11

    .line 158
    iget-object v11, v0, Lcom/google/android/material/carousel/CarouselLayoutManager;->j:Lcom/google/android/material/carousel/CarouselOrientationHelper;

    .line 159
    .line 160
    invoke-virtual {v11}, Lcom/google/android/material/carousel/CarouselOrientationHelper;->e()I

    .line 161
    .line 162
    .line 163
    move-result v11

    .line 164
    int-to-float v11, v11

    .line 165
    iget v8, v8, Lcom/google/android/material/carousel/KeylineState$Keyline;->a:F

    .line 166
    .line 167
    sub-float/2addr v11, v8

    .line 168
    sub-float/2addr v9, v10

    .line 169
    add-float/2addr v9, v11

    .line 170
    add-float/2addr v9, v6

    .line 171
    float-to-int v6, v9

    .line 172
    if-eqz v7, :cond_b

    .line 173
    .line 174
    invoke-static {v2, v6}, Ljava/lang/Math;->min(II)I

    .line 175
    .line 176
    .line 177
    move-result v6

    .line 178
    goto :goto_8

    .line 179
    :cond_b
    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    .line 180
    .line 181
    .line 182
    move-result v6

    .line 183
    :goto_8
    if-eqz v1, :cond_c

    .line 184
    .line 185
    move v7, v6

    .line 186
    goto :goto_9

    .line 187
    :cond_c
    move v7, v5

    .line 188
    :goto_9
    iput v7, v0, Lcom/google/android/material/carousel/CarouselLayoutManager;->b:I

    .line 189
    .line 190
    if-eqz v1, :cond_d

    .line 191
    .line 192
    move v6, v5

    .line 193
    :cond_d
    iput v6, v0, Lcom/google/android/material/carousel/CarouselLayoutManager;->c:I

    .line 194
    .line 195
    if-eqz v3, :cond_18

    .line 196
    .line 197
    iput v5, v0, Lcom/google/android/material/carousel/CarouselLayoutManager;->a:I

    .line 198
    .line 199
    iget-object v1, v0, Lcom/google/android/material/carousel/CarouselLayoutManager;->f:Lcom/google/android/material/carousel/KeylineStateList;

    .line 200
    .line 201
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getItemCount()I

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    iget v5, v0, Lcom/google/android/material/carousel/CarouselLayoutManager;->b:I

    .line 206
    .line 207
    iget v6, v0, Lcom/google/android/material/carousel/CarouselLayoutManager;->c:I

    .line 208
    .line 209
    invoke-virtual {v0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->r()Z

    .line 210
    .line 211
    .line 212
    move-result v7

    .line 213
    iget-object v8, v1, Lcom/google/android/material/carousel/KeylineStateList;->b:Ljava/util/List;

    .line 214
    .line 215
    iget-object v9, v1, Lcom/google/android/material/carousel/KeylineStateList;->c:Ljava/util/List;

    .line 216
    .line 217
    iget-object v10, v1, Lcom/google/android/material/carousel/KeylineStateList;->a:Lcom/google/android/material/carousel/KeylineState;

    .line 218
    .line 219
    iget v10, v10, Lcom/google/android/material/carousel/KeylineState;->a:F

    .line 220
    .line 221
    new-instance v11, Ljava/util/HashMap;

    .line 222
    .line 223
    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 224
    .line 225
    .line 226
    const/4 v12, 0x0

    .line 227
    const/4 v13, 0x0

    .line 228
    :goto_a
    const/4 v14, -0x1

    .line 229
    if-ge v12, v3, :cond_12

    .line 230
    .line 231
    if-eqz v7, :cond_e

    .line 232
    .line 233
    sub-int v15, v3, v12

    .line 234
    .line 235
    sub-int/2addr v15, v4

    .line 236
    :goto_b
    const/16 v16, 0x1

    .line 237
    .line 238
    goto :goto_c

    .line 239
    :cond_e
    move v15, v12

    .line 240
    goto :goto_b

    .line 241
    :goto_c
    int-to-float v4, v15

    .line 242
    mul-float v4, v4, v10

    .line 243
    .line 244
    if-eqz v7, :cond_f

    .line 245
    .line 246
    goto :goto_d

    .line 247
    :cond_f
    const/4 v14, 0x1

    .line 248
    :goto_d
    int-to-float v14, v14

    .line 249
    mul-float v4, v4, v14

    .line 250
    .line 251
    int-to-float v14, v6

    .line 252
    iget v2, v1, Lcom/google/android/material/carousel/KeylineStateList;->g:F

    .line 253
    .line 254
    sub-float/2addr v14, v2

    .line 255
    cmpl-float v2, v4, v14

    .line 256
    .line 257
    if-gtz v2, :cond_10

    .line 258
    .line 259
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    sub-int v2, v3, v2

    .line 264
    .line 265
    if-lt v12, v2, :cond_11

    .line 266
    .line 267
    :cond_10
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 272
    .line 273
    .line 274
    move-result v4

    .line 275
    add-int/lit8 v4, v4, -0x1

    .line 276
    .line 277
    const/4 v14, 0x0

    .line 278
    invoke-static {v13, v14, v4}, La/a;->m(III)I

    .line 279
    .line 280
    .line 281
    move-result v4

    .line 282
    invoke-interface {v9, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v4

    .line 286
    check-cast v4, Lcom/google/android/material/carousel/KeylineState;

    .line 287
    .line 288
    invoke-virtual {v11, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    add-int/lit8 v13, v13, 0x1

    .line 292
    .line 293
    :cond_11
    add-int/lit8 v12, v12, 0x1

    .line 294
    .line 295
    const/4 v2, 0x0

    .line 296
    const/4 v4, 0x1

    .line 297
    goto :goto_a

    .line 298
    :cond_12
    const/16 v16, 0x1

    .line 299
    .line 300
    add-int/lit8 v2, v3, -0x1

    .line 301
    .line 302
    const/4 v4, 0x0

    .line 303
    :goto_e
    if-ltz v2, :cond_17

    .line 304
    .line 305
    if-eqz v7, :cond_13

    .line 306
    .line 307
    sub-int v6, v3, v2

    .line 308
    .line 309
    add-int/lit8 v6, v6, -0x1

    .line 310
    .line 311
    goto :goto_f

    .line 312
    :cond_13
    move v6, v2

    .line 313
    :goto_f
    int-to-float v9, v6

    .line 314
    mul-float v9, v9, v10

    .line 315
    .line 316
    if-eqz v7, :cond_14

    .line 317
    .line 318
    const/4 v12, -0x1

    .line 319
    goto :goto_10

    .line 320
    :cond_14
    const/4 v12, 0x1

    .line 321
    :goto_10
    int-to-float v12, v12

    .line 322
    mul-float v9, v9, v12

    .line 323
    .line 324
    int-to-float v12, v5

    .line 325
    iget v13, v1, Lcom/google/android/material/carousel/KeylineStateList;->f:F

    .line 326
    .line 327
    add-float/2addr v12, v13

    .line 328
    cmpg-float v9, v9, v12

    .line 329
    .line 330
    if-ltz v9, :cond_15

    .line 331
    .line 332
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 333
    .line 334
    .line 335
    move-result v9

    .line 336
    if-ge v2, v9, :cond_16

    .line 337
    .line 338
    :cond_15
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 339
    .line 340
    .line 341
    move-result-object v6

    .line 342
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 343
    .line 344
    .line 345
    move-result v9

    .line 346
    add-int/lit8 v9, v9, -0x1

    .line 347
    .line 348
    const/4 v12, 0x0

    .line 349
    invoke-static {v4, v12, v9}, La/a;->m(III)I

    .line 350
    .line 351
    .line 352
    move-result v9

    .line 353
    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v9

    .line 357
    check-cast v9, Lcom/google/android/material/carousel/KeylineState;

    .line 358
    .line 359
    invoke-virtual {v11, v6, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    add-int/lit8 v4, v4, 0x1

    .line 363
    .line 364
    :cond_16
    add-int/lit8 v2, v2, -0x1

    .line 365
    .line 366
    goto :goto_e

    .line 367
    :cond_17
    iput-object v11, v0, Lcom/google/android/material/carousel/CarouselLayoutManager;->i:Ljava/util/HashMap;

    .line 368
    .line 369
    iget v1, v0, Lcom/google/android/material/carousel/CarouselLayoutManager;->m:I

    .line 370
    .line 371
    if-eq v1, v14, :cond_18

    .line 372
    .line 373
    invoke-virtual {v0, v1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->l(I)Lcom/google/android/material/carousel/KeylineState;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    invoke-virtual {v0, v1, v2}, Lcom/google/android/material/carousel/CarouselLayoutManager;->n(ILcom/google/android/material/carousel/KeylineState;)I

    .line 378
    .line 379
    .line 380
    move-result v1

    .line 381
    iput v1, v0, Lcom/google/android/material/carousel/CarouselLayoutManager;->a:I

    .line 382
    .line 383
    :cond_18
    iget v1, v0, Lcom/google/android/material/carousel/CarouselLayoutManager;->a:I

    .line 384
    .line 385
    iget v2, v0, Lcom/google/android/material/carousel/CarouselLayoutManager;->b:I

    .line 386
    .line 387
    iget v3, v0, Lcom/google/android/material/carousel/CarouselLayoutManager;->c:I

    .line 388
    .line 389
    if-ge v1, v2, :cond_19

    .line 390
    .line 391
    sub-int v14, v2, v1

    .line 392
    .line 393
    goto :goto_11

    .line 394
    :cond_19
    if-le v1, v3, :cond_1a

    .line 395
    .line 396
    sub-int v14, v3, v1

    .line 397
    .line 398
    goto :goto_11

    .line 399
    :cond_1a
    const/4 v14, 0x0

    .line 400
    :goto_11
    add-int/2addr v14, v1

    .line 401
    iput v14, v0, Lcom/google/android/material/carousel/CarouselLayoutManager;->a:I

    .line 402
    .line 403
    iget v1, v0, Lcom/google/android/material/carousel/CarouselLayoutManager;->h:I

    .line 404
    .line 405
    invoke-virtual/range {p2 .. p2}, Landroidx/recyclerview/widget/e2;->b()I

    .line 406
    .line 407
    .line 408
    move-result v2

    .line 409
    const/4 v14, 0x0

    .line 410
    invoke-static {v1, v14, v2}, La/a;->m(III)I

    .line 411
    .line 412
    .line 413
    move-result v1

    .line 414
    iput v1, v0, Lcom/google/android/material/carousel/CarouselLayoutManager;->h:I

    .line 415
    .line 416
    iget-object v1, v0, Lcom/google/android/material/carousel/CarouselLayoutManager;->f:Lcom/google/android/material/carousel/KeylineStateList;

    .line 417
    .line 418
    invoke-virtual {v0, v1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->z(Lcom/google/android/material/carousel/KeylineStateList;)V

    .line 419
    .line 420
    .line 421
    invoke-virtual/range {p0 .. p1}, Landroidx/recyclerview/widget/p1;->detachAndScrapAttachedViews(Landroidx/recyclerview/widget/x1;)V

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {p0 .. p2}, Lcom/google/android/material/carousel/CarouselLayoutManager;->j(Landroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/e2;)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getItemCount()I

    .line 428
    .line 429
    .line 430
    move-result v1

    .line 431
    iput v1, v0, Lcom/google/android/material/carousel/CarouselLayoutManager;->l:I

    .line 432
    .line 433
    return-void

    .line 434
    :goto_12
    invoke-virtual/range {p0 .. p1}, Landroidx/recyclerview/widget/p1;->removeAndRecycleAllViews(Landroidx/recyclerview/widget/x1;)V

    .line 435
    .line 436
    .line 437
    iput v14, v0, Lcom/google/android/material/carousel/CarouselLayoutManager;->h:I

    .line 438
    .line 439
    return-void
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
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
    .line 2965
    .line 2966
    .line 2967
    .line 2968
    .line 2969
    .line 2970
    .line 2971
    .line 2972
    .line 2973
    .line 2974
    .line 2975
    .line 2976
    .line 2977
    .line 2978
    .line 2979
    .line 2980
    .line 2981
    .line 2982
    .line 2983
    .line 2984
    .line 2985
    .line 2986
    .line 2987
    .line 2988
    .line 2989
    .line 2990
    .line 2991
    .line 2992
    .line 2993
    .line 2994
    .line 2995
    .line 2996
    .line 2997
    .line 2998
    .line 2999
    .line 3000
    .line 3001
    .line 3002
    .line 3003
    .line 3004
    .line 3005
    .line 3006
    .line 3007
    .line 3008
    .line 3009
    .line 3010
    .line 3011
    .line 3012
    .line 3013
    .line 3014
    .line 3015
    .line 3016
    .line 3017
    .line 3018
    .line 3019
    .line 3020
    .line 3021
    .line 3022
    .line 3023
    .line 3024
    .line 3025
    .line 3026
    .line 3027
    .line 3028
    .line 3029
    .line 3030
    .line 3031
    .line 3032
    .line 3033
    .line 3034
    .line 3035
    .line 3036
    .line 3037
    .line 3038
    .line 3039
    .line 3040
    .line 3041
    .line 3042
    .line 3043
    .line 3044
    .line 3045
    .line 3046
    .line 3047
    .line 3048
    .line 3049
    .line 3050
    .line 3051
    .line 3052
    .line 3053
    .line 3054
    .line 3055
    .line 3056
    .line 3057
    .line 3058
    .line 3059
    .line 3060
    .line 3061
    .line 3062
    .line 3063
    .line 3064
    .line 3065
    .line 3066
    .line 3067
    .line 3068
    .line 3069
    .line 3070
    .line 3071
    .line 3072
    .line 3073
    .line 3074
    .line 3075
    .line 3076
    .line 3077
    .line 3078
    .line 3079
    .line 3080
    .line 3081
    .line 3082
    .line 3083
    .line 3084
    .line 3085
    .line 3086
    .line 3087
    .line 3088
    .line 3089
    .line 3090
    .line 3091
    .line 3092
    .line 3093
    .line 3094
    .line 3095
    .line 3096
    .line 3097
    .line 3098
    .line 3099
    .line 3100
    .line 3101
    .line 3102
    .line 3103
    .line 3104
    .line 3105
    .line 3106
    .line 3107
    .line 3108
    .line 3109
    .line 3110
    .line 3111
    .line 3112
    .line 3113
    .line 3114
    .line 3115
    .line 3116
    .line 3117
    .line 3118
    .line 3119
    .line 3120
    .line 3121
    .line 3122
    .line 3123
    .line 3124
    .line 3125
    .line 3126
    .line 3127
    .line 3128
    .line 3129
    .line 3130
    .line 3131
    .line 3132
    .line 3133
    .line 3134
    .line 3135
    .line 3136
    .line 3137
    .line 3138
    .line 3139
    .line 3140
    .line 3141
    .line 3142
    .line 3143
    .line 3144
    .line 3145
    .line 3146
    .line 3147
    .line 3148
    .line 3149
    .line 3150
    .line 3151
    .line 3152
    .line 3153
    .line 3154
    .line 3155
    .line 3156
    .line 3157
    .line 3158
    .line 3159
    .line 3160
    .line 3161
    .line 3162
    .line 3163
    .line 3164
    .line 3165
    .line 3166
    .line 3167
    .line 3168
    .line 3169
    .line 3170
    .line 3171
    .line 3172
    .line 3173
    .line 3174
    .line 3175
    .line 3176
    .line 3177
    .line 3178
    .line 3179
    .line 3180
    .line 3181
    .line 3182
    .line 3183
    .line 3184
    .line 3185
    .line 3186
    .line 3187
    .line 3188
    .line 3189
    .line 3190
    .line 3191
    .line 3192
    .line 3193
    .line 3194
    .line 3195
    .line 3196
    .line 3197
    .line 3198
    .line 3199
    .line 3200
    .line 3201
    .line 3202
    .line 3203
    .line 3204
    .line 3205
    .line 3206
    .line 3207
    .line 3208
    .line 3209
    .line 3210
    .line 3211
    .line 3212
    .line 3213
    .line 3214
    .line 3215
    .line 3216
    .line 3217
    .line 3218
    .line 3219
    .line 3220
    .line 3221
    .line 3222
    .line 3223
    .line 3224
    .line 3225
    .line 3226
    .line 3227
    .line 3228
    .line 3229
    .line 3230
    .line 3231
    .line 3232
    .line 3233
    .line 3234
    .line 3235
    .line 3236
    .line 3237
    .line 3238
    .line 3239
    .line 3240
    .line 3241
    .line 3242
    .line 3243
    .line 3244
    .line 3245
    .line 3246
    .line 3247
    .line 3248
    .line 3249
    .line 3250
    .line 3251
    .line 3252
    .line 3253
    .line 3254
    .line 3255
    .line 3256
    .line 3257
    .line 3258
    .line 3259
    .line 3260
    .line 3261
    .line 3262
    .line 3263
    .line 3264
    .line 3265
    .line 3266
    .line 3267
    .line 3268
    .line 3269
    .line 3270
    .line 3271
    .line 3272
    .line 3273
    .line 3274
    .line 3275
    .line 3276
    .line 3277
    .line 3278
    .line 3279
    .line 3280
    .line 3281
    .line 3282
    .line 3283
    .line 3284
    .line 3285
    .line 3286
    .line 3287
    .line 3288
    .line 3289
    .line 3290
    .line 3291
    .line 3292
    .line 3293
    .line 3294
    .line 3295
    .line 3296
    .line 3297
    .line 3298
    .line 3299
    .line 3300
    .line 3301
    .line 3302
    .line 3303
    .line 3304
    .line 3305
    .line 3306
    .line 3307
    .line 3308
    .line 3309
    .line 3310
    .line 3311
    .line 3312
    .line 3313
    .line 3314
    .line 3315
    .line 3316
    .line 3317
    .line 3318
    .line 3319
    .line 3320
    .line 3321
    .line 3322
    .line 3323
    .line 3324
    .line 3325
    .line 3326
    .line 3327
    .line 3328
    .line 3329
    .line 3330
    .line 3331
    .line 3332
    .line 3333
    .line 3334
    .line 3335
    .line 3336
    .line 3337
    .line 3338
    .line 3339
    .line 3340
    .line 3341
    .line 3342
    .line 3343
    .line 3344
    .line 3345
    .line 3346
    .line 3347
    .line 3348
    .line 3349
    .line 3350
    .line 3351
    .line 3352
    .line 3353
    .line 3354
    .line 3355
    .line 3356
    .line 3357
    .line 3358
    .line 3359
    .line 3360
    .line 3361
    .line 3362
    .line 3363
    .line 3364
    .line 3365
    .line 3366
    .line 3367
    .line 3368
    .line 3369
    .line 3370
    .line 3371
    .line 3372
    .line 3373
    .line 3374
    .line 3375
    .line 3376
    .line 3377
    .line 3378
.end method

.method public final onLayoutCompleted(Landroidx/recyclerview/widget/e2;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    iput v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->h:I

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/p1;->getChildAt(I)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/p1;->getPosition(Landroid/view/View;)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iput p1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->h:I

    .line 20
    .line 21
    return-void
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

.method public final q()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->j:Lcom/google/android/material/carousel/CarouselOrientationHelper;

    .line 2
    .line 3
    iget v0, v0, Lcom/google/android/material/carousel/CarouselOrientationHelper;->a:I

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
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

.method public final r()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getLayoutDirection()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
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

.method public final requestChildRectangleOnScreen(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z
    .locals 3

    .line 1
    iget-object p3, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->f:Lcom/google/android/material/carousel/KeylineStateList;

    .line 2
    .line 3
    const/4 p4, 0x0

    .line 4
    if-nez p3, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/p1;->getPosition(Landroid/view/View;)I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/p1;->getPosition(Landroid/view/View;)I

    .line 12
    .line 13
    .line 14
    move-result p5

    .line 15
    invoke-virtual {p0, p5}, Lcom/google/android/material/carousel/CarouselLayoutManager;->l(I)Lcom/google/android/material/carousel/KeylineState;

    .line 16
    .line 17
    .line 18
    move-result-object p5

    .line 19
    invoke-virtual {p0, p3, p5}, Lcom/google/android/material/carousel/CarouselLayoutManager;->o(ILcom/google/android/material/carousel/KeylineState;)I

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    if-nez p3, :cond_1

    .line 24
    .line 25
    :goto_0
    return p4

    .line 26
    :cond_1
    iget p5, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->a:I

    .line 27
    .line 28
    iget v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->b:I

    .line 29
    .line 30
    iget v1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->c:I

    .line 31
    .line 32
    add-int v2, p5, p3

    .line 33
    .line 34
    if-ge v2, v0, :cond_2

    .line 35
    .line 36
    sub-int p3, v0, p5

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    if-le v2, v1, :cond_3

    .line 40
    .line 41
    sub-int p3, v1, p5

    .line 42
    .line 43
    :cond_3
    :goto_1
    iget-object v2, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->f:Lcom/google/android/material/carousel/KeylineStateList;

    .line 44
    .line 45
    add-int/2addr p5, p3

    .line 46
    int-to-float p3, p5

    .line 47
    int-to-float p5, v0

    .line 48
    int-to-float v0, v1

    .line 49
    invoke-virtual {v2, p3, p5, v0, p4}, Lcom/google/android/material/carousel/KeylineStateList;->b(FFFZ)Lcom/google/android/material/carousel/KeylineState;

    .line 50
    .line 51
    .line 52
    move-result-object p3

    .line 53
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/p1;->getPosition(Landroid/view/View;)I

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    invoke-virtual {p0, p2, p3}, Lcom/google/android/material/carousel/CarouselLayoutManager;->o(ILcom/google/android/material/carousel/KeylineState;)I

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->q()Z

    .line 62
    .line 63
    .line 64
    move-result p3

    .line 65
    if-eqz p3, :cond_4

    .line 66
    .line 67
    invoke-virtual {p1, p2, p4}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    invoke-virtual {p1, p4, p2}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    .line 72
    .line 73
    .line 74
    :goto_2
    const/4 p1, 0x1

    .line 75
    return p1
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

.method public final s(FLcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;)Z
    .locals 3

    .line 1
    iget-object v0, p2, Lcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;->a:Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 2
    .line 3
    iget v1, v0, Lcom/google/android/material/carousel/KeylineState$Keyline;->d:F

    .line 4
    .line 5
    iget-object p2, p2, Lcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;->b:Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 6
    .line 7
    iget v2, p2, Lcom/google/android/material/carousel/KeylineState$Keyline;->d:F

    .line 8
    .line 9
    iget v0, v0, Lcom/google/android/material/carousel/KeylineState$Keyline;->b:F

    .line 10
    .line 11
    iget p2, p2, Lcom/google/android/material/carousel/KeylineState$Keyline;->b:F

    .line 12
    .line 13
    invoke-static {v1, v2, v0, p2, p1}, Lcom/google/android/material/animation/AnimationUtils;->b(FFFFF)F

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    const/high16 v0, 0x40000000    # 2.0f

    .line 18
    .line 19
    div-float/2addr p2, v0

    .line 20
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->r()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    add-float/2addr p1, p2

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    sub-float/2addr p1, p2

    .line 29
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->r()Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-eqz p2, :cond_1

    .line 34
    .line 35
    const/4 p2, 0x0

    .line 36
    cmpg-float p1, p1, p2

    .line 37
    .line 38
    if-gez p1, :cond_2

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->k()I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    int-to-float p2, p2

    .line 46
    cmpl-float p1, p1, p2

    .line 47
    .line 48
    if-lez p1, :cond_2

    .line 49
    .line 50
    :goto_1
    const/4 p1, 0x1

    .line 51
    return p1

    .line 52
    :cond_2
    const/4 p1, 0x0

    .line 53
    return p1
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

.method public final scrollHorizontallyBy(ILandroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/e2;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/material/carousel/CarouselLayoutManager;->x(ILandroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/e2;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return p1
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
.end method

.method public final scrollToPosition(I)V
    .locals 2

    .line 1
    iput p1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->m:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->f:Lcom/google/android/material/carousel/KeylineStateList;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->l(I)Lcom/google/android/material/carousel/KeylineState;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0, p1, v0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->n(ILcom/google/android/material/carousel/KeylineState;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iput v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->a:I

    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getItemCount()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    add-int/lit8 v0, v0, -0x1

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-static {p1, v1, v0}, La/a;->m(III)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iput p1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->h:I

    .line 34
    .line 35
    iget-object p1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->f:Lcom/google/android/material/carousel/KeylineStateList;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->z(Lcom/google/android/material/carousel/KeylineStateList;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->requestLayout()V

    .line 41
    .line 42
    .line 43
    return-void
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

.method public final scrollVerticallyBy(ILandroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/e2;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->canScrollVertically()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/material/carousel/CarouselLayoutManager;->x(ILandroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/e2;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return p1
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
.end method

.method public final setOrientation(I)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 8
    .line 9
    const-string v1, "invalid orientation:"

    .line 10
    .line 11
    invoke-static {p1, v1}, Landroidx/appcompat/app/b;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw v0

    .line 19
    :cond_1
    :goto_0
    const/4 v1, 0x0

    .line 20
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/p1;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->j:Lcom/google/android/material/carousel/CarouselOrientationHelper;

    .line 24
    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    iget v1, v1, Lcom/google/android/material/carousel/CarouselOrientationHelper;->a:I

    .line 28
    .line 29
    if-eq p1, v1, :cond_2

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    return-void

    .line 33
    :cond_3
    :goto_1
    if-eqz p1, :cond_5

    .line 34
    .line 35
    if-ne p1, v0, :cond_4

    .line 36
    .line 37
    new-instance p1, Lcom/google/android/material/carousel/CarouselOrientationHelper$1;

    .line 38
    .line 39
    invoke-direct {p1, p0}, Lcom/google/android/material/carousel/CarouselOrientationHelper$1;-><init>(Lcom/google/android/material/carousel/CarouselLayoutManager;)V

    .line 40
    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 44
    .line 45
    const-string v0, "invalid orientation"

    .line 46
    .line 47
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_5
    new-instance p1, Lcom/google/android/material/carousel/CarouselOrientationHelper$2;

    .line 52
    .line 53
    invoke-direct {p1, p0}, Lcom/google/android/material/carousel/CarouselOrientationHelper$2;-><init>(Lcom/google/android/material/carousel/CarouselLayoutManager;)V

    .line 54
    .line 55
    .line 56
    :goto_2
    iput-object p1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->j:Lcom/google/android/material/carousel/CarouselOrientationHelper;

    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->w()V

    .line 59
    .line 60
    .line 61
    return-void
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

.method public final smoothScrollToPosition(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/e2;I)V
    .locals 0

    .line 1
    new-instance p2, Lcom/google/android/material/carousel/CarouselLayoutManager$1;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {p2, p0, p1}, Lcom/google/android/material/carousel/CarouselLayoutManager$1;-><init>(Lcom/google/android/material/carousel/CarouselLayoutManager;Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    iput p3, p2, Landroidx/recyclerview/widget/d2;->a:I

    .line 11
    .line 12
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/p1;->startSmoothScroll(Landroidx/recyclerview/widget/d2;)V

    .line 13
    .line 14
    .line 15
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
.end method

.method public final t(FLcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;)Z
    .locals 3

    .line 1
    iget-object v0, p2, Lcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;->a:Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 2
    .line 3
    iget v1, v0, Lcom/google/android/material/carousel/KeylineState$Keyline;->d:F

    .line 4
    .line 5
    iget-object p2, p2, Lcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;->b:Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 6
    .line 7
    iget v2, p2, Lcom/google/android/material/carousel/KeylineState$Keyline;->d:F

    .line 8
    .line 9
    iget v0, v0, Lcom/google/android/material/carousel/KeylineState$Keyline;->b:F

    .line 10
    .line 11
    iget p2, p2, Lcom/google/android/material/carousel/KeylineState$Keyline;->b:F

    .line 12
    .line 13
    invoke-static {v1, v2, v0, p2, p1}, Lcom/google/android/material/animation/AnimationUtils;->b(FFFFF)F

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    const/high16 v0, 0x40000000    # 2.0f

    .line 18
    .line 19
    div-float/2addr p2, v0

    .line 20
    invoke-virtual {p0, p1, p2}, Lcom/google/android/material/carousel/CarouselLayoutManager;->e(FF)F

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->r()Z

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    if-eqz p2, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->k()I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    int-to-float p2, p2

    .line 35
    cmpl-float p1, p1, p2

    .line 36
    .line 37
    if-lez p1, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 p2, 0x0

    .line 41
    cmpg-float p1, p1, p2

    .line 42
    .line 43
    if-gez p1, :cond_1

    .line 44
    .line 45
    :goto_0
    const/4 p1, 0x1

    .line 46
    return p1

    .line 47
    :cond_1
    const/4 p1, 0x0

    .line 48
    return p1
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

.method public final u(Landroidx/recyclerview/widget/x1;FI)Lcom/google/android/material/carousel/CarouselLayoutManager$ChildCalculations;
    .locals 2

    .line 1
    const-wide v0, 0x7fffffffffffffffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p3, v0, v1}, Landroidx/recyclerview/widget/x1;->l(IJ)Landroidx/recyclerview/widget/i2;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object p1, p1, Landroidx/recyclerview/widget/i2;->itemView:Landroid/view/View;

    .line 11
    .line 12
    const/4 p3, 0x0

    .line 13
    invoke-virtual {p0, p1, p3, p3}, Lcom/google/android/material/carousel/CarouselLayoutManager;->measureChildWithMargins(Landroid/view/View;II)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->g:Lcom/google/android/material/carousel/KeylineState;

    .line 17
    .line 18
    iget v0, v0, Lcom/google/android/material/carousel/KeylineState;->a:F

    .line 19
    .line 20
    const/high16 v1, 0x40000000    # 2.0f

    .line 21
    .line 22
    div-float/2addr v0, v1

    .line 23
    invoke-virtual {p0, p2, v0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->e(FF)F

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->g:Lcom/google/android/material/carousel/KeylineState;

    .line 28
    .line 29
    iget-object v0, v0, Lcom/google/android/material/carousel/KeylineState;->b:Ljava/util/List;

    .line 30
    .line 31
    invoke-static {v0, p2, p3}, Lcom/google/android/material/carousel/CarouselLayoutManager;->p(Ljava/util/List;FZ)Lcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/material/carousel/CarouselLayoutManager;->h(Landroid/view/View;FLcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;)F

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    new-instance v1, Lcom/google/android/material/carousel/CarouselLayoutManager$ChildCalculations;

    .line 40
    .line 41
    invoke-direct {v1, p1, p2, v0, p3}, Lcom/google/android/material/carousel/CarouselLayoutManager$ChildCalculations;-><init>(Landroid/view/View;FFLcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;)V

    .line 42
    .line 43
    .line 44
    return-object v1
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
.end method

.method public final v(Landroidx/recyclerview/widget/x1;)V
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-wide v1, 0x7fffffffffffffffL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    move-object/from16 v4, p1

    .line 10
    .line 11
    invoke-virtual {v4, v3, v1, v2}, Landroidx/recyclerview/widget/x1;->l(IJ)Landroidx/recyclerview/widget/i2;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v1, v1, Landroidx/recyclerview/widget/i2;->itemView:Landroid/view/View;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v3, v3}, Lcom/google/android/material/carousel/CarouselLayoutManager;->measureChildWithMargins(Landroid/view/View;II)V

    .line 18
    .line 19
    .line 20
    iget-object v2, v0, Lcom/google/android/material/carousel/CarouselLayoutManager;->e:Lcom/google/android/material/carousel/MultiBrowseCarouselStrategy;

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getHeight()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    int-to-float v4, v4

    .line 30
    invoke-virtual {v0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->q()Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_0

    .line 35
    .line 36
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getWidth()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    int-to-float v4, v4

    .line 41
    :cond_0
    move v5, v4

    .line 42
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Landroidx/recyclerview/widget/q1;

    .line 47
    .line 48
    iget v6, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 49
    .line 50
    iget v7, v4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 51
    .line 52
    add-int/2addr v6, v7

    .line 53
    int-to-float v6, v6

    .line 54
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    int-to-float v7, v7

    .line 59
    invoke-virtual {v0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->q()Z

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    if-eqz v8, :cond_1

    .line 64
    .line 65
    iget v6, v4, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 66
    .line 67
    iget v4, v4, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 68
    .line 69
    add-int/2addr v6, v4

    .line 70
    int-to-float v6, v6

    .line 71
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    int-to-float v7, v4

    .line 76
    :cond_1
    move v4, v6

    .line 77
    iget v6, v2, Lcom/google/android/material/carousel/CarouselStrategy;->a:F

    .line 78
    .line 79
    add-float/2addr v6, v4

    .line 80
    iget v8, v2, Lcom/google/android/material/carousel/CarouselStrategy;->b:F

    .line 81
    .line 82
    add-float/2addr v8, v4

    .line 83
    invoke-static {v8, v6}, Ljava/lang/Math;->max(FF)F

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    add-float v9, v7, v4

    .line 88
    .line 89
    invoke-static {v9, v5}, Ljava/lang/Math;->min(FF)F

    .line 90
    .line 91
    .line 92
    move-result v12

    .line 93
    const/high16 v9, 0x40400000    # 3.0f

    .line 94
    .line 95
    div-float/2addr v7, v9

    .line 96
    add-float/2addr v7, v4

    .line 97
    add-float v9, v6, v4

    .line 98
    .line 99
    add-float v10, v8, v4

    .line 100
    .line 101
    invoke-static {v7, v9, v10}, La/a;->l(FFF)F

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    add-float v9, v12, v7

    .line 106
    .line 107
    const/high16 v14, 0x40000000    # 2.0f

    .line 108
    .line 109
    div-float v10, v9, v14

    .line 110
    .line 111
    mul-float v9, v6, v14

    .line 112
    .line 113
    const/4 v15, 0x1

    .line 114
    cmpg-float v9, v5, v9

    .line 115
    .line 116
    if-gez v9, :cond_2

    .line 117
    .line 118
    new-array v9, v15, [I

    .line 119
    .line 120
    aput v3, v9, v3

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_2
    sget-object v9, Lcom/google/android/material/carousel/MultiBrowseCarouselStrategy;->d:[I

    .line 124
    .line 125
    :goto_0
    iget v11, v0, Lcom/google/android/material/carousel/CarouselLayoutManager;->n:I

    .line 126
    .line 127
    sget-object v13, Lcom/google/android/material/carousel/MultiBrowseCarouselStrategy;->e:[I

    .line 128
    .line 129
    if-ne v11, v15, :cond_3

    .line 130
    .line 131
    invoke-static {v9}, Lcom/google/android/material/carousel/CarouselStrategy;->a([I)[I

    .line 132
    .line 133
    .line 134
    move-result-object v9

    .line 135
    invoke-static {v13}, Lcom/google/android/material/carousel/CarouselStrategy;->a([I)[I

    .line 136
    .line 137
    .line 138
    move-result-object v13

    .line 139
    :cond_3
    move-object v11, v13

    .line 140
    invoke-static {v11}, Lcom/google/android/material/carousel/CarouselStrategyHelper;->c([I)I

    .line 141
    .line 142
    .line 143
    move-result v13

    .line 144
    int-to-float v13, v13

    .line 145
    mul-float v13, v13, v10

    .line 146
    .line 147
    sub-float v13, v5, v13

    .line 148
    .line 149
    const/high16 p1, 0x40000000    # 2.0f

    .line 150
    .line 151
    invoke-static {v9}, Lcom/google/android/material/carousel/CarouselStrategyHelper;->c([I)I

    .line 152
    .line 153
    .line 154
    move-result v14

    .line 155
    int-to-float v14, v14

    .line 156
    mul-float v14, v14, v8

    .line 157
    .line 158
    sub-float/2addr v13, v14

    .line 159
    div-float/2addr v13, v12

    .line 160
    float-to-double v13, v13

    .line 161
    invoke-static {v13, v14}, Ljava/lang/Math;->floor(D)D

    .line 162
    .line 163
    .line 164
    move-result-wide v13

    .line 165
    move/from16 v16, v4

    .line 166
    .line 167
    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    .line 168
    .line 169
    invoke-static {v3, v4, v13, v14}, Ljava/lang/Math;->max(DD)D

    .line 170
    .line 171
    .line 172
    move-result-wide v3

    .line 173
    double-to-int v3, v3

    .line 174
    div-float v4, v5, v12

    .line 175
    .line 176
    float-to-double v13, v4

    .line 177
    invoke-static {v13, v14}, Ljava/lang/Math;->ceil(D)D

    .line 178
    .line 179
    .line 180
    move-result-wide v13

    .line 181
    double-to-int v4, v13

    .line 182
    sub-int v3, v4, v3

    .line 183
    .line 184
    add-int/2addr v3, v15

    .line 185
    new-array v13, v3, [I

    .line 186
    .line 187
    const/4 v14, 0x0

    .line 188
    :goto_1
    if-ge v14, v3, :cond_4

    .line 189
    .line 190
    sub-int v17, v4, v14

    .line 191
    .line 192
    aput v17, v13, v14

    .line 193
    .line 194
    add-int/lit8 v14, v14, 0x1

    .line 195
    .line 196
    goto :goto_1

    .line 197
    :cond_4
    move/from16 v29, v7

    .line 198
    .line 199
    move v7, v6

    .line 200
    move/from16 v6, v29

    .line 201
    .line 202
    invoke-static/range {v5 .. v13}, Lcom/google/android/material/carousel/Arrangement;->a(FFFF[IF[IF[I)Lcom/google/android/material/carousel/Arrangement;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    iget v4, v3, Lcom/google/android/material/carousel/Arrangement;->c:I

    .line 207
    .line 208
    iget v9, v3, Lcom/google/android/material/carousel/Arrangement;->g:I

    .line 209
    .line 210
    iget v11, v3, Lcom/google/android/material/carousel/Arrangement;->d:I

    .line 211
    .line 212
    add-int/2addr v4, v11

    .line 213
    add-int/2addr v4, v9

    .line 214
    iput v4, v2, Lcom/google/android/material/carousel/MultiBrowseCarouselStrategy;->c:I

    .line 215
    .line 216
    invoke-interface {v0}, Lcom/google/android/material/carousel/Carousel;->getItemCount()I

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    iget v4, v3, Lcom/google/android/material/carousel/Arrangement;->c:I

    .line 221
    .line 222
    iget v11, v3, Lcom/google/android/material/carousel/Arrangement;->d:I

    .line 223
    .line 224
    add-int v13, v4, v11

    .line 225
    .line 226
    add-int/2addr v13, v9

    .line 227
    sub-int/2addr v13, v2

    .line 228
    if-lez v13, :cond_6

    .line 229
    .line 230
    if-gtz v4, :cond_5

    .line 231
    .line 232
    if-le v11, v15, :cond_6

    .line 233
    .line 234
    :cond_5
    const/4 v2, 0x1

    .line 235
    goto :goto_2

    .line 236
    :cond_6
    const/4 v2, 0x0

    .line 237
    :goto_2
    if-lez v13, :cond_9

    .line 238
    .line 239
    iget v4, v3, Lcom/google/android/material/carousel/Arrangement;->c:I

    .line 240
    .line 241
    if-lez v4, :cond_7

    .line 242
    .line 243
    add-int/lit8 v4, v4, -0x1

    .line 244
    .line 245
    iput v4, v3, Lcom/google/android/material/carousel/Arrangement;->c:I

    .line 246
    .line 247
    goto :goto_3

    .line 248
    :cond_7
    iget v4, v3, Lcom/google/android/material/carousel/Arrangement;->d:I

    .line 249
    .line 250
    if-le v4, v15, :cond_8

    .line 251
    .line 252
    add-int/lit8 v4, v4, -0x1

    .line 253
    .line 254
    iput v4, v3, Lcom/google/android/material/carousel/Arrangement;->d:I

    .line 255
    .line 256
    :cond_8
    :goto_3
    add-int/lit8 v13, v13, -0x1

    .line 257
    .line 258
    goto :goto_2

    .line 259
    :cond_9
    if-eqz v2, :cond_a

    .line 260
    .line 261
    iget v2, v3, Lcom/google/android/material/carousel/Arrangement;->c:I

    .line 262
    .line 263
    filled-new-array {v2}, [I

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    iget v3, v3, Lcom/google/android/material/carousel/Arrangement;->d:I

    .line 268
    .line 269
    filled-new-array {v3}, [I

    .line 270
    .line 271
    .line 272
    move-result-object v11

    .line 273
    filled-new-array {v9}, [I

    .line 274
    .line 275
    .line 276
    move-result-object v13

    .line 277
    move-object v9, v2

    .line 278
    invoke-static/range {v5 .. v13}, Lcom/google/android/material/carousel/Arrangement;->a(FFFF[IF[IF[I)Lcom/google/android/material/carousel/Arrangement;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    :cond_a
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    iget v2, v0, Lcom/google/android/material/carousel/CarouselLayoutManager;->n:I

    .line 287
    .line 288
    const/4 v4, 0x1

    .line 289
    if-ne v2, v4, :cond_f

    .line 290
    .line 291
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    sget v2, Lcom/google/android/material/R$dimen;->m3_carousel_gone_size:I

    .line 296
    .line 297
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 298
    .line 299
    .line 300
    move-result v1

    .line 301
    add-float v1, v1, v16

    .line 302
    .line 303
    iget v2, v3, Lcom/google/android/material/carousel/Arrangement;->f:F

    .line 304
    .line 305
    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    .line 306
    .line 307
    .line 308
    move-result v9

    .line 309
    const/high16 v1, 0x40000000    # 2.0f

    .line 310
    .line 311
    div-float v2, v9, v1

    .line 312
    .line 313
    const/4 v4, 0x0

    .line 314
    sub-float v7, v4, v2

    .line 315
    .line 316
    iget v6, v3, Lcom/google/android/material/carousel/Arrangement;->b:F

    .line 317
    .line 318
    iget v8, v3, Lcom/google/android/material/carousel/Arrangement;->c:I

    .line 319
    .line 320
    invoke-static {v4, v6, v8}, Lcom/google/android/material/carousel/CarouselStrategyHelper;->b(FFI)F

    .line 321
    .line 322
    .line 323
    move-result v12

    .line 324
    iget v6, v3, Lcom/google/android/material/carousel/Arrangement;->b:F

    .line 325
    .line 326
    iget v8, v3, Lcom/google/android/material/carousel/Arrangement;->c:I

    .line 327
    .line 328
    int-to-float v8, v8

    .line 329
    div-float/2addr v8, v1

    .line 330
    float-to-double v10, v8

    .line 331
    invoke-static {v10, v11}, Ljava/lang/Math;->floor(D)D

    .line 332
    .line 333
    .line 334
    move-result-wide v10

    .line 335
    double-to-int v8, v10

    .line 336
    invoke-static {v12, v6, v8}, Lcom/google/android/material/carousel/CarouselStrategyHelper;->a(FFI)F

    .line 337
    .line 338
    .line 339
    move-result v6

    .line 340
    iget v8, v3, Lcom/google/android/material/carousel/Arrangement;->b:F

    .line 341
    .line 342
    iget v10, v3, Lcom/google/android/material/carousel/Arrangement;->c:I

    .line 343
    .line 344
    invoke-static {v10, v4, v6, v8}, Lcom/google/android/material/carousel/CarouselStrategyHelper;->d(IFFF)F

    .line 345
    .line 346
    .line 347
    move-result v4

    .line 348
    iget v6, v3, Lcom/google/android/material/carousel/Arrangement;->e:F

    .line 349
    .line 350
    iget v8, v3, Lcom/google/android/material/carousel/Arrangement;->d:I

    .line 351
    .line 352
    invoke-static {v4, v6, v8}, Lcom/google/android/material/carousel/CarouselStrategyHelper;->b(FFI)F

    .line 353
    .line 354
    .line 355
    move-result v13

    .line 356
    iget v6, v3, Lcom/google/android/material/carousel/Arrangement;->e:F

    .line 357
    .line 358
    iget v8, v3, Lcom/google/android/material/carousel/Arrangement;->d:I

    .line 359
    .line 360
    int-to-float v8, v8

    .line 361
    div-float/2addr v8, v1

    .line 362
    float-to-double v10, v8

    .line 363
    invoke-static {v10, v11}, Ljava/lang/Math;->floor(D)D

    .line 364
    .line 365
    .line 366
    move-result-wide v10

    .line 367
    double-to-int v8, v10

    .line 368
    invoke-static {v13, v6, v8}, Lcom/google/android/material/carousel/CarouselStrategyHelper;->a(FFI)F

    .line 369
    .line 370
    .line 371
    move-result v6

    .line 372
    iget v8, v3, Lcom/google/android/material/carousel/Arrangement;->e:F

    .line 373
    .line 374
    iget v10, v3, Lcom/google/android/material/carousel/Arrangement;->d:I

    .line 375
    .line 376
    invoke-static {v10, v4, v6, v8}, Lcom/google/android/material/carousel/CarouselStrategyHelper;->d(IFFF)F

    .line 377
    .line 378
    .line 379
    move-result v4

    .line 380
    iget v6, v3, Lcom/google/android/material/carousel/Arrangement;->f:F

    .line 381
    .line 382
    iget v8, v3, Lcom/google/android/material/carousel/Arrangement;->g:I

    .line 383
    .line 384
    invoke-static {v4, v6, v8}, Lcom/google/android/material/carousel/CarouselStrategyHelper;->b(FFI)F

    .line 385
    .line 386
    .line 387
    move-result v14

    .line 388
    iget v6, v3, Lcom/google/android/material/carousel/Arrangement;->f:F

    .line 389
    .line 390
    invoke-static {v14, v6, v8}, Lcom/google/android/material/carousel/CarouselStrategyHelper;->a(FFI)F

    .line 391
    .line 392
    .line 393
    move-result v6

    .line 394
    iget v10, v3, Lcom/google/android/material/carousel/Arrangement;->f:F

    .line 395
    .line 396
    invoke-static {v8, v4, v6, v10}, Lcom/google/android/material/carousel/CarouselStrategyHelper;->d(IFFF)F

    .line 397
    .line 398
    .line 399
    move-result v4

    .line 400
    iget v6, v3, Lcom/google/android/material/carousel/Arrangement;->e:F

    .line 401
    .line 402
    iget v8, v3, Lcom/google/android/material/carousel/Arrangement;->d:I

    .line 403
    .line 404
    invoke-static {v4, v6, v8}, Lcom/google/android/material/carousel/CarouselStrategyHelper;->b(FFI)F

    .line 405
    .line 406
    .line 407
    move-result v6

    .line 408
    iget v8, v3, Lcom/google/android/material/carousel/Arrangement;->e:F

    .line 409
    .line 410
    iget v10, v3, Lcom/google/android/material/carousel/Arrangement;->d:I

    .line 411
    .line 412
    int-to-float v10, v10

    .line 413
    div-float/2addr v10, v1

    .line 414
    float-to-double v10, v10

    .line 415
    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    .line 416
    .line 417
    .line 418
    move-result-wide v10

    .line 419
    double-to-int v10, v10

    .line 420
    invoke-static {v6, v8, v10}, Lcom/google/android/material/carousel/CarouselStrategyHelper;->a(FFI)F

    .line 421
    .line 422
    .line 423
    move-result v8

    .line 424
    iget v10, v3, Lcom/google/android/material/carousel/Arrangement;->e:F

    .line 425
    .line 426
    iget v11, v3, Lcom/google/android/material/carousel/Arrangement;->d:I

    .line 427
    .line 428
    invoke-static {v11, v4, v8, v10}, Lcom/google/android/material/carousel/CarouselStrategyHelper;->d(IFFF)F

    .line 429
    .line 430
    .line 431
    move-result v4

    .line 432
    iget v8, v3, Lcom/google/android/material/carousel/Arrangement;->b:F

    .line 433
    .line 434
    iget v10, v3, Lcom/google/android/material/carousel/Arrangement;->c:I

    .line 435
    .line 436
    invoke-static {v4, v8, v10}, Lcom/google/android/material/carousel/CarouselStrategyHelper;->b(FFI)F

    .line 437
    .line 438
    .line 439
    move-result v4

    .line 440
    add-float/2addr v2, v5

    .line 441
    iget v8, v3, Lcom/google/android/material/carousel/Arrangement;->f:F

    .line 442
    .line 443
    move/from16 v10, v16

    .line 444
    .line 445
    invoke-static {v9, v8, v10}, Lcom/google/android/material/carousel/CarouselStrategy;->b(FFF)F

    .line 446
    .line 447
    .line 448
    move-result v8

    .line 449
    iget v11, v3, Lcom/google/android/material/carousel/Arrangement;->b:F

    .line 450
    .line 451
    const/high16 v16, 0x40000000    # 2.0f

    .line 452
    .line 453
    iget v1, v3, Lcom/google/android/material/carousel/Arrangement;->f:F

    .line 454
    .line 455
    invoke-static {v11, v1, v10}, Lcom/google/android/material/carousel/CarouselStrategy;->b(FFF)F

    .line 456
    .line 457
    .line 458
    move-result v19

    .line 459
    iget v1, v3, Lcom/google/android/material/carousel/Arrangement;->e:F

    .line 460
    .line 461
    iget v11, v3, Lcom/google/android/material/carousel/Arrangement;->f:F

    .line 462
    .line 463
    invoke-static {v1, v11, v10}, Lcom/google/android/material/carousel/CarouselStrategy;->b(FFF)F

    .line 464
    .line 465
    .line 466
    move-result v1

    .line 467
    move/from16 v18, v6

    .line 468
    .line 469
    new-instance v6, Lcom/google/android/material/carousel/KeylineState$Builder;

    .line 470
    .line 471
    iget v10, v3, Lcom/google/android/material/carousel/Arrangement;->f:F

    .line 472
    .line 473
    invoke-direct {v6, v10, v5}, Lcom/google/android/material/carousel/KeylineState$Builder;-><init>(FF)V

    .line 474
    .line 475
    .line 476
    const/4 v10, 0x0

    .line 477
    const/4 v11, 0x1

    .line 478
    move/from16 v5, v18

    .line 479
    .line 480
    invoke-virtual/range {v6 .. v11}, Lcom/google/android/material/carousel/KeylineState$Builder;->a(FFFZZ)V

    .line 481
    .line 482
    .line 483
    move-object/from16 v17, v6

    .line 484
    .line 485
    iget v6, v3, Lcom/google/android/material/carousel/Arrangement;->c:I

    .line 486
    .line 487
    if-lez v6, :cond_b

    .line 488
    .line 489
    iget v7, v3, Lcom/google/android/material/carousel/Arrangement;->b:F

    .line 490
    .line 491
    int-to-float v6, v6

    .line 492
    div-float v6, v6, v16

    .line 493
    .line 494
    float-to-double v10, v6

    .line 495
    invoke-static {v10, v11}, Ljava/lang/Math;->floor(D)D

    .line 496
    .line 497
    .line 498
    move-result-wide v10

    .line 499
    double-to-int v6, v10

    .line 500
    const/16 v22, 0x0

    .line 501
    .line 502
    move/from16 v21, v6

    .line 503
    .line 504
    move/from16 v20, v7

    .line 505
    .line 506
    move/from16 v18, v12

    .line 507
    .line 508
    invoke-virtual/range {v17 .. v22}, Lcom/google/android/material/carousel/KeylineState$Builder;->c(FFFIZ)V

    .line 509
    .line 510
    .line 511
    :cond_b
    move/from16 v6, v19

    .line 512
    .line 513
    iget v7, v3, Lcom/google/android/material/carousel/Arrangement;->d:I

    .line 514
    .line 515
    if-lez v7, :cond_c

    .line 516
    .line 517
    iget v10, v3, Lcom/google/android/material/carousel/Arrangement;->e:F

    .line 518
    .line 519
    int-to-float v7, v7

    .line 520
    div-float v7, v7, v16

    .line 521
    .line 522
    float-to-double v11, v7

    .line 523
    invoke-static {v11, v12}, Ljava/lang/Math;->floor(D)D

    .line 524
    .line 525
    .line 526
    move-result-wide v11

    .line 527
    double-to-int v7, v11

    .line 528
    const/16 v22, 0x0

    .line 529
    .line 530
    move/from16 v19, v1

    .line 531
    .line 532
    move/from16 v21, v7

    .line 533
    .line 534
    move/from16 v20, v10

    .line 535
    .line 536
    move/from16 v18, v13

    .line 537
    .line 538
    invoke-virtual/range {v17 .. v22}, Lcom/google/android/material/carousel/KeylineState$Builder;->c(FFFIZ)V

    .line 539
    .line 540
    .line 541
    :cond_c
    iget v7, v3, Lcom/google/android/material/carousel/Arrangement;->f:F

    .line 542
    .line 543
    iget v10, v3, Lcom/google/android/material/carousel/Arrangement;->g:I

    .line 544
    .line 545
    const/16 v22, 0x1

    .line 546
    .line 547
    const/16 v19, 0x0

    .line 548
    .line 549
    move/from16 v20, v7

    .line 550
    .line 551
    move/from16 v21, v10

    .line 552
    .line 553
    move/from16 v18, v14

    .line 554
    .line 555
    invoke-virtual/range {v17 .. v22}, Lcom/google/android/material/carousel/KeylineState$Builder;->c(FFFIZ)V

    .line 556
    .line 557
    .line 558
    iget v7, v3, Lcom/google/android/material/carousel/Arrangement;->d:I

    .line 559
    .line 560
    if-lez v7, :cond_d

    .line 561
    .line 562
    iget v10, v3, Lcom/google/android/material/carousel/Arrangement;->e:F

    .line 563
    .line 564
    int-to-float v7, v7

    .line 565
    div-float v7, v7, v16

    .line 566
    .line 567
    float-to-double v11, v7

    .line 568
    invoke-static {v11, v12}, Ljava/lang/Math;->ceil(D)D

    .line 569
    .line 570
    .line 571
    move-result-wide v11

    .line 572
    double-to-int v7, v11

    .line 573
    const/16 v22, 0x0

    .line 574
    .line 575
    move/from16 v19, v1

    .line 576
    .line 577
    move/from16 v18, v5

    .line 578
    .line 579
    move/from16 v21, v7

    .line 580
    .line 581
    move/from16 v20, v10

    .line 582
    .line 583
    invoke-virtual/range {v17 .. v22}, Lcom/google/android/material/carousel/KeylineState$Builder;->c(FFFIZ)V

    .line 584
    .line 585
    .line 586
    :cond_d
    iget v1, v3, Lcom/google/android/material/carousel/Arrangement;->c:I

    .line 587
    .line 588
    if-lez v1, :cond_e

    .line 589
    .line 590
    iget v3, v3, Lcom/google/android/material/carousel/Arrangement;->b:F

    .line 591
    .line 592
    int-to-float v1, v1

    .line 593
    div-float v1, v1, v16

    .line 594
    .line 595
    float-to-double v10, v1

    .line 596
    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    .line 597
    .line 598
    .line 599
    move-result-wide v10

    .line 600
    double-to-int v1, v10

    .line 601
    const/16 v22, 0x0

    .line 602
    .line 603
    move/from16 v21, v1

    .line 604
    .line 605
    move/from16 v20, v3

    .line 606
    .line 607
    move/from16 v18, v4

    .line 608
    .line 609
    move/from16 v19, v6

    .line 610
    .line 611
    invoke-virtual/range {v17 .. v22}, Lcom/google/android/material/carousel/KeylineState$Builder;->c(FFFIZ)V

    .line 612
    .line 613
    .line 614
    :cond_e
    const/4 v10, 0x0

    .line 615
    const/4 v11, 0x1

    .line 616
    move v7, v2

    .line 617
    move-object/from16 v6, v17

    .line 618
    .line 619
    invoke-virtual/range {v6 .. v11}, Lcom/google/android/material/carousel/KeylineState$Builder;->a(FFFZZ)V

    .line 620
    .line 621
    .line 622
    invoke-virtual/range {v17 .. v17}, Lcom/google/android/material/carousel/KeylineState$Builder;->d()Lcom/google/android/material/carousel/KeylineState;

    .line 623
    .line 624
    .line 625
    move-result-object v1

    .line 626
    goto/16 :goto_4

    .line 627
    .line 628
    :cond_f
    move/from16 v10, v16

    .line 629
    .line 630
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 631
    .line 632
    .line 633
    move-result-object v1

    .line 634
    sget v2, Lcom/google/android/material/R$dimen;->m3_carousel_gone_size:I

    .line 635
    .line 636
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 637
    .line 638
    .line 639
    move-result v1

    .line 640
    add-float/2addr v1, v10

    .line 641
    iget v2, v3, Lcom/google/android/material/carousel/Arrangement;->f:F

    .line 642
    .line 643
    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    .line 644
    .line 645
    .line 646
    move-result v1

    .line 647
    const/high16 v2, 0x40000000    # 2.0f

    .line 648
    .line 649
    div-float v2, v1, v2

    .line 650
    .line 651
    const/4 v4, 0x0

    .line 652
    sub-float v17, v4, v2

    .line 653
    .line 654
    iget v6, v3, Lcom/google/android/material/carousel/Arrangement;->f:F

    .line 655
    .line 656
    iget v7, v3, Lcom/google/android/material/carousel/Arrangement;->g:I

    .line 657
    .line 658
    invoke-static {v4, v6, v7}, Lcom/google/android/material/carousel/CarouselStrategyHelper;->b(FFI)F

    .line 659
    .line 660
    .line 661
    move-result v6

    .line 662
    iget v8, v3, Lcom/google/android/material/carousel/Arrangement;->f:F

    .line 663
    .line 664
    invoke-static {v6, v8, v7}, Lcom/google/android/material/carousel/CarouselStrategyHelper;->a(FFI)F

    .line 665
    .line 666
    .line 667
    move-result v8

    .line 668
    iget v9, v3, Lcom/google/android/material/carousel/Arrangement;->f:F

    .line 669
    .line 670
    invoke-static {v7, v4, v8, v9}, Lcom/google/android/material/carousel/CarouselStrategyHelper;->d(IFFF)F

    .line 671
    .line 672
    .line 673
    move-result v4

    .line 674
    iget v7, v3, Lcom/google/android/material/carousel/Arrangement;->e:F

    .line 675
    .line 676
    iget v8, v3, Lcom/google/android/material/carousel/Arrangement;->d:I

    .line 677
    .line 678
    invoke-static {v4, v7, v8}, Lcom/google/android/material/carousel/CarouselStrategyHelper;->b(FFI)F

    .line 679
    .line 680
    .line 681
    move-result v7

    .line 682
    iget v8, v3, Lcom/google/android/material/carousel/Arrangement;->e:F

    .line 683
    .line 684
    iget v9, v3, Lcom/google/android/material/carousel/Arrangement;->d:I

    .line 685
    .line 686
    invoke-static {v9, v4, v7, v8}, Lcom/google/android/material/carousel/CarouselStrategyHelper;->d(IFFF)F

    .line 687
    .line 688
    .line 689
    move-result v4

    .line 690
    iget v8, v3, Lcom/google/android/material/carousel/Arrangement;->b:F

    .line 691
    .line 692
    iget v9, v3, Lcom/google/android/material/carousel/Arrangement;->c:I

    .line 693
    .line 694
    invoke-static {v4, v8, v9}, Lcom/google/android/material/carousel/CarouselStrategyHelper;->b(FFI)F

    .line 695
    .line 696
    .line 697
    move-result v4

    .line 698
    add-float/2addr v2, v5

    .line 699
    iget v8, v3, Lcom/google/android/material/carousel/Arrangement;->f:F

    .line 700
    .line 701
    invoke-static {v1, v8, v10}, Lcom/google/android/material/carousel/CarouselStrategy;->b(FFF)F

    .line 702
    .line 703
    .line 704
    move-result v18

    .line 705
    iget v8, v3, Lcom/google/android/material/carousel/Arrangement;->b:F

    .line 706
    .line 707
    iget v9, v3, Lcom/google/android/material/carousel/Arrangement;->f:F

    .line 708
    .line 709
    invoke-static {v8, v9, v10}, Lcom/google/android/material/carousel/CarouselStrategy;->b(FFF)F

    .line 710
    .line 711
    .line 712
    move-result v8

    .line 713
    iget v9, v3, Lcom/google/android/material/carousel/Arrangement;->e:F

    .line 714
    .line 715
    iget v11, v3, Lcom/google/android/material/carousel/Arrangement;->f:F

    .line 716
    .line 717
    invoke-static {v9, v11, v10}, Lcom/google/android/material/carousel/CarouselStrategy;->b(FFF)F

    .line 718
    .line 719
    .line 720
    move-result v9

    .line 721
    new-instance v10, Lcom/google/android/material/carousel/KeylineState$Builder;

    .line 722
    .line 723
    iget v11, v3, Lcom/google/android/material/carousel/Arrangement;->f:F

    .line 724
    .line 725
    invoke-direct {v10, v11, v5}, Lcom/google/android/material/carousel/KeylineState$Builder;-><init>(FF)V

    .line 726
    .line 727
    .line 728
    const/16 v20, 0x0

    .line 729
    .line 730
    const/16 v21, 0x1

    .line 731
    .line 732
    move/from16 v19, v1

    .line 733
    .line 734
    move-object/from16 v16, v10

    .line 735
    .line 736
    invoke-virtual/range {v16 .. v21}, Lcom/google/android/material/carousel/KeylineState$Builder;->a(FFFZZ)V

    .line 737
    .line 738
    .line 739
    move/from16 v5, v18

    .line 740
    .line 741
    move-object/from16 v18, v16

    .line 742
    .line 743
    iget v10, v3, Lcom/google/android/material/carousel/Arrangement;->f:F

    .line 744
    .line 745
    iget v11, v3, Lcom/google/android/material/carousel/Arrangement;->g:I

    .line 746
    .line 747
    const/16 v23, 0x1

    .line 748
    .line 749
    const/16 v20, 0x0

    .line 750
    .line 751
    move/from16 v19, v6

    .line 752
    .line 753
    move/from16 v21, v10

    .line 754
    .line 755
    move/from16 v22, v11

    .line 756
    .line 757
    invoke-virtual/range {v18 .. v23}, Lcom/google/android/material/carousel/KeylineState$Builder;->c(FFFIZ)V

    .line 758
    .line 759
    .line 760
    iget v6, v3, Lcom/google/android/material/carousel/Arrangement;->d:I

    .line 761
    .line 762
    if-lez v6, :cond_10

    .line 763
    .line 764
    iget v6, v3, Lcom/google/android/material/carousel/Arrangement;->e:F

    .line 765
    .line 766
    const/16 v22, 0x0

    .line 767
    .line 768
    const/16 v23, 0x0

    .line 769
    .line 770
    move/from16 v21, v6

    .line 771
    .line 772
    move/from16 v19, v7

    .line 773
    .line 774
    move/from16 v20, v9

    .line 775
    .line 776
    invoke-virtual/range {v18 .. v23}, Lcom/google/android/material/carousel/KeylineState$Builder;->a(FFFZZ)V

    .line 777
    .line 778
    .line 779
    :cond_10
    iget v6, v3, Lcom/google/android/material/carousel/Arrangement;->c:I

    .line 780
    .line 781
    if-lez v6, :cond_11

    .line 782
    .line 783
    iget v3, v3, Lcom/google/android/material/carousel/Arrangement;->b:F

    .line 784
    .line 785
    const/16 v23, 0x0

    .line 786
    .line 787
    move/from16 v21, v3

    .line 788
    .line 789
    move/from16 v19, v4

    .line 790
    .line 791
    move/from16 v22, v6

    .line 792
    .line 793
    move/from16 v20, v8

    .line 794
    .line 795
    invoke-virtual/range {v18 .. v23}, Lcom/google/android/material/carousel/KeylineState$Builder;->c(FFFIZ)V

    .line 796
    .line 797
    .line 798
    :cond_11
    const/16 v20, 0x0

    .line 799
    .line 800
    const/16 v21, 0x1

    .line 801
    .line 802
    move/from16 v19, v1

    .line 803
    .line 804
    move/from16 v17, v2

    .line 805
    .line 806
    move-object/from16 v16, v18

    .line 807
    .line 808
    move/from16 v18, v5

    .line 809
    .line 810
    invoke-virtual/range {v16 .. v21}, Lcom/google/android/material/carousel/KeylineState$Builder;->a(FFFZZ)V

    .line 811
    .line 812
    .line 813
    move-object/from16 v18, v16

    .line 814
    .line 815
    invoke-virtual/range {v18 .. v18}, Lcom/google/android/material/carousel/KeylineState$Builder;->d()Lcom/google/android/material/carousel/KeylineState;

    .line 816
    .line 817
    .line 818
    move-result-object v1

    .line 819
    :goto_4
    invoke-virtual {v0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->r()Z

    .line 820
    .line 821
    .line 822
    move-result v2

    .line 823
    if-eqz v2, :cond_14

    .line 824
    .line 825
    invoke-virtual {v0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->k()I

    .line 826
    .line 827
    .line 828
    move-result v2

    .line 829
    int-to-float v2, v2

    .line 830
    new-instance v3, Lcom/google/android/material/carousel/KeylineState$Builder;

    .line 831
    .line 832
    iget v4, v1, Lcom/google/android/material/carousel/KeylineState;->a:F

    .line 833
    .line 834
    invoke-direct {v3, v4, v2}, Lcom/google/android/material/carousel/KeylineState$Builder;-><init>(FF)V

    .line 835
    .line 836
    .line 837
    invoke-virtual {v1}, Lcom/google/android/material/carousel/KeylineState;->d()Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 838
    .line 839
    .line 840
    move-result-object v4

    .line 841
    iget v4, v4, Lcom/google/android/material/carousel/KeylineState$Keyline;->b:F

    .line 842
    .line 843
    sub-float/2addr v2, v4

    .line 844
    invoke-virtual {v1}, Lcom/google/android/material/carousel/KeylineState;->d()Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 845
    .line 846
    .line 847
    move-result-object v4

    .line 848
    iget v4, v4, Lcom/google/android/material/carousel/KeylineState$Keyline;->d:F

    .line 849
    .line 850
    div-float v4, v4, p1

    .line 851
    .line 852
    sub-float/2addr v2, v4

    .line 853
    iget-object v9, v1, Lcom/google/android/material/carousel/KeylineState;->b:Ljava/util/List;

    .line 854
    .line 855
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 856
    .line 857
    .line 858
    move-result v4

    .line 859
    sub-int/2addr v4, v15

    .line 860
    move v10, v4

    .line 861
    :goto_5
    if-ltz v10, :cond_13

    .line 862
    .line 863
    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 864
    .line 865
    .line 866
    move-result-object v4

    .line 867
    move-object v11, v4

    .line 868
    check-cast v11, Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 869
    .line 870
    iget v6, v11, Lcom/google/android/material/carousel/KeylineState$Keyline;->d:F

    .line 871
    .line 872
    div-float v4, v6, p1

    .line 873
    .line 874
    add-float/2addr v4, v2

    .line 875
    iget v5, v1, Lcom/google/android/material/carousel/KeylineState;->c:I

    .line 876
    .line 877
    if-lt v10, v5, :cond_12

    .line 878
    .line 879
    iget v5, v1, Lcom/google/android/material/carousel/KeylineState;->d:I

    .line 880
    .line 881
    if-gt v10, v5, :cond_12

    .line 882
    .line 883
    const/4 v7, 0x1

    .line 884
    goto :goto_6

    .line 885
    :cond_12
    const/4 v7, 0x0

    .line 886
    :goto_6
    iget v5, v11, Lcom/google/android/material/carousel/KeylineState$Keyline;->c:F

    .line 887
    .line 888
    iget-boolean v8, v11, Lcom/google/android/material/carousel/KeylineState$Keyline;->e:Z

    .line 889
    .line 890
    invoke-virtual/range {v3 .. v8}, Lcom/google/android/material/carousel/KeylineState$Builder;->a(FFFZZ)V

    .line 891
    .line 892
    .line 893
    iget v4, v11, Lcom/google/android/material/carousel/KeylineState$Keyline;->d:F

    .line 894
    .line 895
    add-float/2addr v2, v4

    .line 896
    add-int/lit8 v10, v10, -0x1

    .line 897
    .line 898
    goto :goto_5

    .line 899
    :cond_13
    invoke-virtual {v3}, Lcom/google/android/material/carousel/KeylineState$Builder;->d()Lcom/google/android/material/carousel/KeylineState;

    .line 900
    .line 901
    .line 902
    move-result-object v1

    .line 903
    :cond_14
    move-object v2, v1

    .line 904
    iget-object v1, v2, Lcom/google/android/material/carousel/KeylineState;->b:Ljava/util/List;

    .line 905
    .line 906
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 907
    .line 908
    .line 909
    move-result v3

    .line 910
    if-lez v3, :cond_16

    .line 911
    .line 912
    const/4 v3, 0x0

    .line 913
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/p1;->getChildAt(I)Landroid/view/View;

    .line 914
    .line 915
    .line 916
    move-result-object v4

    .line 917
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 918
    .line 919
    .line 920
    move-result-object v3

    .line 921
    check-cast v3, Landroidx/recyclerview/widget/q1;

    .line 922
    .line 923
    iget-object v4, v0, Lcom/google/android/material/carousel/CarouselLayoutManager;->j:Lcom/google/android/material/carousel/CarouselOrientationHelper;

    .line 924
    .line 925
    iget v4, v4, Lcom/google/android/material/carousel/CarouselOrientationHelper;->a:I

    .line 926
    .line 927
    if-nez v4, :cond_15

    .line 928
    .line 929
    iget v4, v3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 930
    .line 931
    iget v3, v3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 932
    .line 933
    :goto_7
    add-int/2addr v3, v4

    .line 934
    goto :goto_8

    .line 935
    :cond_15
    iget v4, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 936
    .line 937
    iget v3, v3, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 938
    .line 939
    goto :goto_7

    .line 940
    :cond_16
    const/4 v3, 0x0

    .line 941
    :goto_8
    int-to-float v9, v3

    .line 942
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getClipToPadding()Z

    .line 943
    .line 944
    .line 945
    move-result v3

    .line 946
    if-nez v3, :cond_18

    .line 947
    .line 948
    iget-object v3, v0, Lcom/google/android/material/carousel/CarouselLayoutManager;->e:Lcom/google/android/material/carousel/MultiBrowseCarouselStrategy;

    .line 949
    .line 950
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 951
    .line 952
    .line 953
    iget-object v3, v0, Lcom/google/android/material/carousel/CarouselLayoutManager;->j:Lcom/google/android/material/carousel/CarouselOrientationHelper;

    .line 954
    .line 955
    iget v3, v3, Lcom/google/android/material/carousel/CarouselOrientationHelper;->a:I

    .line 956
    .line 957
    if-ne v3, v15, :cond_17

    .line 958
    .line 959
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getPaddingTop()I

    .line 960
    .line 961
    .line 962
    move-result v3

    .line 963
    goto :goto_9

    .line 964
    :cond_17
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getPaddingLeft()I

    .line 965
    .line 966
    .line 967
    move-result v3

    .line 968
    goto :goto_9

    .line 969
    :cond_18
    const/4 v3, 0x0

    .line 970
    :goto_9
    int-to-float v3, v3

    .line 971
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getClipToPadding()Z

    .line 972
    .line 973
    .line 974
    move-result v4

    .line 975
    if-nez v4, :cond_1a

    .line 976
    .line 977
    iget-object v4, v0, Lcom/google/android/material/carousel/CarouselLayoutManager;->e:Lcom/google/android/material/carousel/MultiBrowseCarouselStrategy;

    .line 978
    .line 979
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 980
    .line 981
    .line 982
    iget-object v4, v0, Lcom/google/android/material/carousel/CarouselLayoutManager;->j:Lcom/google/android/material/carousel/CarouselOrientationHelper;

    .line 983
    .line 984
    iget v4, v4, Lcom/google/android/material/carousel/CarouselOrientationHelper;->a:I

    .line 985
    .line 986
    if-ne v4, v15, :cond_19

    .line 987
    .line 988
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getPaddingBottom()I

    .line 989
    .line 990
    .line 991
    move-result v4

    .line 992
    goto :goto_a

    .line 993
    :cond_19
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getPaddingRight()I

    .line 994
    .line 995
    .line 996
    move-result v4

    .line 997
    goto :goto_a

    .line 998
    :cond_1a
    const/4 v4, 0x0

    .line 999
    :goto_a
    int-to-float v10, v4

    .line 1000
    new-instance v11, Lcom/google/android/material/carousel/KeylineStateList;

    .line 1001
    .line 1002
    new-instance v12, Ljava/util/ArrayList;

    .line 1003
    .line 1004
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 1005
    .line 1006
    .line 1007
    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1008
    .line 1009
    .line 1010
    const/4 v4, 0x0

    .line 1011
    :goto_b
    iget v13, v2, Lcom/google/android/material/carousel/KeylineState;->d:I

    .line 1012
    .line 1013
    iget v14, v2, Lcom/google/android/material/carousel/KeylineState;->c:I

    .line 1014
    .line 1015
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1016
    .line 1017
    .line 1018
    move-result v5

    .line 1019
    if-ge v4, v5, :cond_1c

    .line 1020
    .line 1021
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v5

    .line 1025
    check-cast v5, Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 1026
    .line 1027
    iget-boolean v5, v5, Lcom/google/android/material/carousel/KeylineState$Keyline;->e:Z

    .line 1028
    .line 1029
    if-nez v5, :cond_1b

    .line 1030
    .line 1031
    goto :goto_c

    .line 1032
    :cond_1b
    add-int/lit8 v4, v4, 0x1

    .line 1033
    .line 1034
    goto :goto_b

    .line 1035
    :cond_1c
    const/4 v4, -0x1

    .line 1036
    :goto_c
    invoke-virtual {v0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->q()Z

    .line 1037
    .line 1038
    .line 1039
    move-result v5

    .line 1040
    if-eqz v5, :cond_1d

    .line 1041
    .line 1042
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getWidth()I

    .line 1043
    .line 1044
    .line 1045
    move-result v5

    .line 1046
    :goto_d
    int-to-float v5, v5

    .line 1047
    move v8, v5

    .line 1048
    goto :goto_e

    .line 1049
    :cond_1d
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getHeight()I

    .line 1050
    .line 1051
    .line 1052
    move-result v5

    .line 1053
    goto :goto_d

    .line 1054
    :goto_e
    invoke-virtual {v2}, Lcom/google/android/material/carousel/KeylineState;->a()Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v5

    .line 1058
    iget v5, v5, Lcom/google/android/material/carousel/KeylineState$Keyline;->b:F

    .line 1059
    .line 1060
    invoke-virtual {v2}, Lcom/google/android/material/carousel/KeylineState;->a()Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v7

    .line 1064
    iget v7, v7, Lcom/google/android/material/carousel/KeylineState$Keyline;->d:F

    .line 1065
    .line 1066
    div-float v7, v7, p1

    .line 1067
    .line 1068
    sub-float/2addr v5, v7

    .line 1069
    const/16 v23, 0x0

    .line 1070
    .line 1071
    const/16 v24, 0x0

    .line 1072
    .line 1073
    cmpl-float v5, v5, v24

    .line 1074
    .line 1075
    if-ltz v5, :cond_20

    .line 1076
    .line 1077
    invoke-virtual {v2}, Lcom/google/android/material/carousel/KeylineState;->a()Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v5

    .line 1081
    const/4 v7, 0x0

    .line 1082
    :goto_f
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1083
    .line 1084
    .line 1085
    move-result v15

    .line 1086
    if-ge v7, v15, :cond_1f

    .line 1087
    .line 1088
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v15

    .line 1092
    check-cast v15, Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 1093
    .line 1094
    iget-boolean v6, v15, Lcom/google/android/material/carousel/KeylineState$Keyline;->e:Z

    .line 1095
    .line 1096
    if-nez v6, :cond_1e

    .line 1097
    .line 1098
    goto :goto_10

    .line 1099
    :cond_1e
    add-int/lit8 v7, v7, 0x1

    .line 1100
    .line 1101
    goto :goto_f

    .line 1102
    :cond_1f
    move-object/from16 v15, v23

    .line 1103
    .line 1104
    :goto_10
    if-ne v5, v15, :cond_20

    .line 1105
    .line 1106
    const/4 v5, -0x1

    .line 1107
    goto :goto_11

    .line 1108
    :cond_20
    const/4 v5, -0x1

    .line 1109
    if-ne v4, v5, :cond_21

    .line 1110
    .line 1111
    :goto_11
    cmpl-float v4, v3, v24

    .line 1112
    .line 1113
    if-lez v4, :cond_27

    .line 1114
    .line 1115
    const/4 v4, 0x1

    .line 1116
    invoke-static {v2, v3, v8, v4, v9}, Lcom/google/android/material/carousel/KeylineStateList;->g(Lcom/google/android/material/carousel/KeylineState;FFZF)Lcom/google/android/material/carousel/KeylineState;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v3

    .line 1120
    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1121
    .line 1122
    .line 1123
    goto/16 :goto_17

    .line 1124
    .line 1125
    :cond_21
    sub-int v6, v14, v4

    .line 1126
    .line 1127
    invoke-virtual {v2}, Lcom/google/android/material/carousel/KeylineState;->b()Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v7

    .line 1131
    iget v7, v7, Lcom/google/android/material/carousel/KeylineState$Keyline;->b:F

    .line 1132
    .line 1133
    invoke-virtual {v2}, Lcom/google/android/material/carousel/KeylineState;->b()Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v15

    .line 1137
    iget v15, v15, Lcom/google/android/material/carousel/KeylineState$Keyline;->d:F

    .line 1138
    .line 1139
    div-float v15, v15, p1

    .line 1140
    .line 1141
    sub-float/2addr v7, v15

    .line 1142
    if-gtz v6, :cond_22

    .line 1143
    .line 1144
    invoke-virtual {v2}, Lcom/google/android/material/carousel/KeylineState;->a()Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v15

    .line 1148
    iget v15, v15, Lcom/google/android/material/carousel/KeylineState$Keyline;->f:F

    .line 1149
    .line 1150
    cmpl-float v15, v15, v24

    .line 1151
    .line 1152
    if-lez v15, :cond_22

    .line 1153
    .line 1154
    invoke-virtual {v2}, Lcom/google/android/material/carousel/KeylineState;->a()Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v3

    .line 1158
    iget v3, v3, Lcom/google/android/material/carousel/KeylineState$Keyline;->f:F

    .line 1159
    .line 1160
    add-float/2addr v7, v3

    .line 1161
    iget v6, v2, Lcom/google/android/material/carousel/KeylineState;->c:I

    .line 1162
    .line 1163
    move v5, v7

    .line 1164
    const/16 v16, -0x1

    .line 1165
    .line 1166
    iget v7, v2, Lcom/google/android/material/carousel/KeylineState;->d:I

    .line 1167
    .line 1168
    const/4 v3, 0x0

    .line 1169
    const/4 v4, 0x0

    .line 1170
    const/4 v15, -0x1

    .line 1171
    invoke-static/range {v2 .. v8}, Lcom/google/android/material/carousel/KeylineStateList;->f(Lcom/google/android/material/carousel/KeylineState;IIFIIF)Lcom/google/android/material/carousel/KeylineState;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v3

    .line 1175
    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1176
    .line 1177
    .line 1178
    goto/16 :goto_17

    .line 1179
    .line 1180
    :cond_22
    move/from16 v22, v8

    .line 1181
    .line 1182
    const/4 v15, -0x1

    .line 1183
    const/4 v5, 0x0

    .line 1184
    const/4 v8, 0x0

    .line 1185
    :goto_12
    if-ge v5, v6, :cond_27

    .line 1186
    .line 1187
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 1188
    .line 1189
    .line 1190
    move-result v16

    .line 1191
    const/16 v25, 0x1

    .line 1192
    .line 1193
    add-int/lit8 v15, v16, -0x1

    .line 1194
    .line 1195
    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v15

    .line 1199
    check-cast v15, Lcom/google/android/material/carousel/KeylineState;

    .line 1200
    .line 1201
    move/from16 v17, v4

    .line 1202
    .line 1203
    add-int v4, v17, v5

    .line 1204
    .line 1205
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1206
    .line 1207
    .line 1208
    move-result v16

    .line 1209
    add-int/lit8 v16, v16, -0x1

    .line 1210
    .line 1211
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v18

    .line 1215
    move/from16 v19, v4

    .line 1216
    .line 1217
    move-object/from16 v4, v18

    .line 1218
    .line 1219
    check-cast v4, Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 1220
    .line 1221
    iget v4, v4, Lcom/google/android/material/carousel/KeylineState$Keyline;->f:F

    .line 1222
    .line 1223
    add-float/2addr v8, v4

    .line 1224
    add-int/lit8 v4, v19, -0x1

    .line 1225
    .line 1226
    if-ltz v4, :cond_25

    .line 1227
    .line 1228
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v4

    .line 1232
    check-cast v4, Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 1233
    .line 1234
    iget v4, v4, Lcom/google/android/material/carousel/KeylineState$Keyline;->c:F

    .line 1235
    .line 1236
    move/from16 v16, v4

    .line 1237
    .line 1238
    iget v4, v15, Lcom/google/android/material/carousel/KeylineState;->d:I

    .line 1239
    .line 1240
    move/from16 v18, v4

    .line 1241
    .line 1242
    iget-object v4, v15, Lcom/google/android/material/carousel/KeylineState;->b:Ljava/util/List;

    .line 1243
    .line 1244
    move/from16 v27, v6

    .line 1245
    .line 1246
    move/from16 v28, v7

    .line 1247
    .line 1248
    move/from16 v6, v18

    .line 1249
    .line 1250
    :goto_13
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 1251
    .line 1252
    .line 1253
    move-result v7

    .line 1254
    if-ge v6, v7, :cond_24

    .line 1255
    .line 1256
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v7

    .line 1260
    check-cast v7, Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 1261
    .line 1262
    iget v7, v7, Lcom/google/android/material/carousel/KeylineState$Keyline;->c:F

    .line 1263
    .line 1264
    cmpl-float v7, v16, v7

    .line 1265
    .line 1266
    if-nez v7, :cond_23

    .line 1267
    .line 1268
    move v4, v6

    .line 1269
    const/4 v6, 0x1

    .line 1270
    goto :goto_14

    .line 1271
    :cond_23
    add-int/lit8 v6, v6, 0x1

    .line 1272
    .line 1273
    goto :goto_13

    .line 1274
    :cond_24
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 1275
    .line 1276
    .line 1277
    move-result v4

    .line 1278
    const/4 v6, 0x1

    .line 1279
    sub-int/2addr v4, v6

    .line 1280
    :goto_14
    add-int/lit8 v16, v4, -0x1

    .line 1281
    .line 1282
    :goto_15
    move/from16 v18, v16

    .line 1283
    .line 1284
    goto :goto_16

    .line 1285
    :cond_25
    move/from16 v27, v6

    .line 1286
    .line 1287
    move/from16 v28, v7

    .line 1288
    .line 1289
    const/4 v6, 0x1

    .line 1290
    goto :goto_15

    .line 1291
    :goto_16
    sub-int v4, v14, v5

    .line 1292
    .line 1293
    add-int/lit8 v20, v4, -0x1

    .line 1294
    .line 1295
    sub-int v4, v13, v5

    .line 1296
    .line 1297
    add-int/lit8 v21, v4, -0x1

    .line 1298
    .line 1299
    add-float v19, v28, v8

    .line 1300
    .line 1301
    move-object/from16 v16, v15

    .line 1302
    .line 1303
    invoke-static/range {v16 .. v22}, Lcom/google/android/material/carousel/KeylineStateList;->f(Lcom/google/android/material/carousel/KeylineState;IIFIIF)Lcom/google/android/material/carousel/KeylineState;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v4

    .line 1307
    move/from16 v7, v22

    .line 1308
    .line 1309
    add-int/lit8 v15, v27, -0x1

    .line 1310
    .line 1311
    if-ne v5, v15, :cond_26

    .line 1312
    .line 1313
    cmpl-float v15, v3, v24

    .line 1314
    .line 1315
    if-lez v15, :cond_26

    .line 1316
    .line 1317
    invoke-static {v4, v3, v7, v6, v9}, Lcom/google/android/material/carousel/KeylineStateList;->g(Lcom/google/android/material/carousel/KeylineState;FFZF)Lcom/google/android/material/carousel/KeylineState;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v4

    .line 1321
    :cond_26
    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1322
    .line 1323
    .line 1324
    add-int/lit8 v5, v5, 0x1

    .line 1325
    .line 1326
    move/from16 v22, v7

    .line 1327
    .line 1328
    move/from16 v4, v17

    .line 1329
    .line 1330
    move/from16 v6, v27

    .line 1331
    .line 1332
    move/from16 v7, v28

    .line 1333
    .line 1334
    const/4 v15, -0x1

    .line 1335
    goto/16 :goto_12

    .line 1336
    .line 1337
    :cond_27
    :goto_17
    new-instance v15, Ljava/util/ArrayList;

    .line 1338
    .line 1339
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 1340
    .line 1341
    .line 1342
    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1343
    .line 1344
    .line 1345
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1346
    .line 1347
    .line 1348
    move-result v3

    .line 1349
    const/16 v25, 0x1

    .line 1350
    .line 1351
    add-int/lit8 v3, v3, -0x1

    .line 1352
    .line 1353
    move v6, v3

    .line 1354
    :goto_18
    if-ltz v6, :cond_29

    .line 1355
    .line 1356
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1357
    .line 1358
    .line 1359
    move-result-object v3

    .line 1360
    check-cast v3, Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 1361
    .line 1362
    iget-boolean v3, v3, Lcom/google/android/material/carousel/KeylineState$Keyline;->e:Z

    .line 1363
    .line 1364
    if-nez v3, :cond_28

    .line 1365
    .line 1366
    goto :goto_19

    .line 1367
    :cond_28
    add-int/lit8 v6, v6, -0x1

    .line 1368
    .line 1369
    goto :goto_18

    .line 1370
    :cond_29
    const/4 v6, -0x1

    .line 1371
    :goto_19
    invoke-virtual {v0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->q()Z

    .line 1372
    .line 1373
    .line 1374
    move-result v3

    .line 1375
    if-eqz v3, :cond_2a

    .line 1376
    .line 1377
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getWidth()I

    .line 1378
    .line 1379
    .line 1380
    move-result v3

    .line 1381
    :goto_1a
    int-to-float v3, v3

    .line 1382
    move v8, v3

    .line 1383
    goto :goto_1b

    .line 1384
    :cond_2a
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getHeight()I

    .line 1385
    .line 1386
    .line 1387
    move-result v3

    .line 1388
    goto :goto_1a

    .line 1389
    :goto_1b
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getHeight()I

    .line 1390
    .line 1391
    .line 1392
    move-result v3

    .line 1393
    invoke-virtual {v0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->q()Z

    .line 1394
    .line 1395
    .line 1396
    move-result v4

    .line 1397
    if-eqz v4, :cond_2b

    .line 1398
    .line 1399
    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->getWidth()I

    .line 1400
    .line 1401
    .line 1402
    move-result v3

    .line 1403
    :cond_2b
    invoke-virtual {v2}, Lcom/google/android/material/carousel/KeylineState;->c()Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v4

    .line 1407
    iget v4, v4, Lcom/google/android/material/carousel/KeylineState$Keyline;->b:F

    .line 1408
    .line 1409
    invoke-virtual {v2}, Lcom/google/android/material/carousel/KeylineState;->c()Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v5

    .line 1413
    iget v5, v5, Lcom/google/android/material/carousel/KeylineState$Keyline;->d:F

    .line 1414
    .line 1415
    div-float v5, v5, p1

    .line 1416
    .line 1417
    add-float/2addr v5, v4

    .line 1418
    int-to-float v3, v3

    .line 1419
    cmpg-float v3, v5, v3

    .line 1420
    .line 1421
    if-gtz v3, :cond_2e

    .line 1422
    .line 1423
    invoke-virtual {v2}, Lcom/google/android/material/carousel/KeylineState;->c()Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 1424
    .line 1425
    .line 1426
    move-result-object v3

    .line 1427
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1428
    .line 1429
    .line 1430
    move-result v4

    .line 1431
    const/16 v25, 0x1

    .line 1432
    .line 1433
    add-int/lit8 v4, v4, -0x1

    .line 1434
    .line 1435
    :goto_1c
    if-ltz v4, :cond_2d

    .line 1436
    .line 1437
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v5

    .line 1441
    check-cast v5, Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 1442
    .line 1443
    iget-boolean v7, v5, Lcom/google/android/material/carousel/KeylineState$Keyline;->e:Z

    .line 1444
    .line 1445
    if-nez v7, :cond_2c

    .line 1446
    .line 1447
    goto :goto_1d

    .line 1448
    :cond_2c
    add-int/lit8 v4, v4, -0x1

    .line 1449
    .line 1450
    goto :goto_1c

    .line 1451
    :cond_2d
    move-object/from16 v5, v23

    .line 1452
    .line 1453
    :goto_1d
    if-ne v3, v5, :cond_2e

    .line 1454
    .line 1455
    goto :goto_1e

    .line 1456
    :cond_2e
    const/4 v5, -0x1

    .line 1457
    if-ne v6, v5, :cond_2f

    .line 1458
    .line 1459
    :goto_1e
    cmpl-float v1, v10, v24

    .line 1460
    .line 1461
    if-lez v1, :cond_35

    .line 1462
    .line 1463
    const/4 v3, 0x0

    .line 1464
    invoke-static {v2, v10, v8, v3, v9}, Lcom/google/android/material/carousel/KeylineStateList;->g(Lcom/google/android/material/carousel/KeylineState;FFZF)Lcom/google/android/material/carousel/KeylineState;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v1

    .line 1468
    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1469
    .line 1470
    .line 1471
    goto/16 :goto_25

    .line 1472
    .line 1473
    :cond_2f
    sub-int v3, v6, v13

    .line 1474
    .line 1475
    invoke-virtual {v2}, Lcom/google/android/material/carousel/KeylineState;->b()Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 1476
    .line 1477
    .line 1478
    move-result-object v4

    .line 1479
    iget v4, v4, Lcom/google/android/material/carousel/KeylineState$Keyline;->b:F

    .line 1480
    .line 1481
    invoke-virtual {v2}, Lcom/google/android/material/carousel/KeylineState;->b()Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 1482
    .line 1483
    .line 1484
    move-result-object v5

    .line 1485
    iget v5, v5, Lcom/google/android/material/carousel/KeylineState$Keyline;->d:F

    .line 1486
    .line 1487
    div-float v5, v5, p1

    .line 1488
    .line 1489
    sub-float/2addr v4, v5

    .line 1490
    if-gtz v3, :cond_30

    .line 1491
    .line 1492
    invoke-virtual {v2}, Lcom/google/android/material/carousel/KeylineState;->c()Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 1493
    .line 1494
    .line 1495
    move-result-object v5

    .line 1496
    iget v5, v5, Lcom/google/android/material/carousel/KeylineState$Keyline;->f:F

    .line 1497
    .line 1498
    cmpl-float v5, v5, v24

    .line 1499
    .line 1500
    if-lez v5, :cond_30

    .line 1501
    .line 1502
    invoke-virtual {v2}, Lcom/google/android/material/carousel/KeylineState;->c()Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v1

    .line 1506
    iget v1, v1, Lcom/google/android/material/carousel/KeylineState$Keyline;->f:F

    .line 1507
    .line 1508
    sub-float v5, v4, v1

    .line 1509
    .line 1510
    iget v6, v2, Lcom/google/android/material/carousel/KeylineState;->c:I

    .line 1511
    .line 1512
    iget v7, v2, Lcom/google/android/material/carousel/KeylineState;->d:I

    .line 1513
    .line 1514
    const/4 v3, 0x0

    .line 1515
    const/4 v4, 0x0

    .line 1516
    invoke-static/range {v2 .. v8}, Lcom/google/android/material/carousel/KeylineStateList;->f(Lcom/google/android/material/carousel/KeylineState;IIFIIF)Lcom/google/android/material/carousel/KeylineState;

    .line 1517
    .line 1518
    .line 1519
    move-result-object v1

    .line 1520
    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1521
    .line 1522
    .line 1523
    goto/16 :goto_25

    .line 1524
    .line 1525
    :cond_30
    move/from16 v22, v8

    .line 1526
    .line 1527
    const/4 v5, 0x0

    .line 1528
    const/4 v7, 0x0

    .line 1529
    :goto_1f
    if-ge v5, v3, :cond_35

    .line 1530
    .line 1531
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 1532
    .line 1533
    .line 1534
    move-result v8

    .line 1535
    const/16 v25, 0x1

    .line 1536
    .line 1537
    add-int/lit8 v8, v8, -0x1

    .line 1538
    .line 1539
    invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1540
    .line 1541
    .line 1542
    move-result-object v8

    .line 1543
    check-cast v8, Lcom/google/android/material/carousel/KeylineState;

    .line 1544
    .line 1545
    move/from16 p1, v3

    .line 1546
    .line 1547
    sub-int v3, v6, v5

    .line 1548
    .line 1549
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1550
    .line 1551
    .line 1552
    move-result-object v16

    .line 1553
    move/from16 v17, v3

    .line 1554
    .line 1555
    move-object/from16 v3, v16

    .line 1556
    .line 1557
    check-cast v3, Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 1558
    .line 1559
    iget v3, v3, Lcom/google/android/material/carousel/KeylineState$Keyline;->f:F

    .line 1560
    .line 1561
    add-float/2addr v7, v3

    .line 1562
    add-int/lit8 v3, v17, 0x1

    .line 1563
    .line 1564
    move/from16 v23, v4

    .line 1565
    .line 1566
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1567
    .line 1568
    .line 1569
    move-result v4

    .line 1570
    if-ge v3, v4, :cond_33

    .line 1571
    .line 1572
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1573
    .line 1574
    .line 1575
    move-result-object v3

    .line 1576
    check-cast v3, Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 1577
    .line 1578
    iget v3, v3, Lcom/google/android/material/carousel/KeylineState$Keyline;->c:F

    .line 1579
    .line 1580
    iget v4, v8, Lcom/google/android/material/carousel/KeylineState;->c:I

    .line 1581
    .line 1582
    add-int/lit8 v4, v4, -0x1

    .line 1583
    .line 1584
    :goto_20
    if-ltz v4, :cond_32

    .line 1585
    .line 1586
    move-object/from16 v26, v1

    .line 1587
    .line 1588
    iget-object v1, v8, Lcom/google/android/material/carousel/KeylineState;->b:Ljava/util/List;

    .line 1589
    .line 1590
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1591
    .line 1592
    .line 1593
    move-result-object v1

    .line 1594
    check-cast v1, Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 1595
    .line 1596
    iget v1, v1, Lcom/google/android/material/carousel/KeylineState$Keyline;->c:F

    .line 1597
    .line 1598
    cmpl-float v1, v3, v1

    .line 1599
    .line 1600
    if-nez v1, :cond_31

    .line 1601
    .line 1602
    move v3, v4

    .line 1603
    :goto_21
    const/16 v25, 0x1

    .line 1604
    .line 1605
    goto :goto_22

    .line 1606
    :cond_31
    add-int/lit8 v4, v4, -0x1

    .line 1607
    .line 1608
    move-object/from16 v1, v26

    .line 1609
    .line 1610
    goto :goto_20

    .line 1611
    :cond_32
    move-object/from16 v26, v1

    .line 1612
    .line 1613
    const/4 v3, 0x0

    .line 1614
    goto :goto_21

    .line 1615
    :goto_22
    add-int/lit8 v3, v3, 0x1

    .line 1616
    .line 1617
    move/from16 v18, v3

    .line 1618
    .line 1619
    goto :goto_23

    .line 1620
    :cond_33
    move-object/from16 v26, v1

    .line 1621
    .line 1622
    const/16 v18, 0x0

    .line 1623
    .line 1624
    :goto_23
    add-int v1, v14, v5

    .line 1625
    .line 1626
    add-int/lit8 v20, v1, 0x1

    .line 1627
    .line 1628
    add-int v1, v13, v5

    .line 1629
    .line 1630
    add-int/lit8 v21, v1, 0x1

    .line 1631
    .line 1632
    sub-float v19, v23, v7

    .line 1633
    .line 1634
    move/from16 v17, v6

    .line 1635
    .line 1636
    move-object/from16 v16, v8

    .line 1637
    .line 1638
    invoke-static/range {v16 .. v22}, Lcom/google/android/material/carousel/KeylineStateList;->f(Lcom/google/android/material/carousel/KeylineState;IIFIIF)Lcom/google/android/material/carousel/KeylineState;

    .line 1639
    .line 1640
    .line 1641
    move-result-object v1

    .line 1642
    move/from16 v8, v22

    .line 1643
    .line 1644
    add-int/lit8 v3, p1, -0x1

    .line 1645
    .line 1646
    if-ne v5, v3, :cond_34

    .line 1647
    .line 1648
    cmpl-float v3, v10, v24

    .line 1649
    .line 1650
    if-lez v3, :cond_34

    .line 1651
    .line 1652
    const/4 v3, 0x0

    .line 1653
    invoke-static {v1, v10, v8, v3, v9}, Lcom/google/android/material/carousel/KeylineStateList;->g(Lcom/google/android/material/carousel/KeylineState;FFZF)Lcom/google/android/material/carousel/KeylineState;

    .line 1654
    .line 1655
    .line 1656
    move-result-object v1

    .line 1657
    goto :goto_24

    .line 1658
    :cond_34
    const/4 v3, 0x0

    .line 1659
    :goto_24
    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1660
    .line 1661
    .line 1662
    add-int/lit8 v5, v5, 0x1

    .line 1663
    .line 1664
    move/from16 v3, p1

    .line 1665
    .line 1666
    move/from16 v22, v8

    .line 1667
    .line 1668
    move/from16 v6, v17

    .line 1669
    .line 1670
    move/from16 v4, v23

    .line 1671
    .line 1672
    move-object/from16 v1, v26

    .line 1673
    .line 1674
    goto/16 :goto_1f

    .line 1675
    .line 1676
    :cond_35
    :goto_25
    invoke-direct {v11, v2, v12, v15}, Lcom/google/android/material/carousel/KeylineStateList;-><init>(Lcom/google/android/material/carousel/KeylineState;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 1677
    .line 1678
    .line 1679
    iput-object v11, v0, Lcom/google/android/material/carousel/CarouselLayoutManager;->f:Lcom/google/android/material/carousel/KeylineStateList;

    .line 1680
    .line 1681
    return-void
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
.end method

.method public final w()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->f:Lcom/google/android/material/carousel/KeylineStateList;

    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->requestLayout()V

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

.method public final x(ILandroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/e2;)I
    .locals 11

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_7

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_3

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->f:Lcom/google/android/material/carousel/KeylineStateList;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, p2}, Lcom/google/android/material/carousel/CarouselLayoutManager;->v(Landroidx/recyclerview/widget/x1;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    iget v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->a:I

    .line 20
    .line 21
    iget v2, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->b:I

    .line 22
    .line 23
    iget v3, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->c:I

    .line 24
    .line 25
    add-int v4, v0, p1

    .line 26
    .line 27
    if-ge v4, v2, :cond_2

    .line 28
    .line 29
    sub-int p1, v2, v0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    if-le v4, v3, :cond_3

    .line 33
    .line 34
    sub-int p1, v3, v0

    .line 35
    .line 36
    :cond_3
    :goto_0
    add-int/2addr v0, p1

    .line 37
    iput v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->a:I

    .line 38
    .line 39
    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->f:Lcom/google/android/material/carousel/KeylineStateList;

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->z(Lcom/google/android/material/carousel/KeylineStateList;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->g:Lcom/google/android/material/carousel/KeylineState;

    .line 45
    .line 46
    iget v0, v0, Lcom/google/android/material/carousel/KeylineState;->a:F

    .line 47
    .line 48
    const/high16 v2, 0x40000000    # 2.0f

    .line 49
    .line 50
    div-float/2addr v0, v2

    .line 51
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/p1;->getChildAt(I)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/p1;->getPosition(Landroid/view/View;)I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    invoke-virtual {p0, v2}, Lcom/google/android/material/carousel/CarouselLayoutManager;->i(I)F

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    new-instance v3, Landroid/graphics/Rect;

    .line 64
    .line 65
    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->r()Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_4

    .line 73
    .line 74
    iget-object v4, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->g:Lcom/google/android/material/carousel/KeylineState;

    .line 75
    .line 76
    invoke-virtual {v4}, Lcom/google/android/material/carousel/KeylineState;->c()Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    iget v4, v4, Lcom/google/android/material/carousel/KeylineState$Keyline;->b:F

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    iget-object v4, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->g:Lcom/google/android/material/carousel/KeylineState;

    .line 84
    .line 85
    invoke-virtual {v4}, Lcom/google/android/material/carousel/KeylineState;->a()Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    iget v4, v4, Lcom/google/android/material/carousel/KeylineState$Keyline;->b:F

    .line 90
    .line 91
    :goto_1
    const v5, 0x7f7fffff    # Float.MAX_VALUE

    .line 92
    .line 93
    .line 94
    const/4 v6, 0x0

    .line 95
    :goto_2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/p1;->getChildCount()I

    .line 96
    .line 97
    .line 98
    move-result v7

    .line 99
    if-ge v6, v7, :cond_6

    .line 100
    .line 101
    invoke-virtual {p0, v6}, Landroidx/recyclerview/widget/p1;->getChildAt(I)Landroid/view/View;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    invoke-virtual {p0, v2, v0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->e(FF)F

    .line 106
    .line 107
    .line 108
    move-result v8

    .line 109
    iget-object v9, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->g:Lcom/google/android/material/carousel/KeylineState;

    .line 110
    .line 111
    iget-object v9, v9, Lcom/google/android/material/carousel/KeylineState;->b:Ljava/util/List;

    .line 112
    .line 113
    invoke-static {v9, v8, v1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->p(Ljava/util/List;FZ)Lcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;

    .line 114
    .line 115
    .line 116
    move-result-object v9

    .line 117
    invoke-virtual {p0, v7, v8, v9}, Lcom/google/android/material/carousel/CarouselLayoutManager;->h(Landroid/view/View;FLcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;)F

    .line 118
    .line 119
    .line 120
    move-result v10

    .line 121
    invoke-super {p0, v7, v3}, Landroidx/recyclerview/widget/p1;->getDecoratedBoundsWithMargins(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0, v7, v8, v9}, Lcom/google/android/material/carousel/CarouselLayoutManager;->y(Landroid/view/View;FLcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;)V

    .line 125
    .line 126
    .line 127
    iget-object v8, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->j:Lcom/google/android/material/carousel/CarouselOrientationHelper;

    .line 128
    .line 129
    invoke-virtual {v8, v7, v3, v0, v10}, Lcom/google/android/material/carousel/CarouselOrientationHelper;->l(Landroid/view/View;Landroid/graphics/Rect;FF)V

    .line 130
    .line 131
    .line 132
    sub-float v8, v4, v10

    .line 133
    .line 134
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 135
    .line 136
    .line 137
    move-result v8

    .line 138
    cmpg-float v9, v8, v5

    .line 139
    .line 140
    if-gez v9, :cond_5

    .line 141
    .line 142
    invoke-virtual {p0, v7}, Landroidx/recyclerview/widget/p1;->getPosition(Landroid/view/View;)I

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    iput v5, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->m:I

    .line 147
    .line 148
    move v5, v8

    .line 149
    :cond_5
    iget-object v7, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->g:Lcom/google/android/material/carousel/KeylineState;

    .line 150
    .line 151
    iget v7, v7, Lcom/google/android/material/carousel/KeylineState;->a:F

    .line 152
    .line 153
    invoke-virtual {p0, v2, v7}, Lcom/google/android/material/carousel/CarouselLayoutManager;->e(FF)F

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    add-int/lit8 v6, v6, 0x1

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_6
    invoke-virtual {p0, p2, p3}, Lcom/google/android/material/carousel/CarouselLayoutManager;->j(Landroidx/recyclerview/widget/x1;Landroidx/recyclerview/widget/e2;)V

    .line 161
    .line 162
    .line 163
    return p1

    .line 164
    :cond_7
    :goto_3
    return v1
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
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
.end method

.method public final y(Landroid/view/View;FLcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;)V
    .locals 8

    .line 1
    instance-of v0, p1, Lcom/google/android/material/carousel/Maskable;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p3, Lcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;->a:Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 7
    .line 8
    iget v1, v0, Lcom/google/android/material/carousel/KeylineState$Keyline;->c:F

    .line 9
    .line 10
    iget-object v2, p3, Lcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;->b:Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 11
    .line 12
    iget v3, v2, Lcom/google/android/material/carousel/KeylineState$Keyline;->c:F

    .line 13
    .line 14
    iget v0, v0, Lcom/google/android/material/carousel/KeylineState$Keyline;->a:F

    .line 15
    .line 16
    iget v2, v2, Lcom/google/android/material/carousel/KeylineState$Keyline;->a:F

    .line 17
    .line 18
    invoke-static {v1, v3, v0, v2, p2}, Lcom/google/android/material/animation/AnimationUtils;->b(FFFFF)F

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    int-to-float v1, v1

    .line 27
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    int-to-float v2, v2

    .line 32
    const/high16 v3, 0x40000000    # 2.0f

    .line 33
    .line 34
    div-float v4, v2, v3

    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    const/high16 v6, 0x3f800000    # 1.0f

    .line 38
    .line 39
    invoke-static {v5, v4, v5, v6, v0}, Lcom/google/android/material/animation/AnimationUtils;->b(FFFFF)F

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    div-float v7, v1, v3

    .line 44
    .line 45
    invoke-static {v5, v7, v5, v6, v0}, Lcom/google/android/material/animation/AnimationUtils;->b(FFFFF)F

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iget-object v5, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->j:Lcom/google/android/material/carousel/CarouselOrientationHelper;

    .line 50
    .line 51
    invoke-virtual {v5, v1, v2, v0, v4}, Lcom/google/android/material/carousel/CarouselOrientationHelper;->c(FFFF)Landroid/graphics/RectF;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/material/carousel/CarouselLayoutManager;->h(Landroid/view/View;FLcom/google/android/material/carousel/CarouselLayoutManager$KeylineRange;)F

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 60
    .line 61
    .line 62
    move-result p3

    .line 63
    div-float/2addr p3, v3

    .line 64
    sub-float p3, p2, p3

    .line 65
    .line 66
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    div-float/2addr v1, v3

    .line 71
    add-float/2addr v1, p2

    .line 72
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    div-float/2addr v2, v3

    .line 77
    sub-float v2, p2, v2

    .line 78
    .line 79
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    div-float/2addr v4, v3

    .line 84
    add-float/2addr v4, p2

    .line 85
    new-instance p2, Landroid/graphics/RectF;

    .line 86
    .line 87
    invoke-direct {p2, v2, p3, v4, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 88
    .line 89
    .line 90
    new-instance p3, Landroid/graphics/RectF;

    .line 91
    .line 92
    iget-object v1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->j:Lcom/google/android/material/carousel/CarouselOrientationHelper;

    .line 93
    .line 94
    invoke-virtual {v1}, Lcom/google/android/material/carousel/CarouselOrientationHelper;->f()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    int-to-float v1, v1

    .line 99
    iget-object v2, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->j:Lcom/google/android/material/carousel/CarouselOrientationHelper;

    .line 100
    .line 101
    invoke-virtual {v2}, Lcom/google/android/material/carousel/CarouselOrientationHelper;->i()I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    int-to-float v2, v2

    .line 106
    iget-object v3, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->j:Lcom/google/android/material/carousel/CarouselOrientationHelper;

    .line 107
    .line 108
    invoke-virtual {v3}, Lcom/google/android/material/carousel/CarouselOrientationHelper;->g()I

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    int-to-float v3, v3

    .line 113
    iget-object v4, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->j:Lcom/google/android/material/carousel/CarouselOrientationHelper;

    .line 114
    .line 115
    invoke-virtual {v4}, Lcom/google/android/material/carousel/CarouselOrientationHelper;->d()I

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    int-to-float v4, v4

    .line 120
    invoke-direct {p3, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 121
    .line 122
    .line 123
    iget-object v1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->e:Lcom/google/android/material/carousel/MultiBrowseCarouselStrategy;

    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    iget-object v1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->j:Lcom/google/android/material/carousel/CarouselOrientationHelper;

    .line 129
    .line 130
    invoke-virtual {v1, v0, p2, p3}, Lcom/google/android/material/carousel/CarouselOrientationHelper;->a(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;)V

    .line 131
    .line 132
    .line 133
    iget-object v1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->j:Lcom/google/android/material/carousel/CarouselOrientationHelper;

    .line 134
    .line 135
    invoke-virtual {v1, v0, p2, p3}, Lcom/google/android/material/carousel/CarouselOrientationHelper;->k(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;)V

    .line 136
    .line 137
    .line 138
    check-cast p1, Lcom/google/android/material/carousel/Maskable;

    .line 139
    .line 140
    invoke-interface {p1, v0}, Lcom/google/android/material/carousel/Maskable;->setMaskRectF(Landroid/graphics/RectF;)V

    .line 141
    .line 142
    .line 143
    return-void
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
.end method

.method public final z(Lcom/google/android/material/carousel/KeylineStateList;)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->c:I

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->b:I

    .line 4
    .line 5
    if-gt v0, v1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->r()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/google/android/material/carousel/KeylineStateList;->a()Lcom/google/android/material/carousel/KeylineState;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/material/carousel/KeylineStateList;->c()Lcom/google/android/material/carousel/KeylineState;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    :goto_0
    iput-object p1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->g:Lcom/google/android/material/carousel/KeylineState;

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    iget v2, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->a:I

    .line 26
    .line 27
    int-to-float v2, v2

    .line 28
    int-to-float v1, v1

    .line 29
    int-to-float v0, v0

    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-virtual {p1, v2, v1, v0, v3}, Lcom/google/android/material/carousel/KeylineStateList;->b(FFFZ)Lcom/google/android/material/carousel/KeylineState;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->g:Lcom/google/android/material/carousel/KeylineState;

    .line 36
    .line 37
    :goto_1
    iget-object p1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->g:Lcom/google/android/material/carousel/KeylineState;

    .line 38
    .line 39
    iget-object p1, p1, Lcom/google/android/material/carousel/KeylineState;->b:Ljava/util/List;

    .line 40
    .line 41
    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->d:Lcom/google/android/material/carousel/CarouselLayoutManager$DebugItemDecoration;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iput-object p1, v0, Lcom/google/android/material/carousel/CarouselLayoutManager$DebugItemDecoration;->i:Ljava/util/List;

    .line 51
    .line 52
    return-void
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
