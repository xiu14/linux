.class public final Le3/h;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final a:Ly2/j;

.field public final b:Lo3/l;

.field public final c:La1/w;

.field public final d:La1/q;


# direct methods
.method public constructor <init>(Ly2/j;Lo3/l;La1/w;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Le3/h;->a:Ly2/j;

    .line 5
    .line 6
    iput-object p2, p0, Le3/h;->b:Lo3/l;

    .line 7
    .line 8
    iput-object p3, p0, Le3/h;->c:La1/w;

    .line 9
    .line 10
    new-instance p2, La1/q;

    .line 11
    .line 12
    invoke-direct {p2, p1, p3}, La1/q;-><init>(Ly2/j;La1/w;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, Le3/h;->d:La1/q;

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

.method public static final a(Le3/h;Ld3/m;Ly2/b;Lj3/j;Ljava/lang/Object;Lj3/n;Ly2/c;Lv4/c;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p7

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    instance-of v1, v0, Le3/b;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    move-object v1, v0

    .line 11
    check-cast v1, Le3/b;

    .line 12
    .line 13
    iget v2, v1, Le3/b;->r:I

    .line 14
    .line 15
    const/high16 v3, -0x80000000

    .line 16
    .line 17
    and-int v4, v2, v3

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    sub-int/2addr v2, v3

    .line 22
    iput v2, v1, Le3/b;->r:I

    .line 23
    .line 24
    move-object/from16 v2, p0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance v1, Le3/b;

    .line 28
    .line 29
    move-object/from16 v2, p0

    .line 30
    .line 31
    invoke-direct {v1, v2, v0}, Le3/b;-><init>(Le3/h;Lv4/c;)V

    .line 32
    .line 33
    .line 34
    :goto_0
    iget-object v0, v1, Le3/b;->p:Ljava/lang/Object;

    .line 35
    .line 36
    sget-object v3, Lu4/a;->h:Lu4/a;

    .line 37
    .line 38
    iget v4, v1, Le3/b;->r:I

    .line 39
    .line 40
    const/4 v5, 0x0

    .line 41
    const/4 v6, 0x1

    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    if-ne v4, v6, :cond_1

    .line 45
    .line 46
    iget v2, v1, Le3/b;->o:I

    .line 47
    .line 48
    iget-object v4, v1, Le3/b;->n:Ly2/c;

    .line 49
    .line 50
    iget-object v7, v1, Le3/b;->m:Lj3/n;

    .line 51
    .line 52
    iget-object v8, v1, Le3/b;->l:Ljava/lang/Object;

    .line 53
    .line 54
    iget-object v9, v1, Le3/b;->k:Lj3/j;

    .line 55
    .line 56
    iget-object v10, v1, Le3/b;->j:Ly2/b;

    .line 57
    .line 58
    iget-object v11, v1, Le3/b;->i:Ld3/m;

    .line 59
    .line 60
    iget-object v12, v1, Le3/b;->h:Le3/h;

    .line 61
    .line 62
    invoke-static {v0}, Le6/l;->H(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    move-object/from16 v16, v12

    .line 66
    .line 67
    move-object v12, v1

    .line 68
    move-object v1, v10

    .line 69
    move v10, v2

    .line 70
    move-object/from16 v2, v16

    .line 71
    .line 72
    move-object/from16 v16, v9

    .line 73
    .line 74
    move-object v9, v4

    .line 75
    move-object/from16 v4, v16

    .line 76
    .line 77
    move-object/from16 v16, v8

    .line 78
    .line 79
    move-object v8, v7

    .line 80
    move-object/from16 v7, v16

    .line 81
    .line 82
    goto/16 :goto_3

    .line 83
    .line 84
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 85
    .line 86
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 87
    .line 88
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw v0

    .line 92
    :cond_2
    invoke-static {v0}, Le6/l;->H(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    const/4 v0, 0x0

    .line 96
    move-object/from16 v0, p1

    .line 97
    .line 98
    move-object/from16 v4, p3

    .line 99
    .line 100
    move-object/from16 v7, p4

    .line 101
    .line 102
    move-object/from16 v8, p5

    .line 103
    .line 104
    move-object/from16 v9, p6

    .line 105
    .line 106
    move-object v11, v1

    .line 107
    const/4 v10, 0x0

    .line 108
    move-object/from16 v1, p2

    .line 109
    .line 110
    :goto_1
    iget-object v12, v2, Le3/h;->a:Ly2/j;

    .line 111
    .line 112
    iget-object v12, v1, Ly2/b;->e:Ljava/util/List;

    .line 113
    .line 114
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 115
    .line 116
    .line 117
    move-result v13

    .line 118
    if-ge v10, v13, :cond_3

    .line 119
    .line 120
    invoke-interface {v12, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v12

    .line 124
    check-cast v12, La3/d;

    .line 125
    .line 126
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    new-instance v13, La3/f;

    .line 130
    .line 131
    iget-object v14, v0, Ld3/m;->a:La3/o;

    .line 132
    .line 133
    iget-object v15, v12, La3/d;->b:Lv5/i;

    .line 134
    .line 135
    iget-object v12, v12, La3/d;->a:La3/k;

    .line 136
    .line 137
    invoke-direct {v13, v14, v8, v15, v12}, La3/f;-><init>(La3/o;Lj3/n;Lv5/e;La3/k;)V

    .line 138
    .line 139
    .line 140
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 141
    .line 142
    .line 143
    move-result-object v10

    .line 144
    new-instance v12, Lp4/f;

    .line 145
    .line 146
    invoke-direct {v12, v13, v10}, Lp4/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_3
    move-object v12, v5

    .line 151
    :goto_2
    if-eqz v12, :cond_8

    .line 152
    .line 153
    iget-object v10, v12, Lp4/f;->h:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v10, La3/f;

    .line 156
    .line 157
    iget-object v12, v12, Lp4/f;->i:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v12, Ljava/lang/Number;

    .line 160
    .line 161
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 162
    .line 163
    .line 164
    move-result v12

    .line 165
    add-int/2addr v12, v6

    .line 166
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    iput-object v2, v11, Le3/b;->h:Le3/h;

    .line 170
    .line 171
    iput-object v0, v11, Le3/b;->i:Ld3/m;

    .line 172
    .line 173
    iput-object v1, v11, Le3/b;->j:Ly2/b;

    .line 174
    .line 175
    iput-object v4, v11, Le3/b;->k:Lj3/j;

    .line 176
    .line 177
    iput-object v7, v11, Le3/b;->l:Ljava/lang/Object;

    .line 178
    .line 179
    iput-object v8, v11, Le3/b;->m:Lj3/n;

    .line 180
    .line 181
    iput-object v9, v11, Le3/b;->n:Ly2/c;

    .line 182
    .line 183
    iput v12, v11, Le3/b;->o:I

    .line 184
    .line 185
    iput v6, v11, Le3/b;->r:I

    .line 186
    .line 187
    invoke-virtual {v10, v11}, La3/f;->a(Lv4/c;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v10

    .line 191
    if-ne v10, v3, :cond_4

    .line 192
    .line 193
    return-object v3

    .line 194
    :cond_4
    move-object/from16 v16, v11

    .line 195
    .line 196
    move-object v11, v0

    .line 197
    move-object v0, v10

    .line 198
    move v10, v12

    .line 199
    move-object/from16 v12, v16

    .line 200
    .line 201
    :goto_3
    check-cast v0, La3/h;

    .line 202
    .line 203
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    if-eqz v0, :cond_7

    .line 207
    .line 208
    new-instance v1, Le3/a;

    .line 209
    .line 210
    iget-object v2, v0, La3/h;->a:Landroid/graphics/drawable/BitmapDrawable;

    .line 211
    .line 212
    iget-boolean v0, v0, La3/h;->b:Z

    .line 213
    .line 214
    iget-object v3, v11, Ld3/m;->c:La3/g;

    .line 215
    .line 216
    iget-object v4, v11, Ld3/m;->a:La3/o;

    .line 217
    .line 218
    instance-of v6, v4, La3/n;

    .line 219
    .line 220
    if-eqz v6, :cond_5

    .line 221
    .line 222
    check-cast v4, La3/n;

    .line 223
    .line 224
    goto :goto_4

    .line 225
    :cond_5
    move-object v4, v5

    .line 226
    :goto_4
    if-eqz v4, :cond_6

    .line 227
    .line 228
    iget-object v5, v4, La3/n;->j:Ljava/lang/String;

    .line 229
    .line 230
    :cond_6
    invoke-direct {v1, v2, v0, v3, v5}, Le3/a;-><init>(Landroid/graphics/drawable/Drawable;ZLa3/g;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    return-object v1

    .line 234
    :cond_7
    move-object v0, v11

    .line 235
    move-object v11, v12

    .line 236
    goto :goto_1

    .line 237
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 238
    .line 239
    const-string v1, "Unable to create a decoder that supports: "

    .line 240
    .line 241
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 252
    .line 253
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    throw v1
.end method

.method public static final b(Le3/h;Lj3/j;Ljava/lang/Object;Lj3/n;Ly2/c;Lv4/c;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p5

    .line 4
    .line 5
    instance-of v2, v1, Le3/c;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Le3/c;

    .line 11
    .line 12
    iget v3, v2, Le3/c;->r:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Le3/c;->r:I

    .line 22
    .line 23
    :goto_0
    move-object v6, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Le3/c;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, Le3/c;-><init>(Le3/h;Lv4/c;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v6, Le3/c;->p:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v7, Lu4/a;->h:Lu4/a;

    .line 34
    .line 35
    iget v2, v6, Le3/c;->r:I

    .line 36
    .line 37
    const/4 v8, 0x3

    .line 38
    const/4 v9, 0x2

    .line 39
    const/4 v3, 0x1

    .line 40
    const/4 v10, 0x0

    .line 41
    if-eqz v2, :cond_4

    .line 42
    .line 43
    if-eq v2, v3, :cond_3

    .line 44
    .line 45
    if-eq v2, v9, :cond_2

    .line 46
    .line 47
    if-ne v2, v8, :cond_1

    .line 48
    .line 49
    invoke-static {v1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto/16 :goto_9

    .line 53
    .line 54
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v0

    .line 62
    :cond_2
    iget-object v2, v6, Le3/c;->l:Lkotlin/jvm/internal/o;

    .line 63
    .line 64
    iget-object v0, v6, Le3/c;->k:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, Lkotlin/jvm/internal/o;

    .line 67
    .line 68
    iget-object v3, v6, Le3/c;->j:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v3, Ly2/c;

    .line 71
    .line 72
    iget-object v4, v6, Le3/c;->i:Lj3/j;

    .line 73
    .line 74
    iget-object v5, v6, Le3/c;->h:Le3/h;

    .line 75
    .line 76
    :try_start_0
    invoke-static {v1}, Le6/l;->H(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    .line 78
    .line 79
    goto/16 :goto_3

    .line 80
    .line 81
    :catchall_0
    move-exception v0

    .line 82
    goto/16 :goto_a

    .line 83
    .line 84
    :cond_3
    iget-object v0, v6, Le3/c;->o:Lkotlin/jvm/internal/o;

    .line 85
    .line 86
    iget-object v2, v6, Le3/c;->n:Lkotlin/jvm/internal/o;

    .line 87
    .line 88
    iget-object v3, v6, Le3/c;->m:Lkotlin/jvm/internal/o;

    .line 89
    .line 90
    iget-object v4, v6, Le3/c;->l:Lkotlin/jvm/internal/o;

    .line 91
    .line 92
    iget-object v5, v6, Le3/c;->k:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v5, Ly2/c;

    .line 95
    .line 96
    iget-object v11, v6, Le3/c;->j:Ljava/lang/Object;

    .line 97
    .line 98
    iget-object v12, v6, Le3/c;->i:Lj3/j;

    .line 99
    .line 100
    iget-object v13, v6, Le3/c;->h:Le3/h;

    .line 101
    .line 102
    :try_start_1
    invoke-static {v1}, Le6/l;->H(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 103
    .line 104
    .line 105
    move-object/from16 v17, v3

    .line 106
    .line 107
    move-object/from16 v20, v4

    .line 108
    .line 109
    move-object/from16 v21, v5

    .line 110
    .line 111
    move-object/from16 v19, v11

    .line 112
    .line 113
    move-object v15, v13

    .line 114
    goto :goto_2

    .line 115
    :cond_4
    invoke-static {v1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    new-instance v11, Lkotlin/jvm/internal/o;

    .line 119
    .line 120
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 121
    .line 122
    .line 123
    move-object/from16 v1, p3

    .line 124
    .line 125
    iput-object v1, v11, Lkotlin/jvm/internal/o;->h:Ljava/lang/Object;

    .line 126
    .line 127
    new-instance v12, Lkotlin/jvm/internal/o;

    .line 128
    .line 129
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 130
    .line 131
    .line 132
    iget-object v1, v0, Le3/h;->a:Ly2/j;

    .line 133
    .line 134
    iget-object v1, v1, Ly2/j;->g:Ly2/b;

    .line 135
    .line 136
    iput-object v1, v12, Lkotlin/jvm/internal/o;->h:Ljava/lang/Object;

    .line 137
    .line 138
    new-instance v13, Lkotlin/jvm/internal/o;

    .line 139
    .line 140
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 141
    .line 142
    .line 143
    :try_start_2
    iget-object v1, v0, Le3/h;->c:La1/w;

    .line 144
    .line 145
    iget-object v2, v11, Lkotlin/jvm/internal/o;->h:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v2, Lj3/n;

    .line 148
    .line 149
    invoke-virtual {v1, v2}, La1/w;->G(Lj3/n;)Lj3/n;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    iput-object v1, v11, Lkotlin/jvm/internal/o;->h:Ljava/lang/Object;

    .line 154
    .line 155
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    iget-object v1, v12, Lkotlin/jvm/internal/o;->h:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v1, Ly2/b;

    .line 161
    .line 162
    iget-object v2, v11, Lkotlin/jvm/internal/o;->h:Ljava/lang/Object;

    .line 163
    .line 164
    move-object v4, v2

    .line 165
    check-cast v4, Lj3/n;

    .line 166
    .line 167
    iput-object v0, v6, Le3/c;->h:Le3/h;

    .line 168
    .line 169
    move-object/from16 v2, p1

    .line 170
    .line 171
    iput-object v2, v6, Le3/c;->i:Lj3/j;

    .line 172
    .line 173
    move-object/from16 v5, p2

    .line 174
    .line 175
    iput-object v5, v6, Le3/c;->j:Ljava/lang/Object;

    .line 176
    .line 177
    move-object/from16 v14, p4

    .line 178
    .line 179
    iput-object v14, v6, Le3/c;->k:Ljava/lang/Object;

    .line 180
    .line 181
    iput-object v11, v6, Le3/c;->l:Lkotlin/jvm/internal/o;

    .line 182
    .line 183
    iput-object v12, v6, Le3/c;->m:Lkotlin/jvm/internal/o;

    .line 184
    .line 185
    iput-object v13, v6, Le3/c;->n:Lkotlin/jvm/internal/o;

    .line 186
    .line 187
    iput-object v13, v6, Le3/c;->o:Lkotlin/jvm/internal/o;

    .line 188
    .line 189
    iput v3, v6, Le3/c;->r:I

    .line 190
    .line 191
    move-object v3, v5

    .line 192
    move-object v5, v14

    .line 193
    invoke-virtual/range {v0 .. v6}, Le3/h;->c(Ly2/b;Lj3/j;Ljava/lang/Object;Lj3/n;Ly2/c;Lv4/c;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 197
    if-ne v1, v7, :cond_5

    .line 198
    .line 199
    goto/16 :goto_8

    .line 200
    .line 201
    :cond_5
    move-object/from16 v15, p0

    .line 202
    .line 203
    move-object/from16 v19, p2

    .line 204
    .line 205
    move-object/from16 v21, p4

    .line 206
    .line 207
    move-object/from16 v20, v11

    .line 208
    .line 209
    move-object/from16 v17, v12

    .line 210
    .line 211
    move-object v0, v13

    .line 212
    move-object v2, v0

    .line 213
    move-object/from16 v12, p1

    .line 214
    .line 215
    :goto_2
    :try_start_3
    iput-object v1, v0, Lkotlin/jvm/internal/o;->h:Ljava/lang/Object;

    .line 216
    .line 217
    iget-object v0, v2, Lkotlin/jvm/internal/o;->h:Ljava/lang/Object;

    .line 218
    .line 219
    move-object v1, v0

    .line 220
    check-cast v1, Ld3/e;

    .line 221
    .line 222
    instance-of v3, v1, Ld3/m;

    .line 223
    .line 224
    if-eqz v3, :cond_7

    .line 225
    .line 226
    iget-object v0, v12, Lj3/j;->t:Ln5/r;

    .line 227
    .line 228
    new-instance v14, Le3/d;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 229
    .line 230
    const/16 v22, 0x0

    .line 231
    .line 232
    move-object/from16 v16, v2

    .line 233
    .line 234
    move-object/from16 v18, v12

    .line 235
    .line 236
    :try_start_4
    invoke-direct/range {v14 .. v22}, Le3/d;-><init>(Le3/h;Lkotlin/jvm/internal/o;Lkotlin/jvm/internal/o;Lj3/j;Ljava/lang/Object;Lkotlin/jvm/internal/o;Ly2/c;Lt4/c;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 237
    .line 238
    .line 239
    move-object/from16 v4, v18

    .line 240
    .line 241
    move-object/from16 v11, v20

    .line 242
    .line 243
    move-object/from16 v3, v21

    .line 244
    .line 245
    :try_start_5
    iput-object v15, v6, Le3/c;->h:Le3/h;

    .line 246
    .line 247
    iput-object v4, v6, Le3/c;->i:Lj3/j;

    .line 248
    .line 249
    iput-object v3, v6, Le3/c;->j:Ljava/lang/Object;

    .line 250
    .line 251
    iput-object v11, v6, Le3/c;->k:Ljava/lang/Object;

    .line 252
    .line 253
    iput-object v2, v6, Le3/c;->l:Lkotlin/jvm/internal/o;

    .line 254
    .line 255
    iput-object v10, v6, Le3/c;->m:Lkotlin/jvm/internal/o;

    .line 256
    .line 257
    iput-object v10, v6, Le3/c;->n:Lkotlin/jvm/internal/o;

    .line 258
    .line 259
    iput-object v10, v6, Le3/c;->o:Lkotlin/jvm/internal/o;

    .line 260
    .line 261
    iput v9, v6, Le3/c;->r:I

    .line 262
    .line 263
    invoke-static {v0, v14, v6}, Ln5/x;->x(Lt4/h;Ld5/p;Lt4/c;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    if-ne v1, v7, :cond_6

    .line 268
    .line 269
    goto/16 :goto_8

    .line 270
    .line 271
    :cond_6
    move-object v0, v11

    .line 272
    move-object v5, v15

    .line 273
    :goto_3
    check-cast v1, Le3/a;

    .line 274
    .line 275
    move-object v11, v0

    .line 276
    move-object/from16 v17, v5

    .line 277
    .line 278
    :goto_4
    move-object/from16 v21, v3

    .line 279
    .line 280
    move-object v12, v4

    .line 281
    goto :goto_5

    .line 282
    :catchall_1
    move-exception v0

    .line 283
    move-object/from16 v2, v16

    .line 284
    .line 285
    goto/16 :goto_a

    .line 286
    .line 287
    :cond_7
    move-object v4, v12

    .line 288
    move-object/from16 v11, v20

    .line 289
    .line 290
    move-object/from16 v3, v21

    .line 291
    .line 292
    instance-of v1, v1, Ld3/d;

    .line 293
    .line 294
    if-eqz v1, :cond_f

    .line 295
    .line 296
    new-instance v1, Le3/a;

    .line 297
    .line 298
    move-object v5, v0

    .line 299
    check-cast v5, Ld3/d;

    .line 300
    .line 301
    iget-object v5, v5, Ld3/d;->a:Landroid/graphics/drawable/Drawable;

    .line 302
    .line 303
    move-object v9, v0

    .line 304
    check-cast v9, Ld3/d;

    .line 305
    .line 306
    iget-boolean v9, v9, Ld3/d;->b:Z

    .line 307
    .line 308
    check-cast v0, Ld3/d;

    .line 309
    .line 310
    iget-object v0, v0, Ld3/d;->c:La3/g;

    .line 311
    .line 312
    invoke-direct {v1, v5, v9, v0, v10}, Le3/a;-><init>(Landroid/graphics/drawable/Drawable;ZLa3/g;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 313
    .line 314
    .line 315
    move-object/from16 v17, v15

    .line 316
    .line 317
    goto :goto_4

    .line 318
    :goto_5
    iget-object v0, v2, Lkotlin/jvm/internal/o;->h:Ljava/lang/Object;

    .line 319
    .line 320
    instance-of v2, v0, Ld3/m;

    .line 321
    .line 322
    if-eqz v2, :cond_8

    .line 323
    .line 324
    check-cast v0, Ld3/m;

    .line 325
    .line 326
    goto :goto_6

    .line 327
    :cond_8
    move-object v0, v10

    .line 328
    :goto_6
    if-eqz v0, :cond_9

    .line 329
    .line 330
    iget-object v0, v0, Ld3/m;->a:La3/o;

    .line 331
    .line 332
    invoke-static {v0}, Lo3/e;->a(Ljava/io/Closeable;)V

    .line 333
    .line 334
    .line 335
    :cond_9
    iget-object v0, v11, Lkotlin/jvm/internal/o;->h:Ljava/lang/Object;

    .line 336
    .line 337
    move-object/from16 v19, v0

    .line 338
    .line 339
    check-cast v19, Lj3/n;

    .line 340
    .line 341
    iput-object v10, v6, Le3/c;->h:Le3/h;

    .line 342
    .line 343
    iput-object v10, v6, Le3/c;->i:Lj3/j;

    .line 344
    .line 345
    iput-object v10, v6, Le3/c;->j:Ljava/lang/Object;

    .line 346
    .line 347
    iput-object v10, v6, Le3/c;->k:Ljava/lang/Object;

    .line 348
    .line 349
    iput-object v10, v6, Le3/c;->l:Lkotlin/jvm/internal/o;

    .line 350
    .line 351
    iput-object v10, v6, Le3/c;->m:Lkotlin/jvm/internal/o;

    .line 352
    .line 353
    iput-object v10, v6, Le3/c;->n:Lkotlin/jvm/internal/o;

    .line 354
    .line 355
    iput-object v10, v6, Le3/c;->o:Lkotlin/jvm/internal/o;

    .line 356
    .line 357
    iput v8, v6, Le3/c;->r:I

    .line 358
    .line 359
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    iget-object v0, v12, Lj3/j;->g:Ljava/util/List;

    .line 363
    .line 364
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 365
    .line 366
    .line 367
    move-result v2

    .line 368
    if-eqz v2, :cond_a

    .line 369
    .line 370
    goto :goto_7

    .line 371
    :cond_a
    iget-object v2, v1, Le3/a;->a:Landroid/graphics/drawable/Drawable;

    .line 372
    .line 373
    instance-of v2, v2, Landroid/graphics/drawable/BitmapDrawable;

    .line 374
    .line 375
    if-nez v2, :cond_b

    .line 376
    .line 377
    iget-boolean v2, v12, Lj3/j;->k:Z

    .line 378
    .line 379
    if-nez v2, :cond_b

    .line 380
    .line 381
    goto :goto_7

    .line 382
    :cond_b
    iget-object v2, v12, Lj3/j;->u:Ln5/r;

    .line 383
    .line 384
    new-instance v16, Le3/g;

    .line 385
    .line 386
    const/16 v23, 0x0

    .line 387
    .line 388
    move-object/from16 v20, v0

    .line 389
    .line 390
    move-object/from16 v18, v1

    .line 391
    .line 392
    move-object/from16 v22, v12

    .line 393
    .line 394
    invoke-direct/range {v16 .. v23}, Le3/g;-><init>(Le3/h;Le3/a;Lj3/n;Ljava/util/List;Ly2/c;Lj3/j;Lt4/c;)V

    .line 395
    .line 396
    .line 397
    move-object/from16 v0, v16

    .line 398
    .line 399
    invoke-static {v2, v0, v6}, Ln5/x;->x(Lt4/h;Ld5/p;Lt4/c;)Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    move-object v1, v0

    .line 404
    :goto_7
    if-ne v1, v7, :cond_c

    .line 405
    .line 406
    :goto_8
    return-object v7

    .line 407
    :cond_c
    :goto_9
    check-cast v1, Le3/a;

    .line 408
    .line 409
    iget-object v0, v1, Le3/a;->a:Landroid/graphics/drawable/Drawable;

    .line 410
    .line 411
    instance-of v2, v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 412
    .line 413
    if-eqz v2, :cond_d

    .line 414
    .line 415
    move-object v10, v0

    .line 416
    check-cast v10, Landroid/graphics/drawable/BitmapDrawable;

    .line 417
    .line 418
    :cond_d
    if-eqz v10, :cond_e

    .line 419
    .line 420
    invoke-virtual {v10}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    if-eqz v0, :cond_e

    .line 425
    .line 426
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    .line 427
    .line 428
    .line 429
    :cond_e
    return-object v1

    .line 430
    :cond_f
    :try_start_6
    new-instance v0, Landroidx/fragment/app/i0;

    .line 431
    .line 432
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 433
    .line 434
    .line 435
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 436
    :catchall_2
    move-exception v0

    .line 437
    move-object v2, v13

    .line 438
    :goto_a
    iget-object v1, v2, Lkotlin/jvm/internal/o;->h:Ljava/lang/Object;

    .line 439
    .line 440
    instance-of v2, v1, Ld3/m;

    .line 441
    .line 442
    if-eqz v2, :cond_10

    .line 443
    .line 444
    move-object v10, v1

    .line 445
    check-cast v10, Ld3/m;

    .line 446
    .line 447
    :cond_10
    if-eqz v10, :cond_11

    .line 448
    .line 449
    iget-object v1, v10, Ld3/m;->a:La3/o;

    .line 450
    .line 451
    invoke-static {v1}, Lo3/e;->a(Ljava/io/Closeable;)V

    .line 452
    .line 453
    .line 454
    :cond_11
    throw v0
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
.end method


# virtual methods
.method public final c(Ly2/b;Lj3/j;Ljava/lang/Object;Lj3/n;Ly2/c;Lv4/c;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p6

    .line 2
    .line 3
    instance-of v1, v0, Le3/e;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Le3/e;

    .line 9
    .line 10
    iget v2, v1, Le3/e;->q:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Le3/e;->q:I

    .line 20
    .line 21
    move-object/from16 v2, p0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, Le3/e;

    .line 25
    .line 26
    move-object/from16 v2, p0

    .line 27
    .line 28
    invoke-direct {v1, v2, v0}, Le3/e;-><init>(Le3/h;Lv4/c;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v0, v1, Le3/e;->o:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v3, Lu4/a;->h:Lu4/a;

    .line 34
    .line 35
    iget v4, v1, Le3/e;->q:I

    .line 36
    .line 37
    const/4 v6, 0x1

    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    if-ne v4, v6, :cond_1

    .line 41
    .line 42
    iget v4, v1, Le3/e;->n:I

    .line 43
    .line 44
    iget-object v7, v1, Le3/e;->m:Ly2/c;

    .line 45
    .line 46
    iget-object v8, v1, Le3/e;->l:Lj3/n;

    .line 47
    .line 48
    iget-object v9, v1, Le3/e;->k:Ljava/lang/Object;

    .line 49
    .line 50
    iget-object v10, v1, Le3/e;->j:Lj3/j;

    .line 51
    .line 52
    iget-object v11, v1, Le3/e;->i:Ly2/b;

    .line 53
    .line 54
    iget-object v12, v1, Le3/e;->h:Le3/h;

    .line 55
    .line 56
    invoke-static {v0}, Le6/l;->H(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    move-object/from16 v16, v10

    .line 60
    .line 61
    move-object v10, v1

    .line 62
    move-object/from16 v1, v16

    .line 63
    .line 64
    move-object/from16 v16, v9

    .line 65
    .line 66
    move v9, v4

    .line 67
    move-object/from16 v4, v16

    .line 68
    .line 69
    move-object/from16 v16, v8

    .line 70
    .line 71
    move-object v8, v7

    .line 72
    move-object/from16 v7, v16

    .line 73
    .line 74
    goto/16 :goto_4

    .line 75
    .line 76
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 77
    .line 78
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 79
    .line 80
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v0

    .line 84
    :cond_2
    invoke-static {v0}, Le6/l;->H(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    const/4 v0, 0x0

    .line 88
    move-object/from16 v0, p1

    .line 89
    .line 90
    move-object/from16 v4, p3

    .line 91
    .line 92
    move-object/from16 v7, p4

    .line 93
    .line 94
    move-object/from16 v8, p5

    .line 95
    .line 96
    move-object v10, v1

    .line 97
    move-object v12, v2

    .line 98
    const/4 v9, 0x0

    .line 99
    move-object/from16 v1, p2

    .line 100
    .line 101
    :goto_1
    iget-object v11, v12, Le3/h;->a:Ly2/j;

    .line 102
    .line 103
    iget-object v11, v0, Ly2/b;->d:Ljava/util/List;

    .line 104
    .line 105
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 106
    .line 107
    .line 108
    move-result v13

    .line 109
    :goto_2
    if-ge v9, v13, :cond_4

    .line 110
    .line 111
    invoke-interface {v11, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v14

    .line 115
    check-cast v14, Lp4/f;

    .line 116
    .line 117
    iget-object v15, v14, Lp4/f;->h:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v15, Ld3/f;

    .line 120
    .line 121
    iget-object v14, v14, Lp4/f;->i:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v14, Ljava/lang/Class;

    .line 124
    .line 125
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    invoke-virtual {v14, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    if-eqz v5, :cond_3

    .line 134
    .line 135
    const-string v5, "null cannot be cast to non-null type coil.fetch.Fetcher.Factory<kotlin.Any>"

    .line 136
    .line 137
    invoke-static {v15, v5}, Lkotlin/jvm/internal/j;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-interface {v15, v4, v7}, Ld3/f;->a(Ljava/lang/Object;Lj3/n;)Ld3/g;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    if-eqz v5, :cond_3

    .line 145
    .line 146
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 147
    .line 148
    .line 149
    move-result-object v9

    .line 150
    new-instance v11, Lp4/f;

    .line 151
    .line 152
    invoke-direct {v11, v5, v9}, Lp4/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_3
    add-int/lit8 v9, v9, 0x1

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_4
    const/4 v11, 0x0

    .line 160
    :goto_3
    if-eqz v11, :cond_9

    .line 161
    .line 162
    iget-object v5, v11, Lp4/f;->h:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v5, Ld3/g;

    .line 165
    .line 166
    iget-object v9, v11, Lp4/f;->i:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v9, Ljava/lang/Number;

    .line 169
    .line 170
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 171
    .line 172
    .line 173
    move-result v9

    .line 174
    add-int/2addr v9, v6

    .line 175
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    iput-object v12, v10, Le3/e;->h:Le3/h;

    .line 179
    .line 180
    iput-object v0, v10, Le3/e;->i:Ly2/b;

    .line 181
    .line 182
    iput-object v1, v10, Le3/e;->j:Lj3/j;

    .line 183
    .line 184
    iput-object v4, v10, Le3/e;->k:Ljava/lang/Object;

    .line 185
    .line 186
    iput-object v7, v10, Le3/e;->l:Lj3/n;

    .line 187
    .line 188
    iput-object v8, v10, Le3/e;->m:Ly2/c;

    .line 189
    .line 190
    iput v9, v10, Le3/e;->n:I

    .line 191
    .line 192
    iput v6, v10, Le3/e;->q:I

    .line 193
    .line 194
    invoke-interface {v5, v10}, Ld3/g;->a(Lt4/c;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v5

    .line 198
    if-ne v5, v3, :cond_5

    .line 199
    .line 200
    return-object v3

    .line 201
    :cond_5
    move-object v11, v0

    .line 202
    move-object v0, v5

    .line 203
    :goto_4
    move-object v5, v0

    .line 204
    check-cast v5, Ld3/e;

    .line 205
    .line 206
    :try_start_0
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 207
    .line 208
    .line 209
    if-eqz v5, :cond_6

    .line 210
    .line 211
    return-object v5

    .line 212
    :cond_6
    move-object v0, v11

    .line 213
    goto :goto_1

    .line 214
    :catchall_0
    move-exception v0

    .line 215
    instance-of v1, v5, Ld3/m;

    .line 216
    .line 217
    if-eqz v1, :cond_7

    .line 218
    .line 219
    check-cast v5, Ld3/m;

    .line 220
    .line 221
    goto :goto_5

    .line 222
    :cond_7
    const/4 v5, 0x0

    .line 223
    :goto_5
    if-eqz v5, :cond_8

    .line 224
    .line 225
    iget-object v1, v5, Ld3/m;->a:La3/o;

    .line 226
    .line 227
    invoke-static {v1}, Lo3/e;->a(Ljava/io/Closeable;)V

    .line 228
    .line 229
    .line 230
    :cond_8
    throw v0

    .line 231
    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 232
    .line 233
    const-string v1, "Unable to create a fetcher that supports: "

    .line 234
    .line 235
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 246
    .line 247
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    throw v1
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
.end method

.method public final d(Le3/j;Lv4/c;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    iget-object v2, v1, Le3/h;->d:La1/q;

    .line 8
    .line 9
    instance-of v3, v0, Le3/f;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    move-object v3, v0

    .line 14
    check-cast v3, Le3/f;

    .line 15
    .line 16
    iget v4, v3, Le3/f;->l:I

    .line 17
    .line 18
    const/high16 v5, -0x80000000

    .line 19
    .line 20
    and-int v6, v4, v5

    .line 21
    .line 22
    if-eqz v6, :cond_0

    .line 23
    .line 24
    sub-int/2addr v4, v5

    .line 25
    iput v4, v3, Le3/f;->l:I

    .line 26
    .line 27
    :goto_0
    move-object v9, v3

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    new-instance v3, Le3/f;

    .line 30
    .line 31
    invoke-direct {v3, v1, v0}, Le3/f;-><init>(Le3/h;Lv4/c;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :goto_1
    iget-object v0, v9, Le3/f;->j:Ljava/lang/Object;

    .line 36
    .line 37
    sget-object v10, Lu4/a;->h:Lu4/a;

    .line 38
    .line 39
    iget v3, v9, Le3/f;->l:I

    .line 40
    .line 41
    const/4 v11, 0x1

    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    if-ne v3, v11, :cond_1

    .line 45
    .line 46
    iget-object v2, v9, Le3/f;->i:Le3/j;

    .line 47
    .line 48
    iget-object v3, v9, Le3/f;->h:Le3/h;

    .line 49
    .line 50
    :try_start_0
    invoke-static {v0}, Le6/l;->H(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    return-object v0

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    move-object v7, v2

    .line 56
    goto/16 :goto_6

    .line 57
    .line 58
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw v0

    .line 66
    :cond_2
    invoke-static {v0}, Le6/l;->H(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :try_start_1
    iget-object v0, v7, Le3/j;->d:Lj3/j;

    .line 70
    .line 71
    iget-object v3, v0, Lj3/j;->b:Ljava/lang/Object;

    .line 72
    .line 73
    iget-object v4, v7, Le3/j;->e:Lk3/h;

    .line 74
    .line 75
    sget-object v5, Lo3/e;->a:[Landroid/graphics/Bitmap$Config;

    .line 76
    .line 77
    iget-object v5, v7, Le3/j;->f:Ly2/c;

    .line 78
    .line 79
    iget-object v6, v1, Le3/h;->c:La1/w;

    .line 80
    .line 81
    invoke-virtual {v6, v0, v4}, La1/w;->B(Lj3/j;Lk3/h;)Lj3/n;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    iget-object v8, v6, Lj3/n;->e:Lk3/g;

    .line 86
    .line 87
    iget-object v12, v1, Le3/h;->a:Ly2/j;

    .line 88
    .line 89
    iget-object v12, v12, Ly2/j;->g:Ly2/b;

    .line 90
    .line 91
    iget-object v12, v12, Ly2/b;->b:Ljava/util/List;

    .line 92
    .line 93
    invoke-interface {v12}, Ljava/util/Collection;->size()I

    .line 94
    .line 95
    .line 96
    move-result v13
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 97
    const/4 v14, 0x0

    .line 98
    :goto_2
    if-ge v14, v13, :cond_4

    .line 99
    .line 100
    :try_start_2
    invoke-interface {v12, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v15

    .line 104
    check-cast v15, Lp4/f;

    .line 105
    .line 106
    iget-object v11, v15, Lp4/f;->h:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v11, Lg3/a;

    .line 109
    .line 110
    iget-object v15, v15, Lp4/f;->i:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v15, Ljava/lang/Class;

    .line 113
    .line 114
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {v15, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-eqz v1, :cond_3

    .line 123
    .line 124
    const-string v1, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>"

    .line 125
    .line 126
    invoke-static {v11, v1}, Lkotlin/jvm/internal/j;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v11, v3, v6}, Lg3/a;->a(Ljava/lang/Object;Lj3/n;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 133
    if-eqz v1, :cond_3

    .line 134
    .line 135
    move-object v3, v1

    .line 136
    :cond_3
    add-int/lit8 v14, v14, 0x1

    .line 137
    .line 138
    const/4 v11, 0x1

    .line 139
    move-object/from16 v1, p0

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :catchall_1
    move-exception v0

    .line 143
    goto :goto_3

    .line 144
    :cond_4
    move-object v1, v6

    .line 145
    :try_start_3
    invoke-virtual {v2, v0, v3, v1, v5}, La1/q;->C(Lj3/j;Ljava/lang/Object;Lj3/n;Ly2/c;)Lh3/b;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    if-eqz v6, :cond_5

    .line 150
    .line 151
    invoke-virtual {v2, v0, v6, v4, v8}, La1/q;->A(Lj3/j;Lh3/b;Lk3/h;Lk3/g;)Lh3/c;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    goto :goto_5

    .line 156
    :catchall_2
    move-exception v0

    .line 157
    :goto_3
    move-object/from16 v1, p0

    .line 158
    .line 159
    :goto_4
    move-object v3, v1

    .line 160
    goto :goto_6

    .line 161
    :cond_5
    const/4 v2, 0x0

    .line 162
    :goto_5
    if-eqz v2, :cond_6

    .line 163
    .line 164
    invoke-static {v7, v0, v6, v2}, La1/q;->D(Le3/j;Lj3/j;Lh3/b;Lh3/c;)Lj3/q;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    return-object v0

    .line 169
    :cond_6
    iget-object v11, v0, Lj3/j;->s:Ln5/r;

    .line 170
    .line 171
    move-object v2, v0

    .line 172
    new-instance v0, Le3/d;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 173
    .line 174
    const/4 v8, 0x0

    .line 175
    move-object v4, v1

    .line 176
    move-object/from16 v1, p0

    .line 177
    .line 178
    :try_start_4
    invoke-direct/range {v0 .. v8}, Le3/d;-><init>(Le3/h;Lj3/j;Ljava/lang/Object;Lj3/n;Ly2/c;Lh3/b;Le3/j;Lt4/c;)V

    .line 179
    .line 180
    .line 181
    iput-object v1, v9, Le3/f;->h:Le3/h;

    .line 182
    .line 183
    iput-object v7, v9, Le3/f;->i:Le3/j;

    .line 184
    .line 185
    const/4 v2, 0x1

    .line 186
    iput v2, v9, Le3/f;->l:I

    .line 187
    .line 188
    invoke-static {v11, v0, v9}, Ln5/x;->x(Lt4/h;Ld5/p;Lt4/c;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 192
    if-ne v0, v10, :cond_7

    .line 193
    .line 194
    return-object v10

    .line 195
    :cond_7
    return-object v0

    .line 196
    :catchall_3
    move-exception v0

    .line 197
    goto :goto_4

    .line 198
    :goto_6
    instance-of v2, v0, Ljava/util/concurrent/CancellationException;

    .line 199
    .line 200
    if-nez v2, :cond_8

    .line 201
    .line 202
    iget-object v2, v3, Le3/h;->c:La1/w;

    .line 203
    .line 204
    iget-object v2, v7, Le3/j;->d:Lj3/j;

    .line 205
    .line 206
    invoke-static {v2, v0}, La1/w;->r(Lj3/j;Ljava/lang/Throwable;)Lj3/e;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    return-object v0

    .line 211
    :cond_8
    throw v0
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
