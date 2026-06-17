.class public abstract Lx2/h;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# static fields
.field public static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "DiagnosticsWrkr"

    .line 2
    .line 3
    invoke-static {v0}, Ll2/t;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "tagWithPrefix(\"DiagnosticsWrkr\")"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lx2/h;->a:Ljava/lang/String;

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
.end method

.method public static final a(Lu2/l;Lu2/u;Lu2/i;Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 19

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v2, 0x17

    .line 9
    .line 10
    if-lt v1, v2, :cond_0

    .line 11
    .line 12
    const-string v1, "Job Id"

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string v1, "Alarm Id"

    .line 16
    .line 17
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v3, "\n Id \t Class Name\t "

    .line 20
    .line 21
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, "\t State\t Unique Name\t Tags\t"

    .line 28
    .line 29
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual/range {p3 .. p3}, Ljava/util/ArrayList;->size()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const/4 v2, 0x0

    .line 44
    const/4 v3, 0x0

    .line 45
    :goto_1
    if-ge v3, v1, :cond_3

    .line 46
    .line 47
    move-object/from16 v4, p3

    .line 48
    .line 49
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    add-int/lit8 v3, v3, 0x1

    .line 54
    .line 55
    check-cast v5, Lu2/p;

    .line 56
    .line 57
    invoke-static {v5}, La/a;->B(Lu2/p;)Lu2/j;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    iget-object v7, v5, Lu2/p;->a:Ljava/lang/String;

    .line 62
    .line 63
    move-object/from16 v8, p2

    .line 64
    .line 65
    invoke-virtual {v8, v6}, Lu2/i;->c(Lu2/j;)Lu2/g;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    if-eqz v6, :cond_1

    .line 70
    .line 71
    iget v6, v6, Lu2/g;->c:I

    .line 72
    .line 73
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    goto :goto_2

    .line 78
    :cond_1
    const/4 v6, 0x0

    .line 79
    :goto_2
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    const-string v9, "SELECT name FROM workname WHERE work_spec_id=?"

    .line 83
    .line 84
    const/4 v10, 0x1

    .line 85
    invoke-static {v10, v9}, Landroidx/room/w0;->a(ILjava/lang/String;)Landroidx/room/w0;

    .line 86
    .line 87
    .line 88
    move-result-object v9

    .line 89
    invoke-virtual {v9, v10, v7}, Landroidx/room/w0;->t(ILjava/lang/String;)V

    .line 90
    .line 91
    .line 92
    move-object/from16 v10, p0

    .line 93
    .line 94
    iget-object v11, v10, Lu2/l;->a:Landroidx/work/impl/WorkDatabase_Impl;

    .line 95
    .line 96
    invoke-virtual {v11}, Landroidx/room/r0;->assertNotSuspendingTransaction()V

    .line 97
    .line 98
    .line 99
    invoke-static {v11, v9, v2}, Lu2/f;->C(Landroidx/room/r0;Lz1/h;Z)Landroid/database/Cursor;

    .line 100
    .line 101
    .line 102
    move-result-object v11

    .line 103
    :try_start_0
    new-instance v12, Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-interface {v11}, Landroid/database/Cursor;->getCount()I

    .line 106
    .line 107
    .line 108
    move-result v13

    .line 109
    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 110
    .line 111
    .line 112
    :goto_3
    invoke-interface {v11}, Landroid/database/Cursor;->moveToNext()Z

    .line 113
    .line 114
    .line 115
    move-result v13

    .line 116
    if-eqz v13, :cond_2

    .line 117
    .line 118
    invoke-interface {v11, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v13

    .line 122
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
    .line 124
    .line 125
    goto :goto_3

    .line 126
    :catchall_0
    move-exception v0

    .line 127
    goto :goto_5

    .line 128
    :cond_2
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v9}, Landroidx/room/w0;->b()V

    .line 132
    .line 133
    .line 134
    const/16 v16, 0x0

    .line 135
    .line 136
    const/16 v17, 0x3e

    .line 137
    .line 138
    const-string v13, ","

    .line 139
    .line 140
    const/4 v14, 0x0

    .line 141
    const/4 v15, 0x0

    .line 142
    invoke-static/range {v12 .. v17}, Lq4/i;->x0(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ld5/l;I)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v9

    .line 146
    move-object/from16 v12, p1

    .line 147
    .line 148
    invoke-virtual {v12, v7}, Lu2/u;->q(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 149
    .line 150
    .line 151
    move-result-object v13

    .line 152
    const/16 v17, 0x0

    .line 153
    .line 154
    const/16 v18, 0x3e

    .line 155
    .line 156
    const-string v14, ","

    .line 157
    .line 158
    invoke-static/range {v13 .. v18}, Lq4/i;->x0(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ld5/l;I)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v11

    .line 162
    const-string v13, "\n"

    .line 163
    .line 164
    const-string v14, "\t "

    .line 165
    .line 166
    invoke-static {v13, v7, v14}, Landroidx/appcompat/app/b;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    move-result-object v7

    .line 170
    iget-object v13, v5, Lu2/p;->c:Ljava/lang/String;

    .line 171
    .line 172
    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    iget v5, v5, Lu2/p;->b:I

    .line 185
    .line 186
    packed-switch v5, :pswitch_data_0

    .line 187
    .line 188
    .line 189
    const/4 v0, 0x0

    .line 190
    throw v0

    .line 191
    :pswitch_0
    const-string v5, "CANCELLED"

    .line 192
    .line 193
    goto :goto_4

    .line 194
    :pswitch_1
    const-string v5, "BLOCKED"

    .line 195
    .line 196
    goto :goto_4

    .line 197
    :pswitch_2
    const-string v5, "FAILED"

    .line 198
    .line 199
    goto :goto_4

    .line 200
    :pswitch_3
    const-string v5, "SUCCEEDED"

    .line 201
    .line 202
    goto :goto_4

    .line 203
    :pswitch_4
    const-string v5, "RUNNING"

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :pswitch_5
    const-string v5, "ENQUEUED"

    .line 207
    .line 208
    :goto_4
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    const/16 v5, 0x9

    .line 224
    .line 225
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    goto/16 :goto_1

    .line 236
    .line 237
    :goto_5
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v9}, Landroidx/room/w0;->b()V

    .line 241
    .line 242
    .line 243
    throw v0

    .line 244
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    const-string v1, "StringBuilder().apply(builderAction).toString()"

    .line 249
    .line 250
    invoke-static {v0, v1}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    return-object v0

    .line 254
    nop

    .line 255
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
