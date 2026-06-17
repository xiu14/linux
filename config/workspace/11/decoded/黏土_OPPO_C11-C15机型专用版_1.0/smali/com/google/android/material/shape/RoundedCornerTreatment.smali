.class public Lcom/google/android/material/shape/RoundedCornerTreatment;
.super Lcom/google/android/material/shape/CornerTreatment;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final a:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/shape/CornerTreatment;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, -0x40800000    # -1.0f

    .line 5
    .line 6
    iput v0, p0, Lcom/google/android/material/shape/RoundedCornerTreatment;->a:F

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
.end method


# virtual methods
.method public final a(Lcom/google/android/material/shape/ShapePath;FF)V
    .locals 9

    .line 1
    mul-float v0, p3, p2

    .line 2
    .line 3
    const/high16 v1, 0x43340000    # 180.0f

    .line 4
    .line 5
    const/high16 v2, 0x42b40000    # 90.0f

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-virtual {p1, v3, v0, v1, v2}, Lcom/google/android/material/shape/ShapePath;->e(FFFF)V

    .line 9
    .line 10
    .line 11
    const/high16 v0, 0x40000000    # 2.0f

    .line 12
    .line 13
    mul-float p3, p3, v0

    .line 14
    .line 15
    mul-float p3, p3, p2

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance p2, Lcom/google/android/material/shape/ShapePath$PathArcOperation;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-direct {p2, v0, v1, p3, p3}, Lcom/google/android/material/shape/ShapePath$PathArcOperation;-><init>(FFFF)V

    .line 25
    .line 26
    .line 27
    const/high16 v2, 0x43340000    # 180.0f

    .line 28
    .line 29
    iput v2, p2, Lcom/google/android/material/shape/ShapePath$PathArcOperation;->f:F

    .line 30
    .line 31
    const/high16 v3, 0x42b40000    # 90.0f

    .line 32
    .line 33
    iput v3, p2, Lcom/google/android/material/shape/ShapePath$PathArcOperation;->g:F

    .line 34
    .line 35
    iget-object v4, p1, Lcom/google/android/material/shape/ShapePath;->g:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {v4, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    new-instance v4, Lcom/google/android/material/shape/ShapePath$ArcShadowOperation;

    .line 41
    .line 42
    invoke-direct {v4, p2}, Lcom/google/android/material/shape/ShapePath$ArcShadowOperation;-><init>(Lcom/google/android/material/shape/ShapePath$PathArcOperation;)V

    .line 43
    .line 44
    .line 45
    add-float p2, v2, v3

    .line 46
    .line 47
    const/4 v5, 0x0

    .line 48
    cmpg-float v3, v3, v5

    .line 49
    .line 50
    if-gez v3, :cond_0

    .line 51
    .line 52
    const/4 v3, 0x1

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    const/4 v3, 0x0

    .line 55
    :goto_0
    const/high16 v5, 0x43b40000    # 360.0f

    .line 56
    .line 57
    const/high16 v6, 0x43340000    # 180.0f

    .line 58
    .line 59
    if-eqz v3, :cond_1

    .line 60
    .line 61
    add-float/2addr v2, v6

    .line 62
    rem-float/2addr v2, v5

    .line 63
    :cond_1
    if-eqz v3, :cond_2

    .line 64
    .line 65
    add-float/2addr v6, p2

    .line 66
    rem-float/2addr v6, v5

    .line 67
    goto :goto_1

    .line 68
    :cond_2
    move v6, p2

    .line 69
    :goto_1
    invoke-virtual {p1, v2}, Lcom/google/android/material/shape/ShapePath;->a(F)V

    .line 70
    .line 71
    .line 72
    iget-object v2, p1, Lcom/google/android/material/shape/ShapePath;->h:Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    iput v6, p1, Lcom/google/android/material/shape/ShapePath;->e:F

    .line 78
    .line 79
    add-float v2, v0, p3

    .line 80
    .line 81
    const/high16 v3, 0x3f000000    # 0.5f

    .line 82
    .line 83
    mul-float v2, v2, v3

    .line 84
    .line 85
    sub-float v0, p3, v0

    .line 86
    .line 87
    const/high16 v4, 0x40000000    # 2.0f

    .line 88
    .line 89
    div-float/2addr v0, v4

    .line 90
    float-to-double v5, p2

    .line 91
    invoke-static {v5, v6}, Ljava/lang/Math;->toRadians(D)D

    .line 92
    .line 93
    .line 94
    move-result-wide v7

    .line 95
    invoke-static {v7, v8}, Ljava/lang/Math;->cos(D)D

    .line 96
    .line 97
    .line 98
    move-result-wide v7

    .line 99
    double-to-float p2, v7

    .line 100
    mul-float v0, v0, p2

    .line 101
    .line 102
    add-float/2addr v0, v2

    .line 103
    iput v0, p1, Lcom/google/android/material/shape/ShapePath;->c:F

    .line 104
    .line 105
    add-float p2, v1, p3

    .line 106
    .line 107
    mul-float p2, p2, v3

    .line 108
    .line 109
    sub-float/2addr p3, v1

    .line 110
    div-float/2addr p3, v4

    .line 111
    invoke-static {v5, v6}, Ljava/lang/Math;->toRadians(D)D

    .line 112
    .line 113
    .line 114
    move-result-wide v0

    .line 115
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    .line 116
    .line 117
    .line 118
    move-result-wide v0

    .line 119
    double-to-float v0, v0

    .line 120
    mul-float p3, p3, v0

    .line 121
    .line 122
    add-float/2addr p3, p2

    .line 123
    iput p3, p1, Lcom/google/android/material/shape/ShapePath;->d:F

    .line 124
    .line 125
    return-void
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
