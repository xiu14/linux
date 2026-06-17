.class public final Lv2/c;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final l:Ljava/lang/String;

.field public static final m:J


# instance fields
.field public final h:Landroid/content/Context;

.field public final i:Lm2/r;

.field public final j:Lv2/e;

.field public k:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "ForceStopRunnable"

    .line 2
    .line 3
    invoke-static {v0}, Ll2/t;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lv2/c;->l:Ljava/lang/String;

    .line 8
    .line 9
    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 10
    .line 11
    const-wide/16 v1, 0xe42

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    sput-wide v0, Lv2/c;->m:J

    .line 18
    .line 19
    return-void
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

.method public constructor <init>(Landroid/content/Context;Lm2/r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lv2/c;->h:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, Lv2/c;->i:Lm2/r;

    .line 11
    .line 12
    iget-object p1, p2, Lm2/r;->g:Lv2/e;

    .line 13
    .line 14
    iput-object p1, p0, Lv2/c;->j:Lv2/e;

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    iput p1, p0, Lv2/c;->k:I

    .line 18
    .line 19
    return-void
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

.method public static c(Landroid/content/Context;)V
    .locals 5

    .line 1
    const-string v0, "alarm"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/app/AlarmManager;

    .line 8
    .line 9
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v2, 0x1f

    .line 12
    .line 13
    if-lt v1, v2, :cond_0

    .line 14
    .line 15
    const/high16 v1, 0xa000000

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/high16 v1, 0x8000000

    .line 19
    .line 20
    :goto_0
    new-instance v2, Landroid/content/Intent;

    .line 21
    .line 22
    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v3, Landroid/content/ComponentName;

    .line 26
    .line 27
    const-class v4, Landroidx/work/impl/utils/ForceStopRunnable$BroadcastReceiver;

    .line 28
    .line 29
    invoke-direct {v3, p0, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 33
    .line 34
    .line 35
    const-string v3, "ACTION_FORCE_STOP_RESCHEDULE"

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 38
    .line 39
    .line 40
    const/4 v3, -0x1

    .line 41
    invoke-static {p0, v3, v2, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 46
    .line 47
    .line 48
    move-result-wide v1

    .line 49
    sget-wide v3, Lv2/c;->m:J

    .line 50
    .line 51
    add-long/2addr v1, v3

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    invoke-virtual {v0, v3, v1, v2, p0}, Landroid/app/AlarmManager;->setExact(IJLandroid/app/PendingIntent;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    return-void
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
.method public final a()V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v2, "last_force_stop_ms"

    .line 4
    .line 5
    iget-object v3, v1, Lv2/c;->j:Lv2/e;

    .line 6
    .line 7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 v4, 0x17

    .line 10
    .line 11
    iget-object v5, v1, Lv2/c;->h:Landroid/content/Context;

    .line 12
    .line 13
    const-wide/16 v6, -0x1

    .line 14
    .line 15
    iget-object v8, v1, Lv2/c;->i:Lm2/r;

    .line 16
    .line 17
    const/4 v10, 0x0

    .line 18
    if-lt v0, v4, :cond_7

    .line 19
    .line 20
    iget-object v4, v8, Lm2/r;->c:Landroidx/work/impl/WorkDatabase;

    .line 21
    .line 22
    sget-object v0, Lp2/d;->m:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v5}, Lp2/a;->b(Landroid/content/Context;)Landroid/app/job/JobScheduler;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v5, v0}, Lp2/d;->f(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;

    .line 29
    .line 30
    .line 31
    move-result-object v11

    .line 32
    invoke-virtual {v4}, Landroidx/work/impl/WorkDatabase;->d()Lu2/i;

    .line 33
    .line 34
    .line 35
    move-result-object v12

    .line 36
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    const-string v13, "SELECT DISTINCT work_spec_id FROM SystemIdInfo"

    .line 40
    .line 41
    invoke-static {v10, v13}, Landroidx/room/w0;->a(ILjava/lang/String;)Landroidx/room/w0;

    .line 42
    .line 43
    .line 44
    move-result-object v13

    .line 45
    iget-object v12, v12, Lu2/i;->a:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v12, Landroidx/work/impl/WorkDatabase_Impl;

    .line 48
    .line 49
    invoke-virtual {v12}, Landroidx/room/r0;->assertNotSuspendingTransaction()V

    .line 50
    .line 51
    .line 52
    invoke-static {v12, v13, v10}, Lu2/f;->C(Landroidx/room/r0;Lz1/h;Z)Landroid/database/Cursor;

    .line 53
    .line 54
    .line 55
    move-result-object v12

    .line 56
    :try_start_0
    new-instance v14, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-interface {v12}, Landroid/database/Cursor;->getCount()I

    .line 59
    .line 60
    .line 61
    move-result v15

    .line 62
    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 63
    .line 64
    .line 65
    :goto_0
    invoke-interface {v12}, Landroid/database/Cursor;->moveToNext()Z

    .line 66
    .line 67
    .line 68
    move-result v15

    .line 69
    if-eqz v15, :cond_0

    .line 70
    .line 71
    invoke-interface {v12, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v15

    .line 75
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :catchall_0
    move-exception v0

    .line 80
    goto/16 :goto_7

    .line 81
    .line 82
    :cond_0
    invoke-interface {v12}, Landroid/database/Cursor;->close()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v13}, Landroidx/room/w0;->b()V

    .line 86
    .line 87
    .line 88
    if-eqz v11, :cond_1

    .line 89
    .line 90
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 91
    .line 92
    .line 93
    move-result v12

    .line 94
    goto :goto_1

    .line 95
    :cond_1
    const/4 v12, 0x0

    .line 96
    :goto_1
    new-instance v13, Ljava/util/HashSet;

    .line 97
    .line 98
    invoke-direct {v13, v12}, Ljava/util/HashSet;-><init>(I)V

    .line 99
    .line 100
    .line 101
    if-eqz v11, :cond_3

    .line 102
    .line 103
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 104
    .line 105
    .line 106
    move-result v12

    .line 107
    if-nez v12, :cond_3

    .line 108
    .line 109
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 110
    .line 111
    .line 112
    move-result v12

    .line 113
    const/4 v15, 0x0

    .line 114
    :goto_2
    if-ge v15, v12, :cond_3

    .line 115
    .line 116
    invoke-virtual {v11, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v16

    .line 120
    add-int/lit8 v15, v15, 0x1

    .line 121
    .line 122
    check-cast v16, Landroid/app/job/JobInfo;

    .line 123
    .line 124
    invoke-static/range {v16 .. v16}, Lp2/d;->g(Landroid/app/job/JobInfo;)Lu2/j;

    .line 125
    .line 126
    .line 127
    move-result-object v10

    .line 128
    if-eqz v10, :cond_2

    .line 129
    .line 130
    iget-object v10, v10, Lu2/j;->a:Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {v13, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_2
    invoke-virtual/range {v16 .. v16}, Landroid/app/job/JobInfo;->getId()I

    .line 137
    .line 138
    .line 139
    move-result v10

    .line 140
    invoke-static {v0, v10}, Lp2/d;->c(Landroid/app/job/JobScheduler;I)V

    .line 141
    .line 142
    .line 143
    :goto_3
    const/4 v10, 0x0

    .line 144
    goto :goto_2

    .line 145
    :cond_3
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    const/4 v10, 0x0

    .line 150
    :cond_4
    if-ge v10, v0, :cond_5

    .line 151
    .line 152
    invoke-virtual {v14, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v11

    .line 156
    add-int/lit8 v10, v10, 0x1

    .line 157
    .line 158
    check-cast v11, Ljava/lang/String;

    .line 159
    .line 160
    invoke-virtual {v13, v11}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v11

    .line 164
    if-nez v11, :cond_4

    .line 165
    .line 166
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    sget-object v10, Lp2/d;->m:Ljava/lang/String;

    .line 171
    .line 172
    const-string v11, "Reconciling jobs"

    .line 173
    .line 174
    invoke-virtual {v0, v10, v11}, Ll2/t;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    const/4 v0, 0x1

    .line 178
    goto :goto_4

    .line 179
    :cond_5
    const/4 v0, 0x0

    .line 180
    :goto_4
    if-eqz v0, :cond_8

    .line 181
    .line 182
    invoke-virtual {v4}, Landroidx/room/r0;->beginTransaction()V

    .line 183
    .line 184
    .line 185
    :try_start_1
    invoke-virtual {v4}, Landroidx/work/impl/WorkDatabase;->g()Lu2/s;

    .line 186
    .line 187
    .line 188
    move-result-object v10

    .line 189
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 190
    .line 191
    .line 192
    move-result v11

    .line 193
    const/4 v12, 0x0

    .line 194
    :goto_5
    if-ge v12, v11, :cond_6

    .line 195
    .line 196
    invoke-virtual {v14, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v13

    .line 200
    add-int/lit8 v12, v12, 0x1

    .line 201
    .line 202
    check-cast v13, Ljava/lang/String;

    .line 203
    .line 204
    invoke-virtual {v10, v13, v6, v7}, Lu2/s;->j(Ljava/lang/String;J)V

    .line 205
    .line 206
    .line 207
    goto :goto_5

    .line 208
    :catchall_1
    move-exception v0

    .line 209
    goto :goto_6

    .line 210
    :cond_6
    invoke-virtual {v4}, Landroidx/room/r0;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 211
    .line 212
    .line 213
    invoke-virtual {v4}, Landroidx/room/r0;->endTransaction()V

    .line 214
    .line 215
    .line 216
    goto :goto_8

    .line 217
    :goto_6
    invoke-virtual {v4}, Landroidx/room/r0;->endTransaction()V

    .line 218
    .line 219
    .line 220
    throw v0

    .line 221
    :goto_7
    invoke-interface {v12}, Landroid/database/Cursor;->close()V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v13}, Landroidx/room/w0;->b()V

    .line 225
    .line 226
    .line 227
    throw v0

    .line 228
    :cond_7
    const/4 v0, 0x0

    .line 229
    :cond_8
    :goto_8
    iget-object v4, v8, Lm2/r;->c:Landroidx/work/impl/WorkDatabase;

    .line 230
    .line 231
    iget-object v10, v8, Lm2/r;->b:Ll2/a;

    .line 232
    .line 233
    iget-object v11, v8, Lm2/r;->g:Lv2/e;

    .line 234
    .line 235
    invoke-virtual {v4}, Landroidx/work/impl/WorkDatabase;->g()Lu2/s;

    .line 236
    .line 237
    .line 238
    move-result-object v12

    .line 239
    invoke-virtual {v4}, Landroidx/work/impl/WorkDatabase;->f()Lu2/n;

    .line 240
    .line 241
    .line 242
    move-result-object v13

    .line 243
    invoke-virtual {v4}, Landroidx/room/r0;->beginTransaction()V

    .line 244
    .line 245
    .line 246
    :try_start_2
    invoke-virtual {v12}, Lu2/s;->f()Ljava/util/ArrayList;

    .line 247
    .line 248
    .line 249
    move-result-object v14

    .line 250
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 251
    .line 252
    .line 253
    move-result v15

    .line 254
    if-nez v15, :cond_9

    .line 255
    .line 256
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 257
    .line 258
    .line 259
    move-result v6

    .line 260
    const/4 v7, 0x0

    .line 261
    :goto_9
    if-ge v7, v6, :cond_9

    .line 262
    .line 263
    invoke-virtual {v14, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v16

    .line 267
    add-int/lit8 v7, v7, 0x1

    .line 268
    .line 269
    move-object/from16 v9, v16

    .line 270
    .line 271
    check-cast v9, Lu2/p;

    .line 272
    .line 273
    iget-object v9, v9, Lu2/p;->a:Ljava/lang/String;

    .line 274
    .line 275
    move/from16 v16, v0

    .line 276
    .line 277
    const/4 v0, 0x1

    .line 278
    invoke-virtual {v12, v0, v9}, Lu2/s;->n(ILjava/lang/String;)V

    .line 279
    .line 280
    .line 281
    const/16 v0, -0x200

    .line 282
    .line 283
    invoke-virtual {v12, v0, v9}, Lu2/s;->o(ILjava/lang/String;)V

    .line 284
    .line 285
    .line 286
    const-wide/16 v0, -0x1

    .line 287
    .line 288
    invoke-virtual {v12, v9, v0, v1}, Lu2/s;->j(Ljava/lang/String;J)V

    .line 289
    .line 290
    .line 291
    move-object/from16 v1, p0

    .line 292
    .line 293
    move/from16 v0, v16

    .line 294
    .line 295
    goto :goto_9

    .line 296
    :catchall_2
    move-exception v0

    .line 297
    goto/16 :goto_12

    .line 298
    .line 299
    :cond_9
    move/from16 v16, v0

    .line 300
    .line 301
    iget-object v0, v13, Lu2/n;->h:Ljava/lang/Object;

    .line 302
    .line 303
    move-object v1, v0

    .line 304
    check-cast v1, Landroidx/work/impl/WorkDatabase_Impl;

    .line 305
    .line 306
    invoke-virtual {v1}, Landroidx/room/r0;->assertNotSuspendingTransaction()V

    .line 307
    .line 308
    .line 309
    iget-object v0, v13, Lu2/n;->k:Ljava/lang/Object;

    .line 310
    .line 311
    move-object v6, v0

    .line 312
    check-cast v6, Lu2/h;

    .line 313
    .line 314
    invoke-virtual {v6}, Landroidx/room/a1;->a()Lz1/i;

    .line 315
    .line 316
    .line 317
    move-result-object v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 318
    :try_start_3
    invoke-virtual {v1}, Landroidx/room/r0;->beginTransaction()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 319
    .line 320
    .line 321
    :try_start_4
    invoke-interface {v7}, Lz1/i;->y()I

    .line 322
    .line 323
    .line 324
    invoke-virtual {v1}, Landroidx/room/r0;->setTransactionSuccessful()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 325
    .line 326
    .line 327
    :try_start_5
    invoke-virtual {v1}, Landroidx/room/r0;->endTransaction()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 328
    .line 329
    .line 330
    :try_start_6
    invoke-virtual {v6, v7}, Landroidx/room/a1;->c(Lz1/i;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v4}, Landroidx/room/r0;->setTransactionSuccessful()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 334
    .line 335
    .line 336
    invoke-virtual {v4}, Landroidx/room/r0;->endTransaction()V

    .line 337
    .line 338
    .line 339
    if-eqz v15, :cond_b

    .line 340
    .line 341
    if-eqz v16, :cond_a

    .line 342
    .line 343
    goto :goto_a

    .line 344
    :cond_a
    const/4 v9, 0x0

    .line 345
    goto :goto_b

    .line 346
    :cond_b
    :goto_a
    const/4 v9, 0x1

    .line 347
    :goto_b
    iget-object v0, v11, Lv2/e;->a:Landroidx/work/impl/WorkDatabase;

    .line 348
    .line 349
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->c()Lu2/e;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    const-string v1, "reschedule_needed"

    .line 354
    .line 355
    invoke-virtual {v0, v1}, Lu2/e;->c(Ljava/lang/String;)Ljava/lang/Long;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    const-wide/16 v6, 0x0

    .line 360
    .line 361
    sget-object v4, Lv2/c;->l:Ljava/lang/String;

    .line 362
    .line 363
    if-eqz v0, :cond_c

    .line 364
    .line 365
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 366
    .line 367
    .line 368
    move-result-wide v12

    .line 369
    const-wide/16 v14, 0x1

    .line 370
    .line 371
    cmp-long v0, v12, v14

    .line 372
    .line 373
    if-nez v0, :cond_c

    .line 374
    .line 375
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    const-string v2, "Rescheduling Workers."

    .line 380
    .line 381
    invoke-virtual {v0, v4, v2}, Ll2/t;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v8}, Lm2/r;->g()V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    new-instance v0, Lu2/d;

    .line 391
    .line 392
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 393
    .line 394
    .line 395
    move-result-object v2

    .line 396
    invoke-direct {v0, v1, v2}, Lu2/d;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    .line 397
    .line 398
    .line 399
    iget-object v1, v11, Lv2/e;->a:Landroidx/work/impl/WorkDatabase;

    .line 400
    .line 401
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->c()Lu2/e;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    invoke-virtual {v1, v0}, Lu2/e;->d(Lu2/d;)V

    .line 406
    .line 407
    .line 408
    return-void

    .line 409
    :cond_c
    :try_start_7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 410
    .line 411
    const/16 v1, 0x1f

    .line 412
    .line 413
    if-lt v0, v1, :cond_d

    .line 414
    .line 415
    const/high16 v1, 0x22000000

    .line 416
    .line 417
    goto :goto_c

    .line 418
    :cond_d
    const/high16 v1, 0x20000000

    .line 419
    .line 420
    :goto_c
    new-instance v11, Landroid/content/Intent;

    .line 421
    .line 422
    invoke-direct {v11}, Landroid/content/Intent;-><init>()V

    .line 423
    .line 424
    .line 425
    new-instance v12, Landroid/content/ComponentName;

    .line 426
    .line 427
    const-class v13, Landroidx/work/impl/utils/ForceStopRunnable$BroadcastReceiver;

    .line 428
    .line 429
    invoke-direct {v12, v5, v13}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v11, v12}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 433
    .line 434
    .line 435
    const-string v12, "ACTION_FORCE_STOP_RESCHEDULE"

    .line 436
    .line 437
    invoke-virtual {v11, v12}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 438
    .line 439
    .line 440
    const/4 v12, -0x1

    .line 441
    invoke-static {v5, v12, v11, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 442
    .line 443
    .line 444
    move-result-object v1

    .line 445
    const/16 v11, 0x1e

    .line 446
    .line 447
    if-lt v0, v11, :cond_11

    .line 448
    .line 449
    if-eqz v1, :cond_e

    .line 450
    .line 451
    invoke-virtual {v1}, Landroid/app/PendingIntent;->cancel()V

    .line 452
    .line 453
    .line 454
    goto :goto_d

    .line 455
    :catch_0
    move-exception v0

    .line 456
    goto :goto_f

    .line 457
    :catch_1
    move-exception v0

    .line 458
    goto :goto_f

    .line 459
    :cond_e
    :goto_d
    const-string v0, "activity"

    .line 460
    .line 461
    invoke-virtual {v5, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    check-cast v0, Landroid/app/ActivityManager;

    .line 466
    .line 467
    invoke-static {v0}, Lm0/g2;->e(Landroid/app/ActivityManager;)Ljava/util/List;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    if-eqz v0, :cond_12

    .line 472
    .line 473
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 474
    .line 475
    .line 476
    move-result v1

    .line 477
    if-nez v1, :cond_12

    .line 478
    .line 479
    iget-object v1, v3, Lv2/e;->a:Landroidx/work/impl/WorkDatabase;

    .line 480
    .line 481
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->c()Lu2/e;

    .line 482
    .line 483
    .line 484
    move-result-object v1

    .line 485
    invoke-virtual {v1, v2}, Lu2/e;->c(Ljava/lang/String;)Ljava/lang/Long;

    .line 486
    .line 487
    .line 488
    move-result-object v1

    .line 489
    if-eqz v1, :cond_f

    .line 490
    .line 491
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 492
    .line 493
    .line 494
    move-result-wide v6

    .line 495
    :cond_f
    const/4 v1, 0x0

    .line 496
    :goto_e
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 497
    .line 498
    .line 499
    move-result v5

    .line 500
    if-ge v1, v5, :cond_12

    .line 501
    .line 502
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v5

    .line 506
    invoke-static {v5}, Lm0/g2;->c(Ljava/lang/Object;)Landroid/app/ApplicationExitInfo;

    .line 507
    .line 508
    .line 509
    move-result-object v5

    .line 510
    invoke-static {v5}, Lm0/g2;->a(Landroid/app/ApplicationExitInfo;)I

    .line 511
    .line 512
    .line 513
    move-result v11

    .line 514
    const/16 v12, 0xa

    .line 515
    .line 516
    if-ne v11, v12, :cond_10

    .line 517
    .line 518
    invoke-static {v5}, Lm0/g2;->b(Landroid/app/ApplicationExitInfo;)J

    .line 519
    .line 520
    .line 521
    move-result-wide v11

    .line 522
    cmp-long v5, v11, v6

    .line 523
    .line 524
    if-ltz v5, :cond_10

    .line 525
    .line 526
    goto :goto_10

    .line 527
    :cond_10
    add-int/lit8 v1, v1, 0x1

    .line 528
    .line 529
    goto :goto_e

    .line 530
    :cond_11
    if-nez v1, :cond_12

    .line 531
    .line 532
    invoke-static {v5}, Lv2/c;->c(Landroid/content/Context;)V
    :try_end_7
    .catch Ljava/lang/SecurityException; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_7 .. :try_end_7} :catch_0

    .line 533
    .line 534
    .line 535
    goto :goto_10

    .line 536
    :cond_12
    if-eqz v9, :cond_13

    .line 537
    .line 538
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    const-string v1, "Found unfinished work, scheduling it."

    .line 543
    .line 544
    invoke-virtual {v0, v4, v1}, Ll2/t;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 545
    .line 546
    .line 547
    iget-object v0, v8, Lm2/r;->c:Landroidx/work/impl/WorkDatabase;

    .line 548
    .line 549
    iget-object v1, v8, Lm2/r;->e:Ljava/util/List;

    .line 550
    .line 551
    invoke-static {v10, v0, v1}, Lm2/i;->b(Ll2/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 552
    .line 553
    .line 554
    :cond_13
    return-void

    .line 555
    :goto_f
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 556
    .line 557
    .line 558
    move-result-object v1

    .line 559
    iget v1, v1, Ll2/t;->a:I

    .line 560
    .line 561
    const/4 v5, 0x5

    .line 562
    if-gt v1, v5, :cond_14

    .line 563
    .line 564
    const-string v1, "Ignoring exception"

    .line 565
    .line 566
    invoke-static {v4, v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 567
    .line 568
    .line 569
    :cond_14
    :goto_10
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    const-string v1, "Application was force-stopped, rescheduling."

    .line 574
    .line 575
    invoke-virtual {v0, v4, v1}, Ll2/t;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 576
    .line 577
    .line 578
    invoke-virtual {v8}, Lm2/r;->g()V

    .line 579
    .line 580
    .line 581
    iget-object v0, v10, Ll2/a;->d:Ll2/a0;

    .line 582
    .line 583
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 584
    .line 585
    .line 586
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 587
    .line 588
    .line 589
    move-result-wide v0

    .line 590
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 591
    .line 592
    .line 593
    new-instance v4, Lu2/d;

    .line 594
    .line 595
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    invoke-direct {v4, v2, v0}, Lu2/d;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    .line 600
    .line 601
    .line 602
    iget-object v0, v3, Lv2/e;->a:Landroidx/work/impl/WorkDatabase;

    .line 603
    .line 604
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->c()Lu2/e;

    .line 605
    .line 606
    .line 607
    move-result-object v0

    .line 608
    invoke-virtual {v0, v4}, Lu2/e;->d(Lu2/d;)V

    .line 609
    .line 610
    .line 611
    return-void

    .line 612
    :catchall_3
    move-exception v0

    .line 613
    goto :goto_11

    .line 614
    :catchall_4
    move-exception v0

    .line 615
    :try_start_8
    invoke-virtual {v1}, Landroidx/room/r0;->endTransaction()V

    .line 616
    .line 617
    .line 618
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 619
    :goto_11
    :try_start_9
    invoke-virtual {v6, v7}, Landroidx/room/a1;->c(Lz1/i;)V

    .line 620
    .line 621
    .line 622
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 623
    :goto_12
    invoke-virtual {v4}, Landroidx/room/r0;->endTransaction()V

    .line 624
    .line 625
    .line 626
    throw v0
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

.method public final b()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lv2/c;->i:Lm2/r;

    .line 2
    .line 3
    iget-object v0, v0, Lm2/r;->b:Ll2/a;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    sget-object v2, Lv2/c;->l:Ljava/lang/String;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "The default process name was not specified."

    .line 22
    .line 23
    invoke-virtual {v0, v2, v1}, Ll2/t;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    return v0

    .line 28
    :cond_0
    iget-object v1, p0, Lv2/c;->h:Landroid/content/Context;

    .line 29
    .line 30
    invoke-static {v1, v0}, Lv2/j;->a(Landroid/content/Context;Ll2/a;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    new-instance v3, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v4, "Is default app process = "

    .line 41
    .line 42
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v1, v2, v3}, Ll2/t;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return v0
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

.method public final run()V
    .locals 11

    .line 1
    iget-object v0, p0, Lv2/c;->h:Landroid/content/Context;

    .line 2
    .line 3
    sget-object v1, Lv2/c;->l:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lv2/c;->i:Lm2/r;

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p0}, Lv2/c;->b()Z

    .line 8
    .line 9
    .line 10
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    if-nez v3, :cond_0

    .line 12
    .line 13
    invoke-virtual {v2}, Lm2/r;->f()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catch_0
    :cond_0
    :goto_0
    :try_start_1
    invoke-static {v0}, La/a;->M(Landroid/content/Context;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_9
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    .line 19
    .line 20
    :try_start_2
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    const-string v4, "Performing cleanup operations."

    .line 25
    .line 26
    invoke-virtual {v3, v1, v4}, Ll2/t;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 27
    .line 28
    .line 29
    :try_start_3
    invoke-virtual {p0}, Lv2/c;->a()V
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteAccessPermException; {:try_start_3 .. :try_end_3} :catch_8
    .catch Landroid/database/sqlite/SQLiteCantOpenDatabaseException; {:try_start_3 .. :try_end_3} :catch_7
    .catch Landroid/database/sqlite/SQLiteConstraintException; {:try_start_3 .. :try_end_3} :catch_6
    .catch Landroid/database/sqlite/SQLiteDatabaseCorruptException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Landroid/database/sqlite/SQLiteDiskIOException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Landroid/database/sqlite/SQLiteTableLockedException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2}, Lm2/r;->f()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    goto/16 :goto_3

    .line 38
    .line 39
    :catch_1
    move-exception v3

    .line 40
    goto :goto_1

    .line 41
    :catch_2
    move-exception v3

    .line 42
    goto :goto_1

    .line 43
    :catch_3
    move-exception v3

    .line 44
    goto :goto_1

    .line 45
    :catch_4
    move-exception v3

    .line 46
    goto :goto_1

    .line 47
    :catch_5
    move-exception v3

    .line 48
    goto :goto_1

    .line 49
    :catch_6
    move-exception v3

    .line 50
    goto :goto_1

    .line 51
    :catch_7
    move-exception v3

    .line 52
    goto :goto_1

    .line 53
    :catch_8
    move-exception v3

    .line 54
    :goto_1
    :try_start_4
    iget v4, p0, Lv2/c;->k:I

    .line 55
    .line 56
    const/4 v5, 0x1

    .line 57
    add-int/2addr v4, v5

    .line 58
    iput v4, p0, Lv2/c;->k:I

    .line 59
    .line 60
    const/4 v6, 0x3

    .line 61
    if-lt v4, v6, :cond_3

    .line 62
    .line 63
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 64
    .line 65
    const/16 v6, 0x18

    .line 66
    .line 67
    if-lt v4, v6, :cond_1

    .line 68
    .line 69
    invoke-static {v0}, Li0/q;->a(Landroid/content/Context;)Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    :cond_1
    if-eqz v5, :cond_2

    .line 74
    .line 75
    const-string v0, "The file system on the device is in a bad state. WorkManager cannot access the app\'s internal data store."

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_2
    const-string v0, "WorkManager can\'t be accessed from direct boot, because credential encrypted storage isn\'t accessible.\nDon\'t access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot"

    .line 79
    .line 80
    :goto_2
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-virtual {v4, v1, v0, v3}, Ll2/t;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 88
    .line 89
    invoke-direct {v1, v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 90
    .line 91
    .line 92
    iget-object v0, v2, Lm2/r;->b:Ll2/a;

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    throw v1

    .line 98
    :cond_3
    int-to-long v4, v4

    .line 99
    const-wide/16 v6, 0x12c

    .line 100
    .line 101
    mul-long v4, v4, v6

    .line 102
    .line 103
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    new-instance v9, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 110
    .line 111
    .line 112
    const-string v10, "Retrying after "

    .line 113
    .line 114
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v9, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    invoke-virtual {v8, v1, v4, v3}, Ll2/t;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 125
    .line 126
    .line 127
    iget v3, p0, Lv2/c;->k:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 128
    .line 129
    int-to-long v3, v3

    .line 130
    mul-long v3, v3, v6

    .line 131
    .line 132
    :try_start_5
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :catch_9
    move-exception v0

    .line 137
    :try_start_6
    const-string v3, "Unexpected SQLite exception during migrations"

    .line 138
    .line 139
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    invoke-virtual {v4, v1, v3}, Ll2/t;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 147
    .line 148
    invoke-direct {v1, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 149
    .line 150
    .line 151
    iget-object v0, v2, Lm2/r;->b:Ll2/a;

    .line 152
    .line 153
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 157
    :goto_3
    invoke-virtual {v2}, Lm2/r;->f()V

    .line 158
    .line 159
    .line 160
    throw v0
    .line 161
    .line 162
.end method
