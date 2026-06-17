.class public abstract Lcom/afollestad/sectionedrecyclerview/d;
.super Landroidx/recyclerview/widget/c1;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# static fields
.field private static final TAG:Ljava/lang/String; = "SectionedRVAdapter"

.field protected static final VIEW_TYPE_FOOTER:I = -0x3

.field protected static final VIEW_TYPE_HEADER:I = -0x2

.field protected static final VIEW_TYPE_ITEM:I = -0x1


# instance fields
.field private layoutManager:Landroidx/recyclerview/widget/GridLayoutManager;

.field private positionManager:Lcom/afollestad/sectionedrecyclerview/b;

.field private showFooters:Z

.field private showHeadersForEmptySections:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/c1;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/afollestad/sectionedrecyclerview/b;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/afollestad/sectionedrecyclerview/b;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/afollestad/sectionedrecyclerview/d;->positionManager:Lcom/afollestad/sectionedrecyclerview/b;

    .line 10
    .line 11
    return-void
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

.method public static synthetic access$000(Lcom/afollestad/sectionedrecyclerview/d;)Landroidx/recyclerview/widget/GridLayoutManager;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/afollestad/sectionedrecyclerview/d;->layoutManager:Landroidx/recyclerview/widget/GridLayoutManager;

    .line 2
    .line 3
    return-object p0
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


# virtual methods
.method public collapseAllSections()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/afollestad/sectionedrecyclerview/d;->positionManager:Lcom/afollestad/sectionedrecyclerview/b;

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/afollestad/sectionedrecyclerview/b;->e:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Lcom/afollestad/sectionedrecyclerview/b;->e(Lcom/afollestad/sectionedrecyclerview/d;)I

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lcom/afollestad/sectionedrecyclerview/d;->positionManager:Lcom/afollestad/sectionedrecyclerview/b;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    iget-object v2, v0, Lcom/afollestad/sectionedrecyclerview/b;->d:Lcom/afollestad/sectionedrecyclerview/d;

    .line 14
    .line 15
    invoke-virtual {v2}, Lcom/afollestad/sectionedrecyclerview/d;->getSectionCount()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-ge v1, v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lcom/afollestad/sectionedrecyclerview/b;->b(I)V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/c1;->notifyDataSetChanged()V

    .line 28
    .line 29
    .line 30
    return-void
    .line 31
    .line 32
    .line 33
.end method

.method public collapseSection(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/afollestad/sectionedrecyclerview/d;->positionManager:Lcom/afollestad/sectionedrecyclerview/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/afollestad/sectionedrecyclerview/b;->b(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/afollestad/sectionedrecyclerview/d;->getSectionHeaderIndex(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-ltz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/c1;->notifyItemChanged(I)V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Lcom/afollestad/sectionedrecyclerview/d;->showFooters()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {p0, p1, v1}, Lcom/afollestad/sectionedrecyclerview/d;->getAbsolutePosition(II)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-virtual {p0, p1}, Lcom/afollestad/sectionedrecyclerview/d;->getItemCount(I)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    add-int/2addr p1, v0

    .line 29
    invoke-virtual {p0, v1, p1}, Landroidx/recyclerview/widget/c1;->notifyItemRangeRemoved(II)V

    .line 30
    .line 31
    .line 32
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public expandAllSections()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/afollestad/sectionedrecyclerview/d;->positionManager:Lcom/afollestad/sectionedrecyclerview/b;

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/afollestad/sectionedrecyclerview/b;->e:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Lcom/afollestad/sectionedrecyclerview/b;->e(Lcom/afollestad/sectionedrecyclerview/d;)I

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lcom/afollestad/sectionedrecyclerview/d;->positionManager:Lcom/afollestad/sectionedrecyclerview/b;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    iget-object v2, v0, Lcom/afollestad/sectionedrecyclerview/b;->d:Lcom/afollestad/sectionedrecyclerview/d;

    .line 14
    .line 15
    invoke-virtual {v2}, Lcom/afollestad/sectionedrecyclerview/d;->getSectionCount()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-ge v1, v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lcom/afollestad/sectionedrecyclerview/b;->c(I)V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/c1;->notifyDataSetChanged()V

    .line 28
    .line 29
    .line 30
    return-void
    .line 31
    .line 32
    .line 33
.end method

.method public expandSection(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/afollestad/sectionedrecyclerview/d;->positionManager:Lcom/afollestad/sectionedrecyclerview/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/afollestad/sectionedrecyclerview/b;->c(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/afollestad/sectionedrecyclerview/d;->getSectionHeaderIndex(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-ltz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/c1;->notifyItemChanged(I)V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Lcom/afollestad/sectionedrecyclerview/d;->showFooters()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {p0, p1, v1}, Lcom/afollestad/sectionedrecyclerview/d;->getAbsolutePosition(II)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-virtual {p0, p1}, Lcom/afollestad/sectionedrecyclerview/d;->getItemCount(I)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    add-int/2addr p1, v0

    .line 29
    invoke-virtual {p0, v1, p1}, Landroidx/recyclerview/widget/c1;->notifyItemRangeInserted(II)V

    .line 30
    .line 31
    .line 32
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public getAbsolutePosition(II)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/afollestad/sectionedrecyclerview/d;->positionManager:Lcom/afollestad/sectionedrecyclerview/b;

    invoke-virtual {v0, p1, p2}, Lcom/afollestad/sectionedrecyclerview/b;->a(II)I

    move-result p1

    return p1
.end method

.method public getAbsolutePosition(Lcom/afollestad/sectionedrecyclerview/a;)I
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/afollestad/sectionedrecyclerview/d;->positionManager:Lcom/afollestad/sectionedrecyclerview/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    iget v1, p1, Lcom/afollestad/sectionedrecyclerview/a;->a:I

    .line 4
    iget p1, p1, Lcom/afollestad/sectionedrecyclerview/a;->b:I

    .line 5
    invoke-virtual {v0, v1, p1}, Lcom/afollestad/sectionedrecyclerview/b;->a(II)I

    move-result p1

    return p1
.end method

.method public getFooterId(I)J
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/c1;->getItemId(I)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p0, p1}, Lcom/afollestad/sectionedrecyclerview/d;->getItemCount(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    int-to-long v2, p1

    .line 10
    add-long/2addr v0, v2

    .line 11
    return-wide v0
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

.method public getFooterViewType(I)I
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "Range"
        }
    .end annotation

    .line 1
    const/4 p1, -0x3

    .line 2
    return p1
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public getHeaderId(I)J
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/c1;->getItemId(I)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
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

.method public getHeaderViewType(I)I
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "Range"
        }
    .end annotation

    .line 1
    const/4 p1, -0x2

    .line 2
    return p1
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/afollestad/sectionedrecyclerview/d;->positionManager:Lcom/afollestad/sectionedrecyclerview/b;

    invoke-virtual {v0, p0}, Lcom/afollestad/sectionedrecyclerview/b;->e(Lcom/afollestad/sectionedrecyclerview/d;)I

    move-result v0

    return v0
.end method

.method public abstract getItemCount(I)I
.end method

.method public getItemId(I)J
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/afollestad/sectionedrecyclerview/d;->isHeader(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/afollestad/sectionedrecyclerview/d;->positionManager:Lcom/afollestad/sectionedrecyclerview/b;

    invoke-virtual {v0, p1}, Lcom/afollestad/sectionedrecyclerview/b;->i(I)I

    move-result p1

    .line 3
    invoke-virtual {p0, p1}, Lcom/afollestad/sectionedrecyclerview/d;->getHeaderId(I)J

    move-result-wide v0

    return-wide v0

    .line 4
    :cond_0
    invoke-virtual {p0, p1}, Lcom/afollestad/sectionedrecyclerview/d;->isFooter(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/afollestad/sectionedrecyclerview/d;->positionManager:Lcom/afollestad/sectionedrecyclerview/b;

    invoke-virtual {v0, p1}, Lcom/afollestad/sectionedrecyclerview/b;->d(I)I

    move-result p1

    .line 6
    invoke-virtual {p0, p1}, Lcom/afollestad/sectionedrecyclerview/d;->getFooterId(I)J

    move-result-wide v0

    return-wide v0

    .line 7
    :cond_1
    invoke-virtual {p0, p1}, Lcom/afollestad/sectionedrecyclerview/d;->getRelativePosition(I)Lcom/afollestad/sectionedrecyclerview/a;

    move-result-object p1

    .line 8
    iget v0, p1, Lcom/afollestad/sectionedrecyclerview/a;->a:I

    .line 9
    iget p1, p1, Lcom/afollestad/sectionedrecyclerview/a;->b:I

    .line 10
    invoke-virtual {p0, v0, p1}, Lcom/afollestad/sectionedrecyclerview/d;->getItemId(II)J

    move-result-wide v0

    return-wide v0
.end method

.method public getItemId(II)J
    .locals 0

    .line 11
    invoke-super {p0, p2}, Landroidx/recyclerview/widget/c1;->getItemId(I)J

    move-result-wide p1

    return-wide p1
.end method

.method public final getItemViewType(I)I
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/afollestad/sectionedrecyclerview/d;->isHeader(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/afollestad/sectionedrecyclerview/d;->positionManager:Lcom/afollestad/sectionedrecyclerview/b;

    invoke-virtual {v0, p1}, Lcom/afollestad/sectionedrecyclerview/b;->i(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/afollestad/sectionedrecyclerview/d;->getHeaderViewType(I)I

    move-result p1

    return p1

    .line 3
    :cond_0
    invoke-virtual {p0, p1}, Lcom/afollestad/sectionedrecyclerview/d;->isFooter(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/afollestad/sectionedrecyclerview/d;->positionManager:Lcom/afollestad/sectionedrecyclerview/b;

    invoke-virtual {v0, p1}, Lcom/afollestad/sectionedrecyclerview/b;->d(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/afollestad/sectionedrecyclerview/d;->getFooterViewType(I)I

    move-result p1

    return p1

    .line 5
    :cond_1
    invoke-virtual {p0, p1}, Lcom/afollestad/sectionedrecyclerview/d;->getRelativePosition(I)Lcom/afollestad/sectionedrecyclerview/a;

    move-result-object v0

    .line 6
    iget v1, v0, Lcom/afollestad/sectionedrecyclerview/a;->a:I

    .line 7
    iget v0, v0, Lcom/afollestad/sectionedrecyclerview/a;->b:I

    add-int/lit8 v2, v1, 0x1

    sub-int/2addr p1, v2

    .line 8
    invoke-virtual {p0, v1, v0, p1}, Lcom/afollestad/sectionedrecyclerview/d;->getItemViewType(III)I

    move-result p1

    return p1
.end method

.method public abstract getItemViewType(III)I
.end method

.method public getRelativePosition(I)Lcom/afollestad/sectionedrecyclerview/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/afollestad/sectionedrecyclerview/d;->positionManager:Lcom/afollestad/sectionedrecyclerview/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/afollestad/sectionedrecyclerview/b;->g(I)Lcom/afollestad/sectionedrecyclerview/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method public getRowSpan(IIII)I
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
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

.method public abstract getSectionCount()I
.end method

.method public final getSectionFooterIndex(I)I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/afollestad/sectionedrecyclerview/d;->positionManager:Lcom/afollestad/sectionedrecyclerview/b;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/afollestad/sectionedrecyclerview/b;->b:Lq/f;

    .line 4
    .line 5
    invoke-virtual {v0}, Lq/f;->keySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lq/c;

    .line 10
    .line 11
    invoke-virtual {v1}, Lq/c;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :cond_0
    move-object v2, v1

    .line 16
    check-cast v2, Lq/b;

    .line 17
    .line 18
    invoke-virtual {v2}, Lq/b;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    invoke-virtual {v2}, Lq/b;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {v0, v2}, Lq/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-ne v3, p1, :cond_0

    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    return p1

    .line 47
    :cond_1
    const/4 p1, -0x1

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

.method public final getSectionHeaderIndex(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/afollestad/sectionedrecyclerview/d;->positionManager:Lcom/afollestad/sectionedrecyclerview/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/afollestad/sectionedrecyclerview/b;->h(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
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

.method public final isFooter(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/afollestad/sectionedrecyclerview/d;->positionManager:Lcom/afollestad/sectionedrecyclerview/b;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/afollestad/sectionedrecyclerview/b;->b:Lq/f;

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {v0, p1}, Lq/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return p1
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

.method public final isHeader(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/afollestad/sectionedrecyclerview/d;->positionManager:Lcom/afollestad/sectionedrecyclerview/b;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/afollestad/sectionedrecyclerview/b;->a:Lq/f;

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {v0, p1}, Lq/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return p1
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

.method public final isSectionExpanded(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/afollestad/sectionedrecyclerview/d;->positionManager:Lcom/afollestad/sectionedrecyclerview/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/afollestad/sectionedrecyclerview/b;->f(I)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
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

.method public notifySectionChanged(I)V
    .locals 5

    .line 1
    if-ltz p1, :cond_2

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/afollestad/sectionedrecyclerview/d;->getSectionCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    if-gt p1, v0, :cond_2

    .line 10
    .line 11
    iget-object v0, p0, Lcom/afollestad/sectionedrecyclerview/d;->positionManager:Lcom/afollestad/sectionedrecyclerview/b;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lcom/afollestad/sectionedrecyclerview/b;->h(I)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const/4 v2, -0x1

    .line 22
    if-eq v0, v2, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lcom/afollestad/sectionedrecyclerview/d;->getItemCount(I)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    const-string v3, "SectionedRVAdapter"

    .line 29
    .line 30
    if-nez v2, :cond_0

    .line 31
    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v1, "There are no items in section "

    .line 35
    .line 36
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string p1, " to notify."

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-static {v3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v4, "Invalidating "

    .line 58
    .line 59
    invoke-direct {p1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v4, " items starting at index "

    .line 66
    .line 67
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-static {v3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    add-int/lit8 v2, v2, 0x1

    .line 81
    .line 82
    invoke-virtual {p0, v0, v2}, Landroidx/recyclerview/widget/c1;->notifyItemRangeChanged(II)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 87
    .line 88
    const-string v1, "No header position mapped for section "

    .line 89
    .line 90
    invoke-static {p1, v1}, Landroidx/appcompat/app/b;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw v0

    .line 98
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 99
    .line 100
    const-string v1, "Section "

    .line 101
    .line 102
    const-string v2, " is out of range of existing sections."

    .line 103
    .line 104
    invoke-static {p1, v1, v2}, Landroidx/appcompat/app/b;->k(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw v0
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

.method public abstract onBindFooterViewHolder(Lcom/afollestad/sectionedrecyclerview/f;I)V
.end method

.method public abstract onBindHeaderViewHolder(Lcom/afollestad/sectionedrecyclerview/f;IZ)V
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/i2;I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    check-cast p1, Lcom/afollestad/sectionedrecyclerview/f;

    invoke-virtual {p0, p1, p2}, Lcom/afollestad/sectionedrecyclerview/d;->onBindViewHolder(Lcom/afollestad/sectionedrecyclerview/f;I)V

    return-void
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/i2;ILjava/util/List;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    check-cast p1, Lcom/afollestad/sectionedrecyclerview/f;

    invoke-virtual {p0, p1, p2, p3}, Lcom/afollestad/sectionedrecyclerview/d;->onBindViewHolder(Lcom/afollestad/sectionedrecyclerview/f;ILjava/util/List;)V

    return-void
.end method

.method public final onBindViewHolder(Lcom/afollestad/sectionedrecyclerview/f;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/afollestad/sectionedrecyclerview/f;",
            "I)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 3
    iget-object v0, p0, Lcom/afollestad/sectionedrecyclerview/d;->positionManager:Lcom/afollestad/sectionedrecyclerview/b;

    invoke-virtual {p1, v0}, Lcom/afollestad/sectionedrecyclerview/f;->setPositionDelegate(Lcom/afollestad/sectionedrecyclerview/e;)V

    .line 4
    iget-object v0, p1, Landroidx/recyclerview/widget/i2;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v0, v0, Landroidx/recyclerview/widget/j0;

    if-eqz v0, :cond_0

    .line 5
    new-instance v0, Landroidx/recyclerview/widget/o2;

    const/4 v1, -0x1

    const/4 v2, -0x2

    .line 6
    invoke-direct {v0, v1, v2}, Landroidx/recyclerview/widget/q1;-><init>(II)V

    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p1, Landroidx/recyclerview/widget/i2;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v0, v0, Landroidx/recyclerview/widget/o2;

    if-eqz v0, :cond_1

    .line 8
    iget-object v0, p1, Landroidx/recyclerview/widget/i2;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/o2;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 9
    :goto_0
    invoke-virtual {p0, p2}, Lcom/afollestad/sectionedrecyclerview/d;->isHeader(I)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    if-eqz v0, :cond_2

    .line 10
    iput-boolean v2, v0, Landroidx/recyclerview/widget/o2;->f:Z

    .line 11
    :cond_2
    iget-object v1, p0, Lcom/afollestad/sectionedrecyclerview/d;->positionManager:Lcom/afollestad/sectionedrecyclerview/b;

    invoke-virtual {v1, p2}, Lcom/afollestad/sectionedrecyclerview/b;->i(I)I

    move-result p2

    .line 12
    invoke-virtual {p0, p2}, Lcom/afollestad/sectionedrecyclerview/d;->isSectionExpanded(I)Z

    move-result v1

    invoke-virtual {p0, p1, p2, v1}, Lcom/afollestad/sectionedrecyclerview/d;->onBindHeaderViewHolder(Lcom/afollestad/sectionedrecyclerview/f;IZ)V

    goto :goto_1

    .line 13
    :cond_3
    invoke-virtual {p0, p2}, Lcom/afollestad/sectionedrecyclerview/d;->isFooter(I)Z

    move-result v1

    if-eqz v1, :cond_5

    if-eqz v0, :cond_4

    .line 14
    iput-boolean v2, v0, Landroidx/recyclerview/widget/o2;->f:Z

    .line 15
    :cond_4
    iget-object v1, p0, Lcom/afollestad/sectionedrecyclerview/d;->positionManager:Lcom/afollestad/sectionedrecyclerview/b;

    invoke-virtual {v1, p2}, Lcom/afollestad/sectionedrecyclerview/b;->d(I)I

    move-result p2

    .line 16
    invoke-virtual {p0, p1, p2}, Lcom/afollestad/sectionedrecyclerview/d;->onBindFooterViewHolder(Lcom/afollestad/sectionedrecyclerview/f;I)V

    goto :goto_1

    :cond_5
    if-eqz v0, :cond_6

    const/4 v1, 0x0

    .line 17
    iput-boolean v1, v0, Landroidx/recyclerview/widget/o2;->f:Z

    .line 18
    :cond_6
    invoke-virtual {p0, p2}, Lcom/afollestad/sectionedrecyclerview/d;->getRelativePosition(I)Lcom/afollestad/sectionedrecyclerview/a;

    move-result-object p2

    .line 19
    invoke-virtual {p0, p2}, Lcom/afollestad/sectionedrecyclerview/d;->getAbsolutePosition(Lcom/afollestad/sectionedrecyclerview/a;)I

    move-result v1

    .line 20
    iget v2, p2, Lcom/afollestad/sectionedrecyclerview/a;->a:I

    .line 21
    iget p2, p2, Lcom/afollestad/sectionedrecyclerview/a;->b:I

    .line 22
    invoke-virtual {p0, p1, v2, p2, v1}, Lcom/afollestad/sectionedrecyclerview/d;->onBindViewHolder(Lcom/afollestad/sectionedrecyclerview/f;III)V

    :goto_1
    if-eqz v0, :cond_7

    .line 23
    iget-object p1, p1, Landroidx/recyclerview/widget/i2;->itemView:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_7
    return-void
.end method

.method public abstract onBindViewHolder(Lcom/afollestad/sectionedrecyclerview/f;III)V
.end method

.method public final onBindViewHolder(Lcom/afollestad/sectionedrecyclerview/f;ILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/afollestad/sectionedrecyclerview/f;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 24
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/c1;->onBindViewHolder(Landroidx/recyclerview/widget/i2;ILjava/util/List;)V

    return-void
.end method

.method public final setLayoutManager(Landroidx/recyclerview/widget/GridLayoutManager;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/afollestad/sectionedrecyclerview/d;->layoutManager:Landroidx/recyclerview/widget/GridLayoutManager;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Lcom/afollestad/sectionedrecyclerview/c;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/afollestad/sectionedrecyclerview/c;-><init>(Lcom/afollestad/sectionedrecyclerview/d;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->setSpanSizeLookup(Landroidx/recyclerview/widget/k0;)V

    .line 12
    .line 13
    .line 14
    return-void
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

.method public final shouldShowFooters(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/afollestad/sectionedrecyclerview/d;->showFooters:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/c1;->notifyDataSetChanged()V

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

.method public final shouldShowHeadersForEmptySections(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/afollestad/sectionedrecyclerview/d;->showHeadersForEmptySections:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/c1;->notifyDataSetChanged()V

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

.method public showFooters()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/afollestad/sectionedrecyclerview/d;->showFooters:Z

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

.method public final showHeadersForEmptySections()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/afollestad/sectionedrecyclerview/d;->showHeadersForEmptySections:Z

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

.method public toggleSectionExpanded(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/afollestad/sectionedrecyclerview/d;->positionManager:Lcom/afollestad/sectionedrecyclerview/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/afollestad/sectionedrecyclerview/b;->f(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/afollestad/sectionedrecyclerview/d;->collapseSection(I)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {p0, p1}, Lcom/afollestad/sectionedrecyclerview/d;->expandSection(I)V

    .line 14
    .line 15
    .line 16
    return-void
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
