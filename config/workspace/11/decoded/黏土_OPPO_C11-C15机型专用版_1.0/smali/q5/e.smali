.class public final Lq5/e;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lq5/h;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lq5/h;

.field public final synthetic j:Lkotlin/jvm/internal/o;


# direct methods
.method public constructor <init>(Lq5/f;Lkotlin/jvm/internal/o;Lq5/h;)V
    .locals 0

    const/4 p1, 0x0

    iput p1, p0, Lq5/e;->h:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lq5/e;->j:Lkotlin/jvm/internal/o;

    iput-object p3, p0, Lq5/e;->i:Lq5/h;

    return-void
.end method

.method public constructor <init>(Lq5/h;Lkotlin/jvm/internal/o;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lq5/e;->h:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq5/e;->i:Lq5/h;

    iput-object p2, p0, Lq5/e;->j:Lkotlin/jvm/internal/o;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Lt4/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lq5/e;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    instance-of v0, p2, Lq5/k;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p2

    .line 11
    check-cast v0, Lq5/k;

    .line 12
    .line 13
    iget v1, v0, Lq5/k;->k:I

    .line 14
    .line 15
    const/high16 v2, -0x80000000

    .line 16
    .line 17
    and-int v3, v1, v2

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    sub-int/2addr v1, v2

    .line 22
    iput v1, v0, Lq5/k;->k:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, Lq5/k;

    .line 26
    .line 27
    invoke-direct {v0, p0, p2}, Lq5/k;-><init>(Lq5/e;Lt4/c;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object p2, v0, Lq5/k;->i:Ljava/lang/Object;

    .line 31
    .line 32
    sget-object v1, Lu4/a;->h:Lu4/a;

    .line 33
    .line 34
    iget v2, v0, Lq5/k;->k:I

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    iget-object p1, v0, Lq5/k;->h:Lq5/e;

    .line 42
    .line 43
    :try_start_0
    invoke-static {p2}, Le6/l;->H(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :catchall_0
    move-exception p2

    .line 48
    goto :goto_3

    .line 49
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_2
    invoke-static {p2}, Le6/l;->H(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :try_start_1
    iget-object p2, p0, Lq5/e;->i:Lq5/h;

    .line 61
    .line 62
    iput-object p0, v0, Lq5/k;->h:Lq5/e;

    .line 63
    .line 64
    iput v3, v0, Lq5/k;->k:I

    .line 65
    .line 66
    invoke-interface {p2, p1, v0}, Lq5/h;->c(Ljava/lang/Object;Lt4/c;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 70
    if-ne p1, v1, :cond_3

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    :goto_1
    sget-object v1, Lp4/k;->a:Lp4/k;

    .line 74
    .line 75
    :goto_2
    return-object v1

    .line 76
    :catchall_1
    move-exception p2

    .line 77
    move-object p1, p0

    .line 78
    :goto_3
    iget-object p1, p1, Lq5/e;->j:Lkotlin/jvm/internal/o;

    .line 79
    .line 80
    iput-object p2, p1, Lkotlin/jvm/internal/o;->h:Ljava/lang/Object;

    .line 81
    .line 82
    throw p2

    .line 83
    :pswitch_0
    instance-of v0, p2, Lq5/d;

    .line 84
    .line 85
    if-eqz v0, :cond_4

    .line 86
    .line 87
    move-object v0, p2

    .line 88
    check-cast v0, Lq5/d;

    .line 89
    .line 90
    iget v1, v0, Lq5/d;->j:I

    .line 91
    .line 92
    const/high16 v2, -0x80000000

    .line 93
    .line 94
    and-int v3, v1, v2

    .line 95
    .line 96
    if-eqz v3, :cond_4

    .line 97
    .line 98
    sub-int/2addr v1, v2

    .line 99
    iput v1, v0, Lq5/d;->j:I

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_4
    new-instance v0, Lq5/d;

    .line 103
    .line 104
    invoke-direct {v0, p0, p2}, Lq5/d;-><init>(Lq5/e;Lt4/c;)V

    .line 105
    .line 106
    .line 107
    :goto_4
    iget-object p2, v0, Lq5/d;->h:Ljava/lang/Object;

    .line 108
    .line 109
    sget-object v1, Lu4/a;->h:Lu4/a;

    .line 110
    .line 111
    iget v2, v0, Lq5/d;->j:I

    .line 112
    .line 113
    sget-object v3, Lp4/k;->a:Lp4/k;

    .line 114
    .line 115
    const/4 v4, 0x1

    .line 116
    if-eqz v2, :cond_7

    .line 117
    .line 118
    if-ne v2, v4, :cond_6

    .line 119
    .line 120
    invoke-static {p2}, Le6/l;->H(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    :cond_5
    move-object v1, v3

    .line 124
    goto :goto_5

    .line 125
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 126
    .line 127
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 128
    .line 129
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw p1

    .line 133
    :cond_7
    invoke-static {p2}, Le6/l;->H(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    iget-object p2, p0, Lq5/e;->j:Lkotlin/jvm/internal/o;

    .line 137
    .line 138
    iget-object v2, p2, Lkotlin/jvm/internal/o;->h:Ljava/lang/Object;

    .line 139
    .line 140
    sget-object v5, Lr5/c;->b:La1/u;

    .line 141
    .line 142
    if-eq v2, v5, :cond_8

    .line 143
    .line 144
    invoke-static {v2, p1}, Lkotlin/jvm/internal/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    if-nez v2, :cond_5

    .line 149
    .line 150
    :cond_8
    iput-object p1, p2, Lkotlin/jvm/internal/o;->h:Ljava/lang/Object;

    .line 151
    .line 152
    iput v4, v0, Lq5/d;->j:I

    .line 153
    .line 154
    iget-object p2, p0, Lq5/e;->i:Lq5/h;

    .line 155
    .line 156
    invoke-interface {p2, p1, v0}, Lq5/h;->c(Ljava/lang/Object;Lt4/c;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    if-ne p1, v1, :cond_5

    .line 161
    .line 162
    :goto_5
    return-object v1

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
