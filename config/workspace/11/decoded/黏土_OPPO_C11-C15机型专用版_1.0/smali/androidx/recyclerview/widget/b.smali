.class public final Landroidx/recyclerview/widget/b;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final a:Ll0/c;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public final d:Landroidx/recyclerview/widget/a1;

.field public final e:Landroidx/recyclerview/widget/c;

.field public f:I


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/a1;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ll0/c;

    .line 5
    .line 6
    const/16 v1, 0x1e

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ll0/c;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Landroidx/recyclerview/widget/b;->a:Ll0/c;

    .line 12
    .line 13
    new-instance v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Landroidx/recyclerview/widget/b;->b:Ljava/util/ArrayList;

    .line 19
    .line 20
    new-instance v0, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Landroidx/recyclerview/widget/b;->c:Ljava/util/ArrayList;

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    iput v0, p0, Landroidx/recyclerview/widget/b;->f:I

    .line 29
    .line 30
    iput-object p1, p0, Landroidx/recyclerview/widget/b;->d:Landroidx/recyclerview/widget/a1;

    .line 31
    .line 32
    new-instance p1, Landroidx/recyclerview/widget/c;

    .line 33
    .line 34
    invoke-direct {p1, p0}, Landroidx/recyclerview/widget/c;-><init>(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Landroidx/recyclerview/widget/b;->e:Landroidx/recyclerview/widget/c;

    .line 38
    .line 39
    return-void
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
.end method


# virtual methods
.method public final a(I)Z
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/b;->c:Ljava/util/ArrayList;

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
    const/4 v3, 0x0

    .line 9
    :goto_0
    if-ge v3, v1, :cond_3

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, Landroidx/recyclerview/widget/a;

    .line 16
    .line 17
    iget v5, v4, Landroidx/recyclerview/widget/a;->a:I

    .line 18
    .line 19
    const/16 v6, 0x8

    .line 20
    .line 21
    const/4 v7, 0x1

    .line 22
    if-ne v5, v6, :cond_0

    .line 23
    .line 24
    iget v4, v4, Landroidx/recyclerview/widget/a;->d:I

    .line 25
    .line 26
    add-int/lit8 v5, v3, 0x1

    .line 27
    .line 28
    invoke-virtual {p0, v4, v5}, Landroidx/recyclerview/widget/b;->f(II)I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-ne v4, p1, :cond_2

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_0
    if-ne v5, v7, :cond_2

    .line 36
    .line 37
    iget v5, v4, Landroidx/recyclerview/widget/a;->b:I

    .line 38
    .line 39
    iget v4, v4, Landroidx/recyclerview/widget/a;->d:I

    .line 40
    .line 41
    add-int/2addr v4, v5

    .line 42
    :goto_1
    if-ge v5, v4, :cond_2

    .line 43
    .line 44
    add-int/lit8 v6, v3, 0x1

    .line 45
    .line 46
    invoke-virtual {p0, v5, v6}, Landroidx/recyclerview/widget/b;->f(II)I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    if-ne v6, p1, :cond_1

    .line 51
    .line 52
    :goto_2
    return v7

    .line 53
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    return v2
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

.method public final b()V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/b;->c:Ljava/util/ArrayList;

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
    const/4 v3, 0x0

    .line 9
    :goto_0
    if-ge v3, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, Landroidx/recyclerview/widget/a;

    .line 16
    .line 17
    iget-object v5, p0, Landroidx/recyclerview/widget/b;->d:Landroidx/recyclerview/widget/a1;

    .line 18
    .line 19
    invoke-virtual {v5, v4}, Landroidx/recyclerview/widget/a1;->a(Landroidx/recyclerview/widget/a;)V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v3, v3, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/b;->k(Ljava/util/ArrayList;)V

    .line 26
    .line 27
    .line 28
    iput v2, p0, Landroidx/recyclerview/widget/b;->f:I

    .line 29
    .line 30
    return-void
    .line 31
    .line 32
    .line 33
.end method

.method public final c()V
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/recyclerview/widget/b;->b:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    :goto_0
    if-ge v3, v1, :cond_4

    .line 13
    .line 14
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    check-cast v4, Landroidx/recyclerview/widget/a;

    .line 19
    .line 20
    iget v5, v4, Landroidx/recyclerview/widget/a;->a:I

    .line 21
    .line 22
    const/4 v6, 0x1

    .line 23
    iget-object v7, p0, Landroidx/recyclerview/widget/b;->d:Landroidx/recyclerview/widget/a1;

    .line 24
    .line 25
    if-eq v5, v6, :cond_3

    .line 26
    .line 27
    const/4 v8, 0x2

    .line 28
    if-eq v5, v8, :cond_2

    .line 29
    .line 30
    const/4 v8, 0x4

    .line 31
    if-eq v5, v8, :cond_1

    .line 32
    .line 33
    const/16 v8, 0x8

    .line 34
    .line 35
    if-eq v5, v8, :cond_0

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    invoke-virtual {v7, v4}, Landroidx/recyclerview/widget/a1;->a(Landroidx/recyclerview/widget/a;)V

    .line 39
    .line 40
    .line 41
    iget v5, v4, Landroidx/recyclerview/widget/a;->b:I

    .line 42
    .line 43
    iget v4, v4, Landroidx/recyclerview/widget/a;->d:I

    .line 44
    .line 45
    iget-object v7, v7, Landroidx/recyclerview/widget/a1;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 46
    .line 47
    invoke-virtual {v7, v5, v4}, Landroidx/recyclerview/widget/RecyclerView;->offsetPositionRecordsForMove(II)V

    .line 48
    .line 49
    .line 50
    iput-boolean v6, v7, Landroidx/recyclerview/widget/RecyclerView;->mItemsAddedOrRemoved:Z

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    invoke-virtual {v7, v4}, Landroidx/recyclerview/widget/a1;->a(Landroidx/recyclerview/widget/a;)V

    .line 54
    .line 55
    .line 56
    iget v5, v4, Landroidx/recyclerview/widget/a;->b:I

    .line 57
    .line 58
    iget v8, v4, Landroidx/recyclerview/widget/a;->d:I

    .line 59
    .line 60
    iget-object v4, v4, Landroidx/recyclerview/widget/a;->c:Ljava/lang/Object;

    .line 61
    .line 62
    iget-object v7, v7, Landroidx/recyclerview/widget/a1;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 63
    .line 64
    invoke-virtual {v7, v5, v8, v4}, Landroidx/recyclerview/widget/RecyclerView;->viewRangeUpdate(IILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iput-boolean v6, v7, Landroidx/recyclerview/widget/RecyclerView;->mItemsChanged:Z

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    invoke-virtual {v7, v4}, Landroidx/recyclerview/widget/a1;->a(Landroidx/recyclerview/widget/a;)V

    .line 71
    .line 72
    .line 73
    iget v5, v4, Landroidx/recyclerview/widget/a;->b:I

    .line 74
    .line 75
    iget v4, v4, Landroidx/recyclerview/widget/a;->d:I

    .line 76
    .line 77
    iget-object v7, v7, Landroidx/recyclerview/widget/a1;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 78
    .line 79
    invoke-virtual {v7, v5, v4, v6}, Landroidx/recyclerview/widget/RecyclerView;->offsetPositionRecordsForRemove(IIZ)V

    .line 80
    .line 81
    .line 82
    iput-boolean v6, v7, Landroidx/recyclerview/widget/RecyclerView;->mItemsAddedOrRemoved:Z

    .line 83
    .line 84
    iget-object v5, v7, Landroidx/recyclerview/widget/RecyclerView;->mState:Landroidx/recyclerview/widget/e2;

    .line 85
    .line 86
    iget v6, v5, Landroidx/recyclerview/widget/e2;->c:I

    .line 87
    .line 88
    add-int/2addr v6, v4

    .line 89
    iput v6, v5, Landroidx/recyclerview/widget/e2;->c:I

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_3
    invoke-virtual {v7, v4}, Landroidx/recyclerview/widget/a1;->a(Landroidx/recyclerview/widget/a;)V

    .line 93
    .line 94
    .line 95
    iget v5, v4, Landroidx/recyclerview/widget/a;->b:I

    .line 96
    .line 97
    iget v4, v4, Landroidx/recyclerview/widget/a;->d:I

    .line 98
    .line 99
    iget-object v7, v7, Landroidx/recyclerview/widget/a1;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 100
    .line 101
    invoke-virtual {v7, v5, v4}, Landroidx/recyclerview/widget/RecyclerView;->offsetPositionRecordsForInsert(II)V

    .line 102
    .line 103
    .line 104
    iput-boolean v6, v7, Landroidx/recyclerview/widget/RecyclerView;->mItemsAddedOrRemoved:Z

    .line 105
    .line 106
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_4
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/b;->k(Ljava/util/ArrayList;)V

    .line 110
    .line 111
    .line 112
    iput v2, p0, Landroidx/recyclerview/widget/b;->f:I

    .line 113
    .line 114
    return-void
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

.method public final d(Landroidx/recyclerview/widget/a;)V
    .locals 13

    .line 1
    iget v0, p1, Landroidx/recyclerview/widget/a;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_8

    .line 5
    .line 6
    const/16 v2, 0x8

    .line 7
    .line 8
    if-eq v0, v2, :cond_8

    .line 9
    .line 10
    iget v2, p1, Landroidx/recyclerview/widget/a;->b:I

    .line 11
    .line 12
    invoke-virtual {p0, v2, v0}, Landroidx/recyclerview/widget/b;->l(II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p1, Landroidx/recyclerview/widget/a;->b:I

    .line 17
    .line 18
    iget v3, p1, Landroidx/recyclerview/widget/a;->a:I

    .line 19
    .line 20
    const/4 v4, 0x2

    .line 21
    const/4 v5, 0x4

    .line 22
    if-eq v3, v4, :cond_1

    .line 23
    .line 24
    if-ne v3, v5, :cond_0

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 29
    .line 30
    new-instance v1, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v2, "op should be remove or update."

    .line 33
    .line 34
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v0

    .line 48
    :cond_1
    const/4 v3, 0x0

    .line 49
    :goto_0
    const/4 v6, 0x1

    .line 50
    const/4 v7, 0x1

    .line 51
    :goto_1
    iget v8, p1, Landroidx/recyclerview/widget/a;->d:I

    .line 52
    .line 53
    iget-object v9, p0, Landroidx/recyclerview/widget/b;->a:Ll0/c;

    .line 54
    .line 55
    const/4 v10, 0x0

    .line 56
    if-ge v6, v8, :cond_6

    .line 57
    .line 58
    iget v8, p1, Landroidx/recyclerview/widget/a;->b:I

    .line 59
    .line 60
    mul-int v11, v3, v6

    .line 61
    .line 62
    add-int/2addr v11, v8

    .line 63
    iget v8, p1, Landroidx/recyclerview/widget/a;->a:I

    .line 64
    .line 65
    invoke-virtual {p0, v11, v8}, Landroidx/recyclerview/widget/b;->l(II)I

    .line 66
    .line 67
    .line 68
    move-result v8

    .line 69
    iget v11, p1, Landroidx/recyclerview/widget/a;->a:I

    .line 70
    .line 71
    if-eq v11, v4, :cond_3

    .line 72
    .line 73
    if-eq v11, v5, :cond_2

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_2
    add-int/lit8 v12, v0, 0x1

    .line 77
    .line 78
    if-ne v8, v12, :cond_4

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_3
    if-ne v8, v0, :cond_4

    .line 82
    .line 83
    :goto_2
    add-int/lit8 v7, v7, 0x1

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_4
    :goto_3
    iget-object v12, p1, Landroidx/recyclerview/widget/a;->c:Ljava/lang/Object;

    .line 87
    .line 88
    invoke-virtual {p0, v12, v11, v0, v7}, Landroidx/recyclerview/widget/b;->h(Ljava/lang/Object;III)Landroidx/recyclerview/widget/a;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {p0, v0, v2}, Landroidx/recyclerview/widget/b;->e(Landroidx/recyclerview/widget/a;I)V

    .line 93
    .line 94
    .line 95
    iput-object v10, v0, Landroidx/recyclerview/widget/a;->c:Ljava/lang/Object;

    .line 96
    .line 97
    invoke-virtual {v9, v0}, Ll0/c;->c(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    iget v0, p1, Landroidx/recyclerview/widget/a;->a:I

    .line 101
    .line 102
    if-ne v0, v5, :cond_5

    .line 103
    .line 104
    add-int/2addr v2, v7

    .line 105
    :cond_5
    move v0, v8

    .line 106
    const/4 v7, 0x1

    .line 107
    :goto_4
    add-int/lit8 v6, v6, 0x1

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_6
    iget-object v1, p1, Landroidx/recyclerview/widget/a;->c:Ljava/lang/Object;

    .line 111
    .line 112
    iput-object v10, p1, Landroidx/recyclerview/widget/a;->c:Ljava/lang/Object;

    .line 113
    .line 114
    invoke-virtual {v9, p1}, Ll0/c;->c(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    if-lez v7, :cond_7

    .line 118
    .line 119
    iget p1, p1, Landroidx/recyclerview/widget/a;->a:I

    .line 120
    .line 121
    invoke-virtual {p0, v1, p1, v0, v7}, Landroidx/recyclerview/widget/b;->h(Ljava/lang/Object;III)Landroidx/recyclerview/widget/a;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-virtual {p0, p1, v2}, Landroidx/recyclerview/widget/b;->e(Landroidx/recyclerview/widget/a;I)V

    .line 126
    .line 127
    .line 128
    iput-object v10, p1, Landroidx/recyclerview/widget/a;->c:Ljava/lang/Object;

    .line 129
    .line 130
    invoke-virtual {v9, p1}, Ll0/c;->c(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    :cond_7
    return-void

    .line 134
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 135
    .line 136
    const-string v0, "should not dispatch add or move for pre layout"

    .line 137
    .line 138
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw p1
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
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
.end method

.method public final e(Landroidx/recyclerview/widget/a;I)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/b;->d:Landroidx/recyclerview/widget/a1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/a1;->a(Landroidx/recyclerview/widget/a;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, Landroidx/recyclerview/widget/a1;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 7
    .line 8
    iget v1, p1, Landroidx/recyclerview/widget/a;->a:I

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    const/4 v3, 0x1

    .line 12
    if-eq v1, v2, :cond_1

    .line 13
    .line 14
    const/4 v2, 0x4

    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    iget v1, p1, Landroidx/recyclerview/widget/a;->d:I

    .line 18
    .line 19
    iget-object p1, p1, Landroidx/recyclerview/widget/a;->c:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-virtual {v0, p2, v1, p1}, Landroidx/recyclerview/widget/RecyclerView;->viewRangeUpdate(IILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iput-boolean v3, v0, Landroidx/recyclerview/widget/RecyclerView;->mItemsChanged:Z

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 28
    .line 29
    const-string p2, "only remove and update ops can be dispatched in first pass"

    .line 30
    .line 31
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_1
    iget p1, p1, Landroidx/recyclerview/widget/a;->d:I

    .line 36
    .line 37
    invoke-virtual {v0, p2, p1, v3}, Landroidx/recyclerview/widget/RecyclerView;->offsetPositionRecordsForRemove(IIZ)V

    .line 38
    .line 39
    .line 40
    iput-boolean v3, v0, Landroidx/recyclerview/widget/RecyclerView;->mItemsAddedOrRemoved:Z

    .line 41
    .line 42
    iget-object p2, v0, Landroidx/recyclerview/widget/RecyclerView;->mState:Landroidx/recyclerview/widget/e2;

    .line 43
    .line 44
    iget v0, p2, Landroidx/recyclerview/widget/e2;->c:I

    .line 45
    .line 46
    add-int/2addr v0, p1

    .line 47
    iput v0, p2, Landroidx/recyclerview/widget/e2;->c:I

    .line 48
    .line 49
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
.end method

.method public final f(II)I
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/b;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    :goto_0
    if-ge p2, v1, :cond_6

    .line 8
    .line 9
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Landroidx/recyclerview/widget/a;

    .line 14
    .line 15
    iget v3, v2, Landroidx/recyclerview/widget/a;->a:I

    .line 16
    .line 17
    const/16 v4, 0x8

    .line 18
    .line 19
    if-ne v3, v4, :cond_2

    .line 20
    .line 21
    iget v3, v2, Landroidx/recyclerview/widget/a;->b:I

    .line 22
    .line 23
    if-ne v3, p1, :cond_0

    .line 24
    .line 25
    iget p1, v2, Landroidx/recyclerview/widget/a;->d:I

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    if-ge v3, p1, :cond_1

    .line 29
    .line 30
    add-int/lit8 p1, p1, -0x1

    .line 31
    .line 32
    :cond_1
    iget v2, v2, Landroidx/recyclerview/widget/a;->d:I

    .line 33
    .line 34
    if-gt v2, p1, :cond_5

    .line 35
    .line 36
    add-int/lit8 p1, p1, 0x1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    iget v4, v2, Landroidx/recyclerview/widget/a;->b:I

    .line 40
    .line 41
    if-gt v4, p1, :cond_5

    .line 42
    .line 43
    const/4 v5, 0x2

    .line 44
    if-ne v3, v5, :cond_4

    .line 45
    .line 46
    iget v2, v2, Landroidx/recyclerview/widget/a;->d:I

    .line 47
    .line 48
    add-int/2addr v4, v2

    .line 49
    if-ge p1, v4, :cond_3

    .line 50
    .line 51
    const/4 p1, -0x1

    .line 52
    return p1

    .line 53
    :cond_3
    sub-int/2addr p1, v2

    .line 54
    goto :goto_1

    .line 55
    :cond_4
    const/4 v4, 0x1

    .line 56
    if-ne v3, v4, :cond_5

    .line 57
    .line 58
    iget v2, v2, Landroidx/recyclerview/widget/a;->d:I

    .line 59
    .line 60
    add-int/2addr p1, v2

    .line 61
    :cond_5
    :goto_1
    add-int/lit8 p2, p2, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_6
    return p1
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method

.method public final g()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/b;->b:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
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

.method public final h(Ljava/lang/Object;III)Landroidx/recyclerview/widget/a;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/b;->a:Ll0/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll0/c;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/recyclerview/widget/a;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Landroidx/recyclerview/widget/a;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput p2, v0, Landroidx/recyclerview/widget/a;->a:I

    .line 17
    .line 18
    iput p3, v0, Landroidx/recyclerview/widget/a;->b:I

    .line 19
    .line 20
    iput p4, v0, Landroidx/recyclerview/widget/a;->d:I

    .line 21
    .line 22
    iput-object p1, v0, Landroidx/recyclerview/widget/a;->c:Ljava/lang/Object;

    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_0
    iput p2, v0, Landroidx/recyclerview/widget/a;->a:I

    .line 26
    .line 27
    iput p3, v0, Landroidx/recyclerview/widget/a;->b:I

    .line 28
    .line 29
    iput p4, v0, Landroidx/recyclerview/widget/a;->d:I

    .line 30
    .line 31
    iput-object p1, v0, Landroidx/recyclerview/widget/a;->c:Ljava/lang/Object;

    .line 32
    .line 33
    return-object v0
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

.method public final i(Landroidx/recyclerview/widget/a;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/b;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget v0, p1, Landroidx/recyclerview/widget/a;->a:I

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/recyclerview/widget/b;->d:Landroidx/recyclerview/widget/a1;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    if-eq v0, v2, :cond_3

    .line 12
    .line 13
    const/4 v3, 0x2

    .line 14
    if-eq v0, v3, :cond_2

    .line 15
    .line 16
    const/4 v3, 0x4

    .line 17
    if-eq v0, v3, :cond_1

    .line 18
    .line 19
    const/16 v3, 0x8

    .line 20
    .line 21
    if-ne v0, v3, :cond_0

    .line 22
    .line 23
    iget v0, p1, Landroidx/recyclerview/widget/a;->b:I

    .line 24
    .line 25
    iget p1, p1, Landroidx/recyclerview/widget/a;->d:I

    .line 26
    .line 27
    iget-object v1, v1, Landroidx/recyclerview/widget/a1;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 28
    .line 29
    invoke-virtual {v1, v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->offsetPositionRecordsForMove(II)V

    .line 30
    .line 31
    .line 32
    iput-boolean v2, v1, Landroidx/recyclerview/widget/RecyclerView;->mItemsAddedOrRemoved:Z

    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 36
    .line 37
    new-instance v1, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v2, "Unknown update op type for "

    .line 40
    .line 41
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v0

    .line 55
    :cond_1
    iget v0, p1, Landroidx/recyclerview/widget/a;->b:I

    .line 56
    .line 57
    iget v3, p1, Landroidx/recyclerview/widget/a;->d:I

    .line 58
    .line 59
    iget-object p1, p1, Landroidx/recyclerview/widget/a;->c:Ljava/lang/Object;

    .line 60
    .line 61
    iget-object v1, v1, Landroidx/recyclerview/widget/a1;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 62
    .line 63
    invoke-virtual {v1, v0, v3, p1}, Landroidx/recyclerview/widget/RecyclerView;->viewRangeUpdate(IILjava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iput-boolean v2, v1, Landroidx/recyclerview/widget/RecyclerView;->mItemsChanged:Z

    .line 67
    .line 68
    return-void

    .line 69
    :cond_2
    iget v0, p1, Landroidx/recyclerview/widget/a;->b:I

    .line 70
    .line 71
    iget p1, p1, Landroidx/recyclerview/widget/a;->d:I

    .line 72
    .line 73
    iget-object v1, v1, Landroidx/recyclerview/widget/a1;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 74
    .line 75
    const/4 v3, 0x0

    .line 76
    invoke-virtual {v1, v0, p1, v3}, Landroidx/recyclerview/widget/RecyclerView;->offsetPositionRecordsForRemove(IIZ)V

    .line 77
    .line 78
    .line 79
    iput-boolean v2, v1, Landroidx/recyclerview/widget/RecyclerView;->mItemsAddedOrRemoved:Z

    .line 80
    .line 81
    return-void

    .line 82
    :cond_3
    iget v0, p1, Landroidx/recyclerview/widget/a;->b:I

    .line 83
    .line 84
    iget p1, p1, Landroidx/recyclerview/widget/a;->d:I

    .line 85
    .line 86
    iget-object v1, v1, Landroidx/recyclerview/widget/a1;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 87
    .line 88
    invoke-virtual {v1, v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->offsetPositionRecordsForInsert(II)V

    .line 89
    .line 90
    .line 91
    iput-boolean v2, v1, Landroidx/recyclerview/widget/RecyclerView;->mItemsAddedOrRemoved:Z

    .line 92
    .line 93
    return-void
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

.method public final j()V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/recyclerview/widget/b;->e:Landroidx/recyclerview/widget/c;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    :cond_0
    :goto_0
    iget-object v2, v0, Landroidx/recyclerview/widget/b;->b:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    const/4 v4, 0x1

    .line 15
    sub-int/2addr v3, v4

    .line 16
    const/4 v6, 0x0

    .line 17
    :goto_1
    const/16 v7, 0x8

    .line 18
    .line 19
    const/4 v8, -0x1

    .line 20
    if-ltz v3, :cond_3

    .line 21
    .line 22
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v9

    .line 26
    check-cast v9, Landroidx/recyclerview/widget/a;

    .line 27
    .line 28
    iget v9, v9, Landroidx/recyclerview/widget/a;->a:I

    .line 29
    .line 30
    if-ne v9, v7, :cond_1

    .line 31
    .line 32
    if-eqz v6, :cond_2

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_1
    const/4 v6, 0x1

    .line 36
    :cond_2
    add-int/lit8 v3, v3, -0x1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_3
    const/4 v3, -0x1

    .line 40
    :goto_2
    const/4 v6, 0x2

    .line 41
    const/4 v9, 0x4

    .line 42
    const/4 v10, 0x0

    .line 43
    if-eq v3, v8, :cond_22

    .line 44
    .line 45
    add-int/lit8 v7, v3, 0x1

    .line 46
    .line 47
    iget-object v11, v1, Landroidx/recyclerview/widget/c;->a:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v11, Landroidx/recyclerview/widget/b;

    .line 50
    .line 51
    iget-object v12, v11, Landroidx/recyclerview/widget/b;->a:Ll0/c;

    .line 52
    .line 53
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v13

    .line 57
    check-cast v13, Landroidx/recyclerview/widget/a;

    .line 58
    .line 59
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v14

    .line 63
    check-cast v14, Landroidx/recyclerview/widget/a;

    .line 64
    .line 65
    iget v15, v14, Landroidx/recyclerview/widget/a;->a:I

    .line 66
    .line 67
    if-eq v15, v4, :cond_1d

    .line 68
    .line 69
    if-eq v15, v6, :cond_b

    .line 70
    .line 71
    if-eq v15, v9, :cond_4

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_4
    iget v5, v13, Landroidx/recyclerview/widget/a;->d:I

    .line 75
    .line 76
    iget v6, v14, Landroidx/recyclerview/widget/a;->b:I

    .line 77
    .line 78
    if-ge v5, v6, :cond_5

    .line 79
    .line 80
    add-int/lit8 v6, v6, -0x1

    .line 81
    .line 82
    iput v6, v14, Landroidx/recyclerview/widget/a;->b:I

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_5
    iget v8, v14, Landroidx/recyclerview/widget/a;->d:I

    .line 86
    .line 87
    add-int/2addr v6, v8

    .line 88
    if-ge v5, v6, :cond_6

    .line 89
    .line 90
    add-int/lit8 v8, v8, -0x1

    .line 91
    .line 92
    iput v8, v14, Landroidx/recyclerview/widget/a;->d:I

    .line 93
    .line 94
    iget v5, v13, Landroidx/recyclerview/widget/a;->b:I

    .line 95
    .line 96
    iget-object v6, v14, Landroidx/recyclerview/widget/a;->c:Ljava/lang/Object;

    .line 97
    .line 98
    invoke-virtual {v11, v6, v9, v5, v4}, Landroidx/recyclerview/widget/b;->h(Ljava/lang/Object;III)Landroidx/recyclerview/widget/a;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    goto :goto_4

    .line 103
    :cond_6
    :goto_3
    move-object v4, v10

    .line 104
    :goto_4
    iget v5, v13, Landroidx/recyclerview/widget/a;->b:I

    .line 105
    .line 106
    iget v6, v14, Landroidx/recyclerview/widget/a;->b:I

    .line 107
    .line 108
    if-gt v5, v6, :cond_7

    .line 109
    .line 110
    add-int/lit8 v6, v6, 0x1

    .line 111
    .line 112
    iput v6, v14, Landroidx/recyclerview/widget/a;->b:I

    .line 113
    .line 114
    goto :goto_5

    .line 115
    :cond_7
    iget v8, v14, Landroidx/recyclerview/widget/a;->d:I

    .line 116
    .line 117
    add-int/2addr v6, v8

    .line 118
    if-ge v5, v6, :cond_8

    .line 119
    .line 120
    sub-int/2addr v6, v5

    .line 121
    add-int/lit8 v5, v5, 0x1

    .line 122
    .line 123
    iget-object v8, v14, Landroidx/recyclerview/widget/a;->c:Ljava/lang/Object;

    .line 124
    .line 125
    invoke-virtual {v11, v8, v9, v5, v6}, Landroidx/recyclerview/widget/b;->h(Ljava/lang/Object;III)Landroidx/recyclerview/widget/a;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    iget v8, v14, Landroidx/recyclerview/widget/a;->d:I

    .line 130
    .line 131
    sub-int/2addr v8, v6

    .line 132
    iput v8, v14, Landroidx/recyclerview/widget/a;->d:I

    .line 133
    .line 134
    goto :goto_6

    .line 135
    :cond_8
    :goto_5
    move-object v5, v10

    .line 136
    :goto_6
    invoke-virtual {v2, v7, v13}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    iget v6, v14, Landroidx/recyclerview/widget/a;->d:I

    .line 140
    .line 141
    if-lez v6, :cond_9

    .line 142
    .line 143
    invoke-virtual {v2, v3, v14}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    goto :goto_7

    .line 147
    :cond_9
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    iput-object v10, v14, Landroidx/recyclerview/widget/a;->c:Ljava/lang/Object;

    .line 151
    .line 152
    invoke-virtual {v12, v14}, Ll0/c;->c(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    :goto_7
    if-eqz v4, :cond_a

    .line 156
    .line 157
    invoke-virtual {v2, v3, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    :cond_a
    if-eqz v5, :cond_0

    .line 161
    .line 162
    invoke-virtual {v2, v3, v5}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    goto/16 :goto_0

    .line 166
    .line 167
    :cond_b
    iget v8, v13, Landroidx/recyclerview/widget/a;->b:I

    .line 168
    .line 169
    iget v9, v13, Landroidx/recyclerview/widget/a;->d:I

    .line 170
    .line 171
    if-ge v8, v9, :cond_d

    .line 172
    .line 173
    iget v15, v14, Landroidx/recyclerview/widget/a;->b:I

    .line 174
    .line 175
    if-ne v15, v8, :cond_c

    .line 176
    .line 177
    iget v15, v14, Landroidx/recyclerview/widget/a;->d:I

    .line 178
    .line 179
    sub-int v8, v9, v8

    .line 180
    .line 181
    if-ne v15, v8, :cond_c

    .line 182
    .line 183
    const/4 v5, 0x1

    .line 184
    :goto_8
    const/4 v8, 0x0

    .line 185
    goto :goto_a

    .line 186
    :cond_c
    const/4 v5, 0x0

    .line 187
    goto :goto_8

    .line 188
    :cond_d
    iget v15, v14, Landroidx/recyclerview/widget/a;->b:I

    .line 189
    .line 190
    add-int/lit8 v5, v9, 0x1

    .line 191
    .line 192
    if-ne v15, v5, :cond_e

    .line 193
    .line 194
    iget v5, v14, Landroidx/recyclerview/widget/a;->d:I

    .line 195
    .line 196
    sub-int/2addr v8, v9

    .line 197
    if-ne v5, v8, :cond_e

    .line 198
    .line 199
    const/4 v5, 0x1

    .line 200
    :goto_9
    const/4 v8, 0x1

    .line 201
    goto :goto_a

    .line 202
    :cond_e
    const/4 v5, 0x0

    .line 203
    goto :goto_9

    .line 204
    :goto_a
    iget v15, v14, Landroidx/recyclerview/widget/a;->b:I

    .line 205
    .line 206
    if-ge v9, v15, :cond_f

    .line 207
    .line 208
    add-int/lit8 v15, v15, -0x1

    .line 209
    .line 210
    iput v15, v14, Landroidx/recyclerview/widget/a;->b:I

    .line 211
    .line 212
    goto :goto_b

    .line 213
    :cond_f
    iget v10, v14, Landroidx/recyclerview/widget/a;->d:I

    .line 214
    .line 215
    add-int/2addr v15, v10

    .line 216
    if-ge v9, v15, :cond_10

    .line 217
    .line 218
    add-int/lit8 v10, v10, -0x1

    .line 219
    .line 220
    iput v10, v14, Landroidx/recyclerview/widget/a;->d:I

    .line 221
    .line 222
    iput v6, v13, Landroidx/recyclerview/widget/a;->a:I

    .line 223
    .line 224
    iput v4, v13, Landroidx/recyclerview/widget/a;->d:I

    .line 225
    .line 226
    iget v3, v14, Landroidx/recyclerview/widget/a;->d:I

    .line 227
    .line 228
    if-nez v3, :cond_0

    .line 229
    .line 230
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    const/4 v2, 0x0

    .line 234
    iput-object v2, v14, Landroidx/recyclerview/widget/a;->c:Ljava/lang/Object;

    .line 235
    .line 236
    invoke-virtual {v12, v14}, Ll0/c;->c(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    goto/16 :goto_0

    .line 240
    .line 241
    :cond_10
    :goto_b
    iget v4, v13, Landroidx/recyclerview/widget/a;->b:I

    .line 242
    .line 243
    iget v9, v14, Landroidx/recyclerview/widget/a;->b:I

    .line 244
    .line 245
    if-gt v4, v9, :cond_12

    .line 246
    .line 247
    add-int/lit8 v9, v9, 0x1

    .line 248
    .line 249
    iput v9, v14, Landroidx/recyclerview/widget/a;->b:I

    .line 250
    .line 251
    :cond_11
    const/4 v10, 0x0

    .line 252
    goto :goto_c

    .line 253
    :cond_12
    iget v10, v14, Landroidx/recyclerview/widget/a;->d:I

    .line 254
    .line 255
    add-int/2addr v9, v10

    .line 256
    if-ge v4, v9, :cond_11

    .line 257
    .line 258
    sub-int/2addr v9, v4

    .line 259
    add-int/lit8 v4, v4, 0x1

    .line 260
    .line 261
    const/4 v10, 0x0

    .line 262
    invoke-virtual {v11, v10, v6, v4, v9}, Landroidx/recyclerview/widget/b;->h(Ljava/lang/Object;III)Landroidx/recyclerview/widget/a;

    .line 263
    .line 264
    .line 265
    move-result-object v17

    .line 266
    iget v4, v13, Landroidx/recyclerview/widget/a;->b:I

    .line 267
    .line 268
    iget v6, v14, Landroidx/recyclerview/widget/a;->b:I

    .line 269
    .line 270
    sub-int/2addr v4, v6

    .line 271
    iput v4, v14, Landroidx/recyclerview/widget/a;->d:I

    .line 272
    .line 273
    move-object/from16 v4, v17

    .line 274
    .line 275
    goto :goto_d

    .line 276
    :goto_c
    move-object v4, v10

    .line 277
    :goto_d
    if-eqz v5, :cond_13

    .line 278
    .line 279
    invoke-virtual {v2, v3, v14}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    iput-object v10, v13, Landroidx/recyclerview/widget/a;->c:Ljava/lang/Object;

    .line 286
    .line 287
    invoke-virtual {v12, v13}, Ll0/c;->c(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    goto/16 :goto_0

    .line 291
    .line 292
    :cond_13
    if-eqz v8, :cond_17

    .line 293
    .line 294
    if-eqz v4, :cond_15

    .line 295
    .line 296
    iget v5, v13, Landroidx/recyclerview/widget/a;->b:I

    .line 297
    .line 298
    iget v6, v4, Landroidx/recyclerview/widget/a;->b:I

    .line 299
    .line 300
    if-le v5, v6, :cond_14

    .line 301
    .line 302
    iget v6, v4, Landroidx/recyclerview/widget/a;->d:I

    .line 303
    .line 304
    sub-int/2addr v5, v6

    .line 305
    iput v5, v13, Landroidx/recyclerview/widget/a;->b:I

    .line 306
    .line 307
    :cond_14
    iget v5, v13, Landroidx/recyclerview/widget/a;->d:I

    .line 308
    .line 309
    iget v6, v4, Landroidx/recyclerview/widget/a;->b:I

    .line 310
    .line 311
    if-le v5, v6, :cond_15

    .line 312
    .line 313
    iget v6, v4, Landroidx/recyclerview/widget/a;->d:I

    .line 314
    .line 315
    sub-int/2addr v5, v6

    .line 316
    iput v5, v13, Landroidx/recyclerview/widget/a;->d:I

    .line 317
    .line 318
    :cond_15
    iget v5, v13, Landroidx/recyclerview/widget/a;->b:I

    .line 319
    .line 320
    iget v6, v14, Landroidx/recyclerview/widget/a;->b:I

    .line 321
    .line 322
    if-le v5, v6, :cond_16

    .line 323
    .line 324
    iget v6, v14, Landroidx/recyclerview/widget/a;->d:I

    .line 325
    .line 326
    sub-int/2addr v5, v6

    .line 327
    iput v5, v13, Landroidx/recyclerview/widget/a;->b:I

    .line 328
    .line 329
    :cond_16
    iget v5, v13, Landroidx/recyclerview/widget/a;->d:I

    .line 330
    .line 331
    iget v6, v14, Landroidx/recyclerview/widget/a;->b:I

    .line 332
    .line 333
    if-le v5, v6, :cond_1b

    .line 334
    .line 335
    iget v6, v14, Landroidx/recyclerview/widget/a;->d:I

    .line 336
    .line 337
    sub-int/2addr v5, v6

    .line 338
    iput v5, v13, Landroidx/recyclerview/widget/a;->d:I

    .line 339
    .line 340
    goto :goto_e

    .line 341
    :cond_17
    if-eqz v4, :cond_19

    .line 342
    .line 343
    iget v5, v13, Landroidx/recyclerview/widget/a;->b:I

    .line 344
    .line 345
    iget v6, v4, Landroidx/recyclerview/widget/a;->b:I

    .line 346
    .line 347
    if-lt v5, v6, :cond_18

    .line 348
    .line 349
    iget v6, v4, Landroidx/recyclerview/widget/a;->d:I

    .line 350
    .line 351
    sub-int/2addr v5, v6

    .line 352
    iput v5, v13, Landroidx/recyclerview/widget/a;->b:I

    .line 353
    .line 354
    :cond_18
    iget v5, v13, Landroidx/recyclerview/widget/a;->d:I

    .line 355
    .line 356
    iget v6, v4, Landroidx/recyclerview/widget/a;->b:I

    .line 357
    .line 358
    if-lt v5, v6, :cond_19

    .line 359
    .line 360
    iget v6, v4, Landroidx/recyclerview/widget/a;->d:I

    .line 361
    .line 362
    sub-int/2addr v5, v6

    .line 363
    iput v5, v13, Landroidx/recyclerview/widget/a;->d:I

    .line 364
    .line 365
    :cond_19
    iget v5, v13, Landroidx/recyclerview/widget/a;->b:I

    .line 366
    .line 367
    iget v6, v14, Landroidx/recyclerview/widget/a;->b:I

    .line 368
    .line 369
    if-lt v5, v6, :cond_1a

    .line 370
    .line 371
    iget v6, v14, Landroidx/recyclerview/widget/a;->d:I

    .line 372
    .line 373
    sub-int/2addr v5, v6

    .line 374
    iput v5, v13, Landroidx/recyclerview/widget/a;->b:I

    .line 375
    .line 376
    :cond_1a
    iget v5, v13, Landroidx/recyclerview/widget/a;->d:I

    .line 377
    .line 378
    iget v6, v14, Landroidx/recyclerview/widget/a;->b:I

    .line 379
    .line 380
    if-lt v5, v6, :cond_1b

    .line 381
    .line 382
    iget v6, v14, Landroidx/recyclerview/widget/a;->d:I

    .line 383
    .line 384
    sub-int/2addr v5, v6

    .line 385
    iput v5, v13, Landroidx/recyclerview/widget/a;->d:I

    .line 386
    .line 387
    :cond_1b
    :goto_e
    invoke-virtual {v2, v3, v14}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    iget v5, v13, Landroidx/recyclerview/widget/a;->b:I

    .line 391
    .line 392
    iget v6, v13, Landroidx/recyclerview/widget/a;->d:I

    .line 393
    .line 394
    if-eq v5, v6, :cond_1c

    .line 395
    .line 396
    invoke-virtual {v2, v7, v13}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    goto :goto_f

    .line 400
    :cond_1c
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    :goto_f
    if-eqz v4, :cond_0

    .line 404
    .line 405
    invoke-virtual {v2, v3, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 406
    .line 407
    .line 408
    goto/16 :goto_0

    .line 409
    .line 410
    :cond_1d
    iget v4, v13, Landroidx/recyclerview/widget/a;->d:I

    .line 411
    .line 412
    iget v5, v14, Landroidx/recyclerview/widget/a;->b:I

    .line 413
    .line 414
    if-ge v4, v5, :cond_1e

    .line 415
    .line 416
    const/16 v16, -0x1

    .line 417
    .line 418
    goto :goto_10

    .line 419
    :cond_1e
    const/16 v16, 0x0

    .line 420
    .line 421
    :goto_10
    iget v6, v13, Landroidx/recyclerview/widget/a;->b:I

    .line 422
    .line 423
    if-ge v6, v5, :cond_1f

    .line 424
    .line 425
    add-int/lit8 v16, v16, 0x1

    .line 426
    .line 427
    :cond_1f
    if-gt v5, v6, :cond_20

    .line 428
    .line 429
    iget v5, v14, Landroidx/recyclerview/widget/a;->d:I

    .line 430
    .line 431
    add-int/2addr v6, v5

    .line 432
    iput v6, v13, Landroidx/recyclerview/widget/a;->b:I

    .line 433
    .line 434
    :cond_20
    iget v5, v14, Landroidx/recyclerview/widget/a;->b:I

    .line 435
    .line 436
    if-gt v5, v4, :cond_21

    .line 437
    .line 438
    iget v6, v14, Landroidx/recyclerview/widget/a;->d:I

    .line 439
    .line 440
    add-int/2addr v4, v6

    .line 441
    iput v4, v13, Landroidx/recyclerview/widget/a;->d:I

    .line 442
    .line 443
    :cond_21
    add-int v5, v5, v16

    .line 444
    .line 445
    iput v5, v14, Landroidx/recyclerview/widget/a;->b:I

    .line 446
    .line 447
    invoke-virtual {v2, v3, v14}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v2, v7, v13}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    goto/16 :goto_0

    .line 454
    .line 455
    :cond_22
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 456
    .line 457
    .line 458
    move-result v1

    .line 459
    const/4 v3, 0x0

    .line 460
    :goto_11
    if-ge v3, v1, :cond_36

    .line 461
    .line 462
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v5

    .line 466
    check-cast v5, Landroidx/recyclerview/widget/a;

    .line 467
    .line 468
    iget v10, v5, Landroidx/recyclerview/widget/a;->a:I

    .line 469
    .line 470
    if-eq v10, v4, :cond_35

    .line 471
    .line 472
    iget-object v11, v0, Landroidx/recyclerview/widget/b;->a:Ll0/c;

    .line 473
    .line 474
    iget-object v12, v0, Landroidx/recyclerview/widget/b;->d:Landroidx/recyclerview/widget/a1;

    .line 475
    .line 476
    if-eq v10, v6, :cond_2c

    .line 477
    .line 478
    if-eq v10, v9, :cond_24

    .line 479
    .line 480
    if-eq v10, v7, :cond_23

    .line 481
    .line 482
    :goto_12
    const/4 v4, 0x0

    .line 483
    const/16 v18, 0x1

    .line 484
    .line 485
    goto/16 :goto_1d

    .line 486
    .line 487
    :cond_23
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/b;->i(Landroidx/recyclerview/widget/a;)V

    .line 488
    .line 489
    .line 490
    goto :goto_12

    .line 491
    :cond_24
    iget v10, v5, Landroidx/recyclerview/widget/a;->b:I

    .line 492
    .line 493
    iget v13, v5, Landroidx/recyclerview/widget/a;->d:I

    .line 494
    .line 495
    add-int/2addr v13, v10

    .line 496
    move v14, v10

    .line 497
    const/4 v7, -0x1

    .line 498
    const/4 v15, 0x0

    .line 499
    :goto_13
    if-ge v10, v13, :cond_29

    .line 500
    .line 501
    invoke-virtual {v12, v10}, Landroidx/recyclerview/widget/a1;->b(I)Landroidx/recyclerview/widget/i2;

    .line 502
    .line 503
    .line 504
    move-result-object v18

    .line 505
    if-nez v18, :cond_27

    .line 506
    .line 507
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/b;->a(I)Z

    .line 508
    .line 509
    .line 510
    move-result v18

    .line 511
    if-eqz v18, :cond_25

    .line 512
    .line 513
    goto :goto_14

    .line 514
    :cond_25
    if-ne v7, v4, :cond_26

    .line 515
    .line 516
    iget-object v7, v5, Landroidx/recyclerview/widget/a;->c:Ljava/lang/Object;

    .line 517
    .line 518
    invoke-virtual {v0, v7, v9, v14, v15}, Landroidx/recyclerview/widget/b;->h(Ljava/lang/Object;III)Landroidx/recyclerview/widget/a;

    .line 519
    .line 520
    .line 521
    move-result-object v7

    .line 522
    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/b;->i(Landroidx/recyclerview/widget/a;)V

    .line 523
    .line 524
    .line 525
    move v14, v10

    .line 526
    const/4 v15, 0x0

    .line 527
    :cond_26
    const/4 v7, 0x0

    .line 528
    goto :goto_15

    .line 529
    :cond_27
    :goto_14
    if-nez v7, :cond_28

    .line 530
    .line 531
    iget-object v7, v5, Landroidx/recyclerview/widget/a;->c:Ljava/lang/Object;

    .line 532
    .line 533
    invoke-virtual {v0, v7, v9, v14, v15}, Landroidx/recyclerview/widget/b;->h(Ljava/lang/Object;III)Landroidx/recyclerview/widget/a;

    .line 534
    .line 535
    .line 536
    move-result-object v7

    .line 537
    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/b;->d(Landroidx/recyclerview/widget/a;)V

    .line 538
    .line 539
    .line 540
    move v14, v10

    .line 541
    const/4 v15, 0x0

    .line 542
    :cond_28
    const/4 v7, 0x1

    .line 543
    :goto_15
    add-int/2addr v15, v4

    .line 544
    add-int/lit8 v10, v10, 0x1

    .line 545
    .line 546
    goto :goto_13

    .line 547
    :cond_29
    iget v10, v5, Landroidx/recyclerview/widget/a;->d:I

    .line 548
    .line 549
    if-eq v15, v10, :cond_2a

    .line 550
    .line 551
    iget-object v10, v5, Landroidx/recyclerview/widget/a;->c:Ljava/lang/Object;

    .line 552
    .line 553
    const/4 v12, 0x0

    .line 554
    iput-object v12, v5, Landroidx/recyclerview/widget/a;->c:Ljava/lang/Object;

    .line 555
    .line 556
    invoke-virtual {v11, v5}, Ll0/c;->c(Ljava/lang/Object;)Z

    .line 557
    .line 558
    .line 559
    invoke-virtual {v0, v10, v9, v14, v15}, Landroidx/recyclerview/widget/b;->h(Ljava/lang/Object;III)Landroidx/recyclerview/widget/a;

    .line 560
    .line 561
    .line 562
    move-result-object v5

    .line 563
    :cond_2a
    if-nez v7, :cond_2b

    .line 564
    .line 565
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/b;->d(Landroidx/recyclerview/widget/a;)V

    .line 566
    .line 567
    .line 568
    goto :goto_12

    .line 569
    :cond_2b
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/b;->i(Landroidx/recyclerview/widget/a;)V

    .line 570
    .line 571
    .line 572
    goto :goto_12

    .line 573
    :cond_2c
    iget v7, v5, Landroidx/recyclerview/widget/a;->b:I

    .line 574
    .line 575
    iget v10, v5, Landroidx/recyclerview/widget/a;->d:I

    .line 576
    .line 577
    add-int/2addr v10, v7

    .line 578
    move v13, v7

    .line 579
    const/4 v14, 0x0

    .line 580
    const/4 v15, -0x1

    .line 581
    :goto_16
    if-ge v13, v10, :cond_32

    .line 582
    .line 583
    invoke-virtual {v12, v13}, Landroidx/recyclerview/widget/a1;->b(I)Landroidx/recyclerview/widget/i2;

    .line 584
    .line 585
    .line 586
    move-result-object v18

    .line 587
    if-nez v18, :cond_2d

    .line 588
    .line 589
    invoke-virtual {v0, v13}, Landroidx/recyclerview/widget/b;->a(I)Z

    .line 590
    .line 591
    .line 592
    move-result v18

    .line 593
    if-eqz v18, :cond_2e

    .line 594
    .line 595
    :cond_2d
    const/4 v4, 0x0

    .line 596
    const/16 v18, 0x1

    .line 597
    .line 598
    goto :goto_18

    .line 599
    :cond_2e
    if-ne v15, v4, :cond_2f

    .line 600
    .line 601
    const/4 v15, 0x0

    .line 602
    const/16 v18, 0x1

    .line 603
    .line 604
    invoke-virtual {v0, v15, v6, v7, v14}, Landroidx/recyclerview/widget/b;->h(Ljava/lang/Object;III)Landroidx/recyclerview/widget/a;

    .line 605
    .line 606
    .line 607
    move-result-object v4

    .line 608
    invoke-virtual {v0, v4}, Landroidx/recyclerview/widget/b;->i(Landroidx/recyclerview/widget/a;)V

    .line 609
    .line 610
    .line 611
    const/4 v4, 0x1

    .line 612
    goto :goto_17

    .line 613
    :cond_2f
    const/4 v15, 0x0

    .line 614
    const/16 v18, 0x1

    .line 615
    .line 616
    const/4 v4, 0x0

    .line 617
    :goto_17
    const/4 v15, 0x0

    .line 618
    goto :goto_1a

    .line 619
    :goto_18
    if-nez v15, :cond_30

    .line 620
    .line 621
    invoke-virtual {v0, v4, v6, v7, v14}, Landroidx/recyclerview/widget/b;->h(Ljava/lang/Object;III)Landroidx/recyclerview/widget/a;

    .line 622
    .line 623
    .line 624
    move-result-object v15

    .line 625
    invoke-virtual {v0, v15}, Landroidx/recyclerview/widget/b;->d(Landroidx/recyclerview/widget/a;)V

    .line 626
    .line 627
    .line 628
    const/4 v4, 0x1

    .line 629
    goto :goto_19

    .line 630
    :cond_30
    const/4 v4, 0x0

    .line 631
    :goto_19
    const/4 v15, 0x1

    .line 632
    :goto_1a
    if-eqz v4, :cond_31

    .line 633
    .line 634
    sub-int/2addr v13, v14

    .line 635
    sub-int/2addr v10, v14

    .line 636
    const/4 v14, 0x1

    .line 637
    goto :goto_1b

    .line 638
    :cond_31
    add-int/lit8 v14, v14, 0x1

    .line 639
    .line 640
    :goto_1b
    add-int/lit8 v13, v13, 0x1

    .line 641
    .line 642
    const/4 v4, 0x1

    .line 643
    goto :goto_16

    .line 644
    :cond_32
    const/16 v18, 0x1

    .line 645
    .line 646
    iget v4, v5, Landroidx/recyclerview/widget/a;->d:I

    .line 647
    .line 648
    if-eq v14, v4, :cond_33

    .line 649
    .line 650
    const/4 v4, 0x0

    .line 651
    iput-object v4, v5, Landroidx/recyclerview/widget/a;->c:Ljava/lang/Object;

    .line 652
    .line 653
    invoke-virtual {v11, v5}, Ll0/c;->c(Ljava/lang/Object;)Z

    .line 654
    .line 655
    .line 656
    invoke-virtual {v0, v4, v6, v7, v14}, Landroidx/recyclerview/widget/b;->h(Ljava/lang/Object;III)Landroidx/recyclerview/widget/a;

    .line 657
    .line 658
    .line 659
    move-result-object v5

    .line 660
    goto :goto_1c

    .line 661
    :cond_33
    const/4 v4, 0x0

    .line 662
    :goto_1c
    if-nez v15, :cond_34

    .line 663
    .line 664
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/b;->d(Landroidx/recyclerview/widget/a;)V

    .line 665
    .line 666
    .line 667
    goto :goto_1d

    .line 668
    :cond_34
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/b;->i(Landroidx/recyclerview/widget/a;)V

    .line 669
    .line 670
    .line 671
    goto :goto_1d

    .line 672
    :cond_35
    const/4 v4, 0x0

    .line 673
    const/16 v18, 0x1

    .line 674
    .line 675
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/b;->i(Landroidx/recyclerview/widget/a;)V

    .line 676
    .line 677
    .line 678
    :goto_1d
    add-int/lit8 v3, v3, 0x1

    .line 679
    .line 680
    const/4 v4, 0x1

    .line 681
    const/16 v7, 0x8

    .line 682
    .line 683
    goto/16 :goto_11

    .line 684
    .line 685
    :cond_36
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 686
    .line 687
    .line 688
    return-void
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
.end method

.method public final k(Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, Landroidx/recyclerview/widget/a;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    iput-object v3, v2, Landroidx/recyclerview/widget/a;->c:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v3, p0, Landroidx/recyclerview/widget/b;->a:Ll0/c;

    .line 18
    .line 19
    invoke-virtual {v3, v2}, Ll0/c;->c(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 26
    .line 27
    .line 28
    return-void
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

.method public final l(II)I
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/b;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    sub-int/2addr v1, v2

    .line 9
    :goto_0
    const/16 v3, 0x8

    .line 10
    .line 11
    if-ltz v1, :cond_d

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    check-cast v4, Landroidx/recyclerview/widget/a;

    .line 18
    .line 19
    iget v5, v4, Landroidx/recyclerview/widget/a;->a:I

    .line 20
    .line 21
    const/4 v6, 0x2

    .line 22
    if-ne v5, v3, :cond_8

    .line 23
    .line 24
    iget v3, v4, Landroidx/recyclerview/widget/a;->b:I

    .line 25
    .line 26
    iget v5, v4, Landroidx/recyclerview/widget/a;->d:I

    .line 27
    .line 28
    if-ge v3, v5, :cond_0

    .line 29
    .line 30
    move v7, v3

    .line 31
    move v8, v5

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    move v8, v3

    .line 34
    move v7, v5

    .line 35
    :goto_1
    if-lt p1, v7, :cond_6

    .line 36
    .line 37
    if-gt p1, v8, :cond_6

    .line 38
    .line 39
    if-ne v7, v3, :cond_3

    .line 40
    .line 41
    if-ne p2, v2, :cond_1

    .line 42
    .line 43
    add-int/lit8 v5, v5, 0x1

    .line 44
    .line 45
    iput v5, v4, Landroidx/recyclerview/widget/a;->d:I

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    if-ne p2, v6, :cond_2

    .line 49
    .line 50
    add-int/lit8 v5, v5, -0x1

    .line 51
    .line 52
    iput v5, v4, Landroidx/recyclerview/widget/a;->d:I

    .line 53
    .line 54
    :cond_2
    :goto_2
    add-int/lit8 p1, p1, 0x1

    .line 55
    .line 56
    goto :goto_4

    .line 57
    :cond_3
    if-ne p2, v2, :cond_4

    .line 58
    .line 59
    add-int/lit8 v3, v3, 0x1

    .line 60
    .line 61
    iput v3, v4, Landroidx/recyclerview/widget/a;->b:I

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_4
    if-ne p2, v6, :cond_5

    .line 65
    .line 66
    add-int/lit8 v3, v3, -0x1

    .line 67
    .line 68
    iput v3, v4, Landroidx/recyclerview/widget/a;->b:I

    .line 69
    .line 70
    :cond_5
    :goto_3
    add-int/lit8 p1, p1, -0x1

    .line 71
    .line 72
    goto :goto_4

    .line 73
    :cond_6
    if-ge p1, v3, :cond_c

    .line 74
    .line 75
    if-ne p2, v2, :cond_7

    .line 76
    .line 77
    add-int/lit8 v3, v3, 0x1

    .line 78
    .line 79
    iput v3, v4, Landroidx/recyclerview/widget/a;->b:I

    .line 80
    .line 81
    add-int/lit8 v5, v5, 0x1

    .line 82
    .line 83
    iput v5, v4, Landroidx/recyclerview/widget/a;->d:I

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_7
    if-ne p2, v6, :cond_c

    .line 87
    .line 88
    add-int/lit8 v3, v3, -0x1

    .line 89
    .line 90
    iput v3, v4, Landroidx/recyclerview/widget/a;->b:I

    .line 91
    .line 92
    add-int/lit8 v5, v5, -0x1

    .line 93
    .line 94
    iput v5, v4, Landroidx/recyclerview/widget/a;->d:I

    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_8
    iget v3, v4, Landroidx/recyclerview/widget/a;->b:I

    .line 98
    .line 99
    if-gt v3, p1, :cond_a

    .line 100
    .line 101
    if-ne v5, v2, :cond_9

    .line 102
    .line 103
    iget v3, v4, Landroidx/recyclerview/widget/a;->d:I

    .line 104
    .line 105
    sub-int/2addr p1, v3

    .line 106
    goto :goto_4

    .line 107
    :cond_9
    if-ne v5, v6, :cond_c

    .line 108
    .line 109
    iget v3, v4, Landroidx/recyclerview/widget/a;->d:I

    .line 110
    .line 111
    add-int/2addr p1, v3

    .line 112
    goto :goto_4

    .line 113
    :cond_a
    if-ne p2, v2, :cond_b

    .line 114
    .line 115
    add-int/lit8 v3, v3, 0x1

    .line 116
    .line 117
    iput v3, v4, Landroidx/recyclerview/widget/a;->b:I

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_b
    if-ne p2, v6, :cond_c

    .line 121
    .line 122
    add-int/lit8 v3, v3, -0x1

    .line 123
    .line 124
    iput v3, v4, Landroidx/recyclerview/widget/a;->b:I

    .line 125
    .line 126
    :cond_c
    :goto_4
    add-int/lit8 v1, v1, -0x1

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_d
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    sub-int/2addr p2, v2

    .line 134
    :goto_5
    if-ltz p2, :cond_11

    .line 135
    .line 136
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    check-cast v1, Landroidx/recyclerview/widget/a;

    .line 141
    .line 142
    iget v2, v1, Landroidx/recyclerview/widget/a;->a:I

    .line 143
    .line 144
    iget-object v4, p0, Landroidx/recyclerview/widget/b;->a:Ll0/c;

    .line 145
    .line 146
    const/4 v5, 0x0

    .line 147
    if-ne v2, v3, :cond_f

    .line 148
    .line 149
    iget v2, v1, Landroidx/recyclerview/widget/a;->d:I

    .line 150
    .line 151
    iget v6, v1, Landroidx/recyclerview/widget/a;->b:I

    .line 152
    .line 153
    if-eq v2, v6, :cond_e

    .line 154
    .line 155
    if-gez v2, :cond_10

    .line 156
    .line 157
    :cond_e
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    iput-object v5, v1, Landroidx/recyclerview/widget/a;->c:Ljava/lang/Object;

    .line 161
    .line 162
    invoke-virtual {v4, v1}, Ll0/c;->c(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    goto :goto_6

    .line 166
    :cond_f
    iget v2, v1, Landroidx/recyclerview/widget/a;->d:I

    .line 167
    .line 168
    if-gtz v2, :cond_10

    .line 169
    .line 170
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    iput-object v5, v1, Landroidx/recyclerview/widget/a;->c:Ljava/lang/Object;

    .line 174
    .line 175
    invoke-virtual {v4, v1}, Ll0/c;->c(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    :cond_10
    :goto_6
    add-int/lit8 p2, p2, -0x1

    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_11
    return p1
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
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
.end method
