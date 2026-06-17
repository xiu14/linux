.class public final Lc4/h;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final h:La1/q;

.field public i:I

.field public j:I

.field public final synthetic k:Lcom/ortiz/touchview/TouchImageView;


# direct methods
.method public constructor <init>(Lcom/ortiz/touchview/TouchImageView;II)V
    .locals 13

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc4/h;->k:Lcom/ortiz/touchview/TouchImageView;

    .line 5
    .line 6
    sget-object v0, Lc4/b;->k:Lc4/b;

    .line 7
    .line 8
    invoke-static {p1, v0}, Lcom/ortiz/touchview/TouchImageView;->e(Lcom/ortiz/touchview/TouchImageView;Lc4/b;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, La1/q;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/16 v2, 0x9

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-direct {v0, v3, v2}, La1/q;-><init>(CI)V

    .line 21
    .line 22
    .line 23
    new-instance v4, Landroid/widget/OverScroller;

    .line 24
    .line 25
    invoke-direct {v4, v1}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;)V

    .line 26
    .line 27
    .line 28
    iput-object v4, v0, La1/q;->i:Ljava/lang/Object;

    .line 29
    .line 30
    iput-object v0, p0, Lc4/h;->h:La1/q;

    .line 31
    .line 32
    iget-object v0, p1, Lcom/ortiz/touchview/TouchImageView;->i:Landroid/graphics/Matrix;

    .line 33
    .line 34
    iget-object v1, p1, Lcom/ortiz/touchview/TouchImageView;->y:[F

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p1, Lcom/ortiz/touchview/TouchImageView;->y:[F

    .line 40
    .line 41
    const/4 v1, 0x2

    .line 42
    aget v1, v0, v1

    .line 43
    .line 44
    float-to-int v1, v1

    .line 45
    const/4 v2, 0x5

    .line 46
    aget v0, v0, v2

    .line 47
    .line 48
    float-to-int v6, v0

    .line 49
    iget-boolean v0, p1, Lcom/ortiz/touchview/TouchImageView;->m:Z

    .line 50
    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {p1, v0}, Lcom/ortiz/touchview/TouchImageView;->m(Landroid/graphics/drawable/Drawable;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_0

    .line 62
    .line 63
    invoke-static {p1}, Lcom/ortiz/touchview/TouchImageView;->d(Lcom/ortiz/touchview/TouchImageView;)F

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    float-to-int v0, v0

    .line 68
    sub-int/2addr v1, v0

    .line 69
    :cond_0
    move v5, v1

    .line 70
    invoke-static {p1}, Lcom/ortiz/touchview/TouchImageView;->d(Lcom/ortiz/touchview/TouchImageView;)F

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iget v1, p1, Lcom/ortiz/touchview/TouchImageView;->G:I

    .line 75
    .line 76
    int-to-float v2, v1

    .line 77
    const/4 v3, 0x0

    .line 78
    cmpl-float v0, v0, v2

    .line 79
    .line 80
    if-lez v0, :cond_1

    .line 81
    .line 82
    invoke-static {p1}, Lcom/ortiz/touchview/TouchImageView;->d(Lcom/ortiz/touchview/TouchImageView;)F

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    float-to-int v0, v0

    .line 87
    sub-int/2addr v1, v0

    .line 88
    move v9, v1

    .line 89
    const/4 v10, 0x0

    .line 90
    goto :goto_0

    .line 91
    :cond_1
    move v9, v5

    .line 92
    move v10, v9

    .line 93
    :goto_0
    invoke-static {p1}, Lcom/ortiz/touchview/TouchImageView;->b(Lcom/ortiz/touchview/TouchImageView;)F

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    iget v1, p1, Lcom/ortiz/touchview/TouchImageView;->H:I

    .line 98
    .line 99
    int-to-float v2, v1

    .line 100
    cmpl-float v0, v0, v2

    .line 101
    .line 102
    if-lez v0, :cond_2

    .line 103
    .line 104
    invoke-static {p1}, Lcom/ortiz/touchview/TouchImageView;->b(Lcom/ortiz/touchview/TouchImageView;)F

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    float-to-int p1, p1

    .line 109
    sub-int/2addr v1, p1

    .line 110
    move v11, v1

    .line 111
    const/4 v12, 0x0

    .line 112
    :goto_1
    move v7, p2

    .line 113
    move/from16 v8, p3

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_2
    move v11, v6

    .line 117
    move v12, v11

    .line 118
    goto :goto_1

    .line 119
    :goto_2
    invoke-virtual/range {v4 .. v12}, Landroid/widget/OverScroller;->fling(IIIIIIII)V

    .line 120
    .line 121
    .line 122
    iput v5, p0, Lc4/h;->i:I

    .line 123
    .line 124
    iput v6, p0, Lc4/h;->j:I

    .line 125
    .line 126
    return-void
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
.method public final run()V
    .locals 5

    .line 1
    sget v0, Lcom/ortiz/touchview/TouchImageView;->S:I

    .line 2
    .line 3
    iget-object v0, p0, Lc4/h;->k:Lcom/ortiz/touchview/TouchImageView;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lc4/h;->h:La1/q;

    .line 9
    .line 10
    iget-object v2, v1, La1/q;->i:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Landroid/widget/OverScroller;

    .line 13
    .line 14
    invoke-virtual {v2}, Landroid/widget/OverScroller;->isFinished()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v2, v1, La1/q;->i:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Landroid/widget/OverScroller;

    .line 24
    .line 25
    invoke-virtual {v2}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    iget-object v2, v1, La1/q;->i:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, Landroid/widget/OverScroller;

    .line 37
    .line 38
    invoke-virtual {v2}, Landroid/widget/OverScroller;->getCurrX()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    iget-object v1, v1, La1/q;->i:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Landroid/widget/OverScroller;

    .line 45
    .line 46
    invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrY()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    iget v3, p0, Lc4/h;->i:I

    .line 51
    .line 52
    sub-int v3, v2, v3

    .line 53
    .line 54
    iget v4, p0, Lc4/h;->j:I

    .line 55
    .line 56
    sub-int v4, v1, v4

    .line 57
    .line 58
    iput v2, p0, Lc4/h;->i:I

    .line 59
    .line 60
    iput v1, p0, Lc4/h;->j:I

    .line 61
    .line 62
    iget-object v1, v0, Lcom/ortiz/touchview/TouchImageView;->i:Landroid/graphics/Matrix;

    .line 63
    .line 64
    int-to-float v2, v3

    .line 65
    int-to-float v3, v4

    .line 66
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/ortiz/touchview/TouchImageView;->h()V

    .line 70
    .line 71
    .line 72
    iget-object v1, v0, Lcom/ortiz/touchview/TouchImageView;->i:Landroid/graphics/Matrix;

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 78
    .line 79
    .line 80
    :cond_1
    :goto_0
    return-void
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
