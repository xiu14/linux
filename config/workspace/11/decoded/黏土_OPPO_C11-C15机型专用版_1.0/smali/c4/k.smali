.class public final Lc4/k;
.super Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final synthetic a:Lcom/ortiz/touchview/TouchImageView;


# direct methods
.method public constructor <init>(Lcom/ortiz/touchview/TouchImageView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc4/k;->a:Lcom/ortiz/touchview/TouchImageView;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;-><init>()V

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


# virtual methods
.method public final onScale(Landroid/view/ScaleGestureDetector;)Z
    .locals 7

    .line 1
    const-string v0, "detector"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getScaleFactor()F

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    float-to-double v2, v0

    .line 11
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusX()F

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusY()F

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    iget-object p1, p0, Lc4/k;->a:Lcom/ortiz/touchview/TouchImageView;

    .line 20
    .line 21
    iget-boolean v6, p1, Lcom/ortiz/touchview/TouchImageView;->l:Z

    .line 22
    .line 23
    iget-object v1, p0, Lc4/k;->a:Lcom/ortiz/touchview/TouchImageView;

    .line 24
    .line 25
    invoke-virtual/range {v1 .. v6}, Lcom/ortiz/touchview/TouchImageView;->o(DFFZ)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    return p1
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final onScaleBegin(Landroid/view/ScaleGestureDetector;)Z
    .locals 1

    .line 1
    const-string v0, "detector"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lc4/k;->a:Lcom/ortiz/touchview/TouchImageView;

    .line 7
    .line 8
    sget-object v0, Lc4/b;->j:Lc4/b;

    .line 9
    .line 10
    invoke-static {p1, v0}, Lcom/ortiz/touchview/TouchImageView;->e(Lcom/ortiz/touchview/TouchImageView;Lc4/b;)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1
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

.method public final onScaleEnd(Landroid/view/ScaleGestureDetector;)V
    .locals 6

    .line 1
    const-string v0, "detector"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;->onScaleEnd(Landroid/view/ScaleGestureDetector;)V

    .line 7
    .line 8
    .line 9
    sget-object p1, Lc4/b;->h:Lc4/b;

    .line 10
    .line 11
    iget-object v1, p0, Lc4/k;->a:Lcom/ortiz/touchview/TouchImageView;

    .line 12
    .line 13
    invoke-static {v1, p1}, Lcom/ortiz/touchview/TouchImageView;->e(Lcom/ortiz/touchview/TouchImageView;Lc4/b;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Lcom/ortiz/touchview/TouchImageView;->getCurrentZoom()F

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-virtual {v1}, Lcom/ortiz/touchview/TouchImageView;->getCurrentZoom()F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget v2, v1, Lcom/ortiz/touchview/TouchImageView;->v:F

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    cmpl-float v0, v0, v2

    .line 28
    .line 29
    if-lez v0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v1}, Lcom/ortiz/touchview/TouchImageView;->getCurrentZoom()F

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget v2, v1, Lcom/ortiz/touchview/TouchImageView;->s:F

    .line 37
    .line 38
    cmpg-float v0, v0, v2

    .line 39
    .line 40
    if-gez v0, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/4 v3, 0x0

    .line 44
    move v2, p1

    .line 45
    :goto_0
    if-eqz v3, :cond_2

    .line 46
    .line 47
    new-instance v0, Lc4/g;

    .line 48
    .line 49
    iget p1, v1, Lcom/ortiz/touchview/TouchImageView;->G:I

    .line 50
    .line 51
    div-int/lit8 p1, p1, 0x2

    .line 52
    .line 53
    int-to-float v3, p1

    .line 54
    iget p1, v1, Lcom/ortiz/touchview/TouchImageView;->H:I

    .line 55
    .line 56
    div-int/lit8 p1, p1, 0x2

    .line 57
    .line 58
    int-to-float v4, p1

    .line 59
    iget-boolean v5, v1, Lcom/ortiz/touchview/TouchImageView;->l:Z

    .line 60
    .line 61
    invoke-direct/range {v0 .. v5}, Lc4/g;-><init>(Lcom/ortiz/touchview/TouchImageView;FFFZ)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    return-void
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
