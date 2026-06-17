.class public final Lo2/b;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lm2/a;


# static fields
.field public static final m:Ljava/lang/String;


# instance fields
.field public final h:Landroid/content/Context;

.field public final i:Ljava/util/HashMap;

.field public final j:Ljava/lang/Object;

.field public final k:Ll2/a0;

.field public final l:Lu2/u;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "CommandHandler"

    .line 2
    .line 3
    invoke-static {v0}, Ll2/t;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lo2/b;->m:Ljava/lang/String;

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
.end method

.method public constructor <init>(Landroid/content/Context;Ll2/a0;Lu2/u;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo2/b;->h:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lo2/b;->k:Ll2/a0;

    .line 7
    .line 8
    iput-object p3, p0, Lo2/b;->l:Lu2/u;

    .line 9
    .line 10
    new-instance p1, Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lo2/b;->i:Ljava/util/HashMap;

    .line 16
    .line 17
    new-instance p1, Ljava/lang/Object;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lo2/b;->j:Ljava/lang/Object;

    .line 23
    .line 24
    return-void
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

.method public static d(Landroid/content/Intent;)Lu2/j;
    .locals 4

    .line 1
    new-instance v0, Lu2/j;

    .line 2
    .line 3
    const-string v1, "KEY_WORKSPEC_ID"

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "KEY_WORKSPEC_GENERATION"

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-virtual {p0, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    invoke-direct {v0, v1, p0}, Lu2/j;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    return-object v0
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

.method public static e(Landroid/content/Intent;Lu2/j;)V
    .locals 2

    .line 1
    const-string v0, "KEY_WORKSPEC_ID"

    .line 2
    .line 3
    iget-object v1, p1, Lu2/j;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 6
    .line 7
    .line 8
    const-string v0, "KEY_WORKSPEC_GENERATION"

    .line 9
    .line 10
    iget p1, p1, Lu2/j;->b:I

    .line 11
    .line 12
    invoke-virtual {p0, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 13
    .line 14
    .line 15
    return-void
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
.method public final a()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lo2/b;->j:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lo2/b;->i:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    xor-int/lit8 v1, v1, 0x1

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return v1

    .line 14
    :catchall_0
    move-exception v1

    .line 15
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw v1
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

.method public final b(Landroid/content/Intent;ILo2/h;)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "ACTION_CONSTRAINTS_CHANGED"

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x2

    .line 12
    const/4 v3, 0x1

    .line 13
    const/4 v4, 0x0

    .line 14
    if-eqz v1, :cond_6

    .line 15
    .line 16
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget-object v1, Lo2/b;->m:Ljava/lang/String;

    .line 21
    .line 22
    new-instance v5, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v6, "Handling constraints changed "

    .line 25
    .line 26
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {v0, v1, p1}, Ll2/t;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    new-instance p1, Lo2/d;

    .line 40
    .line 41
    iget-object v0, p0, Lo2/b;->h:Landroid/content/Context;

    .line 42
    .line 43
    iget-object v1, p0, Lo2/b;->k:Ll2/a0;

    .line 44
    .line 45
    invoke-direct {p1, v0, v1, p2, p3}, Lo2/d;-><init>(Landroid/content/Context;Ll2/a0;ILo2/h;)V

    .line 46
    .line 47
    .line 48
    iget-object p2, p3, Lo2/h;->l:Lm2/r;

    .line 49
    .line 50
    iget-object p2, p2, Lm2/r;->c:Landroidx/work/impl/WorkDatabase;

    .line 51
    .line 52
    invoke-virtual {p2}, Landroidx/work/impl/WorkDatabase;->g()Lu2/s;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    invoke-virtual {p2}, Lu2/s;->g()Ljava/util/ArrayList;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    sget-object v1, Lo2/c;->a:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    const/4 v5, 0x0

    .line 67
    const/4 v6, 0x0

    .line 68
    const/4 v7, 0x0

    .line 69
    const/4 v8, 0x0

    .line 70
    const/4 v9, 0x0

    .line 71
    :cond_0
    if-ge v9, v1, :cond_2

    .line 72
    .line 73
    invoke-virtual {p2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v10

    .line 77
    add-int/lit8 v9, v9, 0x1

    .line 78
    .line 79
    check-cast v10, Lu2/p;

    .line 80
    .line 81
    iget-object v10, v10, Lu2/p;->j:Ll2/d;

    .line 82
    .line 83
    iget-boolean v11, v10, Ll2/d;->e:Z

    .line 84
    .line 85
    or-int/2addr v5, v11

    .line 86
    iget-boolean v11, v10, Ll2/d;->c:Z

    .line 87
    .line 88
    or-int/2addr v6, v11

    .line 89
    iget-boolean v11, v10, Ll2/d;->f:Z

    .line 90
    .line 91
    or-int/2addr v7, v11

    .line 92
    iget v10, v10, Ll2/d;->a:I

    .line 93
    .line 94
    if-eq v10, v3, :cond_1

    .line 95
    .line 96
    const/4 v10, 0x1

    .line 97
    goto :goto_0

    .line 98
    :cond_1
    const/4 v10, 0x0

    .line 99
    :goto_0
    or-int/2addr v8, v10

    .line 100
    if-eqz v5, :cond_0

    .line 101
    .line 102
    if-eqz v6, :cond_0

    .line 103
    .line 104
    if-eqz v7, :cond_0

    .line 105
    .line 106
    if-eqz v8, :cond_0

    .line 107
    .line 108
    :cond_2
    sget-object v1, Landroidx/work/impl/background/systemalarm/ConstraintProxyUpdateReceiver;->a:Ljava/lang/String;

    .line 109
    .line 110
    new-instance v1, Landroid/content/Intent;

    .line 111
    .line 112
    const-string v3, "androidx.work.impl.background.systemalarm.UpdateProxies"

    .line 113
    .line 114
    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    new-instance v3, Landroid/content/ComponentName;

    .line 118
    .line 119
    const-class v9, Landroidx/work/impl/background/systemalarm/ConstraintProxyUpdateReceiver;

    .line 120
    .line 121
    invoke-direct {v3, v0, v9}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 125
    .line 126
    .line 127
    const-string v3, "KEY_BATTERY_NOT_LOW_PROXY_ENABLED"

    .line 128
    .line 129
    invoke-virtual {v1, v3, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    const-string v5, "KEY_BATTERY_CHARGING_PROXY_ENABLED"

    .line 134
    .line 135
    invoke-virtual {v3, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    const-string v5, "KEY_STORAGE_NOT_LOW_PROXY_ENABLED"

    .line 140
    .line 141
    invoke-virtual {v3, v5, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    const-string v5, "KEY_NETWORK_STATE_PROXY_ENABLED"

    .line 146
    .line 147
    invoke-virtual {v3, v5, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 151
    .line 152
    .line 153
    new-instance v1, Ljava/util/ArrayList;

    .line 154
    .line 155
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 160
    .line 161
    .line 162
    iget-object v3, p1, Lo2/d;->a:Ll2/a0;

    .line 163
    .line 164
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 168
    .line 169
    .line 170
    move-result-wide v5

    .line 171
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    const/4 v7, 0x0

    .line 176
    :cond_3
    :goto_1
    if-ge v7, v3, :cond_5

    .line 177
    .line 178
    invoke-virtual {p2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v8

    .line 182
    add-int/lit8 v7, v7, 0x1

    .line 183
    .line 184
    check-cast v8, Lu2/p;

    .line 185
    .line 186
    invoke-virtual {v8}, Lu2/p;->a()J

    .line 187
    .line 188
    .line 189
    move-result-wide v9

    .line 190
    cmp-long v11, v5, v9

    .line 191
    .line 192
    if-ltz v11, :cond_3

    .line 193
    .line 194
    invoke-virtual {v8}, Lu2/p;->c()Z

    .line 195
    .line 196
    .line 197
    move-result v9

    .line 198
    if-eqz v9, :cond_4

    .line 199
    .line 200
    iget-object v9, p1, Lo2/d;->c:Lp3/j;

    .line 201
    .line 202
    invoke-virtual {v9, v8}, Lp3/j;->d(Lu2/p;)Z

    .line 203
    .line 204
    .line 205
    move-result v9

    .line 206
    if-eqz v9, :cond_3

    .line 207
    .line 208
    :cond_4
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    goto :goto_1

    .line 212
    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 213
    .line 214
    .line 215
    move-result p2

    .line 216
    :goto_2
    if-ge v4, p2, :cond_13

    .line 217
    .line 218
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    add-int/lit8 v4, v4, 0x1

    .line 223
    .line 224
    check-cast v3, Lu2/p;

    .line 225
    .line 226
    iget-object v5, v3, Lu2/p;->a:Ljava/lang/String;

    .line 227
    .line 228
    invoke-static {v3}, La/a;->B(Lu2/p;)Lu2/j;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    new-instance v6, Landroid/content/Intent;

    .line 233
    .line 234
    const-class v7, Landroidx/work/impl/background/systemalarm/SystemAlarmService;

    .line 235
    .line 236
    invoke-direct {v6, v0, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 237
    .line 238
    .line 239
    const-string v7, "ACTION_DELAY_MET"

    .line 240
    .line 241
    invoke-virtual {v6, v7}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 242
    .line 243
    .line 244
    invoke-static {v6, v3}, Lo2/b;->e(Landroid/content/Intent;Lu2/j;)V

    .line 245
    .line 246
    .line 247
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    sget-object v7, Lo2/d;->d:Ljava/lang/String;

    .line 252
    .line 253
    new-instance v8, Ljava/lang/StringBuilder;

    .line 254
    .line 255
    const-string v9, "Creating a delay_met command for workSpec with id ("

    .line 256
    .line 257
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    const-string v5, ")"

    .line 264
    .line 265
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v5

    .line 272
    invoke-virtual {v3, v7, v5}, Ll2/t;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    iget-object v3, p3, Lo2/h;->i:Lw2/a;

    .line 276
    .line 277
    check-cast v3, Lu2/i;

    .line 278
    .line 279
    iget-object v3, v3, Lu2/i;->d:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v3, Ll6/a;

    .line 282
    .line 283
    new-instance v5, Landroidx/appcompat/widget/d1;

    .line 284
    .line 285
    iget v7, p1, Lo2/d;->b:I

    .line 286
    .line 287
    invoke-direct {v5, v7, v2, p3, v6}, Landroidx/appcompat/widget/d1;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v3, v5}, Ll6/a;->execute(Ljava/lang/Runnable;)V

    .line 291
    .line 292
    .line 293
    goto :goto_2

    .line 294
    :cond_6
    const-string v1, "ACTION_RESCHEDULE"

    .line 295
    .line 296
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result v1

    .line 300
    if-eqz v1, :cond_7

    .line 301
    .line 302
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    sget-object v1, Lo2/b;->m:Ljava/lang/String;

    .line 307
    .line 308
    new-instance v2, Ljava/lang/StringBuilder;

    .line 309
    .line 310
    const-string v3, "Handling reschedule "

    .line 311
    .line 312
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    const-string p1, ", "

    .line 319
    .line 320
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object p1

    .line 330
    invoke-virtual {v0, v1, p1}, Ll2/t;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    iget-object p1, p3, Lo2/h;->l:Lm2/r;

    .line 334
    .line 335
    invoke-virtual {p1}, Lm2/r;->g()V

    .line 336
    .line 337
    .line 338
    return-void

    .line 339
    :cond_7
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 340
    .line 341
    .line 342
    move-result-object v1

    .line 343
    const-string v5, "KEY_WORKSPEC_ID"

    .line 344
    .line 345
    filled-new-array {v5}, [Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v5

    .line 349
    if-eqz v1, :cond_16

    .line 350
    .line 351
    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 352
    .line 353
    .line 354
    move-result v6

    .line 355
    if-eqz v6, :cond_8

    .line 356
    .line 357
    goto/16 :goto_b

    .line 358
    .line 359
    :cond_8
    aget-object v5, v5, v4

    .line 360
    .line 361
    invoke-virtual {v1, v5}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v1

    .line 365
    if-nez v1, :cond_9

    .line 366
    .line 367
    goto/16 :goto_b

    .line 368
    .line 369
    :cond_9
    const-string v1, "ACTION_SCHEDULE_WORK"

    .line 370
    .line 371
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    move-result v1

    .line 375
    if-eqz v1, :cond_d

    .line 376
    .line 377
    const-string v0, "at "

    .line 378
    .line 379
    iget-object v1, p0, Lo2/b;->h:Landroid/content/Context;

    .line 380
    .line 381
    const-string v3, "Opportunistically setting an alarm for "

    .line 382
    .line 383
    const-string v4, "Setting up Alarms for "

    .line 384
    .line 385
    const-string v5, "Skipping scheduling "

    .line 386
    .line 387
    invoke-static {p1}, Lo2/b;->d(Landroid/content/Intent;)Lu2/j;

    .line 388
    .line 389
    .line 390
    move-result-object p1

    .line 391
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 392
    .line 393
    .line 394
    move-result-object v6

    .line 395
    sget-object v7, Lo2/b;->m:Ljava/lang/String;

    .line 396
    .line 397
    new-instance v8, Ljava/lang/StringBuilder;

    .line 398
    .line 399
    const-string v9, "Handling schedule work for "

    .line 400
    .line 401
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v8

    .line 411
    invoke-virtual {v6, v7, v8}, Ll2/t;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    iget-object v6, p3, Lo2/h;->l:Lm2/r;

    .line 415
    .line 416
    iget-object v6, v6, Lm2/r;->c:Landroidx/work/impl/WorkDatabase;

    .line 417
    .line 418
    invoke-virtual {v6}, Landroidx/room/r0;->beginTransaction()V

    .line 419
    .line 420
    .line 421
    :try_start_0
    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->g()Lu2/s;

    .line 422
    .line 423
    .line 424
    move-result-object v8

    .line 425
    iget-object v9, p1, Lu2/j;->a:Ljava/lang/String;

    .line 426
    .line 427
    invoke-virtual {v8, v9}, Lu2/s;->i(Ljava/lang/String;)Lu2/p;

    .line 428
    .line 429
    .line 430
    move-result-object v8

    .line 431
    if-nez v8, :cond_a

    .line 432
    .line 433
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 434
    .line 435
    .line 436
    move-result-object p2

    .line 437
    new-instance p3, Ljava/lang/StringBuilder;

    .line 438
    .line 439
    invoke-direct {p3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 443
    .line 444
    .line 445
    const-string p1, " because it\'s no longer in the DB"

    .line 446
    .line 447
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object p1

    .line 454
    invoke-virtual {p2, v7, p1}, Ll2/t;->h(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 455
    .line 456
    .line 457
    invoke-virtual {v6}, Landroidx/room/r0;->endTransaction()V

    .line 458
    .line 459
    .line 460
    return-void

    .line 461
    :catchall_0
    move-exception p1

    .line 462
    goto/16 :goto_4

    .line 463
    .line 464
    :cond_a
    :try_start_1
    iget v9, v8, Lu2/p;->b:I

    .line 465
    .line 466
    invoke-static {v9}, Landroidx/appcompat/app/b;->e(I)Z

    .line 467
    .line 468
    .line 469
    move-result v9

    .line 470
    if-eqz v9, :cond_b

    .line 471
    .line 472
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 473
    .line 474
    .line 475
    move-result-object p2

    .line 476
    new-instance p3, Ljava/lang/StringBuilder;

    .line 477
    .line 478
    invoke-direct {p3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 482
    .line 483
    .line 484
    const-string p1, "because it is finished."

    .line 485
    .line 486
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 487
    .line 488
    .line 489
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object p1

    .line 493
    invoke-virtual {p2, v7, p1}, Ll2/t;->h(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 494
    .line 495
    .line 496
    invoke-virtual {v6}, Landroidx/room/r0;->endTransaction()V

    .line 497
    .line 498
    .line 499
    return-void

    .line 500
    :cond_b
    :try_start_2
    invoke-virtual {v8}, Lu2/p;->a()J

    .line 501
    .line 502
    .line 503
    move-result-wide v9

    .line 504
    invoke-virtual {v8}, Lu2/p;->c()Z

    .line 505
    .line 506
    .line 507
    move-result v5

    .line 508
    if-nez v5, :cond_c

    .line 509
    .line 510
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 511
    .line 512
    .line 513
    move-result-object p2

    .line 514
    new-instance p3, Ljava/lang/StringBuilder;

    .line 515
    .line 516
    invoke-direct {p3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 517
    .line 518
    .line 519
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 520
    .line 521
    .line 522
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 523
    .line 524
    .line 525
    invoke-virtual {p3, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 526
    .line 527
    .line 528
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object p3

    .line 532
    invoke-virtual {p2, v7, p3}, Ll2/t;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 533
    .line 534
    .line 535
    invoke-static {v1, v6, p1, v9, v10}, Lo2/a;->b(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;Lu2/j;J)V

    .line 536
    .line 537
    .line 538
    goto :goto_3

    .line 539
    :cond_c
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 540
    .line 541
    .line 542
    move-result-object v4

    .line 543
    new-instance v5, Ljava/lang/StringBuilder;

    .line 544
    .line 545
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 546
    .line 547
    .line 548
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 549
    .line 550
    .line 551
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 552
    .line 553
    .line 554
    invoke-virtual {v5, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 555
    .line 556
    .line 557
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    invoke-virtual {v4, v7, v0}, Ll2/t;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 562
    .line 563
    .line 564
    invoke-static {v1, v6, p1, v9, v10}, Lo2/a;->b(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;Lu2/j;J)V

    .line 565
    .line 566
    .line 567
    new-instance p1, Landroid/content/Intent;

    .line 568
    .line 569
    const-class v0, Landroidx/work/impl/background/systemalarm/SystemAlarmService;

    .line 570
    .line 571
    invoke-direct {p1, v1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 572
    .line 573
    .line 574
    const-string v0, "ACTION_CONSTRAINTS_CHANGED"

    .line 575
    .line 576
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 577
    .line 578
    .line 579
    iget-object v0, p3, Lo2/h;->i:Lw2/a;

    .line 580
    .line 581
    check-cast v0, Lu2/i;

    .line 582
    .line 583
    iget-object v0, v0, Lu2/i;->d:Ljava/lang/Object;

    .line 584
    .line 585
    check-cast v0, Ll6/a;

    .line 586
    .line 587
    new-instance v1, Landroidx/appcompat/widget/d1;

    .line 588
    .line 589
    invoke-direct {v1, p2, v2, p3, p1}, Landroidx/appcompat/widget/d1;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 590
    .line 591
    .line 592
    invoke-virtual {v0, v1}, Ll6/a;->execute(Ljava/lang/Runnable;)V

    .line 593
    .line 594
    .line 595
    :goto_3
    invoke-virtual {v6}, Landroidx/room/r0;->setTransactionSuccessful()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 596
    .line 597
    .line 598
    invoke-virtual {v6}, Landroidx/room/r0;->endTransaction()V

    .line 599
    .line 600
    .line 601
    return-void

    .line 602
    :goto_4
    invoke-virtual {v6}, Landroidx/room/r0;->endTransaction()V

    .line 603
    .line 604
    .line 605
    throw p1

    .line 606
    :cond_d
    const-string v1, "ACTION_DELAY_MET"

    .line 607
    .line 608
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 609
    .line 610
    .line 611
    move-result v1

    .line 612
    if-eqz v1, :cond_f

    .line 613
    .line 614
    const-string v0, "WorkSpec "

    .line 615
    .line 616
    const-string v1, "Handing delay met for "

    .line 617
    .line 618
    iget-object v5, p0, Lo2/b;->j:Ljava/lang/Object;

    .line 619
    .line 620
    monitor-enter v5

    .line 621
    :try_start_3
    invoke-static {p1}, Lo2/b;->d(Landroid/content/Intent;)Lu2/j;

    .line 622
    .line 623
    .line 624
    move-result-object p1

    .line 625
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 626
    .line 627
    .line 628
    move-result-object v2

    .line 629
    sget-object v3, Lo2/b;->m:Ljava/lang/String;

    .line 630
    .line 631
    new-instance v4, Ljava/lang/StringBuilder;

    .line 632
    .line 633
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 634
    .line 635
    .line 636
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 637
    .line 638
    .line 639
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v1

    .line 643
    invoke-virtual {v2, v3, v1}, Ll2/t;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 644
    .line 645
    .line 646
    iget-object v1, p0, Lo2/b;->i:Ljava/util/HashMap;

    .line 647
    .line 648
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 649
    .line 650
    .line 651
    move-result v1

    .line 652
    if-nez v1, :cond_e

    .line 653
    .line 654
    new-instance v0, Lo2/f;

    .line 655
    .line 656
    iget-object v1, p0, Lo2/b;->h:Landroid/content/Context;

    .line 657
    .line 658
    iget-object v2, p0, Lo2/b;->l:Lu2/u;

    .line 659
    .line 660
    invoke-virtual {v2, p1}, Lu2/u;->x(Lu2/j;)Lm2/j;

    .line 661
    .line 662
    .line 663
    move-result-object v2

    .line 664
    invoke-direct {v0, v1, p2, p3, v2}, Lo2/f;-><init>(Landroid/content/Context;ILo2/h;Lm2/j;)V

    .line 665
    .line 666
    .line 667
    iget-object p2, p0, Lo2/b;->i:Ljava/util/HashMap;

    .line 668
    .line 669
    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    invoke-virtual {v0}, Lo2/f;->e()V

    .line 673
    .line 674
    .line 675
    goto :goto_5

    .line 676
    :catchall_1
    move-exception p1

    .line 677
    goto :goto_6

    .line 678
    :cond_e
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 679
    .line 680
    .line 681
    move-result-object p2

    .line 682
    new-instance p3, Ljava/lang/StringBuilder;

    .line 683
    .line 684
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 685
    .line 686
    .line 687
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 688
    .line 689
    .line 690
    const-string p1, " is is already being handled for ACTION_DELAY_MET"

    .line 691
    .line 692
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 693
    .line 694
    .line 695
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 696
    .line 697
    .line 698
    move-result-object p1

    .line 699
    invoke-virtual {p2, v3, p1}, Ll2/t;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 700
    .line 701
    .line 702
    :goto_5
    monitor-exit v5

    .line 703
    return-void

    .line 704
    :goto_6
    monitor-exit v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 705
    throw p1

    .line 706
    :cond_f
    const-string v1, "ACTION_STOP_WORK"

    .line 707
    .line 708
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 709
    .line 710
    .line 711
    move-result v1

    .line 712
    if-eqz v1, :cond_14

    .line 713
    .line 714
    iget-object p2, p0, Lo2/b;->l:Lu2/u;

    .line 715
    .line 716
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 717
    .line 718
    .line 719
    move-result-object p1

    .line 720
    const-string v0, "KEY_WORKSPEC_ID"

    .line 721
    .line 722
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object v0

    .line 726
    const-string v1, "KEY_WORKSPEC_GENERATION"

    .line 727
    .line 728
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 729
    .line 730
    .line 731
    move-result v5

    .line 732
    if-eqz v5, :cond_10

    .line 733
    .line 734
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 735
    .line 736
    .line 737
    move-result p1

    .line 738
    new-instance v1, Ljava/util/ArrayList;

    .line 739
    .line 740
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 741
    .line 742
    .line 743
    new-instance v5, Lu2/j;

    .line 744
    .line 745
    invoke-direct {v5, v0, p1}, Lu2/j;-><init>(Ljava/lang/String;I)V

    .line 746
    .line 747
    .line 748
    invoke-virtual {p2, v5}, Lu2/u;->w(Lu2/j;)Lm2/j;

    .line 749
    .line 750
    .line 751
    move-result-object p1

    .line 752
    if-eqz p1, :cond_11

    .line 753
    .line 754
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 755
    .line 756
    .line 757
    goto :goto_7

    .line 758
    :cond_10
    invoke-virtual {p2, v0}, Lu2/u;->v(Ljava/lang/String;)Ljava/util/List;

    .line 759
    .line 760
    .line 761
    move-result-object v1

    .line 762
    :cond_11
    :goto_7
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 763
    .line 764
    .line 765
    move-result-object p1

    .line 766
    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 767
    .line 768
    .line 769
    move-result p2

    .line 770
    if-eqz p2, :cond_13

    .line 771
    .line 772
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 773
    .line 774
    .line 775
    move-result-object p2

    .line 776
    check-cast p2, Lm2/j;

    .line 777
    .line 778
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 779
    .line 780
    .line 781
    move-result-object v1

    .line 782
    sget-object v5, Lo2/b;->m:Ljava/lang/String;

    .line 783
    .line 784
    new-instance v6, Ljava/lang/StringBuilder;

    .line 785
    .line 786
    const-string v7, "Handing stopWork work for "

    .line 787
    .line 788
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 789
    .line 790
    .line 791
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 792
    .line 793
    .line 794
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 795
    .line 796
    .line 797
    move-result-object v6

    .line 798
    invoke-virtual {v1, v5, v6}, Ll2/t;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 799
    .line 800
    .line 801
    iget-object v1, p3, Lo2/h;->q:Lu2/c;

    .line 802
    .line 803
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 804
    .line 805
    .line 806
    const-string v5, "workSpecId"

    .line 807
    .line 808
    invoke-static {p2, v5}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 809
    .line 810
    .line 811
    const/16 v5, -0x200

    .line 812
    .line 813
    invoke-virtual {v1, p2, v5}, Lu2/c;->i(Lm2/j;I)V

    .line 814
    .line 815
    .line 816
    iget-object p2, p2, Lm2/j;->a:Lu2/j;

    .line 817
    .line 818
    iget-object v1, p0, Lo2/b;->h:Landroid/content/Context;

    .line 819
    .line 820
    iget-object v5, p3, Lo2/h;->l:Lm2/r;

    .line 821
    .line 822
    iget-object v5, v5, Lm2/r;->c:Landroidx/work/impl/WorkDatabase;

    .line 823
    .line 824
    sget-object v6, Lo2/a;->a:Ljava/lang/String;

    .line 825
    .line 826
    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->d()Lu2/i;

    .line 827
    .line 828
    .line 829
    move-result-object v5

    .line 830
    invoke-virtual {v5, p2}, Lu2/i;->c(Lu2/j;)Lu2/g;

    .line 831
    .line 832
    .line 833
    move-result-object v6

    .line 834
    if-eqz v6, :cond_12

    .line 835
    .line 836
    iget v6, v6, Lu2/g;->c:I

    .line 837
    .line 838
    invoke-static {v1, p2, v6}, Lo2/a;->a(Landroid/content/Context;Lu2/j;I)V

    .line 839
    .line 840
    .line 841
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 842
    .line 843
    .line 844
    move-result-object v1

    .line 845
    sget-object v6, Lo2/a;->a:Ljava/lang/String;

    .line 846
    .line 847
    new-instance v7, Ljava/lang/StringBuilder;

    .line 848
    .line 849
    const-string v8, "Removing SystemIdInfo for workSpecId ("

    .line 850
    .line 851
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 852
    .line 853
    .line 854
    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 855
    .line 856
    .line 857
    const-string v8, ")"

    .line 858
    .line 859
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 860
    .line 861
    .line 862
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 863
    .line 864
    .line 865
    move-result-object v7

    .line 866
    invoke-virtual {v1, v6, v7}, Ll2/t;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 867
    .line 868
    .line 869
    iget-object v1, p2, Lu2/j;->a:Ljava/lang/String;

    .line 870
    .line 871
    iget v6, p2, Lu2/j;->b:I

    .line 872
    .line 873
    iget-object v7, v5, Lu2/i;->a:Ljava/lang/Object;

    .line 874
    .line 875
    check-cast v7, Landroidx/work/impl/WorkDatabase_Impl;

    .line 876
    .line 877
    invoke-virtual {v7}, Landroidx/room/r0;->assertNotSuspendingTransaction()V

    .line 878
    .line 879
    .line 880
    iget-object v5, v5, Lu2/i;->c:Ljava/lang/Object;

    .line 881
    .line 882
    check-cast v5, Lu2/h;

    .line 883
    .line 884
    invoke-virtual {v5}, Landroidx/room/a1;->a()Lz1/i;

    .line 885
    .line 886
    .line 887
    move-result-object v8

    .line 888
    invoke-interface {v8, v3, v1}, Lz1/g;->t(ILjava/lang/String;)V

    .line 889
    .line 890
    .line 891
    int-to-long v9, v6

    .line 892
    invoke-interface {v8, v2, v9, v10}, Lz1/g;->i(IJ)V

    .line 893
    .line 894
    .line 895
    :try_start_4
    invoke-virtual {v7}, Landroidx/room/r0;->beginTransaction()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 896
    .line 897
    .line 898
    :try_start_5
    invoke-interface {v8}, Lz1/i;->y()I

    .line 899
    .line 900
    .line 901
    invoke-virtual {v7}, Landroidx/room/r0;->setTransactionSuccessful()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 902
    .line 903
    .line 904
    :try_start_6
    invoke-virtual {v7}, Landroidx/room/r0;->endTransaction()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 905
    .line 906
    .line 907
    invoke-virtual {v5, v8}, Landroidx/room/a1;->c(Lz1/i;)V

    .line 908
    .line 909
    .line 910
    goto :goto_a

    .line 911
    :catchall_2
    move-exception p1

    .line 912
    goto :goto_9

    .line 913
    :catchall_3
    move-exception p1

    .line 914
    :try_start_7
    invoke-virtual {v7}, Landroidx/room/r0;->endTransaction()V

    .line 915
    .line 916
    .line 917
    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 918
    :goto_9
    invoke-virtual {v5, v8}, Landroidx/room/a1;->c(Lz1/i;)V

    .line 919
    .line 920
    .line 921
    throw p1

    .line 922
    :cond_12
    :goto_a
    invoke-virtual {p3, p2, v4}, Lo2/h;->c(Lu2/j;Z)V

    .line 923
    .line 924
    .line 925
    goto/16 :goto_8

    .line 926
    .line 927
    :cond_13
    return-void

    .line 928
    :cond_14
    const-string p3, "ACTION_EXECUTION_COMPLETED"

    .line 929
    .line 930
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 931
    .line 932
    .line 933
    move-result p3

    .line 934
    if-eqz p3, :cond_15

    .line 935
    .line 936
    invoke-static {p1}, Lo2/b;->d(Landroid/content/Intent;)Lu2/j;

    .line 937
    .line 938
    .line 939
    move-result-object p3

    .line 940
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 941
    .line 942
    .line 943
    move-result-object v0

    .line 944
    const-string v1, "KEY_NEEDS_RESCHEDULE"

    .line 945
    .line 946
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    .line 947
    .line 948
    .line 949
    move-result v0

    .line 950
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 951
    .line 952
    .line 953
    move-result-object v1

    .line 954
    sget-object v2, Lo2/b;->m:Ljava/lang/String;

    .line 955
    .line 956
    new-instance v3, Ljava/lang/StringBuilder;

    .line 957
    .line 958
    const-string v4, "Handling onExecutionCompleted "

    .line 959
    .line 960
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 961
    .line 962
    .line 963
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 964
    .line 965
    .line 966
    const-string p1, ", "

    .line 967
    .line 968
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 969
    .line 970
    .line 971
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 972
    .line 973
    .line 974
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 975
    .line 976
    .line 977
    move-result-object p1

    .line 978
    invoke-virtual {v1, v2, p1}, Ll2/t;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 979
    .line 980
    .line 981
    invoke-virtual {p0, p3, v0}, Lo2/b;->c(Lu2/j;Z)V

    .line 982
    .line 983
    .line 984
    return-void

    .line 985
    :cond_15
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 986
    .line 987
    .line 988
    move-result-object p2

    .line 989
    sget-object p3, Lo2/b;->m:Ljava/lang/String;

    .line 990
    .line 991
    new-instance v0, Ljava/lang/StringBuilder;

    .line 992
    .line 993
    const-string v1, "Ignoring intent "

    .line 994
    .line 995
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 996
    .line 997
    .line 998
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 999
    .line 1000
    .line 1001
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1002
    .line 1003
    .line 1004
    move-result-object p1

    .line 1005
    invoke-virtual {p2, p3, p1}, Ll2/t;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 1006
    .line 1007
    .line 1008
    return-void

    .line 1009
    :cond_16
    :goto_b
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 1010
    .line 1011
    .line 1012
    move-result-object p1

    .line 1013
    sget-object p2, Lo2/b;->m:Ljava/lang/String;

    .line 1014
    .line 1015
    new-instance p3, Ljava/lang/StringBuilder;

    .line 1016
    .line 1017
    const-string v1, "Invalid request for "

    .line 1018
    .line 1019
    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1023
    .line 1024
    .line 1025
    const-string v0, " , requires KEY_WORKSPEC_ID ."

    .line 1026
    .line 1027
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1028
    .line 1029
    .line 1030
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1031
    .line 1032
    .line 1033
    move-result-object p3

    .line 1034
    invoke-virtual {p1, p2, p3}, Ll2/t;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1035
    .line 1036
    .line 1037
    return-void
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

.method public final c(Lu2/j;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lo2/b;->j:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lo2/b;->i:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Lo2/f;

    .line 11
    .line 12
    iget-object v2, p0, Lo2/b;->l:Lu2/u;

    .line 13
    .line 14
    invoke-virtual {v2, p1}, Lu2/u;->w(Lu2/j;)Lm2/j;

    .line 15
    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1, p2}, Lo2/f;->f(Z)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    :goto_0
    monitor-exit v0

    .line 26
    return-void

    .line 27
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    throw p1
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
