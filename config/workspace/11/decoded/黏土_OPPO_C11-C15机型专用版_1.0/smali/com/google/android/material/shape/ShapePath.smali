.class public Lcom/google/android/material/shape/ShapePath;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/shape/ShapePath$PathCubicOperation;,
        Lcom/google/android/material/shape/ShapePath$PathArcOperation;,
        Lcom/google/android/material/shape/ShapePath$PathQuadOperation;,
        Lcom/google/android/material/shape/ShapePath$PathLineOperation;,
        Lcom/google/android/material/shape/ShapePath$PathOperation;,
        Lcom/google/android/material/shape/ShapePath$ArcShadowOperation;,
        Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;,
        Lcom/google/android/material/shape/ShapePath$LineShadowOperation;,
        Lcom/google/android/material/shape/ShapePath$ShadowCompatOperation;
    }
.end annotation


# instance fields
.field public a:F

.field public b:F

.field public c:F

.field public d:F

.field public e:F

.field public f:F

.field public final g:Ljava/util/ArrayList;

.field public final h:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/android/material/shape/ShapePath;->g:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/google/android/material/shape/ShapePath;->h:Ljava/util/ArrayList;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    const/high16 v1, 0x43870000    # 270.0f

    .line 20
    .line 21
    invoke-virtual {p0, v0, v0, v1, v0}, Lcom/google/android/material/shape/ShapePath;->e(FFFF)V

    .line 22
    .line 23
    .line 24
    return-void
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


# virtual methods
.method public final a(F)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/google/android/material/shape/ShapePath;->e:F

    .line 2
    .line 3
    cmpl-float v1, v0, p1

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sub-float v0, p1, v0

    .line 9
    .line 10
    const/high16 v1, 0x43b40000    # 360.0f

    .line 11
    .line 12
    add-float/2addr v0, v1

    .line 13
    rem-float/2addr v0, v1

    .line 14
    const/high16 v1, 0x43340000    # 180.0f

    .line 15
    .line 16
    cmpl-float v1, v0, v1

    .line 17
    .line 18
    if-lez v1, :cond_1

    .line 19
    .line 20
    :goto_0
    return-void

    .line 21
    :cond_1
    new-instance v1, Lcom/google/android/material/shape/ShapePath$PathArcOperation;

    .line 22
    .line 23
    iget v2, p0, Lcom/google/android/material/shape/ShapePath;->c:F

    .line 24
    .line 25
    iget v3, p0, Lcom/google/android/material/shape/ShapePath;->d:F

    .line 26
    .line 27
    invoke-direct {v1, v2, v3, v2, v3}, Lcom/google/android/material/shape/ShapePath$PathArcOperation;-><init>(FFFF)V

    .line 28
    .line 29
    .line 30
    iget v2, p0, Lcom/google/android/material/shape/ShapePath;->e:F

    .line 31
    .line 32
    iput v2, v1, Lcom/google/android/material/shape/ShapePath$PathArcOperation;->f:F

    .line 33
    .line 34
    iput v0, v1, Lcom/google/android/material/shape/ShapePath$PathArcOperation;->g:F

    .line 35
    .line 36
    new-instance v0, Lcom/google/android/material/shape/ShapePath$ArcShadowOperation;

    .line 37
    .line 38
    invoke-direct {v0, v1}, Lcom/google/android/material/shape/ShapePath$ArcShadowOperation;-><init>(Lcom/google/android/material/shape/ShapePath$PathArcOperation;)V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lcom/google/android/material/shape/ShapePath;->h:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    iput p1, p0, Lcom/google/android/material/shape/ShapePath;->e:F

    .line 47
    .line 48
    return-void
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

.method public final b(Landroid/graphics/Matrix;Landroid/graphics/Path;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/material/shape/ShapePath;->g:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    check-cast v3, Lcom/google/android/material/shape/ShapePath$PathOperation;

    .line 15
    .line 16
    invoke-virtual {v3, p1, p2}, Lcom/google/android/material/shape/ShapePath$PathOperation;->a(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 17
    .line 18
    .line 19
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void
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

.method public final c(FF)V
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/material/shape/ShapePath$PathLineOperation;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/material/shape/ShapePath$PathLineOperation;-><init>()V

    .line 4
    .line 5
    .line 6
    iput p1, v0, Lcom/google/android/material/shape/ShapePath$PathLineOperation;->b:F

    .line 7
    .line 8
    iput p2, v0, Lcom/google/android/material/shape/ShapePath$PathLineOperation;->c:F

    .line 9
    .line 10
    iget-object v1, p0, Lcom/google/android/material/shape/ShapePath;->g:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    new-instance v1, Lcom/google/android/material/shape/ShapePath$LineShadowOperation;

    .line 16
    .line 17
    iget v2, p0, Lcom/google/android/material/shape/ShapePath;->c:F

    .line 18
    .line 19
    iget v3, p0, Lcom/google/android/material/shape/ShapePath;->d:F

    .line 20
    .line 21
    invoke-direct {v1, v0, v2, v3}, Lcom/google/android/material/shape/ShapePath$LineShadowOperation;-><init>(Lcom/google/android/material/shape/ShapePath$PathLineOperation;FF)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/google/android/material/shape/ShapePath$LineShadowOperation;->b()F

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/high16 v2, 0x43870000    # 270.0f

    .line 29
    .line 30
    add-float/2addr v0, v2

    .line 31
    invoke-virtual {v1}, Lcom/google/android/material/shape/ShapePath$LineShadowOperation;->b()F

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    add-float/2addr v3, v2

    .line 36
    invoke-virtual {p0, v0}, Lcom/google/android/material/shape/ShapePath;->a(F)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lcom/google/android/material/shape/ShapePath;->h:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    iput v3, p0, Lcom/google/android/material/shape/ShapePath;->e:F

    .line 45
    .line 46
    iput p1, p0, Lcom/google/android/material/shape/ShapePath;->c:F

    .line 47
    .line 48
    iput p2, p0, Lcom/google/android/material/shape/ShapePath;->d:F

    .line 49
    .line 50
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
.end method

.method public final d(FFF)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/google/android/material/shape/ShapePath;->c:F

    .line 2
    .line 3
    sub-float v0, p1, v0

    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const v2, 0x3a83126f    # 0.001f

    .line 11
    .line 12
    .line 13
    cmpg-float v0, v0, v2

    .line 14
    .line 15
    if-gez v0, :cond_0

    .line 16
    .line 17
    iget v0, p0, Lcom/google/android/material/shape/ShapePath;->d:F

    .line 18
    .line 19
    sub-float v0, v1, v0

    .line 20
    .line 21
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    cmpg-float v0, v0, v2

    .line 26
    .line 27
    if-ltz v0, :cond_1

    .line 28
    .line 29
    :cond_0
    sub-float v0, p1, p2

    .line 30
    .line 31
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    cmpg-float v0, v0, v2

    .line 36
    .line 37
    if-gez v0, :cond_2

    .line 38
    .line 39
    sub-float v0, v1, p3

    .line 40
    .line 41
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    cmpg-float v0, v0, v2

    .line 46
    .line 47
    if-gez v0, :cond_2

    .line 48
    .line 49
    :cond_1
    invoke-virtual {p0, p2, p3}, Lcom/google/android/material/shape/ShapePath;->c(FF)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    new-instance v0, Lcom/google/android/material/shape/ShapePath$PathLineOperation;

    .line 54
    .line 55
    invoke-direct {v0}, Lcom/google/android/material/shape/ShapePath$PathLineOperation;-><init>()V

    .line 56
    .line 57
    .line 58
    iput p1, v0, Lcom/google/android/material/shape/ShapePath$PathLineOperation;->b:F

    .line 59
    .line 60
    iput v1, v0, Lcom/google/android/material/shape/ShapePath$PathLineOperation;->c:F

    .line 61
    .line 62
    iget-object v2, p0, Lcom/google/android/material/shape/ShapePath;->g:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    new-instance v3, Lcom/google/android/material/shape/ShapePath$PathLineOperation;

    .line 68
    .line 69
    invoke-direct {v3}, Lcom/google/android/material/shape/ShapePath$PathLineOperation;-><init>()V

    .line 70
    .line 71
    .line 72
    iput p2, v3, Lcom/google/android/material/shape/ShapePath$PathLineOperation;->b:F

    .line 73
    .line 74
    iput p3, v3, Lcom/google/android/material/shape/ShapePath$PathLineOperation;->c:F

    .line 75
    .line 76
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    new-instance v2, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;

    .line 80
    .line 81
    iget v4, p0, Lcom/google/android/material/shape/ShapePath;->c:F

    .line 82
    .line 83
    iget v5, p0, Lcom/google/android/material/shape/ShapePath;->d:F

    .line 84
    .line 85
    invoke-direct {v2, v0, v3, v4, v5}, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;-><init>(Lcom/google/android/material/shape/ShapePath$PathLineOperation;Lcom/google/android/material/shape/ShapePath$PathLineOperation;FF)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;->b()F

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    invoke-virtual {v2}, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;->c()F

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    sub-float/2addr v0, v3

    .line 97
    const/high16 v3, 0x43b40000    # 360.0f

    .line 98
    .line 99
    add-float/2addr v0, v3

    .line 100
    rem-float/2addr v0, v3

    .line 101
    const/high16 v4, 0x43340000    # 180.0f

    .line 102
    .line 103
    cmpg-float v4, v0, v4

    .line 104
    .line 105
    if-gtz v4, :cond_3

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_3
    sub-float/2addr v0, v3

    .line 109
    :goto_0
    cmpl-float v0, v0, v1

    .line 110
    .line 111
    if-lez v0, :cond_4

    .line 112
    .line 113
    invoke-virtual {p0, p1, v1}, Lcom/google/android/material/shape/ShapePath;->c(FF)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, p2, p3}, Lcom/google/android/material/shape/ShapePath;->c(FF)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_4
    invoke-virtual {v2}, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;->c()F

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    const/high16 v0, 0x43870000    # 270.0f

    .line 125
    .line 126
    add-float/2addr p1, v0

    .line 127
    invoke-virtual {v2}, Lcom/google/android/material/shape/ShapePath$InnerCornerShadowOperation;->b()F

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    add-float/2addr v1, v0

    .line 132
    invoke-virtual {p0, p1}, Lcom/google/android/material/shape/ShapePath;->a(F)V

    .line 133
    .line 134
    .line 135
    iget-object p1, p0, Lcom/google/android/material/shape/ShapePath;->h:Ljava/util/ArrayList;

    .line 136
    .line 137
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    iput v1, p0, Lcom/google/android/material/shape/ShapePath;->e:F

    .line 141
    .line 142
    iput p2, p0, Lcom/google/android/material/shape/ShapePath;->c:F

    .line 143
    .line 144
    iput p3, p0, Lcom/google/android/material/shape/ShapePath;->d:F

    .line 145
    .line 146
    return-void
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
.end method

.method public final e(FFFF)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/material/shape/ShapePath;->a:F

    .line 2
    .line 3
    iput p2, p0, Lcom/google/android/material/shape/ShapePath;->b:F

    .line 4
    .line 5
    iput p1, p0, Lcom/google/android/material/shape/ShapePath;->c:F

    .line 6
    .line 7
    iput p2, p0, Lcom/google/android/material/shape/ShapePath;->d:F

    .line 8
    .line 9
    iput p3, p0, Lcom/google/android/material/shape/ShapePath;->e:F

    .line 10
    .line 11
    add-float/2addr p3, p4

    .line 12
    const/high16 p1, 0x43b40000    # 360.0f

    .line 13
    .line 14
    rem-float/2addr p3, p1

    .line 15
    iput p3, p0, Lcom/google/android/material/shape/ShapePath;->f:F

    .line 16
    .line 17
    iget-object p1, p0, Lcom/google/android/material/shape/ShapePath;->g:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lcom/google/android/material/shape/ShapePath;->h:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 25
    .line 26
    .line 27
    return-void
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
.end method
