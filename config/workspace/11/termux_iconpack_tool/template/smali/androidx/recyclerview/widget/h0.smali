.class public final Landroidx/recyclerview/widget/h0;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final l:Ljava/lang/ThreadLocal;

.field public static final m:Landroidx/recyclerview/widget/s;


# instance fields
.field public final h:Ljava/util/ArrayList;

.field public i:J

.field public j:J

.field public final k:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/recyclerview/widget/h0;->l:Ljava/lang/ThreadLocal;

    .line 7
    .line 8
    new-instance v0, Landroidx/recyclerview/widget/s;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/s;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Landroidx/recyclerview/widget/h0;->m:Landroidx/recyclerview/widget/s;

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
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/recyclerview/widget/h0;->h:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/recyclerview/widget/h0;->k:Ljava/util/ArrayList;

    .line 17
    .line 18
    return-void
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

.method public static c(Landroidx/recyclerview/widget/RecyclerView;IJ)Landroidx/recyclerview/widget/i2;
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->mChildHelper:Landroidx/recyclerview/widget/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/k;->h()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v0, :cond_1

    .line 10
    .line 11
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->mChildHelper:Landroidx/recyclerview/widget/k;

    .line 12
    .line 13
    invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/k;->g(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-static {v3}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolderInt(Landroid/view/View;)Landroidx/recyclerview/widget/i2;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    iget v4, v3, Landroidx/recyclerview/widget/i2;->mPosition:I

    .line 22
    .line 23
    if-ne v4, p1, :cond_0

    .line 24
    .line 25
    invoke-virtual {v3}, Landroidx/recyclerview/widget/i2;->isInvalid()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-nez v3, :cond_0

    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0

    .line 33
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->mRecycler:Landroidx/recyclerview/widget/x1;

    .line 37
    .line 38
    const-wide v2, 0x7fffffffffffffffL

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    cmp-long v4, p2, v2

    .line 44
    .line 45
    if-nez v4, :cond_2

    .line 46
    .line 47
    :try_start_0
    invoke-static {}, Li0/p;->a()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    const-string v2, "RV Prefetch forced - needed next frame"

    .line 54
    .line 55
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :catchall_0
    move-exception p1

    .line 60
    goto :goto_3

    .line 61
    :cond_2
    :goto_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->onEnterLayoutOrScroll()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, p1, p2, p3}, Landroidx/recyclerview/widget/x1;->l(IJ)Landroidx/recyclerview/widget/i2;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-eqz p1, :cond_4

    .line 69
    .line 70
    invoke-virtual {p1}, Landroidx/recyclerview/widget/i2;->isBound()Z

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    if-eqz p2, :cond_3

    .line 75
    .line 76
    invoke-virtual {p1}, Landroidx/recyclerview/widget/i2;->isInvalid()Z

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    if-nez p2, :cond_3

    .line 81
    .line 82
    iget-object p2, p1, Landroidx/recyclerview/widget/i2;->itemView:Landroid/view/View;

    .line 83
    .line 84
    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/x1;->i(Landroid/view/View;)V

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    invoke-virtual {v0, p1, v1}, Landroidx/recyclerview/widget/x1;->a(Landroidx/recyclerview/widget/i2;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    .line 90
    .line 91
    :cond_4
    :goto_2
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->onExitLayoutOrScroll(Z)V

    .line 92
    .line 93
    .line 94
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 95
    .line 96
    .line 97
    return-object p1

    .line 98
    :goto_3
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->onExitLayoutOrScroll(Z)V

    .line 99
    .line 100
    .line 101
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 102
    .line 103
    .line 104
    throw p1
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
.end method


# virtual methods
.method public final a(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->sDebugAssertionsEnabled:Z

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/recyclerview/widget/h0;->h:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string p2, "attempting to post unregistered view!"

    .line 23
    .line 24
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    :goto_0
    iget-wide v0, p0, Landroidx/recyclerview/widget/h0;->i:J

    .line 29
    .line 30
    const-wide/16 v2, 0x0

    .line 31
    .line 32
    cmp-long v4, v0, v2

    .line 33
    .line 34
    if-nez v4, :cond_2

    .line 35
    .line 36
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    iput-wide v0, p0, Landroidx/recyclerview/widget/h0;->i:J

    .line 41
    .line 42
    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 43
    .line 44
    .line 45
    :cond_2
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->mPrefetchRegistry:Landroidx/recyclerview/widget/f0;

    .line 46
    .line 47
    iput p2, p1, Landroidx/recyclerview/widget/f0;->a:I

    .line 48
    .line 49
    iput p3, p1, Landroidx/recyclerview/widget/f0;->b:I

    .line 50
    .line 51
    return-void
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
.end method

.method public final b(J)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-wide/from16 v2, p1

    .line 4
    .line 5
    iget-object v0, v1, Landroidx/recyclerview/widget/h0;->h:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x0

    .line 14
    :goto_0
    if-ge v6, v4, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v8

    .line 20
    check-cast v8, Landroidx/recyclerview/widget/RecyclerView;

    .line 21
    .line 22
    invoke-virtual {v8}, Landroid/view/View;->getWindowVisibility()I

    .line 23
    .line 24
    .line 25
    move-result v9

    .line 26
    if-nez v9, :cond_0

    .line 27
    .line 28
    iget-object v9, v8, Landroidx/recyclerview/widget/RecyclerView;->mPrefetchRegistry:Landroidx/recyclerview/widget/f0;

    .line 29
    .line 30
    invoke-virtual {v9, v8, v5}, Landroidx/recyclerview/widget/f0;->b(Landroidx/recyclerview/widget/RecyclerView;Z)V

    .line 31
    .line 32
    .line 33
    iget-object v8, v8, Landroidx/recyclerview/widget/RecyclerView;->mPrefetchRegistry:Landroidx/recyclerview/widget/f0;

    .line 34
    .line 35
    iget v8, v8, Landroidx/recyclerview/widget/f0;->d:I

    .line 36
    .line 37
    add-int/2addr v7, v8

    .line 38
    :cond_0
    add-int/lit8 v6, v6, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget-object v6, v1, Landroidx/recyclerview/widget/h0;->k:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 44
    .line 45
    .line 46
    const/4 v7, 0x0

    .line 47
    const/4 v8, 0x0

    .line 48
    :goto_1
    if-ge v7, v4, :cond_6

    .line 49
    .line 50
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v10

    .line 54
    check-cast v10, Landroidx/recyclerview/widget/RecyclerView;

    .line 55
    .line 56
    invoke-virtual {v10}, Landroid/view/View;->getWindowVisibility()I

    .line 57
    .line 58
    .line 59
    move-result v11

    .line 60
    if-eqz v11, :cond_2

    .line 61
    .line 62
    goto :goto_5

    .line 63
    :cond_2
    iget-object v11, v10, Landroidx/recyclerview/widget/RecyclerView;->mPrefetchRegistry:Landroidx/recyclerview/widget/f0;

    .line 64
    .line 65
    iget v12, v11, Landroidx/recyclerview/widget/f0;->a:I

    .line 66
    .line 67
    invoke-static {v12}, Ljava/lang/Math;->abs(I)I

    .line 68
    .line 69
    .line 70
    move-result v12

    .line 71
    iget v13, v11, Landroidx/recyclerview/widget/f0;->b:I

    .line 72
    .line 73
    invoke-static {v13}, Ljava/lang/Math;->abs(I)I

    .line 74
    .line 75
    .line 76
    move-result v13

    .line 77
    add-int/2addr v13, v12

    .line 78
    const/4 v12, 0x0

    .line 79
    :goto_2
    iget v14, v11, Landroidx/recyclerview/widget/f0;->d:I

    .line 80
    .line 81
    mul-int/lit8 v14, v14, 0x2

    .line 82
    .line 83
    if-ge v12, v14, :cond_5

    .line 84
    .line 85
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 86
    .line 87
    .line 88
    move-result v14

    .line 89
    if-lt v8, v14, :cond_3

    .line 90
    .line 91
    new-instance v14, Landroidx/recyclerview/widget/g0;

    .line 92
    .line 93
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v6, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_3
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v14

    .line 104
    check-cast v14, Landroidx/recyclerview/widget/g0;

    .line 105
    .line 106
    :goto_3
    iget-object v15, v11, Landroidx/recyclerview/widget/f0;->c:[I

    .line 107
    .line 108
    add-int/lit8 v16, v12, 0x1

    .line 109
    .line 110
    aget v5, v15, v16

    .line 111
    .line 112
    if-gt v5, v13, :cond_4

    .line 113
    .line 114
    const/4 v9, 0x1

    .line 115
    goto :goto_4

    .line 116
    :cond_4
    const/4 v9, 0x0

    .line 117
    :goto_4
    iput-boolean v9, v14, Landroidx/recyclerview/widget/g0;->a:Z

    .line 118
    .line 119
    iput v13, v14, Landroidx/recyclerview/widget/g0;->b:I

    .line 120
    .line 121
    iput v5, v14, Landroidx/recyclerview/widget/g0;->c:I

    .line 122
    .line 123
    iput-object v10, v14, Landroidx/recyclerview/widget/g0;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 124
    .line 125
    aget v5, v15, v12

    .line 126
    .line 127
    iput v5, v14, Landroidx/recyclerview/widget/g0;->e:I

    .line 128
    .line 129
    add-int/lit8 v8, v8, 0x1

    .line 130
    .line 131
    add-int/lit8 v12, v12, 0x2

    .line 132
    .line 133
    const/4 v5, 0x0

    .line 134
    goto :goto_2

    .line 135
    :cond_5
    :goto_5
    add-int/lit8 v7, v7, 0x1

    .line 136
    .line 137
    const/4 v5, 0x0

    .line 138
    goto :goto_1

    .line 139
    :cond_6
    sget-object v0, Landroidx/recyclerview/widget/h0;->m:Landroidx/recyclerview/widget/s;

    .line 140
    .line 141
    invoke-static {v6, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 142
    .line 143
    .line 144
    const/4 v0, 0x0

    .line 145
    :goto_6
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    if-ge v0, v4, :cond_e

    .line 150
    .line 151
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    check-cast v4, Landroidx/recyclerview/widget/g0;

    .line 156
    .line 157
    iget-object v5, v4, Landroidx/recyclerview/widget/g0;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 158
    .line 159
    if-nez v5, :cond_7

    .line 160
    .line 161
    goto/16 :goto_d

    .line 162
    .line 163
    :cond_7
    iget-boolean v7, v4, Landroidx/recyclerview/widget/g0;->a:Z

    .line 164
    .line 165
    const-wide v8, 0x7fffffffffffffffL

    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    if-eqz v7, :cond_8

    .line 171
    .line 172
    move-wide v10, v8

    .line 173
    goto :goto_7

    .line 174
    :cond_8
    move-wide v10, v2

    .line 175
    :goto_7
    iget v7, v4, Landroidx/recyclerview/widget/g0;->e:I

    .line 176
    .line 177
    invoke-static {v5, v7, v10, v11}, Landroidx/recyclerview/widget/h0;->c(Landroidx/recyclerview/widget/RecyclerView;IJ)Landroidx/recyclerview/widget/i2;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    if-eqz v5, :cond_9

    .line 182
    .line 183
    iget-object v7, v5, Landroidx/recyclerview/widget/i2;->mNestedRecyclerView:Ljava/lang/ref/WeakReference;

    .line 184
    .line 185
    if-eqz v7, :cond_9

    .line 186
    .line 187
    invoke-virtual {v5}, Landroidx/recyclerview/widget/i2;->isBound()Z

    .line 188
    .line 189
    .line 190
    move-result v7

    .line 191
    if-eqz v7, :cond_9

    .line 192
    .line 193
    invoke-virtual {v5}, Landroidx/recyclerview/widget/i2;->isInvalid()Z

    .line 194
    .line 195
    .line 196
    move-result v7

    .line 197
    if-nez v7, :cond_9

    .line 198
    .line 199
    iget-object v5, v5, Landroidx/recyclerview/widget/i2;->mNestedRecyclerView:Ljava/lang/ref/WeakReference;

    .line 200
    .line 201
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    check-cast v5, Landroidx/recyclerview/widget/RecyclerView;

    .line 206
    .line 207
    if-nez v5, :cond_a

    .line 208
    .line 209
    :cond_9
    const/4 v10, 0x1

    .line 210
    goto :goto_a

    .line 211
    :cond_a
    iget-boolean v7, v5, Landroidx/recyclerview/widget/RecyclerView;->mDataSetHasChangedAfterLayout:Z

    .line 212
    .line 213
    if-eqz v7, :cond_b

    .line 214
    .line 215
    iget-object v7, v5, Landroidx/recyclerview/widget/RecyclerView;->mChildHelper:Landroidx/recyclerview/widget/k;

    .line 216
    .line 217
    invoke-virtual {v7}, Landroidx/recyclerview/widget/k;->h()I

    .line 218
    .line 219
    .line 220
    move-result v7

    .line 221
    if-eqz v7, :cond_b

    .line 222
    .line 223
    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView;->removeAndRecycleViews()V

    .line 224
    .line 225
    .line 226
    :cond_b
    iget-object v7, v5, Landroidx/recyclerview/widget/RecyclerView;->mPrefetchRegistry:Landroidx/recyclerview/widget/f0;

    .line 227
    .line 228
    const/4 v10, 0x1

    .line 229
    invoke-virtual {v7, v5, v10}, Landroidx/recyclerview/widget/f0;->b(Landroidx/recyclerview/widget/RecyclerView;Z)V

    .line 230
    .line 231
    .line 232
    iget v10, v7, Landroidx/recyclerview/widget/f0;->d:I

    .line 233
    .line 234
    if-eqz v10, :cond_9

    .line 235
    .line 236
    cmp-long v10, v2, v8

    .line 237
    .line 238
    if-nez v10, :cond_c

    .line 239
    .line 240
    :try_start_0
    const-string v8, "RV Nested Prefetch"

    .line 241
    .line 242
    goto :goto_8

    .line 243
    :catchall_0
    move-exception v0

    .line 244
    goto :goto_b

    .line 245
    :cond_c
    const-string v8, "RV Nested Prefetch forced - needed next frame"

    .line 246
    .line 247
    :goto_8
    invoke-static {v8}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    iget-object v8, v5, Landroidx/recyclerview/widget/RecyclerView;->mState:Landroidx/recyclerview/widget/e2;

    .line 251
    .line 252
    iget-object v9, v5, Landroidx/recyclerview/widget/RecyclerView;->mAdapter:Landroidx/recyclerview/widget/c1;

    .line 253
    .line 254
    const/4 v10, 0x1

    .line 255
    iput v10, v8, Landroidx/recyclerview/widget/e2;->d:I

    .line 256
    .line 257
    invoke-virtual {v9}, Landroidx/recyclerview/widget/c1;->getItemCount()I

    .line 258
    .line 259
    .line 260
    move-result v9

    .line 261
    iput v9, v8, Landroidx/recyclerview/widget/e2;->e:I

    .line 262
    .line 263
    const/4 v9, 0x0

    .line 264
    iput-boolean v9, v8, Landroidx/recyclerview/widget/e2;->g:Z

    .line 265
    .line 266
    iput-boolean v9, v8, Landroidx/recyclerview/widget/e2;->h:Z

    .line 267
    .line 268
    iput-boolean v9, v8, Landroidx/recyclerview/widget/e2;->i:Z

    .line 269
    .line 270
    const/4 v9, 0x0

    .line 271
    :goto_9
    iget v8, v7, Landroidx/recyclerview/widget/f0;->d:I

    .line 272
    .line 273
    mul-int/lit8 v8, v8, 0x2

    .line 274
    .line 275
    if-ge v9, v8, :cond_d

    .line 276
    .line 277
    iget-object v8, v7, Landroidx/recyclerview/widget/f0;->c:[I

    .line 278
    .line 279
    aget v8, v8, v9

    .line 280
    .line 281
    invoke-static {v5, v8, v2, v3}, Landroidx/recyclerview/widget/h0;->c(Landroidx/recyclerview/widget/RecyclerView;IJ)Landroidx/recyclerview/widget/i2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 282
    .line 283
    .line 284
    add-int/lit8 v9, v9, 0x2

    .line 285
    .line 286
    goto :goto_9

    .line 287
    :cond_d
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 288
    .line 289
    .line 290
    :goto_a
    const/4 v9, 0x0

    .line 291
    goto :goto_c

    .line 292
    :goto_b
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 293
    .line 294
    .line 295
    throw v0

    .line 296
    :goto_c
    iput-boolean v9, v4, Landroidx/recyclerview/widget/g0;->a:Z

    .line 297
    .line 298
    iput v9, v4, Landroidx/recyclerview/widget/g0;->b:I

    .line 299
    .line 300
    iput v9, v4, Landroidx/recyclerview/widget/g0;->c:I

    .line 301
    .line 302
    const/4 v5, 0x0

    .line 303
    iput-object v5, v4, Landroidx/recyclerview/widget/g0;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 304
    .line 305
    iput v9, v4, Landroidx/recyclerview/widget/g0;->e:I

    .line 306
    .line 307
    add-int/lit8 v0, v0, 0x1

    .line 308
    .line 309
    goto/16 :goto_6

    .line 310
    .line 311
    :cond_e
    :goto_d
    return-void
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

.method public final run()V
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/h0;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    :try_start_0
    const-string v3, "RV Prefetch"

    .line 6
    .line 7
    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    :goto_0
    iput-wide v1, p0, Landroidx/recyclerview/widget/h0;->i:J

    .line 17
    .line 18
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const/4 v4, 0x0

    .line 27
    move-wide v5, v1

    .line 28
    :goto_1
    if-ge v4, v3, :cond_2

    .line 29
    .line 30
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    check-cast v7, Landroidx/recyclerview/widget/RecyclerView;

    .line 35
    .line 36
    invoke-virtual {v7}, Landroid/view/View;->getWindowVisibility()I

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    if-nez v8, :cond_1

    .line 41
    .line 42
    invoke-virtual {v7}, Landroid/view/View;->getDrawingTime()J

    .line 43
    .line 44
    .line 45
    move-result-wide v7

    .line 46
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 47
    .line 48
    .line 49
    move-result-wide v5

    .line 50
    goto :goto_2

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    goto :goto_3

    .line 53
    :cond_1
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    cmp-long v0, v5, v1

    .line 57
    .line 58
    if-nez v0, :cond_3

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 62
    .line 63
    invoke-virtual {v0, v5, v6}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 64
    .line 65
    .line 66
    move-result-wide v3

    .line 67
    iget-wide v5, p0, Landroidx/recyclerview/widget/h0;->j:J

    .line 68
    .line 69
    add-long/2addr v3, v5

    .line 70
    invoke-virtual {p0, v3, v4}, Landroidx/recyclerview/widget/h0;->b(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :goto_3
    iput-wide v1, p0, Landroidx/recyclerview/widget/h0;->i:J

    .line 75
    .line 76
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 77
    .line 78
    .line 79
    throw v0
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
