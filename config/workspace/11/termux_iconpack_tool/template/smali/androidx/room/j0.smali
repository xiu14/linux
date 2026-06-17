.class public final Landroidx/room/j0;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final a:Lkotlin/jvm/internal/d;

.field public final b:Landroid/content/Context;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/ArrayList;

.field public final e:Ljava/util/ArrayList;

.field public f:Ljava/util/concurrent/Executor;

.field public g:Ljava/util/concurrent/Executor;

.field public h:Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/c;

.field public i:Z

.field public final j:Landroidx/room/l0;

.field public final k:J

.field public final l:Landroidx/room/m0;

.field public final m:Ljava/util/LinkedHashSet;

.field public final n:Ljava/util/LinkedHashSet;

.field public final o:Ljava/util/ArrayList;

.field public p:Z

.field public q:Z

.field public r:Z

.field public final s:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)V
    .locals 2

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
    iput-object v0, p0, Landroidx/room/j0;->d:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/room/j0;->e:Ljava/util/ArrayList;

    .line 17
    .line 18
    sget-object v0, Landroidx/room/l0;->h:Landroidx/room/l0;

    .line 19
    .line 20
    iput-object v0, p0, Landroidx/room/j0;->j:Landroidx/room/l0;

    .line 21
    .line 22
    const-wide/16 v0, -0x1

    .line 23
    .line 24
    iput-wide v0, p0, Landroidx/room/j0;->k:J

    .line 25
    .line 26
    new-instance v0, Landroidx/room/m0;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, v1}, Landroidx/room/m0;-><init>(I)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Landroidx/room/j0;->l:Landroidx/room/m0;

    .line 33
    .line 34
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Landroidx/room/j0;->m:Ljava/util/LinkedHashSet;

    .line 40
    .line 41
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Landroidx/room/j0;->n:Ljava/util/LinkedHashSet;

    .line 47
    .line 48
    new-instance v0, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, Landroidx/room/j0;->o:Ljava/util/ArrayList;

    .line 54
    .line 55
    const/4 v0, 0x1

    .line 56
    iput-boolean v0, p0, Landroidx/room/j0;->p:Z

    .line 57
    .line 58
    iput-boolean v0, p0, Landroidx/room/j0;->s:Z

    .line 59
    .line 60
    invoke-static {p2}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    iput-object p2, p0, Landroidx/room/j0;->a:Lkotlin/jvm/internal/d;

    .line 65
    .line 66
    iput-object p1, p0, Landroidx/room/j0;->b:Landroid/content/Context;

    .line 67
    .line 68
    iput-object p3, p0, Landroidx/room/j0;->c:Ljava/lang/String;

    .line 69
    .line 70
    return-void
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


# virtual methods
.method public final varargs a([Lt1/a;)V
    .locals 6

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    :goto_0
    if-ge v2, v0, :cond_0

    .line 5
    .line 6
    aget-object v3, p1, v2

    .line 7
    .line 8
    iget v4, v3, Lt1/a;->a:I

    .line 9
    .line 10
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    iget-object v5, p0, Landroidx/room/j0;->n:Ljava/util/LinkedHashSet;

    .line 15
    .line 16
    invoke-interface {v5, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    iget v3, v3, Lt1/a;->b:I

    .line 20
    .line 21
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-interface {v5, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    array-length v0, p1

    .line 32
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, [Lt1/a;

    .line 37
    .line 38
    iget-object v0, p0, Landroidx/room/j0;->l:Landroidx/room/m0;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    const-string v2, "migrations"

    .line 44
    .line 45
    invoke-static {p1, v2}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    array-length v2, p1

    .line 49
    :goto_1
    if-ge v1, v2, :cond_1

    .line 50
    .line 51
    aget-object v3, p1, v1

    .line 52
    .line 53
    invoke-virtual {v0, v3}, Landroidx/room/m0;->a(Lt1/a;)V

    .line 54
    .line 55
    .line 56
    add-int/lit8 v1, v1, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    return-void
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

.method public final b()Landroidx/room/r0;
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Landroidx/room/j0;->f:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v2, v1, Landroidx/room/j0;->g:Ljava/util/concurrent/Executor;

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    sget-object v0, Lm/b;->c:Lm/a;

    .line 12
    .line 13
    iput-object v0, v1, Landroidx/room/j0;->g:Ljava/util/concurrent/Executor;

    .line 14
    .line 15
    iput-object v0, v1, Landroidx/room/j0;->f:Ljava/util/concurrent/Executor;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v2, v1, Landroidx/room/j0;->g:Ljava/util/concurrent/Executor;

    .line 21
    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    iput-object v0, v1, Landroidx/room/j0;->g:Ljava/util/concurrent/Executor;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    if-nez v0, :cond_2

    .line 28
    .line 29
    iget-object v0, v1, Landroidx/room/j0;->g:Ljava/util/concurrent/Executor;

    .line 30
    .line 31
    iput-object v0, v1, Landroidx/room/j0;->f:Ljava/util/concurrent/Executor;

    .line 32
    .line 33
    :cond_2
    :goto_0
    const-string v0, "migrationStartAndEndVersions"

    .line 34
    .line 35
    iget-object v2, v1, Landroidx/room/j0;->n:Ljava/util/LinkedHashSet;

    .line 36
    .line 37
    invoke-static {v2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const-string v0, "migrationsNotRequiredFrom"

    .line 41
    .line 42
    iget-object v3, v1, Landroidx/room/j0;->m:Ljava/util/LinkedHashSet;

    .line 43
    .line 44
    invoke-static {v3, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_4

    .line 52
    .line 53
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_4

    .line 62
    .line 63
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    check-cast v2, Ljava/lang/Number;

    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-nez v4, :cond_3

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    const-string v0, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "

    .line 85
    .line 86
    invoke-static {v2, v0}, Landroidx/appcompat/app/b;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw v2

    .line 100
    :cond_4
    iget-object v0, v1, Landroidx/room/j0;->h:Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/c;

    .line 101
    .line 102
    if-nez v0, :cond_5

    .line 103
    .line 104
    new-instance v0, La1/d;

    .line 105
    .line 106
    const/4 v2, 0x5

    .line 107
    invoke-direct {v0, v2}, La1/d;-><init>(I)V

    .line 108
    .line 109
    .line 110
    :cond_5
    move-object v6, v0

    .line 111
    iget-wide v4, v1, Landroidx/room/j0;->k:J

    .line 112
    .line 113
    const-wide/16 v7, 0x0

    .line 114
    .line 115
    cmp-long v2, v4, v7

    .line 116
    .line 117
    if-lez v2, :cond_6

    .line 118
    .line 119
    const/4 v2, 0x1

    .line 120
    goto :goto_2

    .line 121
    :cond_6
    const/4 v2, 0x0

    .line 122
    :goto_2
    const-string v4, "Required value was null."

    .line 123
    .line 124
    if-eqz v2, :cond_8

    .line 125
    .line 126
    iget-object v0, v1, Landroidx/room/j0;->c:Ljava/lang/String;

    .line 127
    .line 128
    if-eqz v0, :cond_7

    .line 129
    .line 130
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 131
    .line 132
    invoke-direct {v0, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw v0

    .line 136
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 137
    .line 138
    const-string v2, "Cannot create auto-closing database for an in-memory database."

    .line 139
    .line 140
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    throw v0

    .line 144
    :cond_8
    move-object/from16 v16, v3

    .line 145
    .line 146
    new-instance v3, Landroidx/room/b;

    .line 147
    .line 148
    iget-boolean v9, v1, Landroidx/room/j0;->i:Z

    .line 149
    .line 150
    iget-object v2, v1, Landroidx/room/j0;->j:Landroidx/room/l0;

    .line 151
    .line 152
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    const-string v5, "context"

    .line 156
    .line 157
    move-object v7, v4

    .line 158
    iget-object v4, v1, Landroidx/room/j0;->b:Landroid/content/Context;

    .line 159
    .line 160
    invoke-static {v4, v5}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    sget-object v5, Landroidx/room/l0;->h:Landroidx/room/l0;

    .line 164
    .line 165
    const/4 v8, 0x0

    .line 166
    if-eq v2, v5, :cond_9

    .line 167
    .line 168
    :goto_3
    move-object v10, v2

    .line 169
    goto :goto_5

    .line 170
    :cond_9
    const-string v2, "activity"

    .line 171
    .line 172
    invoke-virtual {v4, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    instance-of v5, v2, Landroid/app/ActivityManager;

    .line 177
    .line 178
    if-eqz v5, :cond_a

    .line 179
    .line 180
    check-cast v2, Landroid/app/ActivityManager;

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_a
    move-object v2, v8

    .line 184
    :goto_4
    if-eqz v2, :cond_b

    .line 185
    .line 186
    invoke-virtual {v2}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    if-nez v2, :cond_b

    .line 191
    .line 192
    sget-object v2, Landroidx/room/l0;->j:Landroidx/room/l0;

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_b
    sget-object v2, Landroidx/room/l0;->i:Landroidx/room/l0;

    .line 196
    .line 197
    goto :goto_3

    .line 198
    :goto_5
    iget-object v11, v1, Landroidx/room/j0;->f:Ljava/util/concurrent/Executor;

    .line 199
    .line 200
    if-eqz v11, :cond_11

    .line 201
    .line 202
    iget-object v12, v1, Landroidx/room/j0;->g:Ljava/util/concurrent/Executor;

    .line 203
    .line 204
    if-eqz v12, :cond_10

    .line 205
    .line 206
    iget-boolean v14, v1, Landroidx/room/j0;->p:Z

    .line 207
    .line 208
    iget-boolean v15, v1, Landroidx/room/j0;->q:Z

    .line 209
    .line 210
    iget-boolean v2, v1, Landroidx/room/j0;->r:Z

    .line 211
    .line 212
    const/16 v23, 0x0

    .line 213
    .line 214
    const/16 v24, 0x0

    .line 215
    .line 216
    iget-object v5, v1, Landroidx/room/j0;->c:Ljava/lang/String;

    .line 217
    .line 218
    iget-object v7, v1, Landroidx/room/j0;->l:Landroidx/room/m0;

    .line 219
    .line 220
    move-object v13, v8

    .line 221
    iget-object v8, v1, Landroidx/room/j0;->d:Ljava/util/ArrayList;

    .line 222
    .line 223
    move-object/from16 v17, v13

    .line 224
    .line 225
    move-object/from16 v18, v17

    .line 226
    .line 227
    const/16 v17, 0x0

    .line 228
    .line 229
    move-object/from16 v19, v18

    .line 230
    .line 231
    const/16 v18, 0x0

    .line 232
    .line 233
    move-object/from16 v20, v19

    .line 234
    .line 235
    const/16 v19, 0x0

    .line 236
    .line 237
    iget-object v13, v1, Landroidx/room/j0;->e:Ljava/util/ArrayList;

    .line 238
    .line 239
    const/16 v25, 0x1

    .line 240
    .line 241
    iget-object v0, v1, Landroidx/room/j0;->o:Ljava/util/ArrayList;

    .line 242
    .line 243
    move-object/from16 v21, v0

    .line 244
    .line 245
    move/from16 v22, v2

    .line 246
    .line 247
    move-object/from16 v0, v20

    .line 248
    .line 249
    move-object/from16 v20, v13

    .line 250
    .line 251
    const/4 v13, 0x0

    .line 252
    invoke-direct/range {v3 .. v24}, Landroidx/room/b;-><init>(Landroid/content/Context;Ljava/lang/String;Lz1/e;Landroidx/room/m0;Ljava/util/List;ZLandroidx/room/l0;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Ljava/util/List;Ljava/util/List;ZLy1/b;Lt4/h;)V

    .line 253
    .line 254
    .line 255
    iget-boolean v2, v1, Landroidx/room/j0;->s:Z

    .line 256
    .line 257
    iput-boolean v2, v3, Landroidx/room/b;->v:Z

    .line 258
    .line 259
    iget-object v2, v1, Landroidx/room/j0;->a:Lkotlin/jvm/internal/d;

    .line 260
    .line 261
    invoke-static {v2}, Le6/d;->n(Lj5/c;)Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    invoke-virtual {v2}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    .line 266
    .line 267
    .line 268
    move-result-object v4

    .line 269
    if-eqz v4, :cond_c

    .line 270
    .line 271
    invoke-virtual {v4}, Ljava/lang/Package;->getName()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v4

    .line 275
    if-nez v4, :cond_d

    .line 276
    .line 277
    :cond_c
    const-string v4, ""

    .line 278
    .line 279
    :cond_d
    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v5

    .line 283
    invoke-static {v5}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 287
    .line 288
    .line 289
    move-result v6

    .line 290
    if-nez v6, :cond_e

    .line 291
    .line 292
    goto :goto_6

    .line 293
    :cond_e
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 294
    .line 295
    .line 296
    move-result v6

    .line 297
    add-int/lit8 v6, v6, 0x1

    .line 298
    .line 299
    invoke-virtual {v5, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v5

    .line 303
    const-string v6, "substring(...)"

    .line 304
    .line 305
    invoke-static {v5, v6}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    :goto_6
    const/16 v6, 0x5f

    .line 309
    .line 310
    const/16 v7, 0x2e

    .line 311
    .line 312
    invoke-virtual {v5, v7, v6}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v5

    .line 316
    const-string v6, "replace(...)"

    .line 317
    .line 318
    invoke-static {v5, v6}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    const-string v6, "_Impl"

    .line 322
    .line 323
    invoke-virtual {v5, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v5

    .line 327
    :try_start_0
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 328
    .line 329
    .line 330
    move-result v6

    .line 331
    if-nez v6, :cond_f

    .line 332
    .line 333
    move-object v4, v5

    .line 334
    goto :goto_7

    .line 335
    :cond_f
    new-instance v6, Ljava/lang/StringBuilder;

    .line 336
    .line 337
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v4

    .line 353
    :goto_7
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 354
    .line 355
    .line 356
    move-result-object v6

    .line 357
    const/4 v7, 0x1

    .line 358
    invoke-static {v4, v7, v6}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    move-result-object v4

    .line 362
    const-string v6, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.util.KClassUtil.findAndInstantiateDatabaseImpl>"

    .line 363
    .line 364
    invoke-static {v4, v6}, Lkotlin/jvm/internal/j;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v4, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 368
    .line 369
    .line 370
    move-result-object v4

    .line 371
    invoke-virtual {v4, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 375
    check-cast v0, Landroidx/room/r0;

    .line 376
    .line 377
    invoke-virtual {v0, v3}, Landroidx/room/r0;->init(Landroidx/room/b;)V

    .line 378
    .line 379
    .line 380
    return-object v0

    .line 381
    :catch_0
    move-exception v0

    .line 382
    goto :goto_8

    .line 383
    :catch_1
    move-exception v0

    .line 384
    goto :goto_9

    .line 385
    :catch_2
    move-exception v0

    .line 386
    goto :goto_a

    .line 387
    :goto_8
    new-instance v3, Ljava/lang/RuntimeException;

    .line 388
    .line 389
    new-instance v4, Ljava/lang/StringBuilder;

    .line 390
    .line 391
    const-string v5, "Failed to create an instance of "

    .line 392
    .line 393
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v2

    .line 400
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v2

    .line 407
    invoke-direct {v3, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 408
    .line 409
    .line 410
    throw v3

    .line 411
    :goto_9
    new-instance v3, Ljava/lang/RuntimeException;

    .line 412
    .line 413
    new-instance v4, Ljava/lang/StringBuilder;

    .line 414
    .line 415
    const-string v5, "Cannot access the constructor "

    .line 416
    .line 417
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    invoke-direct {v3, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 432
    .line 433
    .line 434
    throw v3

    .line 435
    :goto_a
    new-instance v3, Ljava/lang/RuntimeException;

    .line 436
    .line 437
    new-instance v4, Ljava/lang/StringBuilder;

    .line 438
    .line 439
    const-string v6, "Cannot find implementation for "

    .line 440
    .line 441
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v2

    .line 448
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 449
    .line 450
    .line 451
    const-string v2, ". "

    .line 452
    .line 453
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 457
    .line 458
    .line 459
    const-string v2, " does not exist. Is Room annotation processor correctly configured?"

    .line 460
    .line 461
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v2

    .line 468
    invoke-direct {v3, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 469
    .line 470
    .line 471
    throw v3

    .line 472
    :cond_10
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 473
    .line 474
    invoke-direct {v0, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    throw v0

    .line 478
    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 479
    .line 480
    invoke-direct {v0, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 481
    .line 482
    .line 483
    throw v0
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
.end method
