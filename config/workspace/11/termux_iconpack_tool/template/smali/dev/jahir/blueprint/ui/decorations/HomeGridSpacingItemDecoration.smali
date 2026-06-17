.class public Ldev/jahir/blueprint/ui/decorations/HomeGridSpacingItemDecoration;
.super Ldev/jahir/frames/ui/decorations/GridSpacingItemDecoration;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field private final spacing:I

.field private final spanCount:I


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, p2, v0}, Ldev/jahir/frames/ui/decorations/GridSpacingItemDecoration;-><init>(IIZ)V

    .line 3
    .line 4
    .line 5
    iput p1, p0, Ldev/jahir/blueprint/ui/decorations/HomeGridSpacingItemDecoration;->spanCount:I

    .line 6
    .line 7
    iput p2, p0, Ldev/jahir/blueprint/ui/decorations/HomeGridSpacingItemDecoration;->spacing:I

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


# virtual methods
.method public internalOffsetsSetup(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 7

    .line 1
    const-string v0, "outRect"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "view"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "parent"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/c1;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    instance-of v0, p3, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    check-cast p3, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move-object p3, v1

    .line 33
    :goto_0
    const/4 v0, 0x0

    .line 34
    const/4 v2, 0x1

    .line 35
    if-eqz p3, :cond_1

    .line 36
    .line 37
    invoke-virtual {p3}, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->getShowOverview()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-ne v3, v2, :cond_1

    .line 42
    .line 43
    const/4 v3, 0x1

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const/4 v3, 0x0

    .line 46
    :goto_1
    if-eqz p3, :cond_2

    .line 47
    .line 48
    invoke-virtual {p3, p2}, Lcom/afollestad/sectionedrecyclerview/d;->getRelativePosition(I)Lcom/afollestad/sectionedrecyclerview/a;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    :cond_2
    if-eqz v1, :cond_3

    .line 53
    .line 54
    iget p2, v1, Lcom/afollestad/sectionedrecyclerview/a;->b:I

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_3
    const/4 p2, -0x1

    .line 58
    :goto_2
    if-eqz v1, :cond_4

    .line 59
    .line 60
    iget v1, v1, Lcom/afollestad/sectionedrecyclerview/a;->a:I

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_4
    const/4 v1, 0x0

    .line 64
    :goto_3
    const/4 v4, 0x2

    .line 65
    if-ne v1, v4, :cond_9

    .line 66
    .line 67
    if-ltz p2, :cond_9

    .line 68
    .line 69
    if-eqz v3, :cond_9

    .line 70
    .line 71
    iget v1, p0, Ldev/jahir/blueprint/ui/decorations/HomeGridSpacingItemDecoration;->spanCount:I

    .line 72
    .line 73
    rem-int v3, p2, v1

    .line 74
    .line 75
    iget v5, p0, Ldev/jahir/blueprint/ui/decorations/HomeGridSpacingItemDecoration;->spacing:I

    .line 76
    .line 77
    mul-int v6, v3, v5

    .line 78
    .line 79
    div-int/2addr v6, v1

    .line 80
    sub-int v6, v5, v6

    .line 81
    .line 82
    iput v6, p1, Landroid/graphics/Rect;->left:I

    .line 83
    .line 84
    add-int/lit8 v6, v3, 0x1

    .line 85
    .line 86
    mul-int v6, v6, v5

    .line 87
    .line 88
    div-int/2addr v6, v1

    .line 89
    iput v6, p1, Landroid/graphics/Rect;->right:I

    .line 90
    .line 91
    if-ge p2, v1, :cond_5

    .line 92
    .line 93
    const/4 v1, 0x1

    .line 94
    goto :goto_4

    .line 95
    :cond_5
    const/4 v1, 0x0

    .line 96
    :goto_4
    if-eqz p3, :cond_6

    .line 97
    .line 98
    invoke-virtual {p3, v4}, Ldev/jahir/blueprint/ui/adapters/HomeAdapter;->getItemCount(I)I

    .line 99
    .line 100
    .line 101
    move-result p3

    .line 102
    goto :goto_5

    .line 103
    :cond_6
    const/4 p3, 0x0

    .line 104
    :goto_5
    iget v4, p0, Ldev/jahir/blueprint/ui/decorations/HomeGridSpacingItemDecoration;->spanCount:I

    .line 105
    .line 106
    div-int/2addr p3, v4

    .line 107
    add-int/lit8 v5, p2, 0x1

    .line 108
    .line 109
    div-int/2addr v5, v4

    .line 110
    sub-int/2addr v5, v3

    .line 111
    sub-int/2addr p3, v2

    .line 112
    if-lt v5, p3, :cond_7

    .line 113
    .line 114
    const/4 v0, 0x1

    .line 115
    :cond_7
    if-ge p2, v4, :cond_8

    .line 116
    .line 117
    if-nez v1, :cond_8

    .line 118
    .line 119
    iget p2, p0, Ldev/jahir/blueprint/ui/decorations/HomeGridSpacingItemDecoration;->spacing:I

    .line 120
    .line 121
    iput p2, p1, Landroid/graphics/Rect;->top:I

    .line 122
    .line 123
    :cond_8
    if-nez v0, :cond_9

    .line 124
    .line 125
    iget p2, p0, Ldev/jahir/blueprint/ui/decorations/HomeGridSpacingItemDecoration;->spacing:I

    .line 126
    .line 127
    iput p2, p1, Landroid/graphics/Rect;->bottom:I

    .line 128
    .line 129
    :cond_9
    return-void
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
