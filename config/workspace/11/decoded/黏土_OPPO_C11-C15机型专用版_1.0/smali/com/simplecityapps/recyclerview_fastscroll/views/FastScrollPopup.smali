.class public Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollPopup;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public a:Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollRecyclerView;

.field public b:Landroid/content/res/Resources;

.field public c:I

.field public d:I

.field public e:Landroid/graphics/Path;

.field public f:Landroid/graphics/RectF;

.field public g:Landroid/graphics/Paint;

.field public h:I

.field public i:Landroid/graphics/Rect;

.field public j:Landroid/graphics/Rect;

.field public k:Landroid/graphics/Rect;

.field public l:Ljava/lang/String;

.field public m:Landroid/graphics/Paint;

.field public n:Landroid/graphics/Rect;

.field public o:F

.field public p:Landroid/animation/ObjectAnimator;

.field public q:Z

.field public r:I

.field public s:I


# virtual methods
.method public final a(Z)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollPopup;->q:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_3

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollPopup;->q:Z

    .line 6
    .line 7
    iget-object v0, p0, Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollPopup;->p:Landroid/animation/ObjectAnimator;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 12
    .line 13
    .line 14
    :cond_0
    if-eqz p1, :cond_1

    .line 15
    .line 16
    const/high16 v0, 0x3f800000    # 1.0f

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    :goto_0
    const/4 v1, 0x1

    .line 21
    new-array v1, v1, [F

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    aput v0, v1, v2

    .line 25
    .line 26
    const-string v0, "alpha"

    .line 27
    .line 28
    invoke-static {p0, v0, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollPopup;->p:Landroid/animation/ObjectAnimator;

    .line 33
    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    const-wide/16 v1, 0xc8

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    const-wide/16 v1, 0x96

    .line 40
    .line 41
    :goto_1
    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollPopup;->p:Landroid/animation/ObjectAnimator;

    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    .line 47
    .line 48
    .line 49
    :cond_3
    return-void
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

.method public getAlpha()F
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 1
    iget v0, p0, Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollPopup;->o:F

    .line 2
    .line 3
    return v0
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

.method public setAlpha(F)V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 1
    iput p1, p0, Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollPopup;->o:F

    .line 2
    .line 3
    iget-object p1, p0, Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollPopup;->a:Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollRecyclerView;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollPopup;->k:Landroid/graphics/Rect;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    .line 8
    .line 9
    .line 10
    return-void
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
