.class public final Ldev/jahir/frames/extensions/views/FastScrollRecyclerViewKt;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# direct methods
.method public static final attachSwipeRefreshLayout(Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollRecyclerView;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance v0, Ldev/jahir/frames/extensions/views/FastScrollRecyclerViewKt$attachSwipeRefreshLayout$1;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Ldev/jahir/frames/extensions/views/FastScrollRecyclerViewKt$attachSwipeRefreshLayout$1;-><init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollRecyclerView;->setOnFastScrollStateChangeListener(Lf4/a;)V

    .line 15
    .line 16
    .line 17
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

.method public static final tint(Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollRecyclerView;)V
    .locals 8

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "getContext(...)"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sget v2, Lcom/google/android/material/R$attr;->colorOnSurface:I

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-static {v3, v1}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    sget v4, Ldev/jahir/frames/R$color;->onSurface:I

    .line 25
    .line 26
    const/4 v5, 0x0

    .line 27
    const/4 v6, 0x2

    .line 28
    const/4 v7, 0x0

    .line 29
    invoke-static {v3, v4, v5, v6, v7}, Ldev/jahir/frames/extensions/context/ContextKt;->color$default(Landroid/content/Context;IIILjava/lang/Object;)I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    invoke-static {v0, v2, v3}, Ldev/jahir/frames/extensions/context/ContextKt;->resolveColor(Landroid/content/Context;II)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {v2, v1}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    sget v3, Lcom/google/android/material/R$attr;->colorAccent:I

    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-static {v4, v1}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    sget v1, Ldev/jahir/frames/R$color;->accent:I

    .line 54
    .line 55
    invoke-static {v4, v1, v5, v6, v7}, Ldev/jahir/frames/extensions/context/ContextKt;->color$default(Landroid/content/Context;IIILjava/lang/Object;)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    invoke-static {v2, v3, v1}, Ldev/jahir/frames/extensions/context/ContextKt;->resolveColor(Landroid/content/Context;II)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    invoke-virtual {p0, v1}, Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollRecyclerView;->setThumbColor(I)V

    .line 64
    .line 65
    .line 66
    const/high16 v1, 0x3f000000    # 0.5f

    .line 67
    .line 68
    invoke-static {v0, v1}, Ldev/jahir/frames/extensions/resources/ColorKt;->withAlpha(IF)I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    invoke-virtual {p0, v1}, Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollRecyclerView;->setThumbInactiveColor(I)V

    .line 73
    .line 74
    .line 75
    const v1, 0x3e99999a    # 0.3f

    .line 76
    .line 77
    .line 78
    invoke-static {v0, v1}, Ldev/jahir/frames/extensions/resources/ColorKt;->withAlpha(IF)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    invoke-virtual {p0, v0}, Lcom/simplecityapps/recyclerview_fastscroll/views/FastScrollRecyclerView;->setTrackColor(I)V

    .line 83
    .line 84
    .line 85
    return-void
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
