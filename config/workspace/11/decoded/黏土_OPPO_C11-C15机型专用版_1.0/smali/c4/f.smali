.class public final Lc4/f;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final h:I

.field public final i:J

.field public final j:F

.field public final k:F

.field public final l:Landroid/graphics/PointF;

.field public final m:Landroid/graphics/PointF;

.field public final n:Landroid/view/animation/LinearInterpolator;

.field public final synthetic o:Lcom/ortiz/touchview/TouchImageView;


# direct methods
.method public constructor <init>(Lcom/ortiz/touchview/TouchImageView;Landroid/graphics/PointF;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc4/f;->o:Lcom/ortiz/touchview/TouchImageView;

    .line 5
    .line 6
    new-instance v0, Landroid/view/animation/LinearInterpolator;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lc4/f;->n:Landroid/view/animation/LinearInterpolator;

    .line 12
    .line 13
    sget-object v0, Lc4/b;->l:Lc4/b;

    .line 14
    .line 15
    invoke-static {p1, v0}, Lcom/ortiz/touchview/TouchImageView;->e(Lcom/ortiz/touchview/TouchImageView;Lc4/b;)V

    .line 16
    .line 17
    .line 18
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    iput-wide v0, p0, Lc4/f;->i:J

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/ortiz/touchview/TouchImageView;->getCurrentZoom()F

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iput v0, p0, Lc4/f;->j:F

    .line 29
    .line 30
    const/high16 v0, 0x3f800000    # 1.0f

    .line 31
    .line 32
    iput v0, p0, Lc4/f;->k:F

    .line 33
    .line 34
    const/16 v0, 0x1f4

    .line 35
    .line 36
    iput v0, p0, Lc4/f;->h:I

    .line 37
    .line 38
    invoke-virtual {p1}, Lcom/ortiz/touchview/TouchImageView;->getScrollPosition()Landroid/graphics/PointF;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, Lc4/f;->l:Landroid/graphics/PointF;

    .line 43
    .line 44
    iput-object p2, p0, Lc4/f;->m:Landroid/graphics/PointF;

    .line 45
    .line 46
    return-void
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


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, Lc4/f;->i:J

    .line 6
    .line 7
    sub-long/2addr v0, v2

    .line 8
    long-to-float v0, v0

    .line 9
    iget v1, p0, Lc4/f;->h:I

    .line 10
    .line 11
    int-to-float v1, v1

    .line 12
    div-float/2addr v0, v1

    .line 13
    const/high16 v1, 0x3f800000    # 1.0f

    .line 14
    .line 15
    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object v2, p0, Lc4/f;->n:Landroid/view/animation/LinearInterpolator;

    .line 20
    .line 21
    invoke-virtual {v2, v0}, Landroid/view/animation/LinearInterpolator;->getInterpolation(F)F

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iget v2, p0, Lc4/f;->j:F

    .line 26
    .line 27
    iget v3, p0, Lc4/f;->k:F

    .line 28
    .line 29
    invoke-static {v3, v2, v0, v2}, Landroidx/appcompat/app/b;->f(FFFF)F

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    iget-object v3, p0, Lc4/f;->l:Landroid/graphics/PointF;

    .line 34
    .line 35
    iget v4, v3, Landroid/graphics/PointF;->x:F

    .line 36
    .line 37
    iget-object v5, p0, Lc4/f;->m:Landroid/graphics/PointF;

    .line 38
    .line 39
    iget v6, v5, Landroid/graphics/PointF;->x:F

    .line 40
    .line 41
    invoke-static {v6, v4, v0, v4}, Landroidx/appcompat/app/b;->f(FFFF)F

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    iget v3, v3, Landroid/graphics/PointF;->y:F

    .line 46
    .line 47
    iget v5, v5, Landroid/graphics/PointF;->y:F

    .line 48
    .line 49
    invoke-static {v5, v3, v0, v3}, Landroidx/appcompat/app/b;->f(FFFF)F

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    iget-object v5, p0, Lc4/f;->o:Lcom/ortiz/touchview/TouchImageView;

    .line 54
    .line 55
    iget-object v6, v5, Lcom/ortiz/touchview/TouchImageView;->C:Landroid/widget/ImageView$ScaleType;

    .line 56
    .line 57
    invoke-virtual {v5, v2, v4, v3, v6}, Lcom/ortiz/touchview/TouchImageView;->p(FFFLandroid/widget/ImageView$ScaleType;)V

    .line 58
    .line 59
    .line 60
    cmpg-float v0, v0, v1

    .line 61
    .line 62
    if-gez v0, :cond_0

    .line 63
    .line 64
    invoke-virtual {v5, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_0
    sget-object v0, Lc4/b;->h:Lc4/b;

    .line 69
    .line 70
    invoke-static {v5, v0}, Lcom/ortiz/touchview/TouchImageView;->e(Lcom/ortiz/touchview/TouchImageView;Lc4/b;)V

    .line 71
    .line 72
    .line 73
    return-void
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
