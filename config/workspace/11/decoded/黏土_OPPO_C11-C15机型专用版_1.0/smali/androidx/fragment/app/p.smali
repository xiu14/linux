.class public final Landroidx/fragment/app/p;
.super Landroidx/fragment/app/g2;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final c:Ljava/util/ArrayList;

.field public final d:Landroidx/fragment/app/h2;

.field public final e:Landroidx/fragment/app/h2;

.field public final f:Landroidx/fragment/app/c2;

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/util/ArrayList;

.field public final i:Ljava/util/ArrayList;

.field public final j:Lq/f;

.field public final k:Ljava/util/ArrayList;

.field public final l:Ljava/util/ArrayList;

.field public final m:Lq/f;

.field public final n:Lq/f;

.field public final o:Z

.field public final p:Li0/e;

.field public q:Ljava/lang/Object;

.field public r:Z


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Landroidx/fragment/app/h2;Landroidx/fragment/app/h2;Landroidx/fragment/app/c2;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;Lq/f;Ljava/util/ArrayList;Ljava/util/ArrayList;Lq/f;Lq/f;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/fragment/app/p;->c:Ljava/util/ArrayList;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/fragment/app/p;->d:Landroidx/fragment/app/h2;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/fragment/app/p;->e:Landroidx/fragment/app/h2;

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/fragment/app/p;->f:Landroidx/fragment/app/c2;

    .line 11
    .line 12
    iput-object p5, p0, Landroidx/fragment/app/p;->g:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p6, p0, Landroidx/fragment/app/p;->h:Ljava/util/ArrayList;

    .line 15
    .line 16
    iput-object p7, p0, Landroidx/fragment/app/p;->i:Ljava/util/ArrayList;

    .line 17
    .line 18
    iput-object p8, p0, Landroidx/fragment/app/p;->j:Lq/f;

    .line 19
    .line 20
    iput-object p9, p0, Landroidx/fragment/app/p;->k:Ljava/util/ArrayList;

    .line 21
    .line 22
    iput-object p10, p0, Landroidx/fragment/app/p;->l:Ljava/util/ArrayList;

    .line 23
    .line 24
    iput-object p11, p0, Landroidx/fragment/app/p;->m:Lq/f;

    .line 25
    .line 26
    iput-object p12, p0, Landroidx/fragment/app/p;->n:Lq/f;

    .line 27
    .line 28
    iput-boolean p13, p0, Landroidx/fragment/app/p;->o:Z

    .line 29
    .line 30
    new-instance p1, Li0/e;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Landroidx/fragment/app/p;->p:Li0/e;

    .line 36
    .line 37
    return-void
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
.end method

.method public static f(Landroid/view/View;Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Landroid/view/ViewGroup;

    .line 7
    .line 8
    invoke-static {v0}, Lm0/b1;->b(Landroid/view/ViewGroup;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_3

    .line 19
    .line 20
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    const/4 v1, 0x0

    .line 29
    :goto_0
    if-ge v1, p0, :cond_3

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_1

    .line 40
    .line 41
    invoke-static {v2, p1}, Landroidx/fragment/app/p;->f(Landroid/view/View;Ljava/util/ArrayList;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    :cond_3
    return-void
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
.method public final a()Z
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/p;->f:Landroidx/fragment/app/c2;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/c2;->l()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_3

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/fragment/app/p;->c:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/4 v4, 0x0

    .line 24
    :goto_0
    if-ge v4, v3, :cond_1

    .line 25
    .line 26
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    add-int/lit8 v4, v4, 0x1

    .line 31
    .line 32
    check-cast v5, Landroidx/fragment/app/q;

    .line 33
    .line 34
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 35
    .line 36
    const/16 v7, 0x22

    .line 37
    .line 38
    if-lt v6, v7, :cond_3

    .line 39
    .line 40
    iget-object v5, v5, Landroidx/fragment/app/q;->b:Ljava/lang/Object;

    .line 41
    .line 42
    if-eqz v5, :cond_3

    .line 43
    .line 44
    invoke-virtual {v0, v5}, Landroidx/fragment/app/c2;->m(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-eqz v5, :cond_3

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    :goto_1
    iget-object v1, p0, Landroidx/fragment/app/p;->g:Ljava/lang/Object;

    .line 52
    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Landroidx/fragment/app/c2;->m(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    :cond_2
    const/4 v0, 0x1

    .line 62
    return v0

    .line 63
    :cond_3
    return v2
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
.end method

.method public final b(Landroid/view/ViewGroup;)V
    .locals 1

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Landroidx/fragment/app/p;->p:Li0/e;

    .line 7
    .line 8
    invoke-virtual {p1}, Li0/e;->a()V

    .line 9
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final c(Landroid/view/ViewGroup;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "container"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/view/View;->isLaidOut()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    iget-object v4, v0, Landroidx/fragment/app/p;->c:Ljava/util/ArrayList;

    .line 16
    .line 17
    const/4 v5, 0x2

    .line 18
    const-string v6, "FragmentManager"

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    iget-boolean v2, v0, Landroidx/fragment/app/p;->r:Z

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    :cond_0
    const/16 v16, 0x2

    .line 27
    .line 28
    goto/16 :goto_2

    .line 29
    .line 30
    :cond_1
    iget-object v2, v0, Landroidx/fragment/app/p;->q:Ljava/lang/Object;

    .line 31
    .line 32
    const-string v7, " to "

    .line 33
    .line 34
    iget-object v8, v0, Landroidx/fragment/app/p;->f:Landroidx/fragment/app/c2;

    .line 35
    .line 36
    iget-object v9, v0, Landroidx/fragment/app/p;->e:Landroidx/fragment/app/h2;

    .line 37
    .line 38
    iget-object v10, v0, Landroidx/fragment/app/p;->d:Landroidx/fragment/app/h2;

    .line 39
    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    invoke-virtual {v8, v2}, Landroidx/fragment/app/c2;->c(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v5}, Landroidx/fragment/app/j1;->K(I)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_5

    .line 50
    .line 51
    new-instance v1, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const-string v2, "Ending execution of operations from "

    .line 54
    .line 55
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-static {v6, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_2
    invoke-virtual {v0, v1, v9, v10}, Landroidx/fragment/app/p;->g(Landroid/view/ViewGroup;Landroidx/fragment/app/h2;Landroidx/fragment/app/h2;)Lp4/f;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    iget-object v11, v2, Lp4/f;->h:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v11, Ljava/util/ArrayList;

    .line 82
    .line 83
    iget-object v2, v2, Lp4/f;->i:Ljava/lang/Object;

    .line 84
    .line 85
    new-instance v12, Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-static {v4}, Lq4/k;->j0(Ljava/lang/Iterable;)I

    .line 88
    .line 89
    .line 90
    move-result v13

    .line 91
    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 95
    .line 96
    .line 97
    move-result v13

    .line 98
    const/4 v14, 0x0

    .line 99
    :goto_0
    if-ge v14, v13, :cond_3

    .line 100
    .line 101
    invoke-virtual {v4, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v15

    .line 105
    add-int/lit8 v14, v14, 0x1

    .line 106
    .line 107
    check-cast v15, Landroidx/fragment/app/q;

    .line 108
    .line 109
    iget-object v15, v15, Landroidx/fragment/app/k;->a:Landroidx/fragment/app/h2;

    .line 110
    .line 111
    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_3
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    :goto_1
    if-ge v3, v4, :cond_4

    .line 120
    .line 121
    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v13

    .line 125
    add-int/lit8 v3, v3, 0x1

    .line 126
    .line 127
    check-cast v13, Landroidx/fragment/app/h2;

    .line 128
    .line 129
    iget-object v14, v13, Landroidx/fragment/app/h2;->c:Landroidx/fragment/app/l0;

    .line 130
    .line 131
    new-instance v15, Landroidx/fragment/app/l;

    .line 132
    .line 133
    const/16 v16, 0x2

    .line 134
    .line 135
    const/4 v5, 0x1

    .line 136
    invoke-direct {v15, v13, v0, v5}, Landroidx/fragment/app/l;-><init>(Landroidx/fragment/app/h2;Landroidx/fragment/app/p;I)V

    .line 137
    .line 138
    .line 139
    iget-object v5, v0, Landroidx/fragment/app/p;->p:Li0/e;

    .line 140
    .line 141
    invoke-virtual {v8, v14, v2, v5, v15}, Landroidx/fragment/app/c2;->u(Landroidx/fragment/app/l0;Ljava/lang/Object;Li0/e;Ljava/lang/Runnable;)V

    .line 142
    .line 143
    .line 144
    const/4 v5, 0x2

    .line 145
    goto :goto_1

    .line 146
    :cond_4
    const/16 v16, 0x2

    .line 147
    .line 148
    new-instance v3, Landroidx/fragment/app/n;

    .line 149
    .line 150
    invoke-direct {v3, v0, v1, v2}, Landroidx/fragment/app/n;-><init>(Landroidx/fragment/app/p;Landroid/view/ViewGroup;Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, v11, v1, v3}, Landroidx/fragment/app/p;->i(Ljava/util/ArrayList;Landroid/view/ViewGroup;Ld5/a;)V

    .line 154
    .line 155
    .line 156
    invoke-static/range {v16 .. v16}, Landroidx/fragment/app/j1;->K(I)Z

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    if-eqz v1, :cond_5

    .line 161
    .line 162
    new-instance v1, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    const-string v2, "Completed executing operations from "

    .line 165
    .line 166
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-static {v6, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 183
    .line 184
    .line 185
    :cond_5
    return-void

    .line 186
    :goto_2
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    const/4 v5, 0x0

    .line 191
    :goto_3
    if-ge v5, v2, :cond_8

    .line 192
    .line 193
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v7

    .line 197
    add-int/lit8 v5, v5, 0x1

    .line 198
    .line 199
    check-cast v7, Landroidx/fragment/app/q;

    .line 200
    .line 201
    iget-object v8, v7, Landroidx/fragment/app/k;->a:Landroidx/fragment/app/h2;

    .line 202
    .line 203
    invoke-static/range {v16 .. v16}, Landroidx/fragment/app/j1;->K(I)Z

    .line 204
    .line 205
    .line 206
    move-result v9

    .line 207
    if-eqz v9, :cond_7

    .line 208
    .line 209
    iget-boolean v9, v0, Landroidx/fragment/app/p;->r:Z

    .line 210
    .line 211
    if-eqz v9, :cond_6

    .line 212
    .line 213
    new-instance v9, Ljava/lang/StringBuilder;

    .line 214
    .line 215
    const-string v10, "SpecialEffectsController: TransitionSeekController was not created. Completing operation "

    .line 216
    .line 217
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v8

    .line 227
    invoke-static {v6, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 228
    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_6
    new-instance v9, Ljava/lang/StringBuilder;

    .line 232
    .line 233
    const-string v10, "SpecialEffectsController: Container "

    .line 234
    .line 235
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    const-string v10, " has not been laid out. Completing operation "

    .line 242
    .line 243
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v8

    .line 253
    invoke-static {v6, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 254
    .line 255
    .line 256
    :cond_7
    :goto_4
    iget-object v7, v7, Landroidx/fragment/app/k;->a:Landroidx/fragment/app/h2;

    .line 257
    .line 258
    invoke-virtual {v7, v0}, Landroidx/fragment/app/h2;->c(Landroidx/fragment/app/g2;)V

    .line 259
    .line 260
    .line 261
    goto :goto_3

    .line 262
    :cond_8
    iput-boolean v3, v0, Landroidx/fragment/app/p;->r:Z

    .line 263
    .line 264
    return-void
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

.method public final d(Lb/b;Landroid/view/ViewGroup;)V
    .locals 1

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Landroidx/fragment/app/p;->q:Ljava/lang/Object;

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/fragment/app/p;->f:Landroidx/fragment/app/c2;

    .line 11
    .line 12
    iget p1, p1, Lb/b;->c:F

    .line 13
    .line 14
    invoke-virtual {v0, p2, p1}, Landroidx/fragment/app/c2;->r(Ljava/lang/Object;F)V

    .line 15
    .line 16
    .line 17
    :cond_0
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

.method public final e(Landroid/view/ViewGroup;)V
    .locals 10

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->isLaidOut()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    const-string v2, "FragmentManager"

    .line 12
    .line 13
    iget-object v3, p0, Landroidx/fragment/app/p;->c:Ljava/util/ArrayList;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    :cond_0
    :goto_0
    if-ge v1, v0, :cond_5

    .line 22
    .line 23
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    check-cast v4, Landroidx/fragment/app/q;

    .line 30
    .line 31
    iget-object v4, v4, Landroidx/fragment/app/k;->a:Landroidx/fragment/app/h2;

    .line 32
    .line 33
    const/4 v5, 0x2

    .line 34
    invoke-static {v5}, Landroidx/fragment/app/j1;->K(I)Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-eqz v5, :cond_0

    .line 39
    .line 40
    new-instance v5, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v6, "SpecialEffectsController: Container "

    .line 43
    .line 44
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v6, " has not been laid out. Skipping onStart for operation "

    .line 51
    .line 52
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-static {v2, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/p;->h()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-object v4, p0, Landroidx/fragment/app/p;->e:Landroidx/fragment/app/h2;

    .line 71
    .line 72
    iget-object v5, p0, Landroidx/fragment/app/p;->d:Landroidx/fragment/app/h2;

    .line 73
    .line 74
    if-eqz v0, :cond_2

    .line 75
    .line 76
    iget-object v0, p0, Landroidx/fragment/app/p;->g:Ljava/lang/Object;

    .line 77
    .line 78
    if-eqz v0, :cond_2

    .line 79
    .line 80
    invoke-virtual {p0}, Landroidx/fragment/app/p;->a()Z

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    if-nez v6, :cond_2

    .line 85
    .line 86
    new-instance v6, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-string v7, "Ignoring shared elements transition "

    .line 89
    .line 90
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v0, " between "

    .line 97
    .line 98
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v0, " and "

    .line 105
    .line 106
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v0, " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed."

    .line 113
    .line 114
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-static {v2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 122
    .line 123
    .line 124
    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/p;->a()Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-eqz v0, :cond_5

    .line 129
    .line 130
    invoke-virtual {p0}, Landroidx/fragment/app/p;->h()Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-eqz v0, :cond_5

    .line 135
    .line 136
    new-instance v0, Lkotlin/jvm/internal/o;

    .line 137
    .line 138
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, p1, v4, v5}, Landroidx/fragment/app/p;->g(Landroid/view/ViewGroup;Landroidx/fragment/app/h2;Landroidx/fragment/app/h2;)Lp4/f;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    iget-object v4, v2, Lp4/f;->h:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v4, Ljava/util/ArrayList;

    .line 148
    .line 149
    iget-object v2, v2, Lp4/f;->i:Ljava/lang/Object;

    .line 150
    .line 151
    new-instance v5, Ljava/util/ArrayList;

    .line 152
    .line 153
    invoke-static {v3}, Lq4/k;->j0(Ljava/lang/Iterable;)I

    .line 154
    .line 155
    .line 156
    move-result v6

    .line 157
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 161
    .line 162
    .line 163
    move-result v6

    .line 164
    const/4 v7, 0x0

    .line 165
    :goto_1
    if-ge v7, v6, :cond_3

    .line 166
    .line 167
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v8

    .line 171
    add-int/lit8 v7, v7, 0x1

    .line 172
    .line 173
    check-cast v8, Landroidx/fragment/app/q;

    .line 174
    .line 175
    iget-object v8, v8, Landroidx/fragment/app/k;->a:Landroidx/fragment/app/h2;

    .line 176
    .line 177
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_3
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    :goto_2
    if-ge v1, v3, :cond_4

    .line 186
    .line 187
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    add-int/lit8 v1, v1, 0x1

    .line 192
    .line 193
    check-cast v6, Landroidx/fragment/app/h2;

    .line 194
    .line 195
    new-instance v7, Landroidx/fragment/app/z;

    .line 196
    .line 197
    const/4 v8, 0x1

    .line 198
    invoke-direct {v7, v8, v0}, Landroidx/fragment/app/z;-><init>(ILjava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    iget-object v8, v6, Landroidx/fragment/app/h2;->c:Landroidx/fragment/app/l0;

    .line 202
    .line 203
    new-instance v8, Landroidx/fragment/app/l;

    .line 204
    .line 205
    const/4 v9, 0x0

    .line 206
    invoke-direct {v8, v6, p0, v9}, Landroidx/fragment/app/l;-><init>(Landroidx/fragment/app/h2;Landroidx/fragment/app/p;I)V

    .line 207
    .line 208
    .line 209
    iget-object v6, p0, Landroidx/fragment/app/p;->f:Landroidx/fragment/app/c2;

    .line 210
    .line 211
    iget-object v9, p0, Landroidx/fragment/app/p;->p:Li0/e;

    .line 212
    .line 213
    invoke-virtual {v6, v2, v9, v7, v8}, Landroidx/fragment/app/c2;->v(Ljava/lang/Object;Li0/e;Landroidx/fragment/app/z;Ljava/lang/Runnable;)V

    .line 214
    .line 215
    .line 216
    goto :goto_2

    .line 217
    :cond_4
    new-instance v1, Landroidx/fragment/app/o;

    .line 218
    .line 219
    invoke-direct {v1, p0, p1, v2, v0}, Landroidx/fragment/app/o;-><init>(Landroidx/fragment/app/p;Landroid/view/ViewGroup;Ljava/lang/Object;Lkotlin/jvm/internal/o;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {p0, v4, p1, v1}, Landroidx/fragment/app/p;->i(Ljava/util/ArrayList;Landroid/view/ViewGroup;Ld5/a;)V

    .line 223
    .line 224
    .line 225
    :cond_5
    return-void
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

.method public final g(Landroid/view/ViewGroup;Landroidx/fragment/app/h2;Landroidx/fragment/app/h2;)Lp4/f;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    new-instance v4, Landroid/view/View;

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    invoke-direct {v4, v5}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 16
    .line 17
    .line 18
    new-instance v5, Landroid/graphics/Rect;

    .line 19
    .line 20
    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    .line 21
    .line 22
    .line 23
    iget-object v6, v0, Landroidx/fragment/app/p;->c:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    const/4 v10, 0x0

    .line 30
    const/4 v11, 0x0

    .line 31
    const/4 v12, 0x0

    .line 32
    :goto_0
    iget-object v13, v0, Landroidx/fragment/app/p;->i:Ljava/util/ArrayList;

    .line 33
    .line 34
    iget-object v15, v0, Landroidx/fragment/app/p;->h:Ljava/util/ArrayList;

    .line 35
    .line 36
    iget-object v8, v0, Landroidx/fragment/app/p;->g:Ljava/lang/Object;

    .line 37
    .line 38
    iget-object v9, v0, Landroidx/fragment/app/p;->f:Landroidx/fragment/app/c2;

    .line 39
    .line 40
    if-ge v12, v7, :cond_4

    .line 41
    .line 42
    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v16

    .line 46
    add-int/lit8 v12, v12, 0x1

    .line 47
    .line 48
    move-object/from16 v14, v16

    .line 49
    .line 50
    check-cast v14, Landroidx/fragment/app/q;

    .line 51
    .line 52
    iget-object v14, v14, Landroidx/fragment/app/q;->d:Ljava/lang/Object;

    .line 53
    .line 54
    if-eqz v14, :cond_3

    .line 55
    .line 56
    if-eqz v3, :cond_3

    .line 57
    .line 58
    if-eqz v2, :cond_3

    .line 59
    .line 60
    iget-object v14, v0, Landroidx/fragment/app/p;->j:Lq/f;

    .line 61
    .line 62
    invoke-virtual {v14}, Lq/k;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v14

    .line 66
    if-nez v14, :cond_3

    .line 67
    .line 68
    if-eqz v8, :cond_3

    .line 69
    .line 70
    iget-object v14, v2, Landroidx/fragment/app/h2;->c:Landroidx/fragment/app/l0;

    .line 71
    .line 72
    move/from16 v20, v7

    .line 73
    .line 74
    iget-object v7, v3, Landroidx/fragment/app/h2;->c:Landroidx/fragment/app/l0;

    .line 75
    .line 76
    sget-object v16, Landroidx/fragment/app/v1;->a:Landroidx/fragment/app/a2;

    .line 77
    .line 78
    move/from16 v16, v11

    .line 79
    .line 80
    const-string v11, "inFragment"

    .line 81
    .line 82
    invoke-static {v14, v11}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    const-string v11, "outFragment"

    .line 86
    .line 87
    invoke-static {v7, v11}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    iget-boolean v11, v0, Landroidx/fragment/app/p;->o:Z

    .line 91
    .line 92
    if-eqz v11, :cond_0

    .line 93
    .line 94
    invoke-virtual {v7}, Landroidx/fragment/app/l0;->getEnterTransitionCallback()Lb0/h0;

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_0
    invoke-virtual {v14}, Landroidx/fragment/app/l0;->getEnterTransitionCallback()Lb0/h0;

    .line 99
    .line 100
    .line 101
    :goto_1
    new-instance v7, La1/o;

    .line 102
    .line 103
    const/4 v11, 0x2

    .line 104
    invoke-direct {v7, v2, v3, v0, v11}, La1/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 105
    .line 106
    .line 107
    invoke-static {v1, v7}, Lm0/z;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 108
    .line 109
    .line 110
    iget-object v7, v0, Landroidx/fragment/app/p;->m:Lq/f;

    .line 111
    .line 112
    invoke-virtual {v7}, Lq/f;->values()Ljava/util/Collection;

    .line 113
    .line 114
    .line 115
    move-result-object v11

    .line 116
    invoke-virtual {v15, v11}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 117
    .line 118
    .line 119
    iget-object v11, v0, Landroidx/fragment/app/p;->l:Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    .line 122
    .line 123
    .line 124
    move-result v14

    .line 125
    if-nez v14, :cond_1

    .line 126
    .line 127
    const/4 v14, 0x0

    .line 128
    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v10

    .line 132
    const-string v11, "exitingNames[0]"

    .line 133
    .line 134
    invoke-static {v10, v11}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    check-cast v10, Ljava/lang/String;

    .line 138
    .line 139
    invoke-virtual {v7, v10}, Lq/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    check-cast v7, Landroid/view/View;

    .line 144
    .line 145
    invoke-virtual {v9, v7, v8}, Landroidx/fragment/app/c2;->s(Landroid/view/View;Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    move-object v10, v7

    .line 149
    :cond_1
    iget-object v7, v0, Landroidx/fragment/app/p;->n:Lq/f;

    .line 150
    .line 151
    invoke-virtual {v7}, Lq/f;->values()Ljava/util/Collection;

    .line 152
    .line 153
    .line 154
    move-result-object v11

    .line 155
    invoke-virtual {v13, v11}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 156
    .line 157
    .line 158
    iget-object v11, v0, Landroidx/fragment/app/p;->k:Ljava/util/ArrayList;

    .line 159
    .line 160
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    .line 161
    .line 162
    .line 163
    move-result v14

    .line 164
    if-nez v14, :cond_2

    .line 165
    .line 166
    const/4 v14, 0x0

    .line 167
    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v11

    .line 171
    const-string v14, "enteringNames[0]"

    .line 172
    .line 173
    invoke-static {v11, v14}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    check-cast v11, Ljava/lang/String;

    .line 177
    .line 178
    invoke-virtual {v7, v11}, Lq/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    check-cast v7, Landroid/view/View;

    .line 183
    .line 184
    if-eqz v7, :cond_2

    .line 185
    .line 186
    new-instance v11, Landroidx/fragment/app/m;

    .line 187
    .line 188
    invoke-direct {v11, v9, v7, v5}, Landroidx/fragment/app/m;-><init>(Landroidx/fragment/app/c2;Landroid/view/View;Landroid/graphics/Rect;)V

    .line 189
    .line 190
    .line 191
    invoke-static {v1, v11}, Lm0/z;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 192
    .line 193
    .line 194
    const/4 v7, 0x1

    .line 195
    const/4 v11, 0x1

    .line 196
    goto :goto_2

    .line 197
    :cond_2
    move/from16 v11, v16

    .line 198
    .line 199
    :goto_2
    invoke-virtual {v9, v8, v4, v15}, Landroidx/fragment/app/c2;->w(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    .line 200
    .line 201
    .line 202
    const/4 v15, 0x0

    .line 203
    const/16 v16, 0x0

    .line 204
    .line 205
    iget-object v14, v0, Landroidx/fragment/app/p;->g:Ljava/lang/Object;

    .line 206
    .line 207
    move-object/from16 v17, v14

    .line 208
    .line 209
    move-object/from16 v18, v13

    .line 210
    .line 211
    move-object v13, v9

    .line 212
    invoke-virtual/range {v13 .. v18}, Landroidx/fragment/app/c2;->q(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 213
    .line 214
    .line 215
    :goto_3
    move/from16 v7, v20

    .line 216
    .line 217
    goto/16 :goto_0

    .line 218
    .line 219
    :cond_3
    move/from16 v20, v7

    .line 220
    .line 221
    move/from16 v16, v11

    .line 222
    .line 223
    move/from16 v11, v16

    .line 224
    .line 225
    goto :goto_3

    .line 226
    :cond_4
    move/from16 v16, v11

    .line 227
    .line 228
    move-object/from16 v18, v13

    .line 229
    .line 230
    move-object v13, v9

    .line 231
    new-instance v7, Ljava/util/ArrayList;

    .line 232
    .line 233
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 237
    .line 238
    .line 239
    move-result v9

    .line 240
    const/4 v11, 0x0

    .line 241
    const/4 v12, 0x0

    .line 242
    const/4 v14, 0x0

    .line 243
    :goto_4
    const-string v0, "FragmentManager"

    .line 244
    .line 245
    if-ge v14, v9, :cond_f

    .line 246
    .line 247
    invoke-virtual {v6, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v19

    .line 251
    add-int/lit8 v14, v14, 0x1

    .line 252
    .line 253
    move-object/from16 v26, v6

    .line 254
    .line 255
    move-object/from16 v6, v19

    .line 256
    .line 257
    check-cast v6, Landroidx/fragment/app/q;

    .line 258
    .line 259
    move/from16 v19, v9

    .line 260
    .line 261
    iget-object v9, v6, Landroidx/fragment/app/k;->a:Landroidx/fragment/app/h2;

    .line 262
    .line 263
    move/from16 v27, v14

    .line 264
    .line 265
    iget-object v14, v6, Landroidx/fragment/app/q;->b:Ljava/lang/Object;

    .line 266
    .line 267
    invoke-virtual {v13, v14}, Landroidx/fragment/app/c2;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v14

    .line 271
    if-eqz v14, :cond_e

    .line 272
    .line 273
    move-object/from16 v28, v15

    .line 274
    .line 275
    new-instance v15, Ljava/util/ArrayList;

    .line 276
    .line 277
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 278
    .line 279
    .line 280
    move-object/from16 v29, v8

    .line 281
    .line 282
    iget-object v8, v9, Landroidx/fragment/app/h2;->c:Landroidx/fragment/app/l0;

    .line 283
    .line 284
    move-object/from16 v30, v12

    .line 285
    .line 286
    iget-object v12, v8, Landroidx/fragment/app/l0;->mView:Landroid/view/View;

    .line 287
    .line 288
    move-object/from16 v31, v11

    .line 289
    .line 290
    const-string v11, "operation.fragment.mView"

    .line 291
    .line 292
    invoke-static {v12, v11}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    invoke-static {v12, v15}, Landroidx/fragment/app/p;->f(Landroid/view/View;Ljava/util/ArrayList;)V

    .line 296
    .line 297
    .line 298
    if-eqz v29, :cond_7

    .line 299
    .line 300
    if-eq v9, v3, :cond_5

    .line 301
    .line 302
    if-ne v9, v2, :cond_7

    .line 303
    .line 304
    :cond_5
    if-ne v9, v3, :cond_6

    .line 305
    .line 306
    invoke-static/range {v28 .. v28}, Lq4/i;->J0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 307
    .line 308
    .line 309
    move-result-object v11

    .line 310
    invoke-virtual {v15, v11}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 311
    .line 312
    .line 313
    goto :goto_5

    .line 314
    :cond_6
    invoke-static/range {v18 .. v18}, Lq4/i;->J0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 315
    .line 316
    .line 317
    move-result-object v11

    .line 318
    invoke-virtual {v15, v11}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 319
    .line 320
    .line 321
    :cond_7
    :goto_5
    invoke-virtual {v15}, Ljava/util/ArrayList;->isEmpty()Z

    .line 322
    .line 323
    .line 324
    move-result v11

    .line 325
    if-eqz v11, :cond_9

    .line 326
    .line 327
    invoke-virtual {v13, v4, v14}, Landroidx/fragment/app/c2;->a(Landroid/view/View;Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    move-object v11, v14

    .line 331
    move-object v12, v15

    .line 332
    :cond_8
    const/4 v14, 0x2

    .line 333
    goto :goto_6

    .line 334
    :cond_9
    invoke-virtual {v13, v14, v15}, Landroidx/fragment/app/c2;->b(Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 335
    .line 336
    .line 337
    const/16 v24, 0x0

    .line 338
    .line 339
    const/16 v25, 0x0

    .line 340
    .line 341
    move-object/from16 v22, v14

    .line 342
    .line 343
    move-object/from16 v20, v13

    .line 344
    .line 345
    move-object/from16 v21, v14

    .line 346
    .line 347
    move-object/from16 v23, v15

    .line 348
    .line 349
    invoke-virtual/range {v20 .. v25}, Landroidx/fragment/app/c2;->q(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 350
    .line 351
    .line 352
    move-object/from16 v11, v21

    .line 353
    .line 354
    move-object/from16 v12, v23

    .line 355
    .line 356
    iget v14, v9, Landroidx/fragment/app/h2;->a:I

    .line 357
    .line 358
    const/4 v15, 0x3

    .line 359
    if-ne v14, v15, :cond_8

    .line 360
    .line 361
    const/4 v14, 0x0

    .line 362
    iput-boolean v14, v9, Landroidx/fragment/app/h2;->i:Z

    .line 363
    .line 364
    new-instance v15, Ljava/util/ArrayList;

    .line 365
    .line 366
    invoke-direct {v15, v12}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 367
    .line 368
    .line 369
    iget-object v14, v8, Landroidx/fragment/app/l0;->mView:Landroid/view/View;

    .line 370
    .line 371
    invoke-virtual {v15, v14}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    iget-object v8, v8, Landroidx/fragment/app/l0;->mView:Landroid/view/View;

    .line 375
    .line 376
    invoke-virtual {v13, v11, v8, v15}, Landroidx/fragment/app/c2;->p(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    .line 377
    .line 378
    .line 379
    new-instance v8, Landroidx/fragment/app/z;

    .line 380
    .line 381
    const/4 v14, 0x2

    .line 382
    invoke-direct {v8, v14, v12}, Landroidx/fragment/app/z;-><init>(ILjava/lang/Object;)V

    .line 383
    .line 384
    .line 385
    invoke-static {v1, v8}, Lm0/z;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 386
    .line 387
    .line 388
    :goto_6
    iget v8, v9, Landroidx/fragment/app/h2;->a:I

    .line 389
    .line 390
    const-string v9, "View: "

    .line 391
    .line 392
    const-string v15, "transitioningViews"

    .line 393
    .line 394
    if-ne v8, v14, :cond_b

    .line 395
    .line 396
    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 397
    .line 398
    .line 399
    if-eqz v16, :cond_a

    .line 400
    .line 401
    invoke-virtual {v13, v11, v5}, Landroidx/fragment/app/c2;->t(Ljava/lang/Object;Landroid/graphics/Rect;)V

    .line 402
    .line 403
    .line 404
    :cond_a
    invoke-static {v14}, Landroidx/fragment/app/j1;->K(I)Z

    .line 405
    .line 406
    .line 407
    move-result v8

    .line 408
    if-eqz v8, :cond_c

    .line 409
    .line 410
    new-instance v8, Ljava/lang/StringBuilder;

    .line 411
    .line 412
    const-string v14, "Entering Transition: "

    .line 413
    .line 414
    invoke-direct {v8, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v8

    .line 424
    invoke-static {v0, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 425
    .line 426
    .line 427
    const-string v8, ">>>>> EnteringViews <<<<<"

    .line 428
    .line 429
    invoke-static {v0, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 430
    .line 431
    .line 432
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 433
    .line 434
    .line 435
    move-result v8

    .line 436
    const/4 v14, 0x0

    .line 437
    :goto_7
    if-ge v14, v8, :cond_c

    .line 438
    .line 439
    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v2

    .line 443
    add-int/lit8 v14, v14, 0x1

    .line 444
    .line 445
    invoke-static {v2, v15}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    check-cast v2, Landroid/view/View;

    .line 449
    .line 450
    new-instance v3, Ljava/lang/StringBuilder;

    .line 451
    .line 452
    invoke-direct {v3, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v2

    .line 462
    invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 463
    .line 464
    .line 465
    move-object/from16 v2, p2

    .line 466
    .line 467
    move-object/from16 v3, p3

    .line 468
    .line 469
    goto :goto_7

    .line 470
    :cond_b
    invoke-virtual {v13, v10, v11}, Landroidx/fragment/app/c2;->s(Landroid/view/View;Ljava/lang/Object;)V

    .line 471
    .line 472
    .line 473
    const/16 v17, 0x2

    .line 474
    .line 475
    invoke-static/range {v17 .. v17}, Landroidx/fragment/app/j1;->K(I)Z

    .line 476
    .line 477
    .line 478
    move-result v2

    .line 479
    if-eqz v2, :cond_c

    .line 480
    .line 481
    new-instance v2, Ljava/lang/StringBuilder;

    .line 482
    .line 483
    const-string v3, "Exiting Transition: "

    .line 484
    .line 485
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 489
    .line 490
    .line 491
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v2

    .line 495
    invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 496
    .line 497
    .line 498
    const-string v2, ">>>>> ExitingViews <<<<<"

    .line 499
    .line 500
    invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 504
    .line 505
    .line 506
    move-result v2

    .line 507
    const/4 v14, 0x0

    .line 508
    :goto_8
    if-ge v14, v2, :cond_c

    .line 509
    .line 510
    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v3

    .line 514
    add-int/lit8 v14, v14, 0x1

    .line 515
    .line 516
    invoke-static {v3, v15}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 517
    .line 518
    .line 519
    check-cast v3, Landroid/view/View;

    .line 520
    .line 521
    new-instance v8, Ljava/lang/StringBuilder;

    .line 522
    .line 523
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 524
    .line 525
    .line 526
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 527
    .line 528
    .line 529
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v3

    .line 533
    invoke-static {v0, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 534
    .line 535
    .line 536
    goto :goto_8

    .line 537
    :cond_c
    iget-boolean v0, v6, Landroidx/fragment/app/q;->c:Z

    .line 538
    .line 539
    if-eqz v0, :cond_d

    .line 540
    .line 541
    move-object/from16 v2, v31

    .line 542
    .line 543
    invoke-virtual {v13, v2, v11}, Landroidx/fragment/app/c2;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v11

    .line 547
    move-object/from16 v2, p2

    .line 548
    .line 549
    move-object/from16 v3, p3

    .line 550
    .line 551
    move/from16 v9, v19

    .line 552
    .line 553
    move-object/from16 v6, v26

    .line 554
    .line 555
    move/from16 v14, v27

    .line 556
    .line 557
    move-object/from16 v15, v28

    .line 558
    .line 559
    move-object/from16 v8, v29

    .line 560
    .line 561
    move-object/from16 v12, v30

    .line 562
    .line 563
    goto/16 :goto_4

    .line 564
    .line 565
    :cond_d
    move-object/from16 v3, v30

    .line 566
    .line 567
    move-object/from16 v2, v31

    .line 568
    .line 569
    invoke-virtual {v13, v3, v11}, Landroidx/fragment/app/c2;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v12

    .line 573
    move-object/from16 v3, p3

    .line 574
    .line 575
    move-object v11, v2

    .line 576
    move/from16 v9, v19

    .line 577
    .line 578
    move-object/from16 v6, v26

    .line 579
    .line 580
    move/from16 v14, v27

    .line 581
    .line 582
    move-object/from16 v15, v28

    .line 583
    .line 584
    move-object/from16 v8, v29

    .line 585
    .line 586
    move-object/from16 v2, p2

    .line 587
    .line 588
    goto/16 :goto_4

    .line 589
    .line 590
    :cond_e
    move-object v2, v11

    .line 591
    move-object v3, v12

    .line 592
    move/from16 v9, v19

    .line 593
    .line 594
    move-object/from16 v6, v26

    .line 595
    .line 596
    move/from16 v14, v27

    .line 597
    .line 598
    move-object/from16 v2, p2

    .line 599
    .line 600
    move-object/from16 v3, p3

    .line 601
    .line 602
    goto/16 :goto_4

    .line 603
    .line 604
    :cond_f
    move-object v6, v8

    .line 605
    move-object v2, v11

    .line 606
    move-object v3, v12

    .line 607
    invoke-virtual {v13, v2, v3, v6}, Landroidx/fragment/app/c2;->n(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    move-result-object v2

    .line 611
    const/16 v17, 0x2

    .line 612
    .line 613
    invoke-static/range {v17 .. v17}, Landroidx/fragment/app/j1;->K(I)Z

    .line 614
    .line 615
    .line 616
    move-result v3

    .line 617
    if-eqz v3, :cond_10

    .line 618
    .line 619
    new-instance v3, Ljava/lang/StringBuilder;

    .line 620
    .line 621
    const-string v4, "Final merged transition: "

    .line 622
    .line 623
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 624
    .line 625
    .line 626
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 627
    .line 628
    .line 629
    const-string v4, " for container "

    .line 630
    .line 631
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 632
    .line 633
    .line 634
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 635
    .line 636
    .line 637
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v1

    .line 641
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 642
    .line 643
    .line 644
    :cond_10
    new-instance v0, Lp4/f;

    .line 645
    .line 646
    invoke-direct {v0, v7, v2}, Lp4/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 647
    .line 648
    .line 649
    return-object v0
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
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
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
.end method

.method public final h()Z
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/p;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    :cond_1
    if-ge v3, v1, :cond_2

    .line 17
    .line 18
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    add-int/lit8 v3, v3, 0x1

    .line 23
    .line 24
    check-cast v4, Landroidx/fragment/app/q;

    .line 25
    .line 26
    iget-object v4, v4, Landroidx/fragment/app/k;->a:Landroidx/fragment/app/h2;

    .line 27
    .line 28
    iget-object v4, v4, Landroidx/fragment/app/h2;->c:Landroidx/fragment/app/l0;

    .line 29
    .line 30
    iget-boolean v4, v4, Landroidx/fragment/app/l0;->mTransitioning:Z

    .line 31
    .line 32
    if-nez v4, :cond_1

    .line 33
    .line 34
    return v2

    .line 35
    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 36
    return v0
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
.end method

.method public final i(Ljava/util/ArrayList;Landroid/view/ViewGroup;Ld5/a;)V
    .locals 13

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-static {v0, p1}, Landroidx/fragment/app/v1;->a(ILjava/util/ArrayList;)V

    .line 3
    .line 4
    .line 5
    new-instance v4, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v3, p0, Landroidx/fragment/app/p;->i:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v7, 0x0

    .line 17
    const/4 v1, 0x0

    .line 18
    :goto_0
    const/4 v2, 0x0

    .line 19
    if-ge v1, v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    check-cast v5, Landroid/view/View;

    .line 26
    .line 27
    sget-object v6, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 28
    .line 29
    invoke-static {v5}, Lm0/k0;->k(Landroid/view/View;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    invoke-static {v5, v2}, Lm0/k0;->v(Landroid/view/View;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v0, 0x2

    .line 43
    invoke-static {v0}, Landroidx/fragment/app/j1;->K(I)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    iget-object v5, p0, Landroidx/fragment/app/p;->h:Ljava/util/ArrayList;

    .line 48
    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    const-string v0, ">>>>> Beginning transition <<<<<"

    .line 52
    .line 53
    const-string v1, "FragmentManager"

    .line 54
    .line 55
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    const-string v0, ">>>>> SharedElementFirstOutViews <<<<<"

    .line 59
    .line 60
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    const/4 v6, 0x0

    .line 68
    :goto_1
    const-string v8, " Name: "

    .line 69
    .line 70
    const-string v9, "View: "

    .line 71
    .line 72
    if-ge v6, v0, :cond_1

    .line 73
    .line 74
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v10

    .line 78
    add-int/lit8 v6, v6, 0x1

    .line 79
    .line 80
    const-string v11, "sharedElementFirstOutViews"

    .line 81
    .line 82
    invoke-static {v10, v11}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    check-cast v10, Landroid/view/View;

    .line 86
    .line 87
    new-instance v11, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {v11, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    sget-object v8, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 99
    .line 100
    invoke-static {v10}, Lm0/k0;->k(Landroid/view/View;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v8

    .line 104
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    invoke-static {v1, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_1
    const-string v0, ">>>>> SharedElementLastInViews <<<<<"

    .line 116
    .line 117
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    const/4 v6, 0x0

    .line 125
    :goto_2
    if-ge v6, v0, :cond_2

    .line 126
    .line 127
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v10

    .line 131
    add-int/lit8 v6, v6, 0x1

    .line 132
    .line 133
    const-string v11, "sharedElementLastInViews"

    .line 134
    .line 135
    invoke-static {v10, v11}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    check-cast v10, Landroid/view/View;

    .line 139
    .line 140
    new-instance v11, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    invoke-direct {v11, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    sget-object v12, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 152
    .line 153
    invoke-static {v10}, Lm0/k0;->k(Landroid/view/View;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v10

    .line 157
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v10

    .line 164
    invoke-static {v1, v10}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 165
    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_2
    invoke-interface/range {p3 .. p3}, Ld5/a;->invoke()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    new-instance v6, Ljava/util/ArrayList;

    .line 176
    .line 177
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 178
    .line 179
    .line 180
    const/4 v1, 0x0

    .line 181
    :goto_3
    if-ge v1, v0, :cond_6

    .line 182
    .line 183
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v8

    .line 187
    check-cast v8, Landroid/view/View;

    .line 188
    .line 189
    sget-object v9, Lm0/w0;->a:Ljava/util/WeakHashMap;

    .line 190
    .line 191
    invoke-static {v8}, Lm0/k0;->k(Landroid/view/View;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v9

    .line 195
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    if-nez v9, :cond_3

    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_3
    invoke-static {v8, v2}, Lm0/k0;->v(Landroid/view/View;Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    iget-object v8, p0, Landroidx/fragment/app/p;->j:Lq/f;

    .line 205
    .line 206
    invoke-virtual {v8, v9}, Lq/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v8

    .line 210
    check-cast v8, Ljava/lang/String;

    .line 211
    .line 212
    const/4 v10, 0x0

    .line 213
    :goto_4
    if-ge v10, v0, :cond_5

    .line 214
    .line 215
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v11

    .line 219
    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v11

    .line 223
    if-eqz v11, :cond_4

    .line 224
    .line 225
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v8

    .line 229
    check-cast v8, Landroid/view/View;

    .line 230
    .line 231
    invoke-static {v8, v9}, Lm0/k0;->v(Landroid/view/View;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    goto :goto_5

    .line 235
    :cond_4
    add-int/lit8 v10, v10, 0x1

    .line 236
    .line 237
    goto :goto_4

    .line 238
    :cond_5
    :goto_5
    add-int/lit8 v1, v1, 0x1

    .line 239
    .line 240
    goto :goto_3

    .line 241
    :cond_6
    new-instance v1, Landroidx/fragment/app/b2;

    .line 242
    .line 243
    move v2, v0

    .line 244
    invoke-direct/range {v1 .. v6}, Landroidx/fragment/app/b2;-><init>(ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 245
    .line 246
    .line 247
    invoke-static {p2, v1}, Lm0/z;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 248
    .line 249
    .line 250
    invoke-static {v7, p1}, Landroidx/fragment/app/v1;->a(ILjava/util/ArrayList;)V

    .line 251
    .line 252
    .line 253
    iget-object p1, p0, Landroidx/fragment/app/p;->g:Ljava/lang/Object;

    .line 254
    .line 255
    iget-object v0, p0, Landroidx/fragment/app/p;->f:Landroidx/fragment/app/c2;

    .line 256
    .line 257
    invoke-virtual {v0, p1, v5, v3}, Landroidx/fragment/app/c2;->x(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 258
    .line 259
    .line 260
    return-void
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
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
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
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
.end method
