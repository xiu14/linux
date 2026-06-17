.class public final Landroidx/recyclerview/widget/b0;
.super Landroidx/recyclerview/widget/u1;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/recyclerview/widget/b0;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/recyclerview/widget/b0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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


# virtual methods
.method public final b(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 8

    .line 1
    iget p2, p0, Landroidx/recyclerview/widget/b0;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Landroidx/recyclerview/widget/b0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lcom/simplecityapps/recyclerview_fastscroll/views/FastScroller;

    .line 9
    .line 10
    iget-object p2, p1, Lcom/simplecityapps/recyclerview_fastscroll/views/FastScroller;->a:Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollRecyclerView;

    .line 11
    .line 12
    invoke-virtual {p2}, Landroid/view/View;->isInEditMode()Z

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    if-nez p2, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/simplecityapps/recyclerview_fastscroll/views/FastScroller;->d()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void

    .line 22
    :pswitch_0
    iget-object p2, p0, Landroidx/recyclerview/widget/b0;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p2, Landroidx/recyclerview/widget/e0;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->computeHorizontalScrollOffset()I

    .line 27
    .line 28
    .line 29
    move-result p3

    .line 30
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollOffset()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    iget v0, p2, Landroidx/recyclerview/widget/e0;->h:I

    .line 35
    .line 36
    iget-object v1, p2, Landroidx/recyclerview/widget/e0;->z:Landroidx/recyclerview/widget/RecyclerView;

    .line 37
    .line 38
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollRange()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    iget v2, p2, Landroidx/recyclerview/widget/e0;->y:I

    .line 43
    .line 44
    sub-int v3, v1, v2

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    const/4 v5, 0x1

    .line 48
    if-lez v3, :cond_1

    .line 49
    .line 50
    if-lt v2, v0, :cond_1

    .line 51
    .line 52
    const/4 v3, 0x1

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    const/4 v3, 0x0

    .line 55
    :goto_0
    iput-boolean v3, p2, Landroidx/recyclerview/widget/e0;->A:Z

    .line 56
    .line 57
    iget-object v3, p2, Landroidx/recyclerview/widget/e0;->z:Landroidx/recyclerview/widget/RecyclerView;

    .line 58
    .line 59
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->computeHorizontalScrollRange()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    iget v6, p2, Landroidx/recyclerview/widget/e0;->x:I

    .line 64
    .line 65
    sub-int v7, v3, v6

    .line 66
    .line 67
    if-lez v7, :cond_2

    .line 68
    .line 69
    if-lt v6, v0, :cond_2

    .line 70
    .line 71
    const/4 v0, 0x1

    .line 72
    goto :goto_1

    .line 73
    :cond_2
    const/4 v0, 0x0

    .line 74
    :goto_1
    iput-boolean v0, p2, Landroidx/recyclerview/widget/e0;->B:Z

    .line 75
    .line 76
    iget-boolean v7, p2, Landroidx/recyclerview/widget/e0;->A:Z

    .line 77
    .line 78
    if-nez v7, :cond_3

    .line 79
    .line 80
    if-nez v0, :cond_3

    .line 81
    .line 82
    iget p1, p2, Landroidx/recyclerview/widget/e0;->C:I

    .line 83
    .line 84
    if-eqz p1, :cond_7

    .line 85
    .line 86
    invoke-virtual {p2, v4}, Landroidx/recyclerview/widget/e0;->d(I)V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    const/high16 v0, 0x40000000    # 2.0f

    .line 91
    .line 92
    if-eqz v7, :cond_4

    .line 93
    .line 94
    int-to-float p1, p1

    .line 95
    int-to-float v4, v2

    .line 96
    div-float v7, v4, v0

    .line 97
    .line 98
    add-float/2addr v7, p1

    .line 99
    mul-float v7, v7, v4

    .line 100
    .line 101
    int-to-float p1, v1

    .line 102
    div-float/2addr v7, p1

    .line 103
    float-to-int p1, v7

    .line 104
    iput p1, p2, Landroidx/recyclerview/widget/e0;->s:I

    .line 105
    .line 106
    mul-int p1, v2, v2

    .line 107
    .line 108
    div-int/2addr p1, v1

    .line 109
    invoke-static {v2, p1}, Ljava/lang/Math;->min(II)I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    iput p1, p2, Landroidx/recyclerview/widget/e0;->r:I

    .line 114
    .line 115
    :cond_4
    iget-boolean p1, p2, Landroidx/recyclerview/widget/e0;->B:Z

    .line 116
    .line 117
    if-eqz p1, :cond_5

    .line 118
    .line 119
    int-to-float p1, p3

    .line 120
    int-to-float p3, v6

    .line 121
    div-float v0, p3, v0

    .line 122
    .line 123
    add-float/2addr v0, p1

    .line 124
    mul-float v0, v0, p3

    .line 125
    .line 126
    int-to-float p1, v3

    .line 127
    div-float/2addr v0, p1

    .line 128
    float-to-int p1, v0

    .line 129
    iput p1, p2, Landroidx/recyclerview/widget/e0;->v:I

    .line 130
    .line 131
    mul-int p1, v6, v6

    .line 132
    .line 133
    div-int/2addr p1, v3

    .line 134
    invoke-static {v6, p1}, Ljava/lang/Math;->min(II)I

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    iput p1, p2, Landroidx/recyclerview/widget/e0;->u:I

    .line 139
    .line 140
    :cond_5
    iget p1, p2, Landroidx/recyclerview/widget/e0;->C:I

    .line 141
    .line 142
    if-eqz p1, :cond_6

    .line 143
    .line 144
    if-ne p1, v5, :cond_7

    .line 145
    .line 146
    :cond_6
    invoke-virtual {p2, v5}, Landroidx/recyclerview/widget/e0;->d(I)V

    .line 147
    .line 148
    .line 149
    :cond_7
    :goto_2
    return-void

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 152
    .line 153
    .line 154
.end method
