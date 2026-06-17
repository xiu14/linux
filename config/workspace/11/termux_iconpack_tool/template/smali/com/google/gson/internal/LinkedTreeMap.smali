.class public final Lcom/google/gson/internal/LinkedTreeMap;
.super Ljava/util/AbstractMap;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/gson/internal/LinkedTreeMap$KeySet;,
        Lcom/google/gson/internal/LinkedTreeMap$EntrySet;,
        Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;,
        Lcom/google/gson/internal/LinkedTreeMap$Node;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/AbstractMap<",
        "TK;TV;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field public static final p:Ljava/util/Comparator;


# instance fields
.field public final h:Ljava/util/Comparator;

.field public final i:Z

.field public j:Lcom/google/gson/internal/LinkedTreeMap$Node;

.field public k:I

.field public l:I

.field public final m:Lcom/google/gson/internal/LinkedTreeMap$Node;

.field public n:Lcom/google/gson/internal/LinkedTreeMap$EntrySet;

.field public o:Lcom/google/gson/internal/LinkedTreeMap$KeySet;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/gson/internal/LinkedTreeMap$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/gson/internal/LinkedTreeMap$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/gson/internal/LinkedTreeMap;->p:Ljava/util/Comparator;

    .line 7
    .line 8
    return-void
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

.method public constructor <init>()V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/gson/internal/LinkedTreeMap;->p:Ljava/util/Comparator;

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/google/gson/internal/LinkedTreeMap;-><init>(Ljava/util/Comparator;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Comparator;Z)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/google/gson/internal/LinkedTreeMap;->k:I

    .line 4
    iput v0, p0, Lcom/google/gson/internal/LinkedTreeMap;->l:I

    if-eqz p1, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    sget-object p1, Lcom/google/gson/internal/LinkedTreeMap;->p:Ljava/util/Comparator;

    :goto_0
    iput-object p1, p0, Lcom/google/gson/internal/LinkedTreeMap;->h:Ljava/util/Comparator;

    .line 6
    iput-boolean p2, p0, Lcom/google/gson/internal/LinkedTreeMap;->i:Z

    .line 7
    new-instance p1, Lcom/google/gson/internal/LinkedTreeMap$Node;

    invoke-direct {p1, p2}, Lcom/google/gson/internal/LinkedTreeMap$Node;-><init>(Z)V

    iput-object p1, p0, Lcom/google/gson/internal/LinkedTreeMap;->m:Lcom/google/gson/internal/LinkedTreeMap$Node;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Z)Lcom/google/gson/internal/LinkedTreeMap$Node;
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap;->j:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lcom/google/gson/internal/LinkedTreeMap;->p:Ljava/util/Comparator;

    .line 5
    .line 6
    iget-object v3, p0, Lcom/google/gson/internal/LinkedTreeMap;->h:Ljava/util/Comparator;

    .line 7
    .line 8
    if-eqz v0, :cond_5

    .line 9
    .line 10
    if-ne v3, v2, :cond_0

    .line 11
    .line 12
    move-object v4, p1

    .line 13
    check-cast v4, Ljava/lang/Comparable;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v4, v1

    .line 17
    :goto_0
    iget-object v5, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->m:Ljava/lang/Object;

    .line 18
    .line 19
    if-eqz v4, :cond_1

    .line 20
    .line 21
    invoke-interface {v4, v5}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    invoke-interface {v3, p1, v5}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    :goto_1
    if-nez v5, :cond_2

    .line 31
    .line 32
    return-object v0

    .line 33
    :cond_2
    if-gez v5, :cond_3

    .line 34
    .line 35
    iget-object v6, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->i:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_3
    iget-object v6, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->j:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 39
    .line 40
    :goto_2
    if-nez v6, :cond_4

    .line 41
    .line 42
    :goto_3
    move-object v8, v0

    .line 43
    goto :goto_4

    .line 44
    :cond_4
    move-object v0, v6

    .line 45
    goto :goto_0

    .line 46
    :cond_5
    const/4 v5, 0x0

    .line 47
    goto :goto_3

    .line 48
    :goto_4
    if-nez p2, :cond_6

    .line 49
    .line 50
    return-object v1

    .line 51
    :cond_6
    const/4 p2, 0x1

    .line 52
    iget-object v10, p0, Lcom/google/gson/internal/LinkedTreeMap;->m:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 53
    .line 54
    if-nez v8, :cond_9

    .line 55
    .line 56
    if-ne v3, v2, :cond_8

    .line 57
    .line 58
    instance-of v0, p1, Ljava/lang/Comparable;

    .line 59
    .line 60
    if-eqz v0, :cond_7

    .line 61
    .line 62
    goto :goto_5

    .line 63
    :cond_7
    new-instance p2, Ljava/lang/ClassCastException;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    const-string v0, " is not Comparable"

    .line 74
    .line 75
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-direct {p2, p1}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p2

    .line 83
    :cond_8
    :goto_5
    new-instance v6, Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 84
    .line 85
    iget-boolean v7, p0, Lcom/google/gson/internal/LinkedTreeMap;->i:Z

    .line 86
    .line 87
    iget-object v11, v10, Lcom/google/gson/internal/LinkedTreeMap$Node;->l:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 88
    .line 89
    move-object v9, p1

    .line 90
    invoke-direct/range {v6 .. v11}, Lcom/google/gson/internal/LinkedTreeMap$Node;-><init>(ZLcom/google/gson/internal/LinkedTreeMap$Node;Ljava/lang/Object;Lcom/google/gson/internal/LinkedTreeMap$Node;Lcom/google/gson/internal/LinkedTreeMap$Node;)V

    .line 91
    .line 92
    .line 93
    iput-object v6, p0, Lcom/google/gson/internal/LinkedTreeMap;->j:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 94
    .line 95
    goto :goto_7

    .line 96
    :cond_9
    move-object v9, p1

    .line 97
    new-instance v6, Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 98
    .line 99
    iget-boolean v7, p0, Lcom/google/gson/internal/LinkedTreeMap;->i:Z

    .line 100
    .line 101
    iget-object v11, v10, Lcom/google/gson/internal/LinkedTreeMap$Node;->l:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 102
    .line 103
    invoke-direct/range {v6 .. v11}, Lcom/google/gson/internal/LinkedTreeMap$Node;-><init>(ZLcom/google/gson/internal/LinkedTreeMap$Node;Ljava/lang/Object;Lcom/google/gson/internal/LinkedTreeMap$Node;Lcom/google/gson/internal/LinkedTreeMap$Node;)V

    .line 104
    .line 105
    .line 106
    if-gez v5, :cond_a

    .line 107
    .line 108
    iput-object v6, v8, Lcom/google/gson/internal/LinkedTreeMap$Node;->i:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 109
    .line 110
    goto :goto_6

    .line 111
    :cond_a
    iput-object v6, v8, Lcom/google/gson/internal/LinkedTreeMap$Node;->j:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 112
    .line 113
    :goto_6
    invoke-virtual {p0, v8, p2}, Lcom/google/gson/internal/LinkedTreeMap;->b(Lcom/google/gson/internal/LinkedTreeMap$Node;Z)V

    .line 114
    .line 115
    .line 116
    :goto_7
    iget p1, p0, Lcom/google/gson/internal/LinkedTreeMap;->k:I

    .line 117
    .line 118
    add-int/2addr p1, p2

    .line 119
    iput p1, p0, Lcom/google/gson/internal/LinkedTreeMap;->k:I

    .line 120
    .line 121
    iget p1, p0, Lcom/google/gson/internal/LinkedTreeMap;->l:I

    .line 122
    .line 123
    add-int/2addr p1, p2

    .line 124
    iput p1, p0, Lcom/google/gson/internal/LinkedTreeMap;->l:I

    .line 125
    .line 126
    return-object v6
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

.method public final b(Lcom/google/gson/internal/LinkedTreeMap$Node;Z)V
    .locals 7

    .line 1
    :goto_0
    if-eqz p1, :cond_e

    .line 2
    .line 3
    iget-object v0, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->i:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 4
    .line 5
    iget-object v1, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->j:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget v3, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->p:I

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    const/4 v3, 0x0

    .line 14
    :goto_1
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget v4, v1, Lcom/google/gson/internal/LinkedTreeMap$Node;->p:I

    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_1
    const/4 v4, 0x0

    .line 20
    :goto_2
    sub-int v5, v3, v4

    .line 21
    .line 22
    const/4 v6, -0x2

    .line 23
    if-ne v5, v6, :cond_6

    .line 24
    .line 25
    iget-object v0, v1, Lcom/google/gson/internal/LinkedTreeMap$Node;->i:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 26
    .line 27
    iget-object v3, v1, Lcom/google/gson/internal/LinkedTreeMap$Node;->j:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 28
    .line 29
    if-eqz v3, :cond_2

    .line 30
    .line 31
    iget v3, v3, Lcom/google/gson/internal/LinkedTreeMap$Node;->p:I

    .line 32
    .line 33
    goto :goto_3

    .line 34
    :cond_2
    const/4 v3, 0x0

    .line 35
    :goto_3
    if-eqz v0, :cond_3

    .line 36
    .line 37
    iget v2, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->p:I

    .line 38
    .line 39
    :cond_3
    sub-int/2addr v2, v3

    .line 40
    const/4 v0, -0x1

    .line 41
    if-eq v2, v0, :cond_5

    .line 42
    .line 43
    if-nez v2, :cond_4

    .line 44
    .line 45
    if-nez p2, :cond_4

    .line 46
    .line 47
    goto :goto_4

    .line 48
    :cond_4
    invoke-virtual {p0, v1}, Lcom/google/gson/internal/LinkedTreeMap;->f(Lcom/google/gson/internal/LinkedTreeMap$Node;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, p1}, Lcom/google/gson/internal/LinkedTreeMap;->e(Lcom/google/gson/internal/LinkedTreeMap$Node;)V

    .line 52
    .line 53
    .line 54
    goto :goto_5

    .line 55
    :cond_5
    :goto_4
    invoke-virtual {p0, p1}, Lcom/google/gson/internal/LinkedTreeMap;->e(Lcom/google/gson/internal/LinkedTreeMap$Node;)V

    .line 56
    .line 57
    .line 58
    :goto_5
    if-eqz p2, :cond_d

    .line 59
    .line 60
    goto :goto_9

    .line 61
    :cond_6
    const/4 v1, 0x2

    .line 62
    const/4 v6, 0x1

    .line 63
    if-ne v5, v1, :cond_b

    .line 64
    .line 65
    iget-object v1, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->i:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 66
    .line 67
    iget-object v3, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->j:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 68
    .line 69
    if-eqz v3, :cond_7

    .line 70
    .line 71
    iget v3, v3, Lcom/google/gson/internal/LinkedTreeMap$Node;->p:I

    .line 72
    .line 73
    goto :goto_6

    .line 74
    :cond_7
    const/4 v3, 0x0

    .line 75
    :goto_6
    if-eqz v1, :cond_8

    .line 76
    .line 77
    iget v2, v1, Lcom/google/gson/internal/LinkedTreeMap$Node;->p:I

    .line 78
    .line 79
    :cond_8
    sub-int/2addr v2, v3

    .line 80
    if-eq v2, v6, :cond_a

    .line 81
    .line 82
    if-nez v2, :cond_9

    .line 83
    .line 84
    if-nez p2, :cond_9

    .line 85
    .line 86
    goto :goto_7

    .line 87
    :cond_9
    invoke-virtual {p0, v0}, Lcom/google/gson/internal/LinkedTreeMap;->e(Lcom/google/gson/internal/LinkedTreeMap$Node;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, p1}, Lcom/google/gson/internal/LinkedTreeMap;->f(Lcom/google/gson/internal/LinkedTreeMap$Node;)V

    .line 91
    .line 92
    .line 93
    goto :goto_8

    .line 94
    :cond_a
    :goto_7
    invoke-virtual {p0, p1}, Lcom/google/gson/internal/LinkedTreeMap;->f(Lcom/google/gson/internal/LinkedTreeMap$Node;)V

    .line 95
    .line 96
    .line 97
    :goto_8
    if-eqz p2, :cond_d

    .line 98
    .line 99
    goto :goto_9

    .line 100
    :cond_b
    if-nez v5, :cond_c

    .line 101
    .line 102
    add-int/lit8 v3, v3, 0x1

    .line 103
    .line 104
    iput v3, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->p:I

    .line 105
    .line 106
    if-eqz p2, :cond_d

    .line 107
    .line 108
    goto :goto_9

    .line 109
    :cond_c
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    add-int/2addr v0, v6

    .line 114
    iput v0, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->p:I

    .line 115
    .line 116
    if-nez p2, :cond_d

    .line 117
    .line 118
    goto :goto_9

    .line 119
    :cond_d
    iget-object p1, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->h:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_e
    :goto_9
    return-void
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

.method public final c(Lcom/google/gson/internal/LinkedTreeMap$Node;Z)V
    .locals 6

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object p2, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->l:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 4
    .line 5
    iget-object v0, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->k:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 6
    .line 7
    iput-object v0, p2, Lcom/google/gson/internal/LinkedTreeMap$Node;->k:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 8
    .line 9
    iget-object v0, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->k:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 10
    .line 11
    iput-object p2, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->l:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 12
    .line 13
    :cond_0
    iget-object p2, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->i:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 14
    .line 15
    iget-object v0, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->j:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 16
    .line 17
    iget-object v1, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->h:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    if-eqz p2, :cond_6

    .line 22
    .line 23
    if-eqz v0, :cond_6

    .line 24
    .line 25
    iget v1, p2, Lcom/google/gson/internal/LinkedTreeMap$Node;->p:I

    .line 26
    .line 27
    iget v4, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->p:I

    .line 28
    .line 29
    if-le v1, v4, :cond_1

    .line 30
    .line 31
    iget-object v0, p2, Lcom/google/gson/internal/LinkedTreeMap$Node;->j:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 32
    .line 33
    :goto_0
    move-object v5, v0

    .line 34
    move-object v0, p2

    .line 35
    move-object p2, v5

    .line 36
    if-eqz p2, :cond_3

    .line 37
    .line 38
    iget-object v0, p2, Lcom/google/gson/internal/LinkedTreeMap$Node;->j:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget-object p2, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->i:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 42
    .line 43
    :goto_1
    move-object v5, v0

    .line 44
    move-object v0, p2

    .line 45
    move-object p2, v5

    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    iget-object p2, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->i:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    move-object v0, p2

    .line 52
    :cond_3
    invoke-virtual {p0, v0, v2}, Lcom/google/gson/internal/LinkedTreeMap;->c(Lcom/google/gson/internal/LinkedTreeMap$Node;Z)V

    .line 53
    .line 54
    .line 55
    iget-object p2, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->i:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 56
    .line 57
    if-eqz p2, :cond_4

    .line 58
    .line 59
    iget v1, p2, Lcom/google/gson/internal/LinkedTreeMap$Node;->p:I

    .line 60
    .line 61
    iput-object p2, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->i:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 62
    .line 63
    iput-object v0, p2, Lcom/google/gson/internal/LinkedTreeMap$Node;->h:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 64
    .line 65
    iput-object v3, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->i:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_4
    const/4 v1, 0x0

    .line 69
    :goto_2
    iget-object p2, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->j:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 70
    .line 71
    if-eqz p2, :cond_5

    .line 72
    .line 73
    iget v2, p2, Lcom/google/gson/internal/LinkedTreeMap$Node;->p:I

    .line 74
    .line 75
    iput-object p2, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->j:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 76
    .line 77
    iput-object v0, p2, Lcom/google/gson/internal/LinkedTreeMap$Node;->h:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 78
    .line 79
    iput-object v3, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->j:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 80
    .line 81
    :cond_5
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    add-int/lit8 p2, p2, 0x1

    .line 86
    .line 87
    iput p2, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->p:I

    .line 88
    .line 89
    invoke-virtual {p0, p1, v0}, Lcom/google/gson/internal/LinkedTreeMap;->d(Lcom/google/gson/internal/LinkedTreeMap$Node;Lcom/google/gson/internal/LinkedTreeMap$Node;)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_6
    if-eqz p2, :cond_7

    .line 94
    .line 95
    invoke-virtual {p0, p1, p2}, Lcom/google/gson/internal/LinkedTreeMap;->d(Lcom/google/gson/internal/LinkedTreeMap$Node;Lcom/google/gson/internal/LinkedTreeMap$Node;)V

    .line 96
    .line 97
    .line 98
    iput-object v3, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->i:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_7
    if-eqz v0, :cond_8

    .line 102
    .line 103
    invoke-virtual {p0, p1, v0}, Lcom/google/gson/internal/LinkedTreeMap;->d(Lcom/google/gson/internal/LinkedTreeMap$Node;Lcom/google/gson/internal/LinkedTreeMap$Node;)V

    .line 104
    .line 105
    .line 106
    iput-object v3, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->j:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_8
    invoke-virtual {p0, p1, v3}, Lcom/google/gson/internal/LinkedTreeMap;->d(Lcom/google/gson/internal/LinkedTreeMap$Node;Lcom/google/gson/internal/LinkedTreeMap$Node;)V

    .line 110
    .line 111
    .line 112
    :goto_3
    invoke-virtual {p0, v1, v2}, Lcom/google/gson/internal/LinkedTreeMap;->b(Lcom/google/gson/internal/LinkedTreeMap$Node;Z)V

    .line 113
    .line 114
    .line 115
    iget p1, p0, Lcom/google/gson/internal/LinkedTreeMap;->k:I

    .line 116
    .line 117
    add-int/lit8 p1, p1, -0x1

    .line 118
    .line 119
    iput p1, p0, Lcom/google/gson/internal/LinkedTreeMap;->k:I

    .line 120
    .line 121
    iget p1, p0, Lcom/google/gson/internal/LinkedTreeMap;->l:I

    .line 122
    .line 123
    add-int/lit8 p1, p1, 0x1

    .line 124
    .line 125
    iput p1, p0, Lcom/google/gson/internal/LinkedTreeMap;->l:I

    .line 126
    .line 127
    return-void
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

.method public final clear()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap;->j:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/google/gson/internal/LinkedTreeMap;->k:I

    .line 6
    .line 7
    iget v0, p0, Lcom/google/gson/internal/LinkedTreeMap;->l:I

    .line 8
    .line 9
    add-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    iput v0, p0, Lcom/google/gson/internal/LinkedTreeMap;->l:I

    .line 12
    .line 13
    iget-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap;->m:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 14
    .line 15
    iput-object v0, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->l:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 16
    .line 17
    iput-object v0, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->k:Lcom/google/gson/internal/LinkedTreeMap$Node;

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

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p0, p1, v0}, Lcom/google/gson/internal/LinkedTreeMap;->a(Ljava/lang/Object;Z)Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 6
    .line 7
    .line 8
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    goto :goto_0

    .line 10
    :catch_0
    nop

    .line 11
    :cond_0
    :goto_0
    if-eqz v1, :cond_1

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_1
    return v0
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

.method public final d(Lcom/google/gson/internal/LinkedTreeMap$Node;Lcom/google/gson/internal/LinkedTreeMap$Node;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->h:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-object v1, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->h:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    iput-object v0, p2, Lcom/google/gson/internal/LinkedTreeMap$Node;->h:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 9
    .line 10
    :cond_0
    if-eqz v0, :cond_2

    .line 11
    .line 12
    iget-object v1, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->i:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 13
    .line 14
    if-ne v1, p1, :cond_1

    .line 15
    .line 16
    iput-object p2, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->i:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    iput-object p2, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->j:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 20
    .line 21
    return-void

    .line 22
    :cond_2
    iput-object p2, p0, Lcom/google/gson/internal/LinkedTreeMap;->j:Lcom/google/gson/internal/LinkedTreeMap$Node;

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
.end method

.method public final e(Lcom/google/gson/internal/LinkedTreeMap$Node;)V
    .locals 5

    .line 1
    iget-object v0, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->i:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 2
    .line 3
    iget-object v1, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->j:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 4
    .line 5
    iget-object v2, v1, Lcom/google/gson/internal/LinkedTreeMap$Node;->i:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 6
    .line 7
    iget-object v3, v1, Lcom/google/gson/internal/LinkedTreeMap$Node;->j:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 8
    .line 9
    iput-object v2, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->j:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    iput-object p1, v2, Lcom/google/gson/internal/LinkedTreeMap$Node;->h:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0, p1, v1}, Lcom/google/gson/internal/LinkedTreeMap;->d(Lcom/google/gson/internal/LinkedTreeMap$Node;Lcom/google/gson/internal/LinkedTreeMap$Node;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, v1, Lcom/google/gson/internal/LinkedTreeMap$Node;->i:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 19
    .line 20
    iput-object v1, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->h:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget v0, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->p:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 v0, 0x0

    .line 29
    :goto_0
    if-eqz v2, :cond_2

    .line 30
    .line 31
    iget v2, v2, Lcom/google/gson/internal/LinkedTreeMap$Node;->p:I

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    const/4 v2, 0x0

    .line 35
    :goto_1
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    add-int/lit8 v0, v0, 0x1

    .line 40
    .line 41
    iput v0, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->p:I

    .line 42
    .line 43
    if-eqz v3, :cond_3

    .line 44
    .line 45
    iget v4, v3, Lcom/google/gson/internal/LinkedTreeMap$Node;->p:I

    .line 46
    .line 47
    :cond_3
    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    add-int/lit8 p1, p1, 0x1

    .line 52
    .line 53
    iput p1, v1, Lcom/google/gson/internal/LinkedTreeMap$Node;->p:I

    .line 54
    .line 55
    return-void
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

.method public final entrySet()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap;->n:Lcom/google/gson/internal/LinkedTreeMap$EntrySet;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/gson/internal/LinkedTreeMap$EntrySet;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lcom/google/gson/internal/LinkedTreeMap$EntrySet;-><init>(Lcom/google/gson/internal/LinkedTreeMap;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap;->n:Lcom/google/gson/internal/LinkedTreeMap$EntrySet;

    .line 11
    .line 12
    :cond_0
    return-object v0
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

.method public final f(Lcom/google/gson/internal/LinkedTreeMap$Node;)V
    .locals 5

    .line 1
    iget-object v0, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->i:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 2
    .line 3
    iget-object v1, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->j:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 4
    .line 5
    iget-object v2, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->i:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 6
    .line 7
    iget-object v3, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->j:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 8
    .line 9
    iput-object v3, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->i:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    iput-object p1, v3, Lcom/google/gson/internal/LinkedTreeMap$Node;->h:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0, p1, v0}, Lcom/google/gson/internal/LinkedTreeMap;->d(Lcom/google/gson/internal/LinkedTreeMap$Node;Lcom/google/gson/internal/LinkedTreeMap$Node;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->j:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 19
    .line 20
    iput-object v0, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->h:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    iget v1, v1, Lcom/google/gson/internal/LinkedTreeMap$Node;->p:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 v1, 0x0

    .line 29
    :goto_0
    if-eqz v3, :cond_2

    .line 30
    .line 31
    iget v3, v3, Lcom/google/gson/internal/LinkedTreeMap$Node;->p:I

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    const/4 v3, 0x0

    .line 35
    :goto_1
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    iput v1, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->p:I

    .line 42
    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    iget v4, v2, Lcom/google/gson/internal/LinkedTreeMap$Node;->p:I

    .line 46
    .line 47
    :cond_3
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    add-int/lit8 p1, p1, 0x1

    .line 52
    .line 53
    iput p1, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->p:I

    .line 54
    .line 55
    return-void
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

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    invoke-virtual {p0, p1, v1}, Lcom/google/gson/internal/LinkedTreeMap;->a(Ljava/lang/Object;Z)Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 6
    .line 7
    .line 8
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    goto :goto_0

    .line 10
    :catch_0
    nop

    .line 11
    :cond_0
    move-object p1, v0

    .line 12
    :goto_0
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget-object p1, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->o:Ljava/lang/Object;

    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_1
    return-object v0
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

.method public final keySet()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap;->o:Lcom/google/gson/internal/LinkedTreeMap$KeySet;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/gson/internal/LinkedTreeMap$KeySet;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lcom/google/gson/internal/LinkedTreeMap$KeySet;-><init>(Lcom/google/gson/internal/LinkedTreeMap;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap;->o:Lcom/google/gson/internal/LinkedTreeMap$KeySet;

    .line 11
    .line 12
    :cond_0
    return-object v0
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

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    if-nez p2, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/google/gson/internal/LinkedTreeMap;->i:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 11
    .line 12
    const-string p2, "value == null"

    .line 13
    .line 14
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p1

    .line 18
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 19
    invoke-virtual {p0, p1, v0}, Lcom/google/gson/internal/LinkedTreeMap;->a(Ljava/lang/Object;Z)Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object v0, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->o:Ljava/lang/Object;

    .line 24
    .line 25
    iput-object p2, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->o:Ljava/lang/Object;

    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 29
    .line 30
    const-string p2, "key == null"

    .line 31
    .line 32
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1
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

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    invoke-virtual {p0, p1, v1}, Lcom/google/gson/internal/LinkedTreeMap;->a(Ljava/lang/Object;Z)Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 6
    .line 7
    .line 8
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    goto :goto_0

    .line 10
    :catch_0
    nop

    .line 11
    :cond_0
    move-object p1, v0

    .line 12
    :goto_0
    if-eqz p1, :cond_1

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-virtual {p0, p1, v1}, Lcom/google/gson/internal/LinkedTreeMap;->c(Lcom/google/gson/internal/LinkedTreeMap$Node;Z)V

    .line 16
    .line 17
    .line 18
    :cond_1
    if-eqz p1, :cond_2

    .line 19
    .line 20
    iget-object p1, p1, Lcom/google/gson/internal/LinkedTreeMap$Node;->o:Ljava/lang/Object;

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_2
    return-object v0
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

.method public final size()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/gson/internal/LinkedTreeMap;->k:I

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
